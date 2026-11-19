package com.xuexiang.xui;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.xuexiang.xui.utils.AbstractC6878h;
import java.lang.reflect.InvocationTargetException;
import p150k1.AbstractC9051b;

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
        Application applicationM6494e = (Application) AbstractC6878h.m6490a(getContext(), Application.class);
        if (applicationM6494e == null) {
            applicationM6494e = AbstractC6878h.m6494e();
        }
        AbstractC9051b.m15852g(applicationM6494e);
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
