package com.ibimuyu.android.theme;

import java.lang.ref.WeakReference;
import java.util.Locale;
import com.ibimuyu.android.util.LongSparseArray;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;


public class ThemeResources extends Resources {
	private Resources mSourceResources = null;
	final TypedValue mTmpValueE = new TypedValue();
	final Configuration mTmpConfigE = new Configuration();
    private final LongSparseArray<WeakReference<Drawable.ConstantState> > mDrawableCacheE
    = new LongSparseArray<WeakReference<Drawable.ConstantState> >();
    boolean mInitEnd = false;
	public ThemeResources(Resources resources) {
		super(resources.getAssets(),resources.getDisplayMetrics(),resources.getConfiguration());
		mSourceResources = resources;
		mInitEnd = true;
	}
	public Drawable loadDrawable(TypedValue value, int id)
            throws NotFoundException {
        if (value.type >= TypedValue.TYPE_FIRST_COLOR_INT &&
                value.type <= TypedValue.TYPE_LAST_COLOR_INT) {
        	//ColorDrawable主题不接管//
        	return ResourcesProxy.loadDrawable(mSourceResources, value, id);
        }
        if (value.string == null) {
        	throw new NotFoundException("Resource is not a Drawable (color or path): " + value);
        }
        String file = value.string.toString();
        if (file.endsWith(".xml")) {
        	//XML主题不接管//
        	return ResourcesProxy.loadDrawable(mSourceResources, value, id);
        }
        
        final long key = (((long) value.assetCookie) << 32) | value.data;
        Drawable dr = getCachedDrawable(mDrawableCacheE, key);
        if (dr != null) {
        	//取到缓存,则直接返回//
            return dr;
        }
        
        dr = loadThemeDrawable(value,id);
        
        if (dr != null) {
            dr.setChangingConfigurations(value.changingConfigurations);
            Drawable.ConstantState cs = dr.getConstantState();
            if (cs != null) {
                synchronized (mTmpValueE) {
                	mDrawableCacheE.put(key, new WeakReference<Drawable.ConstantState>(cs));
                }
            }
        } else {
        	//主题没有接管//
        	return ResourcesProxy.loadDrawable(mSourceResources, value, id);
        }

        return dr;
	}
	
    private Drawable getCachedDrawable(
            LongSparseArray<WeakReference<Drawable.ConstantState>> drawableCache,
            long key) {
        synchronized (mTmpValueE) {
            WeakReference<Drawable.ConstantState> wr = drawableCache.get(key);
            if (wr != null) {
                Drawable.ConstantState entry = wr.get();
                if (entry != null) {
                    return entry.newDrawable(this);
                }
                else {
                    drawableCache.delete(key);
                }
            }
        }
        return null;
    }
    
	/**
	 * 这里不得不做了个假设,即回调不会调用
	 * updateConfiguration(Configuration config,
     *      DisplayMetrics metrics, CompatibilityInfo compat),
     * 而是调用这个方法.
	 */
    @Override
	public void updateConfiguration(Configuration config,
            DisplayMetrics metrics) {
		super.updateConfiguration(config,metrics);
		//此方法会在基类的构造函数中调用,防止麻烦,构造未完成,没有必要跑了//
		if(!mInitEnd) {
			return;
		}
		mSourceResources.updateConfiguration(config, metrics);
        synchronized (mTmpValueE) {
            int configChanges = 0xfffffff;
            if (config != null) {
                mTmpConfigE.setTo(config);
                if (mTmpConfigE.locale == null) {
                    mTmpConfigE.locale = Locale.getDefault();
                }
                configChanges = getConfiguration().updateFrom(mTmpConfigE);
            }
            clearDrawableCache(mDrawableCacheE, configChanges);
        }
	}
    
    private void clearDrawableCache(
            LongSparseArray<WeakReference<Drawable.ConstantState>> cache,
            int configChanges) {
        int N = cache.size();
        for (int i=0; i<N; i++) {
            WeakReference<Drawable.ConstantState> ref = cache.valueAt(i);
            if (ref != null) {
                Drawable.ConstantState cs = ref.get();
                if (cs != null) {
                    if (Configuration.needNewResources(
                            configChanges, cs.getChangingConfigurations())) {
                        cache.setValueAt(i, null);
                    }
                }
            }
        }
    }

    
    private Drawable loadThemeDrawable(TypedValue value, int id) {
    	return null;
    }
}
