package p234r7;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9133u;
import p223q7.AbstractC9842a;

/* renamed from: r7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9941a extends AbstractC9842a {

    /* renamed from: r7.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f19912a = new a();

        /* renamed from: b */
        public static final Integer f19913b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f19913b = num;
        }
    }

    /* renamed from: c */
    private final boolean m18566c(int i10) {
        Integer num = a.f19913b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p223q7.AbstractC9842a
    /* renamed from: a */
    public void mo18364a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(cause, "cause");
        AbstractC9133u.m16133g(exception, "exception");
        if (m18566c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo18364a(cause, exception);
        }
    }
}
