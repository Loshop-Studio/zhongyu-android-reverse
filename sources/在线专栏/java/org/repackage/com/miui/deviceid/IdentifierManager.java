package org.repackage.com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class IdentifierManager {

    /* renamed from: a */
    private static final String f11483a = "IdentifierManager";

    /* renamed from: b */
    private static Object f11484b;

    /* renamed from: c */
    private static Class<?> f11485c;

    /* renamed from: d */
    private static Method f11486d;

    /* renamed from: e */
    private static Method f11487e;

    /* renamed from: f */
    private static Method f11488f;

    /* renamed from: g */
    private static Method f11489g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f11485c = cls;
            f11484b = cls.newInstance();
            f11486d = f11485c.getMethod("getUDID", Context.class);
            f11487e = f11485c.getMethod("getOAID", Context.class);
            f11488f = f11485c.getMethod("getVAID", Context.class);
            f11489g = f11485c.getMethod("getAAID", Context.class);
        } catch (Exception e4) {
            Log.e(f11483a, "reflect exception!", e4);
        }
    }

    /* renamed from: a */
    public static boolean m10056a() {
        return (f11485c == null || f11484b == null) ? false : true;
    }

    /* renamed from: b */
    public static String m10057b(Context context) {
        return m10055a(context, f11487e);
    }

    /* renamed from: c */
    public static String m10058c(Context context) {
        return m10055a(context, f11488f);
    }

    /* renamed from: d */
    public static String m10059d(Context context) {
        return m10055a(context, f11489g);
    }

    /* renamed from: a */
    public static String m10054a(Context context) {
        return m10055a(context, f11486d);
    }

    /* renamed from: a */
    private static String m10055a(Context context, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = f11484b;
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
            Log.e(f11483a, "invoke exception!", e4);
            return null;
        }
    }
}
