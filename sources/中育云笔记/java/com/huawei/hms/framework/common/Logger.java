package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class Logger {

    /* renamed from: a */
    public static ExtLogger f11636a = null;

    /* renamed from: b */
    public static boolean f11637b = true;

    /* renamed from: c */
    public static int f11638c = 2;

    public static class ThrowableWrapper extends Throwable {

        /* renamed from: c */
        public String f11639c;

        /* renamed from: d */
        public Throwable f11640d;

        /* renamed from: e */
        public Throwable f11641e;

        /* renamed from: a */
        public final synchronized void m8591a(Throwable th) {
            this.f11640d = th;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th;
            th = this.f11640d;
            if (th == this) {
                th = null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f11639c;
        }

        public void setMessage(String str) {
            this.f11639c = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.f11641e;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f11639c == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f11639c.startsWith(str)) {
                return this.f11639c;
            }
            return str + this.f11639c;
        }

        public ThrowableWrapper(Throwable th) {
            this.f11641e = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i10 = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i10) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i10));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    /* renamed from: a */
    public static String m8568a(String str) {
        return "NetworkSdk_" + str;
    }

    /* renamed from: b */
    public static String m8569b(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return m8578h(i10);
        }
        String strM8578h = m8578h(i10);
        if (TextUtils.isEmpty(strM8578h)) {
            return str;
        }
        return strM8578h + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str;
    }

    /* renamed from: c */
    public static String m8570c(String str) {
        return "NK_" + str;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: d */
    public static void m8571d(String str, Object obj) {
        println(3, str, obj);
    }

    /* renamed from: e */
    public static void m8573e(String str, Object obj) {
        println(6, str, obj);
    }

    /* renamed from: f */
    public static void m8576f(int i10, String str, String str2) {
        if (i10 == 2) {
            f11636a.m8565v(str, str2);
            return;
        }
        if (i10 == 3) {
            f11636a.m8561d(str, str2);
            return;
        }
        if (i10 == 4) {
            f11636a.m8564i(str, str2);
        } else if (i10 == 5) {
            f11636a.m8566w(str, str2);
        } else {
            if (i10 != 6) {
                return;
            }
            f11636a.m8562e(str, str2);
        }
    }

    /* renamed from: g */
    public static String m8577g(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i10) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getClassName().replace("com.huawei.hms.network.", "").replace("com.huawei.hms.framework.", "") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getLineNumber();
    }

    /* renamed from: h */
    public static String m8578h(int i10) {
        return !Log.isLoggable("NK_", 3) ? m8577g(i10 + 1) : m8582j(i10 + 1);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: i */
    public static void m8580i(String str, Object obj) {
        println(4, str, obj);
    }

    public static boolean isLoggable(int i10) {
        return Log.isLoggable("NK_", i10);
    }

    /* renamed from: j */
    public static String m8582j(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i10) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getFileName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getClassName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getMethodName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getLineNumber();
    }

    /* renamed from: k */
    public static boolean m8583k(int i10) {
        return f11636a != null && i10 >= 3;
    }

    /* renamed from: l */
    public static boolean m8584l(int i10) {
        return f11637b && isLoggable(i10);
    }

    /* renamed from: m */
    public static int m8585m(int i10, String str, String str2) {
        if (i10 < f11638c) {
            return 1;
        }
        if (m8583k(i10)) {
            m8576f(i10, m8568a(str), m8569b(str2, 7));
        }
        if (m8584l(i10)) {
            return Log.println(i10, m8570c(str), m8569b(str2, 7));
        }
        return 1;
    }

    public static void println(int i10, String str, Object obj) {
        if (i10 < 3) {
            return;
        }
        m8585m(i10, str, obj == null ? "null" : obj.toString());
    }

    public static void setExtLogger(ExtLogger extLogger, boolean z10) {
        f11636a = extLogger;
        f11637b = z10;
        m8580i("NK_Logger", "logger = " + extLogger + z10);
    }

    public static void setLogEnableLevel(int i10) {
        f11638c = i10;
        Log.i("NK_Logger", "setLogEnableLevel: " + i10);
    }

    /* renamed from: v */
    public static void m8587v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m8588w(String str, Object obj) {
        println(5, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: d */
    public static void m8572d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m8575e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: i */
    public static void m8581i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i10, String str, String str2, Object... objArr) {
        if (i10 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w("NK_Logger", "format is null, not log");
            return;
        }
        try {
            m8585m(i10, str, StringUtils.format(str2, objArr));
        } catch (IllegalFormatException e10) {
            m8589w("NK_Logger", "log format error" + str2, e10);
        }
    }

    /* renamed from: v */
    public static void m8586v(String str, Object obj) {
        println(2, str, obj);
    }

    /* renamed from: w */
    public static void m8590w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m8574e(String str, String str2, Throwable th) {
        if (6 < f11638c) {
            return;
        }
        if (m8583k(6)) {
            f11636a.m8563e(m8568a(str), m8569b(str2, 5), m8579i(th));
        }
        if (f11637b) {
            Log.e(m8570c(str), m8569b(str2, 5), m8579i(th));
        }
    }

    /* renamed from: i */
    public static Throwable m8579i(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.m8591a(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    /* renamed from: w */
    public static void m8589w(String str, String str2, Throwable th) {
        if (5 < f11638c) {
            return;
        }
        if (m8583k(5)) {
            f11636a.m8567w(m8568a(str), m8569b(str2, 5), m8579i(th));
        }
        if (f11637b) {
            Log.w(m8570c(str), m8569b(str2, 5), m8579i(th));
        }
    }
}
