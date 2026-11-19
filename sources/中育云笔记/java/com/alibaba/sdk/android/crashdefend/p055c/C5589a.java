package com.alibaba.sdk.android.crashdefend.p055c;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.crashdefend.p053a.C5586a;
import com.alibaba.sdk.android.crashdefend.p053a.C5587b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.crashdefend.c.a */
/* loaded from: classes3.dex */
public class C5589a {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m3474a() throws java.lang.Throwable {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.append(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            if (r0 == 0) goto L48
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r5 = r1
            r1 = r0
            r0 = r5
            goto L49
        L3c:
            r1 = move-exception
            goto L63
        L3e:
            r2 = move-exception
            goto L55
        L40:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L63
        L45:
            r2 = move-exception
            r0 = r1
            goto L55
        L48:
            r0 = r1
        L49:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            r1 = r0
            goto L62
        L55:
            r2.toString()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L62
            r0.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            return r1
        L63:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r0 = move-exception
            r0.printStackTrace()
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.crashdefend.p055c.C5589a.m3474a():java.lang.String");
    }

    /* renamed from: b */
    private static String m3477b(Context context) throws Throwable {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
        } catch (Throwable th) {
            Log.e("CrashUtils", "Application gerProcessName error: " + Log.getStackTraceString(th));
        }
        String strM3480d = m3480d(context);
        if (!TextUtils.isEmpty(strM3480d)) {
            return strM3480d;
        }
        String strM3474a = m3474a();
        return !TextUtils.isEmpty(strM3474a) ? strM3474a : m3479c(context);
    }

    /* renamed from: c */
    private static String m3479c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* renamed from: d */
    private static String m3480d(Context context) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, context.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, null);
        } catch (Exception e10) {
            e10.toString();
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m3475a(Context context, C5586a c5586a, List<C5587b> list) {
        String str;
        String str2;
        if (context == null || list == null) {
            return;
        }
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                if (c5586a != null) {
                    jSONObject.put("startSerialNumber", c5586a.f4019a);
                }
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (C5587b c5587b : list) {
                        if (c5587b != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("sdkId", c5587b.f4023a);
                            jSONObject2.put(Constants.KEY_SDK_VERSION, c5587b.f4024b);
                            jSONObject2.put("crashLimit", c5587b.f4025c);
                            jSONObject2.put("crashCount", c5587b.f4026d);
                            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, c5587b.f4027e);
                            jSONObject2.put("registerSerialNumber", c5587b.f4028f);
                            jSONObject2.put("startSerialNumber", c5587b.f4029g);
                            jSONObject2.put("restoreCount", c5587b.f4030h);
                            jSONObject2.put("nextRestoreInterval", c5587b.f4031i);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("sdkList", jSONArray);
                } catch (JSONException e10) {
                    Log.e("CrashUtils", "save sdk json fail:", e10);
                }
                String string = jSONObject.toString();
                fileOutputStreamOpenFileOutput = context.openFileOutput(m3476a(context) ? "com_alibaba_aliyun_crash_defend_sdk_info" : "com_alibaba_aliyun_crash_defend_sdk_info_" + m3477b(context), 0);
                fileOutputStreamOpenFileOutput.write(string.getBytes());
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException e11) {
                    e = e11;
                    str = "CrashUtils";
                    str2 = "save sdk io fail:";
                    Log.e(str, str2, e);
                }
            } catch (IOException e12) {
                C5590b.m3482a("CrashUtils", "save sdk io fail:", e12);
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException e13) {
                        e = e13;
                        str = "CrashUtils";
                        str2 = "save sdk io fail:";
                        Log.e(str, str2, e);
                    }
                }
            } catch (Exception e14) {
                C5590b.m3482a("CrashUtils", "save sdk exception:", e14);
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException e15) {
                        e = e15;
                        str = "CrashUtils";
                        str2 = "save sdk io fail:";
                        Log.e(str, str2, e);
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7 A[DONT_GENERATE] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m3478b(android.content.Context r10, com.alibaba.sdk.android.crashdefend.p053a.C5586a r11, java.util.List<com.alibaba.sdk.android.crashdefend.p053a.C5587b> r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.crashdefend.p055c.C5589a.m3478b(android.content.Context, com.alibaba.sdk.android.crashdefend.a.a, java.util.List):boolean");
    }

    /* renamed from: a */
    private static boolean m3476a(Context context) {
        return context.getPackageName().equalsIgnoreCase(m3477b(context));
    }
}
