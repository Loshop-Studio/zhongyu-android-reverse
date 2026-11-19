package com.efs.sdk.base.p020a.p029g.p030a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p020a.p028f.C2929a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2954c;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.io.IOException;

/* renamed from: com.efs.sdk.base.a.g.a.c */
/* loaded from: classes2.dex */
public final class C2936c extends AbstractC2934a {
    /* renamed from: c */
    private static boolean m2164c(C2930b c2930b) {
        if (!c2930b.m2157b()) {
            C2929a c2929a = c2930b.f1119a;
            if ((1 != c2929a.f1113b || c2930b.f1120b.f1123a) && 1 != c2929a.f1114c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a
    /* renamed from: a */
    public final void mo2162a(C2930b c2930b) throws IOException {
        if (m2164c(c2930b)) {
            m2163b(c2930b);
            return;
        }
        byte[] bArrM2203a = C2954c.m2203a(c2930b.f1121c);
        if (bArrM2203a == null) {
            C2957d.m2213a("efs.base", "gzip error", null);
            m2163b(c2930b);
        } else {
            c2930b.m2155a(bArrM2203a);
            c2930b.m2154a(Constants.CP_GZIP);
            m2163b(c2930b);
        }
    }
}
