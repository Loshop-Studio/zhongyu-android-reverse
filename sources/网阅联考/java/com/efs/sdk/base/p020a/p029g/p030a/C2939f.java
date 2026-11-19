package com.efs.sdk.base.p020a.p029g.p030a;

import com.efs.sdk.base.p020a.p023c.p024a.C2915b;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p028f.C2930b;

/* renamed from: com.efs.sdk.base.a.g.a.f */
/* loaded from: classes2.dex */
public final class C2939f extends AbstractC2934a {
    @Override // com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a
    /* renamed from: a */
    public final void mo2162a(C2930b c2930b) {
        Double d4;
        C2916c c2916cM2097a = C2916c.m2097a();
        String str = c2930b.f1119a.f1112a;
        C2915b c2915b = c2916cM2097a.f1065d;
        if (C2916c.f1062a.nextDouble() * 100.0d <= ((!c2915b.f1059d.containsKey(str) || (d4 = c2915b.f1059d.get(str)) == null) ? 100.0d : d4.doubleValue())) {
            m2163b(c2930b);
        }
    }
}
