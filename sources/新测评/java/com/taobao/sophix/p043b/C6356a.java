package com.taobao.sophix.p043b;

import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p043b.p044a.InterfaceC6357a;
import com.taobao.sophix.p043b.p044a.p045a.C6359b;
import com.taobao.sophix.p043b.p044a.p046b.C6361b;
import com.taobao.sophix.p047c.C6367c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6383j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.a */
/* loaded from: classes4.dex */
public class C6356a {
    /* renamed from: a */
    public boolean m4575a(File file, boolean z9, PatchLoadStatusListener patchLoadStatusListener, C6367c c6367c) {
        C6378e.m4709b("DexManager", "patch", "supportHotfix", Boolean.valueOf(z9));
        InterfaceC6357a c6361b = z9 ? new C6361b() : new C6359b(patchLoadStatusListener, c6367c);
        C6383j.m4740b(C6362b.f4912b, "happ_ishotfix", z9);
        return c6361b.mo4576a(file);
    }
}
