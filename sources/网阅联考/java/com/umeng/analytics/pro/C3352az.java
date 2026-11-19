package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3363bj;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.analytics.pro.az */
/* loaded from: classes2.dex */
public class C3352az {

    /* renamed from: a */
    private final ByteArrayOutputStream f1837a;

    /* renamed from: b */
    private final C3382cb f1838b;

    /* renamed from: c */
    private AbstractC3369bp f1839c;

    public C3352az() {
        this(new C3363bj.a());
    }

    /* renamed from: a */
    public byte[] m3000a(InterfaceC3343aq interfaceC3343aq) throws C3349aw {
        this.f1837a.reset();
        interfaceC3343aq.write(this.f1839c);
        return this.f1837a.toByteArray();
    }

    /* renamed from: b */
    public String m3001b(InterfaceC3343aq interfaceC3343aq) throws C3349aw {
        return new String(m3000a(interfaceC3343aq));
    }

    public C3352az(InterfaceC3371br interfaceC3371br) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f1837a = byteArrayOutputStream;
        C3382cb c3382cb = new C3382cb(byteArrayOutputStream);
        this.f1838b = c3382cb;
        this.f1839c = interfaceC3371br.mo3081a(c3382cb);
    }

    /* renamed from: a */
    public String m2999a(InterfaceC3343aq interfaceC3343aq, String str) throws C3349aw {
        try {
            return new String(m3000a(interfaceC3343aq), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
