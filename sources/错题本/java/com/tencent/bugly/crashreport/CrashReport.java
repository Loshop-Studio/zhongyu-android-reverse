package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.p033h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C4044aa;
import com.tencent.bugly.proguard.C4046ac;
import com.tencent.bugly.proguard.C4054ak;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4057an;
import com.tencent.bugly.proguard.C4059ap;
import com.tencent.bugly.proguard.C4060aq;
import com.tencent.bugly.proguard.C4063at;
import com.tencent.bugly.proguard.C4064au;
import com.tencent.bugly.proguard.C4075bc;
import com.tencent.bugly.proguard.C4129p;
import com.tencent.bugly.proguard.C4133r;
import com.tencent.bugly.proguard.C4135s;
import com.tencent.bugly.proguard.C4143w;
import com.tencent.bugly.proguard.C4145x;
import com.tencent.bugly.proguard.C4147y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class CrashReport {

    /* renamed from: a */
    private static Context f3244a;

    public static class CrashHandleCallback extends BuglyStrategy.C4032a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f3245c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f3217a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f3218b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i) {
            this.f3217a = i;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z8) {
            this.f3218b = z8;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f3245c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f3245c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC4034a {
        /* renamed from: a */
        String mo2856a();

        /* renamed from: a */
        void mo2857a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo2858a(String str);

        /* renamed from: b */
        void mo2859b();

        /* renamed from: c */
        CharSequence mo2860c();
    }

    public static void closeBugly() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f3244a == null) {
            return;
        }
        C4060aq c4060aqM3094a = C4060aq.m3094a();
        if (c4060aqM3094a != null) {
            c4060aqM3094a.m3100b(f3244a);
        }
        closeCrashReport();
        C4135s.m3355a(f3244a);
        C4054ak c4054akM3012a = C4054ak.m3012a();
        if (c4054akM3012a != null) {
            c4054akM3012a.m3016b();
        }
    }

    public static void closeCrashReport() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C4063at.m3143a().m3151c();
        } else {
            Log.w(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C4063at.m3143a().m3152d();
        } else {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z8) {
        C4129p.f3862a = z8;
    }

    public static void enableObtainId(Context context, boolean z8) {
        setCollectPrivacyInfo(context, z8);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C4044aa.m2888a(context).m2923w();
        }
        Log.e(C4055al.f3521b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get App channel because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C4044aa.m2888a(f3244a).f3449s;
        }
        Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppID() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get App ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C4044aa.m2888a(f3244a).m2903e();
        }
        Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppVer() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get app version because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C4044aa.m2888a(f3244a).f3445o;
        }
        Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C4044aa.m2888a(context).f3438h;
        }
        C4055al.m3026d("Please call with context.", new Object[0]);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static Context getContext() {
        return f3244a;
    }

    public static String getDeviceID(Context context) {
        return C4044aa.m2888a(context).m2907g();
    }

    public static Proxy getHttpProxy() {
        return C4057an.f3523a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C4044aa.m2888a(f3244a).f3392K;
        }
        Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C4055al.f3521b, "getUserDataValue args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C4059ap.m3084b(str)) {
            return null;
        }
        return C4044aa.m2888a(context).m2908g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C4044aa.m2888a(context).m2922v();
        }
        Log.e(C4055al.f3521b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get user ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C4044aa.m2888a(f3244a).m2905f();
        }
        Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static int getUserSceneTagId(Context context) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C4044aa.m2888a(context).m2926z();
        }
        Log.e(C4055al.f3521b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f3244a = context;
        C4129p.m3329a(CrashModule.getInstance());
        C4129p.m3326a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C4063at c4063atM3143a = C4063at.m3143a();
        Boolean bool = c4063atM3143a.f3588A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C4044aa.m2890b().f3434d;
        List<C4147y> listM3410a = C4143w.m3393a().m3410a(1);
        ArrayList arrayList = new ArrayList();
        if (listM3410a == null || listM3410a.size() <= 0) {
            c4063atM3143a.f3588A = Boolean.FALSE;
            return false;
        }
        for (C4147y c4147y : listM3410a) {
            if (str.equals(c4147y.f3911c)) {
                c4063atM3143a.f3588A = Boolean.TRUE;
                arrayList.add(c4147y);
            }
        }
        if (arrayList.size() > 0) {
            C4143w.m3393a().m3412a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C4064au.m3164a(thread, i, str, str2, str3, map);
        } else {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C4059ap.m3084b(str) || C4059ap.m3084b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C4055al.f3521b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C4055al.f3521b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C4044aa.m2888a(context).m2898b(strReplace, str2);
        StringBuilder sb = new StringBuilder("[param] putSdkData data: ");
        sb.append(strReplace);
        C4055al.m3023b(AbstractC0037f.m91p(sb, " - ", str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C4055al.f3521b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C4055al.m3026d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C4055al.m3026d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C4055al.m3026d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C4044aa c4044aaM2888a = C4044aa.m2888a(context);
        if (c4044aaM2888a.m2923w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C4044aa.m2888a(context).m2895a(str, str2);
            C4055al.m3025c("replace KV %s %s", str, str2);
            return;
        }
        if (c4044aaM2888a.m2922v() >= 50) {
            C4055al.m3026d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C4055al.m3026d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C4044aa.m2888a(context).m2895a(str, str2);
        C4055al.m3023b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not remove user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C4055al.f3521b, "removeUserData args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C4059ap.m3084b(str)) {
            return null;
        }
        C4055al.m3023b("[param] remove user data: %s", str);
        return C4044aa.m2888a(context).m2906f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z8, boolean z9) {
        C4044aa c4044aaM2888a = C4044aa.m2888a(context);
        c4044aaM2888a.f3398Q = z8;
        c4044aaM2888a.f3399R = z9;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C4055al.f3521b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C4055al.f3521b, "App channel is null, will not set");
            return;
        }
        C4044aa.m2888a(context).f3449s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C4055al.f3521b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C4055al.f3521b, "App package is null, will not set");
            return;
        }
        C4044aa.m2888a(context).f3433c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C4055al.f3521b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C4055al.f3521b, "App version is null, will not set");
            return;
        }
        C4044aa.m2888a(context).f3445o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C4055al.f3521b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C4145x.f3905a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z8) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C4055al.f3521b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C4055al.f3521b, "setCollectPrivacyInfo: ".concat(String.valueOf(z8)));
            C4044aa.m2888a(context).f3444n = z8;
        }
    }

    public static void setContext(Context context) {
        f3244a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C4055al.f3521b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C4063at.f3586q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C4055al.f3521b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C4063at.f3587r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C4044aa.m2888a(context).m2894a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C4044aa.m2888a(context).m2897b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C4055al.f3521b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C4055al.f3521b, "tombstone path is null, will not set");
        } else {
            Log.i(C4055al.f3521b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z8) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C4055al.f3521b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z8)));
            NativeCrashHandler.setShouldHandleInJava(z8);
        }
    }

    public static void setHttpProxy(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            C4057an.f3523a = null;
        } else {
            C4057an.f3523a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z8) {
        C4055al.m3021a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z8) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C4055al.m3026d("Context should not be null.", new Object[0]);
            return;
        }
        if (z8) {
            C4055al.m3025c("This is a development device.", new Object[0]);
        } else {
            C4055al.m3025c("This is not a development device.", new Object[0]);
        }
        C4044aa.m2888a(context).f3390I = z8;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z8) {
        return setJavascriptMonitor(webView, z8, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C4059ap.m3084b(str) || C4059ap.m3084b(str2)) {
            return;
        }
        C4044aa c4044aaM2888a = C4044aa.m2888a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c4044aaM2888a.f3401T) {
            c4044aaM2888a.f3392K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C4059ap.m3084b(str) || !C4059ap.m3092d(str)) {
            Log.i(C4055al.f3521b, "URL is invalid.");
            return;
        }
        C4046ac.m2953a(str);
        StrategyBean.f3269a = str;
        StrategyBean.f3270b = str;
    }

    public static void setSessionIntervalMills(long j7) {
        if (C4129p.f3862a) {
            C4135s.m3354a(j7);
        } else {
            Log.w(C4055al.f3521b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f3244a, str);
        } else {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C4055al.f3521b, "setTag args context should not be null");
            return;
        }
        if (i <= 0) {
            C4055al.m3026d("setTag args tagId should > 0", new Object[0]);
        }
        C4044aa c4044aaM2888a = C4044aa.m2888a(context);
        synchronized (c4044aaM2888a.f3402U) {
            try {
                int i8 = c4044aaM2888a.f3453w;
                if (i8 != i) {
                    c4044aaM2888a.f3453w = i;
                    C4055al.m3021a("user scene tag %d changed to tag %d", Integer.valueOf(i8), Integer.valueOf(c4044aaM2888a.f3453w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4055al.m3023b("[param] set user scene tag: %d", Integer.valueOf(i));
    }

    public static void startCrashReport() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C4063at.m3143a().m3150b();
        } else {
            Log.w(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C4055al.m3021a("start to create a anr crash for test!", new Object[0]);
            C4063at.m3143a().m3156h();
        }
    }

    public static void testJavaCrash() {
        int i;
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C4044aa c4044aaM2890b = C4044aa.m2890b();
        if (c4044aaM2890b != null && (i = c4044aaM2890b.f3454x) != 24096) {
            c4044aaM2890b.f3454x = 24096;
            C4055al.m3021a("server scene tag %d changed to tag %d", Integer.valueOf(i), Integer.valueOf(c4044aaM2890b.f3454x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not upload user info because bugly is disable.");
            return;
        }
        C4133r c4133r = C4135s.f3877b;
        if (c4133r == null) {
            Log.w(C4055al.f3521b, "Can not upload user info because bugly is not init.");
        } else {
            c4133r.m3351b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebView webView, boolean z8, boolean z9) {
        if (webView == null) {
            Log.w(C4055al.f3521b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new C4035a(webView), z8, z9);
    }

    public static void testNativeCrash(boolean z8, boolean z9, boolean z10) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C4055al.m3021a("start to create a native crash for test!", new Object[0]);
            C4063at.m3143a().m3149a(z8, z9, z10);
        }
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z8) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C4055al.f3521b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C4055al.m3026d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        C4063at c4063atM3143a = C4063at.m3143a();
        c4063atM3143a.f3596w.m3014a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: b */
            final /* synthetic */ Thread f3601b;

            /* renamed from: c */
            final /* synthetic */ Throwable f3602c;

            /* renamed from: g */
            final /* synthetic */ boolean f3606g;

            /* renamed from: a */
            final /* synthetic */ boolean f3600a = false;

            /* renamed from: d */
            final /* synthetic */ String f3603d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f3604e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f3605f = true;

            public AnonymousClass3(Thread thread2, Throwable th2, boolean z82) {
                thread = thread2;
                th = th2;
                z = z82;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C4055al.m3025c("post a throwable %b", Boolean.valueOf(this.f3600a));
                    C4063at.this.f3593t.m3174a(thread, th, false, this.f3603d, this.f3604e, this.f3605f);
                    if (z) {
                        C4055al.m3021a("clear user datas", new Object[0]);
                        C4044aa.m2888a(C4063at.this.f3591c).m2921u();
                    }
                } catch (Throwable th2) {
                    if (!C4055al.m3024b(th2)) {
                        th2.printStackTrace();
                    }
                    C4055al.m3027e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f3244a = context;
        C4129p.m3329a(CrashModule.getInstance());
        C4129p.m3327a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i) {
        if (inetAddress == null) {
            C4057an.f3523a = null;
        } else {
            C4057an.f3523a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i));
        }
    }

    public static void postException(int i, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C4055al.f3521b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C4055al.m3026d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C4055al.m3026d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C4044aa.m2888a(context).m2905f())) {
            return;
        }
        C4044aa c4044aaM2888a = C4044aa.m2888a(context);
        synchronized (c4044aaM2888a.f3403V) {
            c4044aaM2888a.f3442l = str;
        }
        C4055al.m3023b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C4135s.m3353a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C4055al.m3026d("Context should not be null.", new Object[0]);
            return null;
        }
        return C4044aa.m2888a(context).f3392K;
    }

    public static void initCrashReport(Context context, String str, boolean z8) {
        initCrashReport(context, str, z8, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC4034a interfaceC4034a, boolean z8) {
        return setJavascriptMonitor(interfaceC4034a, z8, false);
    }

    public static void initCrashReport(Context context, String str, boolean z8, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f3244a = context;
        C4129p.m3329a(CrashModule.getInstance());
        C4129p.m3328a(context, str, z8, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC4034a interfaceC4034a, boolean z8, boolean z9) {
        if (interfaceC4034a == null) {
            Log.w(C4055al.f3521b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C4055al.m3027e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C4055al.m3021a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C4129p.f3862a) {
            Log.w(C4055al.f3521b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C4055al.m3025c("URL of webview is %s", interfaceC4034a.mo2856a());
        C4055al.m3021a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC4034a.mo2859b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC4034a);
        if (h5JavaScriptInterface != null) {
            C4055al.m3021a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC4034a.mo2857a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z8) {
            return true;
        }
        C4055al.m3021a("Inject bugly.js(v%s) to the webview.", C4075bc.m3202b());
        String strM3201a = C4075bc.m3201a();
        if (strM3201a == null) {
            C4055al.m3027e("Failed to inject Bugly.js.", C4075bc.m3202b());
            return false;
        }
        interfaceC4034a.mo2858a("javascript:".concat(strM3201a));
        return true;
    }
}
