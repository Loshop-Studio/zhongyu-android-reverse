package com.taobao.sophix.p090b;

import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p090b.p091a.InterfaceC7723a;
import com.taobao.sophix.p090b.p091a.p092a.C7725b;
import com.taobao.sophix.p090b.p091a.p093b.C7727b;
import com.taobao.sophix.p094c.C7733c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7749j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.a */
/* loaded from: classes5.dex */
public class C7722a {
    /* renamed from: a */
    public boolean m10266a(File file, boolean z10, PatchLoadStatusListener patchLoadStatusListener, C7733c c7733c) {
        C7744e.m10400b("DexManager", "patch", "supportHotfix", Boolean.valueOf(z10));
        InterfaceC7723a c7727b = z10 ? new C7727b() : new C7725b(patchLoadStatusListener, c7733c);
        C7749j.m10431b(C7728b.f13354b, "happ_ishotfix", z10);
        return c7727b.mo10267a(file);
    }
}
