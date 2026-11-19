package com.efs.sdk.base.p020a.p027e;

import android.support.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p021a.C2903c;
import com.efs.sdk.base.p020a.p021a.C2904d;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p028f.C2929a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p033b.C2951b;
import com.efs.sdk.base.p020a.p031h.p033b.C2953d;
import java.util.HashMap;

/* renamed from: com.efs.sdk.base.a.e.a */
/* loaded from: classes2.dex */
public final class C2923a implements InterfaceC2925c {
    @Override // com.efs.sdk.base.p020a.p027e.InterfaceC2925c
    @NonNull
    /* renamed from: a */
    public final HttpResponse mo2134a(C2930b c2930b, boolean z3) {
        HttpResponse httpResponseM2059a;
        C2903c c2903cM2065a = C2903c.m2065a();
        C2929a c2929a = c2930b.f1119a;
        c2903cM2065a.f1015d = c2929a.f1115d;
        c2903cM2065a.f1016e = c2929a.f1116e;
        c2903cM2065a.f1018g = c2929a.f1113b;
        c2903cM2065a.f1019h = c2929a.f1112a;
        c2903cM2065a.f1023l = c2930b.m2152a();
        String strM2106a = C2916c.m2097a().m2106a(false);
        int i4 = c2930b.f1119a.f1114c;
        if (i4 == 0) {
            C2901a c2901aM2055a = C2901a.m2055a();
            byte[] bArr = c2930b.f1121c;
            boolean z4 = c2930b.f1120b.f1124b;
            String strM2066b = c2903cM2065a.m2066b();
            String strM2056a = C2901a.m2056a(strM2106a, c2903cM2065a);
            if (c2901aM2055a.f1009a) {
                C2957d.m2212a("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(strM2056a)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strM2066b);
            C2953d c2953dM2202a = new C2953d(strM2056a).m2202a(map);
            C2951b c2951b = c2953dM2202a.f1149a;
            c2951b.f1143c = bArr;
            c2951b.f1147g = true;
            C2953d c2953dM2201a = c2953dM2202a.m2201a("type", c2903cM2065a.f1019h);
            StringBuilder sb = new StringBuilder();
            sb.append(c2903cM2065a.f1023l);
            httpResponseM2059a = c2953dM2201a.m2201a("size", sb.toString()).m2201a("flow_limit", Boolean.toString(z4)).m2200a(C2904d.m2067a()).m2199a().m2198b();
        } else {
            httpResponseM2059a = 1 == i4 ? C2901a.m2055a().m2059a(strM2106a, c2903cM2065a, c2930b.f1122d, c2930b.f1120b.f1124b) : new HttpResponse();
        }
        if (httpResponseM2059a.succ && z3) {
            C2949b.m2188b(c2930b.f1122d);
        }
        return httpResponseM2059a;
    }
}
