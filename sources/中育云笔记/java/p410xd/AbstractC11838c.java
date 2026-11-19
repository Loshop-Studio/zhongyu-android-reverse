package p410xd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xd.c */
/* loaded from: classes6.dex */
public abstract class AbstractC11838c {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28080c = AtomicReferenceFieldUpdater.newUpdater(AbstractC11838c.class, Object.class, "_next$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28081d = AtomicReferenceFieldUpdater.newUpdater(AbstractC11838c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC11838c(AbstractC11838c abstractC11838c) {
        this._prev$volatile = abstractC11838c;
    }

    /* renamed from: c */
    public final void m26236c() {
        f28081d.set(this, null);
    }

    /* renamed from: d */
    public final AbstractC11838c m26237d() {
        AbstractC11838c abstractC11838cM26241h = m26241h();
        while (abstractC11838cM26241h != null && abstractC11838cM26241h.mo26242k()) {
            abstractC11838cM26241h = (AbstractC11838c) f28081d.get(abstractC11838cM26241h);
        }
        return abstractC11838cM26241h;
    }

    /* renamed from: e */
    public final AbstractC11838c m26238e() {
        AbstractC11838c abstractC11838cM26239f;
        AbstractC11838c abstractC11838cM26239f2 = m26239f();
        AbstractC9979u.m20291d(abstractC11838cM26239f2);
        while (abstractC11838cM26239f2.mo26242k() && (abstractC11838cM26239f = abstractC11838cM26239f2.m26239f()) != null) {
            abstractC11838cM26239f2 = abstractC11838cM26239f;
        }
        return abstractC11838cM26239f2;
    }

    /* renamed from: f */
    public final AbstractC11838c m26239f() {
        Object objM26240g = m26240g();
        if (objM26240g == AbstractC11836b.f28076a) {
            return null;
        }
        return (AbstractC11838c) objM26240g;
    }

    /* renamed from: g */
    public final Object m26240g() {
        return f28080c.get(this);
    }

    /* renamed from: h */
    public final AbstractC11838c m26241h() {
        return (AbstractC11838c) f28081d.get(this);
    }

    /* renamed from: k */
    public abstract boolean mo26242k();

    /* renamed from: l */
    public final boolean m26243l() {
        return m26239f() == null;
    }

    /* renamed from: m */
    public final boolean m26244m() {
        return AbstractC3223a.m1395a(f28080c, this, null, AbstractC11836b.f28076a);
    }

    /* renamed from: n */
    public final void m26245n() {
        Object obj;
        if (m26243l()) {
            return;
        }
        while (true) {
            AbstractC11838c abstractC11838cM26237d = m26237d();
            AbstractC11838c abstractC11838cM26238e = m26238e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28081d;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC11838cM26238e);
            } while (!AbstractC3223a.m1395a(atomicReferenceFieldUpdater, abstractC11838cM26238e, obj, ((AbstractC11838c) obj) == null ? null : abstractC11838cM26237d));
            if (abstractC11838cM26237d != null) {
                f28080c.set(abstractC11838cM26237d, abstractC11838cM26238e);
            }
            if (!abstractC11838cM26238e.mo26242k() || abstractC11838cM26238e.m26243l()) {
                if (abstractC11838cM26237d == null || !abstractC11838cM26237d.mo26242k()) {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean m26246o(AbstractC11838c abstractC11838c) {
        return AbstractC3223a.m1395a(f28080c, this, null, abstractC11838c);
    }
}
