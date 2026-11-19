package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.p044h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C6425aa;
import com.tencent.bugly.proguard.C6427ac;
import com.tencent.bugly.proguard.C6435ak;
import com.tencent.bugly.proguard.C6436al;
import com.tencent.bugly.proguard.C6438an;
import com.tencent.bugly.proguard.C6440ap;
import com.tencent.bugly.proguard.C6441aq;
import com.tencent.bugly.proguard.C6444at;
import com.tencent.bugly.proguard.C6445au;
import com.tencent.bugly.proguard.C6454bc;
import com.tencent.bugly.proguard.C6487p;
import com.tencent.bugly.proguard.C6489r;
import com.tencent.bugly.proguard.C6490s;
import com.tencent.bugly.proguard.C6494w;
import com.tencent.bugly.proguard.C6495x;
import com.tencent.bugly.proguard.C6496y;
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
    private static Context f4353a;

    public static class CrashHandleCallback extends BuglyStrategy.C6410a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f4355c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f4326a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f4327b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i10) {
            this.f4326a = i10;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z10) {
            this.f4327b = z10;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f4355c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f4355c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC6413a {
        /* renamed from: a */
        String mo4117a();

        /* renamed from: a */
        void mo4118a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo4119a(String str);

        /* renamed from: b */
        void mo4120b();

        /* renamed from: c */
        CharSequence mo4121c();
    }

    public static void closeBugly() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f4353a == null) {
            return;
        }
        C6441aq c6441aqM4356a = C6441aq.m4356a();
        if (c6441aqM4356a != null) {
            c6441aqM4356a.m4362b(f4353a);
        }
        closeCrashReport();
        C6490s.m4618a(f4353a);
        C6435ak c6435akM4274a = C6435ak.m4274a();
        if (c6435akM4274a != null) {
            c6435akM4274a.m4278b();
        }
    }

    public static void closeCrashReport() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6444at.m4406a().m4414c();
        } else {
            Log.w(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6444at.m4406a().m4415d();
        } else {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z10) {
        C6487p.f4977a = z10;
    }

    public static void enableObtainId(Context context, boolean z10) {
        setCollectPrivacyInfo(context, z10);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C6425aa.m4148a(context).m4183w();
        }
        Log.e(C6436al.f4633b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get App channel because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6425aa.m4148a(f4353a).f4553s;
        }
        Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppID() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get App ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6425aa.m4148a(f4353a).m4163e();
        }
        Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppVer() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get app version because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6425aa.m4148a(f4353a).f4549o;
        }
        Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C6425aa.m4148a(context).f4542h;
        }
        C6436al.m4288d("Please call with context.", new Object[0]);
        return "unknown";
    }

    public static Context getContext() {
        return f4353a;
    }

    public static String getDeviceID(Context context) {
        return C6425aa.m4148a(context).m4167g();
    }

    public static Proxy getHttpProxy() {
        return C6438an.f4637a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6425aa.m4148a(f4353a).f4496K;
        }
        Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C6436al.f4633b, "getUserDataValue args context should not be null");
            return "unknown";
        }
        if (C6440ap.m4346b(str)) {
            return null;
        }
        return C6425aa.m4148a(context).m4168g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6425aa.m4148a(context).m4182v();
        }
        Log.e(C6436al.f4633b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get user ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6425aa.m4148a(f4353a).m4165f();
        }
        Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static int getUserSceneTagId(Context context) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6425aa.m4148a(context).m4186z();
        }
        Log.e(C6436al.f4633b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f4353a = context;
        C6487p.m4593a(CrashModule.getInstance());
        C6487p.m4590a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C6444at c6444atM4406a = C6444at.m4406a();
        Boolean bool = c6444atM4406a.f4715A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C6425aa.m4150b().f4538d;
        List<C6496y> listM4673a = C6494w.m4656a().m4673a(1);
        ArrayList arrayList = new ArrayList();
        if (listM4673a == null || listM4673a.size() <= 0) {
            c6444atM4406a.f4715A = Boolean.FALSE;
            return false;
        }
        for (C6496y c6496y : listM4673a) {
            if (str.equals(c6496y.f5057c)) {
                c6444atM4406a.f4715A = Boolean.TRUE;
                arrayList.add(c6496y);
            }
        }
        if (arrayList.size() > 0) {
            C6494w.m4656a().m4675a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6445au.m4427a(thread, i10, str, str2, str3, map);
        } else {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C6440ap.m4346b(str) || C6440ap.m4346b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C6436al.f4633b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C6436al.f4633b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C6425aa.m4148a(context).m4158b(strReplace, str2);
        C6436al.m4285b(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C6436al.m4288d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C6436al.m4288d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C6436al.m4288d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        if (c6425aaM4148a.m4183w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C6425aa.m4148a(context).m4155a(str, str2);
            C6436al.m4287c("replace KV %s %s", str, str2);
            return;
        }
        if (c6425aaM4148a.m4182v() >= 50) {
            C6436al.m4288d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C6436al.m4288d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C6425aa.m4148a(context).m4155a(str, str2);
        C6436al.m4285b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not remove user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C6436al.f4633b, "removeUserData args context should not be null");
            return "unknown";
        }
        if (C6440ap.m4346b(str)) {
            return null;
        }
        C6436al.m4285b("[param] remove user data: %s", str);
        return C6425aa.m4148a(context).m4166f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z10, boolean z11) {
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        c6425aaM4148a.f4502Q = z10;
        c6425aaM4148a.f4503R = z11;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6436al.f4633b, "App channel is null, will not set");
            return;
        }
        C6425aa.m4148a(context).f4553s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6436al.f4633b, "App package is null, will not set");
            return;
        }
        C6425aa.m4148a(context).f4537c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6436al.f4633b, "App version is null, will not set");
            return;
        }
        C6425aa.m4148a(context).f4549o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C6436al.f4633b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C6495x.f5051a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z10) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C6436al.f4633b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C6436al.f4633b, "setCollectPrivacyInfo: ".concat(String.valueOf(z10)));
            C6425aa.m4148a(context).f4548n = z10;
        }
    }

    public static void setContext(Context context) {
        f4353a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6436al.f4633b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6444at.f4713q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6436al.f4633b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6444at.f4714r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6425aa.m4148a(context).m4154a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6425aa.m4148a(context).m4157b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C6436al.f4633b, "tombstone path is null, will not set");
        } else {
            Log.i(C6436al.f4633b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z10) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6436al.f4633b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z10)));
            NativeCrashHandler.setShouldHandleInJava(z10);
        }
    }

    public static void setHttpProxy(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            C6438an.f4637a = null;
        } else {
            C6438an.f4637a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z10) {
        C6436al.m4283a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z10) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C6436al.m4288d("Context should not be null.", new Object[0]);
            return;
        }
        if (z10) {
            C6436al.m4287c("This is a development device.", new Object[0]);
        } else {
            C6436al.m4287c("This is not a development device.", new Object[0]);
        }
        C6425aa.m4148a(context).f4494I = z10;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z10) {
        return setJavascriptMonitor(webView, z10, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C6440ap.m4346b(str) || C6440ap.m4346b(str2)) {
            return;
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c6425aaM4148a.f4505T) {
            c6425aaM4148a.f4496K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C6440ap.m4346b(str) || !C6440ap.m4354d(str)) {
            Log.i(C6436al.f4633b, "URL is invalid.");
            return;
        }
        C6427ac.m4214a(str);
        StrategyBean.f4378a = str;
        StrategyBean.f4379b = str;
    }

    public static void setSessionIntervalMills(long j10) {
        if (C6487p.f4977a) {
            C6490s.m4617a(j10);
        } else {
            Log.w(C6436al.f4633b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f4353a, str);
        } else {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i10) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6436al.f4633b, "setTag args context should not be null");
            return;
        }
        if (i10 <= 0) {
            C6436al.m4288d("setTag args tagId should > 0", new Object[0]);
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        synchronized (c6425aaM4148a.f4506U) {
            try {
                int i11 = c6425aaM4148a.f4557w;
                if (i11 != i10) {
                    c6425aaM4148a.f4557w = i10;
                    C6436al.m4283a("user scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(c6425aaM4148a.f4557w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6436al.m4285b("[param] set user scene tag: %d", Integer.valueOf(i10));
    }

    public static void startCrashReport() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6444at.m4406a().m4413b();
        } else {
            Log.w(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6436al.m4283a("start to create a anr crash for test!", new Object[0]);
            C6444at.m4406a().m4419h();
        }
    }

    public static void testJavaCrash() {
        int i10;
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C6425aa c6425aaM4150b = C6425aa.m4150b();
        if (c6425aaM4150b != null && (i10 = c6425aaM4150b.f4558x) != 24096) {
            c6425aaM4150b.f4558x = 24096;
            C6436al.m4283a("server scene tag %d changed to tag %d", Integer.valueOf(i10), Integer.valueOf(c6425aaM4150b.f4558x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not upload user info because bugly is disable.");
            return;
        }
        C6489r c6489r = C6490s.f4998b;
        if (c6489r == null) {
            Log.w(C6436al.f4633b, "Can not upload user info because bugly is not init.");
        } else {
            c6489r.m4614b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z10, boolean z11) {
        if (webView == null) {
            Log.w(C6436al.f4633b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new InterfaceC6413a() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6413a
            /* renamed from: a */
            public final String mo4117a() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6413a
            /* renamed from: b */
            public final void mo4120b() {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6413a
            /* renamed from: c */
            public final CharSequence mo4121c() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6413a
            /* renamed from: a */
            public final void mo4119a(String str) {
                webView.loadUrl(str);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6413a
            /* renamed from: a */
            public final void mo4118a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z10, z11);
    }

    public static void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6436al.m4283a("start to create a native crash for test!", new Object[0]);
            C6444at.m4406a().m4412a(z10, z11, z12);
        }
    }

    public static void postCatchedException(final Throwable th, final Thread thread, final boolean z10) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6436al.f4633b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C6436al.m4288d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final C6444at c6444atM4406a = C6444at.m4406a();
        c6444atM4406a.f4723w.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a */
            final /* synthetic */ boolean f4729a = false;

            /* renamed from: d */
            final /* synthetic */ String f4732d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f4733e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f4734f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6436al.m4287c("post a throwable %b", Boolean.valueOf(this.f4729a));
                    C6444at.this.f4720t.m4437a(thread, th, false, this.f4732d, this.f4733e, this.f4734f);
                    if (z10) {
                        C6436al.m4283a("clear user datas", new Object[0]);
                        C6425aa.m4148a(C6444at.this.f4718c).m4181u();
                    }
                } catch (Throwable th2) {
                    if (!C6436al.m4286b(th2)) {
                        th2.printStackTrace();
                    }
                    C6436al.m4289e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f4353a = context;
        C6487p.m4593a(CrashModule.getInstance());
        C6487p.m4591a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i10) {
        if (inetAddress == null) {
            C6438an.f4637a = null;
        } else {
            C6438an.f4637a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i10));
        }
    }

    public static void postException(int i10, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i10, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6436al.f4633b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C6436al.m4288d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C6436al.m4288d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C6425aa.m4148a(context).m4165f())) {
            return;
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        synchronized (c6425aaM4148a.f4507V) {
            c6425aaM4148a.f4546l = str;
        }
        C6436al.m4285b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C6490s.m4616a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C6436al.m4288d("Context should not be null.", new Object[0]);
            return null;
        }
        return C6425aa.m4148a(context).f4496K;
    }

    public static void initCrashReport(Context context, String str, boolean z10) {
        initCrashReport(context, str, z10, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC6413a interfaceC6413a, boolean z10) {
        return setJavascriptMonitor(interfaceC6413a, z10, false);
    }

    public static void initCrashReport(Context context, String str, boolean z10, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f4353a = context;
        C6487p.m4593a(CrashModule.getInstance());
        C6487p.m4592a(context, str, z10, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC6413a interfaceC6413a, boolean z10, boolean z11) {
        if (interfaceC6413a == null) {
            Log.w(C6436al.f4633b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C6436al.m4289e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C6436al.m4283a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C6487p.f4977a) {
            Log.w(C6436al.f4633b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C6436al.m4287c("URL of webview is %s", interfaceC6413a.mo4117a());
        C6436al.m4283a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC6413a.mo4120b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC6413a);
        if (h5JavaScriptInterface != null) {
            C6436al.m4283a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC6413a.mo4118a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z10) {
            return true;
        }
        C6436al.m4283a("Inject bugly.js(v%s) to the webview.", C6454bc.m4465b());
        String strM4464a = C6454bc.m4464a();
        if (strM4464a == null) {
            C6436al.m4289e("Failed to inject Bugly.js.", C6454bc.m4465b());
            return false;
        }
        interfaceC6413a.mo4119a("javascript:".concat(strM4464a));
        return true;
    }
}
