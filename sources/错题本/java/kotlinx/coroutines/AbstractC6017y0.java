package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.internal.C5970a;
import p054e7.C5481m;

/* renamed from: kotlinx.coroutines.y0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6017y0 extends C5970a implements InterfaceC5962g0, InterfaceC5999s0 {

    /* renamed from: d */
    public C5871c1 f9530d;

    @Override // kotlinx.coroutines.InterfaceC5999s0
    /* renamed from: b */
    public final C5897f1 mo5429b() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5962g0
    public final void dispose() {
        C5871c1 c5871c1M5657h = m5657h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5871c1.f9288a;
            Object obj = atomicReferenceFieldUpdater.get(c5871c1M5657h);
            if (obj instanceof AbstractC6017y0) {
                if (obj != this) {
                    return;
                }
                C5968i0 c5968i0 = AbstractC6014x.f9526j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c5871c1M5657h, obj, c5968i0)) {
                    if (atomicReferenceFieldUpdater.get(c5871c1M5657h) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC5999s0) || ((InterfaceC5999s0) obj).mo5429b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C5970a.f9461a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C5481m) {
                    C5970a c5970a = ((C5481m) obj2).f8475a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C5970a c5970a2 = (C5970a) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C5970a.f9463c;
                C5481m c5481m = (C5481m) atomicReferenceFieldUpdater3.get(c5970a2);
                if (c5481m == null) {
                    c5481m = new C5481m(c5970a2);
                    atomicReferenceFieldUpdater3.set(c5970a2, c5481m);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c5481m)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c5970a2.m5591d();
                return;
            }
        }
    }

    public InterfaceC6013w0 getParent() {
        return m5657h();
    }

    /* renamed from: h */
    public final C5871c1 m5657h() {
        C5871c1 c5871c1 = this.f9530d;
        if (c5871c1 != null) {
            return c5871c1;
        }
        AbstractC5830k.m5339p("job");
        throw null;
    }

    /* renamed from: i */
    public abstract boolean mo5426i();

    @Override // kotlinx.coroutines.InterfaceC5999s0
    public final boolean isActive() {
        return true;
    }

    /* renamed from: j */
    public abstract void mo5427j(Throwable th);

    @Override // kotlinx.coroutines.internal.C5970a
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6014x.m5642m(this) + "[job@" + AbstractC6014x.m5642m(m5657h()) + ']';
    }
}
