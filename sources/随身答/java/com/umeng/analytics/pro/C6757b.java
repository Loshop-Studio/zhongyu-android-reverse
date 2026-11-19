package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C6764bj;
import java.io.ByteArrayOutputStream;
import p114g2.AbstractC8039s;
import p114g2.C8004a0;

/* renamed from: com.umeng.analytics.pro.b */
/* loaded from: classes4.dex */
public class C6757b {

    /* renamed from: a */
    public final ByteArrayOutputStream f6610a;

    /* renamed from: b */
    public final C8004a0 f6611b;

    /* renamed from: c */
    public AbstractC8039s f6612c;

    public C6757b() {
        this(new C6764bj.a());
    }

    /* renamed from: a */
    public byte[] m6068a(InterfaceC6755aq interfaceC6755aq) {
        this.f6610a.reset();
        interfaceC6755aq.mo6055m(this.f6612c);
        return this.f6610a.toByteArray();
    }

    public C6757b(InterfaceC6766br interfaceC6766br) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f6610a = byteArrayOutputStream;
        C8004a0 c8004a0 = new C8004a0(byteArrayOutputStream);
        this.f6611b = c8004a0;
        this.f6612c = interfaceC6766br.mo6107h(c8004a0);
    }
}
