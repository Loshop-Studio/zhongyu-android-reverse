package com.efs.sdk.base.p039a.p046e;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p040a.C5643c;
import com.efs.sdk.base.p039a.p040a.C5644d;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p047f.C5669a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p052b.C5691b;
import com.efs.sdk.base.p039a.p050h.p052b.C5693d;
import java.util.HashMap;

/* renamed from: com.efs.sdk.base.a.e.a */
/* loaded from: classes3.dex */
public final class C5663a implements InterfaceC5665c {
    @Override // com.efs.sdk.base.p039a.p046e.InterfaceC5665c
    @NonNull
    /* renamed from: a */
    public final HttpResponse mo4103a(C5670b c5670b, boolean z9) {
        HttpResponse httpResponseM4028a;
        C5643c c5643cM4034a = C5643c.m4034a();
        C5669a c5669a = c5670b.f4723a;
        c5643cM4034a.f4619d = c5669a.f4719d;
        c5643cM4034a.f4620e = c5669a.f4720e;
        c5643cM4034a.f4622g = c5669a.f4717b;
        c5643cM4034a.f4623h = c5669a.f4716a;
        c5643cM4034a.f4627l = c5670b.m4121a();
        String strM4075a = C5656c.m4066a().m4075a(false);
        int i9 = c5670b.f4723a.f4718c;
        if (i9 == 0) {
            C5641a c5641aM4024a = C5641a.m4024a();
            byte[] bArr = c5670b.f4725c;
            boolean z10 = c5670b.f4724b.f4728b;
            String strM4035b = c5643cM4034a.m4035b();
            String strM4025a = C5641a.m4025a(strM4075a, c5643cM4034a);
            if (c5641aM4024a.f4613a) {
                C5697d.m4181a("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(strM4025a)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strM4035b);
            C5693d c5693dM4171a = new C5693d(strM4025a).m4171a(map);
            C5691b c5691b = c5693dM4171a.f4753a;
            c5691b.f4747c = bArr;
            c5691b.f4751g = true;
            C5693d c5693dM4170a = c5693dM4171a.m4170a("type", c5643cM4034a.f4623h);
            StringBuilder sb = new StringBuilder();
            sb.append(c5643cM4034a.f4627l);
            httpResponseM4028a = c5693dM4170a.m4170a("size", sb.toString()).m4170a("flow_limit", Boolean.toString(z10)).m4169a(C5644d.m4036a()).m4168a().m4167b();
        } else {
            httpResponseM4028a = 1 == i9 ? C5641a.m4024a().m4028a(strM4075a, c5643cM4034a, c5670b.f4726d, c5670b.f4724b.f4728b) : new HttpResponse();
        }
        if (httpResponseM4028a.succ && z9) {
            C5689b.m4157b(c5670b.f4726d);
        }
        return httpResponseM4028a;
    }
}
