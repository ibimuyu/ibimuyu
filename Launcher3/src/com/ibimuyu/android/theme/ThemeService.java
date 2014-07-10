package com.ibimuyu.android.theme;

import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;

public abstract class ThemeService extends Service {
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
