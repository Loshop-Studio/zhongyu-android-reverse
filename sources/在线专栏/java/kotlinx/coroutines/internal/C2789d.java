package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import p087f3.InterfaceC2557h0;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes.dex */
public final class C2789d implements InterfaceC2557h0 {

    /* renamed from: a */
    @NotNull
    private final InterfaceC3015g f10752a;

    public C2789d(@NotNull InterfaceC3015g interfaceC3015g) {
        this.f10752a = interfaceC3015g;
    }

    @Override // p087f3.InterfaceC2557h0
    @NotNull
    /* renamed from: e */
    public InterfaceC3015g mo2809e() {
        return this.f10752a;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo2809e() + ')';
    }
}
