package p125h9;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: h9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8746a {

    /* renamed from: a */
    public static Object f16379a;

    /* renamed from: b */
    public static Method f16380b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f16380b = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f16379a = method.invoke(null, null);
            } catch (Throwable th) {
                Log.w("BootstrapClass", "reflect bootstrap failed:", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m14404a(String... strArr) {
        Method method;
        Object obj = f16379a;
        if (obj != null && (method = f16380b) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m14405b() {
        return m14404a("L");
    }
}
