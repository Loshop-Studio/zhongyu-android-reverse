package sd;

import p410xd.AbstractC11856l;

/* renamed from: sd.t1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11164t1 extends AbstractC11106e0 {
    /* renamed from: i */
    public abstract AbstractC11164t1 mo24804i();

    /* renamed from: j */
    public final String m24805j() {
        AbstractC11164t1 abstractC11164t1Mo24804i;
        AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
        if (this == abstractC11164t1M24800c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC11164t1Mo24804i = abstractC11164t1M24800c.mo24804i();
        } catch (UnsupportedOperationException unused) {
            abstractC11164t1Mo24804i = null;
        }
        if (this == abstractC11164t1Mo24804i) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return AbstractC11856l.m26302b(this, str);
    }
}
