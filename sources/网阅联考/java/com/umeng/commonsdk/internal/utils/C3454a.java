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
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3510b;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.umeng.commonsdk.internal.utils.a */
/* loaded from: classes2.dex */
public class C3454a {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a */
    public static class a {

        /* renamed from: a */
        public String f2620a;

        /* renamed from: b */
        public String f2621b;
    }

    /* renamed from: com.umeng.commonsdk.internal.utils.a$b */
    public static class b {

        /* renamed from: a */
        public int f2622a;

        /* renamed from: b */
        public String f2623b;

        /* renamed from: c */
        public String f2624c;

        /* renamed from: d */
        public int f2625d;

        /* renamed from: e */
        public int f2626e;

        /* renamed from: f */
        public int f2627f;

        /* renamed from: g */
        public int f2628g;

        /* renamed from: h */
        public String f2629h;

        /* renamed from: i */
        public int f2630i;

        /* renamed from: j */
        public int f2631j;

        /* renamed from: k */
        public int f2632k;

        /* renamed from: l */
        public long f2633l;
    }

    /* renamed from: a */
    public static long m3506a(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m3677e("getAppFirstInstallTime" + e4.getMessage());
            return 0L;
        }
    }

    /* renamed from: b */
    public static long m3508b(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m3677e("getAppLastUpdateTime:" + e4.getMessage());
            return 0L;
        }
    }

    /* renamed from: c */
    public static String m3512c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
            ULog.m3677e("getAppInstaller:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m3514d(Context context, String str) {
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
            ULog.m3677e("getAppUid:" + e4.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public static void m3519e(Context context) {
        if (context == null) {
            return;
        }
        C3459f.m3553b(context);
    }

    /* renamed from: f */
    public static int m3520f(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return -1;
        }
        return wifiManager.getWifiState();
    }

    /* renamed from: g */
    public static int m3521g(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: h */
    public static int m3522h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: i */
    public static DisplayMetrics m3523i(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* renamed from: j */
    public static List<InputMethodInfo> m3524j(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    /* renamed from: k */
    public static List<a> m3525k(Context context) {
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
                        aVar.f2620a = str;
                        aVar.f2621b = m3518e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception e4) {
            ULog.m3677e("getAppList:" + e4.getMessage());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static ActivityManager.MemoryInfo m3526l(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: m */
    public static String m3527m(Context context) {
        return null;
    }

    /* renamed from: n */
    public static String m3528n(Context context) {
        return null;
    }

    /* renamed from: e */
    private static String m3518e(Context context, String str) throws PackageManager.NameNotFoundException {
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
            ULog.m3677e("getLabel:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static void m3513c(Context context) {
        WifiInfo wifiInfoM3509b;
        if (context == null || (wifiInfoM3509b = m3509b(context)) == null) {
            return;
        }
        b bVar = new b();
        bVar.f2622a = wifiInfoM3509b.describeContents();
        bVar.f2623b = wifiInfoM3509b.getBSSID();
        bVar.f2624c = wifiInfoM3509b.getSSID();
        bVar.f2625d = wifiInfoM3509b.getFrequency();
        boolean z3 = true;
        if (wifiInfoM3509b.getHiddenSSID()) {
            bVar.f2626e = 1;
        } else {
            bVar.f2626e = 0;
        }
        if (FieldManager.allow(C3510b.f2973H)) {
            bVar.f2627f = wifiInfoM3509b.getIpAddress();
        }
        bVar.f2628g = wifiInfoM3509b.getLinkSpeed();
        bVar.f2629h = DeviceConfig.getMac(context);
        bVar.f2630i = wifiInfoM3509b.getNetworkId();
        bVar.f2631j = wifiInfoM3509b.getRssi();
        bVar.f2632k = m3520f(context);
        bVar.f2633l = System.currentTimeMillis();
        try {
            JSONArray jSONArrayM3550a = C3459f.m3550a(context);
            if (jSONArrayM3550a == null || jSONArrayM3550a.length() <= 0) {
                z3 = false;
            } else {
                for (int i4 = 0; i4 < jSONArrayM3550a.length(); i4++) {
                    String strOptString = jSONArrayM3550a.optJSONObject(i4).optString("ssid", null);
                    if (strOptString != null && strOptString.equals(bVar.f2624c)) {
                        break;
                    }
                }
                z3 = false;
            }
            if (z3) {
                return;
            }
            C3459f.m3551a(context, bVar);
        } catch (Exception e4) {
            ULog.m3677e("wifiChange:" + e4.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m3507a() {
        return C3461h.m3560a();
    }

    /* renamed from: b */
    public static String m3510b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* renamed from: e */
    public static String m3517e() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String string = declaredMethod.invoke(null, "net.hostname").toString();
            return (string == null || string.equalsIgnoreCase("")) ? string : HelperUtils.getUmengMD5(string);
        } catch (Exception e4) {
            ULog.m3677e("getHostName:" + e4.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static float m3505a(Context context) {
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e4) {
            ULog.m3677e("getFontSize:" + e4.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: d */
    public static JSONArray m3516d(Context context) {
        if (context == null) {
            return null;
        }
        return C3459f.m3550a(context);
    }

    /* renamed from: b */
    public static WifiInfo m3509b(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* renamed from: d */
    public static long m3515d() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public static String m3511c() {
        return C3460g.m3555a("df");
    }
}
