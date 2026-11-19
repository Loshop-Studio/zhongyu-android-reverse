package com.efs.sdk.base.p020a.p031h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.g */
/* loaded from: classes2.dex */
public final class C2960g {

    /* renamed from: a */
    private static String f1152a = null;

    /* renamed from: b */
    private static List<Integer> f1153b = null;

    /* renamed from: c */
    private static long f1154c = -1;

    /* renamed from: a */
    public static int m2221a() {
        return Process.myPid();
    }

    /* renamed from: b */
    public static String m2224b() {
        String str = f1152a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM2222a = m2222a(Process.myPid());
        f1152a = strM2222a;
        return strM2222a;
    }

    /* renamed from: a */
    public static String m2222a(int i4) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i4 + "/cmdline")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i5 = bufferedReader2.read();
                    if (i5 <= 0) {
                        sb.trimToSize();
                        String string = sb.toString();
                        try {
                            bufferedReader2.close();
                            return string;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return string;
                        }
                    }
                    sb.append((char) i5);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    C2957d.m2214b("efs.base", "get process name error", th);
                    return "";
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: a */
    public static boolean m2223a(Context context, String str) {
        try {
            int i4 = Integer.parseInt(str);
            List<Integer> list = f1153b;
            boolean z3 = false;
            if (list != null && !list.isEmpty() && f1154c > 0 && System.currentTimeMillis() - f1154c <= 600000) {
                z3 = true;
            }
            if (!z3) {
                List<Integer> list2 = f1153b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    f1153b = new ArrayList();
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        f1153b.add(Integer.valueOf(it.next().pid));
                    }
                }
                f1154c = System.currentTimeMillis();
            }
            return f1153b.contains(Integer.valueOf(i4));
        } catch (Throwable th) {
            C2957d.m2214b("efs.base", "Process exist judge error", th);
            return true;
        }
    }
}
