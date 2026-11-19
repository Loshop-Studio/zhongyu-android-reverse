package p078i1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p185v7.AbstractC6675d;

/* renamed from: i1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5673c {

    /* renamed from: a */
    public static final AbstractC6675d f8842a;

    static {
        AbstractC6675d c5671a;
        try {
            c5671a = new C5672b();
        } catch (ReflectiveOperationException unused) {
            c5671a = new C5671a();
        }
        f8842a = c5671a;
    }

    /* renamed from: a */
    public static void m5005a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    /* renamed from: b */
    public static String m5006b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m5005a(constructor, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m5007c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* renamed from: d */
    public static String m5008d(AccessibleObject accessibleObject, boolean z8) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m5007c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m5005a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m5006b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z8 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: e */
    public static String m5009e(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* renamed from: f */
    public static void m5010f(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Failed making ", m5008d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbM100y.append(m5009e(e));
            throw new JsonIOException(sbM100y.toString(), e);
        }
    }
}
