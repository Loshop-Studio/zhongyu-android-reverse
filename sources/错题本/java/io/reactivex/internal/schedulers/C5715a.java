package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6438i;
import p159s5.C6558a;
import p159s5.InterfaceC6559b;

/* renamed from: io.reactivex.internal.schedulers.a */
/* loaded from: classes.dex */
public final class C5715a extends AbstractC6438i {

    /* renamed from: a */
    public final C6558a f9016a;

    /* renamed from: b */
    public final C6558a f9017b;

    /* renamed from: c */
    public final C6558a f9018c;

    /* renamed from: d */
    public final C5717c f9019d;

    /* renamed from: e */
    public volatile boolean f9020e;

    public C5715a(C5717c c5717c) {
        this.f9019d = c5717c;
        C6558a c6558a = new C6558a(1);
        this.f9016a = c6558a;
        C6558a c6558a2 = new C6558a(0);
        this.f9017b = c6558a2;
        C6558a c6558a3 = new C6558a(1);
        this.f9018c = c6558a3;
        c6558a3.mo6200a(c6558a);
        c6558a3.mo6200a(c6558a2);
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: a */
    public final InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit) {
        return this.f9020e ? EmptyDisposable.INSTANCE : this.f9019d.m5088c(runnable, TimeUnit.NANOSECONDS, this.f9017b);
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: b */
    public final void mo5085b(Runnable runnable) {
        if (this.f9020e) {
            return;
        }
        this.f9019d.m5088c(runnable, TimeUnit.MILLISECONDS, this.f9016a);
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        if (this.f9020e) {
            return;
        }
        this.f9020e = true;
        this.f9018c.dispose();
    }
}
