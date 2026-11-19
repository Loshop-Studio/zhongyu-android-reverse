package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.k */
/* loaded from: classes.dex */
public class C1980k {

    /* renamed from: a */
    public static final String f9275a = "UM_PROBE_DATA";

    /* renamed from: b */
    public static final String f9276b = "_dsk_s";

    /* renamed from: c */
    public static final String f9277c = "_thm_z";

    /* renamed from: d */
    public static final String f9278d = "_gdf_r";

    /* renamed from: e */
    private static Object f9279e = new Object();

    /* renamed from: b */
    public static void m7495b(final Context context) {
        if (m7498c(context)) {
            return;
        }
        final String[] strArr = {UtilityImpl.NET_TYPE_UNKNOWN, UtilityImpl.NET_TYPE_UNKNOWN, UtilityImpl.NET_TYPE_UNKNOWN};
        new Thread() { // from class: com.umeng.commonsdk.internal.utils.k.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                try {
                    strArr[0] = C1980k.m7497c();
                    strArr[1] = C1980k.m7491a();
                    strArr[2] = C1980k.m7494b();
                    ULog.m7606i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                    C1980k.m7496b(context, strArr);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }.start();
    }

    /* renamed from: c */
    public static boolean m7498c(Context context) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9275a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(f9276b, ""))) ? false : true;
    }

    /* renamed from: a */
    public static String m7492a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9275a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f9279e) {
                jSONObject.put(f9276b, sharedPreferences.getString(f9276b, ""));
                jSONObject.put(f9277c, sharedPreferences.getString(f9277c, ""));
                jSONObject.put(f9278d, sharedPreferences.getString(f9278d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m7496b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9275a, 0)) == null) {
            return;
        }
        synchronized (f9279e) {
            sharedPreferences.edit().putString(f9276b, strArr[0]).putString(f9277c, strArr[1]).putString(f9278d, strArr[2]).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m7497c() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "/proc/diskstats"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
        Ld:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "mtd"
            java.lang.String r3 = "sda"
            java.lang.String r4 = "mmcblk"
            if (r0 == 0) goto L30
            boolean r5 = r0.contains(r4)     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L21
            r2 = r4
            goto L37
        L21:
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L29
            r2 = r3
            goto L37
        L29:
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto Ld
            goto L37
        L30:
            java.lang.String r2 = "unknown"
            goto L37
        L33:
            r0 = r1
        L34:
            java.lang.String r2 = "noper"
            r1 = r0
        L37:
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C1980k.m7497c():java.lang.String");
    }

    /* renamed from: b */
    public static String m7494b() {
        int iM7490a;
        try {
            iM7490a = m7490a("ls /", "goldfish");
        } catch (Throwable unused) {
            iM7490a = -1;
        }
        return iM7490a > 0 ? "goldfish" : iM7490a < 0 ? "noper" : UtilityImpl.NET_TYPE_UNKNOWN;
    }

    /* renamed from: a */
    public static int m7490a(String str, String str2) throws IOException {
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
    public static String m7491a() {
        int iM7490a;
        try {
            iM7490a = m7490a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable unused) {
            iM7490a = -1;
        }
        return iM7490a > 0 ? "thermal_zone" : iM7490a < 0 ? "noper" : UtilityImpl.NET_TYPE_UNKNOWN;
    }
}
