package com.taobao.sophix.p060b;

import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p060b.p061a.InterfaceC6617a;
import com.taobao.sophix.p060b.p061a.p062a.C6619b;
import com.taobao.sophix.p060b.p061a.p063b.C6621b;
import com.taobao.sophix.p064c.C6627c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6643j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.a */
/* loaded from: classes4.dex */
public class C6616a {
    /* renamed from: a */
    public boolean m4754a(File file, boolean z9, PatchLoadStatusListener patchLoadStatusListener, C6627c c6627c) {
        C6638e.m4888b("DexManager", "patch", "supportHotfix", Boolean.valueOf(z9));
        InterfaceC6617a c6621b = z9 ? new C6621b() : new C6619b(patchLoadStatusListener, c6627c);
        C6643j.m4919b(C6622b.f5489b, "happ_ishotfix", z9);
        return c6621b.mo4755a(file);
    }
}
