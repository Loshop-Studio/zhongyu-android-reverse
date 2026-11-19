package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.p058a.C6774d;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.C6865v;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.TbsLogClient;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SuppressLint({"NewApi"})
/* loaded from: classes4.dex */
public class QbSdk {

    /* renamed from: A */
    private static TbsListener f6569A = null;

    /* renamed from: B */
    private static boolean f6570B = false;

    /* renamed from: C */
    private static boolean f6571C = false;
    public static final int EXTENSION_INIT_FAILURE = -99999;
    public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
    public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
    public static final String PARAM_KEY_FEATUREID = "param_key_featureid";
    public static final String PARAM_KEY_FUNCTIONID = "param_key_functionid";
    public static final String PARAM_KEY_POSITIONID = "param_key_positionid";
    public static final int QBMODE = 2;
    public static final String SVNVERSION = "jnizz";
    public static final int TBSMODE = 1;
    public static final String TID_QQNumber_Prefix = "QQ:";
    public static final int VERSION = 1;

    /* renamed from: a */
    static boolean f6572a = false;

    /* renamed from: b */
    static boolean f6573b = false;

    /* renamed from: c */
    static boolean f6574c = true;

    /* renamed from: d */
    static String f6575d = null;

    /* renamed from: e */
    static boolean f6576e = false;

    /* renamed from: f */
    static long f6577f = 0;

    /* renamed from: g */
    static long f6578g = 0;

    /* renamed from: i */
    static boolean f6580i = true;

    /* renamed from: j */
    static volatile boolean f6581j = false;

    /* renamed from: m */
    private static int f6584m = 0;

    /* renamed from: n */
    private static String f6585n = "";

    /* renamed from: o */
    private static Class<?> f6586o = null;

    /* renamed from: p */
    private static Object f6587p = null;

    /* renamed from: q */
    private static boolean f6588q = false;

    /* renamed from: r */
    private static String[] f6589r = null;

    /* renamed from: s */
    private static String f6590s = "NULL";
    public static boolean sIsVersionPrinted = false;

    /* renamed from: t */
    private static String f6591t = "UNKNOWN";

    /* renamed from: u */
    private static int f6592u = 0;

    /* renamed from: v */
    private static int f6593v = 170;

    /* renamed from: w */
    private static String f6594w = null;

    /* renamed from: x */
    private static String f6595x = null;

    /* renamed from: y */
    private static boolean f6596y = true;

    /* renamed from: z */
    private static TbsListener f6597z;

    /* renamed from: h */
    static Object f6579h = new Object();

    /* renamed from: k */
    static TbsListener f6582k = new C6825j();

    /* renamed from: l */
    static Map<String, Object> f6583l = null;

    public interface PreInitCallback {
        void onCoreInitFinished();

        void onViewInitFinished(boolean z10);
    }

    /* renamed from: a */
    public static Bundle m5836a(Context context, Bundle bundle) {
        TbsLogReport tbsLogReportM5877a;
        String str;
        if (m5840a(context)) {
            Object objM6375a = C6865v.m6375a(f6587p, "incrUpdate", (Class<?>[]) new Class[]{Context.class, Bundle.class}, context, bundle);
            if (objM6375a != null) {
                return (Bundle) objM6375a;
            }
            tbsLogReportM5877a = TbsLogReport.m5877a(context);
            str = "incrUpdate return null!";
        } else {
            tbsLogReportM5877a = TbsLogReport.m5877a(context);
            str = "initForPatch return false!";
        }
        tbsLogReportM5877a.m5892a(TbsListener.ErrorCode.INCR_UPDATE_ERROR, str);
        return null;
    }

    public static void allowThirdPartyAppDownload(boolean z10) {
    }

