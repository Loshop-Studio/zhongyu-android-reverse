package com.efs.sdk.base.p039a.p048g.p049a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p039a.p047f.C5669a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5694c;
import com.efs.sdk.base.p039a.p050h.C5697d;
import java.io.IOException;

/* renamed from: com.efs.sdk.base.a.g.a.c */
/* loaded from: classes3.dex */
public final class C5676c extends AbstractC5674a {
    /* renamed from: c */
    private static boolean m4133c(C5670b c5670b) {
        if (!c5670b.m4126b()) {
            C5669a c5669a = c5670b.f4723a;
            if ((1 != c5669a.f4717b || c5670b.f4724b.f4727a) && 1 != c5669a.f4718c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a
    /* renamed from: a */
    public final void mo4131a(C5670b c5670b) throws IOException {
        if (m4133c(c5670b)) {
            m4132b(c5670b);
            return;
        }
        byte[] bArrM4172a = C5694c.m4172a(c5670b.f4725c);
        if (bArrM4172a == null) {
            C5697d.m4182a("efs.base", "gzip error", null);
            m4132b(c5670b);
        } else {
            c5670b.m4124a(bArrM4172a);
            c5670b.m4123a(Constants.CP_GZIP);
            m4132b(c5670b);
        }
    }
}
