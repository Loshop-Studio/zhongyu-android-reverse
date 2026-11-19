package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C6764bj;
import p114g2.AbstractC8039s;
import p114g2.C8006b0;

/* renamed from: com.umeng.analytics.pro.a */
/* loaded from: classes4.dex */
public class C6753a {

    /* renamed from: a */
    public final AbstractC8039s f6569a;

    /* renamed from: b */
    public final C8006b0 f6570b;

    public C6753a() {
        this(new C6764bj.a());
    }

    /* renamed from: a */
    public void m6018a(InterfaceC6755aq interfaceC6755aq, byte[] bArr) {
        try {
            this.f6570b.m12566i(bArr);
            interfaceC6755aq.mo6057p(this.f6569a);
        } finally {
            this.f6570b.m12568k();
            this.f6569a.mo6128b();
        }
    }

    public C6753a(InterfaceC6766br interfaceC6766br) {
        C8006b0 c8006b0 = new C8006b0();
        this.f6570b = c8006b0;
        this.f6569a = interfaceC6766br.mo6107h(c8006b0);
    }
}
