package p087f3;

import org.jetbrains.annotations.NotNull;
import p142q2.InterfaceC3015g;

/* renamed from: f3.j2 */
/* loaded from: classes.dex */
public final class C2567j2 extends AbstractC2545e0 {

    /* renamed from: b */
    @NotNull
    public static final C2567j2 f10254b = new C2567j2();

    private C2567j2() {
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        C2579m2 c2579m2 = (C2579m2) interfaceC3015g.get(C2579m2.f10270b);
        if (c2579m2 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c2579m2.f10271a = true;
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: K */
    public boolean mo2906K(@NotNull InterfaceC3015g interfaceC3015g) {
        return false;
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
