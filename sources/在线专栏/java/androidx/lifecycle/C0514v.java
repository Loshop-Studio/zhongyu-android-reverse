package androidx.lifecycle;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p087f3.AbstractC2545e0;
import p087f3.C2605v0;
import p142q2.InterfaceC3015g;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C0514v extends AbstractC2545e0 {

    /* renamed from: b */
    @NotNull
    public final C0490c f3449b = new C0490c();

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g context, @NotNull Runnable block) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(block, "block");
        this.f3449b.m2845c(context, block);
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: K */
    public boolean mo2906K(@NotNull InterfaceC3015g context) {
        C2769l.m9241e(context, "context");
        if (C2605v0.m8752c().mo8757L().mo2906K(context)) {
            return true;
        }
        return !this.f3449b.m2844b();
    }
}
