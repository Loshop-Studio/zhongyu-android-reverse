package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C2026b;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;

/* renamed from: com.umeng.commonsdk.internal.utils.a */
/* loaded from: classes.dex */
public class C1970a {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a */
    public static class a {

        /* renamed from: a */
        public String f9212a;

        /* renamed from: b */
        public String f9213b;
    }

    /* renamed from: com.umeng.commonsdk.internal.utils.a$b */
    public static class b {

        /* renamed from: a */
        public int f9214a;

        /* renamed from: b */
        public String f9215b;

        /* renamed from: c */
        public String f9216c;

        /* renamed from: d */
        public int f9217d;

        /* renamed from: e */
        public int f9218e;

        /* renamed from: f */
        public int f9219f;

        /* renamed from: g */
        public int f9220g;

        /* renamed from: h */
        public String f9221h;

        /* renamed from: i */
        public int f9222i;

        /* renamed from: j */
        public int f9223j;

        /* renamed from: k */
        public int f9224k;

        /* renamed from: l */
        public long f9225l;
    }

    /* renamed from: a */
    public static long m7429a(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m7600e("getAppFirstInstallTime" + e4.getMessage());
            return 0L;
        }
    }

    /* renamed from: b */
    public static long m7431b(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m7600e("getAppLastUpdateTime:" + e4.getMessage());
            return 0L;
        }
    }

    /* renamed from: c */
    public static String m7435c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m7600e("getAppInstaller:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m7437d(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m7600e("getAppUid:" + e4.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public static void m7442e(Context context) {
        if (context == null) {
            return;
        }
        C1975f.m7476b(context);
    }

    /* renamed from: f */
    public static int m7443f(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI)) == null) {
            return -1;
        }
        return wifiManager.getWifiState();
    }

    /* renamed from: g */
    public static int m7444g(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    /* renamed from: h */
    public static int m7445h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    /* renamed from: i */
    public static DisplayMetrics m7446i(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* renamed from: j */
    public static List<InputMethodInfo> m7447j(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    /* renamed from: k */
    public static List<a> m7448k(Context context) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
                for (String str : list) {
                    if (str != null && !str.startsWith(".")) {
                        a aVar = new a();
                        aVar.f9212a = str;
                        aVar.f9213b = m7441e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception e4) {
            ULog.m7600e("getAppList:" + e4.getMessage());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static ActivityManager.MemoryInfo m7449l(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: m */
    public static String m7450m(Context context) {
        return null;
    }

    /* renamed from: n */
    public static String m7451n(Context context) {
        return null;
    }

    /* renamed from: e */
    private static String m7441e(Context context, String str) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return (String) applicationInfo.loadLabel(context.getPackageManager());
            }
            return null;
        } catch (Exception e4) {
            ULog.m7600e("getLabel:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static void m7436c(Context context) {
        WifiInfo wifiInfoM7432b;
        if (context == null || (wifiInfoM7432b = m7432b(context)) == null) {
            return;
        }
        b bVar = new b();
        bVar.f9214a = wifiInfoM7432b.describeContents();
        bVar.f9215b = wifiInfoM7432b.getBSSID();
        bVar.f9216c = wifiInfoM7432b.getSSID();
        bVar.f9217d = wifiInfoM7432b.getFrequency();
        boolean z3 = true;
        if (wifiInfoM7432b.getHiddenSSID()) {
            bVar.f9218e = 1;
        } else {
            bVar.f9218e = 0;
        }
        if (FieldManager.allow(C2026b.f9565H)) {
            bVar.f9219f = wifiInfoM7432b.getIpAddress();
        }
        bVar.f9220g = wifiInfoM7432b.getLinkSpeed();
        bVar.f9221h = DeviceConfig.getMac(context);
        bVar.f9222i = wifiInfoM7432b.getNetworkId();
        bVar.f9223j = wifiInfoM7432b.getRssi();
        bVar.f9224k = m7443f(context);
        bVar.f9225l = System.currentTimeMillis();
        try {
            JSONArray jSONArrayM7473a = C1975f.m7473a(context);
            if (jSONArrayM7473a == null || jSONArrayM7473a.length() <= 0) {
                z3 = false;
            } else {
                for (int i4 = 0; i4 < jSONArrayM7473a.length(); i4++) {
                    String strOptString = jSONArrayM7473a.optJSONObject(i4).optString("ssid", null);
                    if (strOptString != null && strOptString.equals(bVar.f9216c)) {
                        break;
                    }
                }
                z3 = false;
            }
            if (z3) {
                return;
            }
            C1975f.m7474a(context, bVar);
        } catch (Exception e4) {
            ULog.m7600e("wifiChange:" + e4.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m7430a() {
        return C1977h.m7483a();
    }

    /* renamed from: b */
    public static String m7433b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* renamed from: e */
    public static String m7440e() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String string = declaredMethod.invoke(null, "net.hostname").toString();
            return (string == null || string.equalsIgnoreCase("")) ? string : HelperUtils.getUmengMD5(string);
        } catch (Exception e4) {
            ULog.m7600e("getHostName:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static float m7428a(Context context) {
        if (context == null) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e4) {
            ULog.m7600e("getFontSize:" + e4.getMessage());
            return IGoodView.DEFAULT_TO_ALPHA;
        }
    }

    /* renamed from: d */
    public static JSONArray m7439d(Context context) {
        if (context == null) {
            return null;
        }
        return C1975f.m7473a(context);
    }

    /* renamed from: b */
    public static WifiInfo m7432b(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI)) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* renamed from: d */
    public static long m7438d() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public static String m7434c() {
        return C1976g.m7478a("df");
    }
}
