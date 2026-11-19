package p077d8;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: d8.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8322g {
    /* renamed from: a */
    public static final void m13506a(boolean z10, Number step) {
        AbstractC9133u.m16133g(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* renamed from: b */
    public static InterfaceC8317b m13507b(float f10, float f11) {
        return new C8316a(f10, f11);
    }
}
