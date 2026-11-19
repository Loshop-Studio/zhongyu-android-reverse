package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: f3.j1 */
/* loaded from: classes.dex */
final class C2566j1 extends AbstractC2564j {

    /* renamed from: a */
    @NotNull
    private final InterfaceC3470l<Throwable, C2925r> f10253a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2566j1(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        this.f10253a = interfaceC3470l;
    }

    @Override // p087f3.AbstractC2568k
    /* renamed from: a */
    public void mo8585a(@Nullable Throwable th) {
        this.f10253a.invoke(th);
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8585a(th);
        return C2925r.f11415a;
    }

    @NotNull
    public String toString() {
        return "InvokeOnCancel[" + C2573l0.m8591a(this.f10253a) + '@' + C2573l0.m8592b(this) + ']';
    }
}
