package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;

/* renamed from: f3.r */
/* loaded from: classes.dex */
public final class C2592r extends AbstractC2585o1 implements InterfaceC2589q {

    /* renamed from: e */
    @NotNull
    public final InterfaceC2595s f10277e;

    public C2592r(@NotNull InterfaceC2595s interfaceC2595s) {
        this.f10277e = interfaceC2595s;
    }

    @Override // p087f3.InterfaceC2589q
    /* renamed from: e */
    public boolean mo8647e(@NotNull Throwable th) {
        return m8666t().mo8552C(th);
    }

    @Override // p087f3.InterfaceC2589q
    @NotNull
    public InterfaceC2578m1 getParent() {
        return m8666t();
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8502s(th);
        return C2925r.f11415a;
    }

    @Override // p087f3.AbstractC2529a0
    /* renamed from: s */
    public void mo8502s(@Nullable Throwable th) {
        this.f10277e.mo8662b(m8666t());
    }
}