    /* renamed from: b */
    public static String m5845b() {
        Object objInvokeStaticMethod;
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c() || (objInvokeStaticMethod = c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0])) == null || !(objInvokeStaticMethod instanceof String)) {
            return null;
        }
        return (String) objInvokeStaticMethod;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canLoadVideo(android.content.Context r5) {
        /*
            java.lang.Object r0 = com.tencent.smtt.sdk.QbSdk.f6587p
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "canLoadVideo"
            java.lang.Object r0 = com.tencent.smtt.utils.C6865v.m6375a(r0, r4, r1, r3)
            if (r0 == 0) goto L29
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L32
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r3 = 313(0x139, float:4.39E-43)
            goto L2f
        L29:
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r3 = 314(0x13a, float:4.4E-43)
        L2f:
            r1.m5851a(r5, r3)
        L32:
            if (r0 != 0) goto L35
            return r2
        L35:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.canLoadVideo(android.content.Context):boolean");
    }

    public static boolean canLoadX5(Context context) {
        return m5844a(context, false, false);
    }

    public static boolean canLoadX5FirstTimeThirdApp(Context context) {
        try {
            if (f6586o == null) {
                File fileM6121n = C6785ak.m6068a().m6121n(context);
                if (fileM6121n == null) {
                    TbsLog.m6246e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) optDir == null");
                    return false;
                }
                File file = new File(TbsShareManager.m5930c(context), "tbs_sdk_extension_dex.jar");
                if (!file.exists()) {
                    TbsLog.m6247e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) dexFile.exists()=false", true);
                    return false;
                }
                String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : fileM6121n.getAbsolutePath();
                TbsLog.m6248i("QbSdk", "QbSdk init optDirExtension #2 is " + hostCorePathAppDefined);
                f6586o = new DexClassLoader(file.getAbsolutePath(), hostCorePathAppDefined, file.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            }
            if (f6587p == null) {
                Context contextM5933e = TbsShareManager.m5933e(context);
                if (contextM5933e == null && TbsShareManager.getHostCorePathAppDefined() == null) {
                    TbsLogReport.m5877a(context.getApplicationContext()).m5898b(TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, "host context is null!");
                    return false;
                }
                f6587p = contextM5933e == null ? f6586o.getConstructor(Context.class, Context.class, String.class).newInstance(context, contextM5933e, TbsShareManager.getHostCorePathAppDefined()) : f6586o.getConstructor(Context.class, Context.class).newInstance(context, contextM5933e);
            }
            Object objM6375a = C6865v.m6375a(f6587p, "canLoadX5CoreForThirdApp", (Class<?>[]) new Class[0], new Object[0]);
            if (objM6375a == null || !(objM6375a instanceof Boolean)) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        } catch (Throwable th) {
            TbsLog.m6246e("QbSdk", "canLoadX5FirstTimeThirdApp sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    public static void canOpenFile(Context context, String str, ValueCallback<Boolean> valueCallback) {
        new C6819d(context, str, valueCallback).start();
    }

    public static boolean canOpenMimeFileType(Context context, String str) {
        m5843a(context, false);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    public static boolean canOpenWebPlus(Context context) throws IOException {
        BufferedInputStream bufferedInputStream;
        ?? fileInputStream;
        if (f6592u == 0) {
            f6592u = C6770a.m5978a();
        }
        TbsLog.m6248i("QbSdk", "canOpenWebPlus - totalRAM: " + f6592u);
        boolean z10 = false;
        if (f6592u < f6593v || context == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(C6785ak.m6068a().m6121n(context), "tbs.conf")));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            String property = properties.getProperty("android_sdk_max_supported");
            String property2 = properties.getProperty("android_sdk_min_supported");
            int i10 = Integer.parseInt(property);
            int i11 = Integer.parseInt(property2);
            int i12 = Integer.parseInt(Build.VERSION.SDK);
            if (i12 <= i10 && i12 >= i11) {
                int i13 = Integer.parseInt(properties.getProperty("tbs_core_version"));
                try {
                    bufferedInputStream.close();
                } catch (Exception unused) {
                }
                try {
                    fileInputStream = new FileInputStream(new File(C6785ak.m6087p(context), "tbs_extension.conf"));
                } catch (Throwable unused2) {
                }
                try {
                    ?? properties2 = new Properties();
                    properties2.load(fileInputStream);
                    int i14 = Integer.parseInt(properties2.getProperty("tbs_local_version"));
                    int i15 = Integer.parseInt(properties2.getProperty(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE_FOR_SWITCH));
                    if (i13 != 88888888 && i14 != 88888888 && i13 <= i14 && i13 == i14 && ((i15 <= 0 || i15 == C6845b.m6275b(context)) && Boolean.parseBoolean(properties2.getProperty("x5_disabled")))) {
                        if (!TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_SWITCH_BACKUPCORE_ENABLE, false)) {
                            z10 = true;
                        }
                    }
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedInputStream2 = fileInputStream;
                    try {
                        TbsLog.m6248i("QbSdk", "canOpenWebPlus - isX5Disabled Exception");
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (Exception unused5) {
                            }
                        }
                        z10 = true;
                        return !z10;
                    } catch (Throwable th2) {
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (Exception unused6) {
                            }
                        }
                        throw th2;
                    }
                }
                return !z10;
            }
            TbsLog.m6248i("QbSdk", "canOpenWebPlus - sdkVersion: " + i12);
            try {
                bufferedInputStream.close();
            } catch (Exception unused7) {
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                th.printStackTrace();
                TbsLog.m6248i("QbSdk", "canOpenWebPlus - canLoadX5 Exception");
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused8) {
                    }
                }
                return false;
            } catch (Throwable th4) {
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused9) {
                    }
                }
                throw th4;
            }
        }
    }

    public static boolean canUseVideoFeatrue(Context context, int i10) {
        Object objM6375a = C6865v.m6375a(f6587p, "canUseVideoFeatrue", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i10));
        if (objM6375a == null || !(objM6375a instanceof Boolean)) {
            return false;
        }
        return ((Boolean) objM6375a).booleanValue();
    }

    public static void clear(Context context) {
    }

    public static void clearAllWebViewCache(Context context, boolean z10) {
        C6816bo c6816boM6152b;
        try {
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            if (z10) {
                android.webkit.CookieSyncManager.createInstance(context);
                android.webkit.CookieManager.getInstance().removeAllCookie();
            }
            android.webkit.WebViewDatabase.getInstance(context).clearUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearFormData();
            android.webkit.WebStorage.getInstance().deleteAllData();
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } catch (Throwable th) {
            TbsLog.m6246e("QbSdk", "clearAllWebViewCache exception 1 -- " + Log.getStackTraceString(th));
        }
        try {
            if (new WebView(context).getWebViewClientExtension() == null || (c6816boM6152b = C6816bo.m6152b()) == null || !c6816boM6152b.m6157c()) {
                return;
            }
            c6816boM6152b.m6158d().m6164a(context, z10);
        } catch (Throwable unused) {
        }
    }

    public static void closeFileReader(Context context) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(context, null);
        if (c6816boM6152b.m6157c()) {
            c6816boM6152b.m6158d().m6197o();
        }
    }

    public static boolean createMiniQBShortCut(Context context, String str, String str2, Drawable drawable) {
        C6816bo c6816boM6152b;
        if (context != null && !TbsDownloader.getOverSea(context) && !isMiniQBShortCutExist(context, str, str2) && (c6816boM6152b = C6816bo.m6152b()) != null && c6816boM6152b.m6157c()) {
            Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            DexLoader dexLoaderM6173b = c6816boM6152b.m6158d().m6173b();
            TbsLog.m6246e("QbSdk", "qbsdk createMiniQBShortCut");
            Object objInvokeStaticMethod = dexLoaderM6173b.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[]{Context.class, String.class, String.class, Bitmap.class}, context, str, str2, bitmap);
            TbsLog.m6246e("QbSdk", "qbsdk after createMiniQBShortCut ret: " + objInvokeStaticMethod);
            if (objInvokeStaticMethod != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean deleteMiniQBShortCut(Context context, String str, String str2) {
        C6816bo c6816boM6152b;
        return (context == null || TbsDownloader.getOverSea(context) || (c6816boM6152b = C6816bo.m6152b()) == null || !c6816boM6152b.m6157c() || c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[]{Context.class, String.class, String.class}, context, str, str2) == null) ? false : true;
    }

    public static void disAllowThirdAppDownload() {
        f6574c = false;
    }

    public static void fileInfoDetect(Context context, String str, android.webkit.ValueCallback<String> valueCallback) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            return;
        }
        try {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[]{Context.class, String.class, android.webkit.ValueCallback.class}, context, str, valueCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void forceSysWebView() {
        f6573b = true;
        f6590s = "SysWebViewForcedByOuter: " + Log.getStackTraceString(new Throwable());
        TbsLog.m6246e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
    }

    public static long getApkFileSize(Context context) {
        if (context != null) {
            return TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, 0L);
        }
        return 0L;
    }

    public static String[] getDexLoaderFileList(Context context, Context context2, String str) {
        if (f6589r == null) {
            Object objM6375a = C6865v.m6375a(f6587p, "getJarFiles", (Class<?>[]) new Class[]{Context.class, Context.class, String.class}, context, context2, str);
            boolean z10 = objM6375a instanceof String[];
            Object obj = objM6375a;
            if (!z10) {
                obj = new String[]{""};
            }
            return (String[]) obj;
        }
        int length = f6589r.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = str + f6589r[i10];
        }
        return strArr;
    }

    public static boolean getDownloadWithoutWifi() {
        return f6570B;
    }

    public static boolean getIsSysWebViewForcedByOuter() {
        return f6573b;
    }

    public static String getMiniQBVersion(Context context) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(context, null);
        if (c6816boM6152b.m6157c()) {
            return c6816boM6152b.m6158d().m6186f();
        }
        return null;
    }

    public static String getQQBuildNumber() {
        return f6595x;
    }

    public static boolean getTBSInstalling() {
        return f6571C;
    }

    public static String getTID() {
        return f6594w;
    }

    public static int getTbsVersion(Context context) throws Throwable {
        if (TbsShareManager.isThirdPartyApp(context)) {
            return TbsShareManager.m5923a(context, false);
        }
        int iM6115h = C6785ak.m6068a().m6115h(context);
        if (iM6115h == 0 && C6780af.m6042a(context).m6054c() == 3) {
            reset(context);
        }
        return iM6115h;
    }

    public static void initBuglyAsync(boolean z10) {
        f6580i = z10;
    }

    public static void initTbsSettings(Map<String, Object> map) {
        Map<String, Object> map2 = f6583l;
        if (map2 == null) {
            f6583l = map;
            return;
        }
        try {
            map2.putAll(map);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void initX5Environment(Context context, PreInitCallback preInitCallback) throws Throwable {
        if (context == null) {
            return;
        }
        f6569A = new C6823h(context, preInitCallback);
        if (TbsShareManager.isThirdPartyApp(context)) {
            C6785ak.m6068a().m6107b(context, true);
        }
        TbsDownloader.needDownload(context, false, false, new C6824i(context, preInitCallback));
    }

    public static boolean installLocalQbApk(Context context, String str, String str2, Bundle bundle) {
        C6827l c6827lM6214a = C6827l.m6214a(true);
        c6827lM6214a.m6220a(context, false, false, null);
        if (c6827lM6214a.m6222b()) {
            return c6827lM6214a.m6219a().m6146a(context, str, str2, bundle);
        }
        return false;
    }

    public static boolean intentDispatch(WebView webView, Intent intent, String str, String str2) {
        String str3;
        if (webView == null) {
            return false;
        }
        if (str.startsWith("mttbrowser://miniqb/ch=icon?")) {
            Context context = webView.getContext();
            int iIndexOf = str.indexOf("url=");
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 4) : null;
            HashMap map = new HashMap();
            try {
                str3 = context.getApplicationInfo().packageName;
            } catch (Exception e10) {
                e10.printStackTrace();
                str3 = "unknown";
            }
            map.put(LOGIN_TYPE_KEY_PARTNER_ID, str3);
            map.put(LOGIN_TYPE_KEY_PARTNER_CALL_POS, "14004");
            if (C6774d.m5995a(context, "miniqb://home".equals(strSubstring) ? "qb://navicard/addCard?cardId=168&cardName=168" : strSubstring, map, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
                C6816bo c6816boM6152b = C6816bo.m6152b();
                if (c6816boM6152b != null && c6816boM6152b.m6157c() && c6816boM6152b.m6158d().m6160a(context, strSubstring, null, str2, null) == 0) {
                    return true;
                }
                webView.loadUrl(strSubstring);
            }
        } else {
            webView.loadUrl(str);
        }
        return false;
    }

    public static boolean isMiniQBShortCutExist(Context context, String str, String str2) {
        C6816bo c6816boM6152b;
        Object objInvokeStaticMethod;
        if (context == null || TbsDownloader.getOverSea(context) || (c6816boM6152b = C6816bo.m6152b()) == null || !c6816boM6152b.m6157c() || (objInvokeStaticMethod = c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[]{Context.class, String.class}, context, str)) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        if (objInvokeStaticMethod instanceof Boolean) {
            bool = (Boolean) objInvokeStaticMethod;
        }
        return bool.booleanValue();
    }

    public static boolean isTbsCoreInited() {
        C6827l c6827lM6214a = C6827l.m6214a(false);
        return c6827lM6214a != null && c6827lM6214a.m6227g();
    }

    public static boolean isX5DisabledSync(Context context) throws Throwable {
        if (C6780af.m6042a(context).m6054c() == 2) {
            return false;
        }
        if (!m5846b(context)) {
            return true;
        }
        int iM6115h = C6785ak.m6068a().m6115h(context);
        Object obj = f6587p;
        Class cls = Integer.TYPE;
        Object objM6375a = C6865v.m6375a(obj, "isX5DisabledSync", (Class<?>[]) new Class[]{cls, cls}, Integer.valueOf(iM6115h), 43500);
        if (objM6375a != null) {
            return ((Boolean) objM6375a).booleanValue();
        }
        return true;
    }

    public static synchronized void preInit(Context context) {
        preInit(context, null);
    }

    public static boolean preinstallStaticTbs(Context context) {
        TbsLog.initIfNeed(context);
        return C6785ak.m6068a().m6126t(context);
    }

    public static void reset(Context context) {
        reset(context, false);
    }

    public static void resetDecoupleCore(Context context) {
        TbsLog.m6247e("QbSdk", "QbSdk resetDecoupleCore!", true);
        try {
            C6854k.m6317b(C6785ak.m6068a().m6120m(context));
        } catch (Throwable th) {
            TbsLog.m6246e("QbSdk", "QbSdk resetDecoupleCore exception:" + Log.getStackTraceString(th));
        }
    }

    public static void setCurrentID(String str) {
        if (str != null && str.startsWith(TID_QQNumber_Prefix)) {
            String strSubstring = str.substring(3);
            f6594w = "0000000000000000".substring(strSubstring.length()) + strSubstring;
        }
    }

    public static void setDeviceInfo(String str, String str2, String str3, String str4) {
        C6845b.f6958a = str;
        C6845b.f6959b = str2;
        C6845b.f6960c = str3;
        C6845b.f6961d = str4;
    }

    public static void setDownloadWithoutWifi(boolean z10) {
        f6570B = z10;
    }

    public static void setQQBuildNumber(String str) {
        f6595x = str;
    }

    public static void setTBSInstallingStatus(boolean z10) {
        f6571C = z10;
    }

    public static void setTbsListener(TbsListener tbsListener) {
        f6597z = tbsListener;
    }

    public static void setTbsLogClient(TbsLogClient tbsLogClient) {
        TbsLog.setTbsLogClient(tbsLogClient);
    }

    public static int startMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, android.webkit.ValueCallback<String> valueCallback) {
        TbsCoreLoadStat.getInstance().m5851a(context, 501);
        if (context == null) {
            return -100;
        }
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(context, null);
        if (!c6816boM6152b.m6157c()) {
            TbsCoreLoadStat.getInstance().m5851a(context, 502);
            Log.e("QbSdk", "startMiniQBToLoadUrl  ret = -102");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT;
        }
        if (context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") && getTbsVersion(context) < 25487) {
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
        }
        int iM6160a = c6816boM6152b.m6158d().m6160a(context, str, map, null, valueCallback);
        if (iM6160a == 0) {
            TbsCoreLoadStat.getInstance().m5851a(context, 503);
        } else {
            TbsLogReport.m5877a(context).m5898b(504, "" + iM6160a);
        }
        Log.e("QbSdk", "startMiniQBToLoadUrl  ret = " + iM6160a);
        return iM6160a;
    }

    public static boolean startQBForDoc(Context context, String str, int i10, int i11, String str2, Bundle bundle) {
        HashMap map = new HashMap();
        map.put(LOGIN_TYPE_KEY_PARTNER_ID, context.getApplicationContext().getApplicationInfo().processName);
        map.put(LOGIN_TYPE_KEY_PARTNER_CALL_POS, Integer.toString(i10));
        return C6774d.m5999a(context, str, i11, str2, map, bundle);
    }

    public static boolean startQBForVideo(Context context, String str, int i10) {
        HashMap map = new HashMap();
        map.put(LOGIN_TYPE_KEY_PARTNER_ID, context.getApplicationInfo().processName);
        map.put(LOGIN_TYPE_KEY_PARTNER_CALL_POS, Integer.toString(i10));
        return C6774d.m6000a(context, str, (HashMap<String, String>) map);
    }

    public static boolean startQBToLoadurl(Context context, String str, int i10, WebView webView) {
        C6816bo c6816boM6152b;
        Object objInvokeStaticMethod;
        HashMap map = new HashMap();
        map.put(LOGIN_TYPE_KEY_PARTNER_ID, context.getApplicationInfo().processName);
        map.put(LOGIN_TYPE_KEY_PARTNER_CALL_POS, Integer.toString(i10));
        if (webView == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                if ((str2 == TbsConfig.APP_WX || str2 == TbsConfig.APP_QQ) && (c6816boM6152b = C6816bo.m6152b()) != null && c6816boM6152b.m6157c() && (objInvokeStaticMethod = c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0])) != null) {
                    webView = (WebView) ((IX5WebViewBase) objInvokeStaticMethod).getView().getParent();
                }
            } catch (Exception unused) {
            }
        }
        return C6774d.m5995a(context, str, map, "QbSdk.startQBToLoadurl", webView) == 0;
    }

    public static boolean startQbOrMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, ValueCallback<String> valueCallback) {
        if (context == null) {
            return false;
        }
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(context, null);
        if (map != null && "5".equals(map.get(LOGIN_TYPE_KEY_PARTNER_CALL_POS)) && c6816boM6152b.m6157c()) {
        }
        if (C6774d.m5995a(context, str, map, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
            return c6816boM6152b.m6157c() && (!context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") || getTbsVersion(context) >= 25487) && c6816boM6152b.m6158d().m6160a(context, str, map, null, valueCallback) == 0;
        }
        return true;
    }

    public static void unForceSysWebView() {
        f6573b = false;
        TbsLog.m6246e("QbSdk", "sys WebView: unForceSysWebView called");
    }

    public static boolean useSoftWare() {
        Object obj = f6587p;
        if (obj == null) {
            return false;
        }
        Object objM6375a = C6865v.m6375a(obj, "useSoftWare", (Class<?>[]) new Class[0], new Object[0]);
        if (objM6375a == null) {
            objM6375a = C6865v.m6375a(f6587p, "useSoftWare", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(C6770a.m5978a()));
        }
        if (objM6375a == null) {
            return false;
        }
        return ((Boolean) objM6375a).booleanValue();
    }

    /* renamed from: a */
    public static Object m5837a(Context context, String str, Bundle bundle) {
        if (!m5840a(context)) {
            return Integer.valueOf(EXTENSION_INIT_FAILURE);
        }
        Object objM6375a = C6865v.m6375a(f6587p, "miscCall", (Class<?>[]) new Class[]{String.class, Bundle.class}, str, bundle);
        if (objM6375a != null) {
            return objM6375a;
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m5846b(Context context) {
        File file;
        Object objNewInstance;
        try {
            if (f6586o != null) {
                return true;
            }
            File fileM6121n = C6785ak.m6068a().m6121n(context);
            if (fileM6121n == null) {
                TbsLog.m6246e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
                return false;
            }
            if (!TbsShareManager.isThirdPartyApp(context)) {
                file = new File(C6785ak.m6068a().m6121n(context), "tbs_sdk_extension_dex.jar");
            } else {
                if (!TbsShareManager.m5937i(context)) {
                    TbsCoreLoadStat.getInstance().m5851a(context, 304);
                    return false;
                }
                file = new File(TbsShareManager.m5930c(context), "tbs_sdk_extension_dex.jar");
            }
            if (!file.exists()) {
                TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, new Exception("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!"));
                return false;
            }
            String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : fileM6121n.getAbsolutePath();
            TbsLog.m6248i("QbSdk", "QbSdk init optDirExtension #3 is " + hostCorePathAppDefined);
            Class<?> clsLoadClass = new DexClassLoader(file.getAbsolutePath(), hostCorePathAppDefined, file.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            f6586o = clsLoadClass;
            Constructor<?> constructor = clsLoadClass.getConstructor(Context.class, Context.class);
            if (TbsShareManager.isThirdPartyApp(context)) {
                Context contextM5933e = TbsShareManager.m5933e(context);
                if (contextM5933e == null && TbsShareManager.getHostCorePathAppDefined() == null) {
                    TbsLogReport.m5877a(context.getApplicationContext()).m5898b(TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, "host context is null!");
                    return false;
                }
                objNewInstance = contextM5933e == null ? f6586o.getConstructor(Context.class, Context.class, String.class).newInstance(context, contextM5933e, TbsShareManager.getHostCorePathAppDefined()) : constructor.newInstance(context, contextM5933e);
            } else {
                objNewInstance = constructor.newInstance(context, context);
            }
            f6587p = objNewInstance;
            C6865v.m6375a(f6587p, "putInfo", (Class<?>[]) new Class[]{String.class, String.class, String.class, String.class}, C6845b.f6958a, C6845b.f6959b, C6845b.f6960c, C6845b.f6961d);
            C6865v.m6375a(f6587p, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
            return true;
        } catch (Throwable th) {
            TbsLog.m6246e("QbSdk", "initForX5DisableConfig sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m5848c(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m5848c(android.content.Context):void");
    }

    public static synchronized void preInit(Context context, PreInitCallback preInitCallback) {
        TbsLog.initIfNeed(context);
        f6581j = f6572a;
        if (!f6588q) {
            C6822g c6822g = new C6822g(context, new HandlerC6821f(Looper.getMainLooper(), preInitCallback, context));
            c6822g.setName("tbs_preinit");
            c6822g.setPriority(10);
            c6822g.start();
            f6588q = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void reset(android.content.Context r5, boolean r6) {
        /*
            java.lang.String r0 = "QbSdk"
            java.lang.String r1 = "QbSdk reset!"
            r2 = 1
            com.tencent.smtt.utils.TbsLog.m6247e(r0, r1, r2)
            com.tencent.smtt.sdk.TbsDownloader.stopDownload()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r6 == 0) goto L2f
            boolean r6 = com.tencent.smtt.sdk.TbsShareManager.isThirdPartyApp(r5)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L2f
            com.tencent.smtt.sdk.ak r6 = com.tencent.smtt.sdk.C6785ak.m6068a()     // Catch: java.lang.Throwable -> L2d
            int r6 = r6.m6114g(r5)     // Catch: java.lang.Throwable -> L2d
            com.tencent.smtt.sdk.ak r3 = com.tencent.smtt.sdk.C6785ak.m6068a()     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.m6115h(r5)     // Catch: java.lang.Throwable -> L2d
            r4 = 43300(0xa924, float:6.0676E-41)
            if (r6 <= r4) goto L2f
            if (r6 == r3) goto L2f
            r6 = r2
            goto L30
        L2d:
            r5 = move-exception
            goto L7d
        L2f:
            r6 = r1
        L30:
            com.tencent.smtt.sdk.TbsDownloader.m5866b(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "tbs"
            java.io.File r3 = r5.getDir(r3, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "core_share_decouple"
            com.tencent.smtt.utils.C6854k.m6303a(r3, r1, r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "delete downloaded apk success"
            com.tencent.smtt.utils.TbsLog.m6249i(r0, r3, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.ThreadLocal<java.lang.Integer> r2 = com.tencent.smtt.sdk.C6785ak.f6812a     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            r2.set(r1)     // Catch: java.lang.Throwable -> L2d
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2d
            java.io.File r2 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "bugly_switch.txt"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L60
            r1.delete()     // Catch: java.lang.Throwable -> L2d
        L60:
            if (r6 == 0) goto L7c
            com.tencent.smtt.sdk.ak r6 = com.tencent.smtt.sdk.C6785ak.m6068a()     // Catch: java.lang.Throwable -> L2d
            java.io.File r6 = r6.m6120m(r5)     // Catch: java.lang.Throwable -> L2d
            com.tencent.smtt.sdk.ak r1 = com.tencent.smtt.sdk.C6785ak.m6068a()     // Catch: java.lang.Throwable -> L2d
            java.io.File r1 = r1.m6123q(r5)     // Catch: java.lang.Throwable -> L2d
            com.tencent.smtt.utils.C6854k.m6320b(r6, r1)     // Catch: java.lang.Throwable -> L2d
            com.tencent.smtt.sdk.ak r6 = com.tencent.smtt.sdk.C6785ak.m6068a()     // Catch: java.lang.Throwable -> L2d
            r6.m6104b(r5)     // Catch: java.lang.Throwable -> L2d
        L7c:
            return
        L7d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "QbSdk reset exception:"
            r6.append(r1)
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.smtt.utils.TbsLog.m6246e(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.reset(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public static String m5838a() {
        return f6585n;
    }

    /* renamed from: a */
    public static synchronized void m5839a(Context context, String str) {
        if (f6572a) {
            return;
        }
        f6572a = true;
        f6591t = "forceSysWebViewInner: " + str;
        TbsLog.m6246e("QbSdk", "QbSdk.SysWebViewForcedInner..." + f6591t);
        TbsCoreLoadStat.getInstance().m5852a(context, 401, new Throwable(f6591t));
    }

    /* renamed from: a */
    public static boolean m5840a(Context context) {
        try {
            if (f6586o != null) {
                return true;
            }
            File fileM6121n = C6785ak.m6068a().m6121n(context);
            if (fileM6121n == null) {
                TbsLog.m6246e("QbSdk", "QbSdk initExtension (false) optDir == null");
                return false;
            }
            File file = new File(fileM6121n, "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsLog.m6247e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
                return false;
            }
            Class<?> clsLoadClass = new DexClassLoader(file.getAbsolutePath(), fileM6121n.getAbsolutePath(), file.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            f6586o = clsLoadClass;
            f6587p = clsLoadClass.getConstructor(Context.class, Context.class).newInstance(context, context);
            return true;
        } catch (Throwable th) {
            TbsLog.m6246e("QbSdk", "initExtension sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5841a(Context context, int i10) {
        return m5842a(context, i10, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
    }

    /* renamed from: a */
    public static boolean m5842a(Context context, int i10, int i11) {
        if (!m5846b(context)) {
            return true;
        }
        Object obj = f6587p;
        Class cls = Integer.TYPE;
        Object objM6375a = C6865v.m6375a(obj, "isX5Disabled", (Class<?>[]) new Class[]{cls, cls, cls}, Integer.valueOf(i10), 43500, Integer.valueOf(i11));
        if (objM6375a == null && (objM6375a = C6865v.m6375a(f6587p, "isX5Disabled", (Class<?>[]) new Class[]{cls, cls}, Integer.valueOf(i10), 43500)) == null) {
            return true;
        }
        return ((Boolean) objM6375a).booleanValue();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static boolean m5843a(Context context, boolean z10) {
        int iM6093a;
        File file;
        Object objNewInstance;
        TbsLog.initIfNeed(context);
        if (!sIsVersionPrinted) {
            TbsLog.m6248i("QbSdk", "svn revision: jnizz; SDK_VERSION_CODE: 43500; SDK_VERSION_NAME: 3.5.0.1063");
            sIsVersionPrinted = true;
        }
        if (f6572a && !z10) {
            TbsLog.m6247e("QbSdk", "QbSdk init: " + f6591t, false);
            TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED, new Throwable(f6591t));
            return false;
        }
        if (f6573b) {
            TbsLog.m6247e("QbSdk", "QbSdk init mIsSysWebViewForcedByOuter = true", true);
            TbsCoreLoadStat.getInstance().m5852a(context, 402, new Throwable(f6590s));
            return false;
        }
        if (!f6596y) {
            m5848c(context);
        }
        try {
            File fileM6121n = C6785ak.m6068a().m6121n(context);
            if (fileM6121n == null) {
                TbsLog.m6246e("QbSdk", "QbSdk init (false) optDir == null");
                TbsCoreLoadStat.getInstance().m5852a(context, 312, new Throwable("QbSdk.init (false) TbsCoreShareDir is null"));
                return false;
            }
            if (!TbsShareManager.isThirdPartyApp(context)) {
                if (f6584m != 0) {
                    iM6093a = C6785ak.m6068a().m6093a(true, context);
                    if (f6584m != iM6093a) {
                        f6586o = null;
                        f6587p = null;
                        TbsLog.m6247e("QbSdk", "QbSdk init (false) not isThirdPartyApp tbsCoreInstalledVer=" + iM6093a, true);
                        TbsLog.m6247e("QbSdk", "QbSdk init (false) not isThirdPartyApp sTbsVersion=" + f6584m, true);
                        TbsCoreLoadStat.getInstance().m5852a(context, 303, new Throwable("sTbsVersion: " + f6584m + "; tbsCoreInstalledVer: " + iM6093a));
                        return false;
                    }
                } else {
                    iM6093a = 0;
                }
                f6584m = iM6093a;
            }
            if (f6586o != null) {
                return true;
            }
            if (!TbsShareManager.isThirdPartyApp(context)) {
                file = new File(C6785ak.m6068a().m6121n(context), "tbs_sdk_extension_dex.jar");
            } else {
                if (!TbsShareManager.m5937i(context)) {
                    TbsCoreLoadStat.getInstance().m5852a(context, 304, new Throwable("isShareTbsCoreAvailable false!"));
                    return false;
                }
                file = new File(TbsShareManager.m5930c(context), "tbs_sdk_extension_dex.jar");
            }
            if (file.exists()) {
                String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : fileM6121n.getAbsolutePath();
                TbsLog.m6248i("QbSdk", "QbSdk init optDirExtension #1 is " + hostCorePathAppDefined);
                Class<?> clsLoadClass = new DexClassLoader(file.getAbsolutePath(), hostCorePathAppDefined, file.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                f6586o = clsLoadClass;
                Constructor<?> constructor = clsLoadClass.getConstructor(Context.class, Context.class);
                if (TbsShareManager.isThirdPartyApp(context)) {
                    Context contextM5933e = TbsShareManager.m5933e(context);
                    if (contextM5933e == null && TbsShareManager.getHostCorePathAppDefined() == null) {
                        TbsLogReport.m5877a(context.getApplicationContext()).m5898b(TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, "host context is null!");
                        return false;
                    }
                    objNewInstance = contextM5933e == null ? f6586o.getConstructor(Context.class, Context.class, String.class).newInstance(context, contextM5933e, TbsShareManager.getHostCorePathAppDefined()) : constructor.newInstance(context, contextM5933e);
                } else {
                    objNewInstance = constructor.newInstance(context, context);
                }
                f6587p = objNewInstance;
                C6865v.m6375a(f6587p, "putInfo", (Class<?>[]) new Class[]{String.class, String.class, String.class, String.class}, C6845b.f6958a, C6845b.f6959b, C6845b.f6960c, C6845b.f6961d);
                C6865v.m6375a(f6587p, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
                return true;
            }
            try {
                TbsLog.m6246e("QbSdk", "QbSdk init (false) tbs_sdk_extension_dex.jar is not exist!");
                int iM6115h = C6785ak.m6068a().m6115h(context);
                if (new File(file.getParentFile(), "tbs_jars_fusion_dex.jar").exists()) {
                    if (iM6115h > 0) {
                        TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITH_CORE, new Exception("tbs_sdk_extension_dex not exist(with fusion dex)!" + iM6115h));
                    } else {
                        TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITHOUT_CORE, new Exception("tbs_sdk_extension_dex not exist(with fusion dex)!" + iM6115h));
                    }
                } else if (iM6115h > 0) {
                    TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITH_CORE, new Exception("tbs_sdk_extension_dex not exist(without fusion dex)!" + iM6115h));
                } else {
                    TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITHOUT_CORE, new Exception("tbs_sdk_extension_dex not exist(without fusion dex)!" + iM6115h));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return false;
        } catch (Throwable th2) {
            TbsLog.m6246e("QbSdk", "QbSdk init Throwable: " + Log.getStackTraceString(th2));
            TbsCoreLoadStat.getInstance().m5852a(context, 306, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m5844a(android.content.Context r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m5844a(android.content.Context, boolean, boolean):boolean");
    }
}
