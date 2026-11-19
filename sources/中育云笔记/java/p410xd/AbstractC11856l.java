package p410xd;

import sd.AbstractC11106e0;

/* renamed from: xd.l */
/* loaded from: classes6.dex */
public abstract class AbstractC11856l {
    /* renamed from: a */
    public static final void m26301a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    /* renamed from: b */
    public static final AbstractC11106e0 m26302b(AbstractC11106e0 abstractC11106e0, String str) {
        return str != null ? new C11870u(abstractC11106e0, str) : abstractC11106e0;
    }
}
