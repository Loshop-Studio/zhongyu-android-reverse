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
import com.tencent.bugly.crashreport.crash.p070h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C6663aa;
import com.tencent.bugly.proguard.C6665ac;
import com.tencent.bugly.proguard.C6673ak;
import com.tencent.bugly.proguard.C6674al;
import com.tencent.bugly.proguard.C6676an;
import com.tencent.bugly.proguard.C6678ap;
import com.tencent.bugly.proguard.C6679aq;
import com.tencent.bugly.proguard.C6682at;
import com.tencent.bugly.proguard.C6683au;
import com.tencent.bugly.proguard.C6692bc;
import com.tencent.bugly.proguard.C6725p;
import com.tencent.bugly.proguard.C6727r;
import com.tencent.bugly.proguard.C6728s;
import com.tencent.bugly.proguard.C6732w;
import com.tencent.bugly.proguard.C6733x;
import com.tencent.bugly.proguard.C6734y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class CrashReport {

    /* renamed from: a */
    private static Context f5587a;

    public static class CrashHandleCallback extends BuglyStrategy.C6648a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f5589c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f5560a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f5561b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i9) {
            this.f5560a = i9;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z9) {
            this.f5561b = z9;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f5589c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f5589c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC6651a {
        /* renamed from: a */
        String mo4936a();

        /* renamed from: a */
        void mo4937a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo4938a(String str);

        /* renamed from: b */
        void mo4939b();

        /* renamed from: c */
        CharSequence mo4940c();
    }

    public static void closeBugly() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f5587a == null) {
            return;
        }
        C6679aq c6679aqM5175a = C6679aq.m5175a();
        if (c6679aqM5175a != null) {
            c6679aqM5175a.m5181b(f5587a);
        }
        closeCrashReport();
        C6728s.m5437a(f5587a);
        C6673ak c6673akM5093a = C6673ak.m5093a();
        if (c6673akM5093a != null) {
            c6673akM5093a.m5097b();
        }
    }

    public static void closeCrashReport() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6682at.m5225a().m5233c();
        } else {
            Log.w(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6682at.m5225a().m5234d();
        } else {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z9) {
        C6725p.f6211a = z9;
    }

    public static void enableObtainId(Context context, boolean z9) {
        setCollectPrivacyInfo(context, z9);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C6663aa.m4967a(context).m5002w();
        }
        Log.e(C6674al.f5867b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get App channel because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6663aa.m4967a(f5587a).f5787s;
        }
        Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppID() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get App ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6663aa.m4967a(f5587a).m4982e();
        }
        Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppVer() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get app version because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6663aa.m4967a(f5587a).f5783o;
        }
        Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C6663aa.m4967a(context).f5776h;
        }
        C6674al.m5107d("Please call with context.", new Object[0]);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static Context getContext() {
        return f5587a;
    }

    public static String getDeviceID(Context context) {
        return C6663aa.m4967a(context).m4986g();
    }

    public static Proxy getHttpProxy() {
        return C6676an.f5871a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6663aa.m4967a(f5587a).f5730K;
        }
        Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C6674al.f5867b, "getUserDataValue args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C6678ap.m5165b(str)) {
            return null;
        }
        return C6663aa.m4967a(context).m4987g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6663aa.m4967a(context).m5001v();
        }
        Log.e(C6674al.f5867b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get user ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6663aa.m4967a(f5587a).m4984f();
        }
        Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static int getUserSceneTagId(Context context) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6663aa.m4967a(context).m5005z();
        }
        Log.e(C6674al.f5867b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f5587a = context;
        C6725p.m5412a(CrashModule.getInstance());
        C6725p.m5409a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C6682at c6682atM5225a = C6682at.m5225a();
        Boolean bool = c6682atM5225a.f5949A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C6663aa.m4969b().f5772d;
        List<C6734y> listM5492a = C6732w.m5475a().m5492a(1);
        ArrayList arrayList = new ArrayList();
        if (listM5492a == null || listM5492a.size() <= 0) {
            c6682atM5225a.f5949A = Boolean.FALSE;
            return false;
        }
        for (C6734y c6734y : listM5492a) {
            if (str.equals(c6734y.f6291c)) {
                c6682atM5225a.f5949A = Boolean.TRUE;
                arrayList.add(c6734y);
            }
        }
        if (arrayList.size() > 0) {
            C6732w.m5475a().m5494a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i9, String str, String str2, String str3, Map<String, String> map) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6683au.m5246a(thread, i9, str, str2, str3, map);
        } else {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C6678ap.m5165b(str) || C6678ap.m5165b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C6674al.f5867b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C6674al.f5867b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C6663aa.m4967a(context).m4977b(strReplace, str2);
        C6674al.m5104b(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C6674al.m5107d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C6674al.m5107d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C6674al.m5107d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        if (c6663aaM4967a.m5002w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C6663aa.m4967a(context).m4974a(str, str2);
            C6674al.m5106c("replace KV %s %s", str, str2);
            return;
        }
        if (c6663aaM4967a.m5001v() >= 50) {
            C6674al.m5107d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C6674al.m5107d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C6663aa.m4967a(context).m4974a(str, str2);
        C6674al.m5104b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not remove user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C6674al.f5867b, "removeUserData args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C6678ap.m5165b(str)) {
            return null;
        }
        C6674al.m5104b("[param] remove user data: %s", str);
        return C6663aa.m4967a(context).m4985f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z9, boolean z10) {
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        c6663aaM4967a.f5736Q = z9;
        c6663aaM4967a.f5737R = z10;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6674al.f5867b, "App channel is null, will not set");
            return;
        }
        C6663aa.m4967a(context).f5787s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6674al.f5867b, "App package is null, will not set");
            return;
        }
        C6663aa.m4967a(context).f5771c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6674al.f5867b, "App version is null, will not set");
            return;
        }
        C6663aa.m4967a(context).f5783o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C6674al.f5867b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C6733x.f6285a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z9) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C6674al.f5867b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C6674al.f5867b, "setCollectPrivacyInfo: ".concat(String.valueOf(z9)));
            C6663aa.m4967a(context).f5782n = z9;
        }
    }

    public static void setContext(Context context) {
        f5587a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6674al.f5867b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6682at.f5947q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6674al.f5867b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6682at.f5948r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6663aa.m4967a(context).m4973a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6663aa.m4967a(context).m4976b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C6674al.f5867b, "tombstone path is null, will not set");
        } else {
            Log.i(C6674al.f5867b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z9) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6674al.f5867b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z9)));
            NativeCrashHandler.setShouldHandleInJava(z9);
        }
    }

    public static void setHttpProxy(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            C6676an.f5871a = null;
        } else {
            C6676an.f5871a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i9));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z9) {
        C6674al.m5102a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z9) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C6674al.m5107d("Context should not be null.", new Object[0]);
            return;
        }
        if (z9) {
            C6674al.m5106c("This is a development device.", new Object[0]);
        } else {
            C6674al.m5106c("This is not a development device.", new Object[0]);
        }
        C6663aa.m4967a(context).f5728I = z9;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z9) {
        return setJavascriptMonitor(webView, z9, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C6678ap.m5165b(str) || C6678ap.m5165b(str2)) {
            return;
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c6663aaM4967a.f5739T) {
            c6663aaM4967a.f5730K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C6678ap.m5165b(str) || !C6678ap.m5173d(str)) {
            Log.i(C6674al.f5867b, "URL is invalid.");
            return;
        }
        C6665ac.m5033a(str);
        StrategyBean.f5612a = str;
        StrategyBean.f5613b = str;
    }

    public static void setSessionIntervalMills(long j9) {
        if (C6725p.f6211a) {
            C6728s.m5436a(j9);
        } else {
            Log.w(C6674al.f5867b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f5587a, str);
        } else {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i9) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6674al.f5867b, "setTag args context should not be null");
            return;
        }
        if (i9 <= 0) {
            C6674al.m5107d("setTag args tagId should > 0", new Object[0]);
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        synchronized (c6663aaM4967a.f5740U) {
            try {
                int i10 = c6663aaM4967a.f5791w;
                if (i10 != i9) {
                    c6663aaM4967a.f5791w = i9;
                    C6674al.m5102a("user scene tag %d changed to tag %d", Integer.valueOf(i10), Integer.valueOf(c6663aaM4967a.f5791w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6674al.m5104b("[param] set user scene tag: %d", Integer.valueOf(i9));
    }

    public static void startCrashReport() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6682at.m5225a().m5232b();
        } else {
            Log.w(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6674al.m5102a("start to create a anr crash for test!", new Object[0]);
            C6682at.m5225a().m5238h();
        }
    }

    public static void testJavaCrash() {
        int i9;
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C6663aa c6663aaM4969b = C6663aa.m4969b();
        if (c6663aaM4969b != null && (i9 = c6663aaM4969b.f5792x) != 24096) {
            c6663aaM4969b.f5792x = 24096;
            C6674al.m5102a("server scene tag %d changed to tag %d", Integer.valueOf(i9), Integer.valueOf(c6663aaM4969b.f5792x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not upload user info because bugly is disable.");
            return;
        }
        C6727r c6727r = C6728s.f6232b;
        if (c6727r == null) {
            Log.w(C6674al.f5867b, "Can not upload user info because bugly is not init.");
        } else {
            c6727r.m5433b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z9, boolean z10) {
        if (webView == null) {
            Log.w(C6674al.f5867b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new InterfaceC6651a() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6651a
            /* renamed from: a */
            public final String mo4936a() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6651a
            /* renamed from: b */
            public final void mo4939b() {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6651a
            /* renamed from: c */
            public final CharSequence mo4940c() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6651a
            /* renamed from: a */
            public final void mo4938a(String str) {
                webView.loadUrl(str);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6651a
            /* renamed from: a */
            public final void mo4937a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z9, z10);
    }

    public static void testNativeCrash(boolean z9, boolean z10, boolean z11) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6674al.m5102a("start to create a native crash for test!", new Object[0]);
            C6682at.m5225a().m5231a(z9, z10, z11);
        }
    }

    public static void postCatchedException(final Throwable th, final Thread thread, final boolean z9) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6674al.f5867b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C6674al.m5107d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final C6682at c6682atM5225a = C6682at.m5225a();
        c6682atM5225a.f5957w.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a */
            final /* synthetic */ boolean f5963a = false;

            /* renamed from: d */
            final /* synthetic */ String f5966d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f5967e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f5968f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6674al.m5106c("post a throwable %b", Boolean.valueOf(this.f5963a));
                    C6682at.this.f5954t.m5256a(thread, th, false, this.f5966d, this.f5967e, this.f5968f);
                    if (z9) {
                        C6674al.m5102a("clear user datas", new Object[0]);
                        C6663aa.m4967a(C6682at.this.f5952c).m5000u();
                    }
                } catch (Throwable th2) {
                    if (!C6674al.m5105b(th2)) {
                        th2.printStackTrace();
                    }
                    C6674al.m5108e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f5587a = context;
        C6725p.m5412a(CrashModule.getInstance());
        C6725p.m5410a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i9) {
        if (inetAddress == null) {
            C6676an.f5871a = null;
        } else {
            C6676an.f5871a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i9));
        }
    }

    public static void postException(int i9, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i9, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6674al.f5867b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C6674al.m5107d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C6674al.m5107d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C6663aa.m4967a(context).m4984f())) {
            return;
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        synchronized (c6663aaM4967a.f5741V) {
            c6663aaM4967a.f5780l = str;
        }
        C6674al.m5104b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C6728s.m5435a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C6674al.m5107d("Context should not be null.", new Object[0]);
            return null;
        }
        return C6663aa.m4967a(context).f5730K;
    }

    public static void initCrashReport(Context context, String str, boolean z9) {
        initCrashReport(context, str, z9, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC6651a interfaceC6651a, boolean z9) {
        return setJavascriptMonitor(interfaceC6651a, z9, false);
    }

    public static void initCrashReport(Context context, String str, boolean z9, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f5587a = context;
        C6725p.m5412a(CrashModule.getInstance());
        C6725p.m5411a(context, str, z9, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC6651a interfaceC6651a, boolean z9, boolean z10) {
        if (interfaceC6651a == null) {
            Log.w(C6674al.f5867b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C6674al.m5108e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C6674al.m5102a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C6725p.f6211a) {
            Log.w(C6674al.f5867b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C6674al.m5106c("URL of webview is %s", interfaceC6651a.mo4936a());
        C6674al.m5102a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC6651a.mo4939b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC6651a);
        if (h5JavaScriptInterface != null) {
            C6674al.m5102a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC6651a.mo4937a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z9) {
            return true;
        }
        C6674al.m5102a("Inject bugly.js(v%s) to the webview.", C6692bc.m5284b());
        String strM5283a = C6692bc.m5283a();
        if (strM5283a == null) {
            C6674al.m5108e("Failed to inject Bugly.js.", C6692bc.m5284b());
            return false;
        }
        interfaceC6651a.mo4938a("javascript:".concat(strM5283a));
        return true;
    }
}
