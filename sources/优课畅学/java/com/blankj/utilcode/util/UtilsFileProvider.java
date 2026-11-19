package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.FileProvider;

/* loaded from: classes3.dex */
public class UtilsFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        AbstractC5366h0.m2479b((Application) getContext().getApplicationContext());
        return true;
    }
}
