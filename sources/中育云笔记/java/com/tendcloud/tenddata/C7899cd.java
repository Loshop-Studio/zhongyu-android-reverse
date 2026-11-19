package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.utl.UtilityImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.cd */
/* loaded from: classes5.dex */
public class C7899cd {

    /* renamed from: a */
    public static final String f14519a = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";

    /* renamed from: b */
    public static final String f14520b = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";

    /* renamed from: c */
    public static final String f14521c = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";

    /* renamed from: d */
    private static final int f14522d = 3600000;

    /* renamed from: i */
    private static int[] f14527i;

    /* renamed from: e */
    private static final Pattern f14523e = Pattern.compile("([0-9]+)");

    /* renamed from: f */
    private static final Pattern f14524f = Pattern.compile("\\s*([0-9]+)");

    /* renamed from: g */
    private static List<PackageInfo> f14525g = new ArrayList();

    /* renamed from: h */
    private static boolean f14526h = false;

    /* renamed from: j */
    private static final FileFilter f14528j = new FileFilter() { // from class: com.tendcloud.tenddata.cd.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file != null) {
                try {
                    String name = file.getName();
                    if (name != null && name.startsWith("cpu")) {
                        for (int i10 = 3; i10 < name.length(); i10++) {
                            if (name.charAt(i10) < '0' || name.charAt(i10) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    };

    /* renamed from: k */
    private static BroadcastReceiver f14529k = new BroadcastReceiver() { // from class: com.tendcloud.tenddata.cd.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.cd$a */
    public static class a {
        static final int HCE_ENABLED = 3;
        static final int NFC_ENABLED = 2;
        static final int NOT_ENALBED = 1;
        static final int UNKNOWN = 0;
    }

    /* renamed from: a */
    public static String m11427a() {
        return C7843ab.f14310j + Build.VERSION.RELEASE;
    }

    /* renamed from: b */
    public static boolean m11437b() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", null).invoke(cls, null);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th) {
            C7896ca.iForInternal("SA.HasHarmonyOS", th.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static String m11439c() {
        return m11428a("hw_sc.build.platform.version", (String) null);
    }

    /* renamed from: d */
    public static String m11441d() {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            Process processExec = Runtime.getRuntime().exec("uname -r");
            inputStream = processExec.waitFor() == 0 ? processExec.getInputStream() : processExec.getErrorStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 512);
                try {
                    String line = bufferedReader.readLine();
                    inputStream.close();
                    bufferedReader.close();
                    processExec.destroy();
                    try {
                        inputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return line;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        th.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* renamed from: e */
    public static String m11443e() {
        try {
            return Build.ID;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    public static String m11446f() {
        return Build.MANUFACTURER.trim();
    }

    /* renamed from: g */
    public static String m11448g() {
        return Build.BRAND.trim();
    }

    /* renamed from: h */
    public static String m11449h() {
        return Build.MODEL.trim();
    }

    /* renamed from: i */
    public static int m11451i() {
        return TimeZone.getDefault().getRawOffset() / 3600000;
    }

    /* renamed from: j */
    public static String m11453j() {
        try {
            String strTrim = Build.MODEL.trim();
            String strM11434b = m11434b(Build.MANUFACTURER.trim(), strTrim);
            if (TextUtils.isEmpty(strM11434b)) {
                strM11434b = m11434b(Build.BRAND.trim(), strTrim);
            }
            if (strM11434b == null) {
                strM11434b = "";
            }
            return strM11434b + ":" + strTrim;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: k */
    public static String m11455k() {
        try {
            return C7912cq.m11595a(14) ? Build.getRadioVersion() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: l */
    public static int m11457l() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: m */
    public static String m11459m() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: n */
    public static String m11461n() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: o */
    public static String m11463o() {
        return Locale.getDefault().getCountry();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:6:0x0013, B:15:0x003c, B:19:0x004b, B:21:0x0058, B:23:0x005f, B:25:0x0068, B:27:0x0078, B:28:0x0082, B:29:0x0085, B:30:0x0088, B:17:0x0044), top: B:35:0x0013 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] m11466p() {
        /*
            r0 = 4
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto Le
            java.lang.String r4 = ""
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L90
            r5 = 1024(0x400, float:1.435E-42)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L90
        L21:
            r5 = 1
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L3c
            r0.add(r6)     // Catch: java.lang.Throwable -> L44
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L44
            r7 = 104857600(0x6400000, float:3.6111186E-35)
            if (r6 > r7) goto L34
            goto L21
        L34:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "List size more than 104857600 limit"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L44
            throw r6     // Catch: java.lang.Throwable -> L44
        L3c:
            r4.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
        L42:
            r3 = r5
            goto L4b
        L44:
            r4.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
        L4a:
            r3 = r2
        L4b:
            java.lang.String r4 = "Processor\\s*:\\s*(.*)"
            java.lang.String r6 = "CPU\\s*variant\\s*:\\s*0x(.*)"
            java.lang.String r7 = "Hardware\\s*:\\s*(.*)"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r7}     // Catch: java.lang.Throwable -> L90
            r6 = 3
            if (r3 == 0) goto L88
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L90
            r7 = r2
        L5d:
            if (r7 >= r6) goto L88
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L90
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)     // Catch: java.lang.Throwable -> L90
            r9 = r2
        L66:
            if (r9 >= r3) goto L85
            java.lang.Object r10 = r0.get(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L90
            java.util.regex.Matcher r10 = r8.matcher(r10)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r10.find()     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L82
            java.util.regex.MatchResult r10 = r10.toMatchResult()     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = r10.group(r5)     // Catch: java.lang.Throwable -> L90
            r1[r7] = r10     // Catch: java.lang.Throwable -> L90
        L82:
            int r9 = r9 + 1
            goto L66
        L85:
            int r7 = r7 + 1
            goto L5d
        L88:
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = m11440c(r0)     // Catch: java.lang.Throwable -> L90
            r1[r6] = r0     // Catch: java.lang.Throwable -> L90
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7899cd.m11466p():java.lang.String[]");
    }

    /* renamed from: q */
    public static JSONObject m11468q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, m11466p()[2]);
            jSONObject.put("coreNum", m11469r());
            jSONObject.put("maxFreq", m11426a(f14519a));
            jSONObject.put("minFreq", m11426a(f14520b));
            jSONObject.put("curFreq", m11426a(f14521c));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static int m11469r() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(f14528j);
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: s */
    public static int[] m11472s() {
        int[] iArr = {0, 0};
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                int blockSize = statFs.getBlockSize();
                int blockCount = statFs.getBlockCount();
                int availableBlocks = statFs.getAvailableBlocks();
                iArr[0] = (blockCount * (blockSize / 512)) / 2;
                iArr[1] = (availableBlocks * (blockSize / 512)) / 2;
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /* renamed from: t */
    private static JSONArray m11473t(Context context) {
        ServiceInfo[] serviceInfoArr;
        Bundle bundle;
        if (!C7912cq.m11595a(19)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<PackageInfo> listM11429a = m11429a(context, 4);
            if (listM11429a != null) {
                for (PackageInfo packageInfo : listM11429a) {
                    if (packageInfo != null && (serviceInfoArr = packageInfo.services) != null) {
                        int length = serviceInfoArr.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                ServiceInfo serviceInfo = serviceInfoArr[i10];
                                try {
                                    bundle = context.getPackageManager().getServiceInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), 128).metaData;
                                } catch (Throwable unused) {
                                }
                                if (bundle != null && bundle.containsKey("android.nfc.cardemulation.host_apdu_service")) {
                                    jSONArray.put(packageInfo.packageName);
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: u */
    private static int m11475u(Context context) {
        NfcAdapter defaultAdapter;
        try {
            if (!C7912cq.m11595a(19) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return -1;
            }
            return CardEmulation.getInstance(defaultAdapter).getSelectionModeForCategory("payment");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: v */
    public static int m11477v() {
        try {
            Matcher matcher = f14524f.matcher(m11440c("/sys/class/power_supply/battery/full_bat"));
            if (matcher.find()) {
                return Integer.parseInt(matcher.toMatchResult().group(0));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static String m11428a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    /* renamed from: c */
    public static int m11438c(Context context) {
        NfcAdapter defaultAdapter;
        if (context == null) {
            return 0;
        }
        try {
            if (!C7912cq.m11595a(10) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return 0;
            }
            if (!defaultAdapter.isEnabled()) {
                return 1;
            }
            if (C7912cq.m11595a(19)) {
                return context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce") ? 3 : 2;
            }
            return 2;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static int m11445f(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent intentRegisterReceiver = context.registerReceiver(f14529k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i10 = intentRegisterReceiver != null ? intentRegisterReceiver.getExtras().getInt("level", 0) : 0;
        context.unregisterReceiver(f14529k);
        return i10;
    }

    /* renamed from: g */
    public static int m11447g(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent intentRegisterReceiver = context.registerReceiver(f14529k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0) : 0;
        context.unregisterReceiver(f14529k);
        return intExtra;
    }

    /* renamed from: h */
    public static JSONObject m11450h(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UtilityImpl.NET_TYPE_MOBILE, m11464o(context));
            jSONObject.put(UtilityImpl.NET_TYPE_WIFI, m11456k(context));
            jSONObject.put("gps", m11454j(context));
            jSONObject.put("telephone", m11462n(context));
            jSONObject.put("nfc", m11460m(context));
            jSONObject.put("bluetooth", m11458l(context));
            jSONObject.put("otg", m11452i(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m11452i(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.usb.host");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m11458l(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.bluetooth");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m11460m(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.nfc");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m11462n(Context context) {
        if (context != null || (context = C7843ab.f14307g) != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager != null) {
                    if (telephonyManager.getPhoneType() != 0) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m11464o(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static String m11444e(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                return Math.min(i10, i11) + "*" + Math.max(i10, i11) + "*" + displayMetrics.densityDpi;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static int m11470r(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.densityDpi;
        }
        return -1;
    }

    /* renamed from: k */
    public static boolean m11456k(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.wifi");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static JSONObject m11435b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nfcStatus", m11438c(context));
            jSONObject.put("appsRegistedHCE", m11473t(context));
            jSONObject.put("ssMode", m11475u(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static int[] m11476u() {
        int[] iArr = new int[4];
        int[] iArr2 = f14527i;
        if (iArr2 == null || iArr2.length <= 0) {
            f14527i = m11432a(iArr);
        }
        return f14527i;
    }

    /* renamed from: a */
    public static boolean m11431a(Context context) {
        try {
            if (C7912cq.m11595a(17)) {
                if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) > 0) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c */
    private static String m11440c(String str) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader = new FileReader(str);
            char[] cArr = new char[1024];
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            while (true) {
                int i10 = bufferedReader.read(cArr, 0, 1024);
                if (-1 == i10) {
                    break;
                }
                stringBuffer.append(new String(cArr, 0, i10));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: j */
    public static boolean m11454j(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.location.gps");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static int m11467q(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return -1;
    }

    /* renamed from: b */
    private static String m11434b(String str, String str2) {
        try {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("unknown") && !lowerCase.startsWith("alps") && !lowerCase.startsWith(DispatchConstants.ANDROID) && !lowerCase.startsWith("sprd") && !lowerCase.startsWith("spreadtrum") && !lowerCase.startsWith("rockchip") && !lowerCase.startsWith("wondermedia") && !lowerCase.startsWith("mtk") && !lowerCase.startsWith("mt65") && !lowerCase.startsWith("nvidia") && !lowerCase.startsWith("brcm") && !lowerCase.startsWith("marvell")) {
                if (!str2.toLowerCase().contains(lowerCase)) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static List<PackageInfo> m11429a(Context context, int i10) {
        ArrayList arrayList = new ArrayList();
        try {
            return m11442d(context);
        } catch (Throwable unused) {
            PackageManager packageManager = context.getPackageManager();
            BufferedReader bufferedReader = null;
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("pm list packages");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            arrayList.add(packageManager.getPackageInfo(line.substring(line.indexOf(58) + 1), i10));
                        } catch (Throwable unused2) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return arrayList;
                        }
                    }
                    processExec.waitFor();
                    bufferedReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
            return arrayList;
        }
    }

    /* renamed from: t */
    public static int[] m11474t() throws IOException {
        int[] iArr = {0, 0};
        int[] iArr2 = new int[4];
        for (int i10 = 0; i10 < 4; i10++) {
            iArr2[i10] = 0;
        }
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    String line = bufferedReader.readLine();
                    if (line.length() <= 104857600) {
                        iArr2[i11] = m11433b(line);
                    } else {
                        throw new RuntimeException("Input stream more than 100 MB size limit");
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1] + iArr2[2] + iArr2[3];
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused3) {
        }
        return iArr;
    }

    /* renamed from: s */
    public static int m11471s(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return -1;
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static JSONObject m11430a(Context context, JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                jSONObject.put("pixel", Math.min(i10, i11) + "*" + Math.max(i10, i11) + "*" + displayMetrics.densityDpi);
                jSONObject.put("densityDpi", displayMetrics.densityDpi);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONObject m11436b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("brightness", m11471s(context));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static synchronized List<PackageInfo> m11442d(Context context) {
        if (C7843ab.f14285T) {
            return null;
        }
        if (f14526h) {
            return f14525g;
        }
        if (C7912cq.m11595a(30) && C7912cq.m11597a(context, 30) && !C7912cq.m11614c(context, "android.permission.QUERY_ALL_PACKAGES")) {
            f14526h = true;
            return f14525g;
        }
        try {
            f14525g = context.getPackageManager().getInstalledPackages(5);
            f14526h = true;
        } catch (Throwable unused) {
        }
        return f14525g;
    }

    /* renamed from: p */
    public static int m11465p(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* renamed from: b */
    private static int m11433b(String str) {
        try {
            String strGroup = "";
            Matcher matcher = f14523e.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.toMatchResult().group(0);
            }
            return Integer.parseInt(strGroup);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m11426a(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line;
        int i10 = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        try {
            line = bufferedReader.readLine();
        } catch (Throwable unused3) {
            fileReader2 = fileReader;
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (Throwable unused4) {
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
            }
            return i10;
        }
        if (line.length() <= 104857600) {
            i10 = Integer.parseInt(line.trim());
            try {
                fileReader.close();
            } catch (Throwable unused6) {
            }
            bufferedReader.close();
            return i10;
        }
        throw new RuntimeException("Input stream more than 100 MB size limit");
    }

    /* renamed from: a */
    private static int[] m11432a(int[] iArr) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            iArr[0] = (statFs.getBlockCount() * (statFs.getBlockSize() / 512)) / 2;
            iArr[1] = (statFs.getAvailableBlocks() * (statFs.getBlockSize() / 512)) / 2;
        } catch (Throwable unused) {
        }
        try {
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            iArr[2] = (statFs2.getBlockCount() * (statFs2.getBlockSize() / 512)) / 2;
            iArr[3] = (statFs2.getAvailableBlocks() * (statFs2.getBlockSize() / 512)) / 2;
        } catch (Throwable unused2) {
        }
        return iArr;
    }
}
