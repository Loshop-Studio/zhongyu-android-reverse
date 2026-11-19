package com.efs.sdk.base.p039a.p048g.p049a;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p046e.HandlerC5664b;
import com.efs.sdk.base.p039a.p046e.HandlerC5666d;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p054i.C5707f;

/* renamed from: com.efs.sdk.base.a.g.a.e */
/* loaded from: classes3.dex */
public final class C5678e extends AbstractC5674a {
    @Override // com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a
    /* renamed from: a */
    public final void mo4131a(C5670b c5670b) {
        HttpResponse httpResponseMo4103a;
        if (!c5670b.f4724b.f4727a) {
            m4132b(c5670b);
            return;
        }
        HandlerC5666d handlerC5666dM4113a = HandlerC5666d.m4113a();
        if (!c5670b.f4724b.f4728b || HandlerC5664b.m4105a().m4111a(c5670b.f4723a.f4716a, c5670b.m4121a())) {
            C5707f.a.f4777a.f4775c.m4198b();
            C5707f.a.f4777a.f4775c.m4199c();
            httpResponseMo4103a = handlerC5666dM4113a.f4702b.mo4103a(c5670b, false);
        } else {
            httpResponseMo4103a = new HttpResponse();
            httpResponseMo4103a.data = "flow_limit";
        }
        c5670b.f4724b.f4729c = httpResponseMo4103a;
        m4132b(c5670b);
    }
}
