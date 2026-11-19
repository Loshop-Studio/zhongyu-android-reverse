package p245s7;

import kotlin.random.Random;
import p039c8.C5274a;
import p234r7.AbstractC9941a;

/* renamed from: s7.a */
/* loaded from: classes5.dex */
public class C10050a extends AbstractC9941a {

    /* renamed from: s7.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f20104a = new a();

        /* renamed from: b */
        public static final Integer f20105b;

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
            f20105b = num;
        }
    }

    @Override // p223q7.AbstractC9842a
    /* renamed from: b */
    public Random mo18365b() {
        return m18755c(34) ? new C5274a() : super.mo18365b();
    }

    /* renamed from: c */
    public final boolean m18755c(int i10) {
        Integer num = a.f20105b;
        return num == null || num.intValue() >= i10;
    }
}
