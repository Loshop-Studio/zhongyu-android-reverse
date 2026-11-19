package com.efs.sdk.base.p020a.p029g.p030a;

import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p022b.HandlerC2907c;
import com.efs.sdk.base.p020a.p022b.InterfaceC2909e;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p028f.C2929a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p035i.C2967f;

/* renamed from: com.efs.sdk.base.a.g.a.b */
/* loaded from: classes2.dex */
public final class C2935b extends AbstractC2934a {
    @Override // com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a
    /* renamed from: a */
    public final void mo2162a(C2930b c2930b) {
        InterfaceC2909e interfaceC2909eM2078a;
        byte[] bArr;
        if (c2930b.f1120b.f1123a) {
            m2163b(c2930b);
            return;
        }
        C2905a c2905a = C2905a.b.f1029a;
        if ("wa".equals(c2930b.f1119a.f1112a) || HandlerC2907c.m2079a().f1031a) {
            C2929a c2929a = c2930b.f1119a;
            if ((c2929a.f1114c == 0 && ((bArr = c2930b.f1121c) == null || bArr.length == 0)) || (interfaceC2909eM2078a = c2905a.f1027c.m2078a(c2929a.f1113b)) == null) {
                return;
            }
            interfaceC2909eM2078a.mo2081a(c2930b);
            return;
        }
        if (!c2905a.f1025a) {
            C2967f c2967f = C2967f.a.f1173a;
            int i4 = C2916c.m2097a().f1065d.f1056a;
            if (c2967f.f1170b != null || C2921a.m2128a().f1041d) {
                c2967f.f1170b.m2133a(c2967f.m2234a("disk_limit", i4));
            }
        }
        c2905a.f1025a = true;
    }
}
