package p087f3;

import kotlinx.coroutines.internal.C2789d;
import org.jetbrains.annotations.NotNull;
import p142q2.InterfaceC3015g;

/* renamed from: f3.i0 */
/* loaded from: classes.dex */
public final class C2561i0 {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC2557h0 m8576a(@NotNull InterfaceC3015g interfaceC3015g) {
        if (interfaceC3015g.get(InterfaceC2578m1.f10268P) == null) {
            interfaceC3015g = interfaceC3015g.plus(C2594r1.m8657b(null, 1, null));
        }
        return new C2789d(interfaceC3015g);
    }

    /* renamed from: b */
    public static final boolean m8577b(@NotNull InterfaceC2557h0 interfaceC2557h0) {
        InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) interfaceC2557h0.mo2809e().get(InterfaceC2578m1.f10268P);
        if (interfaceC2578m1 == null) {
            return true;
        }
        return interfaceC2578m1.isActive();
    }
}
