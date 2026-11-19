package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5863a;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5868b1;
import kotlinx.coroutines.C5871c1;
import kotlinx.coroutines.C5989p;
import kotlinx.coroutines.JobCancellationException;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import retrofit2.C6520t;

/* renamed from: kotlinx.coroutines.channels.l */
/* loaded from: classes4.dex */
public final class C5883l extends AbstractC5863a implements InterfaceC5884m, InterfaceC5876e {

    /* renamed from: d */
    public final C5873b f9333d;

    public C5883l(InterfaceC5636h interfaceC5636h, C5873b c5873b) {
        super(interfaceC5636h, true);
        this.f9333d = c5873b;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: a */
    public final Object mo5481a(Object obj) {
        return this.f9333d.mo5481a(obj);
    }

    @Override // kotlinx.coroutines.AbstractC5863a
    /* renamed from: a0 */
    public final void mo5422a0(boolean z8, Throwable th) {
        if (this.f9333d.m5483f(false, th) || z8) {
            return;
        }
        AbstractC6014x.m5645p(this.f9276c, th);
    }

    @Override // kotlinx.coroutines.AbstractC5863a
    /* renamed from: b0 */
    public final void mo5423b0(Object obj) {
        this.f9333d.mo5489l(null);
    }

    /* renamed from: c0 */
    public final void m5513c0(C6520t c6520t) {
        C5873b c5873b = this.f9333d;
        c5873b.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5873b.f9303j;
        while (!atomicReferenceFieldUpdater.compareAndSet(c5873b, null, c6520t)) {
            if (atomicReferenceFieldUpdater.get(c5873b) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c5873b);
                    C5486r c5486r = AbstractC5874c.f9321q;
                    if (obj != c5486r) {
                        if (obj == AbstractC5874c.f9322r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C5486r c5486r2 = AbstractC5874c.f9322r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5873b, c5486r, c5486r2)) {
                        if (atomicReferenceFieldUpdater.get(c5873b) != c5486r) {
                            break;
                        }
                    }
                    c6520t.invoke(c5873b.m5491n());
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.C5871c1, kotlinx.coroutines.InterfaceC6013w0
    public final void cancel(CancellationException cancellationException) {
        Object obj = C5871c1.f9288a.get(this);
        if (obj instanceof C5989p) {
            return;
        }
        if ((obj instanceof C5868b1) && ((C5868b1) obj).m5431d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo5424y(), null, this);
        }
        mo5463w(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    public final C5872a iterator() {
        C5873b c5873b = this.f9333d;
        c5873b.getClass();
        return new C5872a(c5873b);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: j */
    public final Object mo5487j() {
        return this.f9333d.mo5487j();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: k */
    public final Object mo5488k(InterfaceC5631c interfaceC5631c) {
        C5873b c5873b = this.f9333d;
        c5873b.getClass();
        Object objM5468B = C5873b.m5468B(c5873b, (ContinuationImpl) interfaceC5631c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5468B;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: l */
    public final boolean mo5489l(Throwable th) {
        return this.f9333d.m5483f(false, th);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: o */
    public final Object mo5492o(SuspendLambda suspendLambda) {
        return this.f9333d.mo5492o(suspendLambda);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: q */
    public final Object mo5494q(InterfaceC5631c interfaceC5631c, Object obj) {
        return this.f9333d.mo5494q(interfaceC5631c, obj);
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: w */
    public final void mo5463w(CancellationException cancellationException) {
        this.f9333d.m5483f(true, cancellationException);
        m5462v(cancellationException);
    }
}
