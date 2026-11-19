package com.efs.sdk.base.p035a.p037b;

import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.d */
/* loaded from: classes.dex */
public final class C1280d implements InterfaceC1281e {
    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5441a(File file) throws Throwable {
        C1321b.m5542a(file, C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a));
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5442a(String str) {
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final boolean mo5443a(File file, C1302b c1302b) {
        if (!file.exists()) {
            return false;
        }
        c1302b.f7092d = file;
        c1302b.m5518d();
        c1302b.m5515b(1);
        return true;
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5440a(C1302b c1302b) {
        if (c1302b.f7091c == null) {
            return;
        }
        C1321b.m5544a(new File(C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a), C1321b.m5539a(c1302b)), c1302b.f7091c);
        C1339f.a.f7143a.f7141c.m5588b();
        C1339f.a.f7143a.f7141c.m5589c();
    }
}
