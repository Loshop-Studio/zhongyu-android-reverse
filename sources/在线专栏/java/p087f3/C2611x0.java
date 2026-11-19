package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;

/* renamed from: f3.x0 */
/* loaded from: classes.dex */
final class C2611x0 extends AbstractC2564j {

    /* renamed from: a */
    @NotNull
    private final InterfaceC2608w0 f10314a;

    public C2611x0(@NotNull InterfaceC2608w0 interfaceC2608w0) {
        this.f10314a = interfaceC2608w0;
    }

    @Override // p087f3.AbstractC2568k
    /* renamed from: a */
    public void mo8585a(@Nullable Throwable th) {
        this.f10314a.mo8520b();
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8585a(th);
        return C2925r.f11415a;
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f10314a + ']';
    }
}
