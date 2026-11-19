package p076h7;

import androidx.navigation.C2861i;
import androidx.navigation.serialization.C2872b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6008u1;
import kotlinx.coroutines.sync.C6001a;
import p045d6.C5443s;
import p054e7.AbstractC5484p;
import p054e7.C5486r;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

/* renamed from: h7.b */
/* loaded from: classes4.dex */
public final class C5639b implements InterfaceC5895f, InterfaceC6008u1 {

    /* renamed from: a */
    public final C5961g f8767a;

    /* renamed from: b */
    public final /* synthetic */ C6001a f8768b;

    public C5639b(C6001a c6001a, C5961g c5961g) {
        this.f8768b = c6001a;
        this.f8767a = c5961g;
    }

    @Override // kotlinx.coroutines.InterfaceC6008u1
    /* renamed from: a */
    public final void mo4962a(AbstractC5484p abstractC5484p, int i) {
        this.f8767a.mo4962a(abstractC5484p, i);
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: b */
    public final void mo4963b(Object obj, InterfaceC6474f interfaceC6474f) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6001a.f9500h;
        C6001a c6001a = this.f8768b;
        atomicReferenceFieldUpdater.set(c6001a, null);
        this.f8767a.mo4964d(C5443s.f8405a, new C2861i(c6001a, this));
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: d */
    public final void mo4964d(Object obj, InterfaceC6471c interfaceC6471c) {
        this.f8767a.mo4964d((C5443s) obj, interfaceC6471c);
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f8767a.f9451e;
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: i */
    public final boolean mo4965i(Throwable th) {
        return this.f8767a.mo4965i(th);
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    public final boolean isActive() {
        return this.f8767a.isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: m */
    public final void mo4966m(InterfaceC6471c interfaceC6471c) {
        this.f8767a.mo4966m(interfaceC6471c);
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: n */
    public final C5486r mo4967n(Object obj, InterfaceC6474f interfaceC6474f) {
        C6001a c6001a = this.f8768b;
        C2872b c2872b = new C2872b(c6001a, this);
        C5486r c5486rMo4967n = this.f8767a.mo4967n((C5443s) obj, c2872b);
        if (c5486rMo4967n != null) {
            C6001a.f9500h.set(c6001a, null);
        }
        return c5486rMo4967n;
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: r */
    public final void mo4968r(Object obj) {
        this.f8767a.mo4968r(obj);
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        this.f8767a.resumeWith(obj);
    }
}
