package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.FileProvider;

/* loaded from: classes2.dex */
public class UtilsFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final boolean onCreate() {
        AbstractC3382c.m2308i((Application) getContext().getApplicationContext());
        return true;
    }
}
