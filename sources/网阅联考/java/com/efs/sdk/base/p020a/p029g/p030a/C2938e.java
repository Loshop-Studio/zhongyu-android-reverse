package com.efs.sdk.base.p020a.p029g.p030a;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p027e.HandlerC2924b;
import com.efs.sdk.base.p020a.p027e.HandlerC2926d;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p035i.C2967f;

/* renamed from: com.efs.sdk.base.a.g.a.e */
/* loaded from: classes2.dex */
public final class C2938e extends AbstractC2934a {
    @Override // com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a
    /* renamed from: a */
    public final void mo2162a(C2930b c2930b) {
        HttpResponse httpResponseMo2134a;
        if (!c2930b.f1120b.f1123a) {
            m2163b(c2930b);
            return;
        }
        HandlerC2926d handlerC2926dM2144a = HandlerC2926d.m2144a();
        if (!c2930b.f1120b.f1124b || HandlerC2924b.m2136a().m2142a(c2930b.f1119a.f1112a, c2930b.m2152a())) {
            C2967f.a.f1173a.f1171c.m2229b();
            C2967f.a.f1173a.f1171c.m2230c();
            httpResponseMo2134a = handlerC2926dM2144a.f1098b.mo2134a(c2930b, false);
        } else {
            httpResponseMo2134a = new HttpResponse();
            httpResponseMo2134a.data = "flow_limit";
        }
        c2930b.f1120b.f1125c = httpResponseMo2134a;
        m2163b(c2930b);
    }
}
