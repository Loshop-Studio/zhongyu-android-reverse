package com.xuexiang.xui;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.xuexiang.xui.utils.AbstractC3532g;
import java.lang.reflect.InvocationTargetException;
import p077j0.AbstractC3799b;

/* loaded from: classes2.dex */
public final class XUIInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Application applicationM4082d = (Application) AbstractC3532g.m4079a(getContext(), Application.class);
        if (applicationM4082d == null) {
            applicationM4082d = AbstractC3532g.m4082d();
        }
        AbstractC3799b.m4961d(applicationM4082d);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
