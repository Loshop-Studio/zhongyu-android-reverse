package kotlin;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: kotlin.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9923a {

    /* renamed from: kotlin.a$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23279a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.f23256c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.f23257d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.f23258e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23279a = iArr;
        }
    }

    /* renamed from: a */
    public static InterfaceC10773d m20068a(InterfaceC9529a initializer) {
        AbstractC9979u.m20294g(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }

    /* renamed from: b */
    public static InterfaceC10773d m20069b(LazyThreadSafetyMode mode, InterfaceC9529a initializer) {
        AbstractC9979u.m20294g(mode, "mode");
        AbstractC9979u.m20294g(initializer, "initializer");
        int i10 = a.f23279a[mode.ordinal()];
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
}
