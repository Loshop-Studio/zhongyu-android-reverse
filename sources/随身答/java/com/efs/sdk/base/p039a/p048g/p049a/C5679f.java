package com.efs.sdk.base.p039a.p048g.p049a;

import com.efs.sdk.base.p039a.p042c.p043a.C5655b;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p047f.C5670b;

/* renamed from: com.efs.sdk.base.a.g.a.f */
/* loaded from: classes3.dex */
public final class C5679f extends AbstractC5674a {
    @Override // com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a
    /* renamed from: a */
    public final void mo4131a(C5670b c5670b) {
        Double d10;
        C5656c c5656cM4066a = C5656c.m4066a();
        String str = c5670b.f4723a.f4716a;
        C5655b c5655b = c5656cM4066a.f4669d;
        if (C5656c.f4666a.nextDouble() * 100.0d <= ((!c5655b.f4663d.containsKey(str) || (d10 = c5655b.f4663d.get(str)) == null) ? 100.0d : d10.doubleValue())) {
            m4132b(c5670b);
        }
    }
}
