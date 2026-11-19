package p129j2;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: j2.h */
/* loaded from: classes4.dex */
public abstract class AbstractC7788h {

    /* renamed from: a */
    public static boolean f13432a = false;

    /* renamed from: b */
    public static boolean f13433b = false;

    /* renamed from: a */
    public static StackTraceElement m13175a() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(AbstractC7788h.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m13176b(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    /* renamed from: c */
    public static String m13177c(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb.append(m13176b(objArr[i10], objArr[i11]));
                if (i11 < length - 1) {
                    sb.append(",");
                }
                i10 += 2;
            }
            if (i10 == objArr.length - 1) {
                sb.append(objArr[i10]);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m13178d(String str, Throwable th, Object... objArr) {
        if (f13432a) {
            Log.e(m13184j(), m13177c(str, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m13179e(String str, Object... objArr) {
        if (f13432a) {
            m13184j();
            m13177c(str, objArr);
        }
    }

    /* renamed from: f */
    public static void m13180f(String str, Throwable th, Object... objArr) {
        if (f13433b) {
            Log.e(m13184j(), m13177c(str, objArr), th);
        }
    }

    /* renamed from: g */
    public static void m13181g(String str, Object... objArr) {
        if (f13433b) {
            m13184j();
            m13177c(str, objArr);
        }
    }

    /* renamed from: h */
    public static boolean m13182h() {
        return f13432a;
    }

    /* renamed from: i */
    public static void m13183i() {
        if (f13432a) {
            m13184j();
            m13177c(null, new Object[0]);
        }
    }

    /* renamed from: j */
    public static String m13184j() {
        String methodName;
        String strSubstring;
        StackTraceElement stackTraceElementM13175a = m13175a();
        if (stackTraceElementM13175a != null) {
            String className = stackTraceElementM13175a.getClassName();
            strSubstring = !TextUtils.isEmpty(className) ? className.substring(className.lastIndexOf(46) + 1) : "";
            methodName = stackTraceElementM13175a.getMethodName();
        } else {
            methodName = "";
            strSubstring = methodName;
        }
        return "Utdid." + strSubstring + "." + methodName + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }
}
