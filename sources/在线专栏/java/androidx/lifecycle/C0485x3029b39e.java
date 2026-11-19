package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p087f3.InterfaceC2572l;
import p128o2.C2919l;
import p128o2.C2920m;
import p171x2.InterfaceC3459a;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes.dex */
public final class C0485x3029b39e implements InterfaceC0501i {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2572l f3385a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0496f f3386b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0496f.c f3387c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC3459a f3388d;

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(@NotNull InterfaceC0504l source, @NotNull AbstractC0496f.b event) {
        Object objM9989a;
        C2769l.m9241e(source, "source");
        C2769l.m9241e(event, "event");
        if (event != AbstractC0496f.b.m2872d(this.f3387c)) {
            if (event == AbstractC0496f.b.ON_DESTROY) {
                this.f3386b.mo2869c(this);
                InterfaceC2572l interfaceC2572l = this.f3385a;
                C0500h c0500h = new C0500h();
                C2919l.a aVar = C2919l.f11409a;
                interfaceC2572l.resumeWith(C2919l.m9989a(C2920m.m9993a(c0500h)));
                return;
            }
            return;
        }
        this.f3386b.mo2869c(this);
        InterfaceC2572l interfaceC2572l2 = this.f3385a;
        InterfaceC3459a interfaceC3459a = this.f3388d;
        try {
            C2919l.a aVar2 = C2919l.f11409a;
            objM9989a = C2919l.m9989a(interfaceC3459a.invoke());
        } catch (Throwable th) {
            C2919l.a aVar3 = C2919l.f11409a;
            objM9989a = C2919l.m9989a(C2920m.m9993a(th));
        }
        interfaceC2572l2.resumeWith(objM9989a);
    }
}
