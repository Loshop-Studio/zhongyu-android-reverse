package com.efs.sdk.base.p035a.p044g.p045a;

import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p037b.HandlerC1279c;
import com.efs.sdk.base.p035a.p037b.InterfaceC1281e;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p043f.C1301a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p050i.C1339f;

/* renamed from: com.efs.sdk.base.a.g.a.b */
/* loaded from: classes.dex */
public final class C1307b extends AbstractC1306a {
    @Override // com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a
    /* renamed from: a */
    public final void mo5521a(C1302b c1302b) {
        InterfaceC1281e interfaceC1281eM5437a;
        byte[] bArr;
        if (c1302b.f7090b.f7093a) {
            m5522b(c1302b);
            return;
        }
        C1277a c1277a = C1277a.b.f6999a;
        if ("wa".equals(c1302b.f7089a.f7082a) || HandlerC1279c.m5438a().f7001a) {
            C1301a c1301a = c1302b.f7089a;
            if ((c1301a.f7084c == 0 && ((bArr = c1302b.f7091c) == null || bArr.length == 0)) || (interfaceC1281eM5437a = c1277a.f6997c.m5437a(c1301a.f7083b)) == null) {
                return;
            }
            interfaceC1281eM5437a.mo5440a(c1302b);
            return;
        }
        if (!c1277a.f6995a) {
            C1339f c1339f = C1339f.a.f7143a;
            int i4 = C1288c.m5456a().f7035d.f7026a;
            if (c1339f.f7140b != null || C1293a.m5487a().f7011d) {
                c1339f.f7140b.m5492a(c1339f.m5593a("disk_limit", i4));
            }
        }
        c1277a.f6995a = true;
    }
}
