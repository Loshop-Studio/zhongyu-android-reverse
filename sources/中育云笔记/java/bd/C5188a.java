package bd;

import ad.AbstractC0104a;
import kotlin.random.Random;
import md.C10260a;

/* renamed from: bd.a */
/* loaded from: classes6.dex */
public class C5188a extends AbstractC0104a {

    /* renamed from: bd.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f3052a = new a();

        /* renamed from: b */
        public static final Integer f3053b;

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
            f3053b = num;
        }
    }

    @Override // p439zc.AbstractC12037a
    /* renamed from: b */
    public Random mo2739b() {
        return m2740c(34) ? new C10260a() : super.mo2739b();
    }

    /* renamed from: c */
    public final boolean m2740c(int i10) {
        Integer num = a.f3053b;
        return num == null || num.intValue() >= i10;
    }
}
