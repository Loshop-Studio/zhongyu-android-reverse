package com.efs.sdk.base.p035a.p037b;

import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p042e.HandlerC1296b;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1321b;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.h */
/* loaded from: classes.dex */
public final class C1284h implements InterfaceC1282f {
    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1282f
    /* renamed from: a */
    public final boolean mo5444a(File file) {
        C1302b c1302bM5546b = C1321b.m5546b(file.getName());
        if (c1302bM5546b != null) {
            return ("wa".equals(c1302bM5546b.f7089a.f7082a) || HandlerC1296b.m5495a().m5501a(c1302bM5546b.f7089a.f7082a, file.length())) ? false : true;
        }
        C1277a unused = C1277a.b.f6999a;
        C1277a.m5432b(file);
        return true;
    }
}
