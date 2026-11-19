package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ULog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "ULog";

    private ULog() {
    }

    /* renamed from: d */
    public static void m3676d(Locale locale, String str, Object... objArr) {
        try {
            m3672d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: e */
    public static void m3682e(Locale locale, String str, Object... objArr) {
        try {
            m3678e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3681e(th);
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
    public static void m3688i(Locale locale, String str, Object... objArr) {
        try {
            m3684i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3681e(th);
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
    public static void m3694v(Locale locale, String str, Object... objArr) {
        try {
            m3690v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: w */
    public static void m3700w(Locale locale, String str, Object... objArr) {
        try {
            m3696w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: d */
    public static void m3674d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3672d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3672d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: e */
    public static void m3680e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3678e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3678e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: i */
    public static void m3686i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3684i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3684i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: v */
    public static void m3692v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3690v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3690v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: w */
    public static void m3698w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m3696w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m3696w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m3681e(th);
        }
    }

    /* renamed from: d */
    public static void m3675d(Throwable th) {
        m3672d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m3681e(Throwable th) {
        m3678e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m3687i(Throwable th) {
        m3684i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m3693v(Throwable th) {
        m3690v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m3699w(Throwable th) {
        m3696w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m3673d(String str, Throwable th) {
        m3672d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m3679e(String str, Throwable th) {
        m3678e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m3685i(String str, Throwable th) {
        m3684i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m3691v(String str, Throwable th) {
        m3690v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m3697w(String str, Throwable th) {
        m3696w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m3671d(String str) {
        m3672d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m3677e(String str) {
        m3678e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m3683i(String str) {
        m3684i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m3689v(String str) {
        m3690v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m3695w(String str) {
        m3696w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m3672d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m3678e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m3684i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m3690v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m3696w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
