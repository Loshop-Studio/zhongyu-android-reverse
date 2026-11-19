package com.efs.sdk.base.p035a.p044g.p045a;

import com.efs.sdk.base.p035a.p038c.p039a.C1287b;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p043f.C1302b;

/* renamed from: com.efs.sdk.base.a.g.a.f */
/* loaded from: classes.dex */
public final class C1311f extends AbstractC1306a {
    @Override // com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a
    /* renamed from: a */
    public final void mo5521a(C1302b c1302b) {
        Double d4;
        C1288c c1288cM5456a = C1288c.m5456a();
        String str = c1302b.f7089a.f7082a;
        C1287b c1287b = c1288cM5456a.f7035d;
        if (C1288c.f7032a.nextDouble() * 100.0d <= ((!c1287b.f7029d.containsKey(str) || (d4 = c1287b.f7029d.get(str)) == null) ? 100.0d : d4.doubleValue())) {
            m5522b(c1302b);
        }
    }
}
