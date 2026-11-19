package com.tencent.smtt.sdk;

import android.content.Context;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class CookieSyncManager {

    /* renamed from: a */
    private static android.webkit.CookieSyncManager f6566a = null;

    /* renamed from: b */
    private static CookieSyncManager f6567b = null;

    /* renamed from: c */
    private static boolean f6568c = false;

    private CookieSyncManager(Context context) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            return;
        }
        c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_createInstance", new Class[]{Context.class}, context);
        f6568c = true;
    }

    public static synchronized CookieSyncManager createInstance(Context context) {
        try {
            f6566a = android.webkit.CookieSyncManager.createInstance(context);
            if (f6567b == null || !f6568c) {
                f6567b = new CookieSyncManager(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6567b;
    }

    public static synchronized CookieSyncManager getInstance() {
        CookieSyncManager cookieSyncManager;
        cookieSyncManager = f6567b;
        if (cookieSyncManager == null) {
            throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
        }
        return cookieSyncManager;
    }

    public void startSync() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b != null && c6816boM6152b.m6157c()) {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_startSync", new Class[0], new Object[0]);
            return;
        }
        f6566a.startSync();
        try {
            Field declaredField = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
            declaredField.setAccessible(true);
            ((Thread) declaredField.get(f6566a)).setUncaughtExceptionHandler(new C6828m());
        } catch (Exception unused) {
        }
    }

    public void stopSync() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            f6566a.stopSync();
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_stopSync", new Class[0], new Object[0]);
        }
    }

    public void sync() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            f6566a.sync();
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_Sync", new Class[0], new Object[0]);
        }
    }
}
