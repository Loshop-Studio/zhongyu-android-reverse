package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.InterfaceC5470e;
import coil3.util.LifecyclesKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC10045g;
import p309qc.C10786q;
import p380w.AbstractC11640t;
import p380w.C11627g;
import p380w.InterfaceC11635o;
import p393wc.AbstractC11725a;
import p412y.InterfaceC11880b;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements InterfaceC11635o, DefaultLifecycleObserver {

    /* renamed from: c */
    public final InterfaceC5470e f3894c;

    /* renamed from: d */
    public final C11627g f3895d;

    /* renamed from: e */
    public final InterfaceC11880b f3896e;

    /* renamed from: f */
    public final Lifecycle f3897f;

    /* renamed from: g */
    public final InterfaceC10045g f3898g;

    public ViewTargetRequestDelegate(InterfaceC5470e interfaceC5470e, C11627g c11627g, InterfaceC11880b interfaceC11880b, Lifecycle lifecycle, InterfaceC10045g interfaceC10045g) {
        this.f3894c = interfaceC5470e;
        this.f3895d = c11627g;
        this.f3896e = interfaceC11880b;
        this.f3897f = lifecycle;
        this.f3898g = interfaceC10045g;
    }

    @Override // p380w.InterfaceC11635o
    /* renamed from: a */
    public Object mo3269a(InterfaceC11588c interfaceC11588c) {
        Lifecycle lifecycle = this.f3897f;
        if (lifecycle == null) {
            return C10786q.f26013a;
        }
        Object objM3289a = LifecyclesKt.m3289a(lifecycle, interfaceC11588c);
        return objM3289a == AbstractC11725a.m25952f() ? objM3289a : C10786q.f26013a;
    }

    @Override // p380w.InterfaceC11635o
    /* renamed from: b */
    public void mo3271b() {
        if (this.f3896e.getView().isAttachedToWindow()) {
            return;
        }
        AbstractC11640t.m25757a(this.f3896e.getView()).m3276c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* renamed from: d */
    public void m3272d() {
        Lifecycle lifecycle;
        InterfaceC10045g.a.m20900a(this.f3898g, null, 1, null);
        InterfaceC11880b interfaceC11880b = this.f3896e;
        if ((interfaceC11880b instanceof LifecycleObserver) && (lifecycle = this.f3897f) != null) {
            lifecycle.removeObserver((LifecycleObserver) interfaceC11880b);
        }
        Lifecycle lifecycle2 = this.f3897f;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
    }

    /* renamed from: e */
    public final void m3273e() {
        this.f3894c.mo2978c(this.f3895d);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        AbstractC11640t.m25757a(this.f3896e.getView()).m3274a();
    }

    @Override // p380w.InterfaceC11635o
    public void start() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2 = this.f3897f;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        InterfaceC11880b interfaceC11880b = this.f3896e;
        if ((interfaceC11880b instanceof LifecycleObserver) && (lifecycle = this.f3897f) != null) {
            LifecyclesKt.m3290b(lifecycle, (LifecycleObserver) interfaceC11880b);
        }
        AbstractC11640t.m25757a(this.f3896e.getView()).m3276c(this);
    }
}
