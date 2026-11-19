package p270v2;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;

/* renamed from: v2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9756d {

    /* renamed from: a */
    public static boolean f17273a = false;

    /* renamed from: b */
    public static String f17274b = "MobclickAgent";

    /* renamed from: c */
    public static int f17275c = 2000;

    /* renamed from: a */
    public static void m16402a(String str) {
        m16403b(f17274b, str, null);
    }

    /* renamed from: b */
    public static void m16403b(String str, String str2, Throwable th) {
        if (f17273a) {
            m16413l(2, str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m16404c(String str) {
        m16405d(f17274b, str, null);
    }

    /* renamed from: d */
    public static void m16405d(String str, String str2, Throwable th) {
        if (f17273a) {
            m16413l(5, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m16406e(String str, Throwable th) {
        m16405d(f17274b, str, th);
    }

    /* renamed from: f */
    public static void m16407f(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16405d(f17274b, new Formatter().format(str, objArr).toString(), null);
            } else {
                m16405d(str, objArr != null ? (String) objArr[0] : "", null);
            }
        } catch (Throwable th) {
            m16408g(th);
        }
    }

    /* renamed from: g */
    public static void m16408g(Throwable th) {
        m16405d(f17274b, null, th);
    }

    /* renamed from: h */
    public static String m16409h(Throwable th) {
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

    /* renamed from: i */
    public static void m16410i(String str, String str2, Throwable th) {
        if (f17273a) {
            m16413l(3, str, str2, th);
        }
    }

    /* renamed from: j */
    public static void m16411j(String str, Throwable th) {
        m16410i(f17274b, str, th);
    }

    /* renamed from: k */
    public static void m16412k(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16410i(f17274b, new Formatter().format(str, objArr).toString(), null);
            } else {
                m16410i(str, objArr != null ? (String) objArr[0] : "", null);
            }
        } catch (Throwable th) {
            m16408g(th);
        }
    }

    /* renamed from: l */
    public static void m16413l(int i9, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i10 = f17275c;
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
                    i10 = f17275c + i10;
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
            String strM16409h = m16409h(th);
            if (TextUtils.isEmpty(strM16409h)) {
                return;
            }
            if (i9 == 3) {
                Log.i(str, strM16409h);
            } else if (i9 == 4) {
                Log.w(str, strM16409h);
            } else {
                if (i9 != 5) {
                    return;
                }
                Log.e(str, strM16409h);
            }
        }
    }

    /* renamed from: m */
    public static void m16414m(String str) {
        m16415n(f17274b, str, null);
    }

    /* renamed from: n */
    public static void m16415n(String str, String str2, Throwable th) {
        if (f17273a) {
            m16413l(4, str, str2, th);
        }
    }

    /* renamed from: o */
    public static void m16416o(String str, Throwable th) {
        m16415n(f17274b, str, th);
    }

    /* renamed from: p */
    public static void m16417p(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16415n(f17274b, new Formatter().format(str, objArr).toString(), null);
            } else {
                m16415n(str, objArr != null ? (String) objArr[0] : "", null);
            }
        } catch (Throwable th) {
            m16408g(th);
        }
    }
}
