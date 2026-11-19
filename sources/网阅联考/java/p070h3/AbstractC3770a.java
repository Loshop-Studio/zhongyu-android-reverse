package p070h3;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3770a {

    /* renamed from: a */
    public static Object f4457a;

    /* renamed from: b */
    public static Class f4458b;

    /* renamed from: c */
    public static Method f4459c;

    /* renamed from: d */
    public static Method f4460d;

    /* renamed from: e */
    public static Method f4461e;

    /* renamed from: f */
    public static Method f4462f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f4458b = cls;
            f4457a = cls.newInstance();
            f4459c = f4458b.getMethod("getUDID", Context.class);
            f4460d = f4458b.getMethod("getOAID", Context.class);
            f4461e = f4458b.getMethod("getVAID", Context.class);
            f4462f = f4458b.getMethod("getAAID", Context.class);
        } catch (Exception e4) {
            Log.e("IdentifierManager", "reflect exception!", e4);
        }
    }

    /* renamed from: a */
    public static String m4872a(Context context, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = f4457a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e4) {
            Log.e("IdentifierManager", "invoke exception!", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m4873b() {
        return (f4458b == null || f4457a == null) ? false : true;
    }

    /* renamed from: c */
    public static String m4874c(Context context) {
        return m4872a(context, f4460d);
    }
}
