package com.efs.sdk.base.p020a.p022b;

import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p027e.HandlerC2924b;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2949b;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.h */
/* loaded from: classes2.dex */
public final class C2912h implements InterfaceC2910f {
    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2910f
    /* renamed from: a */
    public final boolean mo2085a(File file) {
        C2930b c2930bM2187b = C2949b.m2187b(file.getName());
        if (c2930bM2187b != null) {
            return ("wa".equals(c2930bM2187b.f1119a.f1112a) || HandlerC2924b.m2136a().m2142a(c2930bM2187b.f1119a.f1112a, file.length())) ? false : true;
        }
        C2905a unused = C2905a.b.f1029a;
        C2905a.m2073b(file);
        return true;
    }
}
