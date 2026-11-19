package p154k2;

import android.content.Context;
import java.lang.reflect.Method;
import p260u2.AbstractC9667b;
import p310z2.AbstractC9993d;

/* renamed from: k2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8267e {

    /* renamed from: a */
    public static Class f14378a;

    /* renamed from: b */
    public static Method f14379b;

    static {
        try {
            int i9 = AbstractC8266d.f14377a;
            f14378a = AbstractC8266d.class;
            Method declaredMethod = AbstractC8266d.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                f14379b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m13337a(Context context) {
        Method method;
        if (context == null || !AbstractC9993d.m17334s(context)) {
            return;
        }
        if (AbstractC9667b.f17073a == 1) {
            AbstractC8265c.m13336b(context);
            return;
        }
        Class cls = f14378a;
        if (cls == null || (method = f14379b) == null) {
            return;
        }
        try {
            method.invoke(cls, context);
        } catch (Throwable unused) {
        }
    }
}
