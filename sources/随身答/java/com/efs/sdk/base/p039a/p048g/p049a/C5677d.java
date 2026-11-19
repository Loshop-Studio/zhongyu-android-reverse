package com.efs.sdk.base.p039a.p048g.p049a;

import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p047f.C5669a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p048g.C5680b;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.a.d */
/* loaded from: classes3.dex */
public final class C5677d extends AbstractC5674a {

    /* renamed from: b */
    private ILogEncryptAction f4732b;

    public C5677d() {
        if (C5661a.m4097a().f4654m == null) {
            this.f4732b = new C5680b();
        } else {
            this.f4732b = C5661a.m4097a().f4654m;
        }
    }

    /* renamed from: c */
    private static boolean m4134c(C5670b c5670b) {
        if (!c5670b.m4127c() && !"wa".equals(c5670b.f4723a.f4716a)) {
            C5669a c5669a = c5670b.f4723a;
            if ((1 != c5669a.f4717b || c5670b.f4724b.f4727a) && 1 != c5669a.f4718c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a
    /* renamed from: a */
    public final void mo4131a(C5670b c5670b) {
        if (m4134c(c5670b)) {
            m4132b(c5670b);
            return;
        }
        byte[] bArrEncrypt = this.f4732b.encrypt(C5661a.m4097a().f4643b, c5670b.f4725c);
        if (bArrEncrypt != null) {
            c5670b.m4124a(bArrEncrypt);
            c5670b.m4122a(this.f4732b.getDeVal());
        }
        m4132b(c5670b);
    }
}
