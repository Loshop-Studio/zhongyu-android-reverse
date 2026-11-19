package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p087f3.InterfaceC2578m1;

/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a */
    private final InterfaceC0501i f3356a;

    /* renamed from: b */
    private final AbstractC0496f f3357b;

    /* renamed from: c */
    private final AbstractC0496f.c f3358c;

    /* renamed from: d */
    private final C0490c f3359d;

    public LifecycleController(@NotNull AbstractC0496f lifecycle, @NotNull AbstractC0496f.c minState, @NotNull C0490c dispatchQueue, @NotNull final InterfaceC2578m1 parentJob) {
        C2769l.m9241e(lifecycle, "lifecycle");
        C2769l.m9241e(minState, "minState");
        C2769l.m9241e(dispatchQueue, "dispatchQueue");
        C2769l.m9241e(parentJob, "parentJob");
        this.f3357b = lifecycle;
        this.f3358c = minState;
        this.f3359d = dispatchQueue;
        InterfaceC0501i interfaceC0501i = new InterfaceC0501i() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public final void mo63d(@NotNull InterfaceC0504l source, @NotNull AbstractC0496f.b bVar) {
                C2769l.m9241e(source, "source");
                C2769l.m9241e(bVar, "<anonymous parameter 1>");
                AbstractC0496f lifecycle2 = source.getLifecycle();
                C2769l.m9240d(lifecycle2, "source.lifecycle");
                if (lifecycle2.mo2868b() == AbstractC0496f.c.DESTROYED) {
                    LifecycleController lifecycleController = this.f3360a;
                    InterfaceC2578m1.a.m8633a(parentJob, null, 1, null);
                    lifecycleController.m2808c();
                } else {
                    AbstractC0496f lifecycle3 = source.getLifecycle();
                    C2769l.m9240d(lifecycle3, "source.lifecycle");
                    if (lifecycle3.mo2868b().compareTo(this.f3360a.f3358c) < 0) {
                        this.f3360a.f3359d.m2848g();
                    } else {
                        this.f3360a.f3359d.m2849h();
                    }
                }
            }
        };
        this.f3356a = interfaceC0501i;
        if (lifecycle.mo2868b() != AbstractC0496f.c.DESTROYED) {
            lifecycle.mo2867a(interfaceC0501i);
        } else {
            InterfaceC2578m1.a.m8633a(parentJob, null, 1, null);
            m2808c();
        }
    }

    /* renamed from: c */
    public final void m2808c() {
        this.f3357b.mo2869c(this.f3356a);
        this.f3359d.m2847f();
    }
}
