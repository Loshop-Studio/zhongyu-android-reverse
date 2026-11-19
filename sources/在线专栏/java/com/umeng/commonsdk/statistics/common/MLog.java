package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
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
    public static void m7569d(Locale locale, String str, Object... objArr) {
        try {
            m7565d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: e */
    public static void m7575e(Locale locale, String str, Object... objArr) {
        try {
            m7571e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7574e(th);
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
    public static void m7581i(Locale locale, String str, Object... objArr) {
        try {
            m7577i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7574e(th);
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
    public static void m7587v(Locale locale, String str, Object... objArr) {
        try {
            m7583v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: w */
    public static void m7593w(Locale locale, String str, Object... objArr) {
        try {
            m7589w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: d */
    public static void m7567d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7565d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7565d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: e */
    public static void m7573e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7571e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7571e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: i */
    public static void m7579i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7577i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7577i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: v */
    public static void m7585v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7583v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7583v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: w */
    public static void m7591w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m7589w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m7589w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m7574e(th);
        }
    }

    /* renamed from: d */
    public static void m7568d(Throwable th) {
        m7565d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m7574e(Throwable th) {
        m7571e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m7580i(Throwable th) {
        m7577i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m7586v(Throwable th) {
        m7583v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m7592w(Throwable th) {
        m7589w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m7566d(String str, Throwable th) {
        m7565d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m7572e(String str, Throwable th) {
        m7571e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m7578i(String str, Throwable th) {
        m7577i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m7584v(String str, Throwable th) {
        m7583v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m7590w(String str, Throwable th) {
        m7589w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m7564d(String str) {
        m7565d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m7570e(String str) {
        m7571e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m7576i(String str) {
        m7577i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m7582v(String str) {
        m7583v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m7588w(String str) {
        m7589w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m7565d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m7571e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m7577i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m7583v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m7589w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
