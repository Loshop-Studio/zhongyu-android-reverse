package ie;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: ie.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9630a {

    /* renamed from: a */
    public static Object f22162a;

    /* renamed from: b */
    public static Method f22163b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f22163b = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f22162a = method.invoke(null, null);
            } catch (Throwable th) {
                Log.w("BootstrapClass", "reflect bootstrap failed:", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m18885a(String... strArr) {
        Method method;
        Object obj = f22162a;
        if (obj != null && (method = f22163b) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m18886b() {
        return m18885a("L");
    }
}
