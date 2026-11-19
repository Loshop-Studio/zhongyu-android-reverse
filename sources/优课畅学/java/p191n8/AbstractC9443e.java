package p191n8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: n8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9443e {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18649a = AtomicReferenceFieldUpdater.newUpdater(AbstractC9443e.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18650b = AtomicReferenceFieldUpdater.newUpdater(AbstractC9443e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC9443e(AbstractC9443e abstractC9443e) {
        this._prev$volatile = abstractC9443e;
    }

    /* renamed from: c */
    public final void m17311c() {
        f18650b.set(this, null);
    }

    /* renamed from: d */
    public final AbstractC9443e m17312d() {
        AbstractC9443e abstractC9443eM17316h = m17316h();
        while (abstractC9443eM17316h != null && abstractC9443eM17316h.mo17293k()) {
            abstractC9443eM17316h = (AbstractC9443e) f18650b.get(abstractC9443eM17316h);
        }
        return abstractC9443eM17316h;
    }

    /* renamed from: e */
    public final AbstractC9443e m17313e() {
        AbstractC9443e abstractC9443eM17314f;
        AbstractC9443e abstractC9443eM17314f2 = m17314f();
        AbstractC9133u.m16130d(abstractC9443eM17314f2);
        while (abstractC9443eM17314f2.mo17293k() && (abstractC9443eM17314f = abstractC9443eM17314f2.m17314f()) != null) {
            abstractC9443eM17314f2 = abstractC9443eM17314f;
        }
        return abstractC9443eM17314f2;
    }

    /* renamed from: f */
    public final AbstractC9443e m17314f() {
        Object objM17315g = m17315g();
        if (objM17315g == AbstractC9441d.f18647a) {
            return null;
        }
        return (AbstractC9443e) objM17315g;
    }

    /* renamed from: g */
    public final Object m17315g() {
        return f18649a.get(this);
    }

    /* renamed from: h */
    public final AbstractC9443e m17316h() {
        return (AbstractC9443e) f18650b.get(this);
    }

    /* renamed from: k */
    public abstract boolean mo17293k();

    /* renamed from: l */
    public final boolean m17317l() {
        return m17314f() == null;
    }

    /* renamed from: m */
    public final boolean m17318m() {
        return AbstractC3193a.m1318a(f18649a, this, null, AbstractC9441d.f18647a);
    }

    /* renamed from: n */
    public final void m17319n() {
        Object obj;
        if (m17317l()) {
            return;
        }
        while (true) {
            AbstractC9443e abstractC9443eM17312d = m17312d();
            AbstractC9443e abstractC9443eM17313e = m17313e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18650b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC9443eM17313e);
            } while (!AbstractC3193a.m1318a(atomicReferenceFieldUpdater, abstractC9443eM17313e, obj, ((AbstractC9443e) obj) == null ? null : abstractC9443eM17312d));
            if (abstractC9443eM17312d != null) {
                f18649a.set(abstractC9443eM17312d, abstractC9443eM17313e);
            }
            if (!abstractC9443eM17313e.mo17293k() || abstractC9443eM17313e.m17317l()) {
                if (abstractC9443eM17312d == null || !abstractC9443eM17312d.mo17293k()) {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean m17320o(AbstractC9443e abstractC9443e) {
        return AbstractC3193a.m1318a(f18649a, this, null, abstractC9443e);
    }
}
