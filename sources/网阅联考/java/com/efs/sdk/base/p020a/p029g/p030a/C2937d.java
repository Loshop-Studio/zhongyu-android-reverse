package com.efs.sdk.base.p020a.p029g.p030a;

import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p028f.C2929a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p029g.C2940b;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.a.d */
/* loaded from: classes2.dex */
public final class C2937d extends AbstractC2934a {

    /* renamed from: b */
    private ILogEncryptAction f1128b;

    public C2937d() {
        if (C2921a.m2128a().f1050m == null) {
            this.f1128b = new C2940b();
        } else {
            this.f1128b = C2921a.m2128a().f1050m;
        }
    }

    /* renamed from: c */
    private static boolean m2165c(C2930b c2930b) {
        if (!c2930b.m2158c() && !"wa".equals(c2930b.f1119a.f1112a)) {
            C2929a c2929a = c2930b.f1119a;
            if ((1 != c2929a.f1113b || c2930b.f1120b.f1123a) && 1 != c2929a.f1114c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a
    /* renamed from: a */
    public final void mo2162a(C2930b c2930b) {
        if (m2165c(c2930b)) {
            m2163b(c2930b);
            return;
        }
        byte[] bArrEncrypt = this.f1128b.encrypt(C2921a.m2128a().f1039b, c2930b.f1121c);
        if (bArrEncrypt != null) {
            c2930b.m2155a(bArrEncrypt);
            c2930b.m2153a(this.f1128b.getDeVal());
        }
        m2163b(c2930b);
    }
}
