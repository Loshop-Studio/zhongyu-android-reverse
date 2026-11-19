package com.efs.sdk.base.p035a.p046h;

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
import org.android.agoo.common.AgooConstants;

/* renamed from: com.efs.sdk.base.a.h.g */
/* loaded from: classes.dex */
public final class C1332g {

    /* renamed from: a */
    private static String f7122a = null;

    /* renamed from: b */
    private static List<Integer> f7123b = null;

    /* renamed from: c */
    private static long f7124c = -1;

    /* renamed from: a */
    public static int m5580a() {
        return Process.myPid();
    }

    /* renamed from: b */
    public static String m5583b() {
        String str = f7122a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM5581a = m5581a(Process.myPid());
        f7122a = strM5581a;
        return strM5581a;
    }

    /* renamed from: a */
    public static String m5581a(int i4) {
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
                    C1329d.m5573b("efs.base", "get process name error", th);
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
    public static boolean m5582a(Context context, String str) {
        try {
            int i4 = Integer.parseInt(str);
            List<Integer> list = f7123b;
            boolean z3 = false;
            if (list != null && !list.isEmpty() && f7124c > 0 && System.currentTimeMillis() - f7124c <= 600000) {
                z3 = true;
            }
            if (!z3) {
                List<Integer> list2 = f7123b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    f7123b = new ArrayList();
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        f7123b.add(Integer.valueOf(it.next().pid));
                    }
                }
                f7124c = System.currentTimeMillis();
            }
            return f7123b.contains(Integer.valueOf(i4));
        } catch (Throwable th) {
            C1329d.m5573b("efs.base", "Process exist judge error", th);
            return true;
        }
    }
}
