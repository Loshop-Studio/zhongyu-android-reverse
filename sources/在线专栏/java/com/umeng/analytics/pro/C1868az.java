package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C1879bj;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.analytics.pro.az */
/* loaded from: classes.dex */
public class C1868az {

    /* renamed from: a */
    private final ByteArrayOutputStream f8429a;

    /* renamed from: b */
    private final C1898cb f8430b;

    /* renamed from: c */
    private AbstractC1885bp f8431c;

    public C1868az() {
        this(new C1879bj.a());
    }

    /* renamed from: a */
    public byte[] m6923a(InterfaceC1859aq interfaceC1859aq) throws C1865aw {
        this.f8429a.reset();
        interfaceC1859aq.write(this.f8431c);
        return this.f8429a.toByteArray();
    }

    /* renamed from: b */
    public String m6924b(InterfaceC1859aq interfaceC1859aq) throws C1865aw {
        return new String(m6923a(interfaceC1859aq));
    }

    public C1868az(InterfaceC1887br interfaceC1887br) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f8429a = byteArrayOutputStream;
        C1898cb c1898cb = new C1898cb(byteArrayOutputStream);
        this.f8430b = c1898cb;
        this.f8431c = interfaceC1887br.mo7004a(c1898cb);
    }

    /* renamed from: a */
    public String m6922a(InterfaceC1859aq interfaceC1859aq, String str) throws C1865aw {
        try {
            return new String(m6923a(interfaceC1859aq), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
