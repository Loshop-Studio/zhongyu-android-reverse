package com.efs.sdk.base.p035a.p044g.p045a;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p042e.HandlerC1296b;
import com.efs.sdk.base.p035a.p042e.HandlerC1298d;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p050i.C1339f;

/* renamed from: com.efs.sdk.base.a.g.a.e */
/* loaded from: classes.dex */
public final class C1310e extends AbstractC1306a {
    @Override // com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a
    /* renamed from: a */
    public final void mo5521a(C1302b c1302b) {
        HttpResponse httpResponseMo5493a;
        if (!c1302b.f7090b.f7093a) {
            m5522b(c1302b);
            return;
        }
        HandlerC1298d handlerC1298dM5503a = HandlerC1298d.m5503a();
        if (!c1302b.f7090b.f7094b || HandlerC1296b.m5495a().m5501a(c1302b.f7089a.f7082a, c1302b.m5511a())) {
            C1339f.a.f7143a.f7141c.m5588b();
            C1339f.a.f7143a.f7141c.m5589c();
            httpResponseMo5493a = handlerC1298dM5503a.f7068b.mo5493a(c1302b, false);
        } else {
            httpResponseMo5493a = new HttpResponse();
            httpResponseMo5493a.data = "flow_limit";
        }
        c1302b.f7090b.f7095c = httpResponseMo5493a;
        m5522b(c1302b);
    }
}
