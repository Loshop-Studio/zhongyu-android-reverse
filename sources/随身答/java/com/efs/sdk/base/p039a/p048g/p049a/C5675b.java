package com.efs.sdk.base.p039a.p048g.p049a;

import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p041b.HandlerC5647c;
import com.efs.sdk.base.p039a.p041b.InterfaceC5649e;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p047f.C5669a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p054i.C5707f;

/* renamed from: com.efs.sdk.base.a.g.a.b */
/* loaded from: classes3.dex */
public final class C5675b extends AbstractC5674a {
    @Override // com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a
    /* renamed from: a */
    public final void mo4131a(C5670b c5670b) {
        InterfaceC5649e interfaceC5649eM4047a;
        byte[] bArr;
        if (c5670b.f4724b.f4727a) {
            m4132b(c5670b);
            return;
        }
        C5645a c5645a = C5645a.b.f4633a;
        if ("wa".equals(c5670b.f4723a.f4716a) || HandlerC5647c.m4048a().f4635a) {
            C5669a c5669a = c5670b.f4723a;
            if ((c5669a.f4718c == 0 && ((bArr = c5670b.f4725c) == null || bArr.length == 0)) || (interfaceC5649eM4047a = c5645a.f4631c.m4047a(c5669a.f4717b)) == null) {
                return;
            }
            interfaceC5649eM4047a.mo4050a(c5670b);
            return;
        }
        if (!c5645a.f4629a) {
            C5707f c5707f = C5707f.a.f4777a;
            int i9 = C5656c.m4066a().f4669d.f4660a;
            if (c5707f.f4774b != null || C5661a.m4097a().f4645d) {
                c5707f.f4774b.m4102a(c5707f.m4203a("disk_limit", i9));
            }
        }
        c5645a.f4629a = true;
    }
}
