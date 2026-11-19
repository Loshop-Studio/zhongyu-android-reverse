package kotlin;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* renamed from: kotlin.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9078a {

    /* renamed from: kotlin.a$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17366a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.f17343a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.f17344b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.f17345c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17366a = iArr;
        }
    }

    /* renamed from: a */
    public static InterfaceC8724d m15923a(LazyThreadSafetyMode mode, InterfaceC10559a initializer) {
        AbstractC9133u.m16133g(mode, "mode");
        AbstractC9133u.m16133g(initializer, "initializer");
        int i10 = a.f17366a[mode.ordinal()];
        if (i10 == 1) {
            return new SynchronizedLazyImpl(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static InterfaceC8724d m15924b(InterfaceC10559a initializer) {
        AbstractC9133u.m16133g(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }
}
