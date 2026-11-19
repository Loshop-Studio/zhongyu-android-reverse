package p270v2;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;

/* renamed from: v2.f */
/* loaded from: classes4.dex */
public abstract class AbstractC9758f {

    /* renamed from: a */
    public static boolean f17293a = false;

    /* renamed from: b */
    public static String f17294b = "ULog";

    /* renamed from: c */
    public static int f17295c = 2000;

    /* renamed from: a */
    public static void m16426a(String str) {
        m16427b(f17294b, str, null);
    }

    /* renamed from: b */
    public static void m16427b(String str, String str2, Throwable th) {
        if (f17293a) {
            m16435j(2, str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m16428c(String str, String str2, Throwable th) {
        if (f17293a) {
            m16435j(5, str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m16429d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16428c(f17294b, new Formatter().format(str, objArr).toString(), null);
            } else {
                m16428c(str, objArr != null ? (String) objArr[0] : "", null);
            }
        } catch (Throwable th) {
            m16430e(th);
        }
    }

    /* renamed from: e */
    public static void m16430e(Throwable th) {
        m16428c(f17294b, null, th);
    }

    /* renamed from: f */
    public static String m16431f(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        StringWriter stringWriter2 = null;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable unused) {
                printWriter = null;
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            String string = stringWriter.toString();
            try {
                stringWriter.close();
            } catch (Throwable unused3) {
            }
            printWriter.close();
            return string;
        } catch (Throwable unused4) {
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (Throwable unused5) {
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return "";
        }
    }

    /* renamed from: g */
    public static void m16432g(String str) {
        m16433h(f17294b, str, null);
    }

    /* renamed from: h */
    public static void m16433h(String str, String str2, Throwable th) {
        if (f17293a) {
            m16435j(3, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m16434i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16433h(f17294b, new Formatter().format(str, objArr).toString(), null);
            } else {
                m16433h(str, objArr != null ? (String) objArr[0] : "", null);
            }
        } catch (Throwable th) {
            m16430e(th);
        }
    }

    /* renamed from: j */
    public static void m16435j(int i9, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i10 = f17295c;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= 100) {
                    break;
                }
                if (length > i10) {
                    if (i9 == 1) {
                        str2.substring(i12, i10);
                    } else if (i9 == 2) {
                        str2.substring(i12, i10);
                    } else if (i9 == 3) {
                        Log.i(str, str2.substring(i12, i10));
                    } else if (i9 == 4) {
                        Log.w(str, str2.substring(i12, i10));
                    } else if (i9 == 5) {
                        Log.e(str, str2.substring(i12, i10));
                    }
                    i11++;
                    i12 = i10;
                    i10 = f17295c + i10;
                } else if (i9 == 1 || i9 == 2) {
                    str2.substring(i12, length);
                } else if (i9 == 3) {
                    Log.i(str, str2.substring(i12, length));
                } else if (i9 == 4) {
                    Log.w(str, str2.substring(i12, length));
                } else if (i9 == 5) {
                    Log.e(str, str2.substring(i12, length));
                }
            }
        }
        if (th != null) {
            String strM16431f = m16431f(th);
            if (TextUtils.isEmpty(strM16431f)) {
                return;
            }
            if (i9 == 3) {
                Log.i(str, strM16431f);
            } else if (i9 == 4) {
                Log.w(str, strM16431f);
            } else {
                if (i9 != 5) {
                    return;
                }
                Log.e(str, strM16431f);
            }
        }
    }
}
