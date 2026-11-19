package p265nd;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: nd.n */
/* loaded from: classes6.dex */
public abstract class AbstractC10409n {
    /* renamed from: a */
    public static final void m21748a(boolean z10, Number step) {
        AbstractC9979u.m20294g(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* renamed from: b */
    public static InterfaceC10401f m21749b(float f10, float f11) {
        return new C10400e(f10, f11);
    }
}
