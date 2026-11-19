package p176m2;

import android.util.Log;
import p310z2.AbstractC9993d;

/* renamed from: m2.h */
/* loaded from: classes4.dex */
public abstract class AbstractC8959h {
    /* renamed from: a */
    public static void m14291a(String str, String str2) {
        if (m14294d()) {
            m14295e(str2, false);
        }
    }

    /* renamed from: b */
    public static void m14292b(String str, String str2) {
        if (m14294d()) {
            Log.e(str, m14295e(str2, false));
        }
    }

    /* renamed from: c */
    public static void m14293c(String str, String str2) {
        if (m14294d()) {
            Log.i(str, m14295e(str2, false));
        }
    }

    /* renamed from: d */
    public static boolean m14294d() {
        return "1".equals(AbstractC9993d.m17330o("debug.umeng.rtlog", "0"));
    }

    /* renamed from: e */
    public static String m14295e(String str, boolean z9) {
        StringBuffer stringBuffer;
        if (!z9) {
            return str;
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                stringBuffer = new StringBuffer();
                stringBuffer.append("<");
                stringBuffer.append(fileName);
                stringBuffer.append(":");
                stringBuffer.append(methodName);
                stringBuffer.append(":");
                stringBuffer.append(lineNumber);
                stringBuffer.append("> ");
                stringBuffer.append(str);
            } else {
                stringBuffer = null;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
