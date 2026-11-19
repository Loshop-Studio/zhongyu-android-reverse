package com.efs.sdk.base.p039a.p041b;

import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.d */
/* loaded from: classes3.dex */
public final class C5648d implements InterfaceC5649e {
    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4052a(String str) {
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4051a(File file) throws Throwable {
        C5689b.m4152a(file, C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a));
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final boolean mo4053a(File file, C5670b c5670b) {
        if (!file.exists()) {
            return false;
        }
        c5670b.f4726d = file;
        c5670b.m4128d();
        c5670b.m4125b(1);
        return true;
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4050a(C5670b c5670b) {
        if (c5670b.f4725c == null) {
            return;
        }
        C5689b.m4154a(new File(C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a), C5689b.m4149a(c5670b)), c5670b.f4725c);
        C5707f.a.f4777a.f4775c.m4198b();
        C5707f.a.f4777a.f4775c.m4199c();
    }
}
