package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.util.LifecyclesKt;
import kotlinx.coroutines.InterfaceC10045g;
import p309qc.C10786q;
import p380w.InterfaceC11635o;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class LifecycleRequestDelegate implements InterfaceC11635o, DefaultLifecycleObserver {

    /* renamed from: c */
    public final Lifecycle f3892c;

    /* renamed from: d */
    public final InterfaceC10045g f3893d;

    public LifecycleRequestDelegate(Lifecycle lifecycle, InterfaceC10045g interfaceC10045g) {
        this.f3892c = lifecycle;
        this.f3893d = interfaceC10045g;
    }

    @Override // p380w.InterfaceC11635o
    /* renamed from: a */
    public Object mo3269a(InterfaceC11588c interfaceC11588c) {
        Object objM3289a = LifecyclesKt.m3289a(this.f3892c, interfaceC11588c);
        return objM3289a == AbstractC11725a.m25952f() ? objM3289a : C10786q.f26013a;
    }

    @Override // p380w.InterfaceC11635o
    public void complete() {
        this.f3892c.removeObserver(this);
    }

    /* renamed from: d */
    public void m3270d() {
        InterfaceC10045g.a.m20900a(this.f3893d, null, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        m3270d();
    }

    @Override // p380w.InterfaceC11635o
    public void start() {
        this.f3892c.addObserver(this);
    }
}
