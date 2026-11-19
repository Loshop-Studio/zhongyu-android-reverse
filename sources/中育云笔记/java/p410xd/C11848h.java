package p410xd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10008f;
import kotlinx.coroutines.C9997c;
import p309qc.C10786q;
import p409xc.InterfaceC11828c;
import sd.AbstractC11106e0;
import sd.AbstractC11126j0;
import sd.AbstractC11175x0;
import sd.AbstractC11177y;
import sd.C11120h2;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* renamed from: xd.h */
/* loaded from: classes6.dex */
public final class C11848h extends AbstractC10008f implements InterfaceC11828c, InterfaceC11588c {

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28086j = AtomicReferenceFieldUpdater.newUpdater(C11848h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: f */
    public final AbstractC11106e0 f28087f;

    /* renamed from: g */
    public final InterfaceC11588c f28088g;

    /* renamed from: h */
    public Object f28089h;

    /* renamed from: i */
    public final Object f28090i;

    public C11848h(AbstractC11106e0 abstractC11106e0, InterfaceC11588c interfaceC11588c) {
        super(-1);
        this.f28087f = abstractC11106e0;
        this.f28088g = interfaceC11588c;
        this.f28089h = AbstractC11850i.f28091a;
        this.f28090i = AbstractC11853j0.m26291g(getContext());
    }

    @Override // p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f28088g;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return this.f28088g.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: h */
    public Object mo20524h() {
        Object obj = this.f28089h;
        this.f28089h = AbstractC11850i.f28091a;
        return obj;
    }

    /* renamed from: i */
    public final void m26269i() {
        while (f28086j.get(this) == AbstractC11850i.f28092b) {
        }
    }

    /* renamed from: j */
    public final C9997c m26270j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28086j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f28086j.set(this, AbstractC11850i.f28092b);
                return null;
            }
            if (obj instanceof C9997c) {
                if (AbstractC3223a.m1395a(f28086j, this, obj, AbstractC11850i.f28092b)) {
                    return (C9997c) obj;
                }
            } else if (obj != AbstractC11850i.f28092b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final void m26271l(InterfaceC9945d interfaceC9945d, Object obj) {
        this.f28089h = obj;
        this.f23590e = 1;
        this.f28087f.dispatchYield(interfaceC9945d, this);
    }

    /* renamed from: m */
    public final C9997c m26272m() {
        Object obj = f28086j.get(this);
        if (obj instanceof C9997c) {
            return (C9997c) obj;
        }
        return null;
    }

    /* renamed from: p */
    public final boolean m26273p() {
        return f28086j.get(this) != null;
    }

    /* renamed from: q */
    public final boolean m26274q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28086j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C11839c0 c11839c0 = AbstractC11850i.f28092b;
            if (AbstractC9979u.m20289b(obj, c11839c0)) {
                if (AbstractC3223a.m1395a(f28086j, this, c11839c0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC3223a.m1395a(f28086j, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) {
        Object objM24829b = AbstractC11177y.m24829b(obj);
        if (AbstractC11850i.m26280d(this.f28087f, getContext())) {
            this.f28089h = objM24829b;
            this.f23590e = 0;
            AbstractC11850i.m26279c(this.f28087f, getContext(), this);
            return;
        }
        AbstractC11175x0 abstractC11175x0M24730b = C11120h2.f26785a.m24730b();
        if (abstractC11175x0M24730b.m24826w()) {
            this.f28089h = objM24829b;
            this.f23590e = 0;
            abstractC11175x0M24730b.m24823l(this);
            return;
        }
        abstractC11175x0M24730b.m24825s(true);
        try {
            InterfaceC9945d context = getContext();
            Object objM26293i = AbstractC11853j0.m26293i(context, this.f28090i);
            try {
                this.f28088g.resumeWith(obj);
                C10786q c10786q = C10786q.f26013a;
                while (abstractC11175x0M24730b.m24819C()) {
                }
            } finally {
                AbstractC11853j0.m26290f(context, objM26293i);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final void m26275s() {
        m26269i();
        C9997c c9997cM26272m = m26272m();
        if (c9997cM26272m != null) {
            c9997cM26272m.m20532q();
        }
    }

    /* renamed from: t */
    public final Throwable m26276t(InterfaceC11125j interfaceC11125j) {
        C11839c0 c11839c0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28086j;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c11839c0 = AbstractC11850i.f28092b;
            if (obj != c11839c0) {
                if (obj instanceof Throwable) {
                    if (AbstractC3223a.m1395a(f28086j, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC3223a.m1395a(f28086j, this, c11839c0, interfaceC11125j));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f28087f + ", " + AbstractC11126j0.m24740c(this.f28088g) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: b */
    public InterfaceC11588c mo20519b() {
        return this;
    }
}
