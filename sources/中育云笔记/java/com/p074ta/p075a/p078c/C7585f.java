package com.p074ta.p075a.p078c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;

/* renamed from: com.ta.a.c.f */
/* loaded from: classes5.dex */
public class C7585f {

    /* renamed from: b */
    private static boolean f12848b = false;

    /* renamed from: c */
    private static boolean f12849c = false;

    /* renamed from: a */
    public static boolean m9797a() {
        return f12848b;
    }

    /* renamed from: b */
    public static void m9799b(String str, Object... objArr) {
        if (f12849c) {
            m9801g();
            m9794a(str, objArr);
        }
    }

    /* renamed from: e */
    public static void m9800e() {
        if (f12848b) {
            m9801g();
            m9794a((String) null, new Object[0]);
        }
    }

    /* renamed from: g */
    private static String m9801g() {
        String methodName;
        String strSubstring;
        StackTraceElement stackTraceElementM9792a = m9792a();
        if (stackTraceElementM9792a != null) {
            String className = stackTraceElementM9792a.getClassName();
            strSubstring = !TextUtils.isEmpty(className) ? className.substring(className.lastIndexOf(46) + 1) : "";
            methodName = stackTraceElementM9792a.getMethodName();
        } else {
            methodName = "";
            strSubstring = methodName;
        }
        return "Utdid." + strSubstring + Consts.DOT + methodName + Consts.DOT + String.valueOf(Process.myPid()) + Consts.DOT + (Thread.currentThread().getId() + "");
    }

    /* renamed from: a */
    public static void m9796a(String str, Object... objArr) {
        if (f12848b) {
            m9801g();
            m9794a(str, objArr);
        }
    }

    /* renamed from: b */
    public static void m9798b(String str, Throwable th, Object... objArr) {
        if (f12849c) {
            Log.e(m9801g(), m9794a(str, objArr), th);
        }
    }

    /* renamed from: a */
    public static void m9795a(String str, Throwable th, Object... objArr) {
        if (f12848b) {
            Log.e(m9801g(), m9794a(str, objArr), th);
        }
    }

    /* renamed from: a */
    private static String m9793a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    /* renamed from: a */
    private static String m9794a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb2.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(m9793a(objArr[i10], objArr[i11]));
                if (i11 < length - 1) {
                    sb2.append(",");
                }
                i10 += 2;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static StackTraceElement m9792a() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(C7585f.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
