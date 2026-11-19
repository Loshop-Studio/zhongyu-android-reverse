package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: f3.l1 */
/* loaded from: classes.dex */
final class C2574l1 extends AbstractC2597s1 {

    /* renamed from: e */
    @NotNull
    private final InterfaceC3470l<Throwable, C2925r> f10259e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2574l1(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        this.f10259e = interfaceC3470l;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8502s(th);
        return C2925r.f11415a;
    }

    @Override // p087f3.AbstractC2529a0
    /* renamed from: s */
    public void mo8502s(@Nullable Throwable th) {
        this.f10259e.invoke(th);
    }
}
