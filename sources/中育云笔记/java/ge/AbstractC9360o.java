package ge;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* renamed from: ge.o */
/* loaded from: classes6.dex */
public abstract class AbstractC9360o {

    /* renamed from: a */
    public static final boolean f21773a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f21773a = z10;
    }

    /* renamed from: a */
    public static final InterfaceC9363o2 m18506a(InterfaceC9540l factory) {
        AbstractC9979u.m20294g(factory, "factory");
        return f21773a ? new C9380t(factory) : new C9400y(factory);
    }

    /* renamed from: b */
    public static final InterfaceC9390v1 m18507b(InterfaceC9544p factory) {
        AbstractC9979u.m20294g(factory, "factory");
        return f21773a ? new C9384u(factory) : new C9404z(factory);
    }
}
