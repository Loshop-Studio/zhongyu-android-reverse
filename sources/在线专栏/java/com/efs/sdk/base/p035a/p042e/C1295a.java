package com.efs.sdk.base.p035a.p042e;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p036a.C1275c;
import com.efs.sdk.base.p035a.p036a.C1276d;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p043f.C1301a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p048b.C1323b;
import com.efs.sdk.base.p035a.p046h.p048b.C1325d;
import java.util.HashMap;

/* renamed from: com.efs.sdk.base.a.e.a */
/* loaded from: classes.dex */
public final class C1295a implements InterfaceC1297c {
    @Override // com.efs.sdk.base.p035a.p042e.InterfaceC1297c
    /* renamed from: a */
    public final HttpResponse mo5493a(C1302b c1302b, boolean z3) {
        HttpResponse httpResponseM5418a;
        C1275c c1275cM5424a = C1275c.m5424a();
        C1301a c1301a = c1302b.f7089a;
        c1275cM5424a.f6985d = c1301a.f7085d;
        c1275cM5424a.f6986e = c1301a.f7086e;
        c1275cM5424a.f6988g = c1301a.f7083b;
        c1275cM5424a.f6989h = c1301a.f7082a;
        c1275cM5424a.f6993l = c1302b.m5511a();
        String strM5465a = C1288c.m5456a().m5465a(false);
        int i4 = c1302b.f7089a.f7084c;
        if (i4 == 0) {
            C1273a c1273aM5414a = C1273a.m5414a();
            byte[] bArr = c1302b.f7091c;
            boolean z4 = c1302b.f7090b.f7094b;
            String strM5425b = c1275cM5424a.m5425b();
            String strM5415a = C1273a.m5415a(strM5465a, c1275cM5424a);
            if (c1273aM5414a.f6979a) {
                C1329d.m5571a("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(strM5415a)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strM5425b);
            C1325d c1325dM5561a = new C1325d(strM5415a).m5561a(map);
            C1323b c1323b = c1325dM5561a.f7119a;
            c1323b.f7113c = bArr;
            c1323b.f7117g = true;
            C1325d c1325dM5560a = c1325dM5561a.m5560a("type", c1275cM5424a.f6989h);
            StringBuilder sb = new StringBuilder();
            sb.append(c1275cM5424a.f6993l);
            httpResponseM5418a = c1325dM5560a.m5560a("size", sb.toString()).m5560a("flow_limit", Boolean.toString(z4)).m5559a(C1276d.m5426a()).m5558a().m5557b();
        } else {
            httpResponseM5418a = 1 == i4 ? C1273a.m5414a().m5418a(strM5465a, c1275cM5424a, c1302b.f7092d, c1302b.f7090b.f7094b) : new HttpResponse();
        }
        if (httpResponseM5418a.succ && z3) {
            C1321b.m5547b(c1302b.f7092d);
        }
        return httpResponseM5418a;
    }
}
