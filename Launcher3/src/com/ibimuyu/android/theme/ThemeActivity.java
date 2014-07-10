package com.ibimuyu.android.theme;

import android.app.Activity;
import android.content.res.Resources;

public abstract class ThemeActivity extends Activity {
	ThemeResources mThemeResources;
	@Override
	public Resources getResources() {
		if(mThemeResources != null) {
			return mThemeResources;
		}
		Resources resources = super.getResources();
		ThemeResources themeResources = new ThemeResources(resources);
		return themeResources;
	}
	
}
