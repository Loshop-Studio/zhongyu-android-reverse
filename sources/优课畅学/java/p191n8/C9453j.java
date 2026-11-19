package p191n8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9205i;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import p123h7.C8736p;
import p135i8.AbstractC8825c0;
import p135i8.AbstractC8861o0;
import p135i8.AbstractC8890y;
import p135i8.C8883v1;
import p135i8.C8887x;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9538c;

/* renamed from: n8.j */
/* loaded from: classes5.dex */
public final class C9453j extends AbstractC9205i implements InterfaceC9538c, InterfaceC9324c {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18658h = AtomicReferenceFieldUpdater.newUpdater(C9453j.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final CoroutineDispatcher f18659d;

    /* renamed from: e */
    public final InterfaceC9324c f18660e;

    /* renamed from: f */
    public Object f18661f;

    /* renamed from: g */
    public final Object f18662g;

    public C9453j(CoroutineDispatcher coroutineDispatcher, InterfaceC9324c interfaceC9324c) {
        super(-1);
        this.f18659d = coroutineDispatcher;
        this.f18660e = interfaceC9324c;
        this.f18661f = AbstractC9455k.f18663a;
        this.f18662g = ThreadContextKt.m16748b(getContext());
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: a */
    public void mo16358a(Object obj, Throwable th) {
        if (obj instanceof C8887x) {
            ((C8887x) obj).f16549b.invoke(th);
        }
    }

    @Override // p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f18660e;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return this.f18660e.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: h */
    public Object mo16362h() {
        Object obj = this.f18661f;
        this.f18661f = AbstractC9455k.f18663a;
        return obj;
    }

    /* renamed from: j */
    public final void m17343j() {
        while (f18658h.get(this) == AbstractC9455k.f18664b) {
        }
    }

    /* renamed from: k */
    public final C9155c m17344k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18658h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f18658h.set(this, AbstractC9455k.f18664b);
                return null;
            }
            if (obj instanceof C9155c) {
                if (AbstractC3193a.m1318a(f18658h, this, obj, AbstractC9455k.f18664b)) {
                    return (C9155c) obj;
                }
            } else if (obj != AbstractC9455k.f18664b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final void m17345l(InterfaceC9100d interfaceC9100d, Object obj) {
        this.f18661f = obj;
        this.f18067c = 1;
        this.f18659d.dispatchYield(interfaceC9100d, this);
    }

    /* renamed from: m */
    public final C9155c m17346m() {
        Object obj = f18658h.get(this);
        if (obj instanceof C9155c) {
            return (C9155c) obj;
        }
        return null;
    }

    /* renamed from: o */
    public final boolean m17347o() {
        return f18658h.get(this) != null;
    }

    /* renamed from: p */
    public final boolean m17348p(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18658h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C9442d0 c9442d0 = AbstractC9455k.f18664b;
            if (AbstractC9133u.m16128b(obj, c9442d0)) {
                if (AbstractC3193a.m1318a(f18658h, this, c9442d0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC3193a.m1318a(f18658h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) {
        InterfaceC9100d context = this.f18660e.getContext();
        Object objM14937d = AbstractC8890y.m14937d(obj, null, 1, null);
        if (this.f18659d.isDispatchNeeded(context)) {
            this.f18661f = objM14937d;
            this.f18067c = 0;
            this.f18659d.dispatch(context, this);
            return;
        }
        AbstractC8861o0 abstractC8861o0M14923b = C8883v1.f16542a.m14923b();
        if (abstractC8861o0M14923b.m14893w()) {
            this.f18661f = objM14937d;
            this.f18067c = 0;
            abstractC8861o0M14923b.m14890q(this);
            return;
        }
        abstractC8861o0M14923b.m14892t(true);
        try {
            InterfaceC9100d context2 = getContext();
            Object objM16749c = ThreadContextKt.m16749c(context2, this.f18662g);
            try {
                this.f18660e.resumeWith(obj);
                C8736p c8736p = C8736p.f16368a;
                while (abstractC8861o0M14923b.m14896z()) {
                }
            } finally {
                ThreadContextKt.m16747a(context2, objM16749c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final void m17349s() {
        m17343j();
        C9155c c9155cM17346m = m17346m();
        if (c9155cM17346m != null) {
            c9155cM17346m.m16368o();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f18659d + ", " + AbstractC8825c0.m14822c(this.f18660e) + ']';
    }

    /* renamed from: u */
    public final Throwable m17350u(InterfaceC8845j interfaceC8845j) {
        C9442d0 c9442d0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18658h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c9442d0 = AbstractC9455k.f18664b;
            if (obj != c9442d0) {
                if (obj instanceof Throwable) {
                    if (AbstractC3193a.m1318a(f18658h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC3193a.m1318a(f18658h, this, c9442d0, interfaceC8845j));
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: b */
    public InterfaceC9324c mo16359b() {
        return this;
    }
}
