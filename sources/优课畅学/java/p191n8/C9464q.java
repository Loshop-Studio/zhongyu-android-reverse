package p191n8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n8.q */
/* loaded from: classes5.dex */
public class C9464q {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18680a = AtomicReferenceFieldUpdater.newUpdater(C9464q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C9464q(boolean z10) {
        this._cur$volatile = new C9465r(8, z10);
    }

    /* renamed from: a */
    public final boolean m17383a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18680a;
        while (true) {
            C9465r c9465r = (C9465r) atomicReferenceFieldUpdater.get(this);
            int iM17389a = c9465r.m17389a(obj);
            if (iM17389a == 0) {
                return true;
            }
            if (iM17389a == 1) {
                AbstractC3193a.m1318a(f18680a, this, c9465r, c9465r.m17398l());
            } else if (iM17389a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m17384b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18680a;
        while (true) {
            C9465r c9465r = (C9465r) atomicReferenceFieldUpdater.get(this);
            if (c9465r.m17392d()) {
                return;
            } else {
                AbstractC3193a.m1318a(f18680a, this, c9465r, c9465r.m17398l());
            }
        }
    }

    /* renamed from: c */
    public final int m17385c() {
        return ((C9465r) f18680a.get(this)).m17395g();
    }

    /* renamed from: e */
    public final Object m17386e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18680a;
        while (true) {
            C9465r c9465r = (C9465r) atomicReferenceFieldUpdater.get(this);
            Object objM17399m = c9465r.m17399m();
            if (objM17399m != C9465r.f18684h) {
                return objM17399m;
            }
            AbstractC3193a.m1318a(f18680a, this, c9465r, c9465r.m17398l());
        }
    }
}
