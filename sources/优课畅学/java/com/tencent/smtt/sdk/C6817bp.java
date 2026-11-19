package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.IconListener;
import com.tencent.smtt.utils.TbsLog;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.tencent.smtt.sdk.bp */
/* loaded from: classes4.dex */
class C6817bp {

    /* renamed from: a */
    private DexLoader f6881a;

    public C6817bp(DexLoader dexLoader) {
        this.f6881a = dexLoader;
    }

    /* renamed from: a */
    public int m6160a(Context context, String str, Map<String, String> map, String str2, android.webkit.ValueCallback<String> valueCallback) {
        if (TbsDownloader.getOverSea(context)) {
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_START_HW_DECODEC_FAILED;
        }
        if (str2 != null) {
            Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[]{Context.class, String.class, String.class}, context, str, str2);
            return objInvokeStaticMethod == null ? TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION : ((Integer) objInvokeStaticMethod).intValue();
        }
        Object objInvokeStaticMethod2 = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[]{Context.class, String.class, Map.class, android.webkit.ValueCallback.class}, context, str, map, valueCallback);
        if (objInvokeStaticMethod2 == null) {
            objInvokeStaticMethod2 = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[]{Context.class, String.class, Map.class}, context, str, map);
        }
        if (objInvokeStaticMethod2 == null) {
            objInvokeStaticMethod2 = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[]{Context.class, String.class}, context, str);
        }
        return objInvokeStaticMethod2 == null ? TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION : ((Integer) objInvokeStaticMethod2).intValue();
    }

    /* renamed from: b */
    public DexLoader m6173b() {
        return this.f6881a;
    }

    /* renamed from: c */
    public Object m6177c() {
        return this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cacheDisabled", new Class[0], new Object[0]);
    }

    /* renamed from: d */
    public void m6180d(String str) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "releaseIconForPageUrl", new Class[]{String.class}, str);
    }

    /* renamed from: e */
    public void m6183e() {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookie", new Class[0], new Object[0]);
    }

    /* renamed from: f */
    public String m6186f() {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getMiniQBVersion", new Class[0], new Object[0]);
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (String) objInvokeStaticMethod;
    }

    /* renamed from: g */
    public Object m6188g() {
        return this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCachFileBaseDir", new Class[0], new Object[0]);
    }

    /* renamed from: h */
    public boolean m6190h() {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_hasCookies", new Class[0], new Object[0]);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: i */
    public IX5WebChromeClient m6191i() {
        Object objInvokeStaticMethod;
        DexLoader dexLoader = this.f6881a;
        if (dexLoader == null || (objInvokeStaticMethod = dexLoader.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClient", new Class[0], new Object[0])) == null) {
            return null;
        }
        return (IX5WebChromeClient) objInvokeStaticMethod;
    }

    /* renamed from: j */
    public IX5WebViewClient m6192j() {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebViewClient", new Class[0], new Object[0]);
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (IX5WebViewClient) objInvokeStaticMethod;
    }

    /* renamed from: k */
    public IX5WebViewClientExtension m6193k() {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClientExtension", new Class[0], new Object[0]);
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (IX5WebViewClientExtension) objInvokeStaticMethod;
    }

    /* renamed from: l */
    public void m6194l() {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "removeAllIcons", null, new Object[0]);
    }

    /* renamed from: m */
    public void m6195m() {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "closeIconDB", null, new Object[0]);
    }

    /* renamed from: n */
    public void m6196n() {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageDeleteAllData", null, new Object[0]);
    }

    /* renamed from: o */
    public void m6197o() {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "closeFileReader", new Class[0], new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.smtt.export.external.interfaces.IX5WebViewBase m6161a(android.content.Context r9) {
        /*
            r8 = this;
            com.tencent.smtt.export.external.DexLoader r0 = r8.f6881a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            java.lang.String r3 = "com.tencent.tbs.tbsshell.WebCoreProxy"
            java.lang.String r4 = "createSDKWebview"
            java.lang.Object r0 = r0.invokeStaticMethod(r3, r4, r1, r2)
            r1 = 325(0x145, float:4.55E-43)
            r2 = 0
            if (r0 != 0) goto L53
            com.tencent.smtt.export.external.DexLoader r3 = r8.f6881a     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "com.tencent.tbs.tbsshell.TBSShell"
            java.lang.String r5 = "getLoadFailureDetails"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L39
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L39
            java.lang.Object r3 = r3.invokeStaticMethod(r4, r5, r7, r6)     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L3c
            boolean r4 = r3 instanceof java.lang.Throwable     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L3c
            com.tencent.smtt.sdk.TbsCoreLoadStat r4 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()     // Catch: java.lang.Exception -> L39
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Exception -> L39
            r4.m5852a(r9, r1, r5)     // Catch: java.lang.Exception -> L39
            goto L3c
        L39:
            r9 = move-exception
            r3 = r2
            goto L6f
        L3c:
            if (r3 == 0) goto L50
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L50
            com.tencent.smtt.sdk.TbsCoreLoadStat r4 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()     // Catch: java.lang.Exception -> L39
            java.lang.Throwable r5 = new java.lang.Throwable     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L39
            r5.<init>(r3)     // Catch: java.lang.Exception -> L39
            r4.m5852a(r9, r1, r5)     // Catch: java.lang.Exception -> L39
        L50:
            r0 = r2
            r3 = r0
            goto L72
        L53:
            r3 = r0
            com.tencent.smtt.export.external.interfaces.IX5WebViewBase r3 = (com.tencent.smtt.export.external.interfaces.IX5WebViewBase) r3     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L72
            android.view.View r4 = r3.getView()     // Catch: java.lang.Exception -> L6e
            if (r4 != 0) goto L72
            com.tencent.smtt.sdk.TbsCoreLoadStat r4 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()     // Catch: java.lang.Exception -> L6e
            java.lang.Throwable r5 = new java.lang.Throwable     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = "x5webview.getView is null!"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L6e
            r4.m5852a(r9, r1, r5)     // Catch: java.lang.Exception -> L6e
            r0 = r2
            goto L72
        L6e:
            r9 = move-exception
        L6f:
            r9.printStackTrace()
        L72:
            if (r0 != 0) goto L75
            return r2
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6817bp.m6161a(android.content.Context):com.tencent.smtt.export.external.interfaces.IX5WebViewBase");
    }

    /* renamed from: b */
    public void m6174b(String str) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "openIconDB", new Class[]{String.class}, str);
    }

    /* renamed from: c */
    public void m6178c(Context context) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearUsernamePassword", new Class[]{Context.class}, context);
    }

    /* renamed from: d */
    public boolean m6181d() {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptCookie", new Class[0], new Object[0]);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: e */
    public void m6184e(Context context) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearHttpAuthUsernamePassword", new Class[]{Context.class}, context);
    }

    /* renamed from: f */
    public boolean m6187f(Context context) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasFormData", new Class[]{Context.class}, context);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: g */
    public void m6189g(Context context) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearFormData", new Class[]{Context.class}, context);
    }

    /* renamed from: a */
    public InputStream m6162a(String str, boolean z10) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCacheFile", new Class[]{String.class, Boolean.TYPE}, str, Boolean.valueOf(z10));
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (InputStream) objInvokeStaticMethod;
    }

    /* renamed from: b */
    public void m6175b(String str, android.webkit.ValueCallback<Long> valueCallback) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetQuotaForOrigin", new Class[]{String.class, android.webkit.ValueCallback.class}, str, valueCallback);
    }

    /* renamed from: c */
    public void m6179c(String str) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "retainIconForPageUrl", new Class[]{String.class}, str);
    }

    /* renamed from: d */
    public boolean m6182d(Context context) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasHttpAuthUsernamePassword", new Class[]{Context.class}, context);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: e */
    public void m6185e(String str) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageDeleteOrigin", new Class[]{String.class}, str);
    }

    /* renamed from: a */
    public String m6163a(String str) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCookie", new Class[]{String.class}, str);
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (String) objInvokeStaticMethod;
    }

    /* renamed from: b */
    public boolean m6176b(Context context) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseHasUsernamePassword", new Class[]{Context.class}, context);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: a */
    public void m6164a(Context context, boolean z10) {
        TbsLog.m6252w("desktop", " tbsWizard clearAllX5Cache");
        if (z10) {
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "clearAllCache", new Class[]{Context.class}, context);
            return;
        }
        try {
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "clearAllCache", new Class[]{Context.class, Boolean.TYPE}, context, Boolean.valueOf(z10));
        } catch (Exception unused) {
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearUsernamePassword", new Class[]{Context.class}, context);
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearHttpAuthUsernamePassword", new Class[]{Context.class}, context);
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webViewDatabaseClearFormData", new Class[]{Context.class}, context);
            this.f6881a.invokeStaticMethod("com.tencent.smtt.webkit.CacheManager", "removeAllCacheFiles", null, new Object[0]);
            this.f6881a.invokeStaticMethod("com.tencent.smtt.webkit.CacheManager", "clearLocalStorage", null, new Object[0]);
            Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.smtt.net.http.DnsManager", "getInstance", null, new Object[0]);
            if (objInvokeStaticMethod != null) {
                this.f6881a.invokeMethod(objInvokeStaticMethod, "com.tencent.smtt.net.http.DnsManager", "removeAllDns", null, new Object[0]);
            }
            Object objInvokeStaticMethod2 = this.f6881a.invokeStaticMethod("com.tencent.smtt.webkit.SmttPermanentPermissions", "getInstance", null, new Object[0]);
            if (objInvokeStaticMethod2 != null) {
                this.f6881a.invokeMethod(objInvokeStaticMethod2, "com.tencent.smtt.webkit.SmttPermanentPermissions", "clearAllPermanentPermission", null, new Object[0]);
            }
            this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "removeAllIcons", null, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m6165a(android.webkit.ValueCallback<Map> valueCallback) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetOrigins", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
    }

    /* renamed from: a */
    public void m6166a(String str, long j10) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageSetQuotaForOrigin", new Class[]{String.class, Long.TYPE}, str, Long.valueOf(j10));
    }

    /* renamed from: a */
    public void m6167a(String str, android.webkit.ValueCallback<Long> valueCallback) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "webStorageGetUsageForOrigin", new Class[]{String.class, android.webkit.ValueCallback.class}, str, valueCallback);
    }

    /* renamed from: a */
    public void m6168a(String str, IconListener iconListener) {
        this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "requestIconForPageUrl", new Class[]{String.class, IconListener.class}, str, iconListener);
    }

    /* renamed from: a */
    public boolean m6169a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f6881a.getClassLoader().loadClass("com.tencent.tbs.tbsshell.WebCoreProxy").getMethod("canUseX5", null);
        method.setAccessible(true);
        Object objInvoke = method.invoke(null, null);
        boolean z10 = objInvoke instanceof Boolean;
        return ((Boolean) objInvoke).booleanValue();
    }

    /* renamed from: a */
    public boolean m6170a(Context context, String str) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "canOpenFile", new Class[]{Context.class, String.class}, context, str);
        if (objInvokeStaticMethod instanceof Boolean) {
            return ((Boolean) objInvokeStaticMethod).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6171a(Map<String, String[]> map) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookies", new Class[]{Map.class}, map);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    /* renamed from: a */
    public Uri[] m6172a(int i10, Intent intent) {
        Object objInvokeStaticMethod = this.f6881a.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "parseFileChooserResult", new Class[]{Integer.TYPE, Intent.class}, Integer.valueOf(i10), intent);
        if (objInvokeStaticMethod == null) {
            return null;
        }
        return (Uri[]) objInvokeStaticMethod;
    }
}
