package p410xd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: xd.o */
/* loaded from: classes6.dex */
public class C11862o {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28113a = AtomicReferenceFieldUpdater.newUpdater(C11862o.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C11862o(boolean z10) {
        this._cur$volatile = new C11864p(8, z10);
    }

    /* renamed from: a */
    public final boolean m26319a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28113a;
        while (true) {
            C11864p c11864p = (C11864p) atomicReferenceFieldUpdater.get(this);
            int iM26325a = c11864p.m26325a(obj);
            if (iM26325a == 0) {
                return true;
            }
            if (iM26325a == 1) {
                AbstractC3223a.m1395a(f28113a, this, c11864p, c11864p.m26334l());
            } else if (iM26325a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m26320b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28113a;
        while (true) {
            C11864p c11864p = (C11864p) atomicReferenceFieldUpdater.get(this);
            if (c11864p.m26328d()) {
                return;
            } else {
                AbstractC3223a.m1395a(f28113a, this, c11864p, c11864p.m26334l());
            }
        }
    }

    /* renamed from: c */
    public final int m26321c() {
        return ((C11864p) f28113a.get(this)).m26331g();
    }

    /* renamed from: e */
    public final Object m26322e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28113a;
        while (true) {
            C11864p c11864p = (C11864p) atomicReferenceFieldUpdater.get(this);
            Object objM26335m = c11864p.m26335m();
            if (objM26335m != C11864p.f28117h) {
                return objM26335m;
            }
            AbstractC3223a.m1395a(f28113a, this, c11864p, c11864p.m26334l());
        }
    }
}
