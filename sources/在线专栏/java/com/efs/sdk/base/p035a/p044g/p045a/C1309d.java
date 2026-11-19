package com.efs.sdk.base.p035a.p044g.p045a;

import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p043f.C1301a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p044g.C1312b;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.a.d */
/* loaded from: classes.dex */
public final class C1309d extends AbstractC1306a {

    /* renamed from: b */
    private ILogEncryptAction f7098b;

    public C1309d() {
        if (C1293a.m5487a().f7020m == null) {
            this.f7098b = new C1312b();
        } else {
            this.f7098b = C1293a.m5487a().f7020m;
        }
    }

    /* renamed from: c */
    private static boolean m5524c(C1302b c1302b) {
        if (!c1302b.m5517c() && !"wa".equals(c1302b.f7089a.f7082a)) {
            C1301a c1301a = c1302b.f7089a;
            if ((1 != c1301a.f7083b || c1302b.f7090b.f7093a) && 1 != c1301a.f7084c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a
    /* renamed from: a */
    public final void mo5521a(C1302b c1302b) {
        if (m5524c(c1302b)) {
            m5522b(c1302b);
            return;
        }
        byte[] bArrEncrypt = this.f7098b.encrypt(C1293a.m5487a().f7009b, c1302b.f7091c);
        if (bArrEncrypt != null) {
            c1302b.m5514a(bArrEncrypt);
            c1302b.m5512a(this.f7098b.getDeVal());
        }
        m5522b(c1302b);
    }
}
