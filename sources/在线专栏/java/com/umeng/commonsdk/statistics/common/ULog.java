package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
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
    public static void m7599d(Locale locale, String str, Object... objArr) {
        try {
            m7595d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: e */
    public static void m7605e(Locale locale, String str, Object... objArr) {
        try {
            m7601e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7604e(th);
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
    public static void m7611i(Locale locale, String str, Object... objArr) {
        try {
            m7607i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7604e(th);
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
                        Log.v(str, str2.substring(i7, i5));
                    } else if (i4 == 2) {
                        Log.d(str, str2.substring(i7, i5));
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
                } else if (i4 == 1) {
                    Log.v(str, str2.substring(i7, length));
                } else if (i4 == 2) {
                    Log.d(str, str2.substring(i7, length));
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
            if (i4 == 1) {
                Log.v(str, stackTrace);
                return;
            }
            if (i4 == 2) {
                Log.d(str, stackTrace);
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
    public static void m7617v(Locale locale, String str, Object... objArr) {
        try {
            m7613v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: w */
    public static void m7623w(Locale locale, String str, Object... objArr) {
        try {
            m7619w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: d */
    public static void m7597d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7595d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7595d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: e */
    public static void m7603e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7601e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7601e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: i */
    public static void m7609i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7607i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7607i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: v */
    public static void m7615v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7613v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7613v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: w */
    public static void m7621w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7619w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7619w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7604e(th);
        }
    }

    /* renamed from: d */
    public static void m7598d(Throwable th) {
        m7595d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m7604e(Throwable th) {
        m7601e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m7610i(Throwable th) {
        m7607i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m7616v(Throwable th) {
        m7613v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m7622w(Throwable th) {
        m7619w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m7596d(String str, Throwable th) {
        m7595d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m7602e(String str, Throwable th) {
        m7601e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m7608i(String str, Throwable th) {
        m7607i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m7614v(String str, Throwable th) {
        m7613v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m7620w(String str, Throwable th) {
        m7619w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m7594d(String str) {
        m7595d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m7600e(String str) {
        m7601e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m7606i(String str) {
        m7607i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m7612v(String str) {
        m7613v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m7618w(String str) {
        m7619w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m7595d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m7601e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m7607i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m7613v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m7619w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
