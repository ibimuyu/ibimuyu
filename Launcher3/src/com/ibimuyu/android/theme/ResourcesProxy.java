package com.ibimuyu.android.theme;
import java.lang.reflect.Field;
//import android.content.res.CompatibilityInfo;




import java.lang.reflect.Method;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;


public class ResourcesProxy {
	
	public static Drawable loadDrawable(Resources resources,TypedValue value, int id)
            throws NotFoundException {
		try {
			Method method = Resources.class.getDeclaredMethod("loadDrawable", TypedValue.class,int.class);
			method.setAccessible(true);
			return (Drawable)method.invoke(resources, value,id);
		}catch(Exception e) {
		}
		return null;
	}
	
//	public static Object getCompatibilityInfo(Resources resources) {
//		try {
//			Field field = Resources.class.getDeclaredField("mCompatibilityInfo");
//			field.setAccessible(true);
//			Object compatibilityInfo = field.get(resources);
//			return compatibilityInfo;
//		} catch (Exception e) {
//			return null;
//		} 
//	}
//	public static void setCompatibilityInfo(Resources resources, Object compatibilityInfo) {
//		try {
//			Field field = Resources.class.getDeclaredField("mCompatibilityInfo");
//			field.setAccessible(true);
//			field.set(resources, compatibilityInfo);
//		} catch (Exception e) {
//		}
//	}
}
