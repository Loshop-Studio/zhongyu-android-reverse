package com.efs.sdk.base.p039a.p041b;

import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p046e.HandlerC5664b;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5689b;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.h */
/* loaded from: classes3.dex */
public final class C5652h implements InterfaceC5650f {
    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5650f
    /* renamed from: a */
    public final boolean mo4054a(File file) {
        C5670b c5670bM4156b = C5689b.m4156b(file.getName());
        if (c5670bM4156b != null) {
            return ("wa".equals(c5670bM4156b.f4723a.f4716a) || HandlerC5664b.m4105a().m4111a(c5670bM4156b.f4723a.f4716a, file.length())) ? false : true;
        }
        C5645a unused = C5645a.b.f4633a;
        C5645a.m4042b(file);
        return true;
    }
}
