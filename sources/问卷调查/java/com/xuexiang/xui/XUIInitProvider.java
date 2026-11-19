package com.xuexiang.xui;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import p070b.p113c.p114a.C0787a;

/* loaded from: classes.dex */
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
        Context context = getContext();
        if (!Application.class.isInstance(context)) {
            context = null;
        }
        Application application = (Application) context;
        if (application == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("you should init first");
                }
                application = (Application) objInvoke;
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
                throw new NullPointerException("you should init first");
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                throw new NullPointerException("you should init first");
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
                throw new NullPointerException("you should init first");
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
                throw new NullPointerException("you should init first");
            }
        }
        C0787a.f4446a = application;
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
