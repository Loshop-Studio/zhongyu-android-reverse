package com.alibaba.sdk.android.crashdefend.p025c;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.crashdefend.p023a.C1111a;
import com.alibaba.sdk.android.crashdefend.p023a.C1112b;
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
/* loaded from: classes.dex */
public class C1114a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.StringBuilder] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m5073a() throws java.lang.Throwable {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.append(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            if (r0 == 0) goto L3e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L73
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L73
            r6 = r1
            r1 = r0
            r0 = r6
            goto L3f
        L3c:
            r2 = move-exception
            goto L52
        L3e:
            r0 = r1
        L3f:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r1 = move-exception
            r1.printStackTrace()
        L49:
            r1 = r0
            goto L72
        L4b:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L74
        L50:
            r2 = move-exception
            r0 = r1
        L52:
            java.lang.String r3 = "CrashUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "getProcessNameByPid error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L73
            r4.append(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L73
            android.util.Log.d(r3, r2)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L72
            r0.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            return r1
        L73:
            r1 = move-exception
        L74:
            if (r0 == 0) goto L7e
            r0.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r0.printStackTrace()
        L7e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.crashdefend.p025c.C1114a.m5073a():java.lang.String");
    }

    /* renamed from: a */
    public static synchronized void m5074a(Context context, C1111a c1111a, List<C1112b> list) {
        String str;
        String str2;
        if (context == null || list == null) {
            return;
        }
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                if (c1111a != null) {
                    jSONObject.put("startSerialNumber", c1111a.f6534a);
                }
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (C1112b c1112b : list) {
                        if (c1112b != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("sdkId", c1112b.f6538a);
                            jSONObject2.put(Constants.KEY_SDK_VERSION, c1112b.f6539b);
                            jSONObject2.put("crashLimit", c1112b.f6540c);
                            jSONObject2.put("crashCount", c1112b.f6541d);
                            jSONObject2.put("waitTime", c1112b.f6542e);
                            jSONObject2.put("registerSerialNumber", c1112b.f6543f);
                            jSONObject2.put("startSerialNumber", c1112b.f6544g);
                            jSONObject2.put("restoreCount", c1112b.f6545h);
                            jSONObject2.put("nextRestoreInterval", c1112b.f6546i);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("sdkList", jSONArray);
                } catch (JSONException e4) {
                    Log.e("CrashUtils", "save sdk json fail:", e4);
                }
                String string = jSONObject.toString();
                fileOutputStreamOpenFileOutput = context.openFileOutput(m5075a(context) ? "com_alibaba_aliyun_crash_defend_sdk_info" : "com_alibaba_aliyun_crash_defend_sdk_info_" + m5076b(context), 0);
                fileOutputStreamOpenFileOutput.write(string.getBytes());
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException e5) {
                    e = e5;
                    str = "CrashUtils";
                    str2 = "save sdk io fail:";
                    Log.e(str, str2, e);
                }
            } finally {
            }
        } catch (IOException e6) {
            C1115b.m5081a("CrashUtils", "save sdk io fail:", e6);
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException e7) {
                    e = e7;
                    str = "CrashUtils";
                    str2 = "save sdk io fail:";
                    Log.e(str, str2, e);
                }
            }
        } catch (Exception e8) {
            C1115b.m5081a("CrashUtils", "save sdk exception:", e8);
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException e9) {
                    e = e9;
                    str = "CrashUtils";
                    str2 = "save sdk io fail:";
                    Log.e(str, str2, e);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m5075a(Context context) {
        return context.getPackageName().equalsIgnoreCase(m5076b(context));
    }

    /* renamed from: b */
    private static String m5076b(Context context) throws Throwable {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
        } catch (Throwable th) {
            Log.e("CrashUtils", "Application gerProcessName error: " + Log.getStackTraceString(th));
        }
        String strM5079d = m5079d(context);
        if (!TextUtils.isEmpty(strM5079d)) {
            return strM5079d;
        }
        String strM5073a = m5073a();
        return !TextUtils.isEmpty(strM5073a) ? strM5073a : m5078c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce A[DONT_GENERATE] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m5077b(android.content.Context r10, com.alibaba.sdk.android.crashdefend.p023a.C1111a r11, java.util.List<com.alibaba.sdk.android.crashdefend.p023a.C1112b> r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.crashdefend.p025c.C1114a.m5077b(android.content.Context, com.alibaba.sdk.android.crashdefend.a.a, java.util.List):boolean");
    }

    /* renamed from: c */
    private static String m5078c(Context context) {
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
    private static String m5079d(Context context) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, context.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e4) {
            Log.d("CrashUtils", "getProcessNameByActivityThread error: " + e4);
            return null;
        }
    }
}
