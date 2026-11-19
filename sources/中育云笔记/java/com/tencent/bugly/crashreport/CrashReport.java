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
import com.tencent.bugly.crashreport.crash.p100h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C7768aa;
import com.tencent.bugly.proguard.C7770ac;
import com.tencent.bugly.proguard.C7778ak;
import com.tencent.bugly.proguard.C7779al;
import com.tencent.bugly.proguard.C7781an;
import com.tencent.bugly.proguard.C7783ap;
import com.tencent.bugly.proguard.C7784aq;
import com.tencent.bugly.proguard.C7787at;
import com.tencent.bugly.proguard.C7788au;
import com.tencent.bugly.proguard.C7797bc;
import com.tencent.bugly.proguard.C7830p;
import com.tencent.bugly.proguard.C7832r;
import com.tencent.bugly.proguard.C7833s;
import com.tencent.bugly.proguard.C7837w;
import com.tencent.bugly.proguard.C7838x;
import com.tencent.bugly.proguard.C7839y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class CrashReport {

    /* renamed from: a */
    private static Context f13452a;

    public static class CrashHandleCallback extends BuglyStrategy.C7753a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c */
        CrashHandleCallback f13453c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f13425a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f13426b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i10) {
            this.f13425a = i10;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z10) {
            this.f13426b = z10;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f13453c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f13453c;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$a */
    public interface InterfaceC7755a {
        /* renamed from: a */
        String mo10447a();

        /* renamed from: a */
        void mo10448a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        /* renamed from: a */
        void mo10449a(String str);

        /* renamed from: b */
        void mo10450b();

        /* renamed from: c */
        CharSequence mo10451c();
    }

    /* renamed from: com.tencent.bugly.crashreport.CrashReport$b */
    public static class C7756b implements InterfaceC7755a {

        /* renamed from: a */
        public final /* synthetic */ WebView f13454a;

        public C7756b(WebView webView) {
            this.f13454a = webView;
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC7755a
        /* renamed from: a */
        public final String mo10447a() {
            return this.f13454a.getUrl();
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC7755a
        /* renamed from: b */
        public final void mo10450b() {
            WebSettings settings = this.f13454a.getSettings();
            if (settings.getJavaScriptEnabled()) {
                return;
            }
            settings.setJavaScriptEnabled(true);
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC7755a
        /* renamed from: c */
        public final CharSequence mo10451c() {
            return this.f13454a.getContentDescription();
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC7755a
        /* renamed from: a */
        public final void mo10449a(String str) {
            this.f13454a.loadUrl(str);
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC7755a
        /* renamed from: a */
        public final void mo10448a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
            this.f13454a.addJavascriptInterface(h5JavaScriptInterface, str);
        }
    }

    public static void closeBugly() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f13452a == null) {
            return;
        }
        C7784aq c7784aqM10686a = C7784aq.m10686a();
        if (c7784aqM10686a != null) {
            c7784aqM10686a.m10692b(f13452a);
        }
        closeCrashReport();
        C7833s.m10948a(f13452a);
        C7778ak c7778akM10604a = C7778ak.m10604a();
        if (c7778akM10604a != null) {
            c7778akM10604a.m10608b();
        }
    }

    public static void closeCrashReport() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C7787at.m10736a().m10744c();
        } else {
            Log.w(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C7787at.m10736a().m10745d();
        } else {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z10) {
        C7830p.f14076a = z10;
    }

    public static void enableObtainId(Context context, boolean z10) {
        setCollectPrivacyInfo(context, z10);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return C7768aa.m10478a(context).m10513w();
        }
        Log.e(C7779al.f13732b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get App channel because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C7768aa.m10478a(f13452a).f13652s;
        }
        Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppID() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get App ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C7768aa.m10478a(f13452a).m10493e();
        }
        Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppVer() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get app version because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C7768aa.m10478a(f13452a).f13648o;
        }
        Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C7768aa.m10478a(context).f13641h;
        }
        C7779al.m10618d("Please call with context.", new Object[0]);
        return "unknown";
    }

    public static Context getContext() {
        return f13452a;
    }

    public static String getDeviceID(Context context) {
        return C7768aa.m10478a(context).m10497g();
    }

    public static Proxy getHttpProxy() {
        return C7781an.f13736a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C7768aa.m10478a(f13452a).f13595K;
        }
        Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C7779al.f13732b, "getUserDataValue args context should not be null");
            return "unknown";
        }
        if (C7783ap.m10676b(str)) {
            return null;
        }
        return C7768aa.m10478a(context).m10498g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C7768aa.m10478a(context).m10512v();
        }
        Log.e(C7779al.f13732b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get user ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return C7768aa.m10478a(f13452a).m10495f();
        }
        Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static int getUserSceneTagId(Context context) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C7768aa.m10478a(context).m10516z();
        }
        Log.e(C7779al.f13732b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f13452a = context;
        C7830p.m10923a(CrashModule.getInstance());
        C7830p.m10920a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        C7787at c7787atM10736a = C7787at.m10736a();
        Boolean bool = c7787atM10736a.f13814A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C7768aa.m10480b().f13637d;
        List<C7839y> listM11003a = C7837w.m10986a().m11003a(1);
        ArrayList arrayList = new ArrayList();
        if (listM11003a == null || listM11003a.size() <= 0) {
            c7787atM10736a.f13814A = Boolean.FALSE;
            return false;
        }
        for (C7839y c7839y : listM11003a) {
            if (str.equals(c7839y.f14156c)) {
                c7787atM10736a.f13814A = Boolean.TRUE;
                arrayList.add(c7839y);
            }
        }
        if (arrayList.size() > 0) {
            C7837w.m10986a().m11005a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C7788au.m10757a(thread, i10, str, str2, str3, map);
        } else {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || C7783ap.m10676b(str) || C7783ap.m10676b(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C7779al.f13732b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C7779al.f13732b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C7768aa.m10478a(context).m10488b(strReplace, str2);
        C7779al.m10615b(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C7779al.f13732b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C7779al.m10618d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C7779al.m10618d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C7779al.m10618d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C7768aa c7768aaM10478a = C7768aa.m10478a(context);
        if (c7768aaM10478a.m10513w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C7768aa.m10478a(context).m10485a(str, str2);
            C7779al.m10617c("replace KV %s %s", str, str2);
            return;
        }
        if (c7768aaM10478a.m10512v() >= 50) {
            C7779al.m10618d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C7779al.m10618d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C7768aa.m10478a(context).m10485a(str, str2);
        C7779al.m10615b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not remove user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C7779al.f13732b, "removeUserData args context should not be null");
            return "unknown";
        }
        if (C7783ap.m10676b(str)) {
            return null;
        }
        C7779al.m10615b("[param] remove user data: %s", str);
        return C7768aa.m10478a(context).m10496f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z10, boolean z11) {
        C7768aa c7768aaM10478a = C7768aa.m10478a(context);
        c7768aaM10478a.f13601Q = z10;
        c7768aaM10478a.f13602R = z11;
    }

    public static void setAppChannel(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C7779al.f13732b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C7779al.f13732b, "App channel is null, will not set");
            return;
        }
        C7768aa.m10478a(context).f13652s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C7779al.f13732b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C7779al.f13732b, "App package is null, will not set");
            return;
        }
        C7768aa.m10478a(context).f13636c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C7779al.f13732b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C7779al.f13732b, "App version is null, will not set");
            return;
        }
        C7768aa.m10478a(context).f13648o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(C7779al.f13732b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            C7838x.f14150a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z10) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(C7779al.f13732b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(C7779al.f13732b, "setCollectPrivacyInfo: ".concat(String.valueOf(z10)));
            C7768aa.m10478a(context).f13647n = z10;
        }
    }

    public static void setContext(Context context) {
        f13452a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C7779al.f13732b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C7787at.f13812q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C7779al.f13732b, "Set crash stack filter: ".concat(String.valueOf(str)));
            C7787at.f13813r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C7768aa.m10478a(context).m10484a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C7768aa.m10478a(context).m10487b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C7779al.f13732b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C7779al.f13732b, "tombstone path is null, will not set");
        } else {
            Log.i(C7779al.f13732b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z10) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(C7779al.f13732b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z10)));
            NativeCrashHandler.setShouldHandleInJava(z10);
        }
    }

    public static void setHttpProxy(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            C7781an.f13736a = null;
        } else {
            C7781an.f13736a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z10) {
        C7779al.m10613a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z10) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C7779al.m10618d("Context should not be null.", new Object[0]);
            return;
        }
        if (z10) {
            C7779al.m10617c("This is a development device.", new Object[0]);
        } else {
            C7779al.m10617c("This is not a development device.", new Object[0]);
        }
        C7768aa.m10478a(context).f13593I = z10;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z10) {
        return setJavascriptMonitor(webView, z10, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || C7783ap.m10676b(str) || C7783ap.m10676b(str2)) {
            return;
        }
        C7768aa c7768aaM10478a = C7768aa.m10478a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (c7768aaM10478a.f13604T) {
            c7768aaM10478a.f13595K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C7783ap.m10676b(str) || !C7783ap.m10684d(str)) {
            Log.i(C7779al.f13732b, "URL is invalid.");
            return;
        }
        C7770ac.m10544a(str);
        StrategyBean.f13477a = str;
        StrategyBean.f13478b = str;
    }

    public static void setSessionIntervalMills(long j10) {
        if (C7830p.f14076a) {
            C7833s.m10947a(j10);
        } else {
            Log.w(C7779al.f13732b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f13452a, str);
        } else {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i10) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C7779al.f13732b, "setTag args context should not be null");
            return;
        }
        if (i10 <= 0) {
            C7779al.m10618d("setTag args tagId should > 0", new Object[0]);
        }
        C7768aa c7768aaM10478a = C7768aa.m10478a(context);
        synchronized (c7768aaM10478a.f13605U) {
            try {
                int i11 = c7768aaM10478a.f13656w;
                if (i11 != i10) {
                    c7768aaM10478a.f13656w = i10;
                    C7779al.m10613a("user scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(c7768aaM10478a.f13656w));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C7779al.m10615b("[param] set user scene tag: %d", Integer.valueOf(i10));
    }

    public static void startCrashReport() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            C7787at.m10736a().m10743b();
        } else {
            Log.w(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C7779al.m10613a("start to create a anr crash for test!", new Object[0]);
            C7787at.m10736a().m10749h();
        }
    }

    public static void testJavaCrash() {
        int i10;
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        C7768aa c7768aaM10480b = C7768aa.m10480b();
        if (c7768aaM10480b != null && (i10 = c7768aaM10480b.f13657x) != 24096) {
            c7768aaM10480b.f13657x = 24096;
            C7779al.m10613a("server scene tag %d changed to tag %d", Integer.valueOf(i10), Integer.valueOf(c7768aaM10480b.f13657x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not upload user info because bugly is disable.");
            return;
        }
        C7832r c7832r = C7833s.f14097b;
        if (c7832r == null) {
            Log.w(C7779al.f13732b, "Can not upload user info because bugly is not init.");
        } else {
            c7832r.m10944b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebView webView, boolean z10, boolean z11) {
        if (webView == null) {
            Log.w(C7779al.f13732b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new C7756b(webView), z10, z11);
    }

    public static void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C7779al.m10613a("start to create a native crash for test!", new Object[0]);
            C7787at.m10736a().m10742a(z10, z11, z12);
        }
    }

    public static void postCatchedException(final Throwable th, final Thread thread, final boolean z10) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(C7779al.f13732b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th == null) {
            C7779al.m10618d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final C7787at c7787atM10736a = C7787at.m10736a();
        c7787atM10736a.f13822w.m10606a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a */
            final /* synthetic */ boolean f13826a = false;

            /* renamed from: d */
            final /* synthetic */ String f13829d = null;

            /* renamed from: e */
            final /* synthetic */ byte[] f13830e = null;

            /* renamed from: f */
            final /* synthetic */ boolean f13831f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C7779al.m10617c("post a throwable %b", Boolean.valueOf(this.f13826a));
                    C7787at.this.f13819t.m10767a(thread, th, false, this.f13829d, this.f13830e, this.f13831f);
                    if (z10) {
                        C7779al.m10613a("clear user datas", new Object[0]);
                        C7768aa.m10478a(C7787at.this.f13817c).m10511u();
                    }
                } catch (Throwable th2) {
                    if (!C7779al.m10616b(th2)) {
                        th2.printStackTrace();
                    }
                    C7779al.m10619e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f13452a = context;
        C7830p.m10923a(CrashModule.getInstance());
        C7830p.m10921a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i10) {
        if (inetAddress == null) {
            C7781an.f13736a = null;
        } else {
            C7781an.f13736a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i10));
        }
    }

    public static void postException(int i10, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i10, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C7779al.f13732b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C7779al.m10618d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C7779al.m10618d("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C7768aa.m10478a(context).m10495f())) {
            return;
        }
        C7768aa c7768aaM10478a = C7768aa.m10478a(context);
        synchronized (c7768aaM10478a.f13606V) {
            c7768aaM10478a.f13645l = str;
        }
        C7779al.m10615b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            C7833s.m10946a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C7779al.m10618d("Context should not be null.", new Object[0]);
            return null;
        }
        return C7768aa.m10478a(context).f13595K;
    }

    public static void initCrashReport(Context context, String str, boolean z10) {
        initCrashReport(context, str, z10, null);
    }

    public static boolean setJavascriptMonitor(InterfaceC7755a interfaceC7755a, boolean z10) {
        return setJavascriptMonitor(interfaceC7755a, z10, false);
    }

    public static void initCrashReport(Context context, String str, boolean z10, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f13452a = context;
        C7830p.m10923a(CrashModule.getInstance());
        C7830p.m10922a(context, str, z10, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(InterfaceC7755a interfaceC7755a, boolean z10, boolean z11) {
        if (interfaceC7755a == null) {
            Log.w(C7779al.f13732b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            C7779al.m10619e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C7779al.m10613a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C7830p.f14076a) {
            Log.w(C7779al.f13732b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C7779al.m10617c("URL of webview is %s", interfaceC7755a.mo10447a());
        C7779al.m10613a("Enable the javascript needed by webview monitor.", new Object[0]);
        interfaceC7755a.mo10450b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(interfaceC7755a);
        if (h5JavaScriptInterface != null) {
            C7779al.m10613a("Add a secure javascript interface to the webview.", new Object[0]);
            interfaceC7755a.mo10448a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z10) {
            return true;
        }
        C7779al.m10613a("Inject bugly.js(v%s) to the webview.", C7797bc.m10795b());
        String strM10794a = C7797bc.m10794a();
        if (strM10794a == null) {
            C7779al.m10619e("Failed to inject Bugly.js.", C7797bc.m10795b());
            return false;
        }
        interfaceC7755a.mo10449a("javascript:".concat(strM10794a));
        return true;
    }
}
