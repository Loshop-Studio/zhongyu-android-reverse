package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.p032h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C5780aa;
import com.tencent.bugly.proguard.C5782ac;
import com.tencent.bugly.proguard.C5790ak;
import com.tencent.bugly.proguard.C5791al;
import com.tencent.bugly.proguard.C5793an;
import com.tencent.bugly.proguard.C5795ap;
import com.tencent.bugly.proguard.C5796aq;
import com.tencent.bugly.proguard.C5799at;
import com.tencent.bugly.proguard.C5800au;
import com.tencent.bugly.proguard.C5809bc;
import com.tencent.bugly.proguard.C5842p;
import com.tencent.bugly.proguard.C5844r;
import com.tencent.bugly.proguard.C5845s;
import com.tencent.bugly.proguard.C5849w;
import com.tencent.bugly.proguard.C5850x;
import com.tencent.bugly.proguard.C5851y;
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
    private static Context f3731a;

    public static class CrashHandleCallback extends BuglyStrategy.C5765a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f3733c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f3704a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f3705b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i6) {
            this.f3704a = i6;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z6) {
            this.f3705b = z6;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f3733c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f3733c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC5768a {
        /* renamed from: a */
        String mo3762a();

        /* renamed from: a */
        void mo3763a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo3764a(String str);

        /* renamed from: b */
        void mo3765b();

        /* renamed from: c */
        CharSequence mo3766c();
    }

    public static void closeBugly() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f3731a == null) {
            return;
        }
        C5796aq c5796aqM4001a = C5796aq.m4001a();
        if (c5796aqM4001a != null) {
            c5796aqM4001a.m4007b(f3731a);
        }
        closeCrashReport();
        C5845s.m4263a(f3731a);
        C5790ak c5790akM3919a = C5790ak.m3919a();
        if (c5790akM3919a != null) {
            c5790akM3919a.m3923b();
        }
    }

    public static void closeCrashReport() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C5799at.m4051a().m4059c();
        } else {
            Log.w(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C5799at.m4051a().m4060d();
        } else {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z6) {
        C5842p.f4355a = z6;
    }

    public static void enableObtainId(Context context, boolean z6) {
        setCollectPrivacyInfo(context, z6);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C5780aa.m3793a(context).m3828w();
        }
        Log.e(C5791al.f4011b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get App channel because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C5780aa.m3793a(f3731a).f3931s;
        }
        Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppID() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get App ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C5780aa.m3793a(f3731a).m3808e();
        }
        Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppVer() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get app version because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C5780aa.m3793a(f3731a).f3927o;
        }
        Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C5780aa.m3793a(context).f3920h;
        }
        C5791al.m3933d("Please call with context.", new Object[0]);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static Context getContext() {
        return f3731a;
    }

    public static String getDeviceID(Context context) {
        return C5780aa.m3793a(context).m3812g();
    }

    public static Proxy getHttpProxy() {
        return C5793an.f4015a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C5780aa.m3793a(f3731a).f3874K;
        }
        Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C5791al.f4011b, "getUserDataValue args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C5795ap.m3991b(str)) {
            return null;
        }
        return C5780aa.m3793a(context).m3813g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C5780aa.m3793a(context).m3827v();
        }
        Log.e(C5791al.f4011b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get user ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C5780aa.m3793a(f3731a).m3810f();
        }
        Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static int getUserSceneTagId(Context context) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C5780aa.m3793a(context).m3831z();
        }
        Log.e(C5791al.f4011b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f3731a = context;
        C5842p.m4238a(CrashModule.getInstance());
        C5842p.m4235a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C5799at c5799atM4051a = C5799at.m4051a();
        Boolean bool = c5799atM4051a.f4093A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C5780aa.m3795b().f3916d;
        List<C5851y> listM4318a = C5849w.m4301a().m4318a(1);
        ArrayList arrayList = new ArrayList();
        if (listM4318a == null || listM4318a.size() <= 0) {
            c5799atM4051a.f4093A = Boolean.FALSE;
            return false;
        }
        for (C5851y c5851y : listM4318a) {
            if (str.equals(c5851y.f4435c)) {
                c5799atM4051a.f4093A = Boolean.TRUE;
                arrayList.add(c5851y);
            }
        }
        if (arrayList.size() > 0) {
            C5849w.m4301a().m4320a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i6, String str, String str2, String str3, Map<String, String> map) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C5800au.m4072a(thread, i6, str, str2, str3, map);
        } else {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C5795ap.m3991b(str) || C5795ap.m3991b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C5791al.f4011b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C5791al.f4011b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C5780aa.m3793a(context).m3803b(strReplace, str2);
        C5791al.m3930b(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C5791al.m3933d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C5791al.m3933d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C5791al.m3933d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        if (c5780aaM3793a.m3828w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C5780aa.m3793a(context).m3800a(str, str2);
            C5791al.m3932c("replace KV %s %s", str, str2);
            return;
        }
        if (c5780aaM3793a.m3827v() >= 50) {
            C5791al.m3933d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C5791al.m3933d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C5780aa.m3793a(context).m3800a(str, str2);
        C5791al.m3930b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not remove user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C5791al.f4011b, "removeUserData args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C5795ap.m3991b(str)) {
            return null;
        }
        C5791al.m3930b("[param] remove user data: %s", str);
        return C5780aa.m3793a(context).m3811f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z6, boolean z7) {
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        c5780aaM3793a.f3880Q = z6;
        c5780aaM3793a.f3881R = z7;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C5791al.f4011b, "App channel is null, will not set");
            return;
        }
        C5780aa.m3793a(context).f3931s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C5791al.f4011b, "App package is null, will not set");
            return;
        }
        C5780aa.m3793a(context).f3915c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C5791al.f4011b, "App version is null, will not set");
            return;
        }
        C5780aa.m3793a(context).f3927o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C5791al.f4011b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C5850x.f4429a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z6) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C5791al.f4011b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C5791al.f4011b, "setCollectPrivacyInfo: ".concat(String.valueOf(z6)));
            C5780aa.m3793a(context).f3926n = z6;
        }
    }

    public static void setContext(Context context) {
        f3731a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C5791al.f4011b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C5799at.f4091q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C5791al.f4011b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C5799at.f4092r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C5780aa.m3793a(context).m3799a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C5780aa.m3793a(context).m3802b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C5791al.f4011b, "tombstone path is null, will not set");
        } else {
            Log.i(C5791al.f4011b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z6) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C5791al.f4011b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z6)));
            NativeCrashHandler.setShouldHandleInJava(z6);
        }
    }

    public static void setHttpProxy(String str, int i6) {
        if (TextUtils.isEmpty(str)) {
            C5793an.f4015a = null;
        } else {
            C5793an.f4015a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i6));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z6) {
        C5791al.m3928a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z6) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C5791al.m3933d("Context should not be null.", new Object[0]);
            return;
        }
        if (z6) {
            C5791al.m3932c("This is a development device.", new Object[0]);
        } else {
            C5791al.m3932c("This is not a development device.", new Object[0]);
        }
        C5780aa.m3793a(context).f3872I = z6;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z6) {
        return setJavascriptMonitor(webView, z6, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C5795ap.m3991b(str) || C5795ap.m3991b(str2)) {
            return;
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c5780aaM3793a.f3883T) {
            c5780aaM3793a.f3874K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C5795ap.m3991b(str) || !C5795ap.m3999d(str)) {
            Log.i(C5791al.f4011b, "URL is invalid.");
            return;
        }
        C5782ac.m3859a(str);
        StrategyBean.f3756a = str;
        StrategyBean.f3757b = str;
    }

    public static void setSessionIntervalMills(long j6) {
        if (C5842p.f4355a) {
            C5845s.m4262a(j6);
        } else {
            Log.w(C5791al.f4011b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f3731a, str);
        } else {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i6) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C5791al.f4011b, "setTag args context should not be null");
            return;
        }
        if (i6 <= 0) {
            C5791al.m3933d("setTag args tagId should > 0", new Object[0]);
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        synchronized (c5780aaM3793a.f3884U) {
            try {
                int i7 = c5780aaM3793a.f3935w;
                if (i7 != i6) {
                    c5780aaM3793a.f3935w = i6;
                    C5791al.m3928a("user scene tag %d changed to tag %d", Integer.valueOf(i7), Integer.valueOf(c5780aaM3793a.f3935w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5791al.m3930b("[param] set user scene tag: %d", Integer.valueOf(i6));
    }

    public static void startCrashReport() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C5799at.m4051a().m4058b();
        } else {
            Log.w(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C5791al.m3928a("start to create a anr crash for test!", new Object[0]);
            C5799at.m4051a().m4064h();
        }
    }

    public static void testJavaCrash() {
        int i6;
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C5780aa c5780aaM3795b = C5780aa.m3795b();
        if (c5780aaM3795b != null && (i6 = c5780aaM3795b.f3936x) != 24096) {
            c5780aaM3795b.f3936x = 24096;
            C5791al.m3928a("server scene tag %d changed to tag %d", Integer.valueOf(i6), Integer.valueOf(c5780aaM3795b.f3936x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not upload user info because bugly is disable.");
            return;
        }
        C5844r c5844r = C5845s.f4376b;
        if (c5844r == null) {
            Log.w(C5791al.f4011b, "Can not upload user info because bugly is not init.");
        } else {
            c5844r.m4259b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z6, boolean z7) {
        if (webView == null) {
            Log.w(C5791al.f4011b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new InterfaceC5768a() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC5768a
            /* renamed from: a */
            public final String mo3762a() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC5768a
            /* renamed from: b */
            public final void mo3765b() {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC5768a
            /* renamed from: c */
            public final CharSequence mo3766c() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC5768a
            /* renamed from: a */
            public final void mo3764a(String str) {
                webView.loadUrl(str);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC5768a
            /* renamed from: a */
            public final void mo3763a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z6, z7);
    }

    public static void testNativeCrash(boolean z6, boolean z7, boolean z8) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C5791al.m3928a("start to create a native crash for test!", new Object[0]);
            C5799at.m4051a().m4057a(z6, z7, z8);
        }
    }

    public static void postCatchedException(final Throwable th, final Thread thread, final boolean z6) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C5791al.f4011b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C5791al.m3933d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final C5799at c5799atM4051a = C5799at.m4051a();
        c5799atM4051a.f4101w.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a */
            final /* synthetic */ boolean f4107a = false;

            /* renamed from: d */
            final /* synthetic */ String f4110d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f4111e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f4112f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C5791al.m3932c("post a throwable %b", Boolean.valueOf(this.f4107a));
                    C5799at.this.f4098t.m4082a(thread, th, false, this.f4110d, this.f4111e, this.f4112f);
                    if (z6) {
                        C5791al.m3928a("clear user datas", new Object[0]);
                        C5780aa.m3793a(C5799at.this.f4096c).m3826u();
                    }
                } catch (Throwable th2) {
                    if (!C5791al.m3931b(th2)) {
                        th2.printStackTrace();
                    }
                    C5791al.m3934e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f3731a = context;
        C5842p.m4238a(CrashModule.getInstance());
        C5842p.m4236a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i6) {
        if (inetAddress == null) {
            C5793an.f4015a = null;
        } else {
            C5793an.f4015a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i6));
        }
    }

    public static void postException(int i6, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i6, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C5791al.f4011b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C5791al.m3933d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C5791al.m3933d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C5780aa.m3793a(context).m3810f())) {
            return;
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        synchronized (c5780aaM3793a.f3885V) {
            c5780aaM3793a.f3924l = str;
        }
        C5791al.m3930b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C5845s.m4261a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C5791al.m3933d("Context should not be null.", new Object[0]);
            return null;
        }
        return C5780aa.m3793a(context).f3874K;
    }

    public static void initCrashReport(Context context, String str, boolean z6) {
        initCrashReport(context, str, z6, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC5768a interfaceC5768a, boolean z6) {
        return setJavascriptMonitor(interfaceC5768a, z6, false);
    }

    public static void initCrashReport(Context context, String str, boolean z6, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f3731a = context;
        C5842p.m4238a(CrashModule.getInstance());
        C5842p.m4237a(context, str, z6, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC5768a interfaceC5768a, boolean z6, boolean z7) {
        if (interfaceC5768a == null) {
            Log.w(C5791al.f4011b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C5791al.m3934e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C5791al.m3928a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C5842p.f4355a) {
            Log.w(C5791al.f4011b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C5791al.m3932c("URL of webview is %s", interfaceC5768a.mo3762a());
        C5791al.m3928a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC5768a.mo3765b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC5768a);
        if (h5JavaScriptInterface != null) {
            C5791al.m3928a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC5768a.mo3763a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z6) {
            return true;
        }
        C5791al.m3928a("Inject bugly.js(v%s) to the webview.", C5809bc.m4110b());
        String strM4109a = C5809bc.m4109a();
        if (strM4109a == null) {
            C5791al.m3934e("Failed to inject Bugly.js.", C5809bc.m4110b());
            return false;
        }
        interfaceC5768a.mo3764a("javascript:".concat(strM4109a));
        return true;
    }
}
