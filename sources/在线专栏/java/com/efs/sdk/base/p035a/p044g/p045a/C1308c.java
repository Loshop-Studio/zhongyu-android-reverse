package com.efs.sdk.base.p035a.p044g.p045a;

import com.efs.sdk.base.p035a.p043f.C1301a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1326c;
import com.efs.sdk.base.p035a.p046h.C1329d;
import java.io.IOException;

/* renamed from: com.efs.sdk.base.a.g.a.c */
/* loaded from: classes.dex */
public final class C1308c extends AbstractC1306a {
    /* renamed from: c */
    private static boolean m5523c(C1302b c1302b) {
        if (!c1302b.m5516b()) {
            C1301a c1301a = c1302b.f7089a;
            if ((1 != c1301a.f7083b || c1302b.f7090b.f7093a) && 1 != c1301a.f7084c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a
    /* renamed from: a */
    public final void mo5521a(C1302b c1302b) throws IOException {
        if (m5523c(c1302b)) {
            m5522b(c1302b);
            return;
        }
        byte[] bArrM5562a = C1326c.m5562a(c1302b.f7091c);
        if (bArrM5562a == null) {
            C1329d.m5572a("efs.base", "gzip error", null);
            m5522b(c1302b);
        } else {
            c1302b.m5514a(bArrM5562a);
            c1302b.m5513a("gzip");
            m5522b(c1302b);
        }
    }
}
