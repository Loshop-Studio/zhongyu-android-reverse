package com.p053ta.p054a.p057c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.ta.a.c.f */
/* loaded from: classes.dex */
public class C1688f {

    /* renamed from: b */
    private static boolean f7450b = false;

    /* renamed from: c */
    private static boolean f7451c = false;

    /* renamed from: a */
    public static boolean m5771a() {
        return f7450b;
    }

    /* renamed from: b */
    public static void m5773b(String str, Object... objArr) {
        if (f7451c) {
            Log.d(m5775g(), m5768a(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m5774e() {
        if (f7450b) {
            Log.d(m5775g(), m5768a((String) null, new Object[0]));
        }
    }

    /* renamed from: g */
    private static String m5775g() {
        String methodName;
        String strSubstring;
        StackTraceElement stackTraceElementM5766a = m5766a();
        if (stackTraceElementM5766a != null) {
            String className = stackTraceElementM5766a.getClassName();
            strSubstring = !TextUtils.isEmpty(className) ? className.substring(className.lastIndexOf(46) + 1) : "";
            methodName = stackTraceElementM5766a.getMethodName();
        } else {
            methodName = "";
            strSubstring = methodName;
        }
        return "Utdid." + strSubstring + "." + methodName + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }

    /* renamed from: a */
    public static void m5770a(String str, Object... objArr) {
        if (f7450b) {
            Log.d(m5775g(), m5768a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m5772b(String str, Throwable th, Object... objArr) {
        if (f7451c) {
            Log.e(m5775g(), m5768a(str, objArr), th);
        }
    }

    /* renamed from: a */
    public static void m5769a(String str, Throwable th, Object... objArr) {
        if (f7450b) {
            Log.e(m5775g(), m5768a(str, objArr), th);
        }
    }

    /* renamed from: a */
    private static String m5767a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    /* renamed from: a */
    private static String m5768a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i4 = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= objArr.length) {
                    break;
                }
                sb.append(m5767a(objArr[i4], objArr[i5]));
                if (i5 < length - 1) {
                    sb.append(",");
                }
                i4 = i5 + 1;
            }
            if (i4 == objArr.length - 1) {
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static StackTraceElement m5766a() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(C1688f.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
