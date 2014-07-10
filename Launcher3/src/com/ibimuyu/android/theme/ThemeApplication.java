package com.ibimuyu.android.theme;

import android.app.Application;
import android.content.res.Resources;

public abstract class ThemeApplication extends Application{
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
