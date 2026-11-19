package kotlin;

import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.AbstractC5430f;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

/* renamed from: kotlin.a */
/* loaded from: classes.dex */
public abstract class AbstractC5773a {
    /* renamed from: a */
    public static InterfaceC5429e m5116a(LazyThreadSafetyMode mode, InterfaceC6469a initializer) {
        AbstractC5830k.m5330g(mode, "mode");
        AbstractC5830k.m5330g(initializer, "initializer");
        int i = AbstractC5430f.f8392a[mode.ordinal()];
        int i8 = 2;
        if (i == 1) {
            AbstractC5824e abstractC5824e = null;
            return new SynchronizedLazyImpl(initializer, abstractC5824e, i8, abstractC5824e);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static InterfaceC5429e m5117b(InterfaceC6469a initializer) {
        AbstractC5830k.m5330g(initializer, "initializer");
        AbstractC5824e abstractC5824e = null;
        return new SynchronizedLazyImpl(initializer, abstractC5824e, 2, abstractC5824e);
    }
}
