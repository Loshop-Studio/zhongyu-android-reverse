package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MLog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "MobclickAgent";

    private MLog() {
    }

    /* renamed from: d */
    public static void m3646d(Locale locale, String str, Object... objArr) {
        try {
            m3642d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: e */
    public static void m3652e(Locale locale, String str, Object... objArr) {
        try {
            m3648e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    public static String getStackTrace(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter = null;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    stringWriter2.flush();
                    String string = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                    } catch (Throwable unused) {
                    }
                    printWriter.close();
                    return string;
                } catch (Throwable unused2) {
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    return "";
                }
            } catch (Throwable unused4) {
                printWriter = null;
            }
        } catch (Throwable unused5) {
            printWriter = null;
        }
    }

    /* renamed from: i */
    public static void m3658i(Locale locale, String str, Object... objArr) {
        try {
            m3654i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    private static void print(int i4, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i5 = LOG_MAXLENGTH;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 >= 100) {
                    break;
                }
                if (length > i5) {
                    if (i4 == 1) {
                        str2.substring(i7, i5);
                    } else if (i4 == 2) {
                        str2.substring(i7, i5);
                    } else if (i4 == 3) {
                        Log.i(str, str2.substring(i7, i5));
                    } else if (i4 == 4) {
                        Log.w(str, str2.substring(i7, i5));
                    } else if (i4 == 5) {
                        Log.e(str, str2.substring(i7, i5));
                    }
                    i6++;
                    i7 = i5;
                    i5 = LOG_MAXLENGTH + i5;
                } else if (i4 == 1 || i4 == 2) {
                    str2.substring(i7, length);
                } else if (i4 == 3) {
                    Log.i(str, str2.substring(i7, length));
                } else if (i4 == 4) {
                    Log.w(str, str2.substring(i7, length));
                } else if (i4 == 5) {
                    Log.e(str, str2.substring(i7, length));
                }
            }
        }
        if (th != null) {
            String stackTrace = getStackTrace(th);
            if (TextUtils.isEmpty(stackTrace)) {
                return;
            }
            if (i4 == 3) {
                Log.i(str, stackTrace);
            } else if (i4 == 4) {
                Log.w(str, stackTrace);
            } else {
                if (i4 != 5) {
                    return;
                }
                Log.e(str, stackTrace);
            }
        }
    }

    /* renamed from: v */
    public static void m3664v(Locale locale, String str, Object... objArr) {
        try {
            m3660v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: w */
    public static void m3670w(Locale locale, String str, Object... objArr) {
        try {
            m3666w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: d */
    public static void m3644d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3642d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3642d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: e */
    public static void m3650e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3648e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3648e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: i */
    public static void m3656i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3654i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3654i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: v */
    public static void m3662v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3660v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3660v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: w */
    public static void m3668w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3666w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3666w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3651e(th);
        }
    }

    /* renamed from: d */
    public static void m3645d(Throwable th) {
        m3642d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m3651e(Throwable th) {
        m3648e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m3657i(Throwable th) {
        m3654i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m3663v(Throwable th) {
        m3660v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m3669w(Throwable th) {
        m3666w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m3643d(String str, Throwable th) {
        m3642d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m3649e(String str, Throwable th) {
        m3648e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m3655i(String str, Throwable th) {
        m3654i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m3661v(String str, Throwable th) {
        m3660v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m3667w(String str, Throwable th) {
        m3666w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m3641d(String str) {
        m3642d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m3647e(String str) {
        m3648e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m3653i(String str) {
        m3654i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m3659v(String str) {
        m3660v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m3665w(String str) {
        m3666w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m3642d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m3648e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m3654i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m3660v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m3666w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
