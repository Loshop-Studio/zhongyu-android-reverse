package ad;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9979u;
import p439zc.AbstractC12037a;

/* renamed from: ad.a */
/* loaded from: classes6.dex */
public abstract class AbstractC0104a extends AbstractC12037a {

    /* renamed from: ad.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f112a = new a();

        /* renamed from: b */
        public static final Integer f113b;

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
            f113b = num;
        }
    }

    /* renamed from: c */
    private final boolean m277c(int i10) {
        Integer num = a.f113b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p439zc.AbstractC12037a
    /* renamed from: a */
    public void mo278a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(cause, "cause");
        AbstractC9979u.m20294g(exception, "exception");
        if (m277c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo278a(cause, exception);
        }
    }
}
