package com.efs.sdk.base.p039a.p050h;

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
/* loaded from: classes3.dex */
public final class C5700g {

    /* renamed from: a */
    private static String f4756a = null;

    /* renamed from: b */
    private static List<Integer> f4757b = null;

    /* renamed from: c */
    private static long f4758c = -1;

    /* renamed from: a */
    public static int m4190a() {
        return Process.myPid();
    }

    /* renamed from: b */
    public static String m4193b() {
        String str = f4756a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM4191a = m4191a(Process.myPid());
        f4756a = strM4191a;
        return strM4191a;
    }

    /* renamed from: a */
    public static String m4191a(int i9) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i9 + "/cmdline")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i10 = bufferedReader2.read();
                    if (i10 <= 0) {
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
                    sb.append((char) i10);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    C5697d.m4183b("efs.base", "get process name error", th);
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
    public static boolean m4192a(Context context, String str) {
        try {
            int i9 = Integer.parseInt(str);
            List<Integer> list = f4757b;
            if (list == null || list.isEmpty() || f4758c <= 0 || System.currentTimeMillis() - f4758c > 600000) {
                List<Integer> list2 = f4757b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    f4757b = new ArrayList();
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        f4757b.add(Integer.valueOf(it.next().pid));
                    }
                }
                f4758c = System.currentTimeMillis();
            }
            return f4757b.contains(Integer.valueOf(i9));
        } catch (Throwable th) {
            C5697d.m4183b("efs.base", "Process exist judge error", th);
            return true;
        }
    }
}
