package com.efs.sdk.base.p020a.p022b;

import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.d */
/* loaded from: classes2.dex */
public final class C2908d implements InterfaceC2909e {
    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2083a(String str) {
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2082a(File file) throws Throwable {
        C2949b.m2183a(file, C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a));
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final boolean mo2084a(File file, C2930b c2930b) {
        if (!file.exists()) {
            return false;
        }
        c2930b.f1122d = file;
        c2930b.m2159d();
        c2930b.m2156b(1);
        return true;
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2081a(C2930b c2930b) {
        if (c2930b.f1121c == null) {
            return;
        }
        C2949b.m2185a(new File(C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a), C2949b.m2180a(c2930b)), c2930b.f1121c);
        C2967f.a.f1173a.f1171c.m2229b();
        C2967f.a.f1173a.f1171c.m2230c();
    }
}
