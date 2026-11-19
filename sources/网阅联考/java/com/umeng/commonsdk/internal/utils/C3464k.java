package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.k */
/* loaded from: classes2.dex */
public class C3464k {

    /* renamed from: a */
    public static final String f2683a = "UM_PROBE_DATA";

    /* renamed from: b */
    public static final String f2684b = "_dsk_s";

    /* renamed from: c */
    public static final String f2685c = "_thm_z";

    /* renamed from: d */
    public static final String f2686d = "_gdf_r";

    /* renamed from: e */
    private static Object f2687e = new Object();

    /* renamed from: b */
    public static void m3572b(final Context context) {
        if (m3575c(context)) {
            return;
        }
        final String[] strArr = {EnvironmentCompat.MEDIA_UNKNOWN, EnvironmentCompat.MEDIA_UNKNOWN, EnvironmentCompat.MEDIA_UNKNOWN};
        new Thread() { // from class: com.umeng.commonsdk.internal.utils.k.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                try {
                    strArr[0] = C3464k.m3574c();
                    strArr[1] = C3464k.m3568a();
                    strArr[2] = C3464k.m3571b();
                    ULog.m3683i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                    C3464k.m3573b(context, strArr);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }.start();
    }

    /* renamed from: c */
    public static boolean m3575c(Context context) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f2683a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(f2684b, ""))) ? false : true;
    }

    /* renamed from: a */
    public static String m3569a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2683a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f2687e) {
                jSONObject.put(f2684b, sharedPreferences.getString(f2684b, ""));
                jSONObject.put(f2685c, sharedPreferences.getString(f2685c, ""));
                jSONObject.put(f2686d, sharedPreferences.getString(f2686d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m3573b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f2683a, 0)) == null) {
            return;
        }
        synchronized (f2687e) {
            sharedPreferences.edit().putString(f2684b, strArr[0]).putString(f2685c, strArr[1]).putString(f2686d, strArr[2]).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3574c() {
        /*
            java.lang.String r0 = "mtd"
            java.lang.String r1 = "sda"
            java.lang.String r2 = "mmcblk"
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "/proc/diskstats"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
        L13:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L30
            boolean r5 = r3.contains(r2)     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L21
            r0 = r2
            goto L37
        L21:
            boolean r5 = r3.contains(r1)     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L29
            r0 = r1
            goto L37
        L29:
            boolean r3 = r3.contains(r0)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L13
            goto L37
        L30:
            java.lang.String r0 = "unknown"
            goto L37
        L33:
            r3 = r4
        L34:
            java.lang.String r0 = "noper"
            r4 = r3
        L37:
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3464k.m3574c():java.lang.String");
    }

    /* renamed from: b */
    public static String m3571b() {
        int iM3567a;
        try {
            iM3567a = m3567a("ls /", "goldfish");
        } catch (Throwable unused) {
            iM3567a = -1;
        }
        return iM3567a > 0 ? "goldfish" : iM3567a < 0 ? "noper" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    /* renamed from: a */
    public static int m3567a(String str, String str2) throws IOException {
        int i4;
        if (Build.VERSION.SDK_INT > 28) {
            return -1;
        }
        Process processExec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                i4 = -1;
                break;
            }
            if (line.contains(str2)) {
                i4 = 1;
                break;
            }
        }
        try {
            if (processExec.waitFor() != 0) {
                return -1;
            }
            return i4;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m3568a() {
        int iM3567a;
        try {
            iM3567a = m3567a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable unused) {
            iM3567a = -1;
        }
        return iM3567a > 0 ? "thermal_zone" : iM3567a < 0 ? "noper" : EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
