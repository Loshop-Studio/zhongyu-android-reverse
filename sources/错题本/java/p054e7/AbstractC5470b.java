package p054e7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: e7.b */
/* loaded from: classes4.dex */
public abstract class AbstractC5470b {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8445a = AtomicReferenceFieldUpdater.newUpdater(AbstractC5470b.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8446b = AtomicReferenceFieldUpdater.newUpdater(AbstractC5470b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC5470b(AbstractC5484p abstractC5484p) {
        this._prev$volatile = abstractC5484p;
    }

    /* renamed from: a */
    public final void m4839a() {
        f8446b.set(this, null);
    }

    /* renamed from: b */
    public final AbstractC5470b m4840b() {
        Object obj = f8445a.get(this);
        if (obj == AbstractC5469a.f8438a) {
            return null;
        }
        return (AbstractC5470b) obj;
    }

    /* renamed from: c */
    public abstract boolean mo4841c();

    /* renamed from: d */
    public final void m4842d() {
        AbstractC5470b abstractC5470bM4840b;
        if (m4840b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8446b;
            AbstractC5470b abstractC5470b = (AbstractC5470b) atomicReferenceFieldUpdater.get(this);
            while (abstractC5470b != null && abstractC5470b.mo4841c()) {
                abstractC5470b = (AbstractC5470b) atomicReferenceFieldUpdater.get(abstractC5470b);
            }
            AbstractC5470b abstractC5470bM4840b2 = m4840b();
            AbstractC5830k.m5327d(abstractC5470bM4840b2);
            while (abstractC5470bM4840b2.mo4841c() && (abstractC5470bM4840b = abstractC5470bM4840b2.m4840b()) != null) {
                abstractC5470bM4840b2 = abstractC5470bM4840b;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC5470bM4840b2);
                AbstractC5470b abstractC5470b2 = ((AbstractC5470b) obj) == null ? null : abstractC5470b;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC5470bM4840b2, obj, abstractC5470b2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC5470bM4840b2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC5470b != null) {
                f8445a.set(abstractC5470b, abstractC5470bM4840b2);
            }
            if (!abstractC5470bM4840b2.mo4841c() || abstractC5470bM4840b2.m4840b() == null) {
                if (abstractC5470b == null || !abstractC5470b.mo4841c()) {
                    return;
                }
            }
        }
    }
}
