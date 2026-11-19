package org.repackage.com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class IdentifierManager {

    /* renamed from: a */
    private static final String f16024a = "IdentifierManager";

    /* renamed from: b */
    private static Object f16025b;

    /* renamed from: c */
    private static Class<?> f16026c;

    /* renamed from: d */
    private static Method f16027d;

    /* renamed from: e */
    private static Method f16028e;

    /* renamed from: f */
    private static Method f16029f;

    /* renamed from: g */
    private static Method f16030g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f16026c = cls;
            f16025b = cls.newInstance();
            f16027d = f16026c.getMethod("getUDID", Context.class);
            f16028e = f16026c.getMethod("getOAID", Context.class);
            f16029f = f16026c.getMethod("getVAID", Context.class);
            f16030g = f16026c.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            Log.e(f16024a, "reflect exception!", e10);
        }
    }

    /* renamed from: a */
    public static boolean m15103a() {
        return (f16026c == null || f16025b == null) ? false : true;
    }

    /* renamed from: b */
    public static String m15104b(Context context) {
        return m15102a(context, f16028e);
    }

    /* renamed from: c */
    public static String m15105c(Context context) {
        return m15102a(context, f16029f);
    }

    /* renamed from: d */
    public static String m15106d(Context context) {
        return m15102a(context, f16030g);
    }

    /* renamed from: a */
    public static String m15101a(Context context) {
        return m15102a(context, f16027d);
    }

    /* renamed from: a */
    private static String m15102a(Context context, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = f16025b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e10) {
            Log.e(f16024a, "invoke exception!", e10);
            return null;
        }
    }
}
