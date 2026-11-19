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
import com.tencent.bugly.crashreport.crash.p053h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C6403aa;
import com.tencent.bugly.proguard.C6405ac;
import com.tencent.bugly.proguard.C6413ak;
import com.tencent.bugly.proguard.C6414al;
import com.tencent.bugly.proguard.C6416an;
import com.tencent.bugly.proguard.C6418ap;
import com.tencent.bugly.proguard.C6419aq;
import com.tencent.bugly.proguard.C6422at;
import com.tencent.bugly.proguard.C6423au;
import com.tencent.bugly.proguard.C6432bc;
import com.tencent.bugly.proguard.C6465p;
import com.tencent.bugly.proguard.C6467r;
import com.tencent.bugly.proguard.C6468s;
import com.tencent.bugly.proguard.C6472w;
import com.tencent.bugly.proguard.C6473x;
import com.tencent.bugly.proguard.C6474y;
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
    private static Context f5010a;

    public static class CrashHandleCallback extends BuglyStrategy.C6388a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f5012c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f4983a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f4984b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i10) {
            this.f4983a = i10;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z9) {
            this.f4984b = z9;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f5012c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f5012c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC6391a {
        /* renamed from: a */
        String mo4757a();

        /* renamed from: a */
        void mo4758a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo4759a(String str);

        /* renamed from: b */
        void mo4760b();

        /* renamed from: c */
        CharSequence mo4761c();
    }

    public static void closeBugly() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f5010a == null) {
            return;
        }
        C6419aq c6419aqM4996a = C6419aq.m4996a();
        if (c6419aqM4996a != null) {
            c6419aqM4996a.m5002b(f5010a);
        }
        closeCrashReport();
        C6468s.m5258a(f5010a);
        C6413ak c6413akM4914a = C6413ak.m4914a();
        if (c6413akM4914a != null) {
            c6413akM4914a.m4918b();
        }
    }

    public static void closeCrashReport() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6422at.m5046a().m5054c();
        } else {
            Log.w(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6422at.m5046a().m5055d();
        } else {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z9) {
        C6465p.f5634a = z9;
    }

    public static void enableObtainId(Context context, boolean z9) {
        setCollectPrivacyInfo(context, z9);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C6403aa.m4788a(context).m4823w();
        }
        Log.e(C6414al.f5290b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get App channel because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6403aa.m4788a(f5010a).f5210s;
        }
        Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppID() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get App ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6403aa.m4788a(f5010a).m4803e();
        }
        Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getAppVer() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get app version because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6403aa.m4788a(f5010a).f5206o;
        }
        Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C6403aa.m4788a(context).f5199h;
        }
        C6414al.m4928d("Please call with context.", new Object[0]);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static Context getContext() {
        return f5010a;
    }

    public static String getDeviceID(Context context) {
        return C6403aa.m4788a(context).m4807g();
    }

    public static Proxy getHttpProxy() {
        return C6416an.f5294a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6403aa.m4788a(f5010a).f5153K;
        }
        Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C6414al.f5290b, "getUserDataValue args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C6418ap.m4986b(str)) {
            return null;
        }
        return C6403aa.m4788a(context).m4808g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6403aa.m4788a(context).m4822v();
        }
        Log.e(C6414al.f5290b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get user ID because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C6403aa.m4788a(f5010a).m4805f();
        }
        Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static int getUserSceneTagId(Context context) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C6403aa.m4788a(context).m4826z();
        }
        Log.e(C6414al.f5290b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f5010a = context;
        C6465p.m5233a(CrashModule.getInstance());
        C6465p.m5230a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C6422at c6422atM5046a = C6422at.m5046a();
        Boolean bool = c6422atM5046a.f5372A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C6403aa.m4790b().f5195d;
        List<C6474y> listM5313a = C6472w.m5296a().m5313a(1);
        ArrayList arrayList = new ArrayList();
        if (listM5313a == null || listM5313a.size() <= 0) {
            c6422atM5046a.f5372A = Boolean.FALSE;
            return false;
        }
        for (C6474y c6474y : listM5313a) {
            if (str.equals(c6474y.f5714c)) {
                c6422atM5046a.f5372A = Boolean.TRUE;
                arrayList.add(c6474y);
            }
        }
        if (arrayList.size() > 0) {
            C6472w.m5296a().m5315a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6423au.m5067a(thread, i10, str, str2, str3, map);
        } else {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C6418ap.m4986b(str) || C6418ap.m4986b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C6414al.f5290b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C6414al.f5290b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C6403aa.m4788a(context).m4798b(strReplace, str2);
        C6414al.m4925b(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C6414al.m4928d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C6414al.m4928d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C6414al.m4928d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        if (c6403aaM4788a.m4823w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C6403aa.m4788a(context).m4795a(str, str2);
            C6414al.m4927c("replace KV %s %s", str, str2);
            return;
        }
        if (c6403aaM4788a.m4822v() >= 50) {
            C6414al.m4928d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C6414al.m4928d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C6403aa.m4788a(context).m4795a(str, str2);
        C6414al.m4925b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not remove user data because bugly is disable.");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (context == null) {
            Log.e(C6414al.f5290b, "removeUserData args context should not be null");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (C6418ap.m4986b(str)) {
            return null;
        }
        C6414al.m4925b("[param] remove user data: %s", str);
        return C6403aa.m4788a(context).m4806f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z9, boolean z10) {
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        c6403aaM4788a.f5159Q = z9;
        c6403aaM4788a.f5160R = z10;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6414al.f5290b, "App channel is null, will not set");
            return;
        }
        C6403aa.m4788a(context).f5210s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6414al.f5290b, "App package is null, will not set");
            return;
        }
        C6403aa.m4788a(context).f5194c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C6414al.f5290b, "App version is null, will not set");
            return;
        }
        C6403aa.m4788a(context).f5206o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C6414al.f5290b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C6473x.f5708a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z9) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C6414al.f5290b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C6414al.f5290b, "setCollectPrivacyInfo: ".concat(String.valueOf(z9)));
            C6403aa.m4788a(context).f5205n = z9;
        }
    }

    public static void setContext(Context context) {
        f5010a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6414al.f5290b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6422at.f5370q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6414al.f5290b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C6422at.f5371r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6403aa.m4788a(context).m4794a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C6403aa.m4788a(context).m4797b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C6414al.f5290b, "tombstone path is null, will not set");
        } else {
            Log.i(C6414al.f5290b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z9) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C6414al.f5290b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z9)));
            NativeCrashHandler.setShouldHandleInJava(z9);
        }
    }

    public static void setHttpProxy(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            C6416an.f5294a = null;
        } else {
            C6416an.f5294a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z9) {
        C6414al.m4923a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z9) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C6414al.m4928d("Context should not be null.", new Object[0]);
            return;
        }
        if (z9) {
            C6414al.m4927c("This is a development device.", new Object[0]);
        } else {
            C6414al.m4927c("This is not a development device.", new Object[0]);
        }
        C6403aa.m4788a(context).f5151I = z9;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z9) {
        return setJavascriptMonitor(webView, z9, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C6418ap.m4986b(str) || C6418ap.m4986b(str2)) {
            return;
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c6403aaM4788a.f5162T) {
            c6403aaM4788a.f5153K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C6418ap.m4986b(str) || !C6418ap.m4994d(str)) {
            Log.i(C6414al.f5290b, "URL is invalid.");
            return;
        }
        C6405ac.m4854a(str);
        StrategyBean.f5035a = str;
        StrategyBean.f5036b = str;
    }

    public static void setSessionIntervalMills(long j10) {
        if (C6465p.f5634a) {
            C6468s.m5257a(j10);
        } else {
            Log.w(C6414al.f5290b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f5010a, str);
        } else {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i10) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6414al.f5290b, "setTag args context should not be null");
            return;
        }
        if (i10 <= 0) {
            C6414al.m4928d("setTag args tagId should > 0", new Object[0]);
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        synchronized (c6403aaM4788a.f5163U) {
            try {
                int i11 = c6403aaM4788a.f5214w;
                if (i11 != i10) {
                    c6403aaM4788a.f5214w = i10;
                    C6414al.m4923a("user scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(c6403aaM4788a.f5214w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6414al.m4925b("[param] set user scene tag: %d", Integer.valueOf(i10));
    }

    public static void startCrashReport() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C6422at.m5046a().m5053b();
        } else {
            Log.w(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6414al.m4923a("start to create a anr crash for test!", new Object[0]);
            C6422at.m5046a().m5059h();
        }
    }

    public static void testJavaCrash() {
        int i10;
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C6403aa c6403aaM4790b = C6403aa.m4790b();
        if (c6403aaM4790b != null && (i10 = c6403aaM4790b.f5215x) != 24096) {
            c6403aaM4790b.f5215x = 24096;
            C6414al.m4923a("server scene tag %d changed to tag %d", Integer.valueOf(i10), Integer.valueOf(c6403aaM4790b.f5215x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not upload user info because bugly is disable.");
            return;
        }
        C6467r c6467r = C6468s.f5655b;
        if (c6467r == null) {
            Log.w(C6414al.f5290b, "Can not upload user info because bugly is not init.");
        } else {
            c6467r.m5254b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z9, boolean z10) {
        if (webView == null) {
            Log.w(C6414al.f5290b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new InterfaceC6391a() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6391a
            /* renamed from: a */
            public final String mo4757a() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6391a
            /* renamed from: b */
            public final void mo4760b() {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6391a
            /* renamed from: c */
            public final CharSequence mo4761c() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6391a
            /* renamed from: a */
            public final void mo4759a(String str) {
                webView.loadUrl(str);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC6391a
            /* renamed from: a */
            public final void mo4758a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z9, z10);
    }

    public static void testNativeCrash(boolean z9, boolean z10, boolean z11) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C6414al.m4923a("start to create a native crash for test!", new Object[0]);
            C6422at.m5046a().m5052a(z9, z10, z11);
        }
    }

    public static void postCatchedException(final Throwable th, final Thread thread, final boolean z9) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C6414al.f5290b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C6414al.m4928d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final C6422at c6422atM5046a = C6422at.m5046a();
        c6422atM5046a.f5380w.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a */
            final /* synthetic */ boolean f5386a = false;

            /* renamed from: d */
            final /* synthetic */ String f5389d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f5390e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f5391f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6414al.m4927c("post a throwable %b", Boolean.valueOf(this.f5386a));
                    C6422at.this.f5377t.m5077a(thread, th, false, this.f5389d, this.f5390e, this.f5391f);
                    if (z9) {
                        C6414al.m4923a("clear user datas", new Object[0]);
                        C6403aa.m4788a(C6422at.this.f5375c).m4821u();
                    }
                } catch (Throwable th2) {
                    if (!C6414al.m4926b(th2)) {
                        th2.printStackTrace();
                    }
                    C6414al.m4929e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f5010a = context;
        C6465p.m5233a(CrashModule.getInstance());
        C6465p.m5231a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i10) {
        if (inetAddress == null) {
            C6416an.f5294a = null;
        } else {
            C6416an.f5294a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i10));
        }
    }

    public static void postException(int i10, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i10, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C6414al.f5290b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C6414al.m4928d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C6414al.m4928d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C6403aa.m4788a(context).m4805f())) {
            return;
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        synchronized (c6403aaM4788a.f5164V) {
            c6403aaM4788a.f5203l = str;
        }
        C6414al.m4925b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C6468s.m5256a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C6414al.m4928d("Context should not be null.", new Object[0]);
            return null;
        }
        return C6403aa.m4788a(context).f5153K;
    }

    public static void initCrashReport(Context context, String str, boolean z9) {
        initCrashReport(context, str, z9, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC6391a interfaceC6391a, boolean z9) {
        return setJavascriptMonitor(interfaceC6391a, z9, false);
    }

    public static void initCrashReport(Context context, String str, boolean z9, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f5010a = context;
        C6465p.m5233a(CrashModule.getInstance());
        C6465p.m5232a(context, str, z9, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC6391a interfaceC6391a, boolean z9, boolean z10) {
        if (interfaceC6391a == null) {
            Log.w(C6414al.f5290b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C6414al.m4929e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C6414al.m4923a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C6465p.f5634a) {
            Log.w(C6414al.f5290b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C6414al.m4927c("URL of webview is %s", interfaceC6391a.mo4757a());
        C6414al.m4923a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC6391a.mo4760b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC6391a);
        if (h5JavaScriptInterface != null) {
            C6414al.m4923a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC6391a.mo4758a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z9) {
            return true;
        }
        C6414al.m4923a("Inject bugly.js(v%s) to the webview.", C6432bc.m5105b());
        String strM5104a = C6432bc.m5104a();
        if (strM5104a == null) {
            C6414al.m4929e("Failed to inject Bugly.js.", C6432bc.m5105b());
            return false;
        }
        interfaceC6391a.mo4759a("javascript:".concat(strM5104a));
        return true;
    }
}
