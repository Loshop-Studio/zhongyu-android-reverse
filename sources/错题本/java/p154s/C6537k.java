package p154s;

import kotlinx.coroutines.C5867b0;

/* renamed from: s.k */
/* loaded from: classes2.dex */
public final class C6537k {

    /* renamed from: a */
    public final C5867b0 f10893a;

    public C6537k(C5867b0 c5867b0) {
        this.f10893a = c5867b0;
    }

    /* renamed from: a */
    public final void m6187a() {
        C5867b0 c5867b0 = this.f10893a;
        if (c5867b0.isActive()) {
            c5867b0.cancel(null);
        }
    }
}
