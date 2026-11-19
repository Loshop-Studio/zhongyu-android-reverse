package com.xuexiang.xui;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.xuexiang.xui.utils.AbstractC6802h;
import java.lang.reflect.InvocationTargetException;
import p093e3.AbstractC7843b;

/* loaded from: classes4.dex */
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
        Application applicationM6492d = (Application) AbstractC6802h.m6489a(getContext(), Application.class);
        if (applicationM6492d == null) {
            applicationM6492d = AbstractC6802h.m6492d();
        }
        AbstractC7843b.m12294e(applicationM6492d);
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
