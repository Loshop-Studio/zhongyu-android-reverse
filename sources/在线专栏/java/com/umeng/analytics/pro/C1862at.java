package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C1879bj;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.at */
/* loaded from: classes.dex */
public class C1862at {

    /* renamed from: a */
    private final AbstractC1885bp f8423a;

    /* renamed from: b */
    private final C1899cc f8424b;

    public C1862at() {
        this(new C1879bj.a());
    }

    /* renamed from: j */
    private C1880bk m6907j(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        this.f8424b.m7046a(bArr);
        int length = interfaceC1866axArr.length + 1;
        InterfaceC1866ax[] interfaceC1866axArr2 = new InterfaceC1866ax[length];
        int i4 = 0;
        interfaceC1866axArr2[0] = interfaceC1866ax;
        int i5 = 0;
        while (i5 < interfaceC1866axArr.length) {
            int i6 = i5 + 1;
            interfaceC1866axArr2[i6] = interfaceC1866axArr[i5];
            i5 = i6;
        }
        this.f8423a.mo6987j();
        C1880bk c1880bkMo6989l = null;
        while (i4 < length) {
            c1880bkMo6989l = this.f8423a.mo6989l();
            if (c1880bkMo6989l.f8499b == 0 || c1880bkMo6989l.f8500c > interfaceC1866axArr2[i4].mo6844a()) {
                return null;
            }
            if (c1880bkMo6989l.f8500c != interfaceC1866axArr2[i4].mo6844a()) {
                C1888bs.m7033a(this.f8423a, c1880bkMo6989l.f8499b);
                this.f8423a.mo6990m();
            } else {
                i4++;
                if (i4 < length) {
                    this.f8423a.mo6987j();
                }
            }
        }
        return c1880bkMo6989l;
    }

    /* renamed from: a */
    public void m6911a(InterfaceC1859aq interfaceC1859aq, byte[] bArr) throws C1865aw {
        try {
            this.f8424b.m7046a(bArr);
            interfaceC1859aq.read(this.f8423a);
        } finally {
            this.f8424b.m7048e();
            this.f8423a.mo7024B();
        }
    }

    /* renamed from: b */
    public Byte m6913b(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Byte) m6906a((byte) 3, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: c */
    public Double m6914c(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Double) m6906a((byte) 4, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: d */
    public Short m6915d(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Short) m6906a((byte) 6, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: e */
    public Integer m6916e(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Integer) m6906a((byte) 8, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: f */
    public Long m6917f(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Long) m6906a((byte) 10, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: g */
    public String m6918g(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (String) m6906a((byte) 11, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: h */
    public ByteBuffer m6919h(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (ByteBuffer) m6906a((byte) 100, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* renamed from: i */
    public Short m6920i(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        Short shValueOf;
        try {
            try {
                if (m6907j(bArr, interfaceC1866ax, interfaceC1866axArr) != null) {
                    this.f8423a.mo6987j();
                    shValueOf = Short.valueOf(this.f8423a.mo6989l().f8500c);
                } else {
                    shValueOf = null;
                }
                return shValueOf;
            } catch (Exception e4) {
                throw new C1865aw(e4);
            }
        } finally {
            this.f8424b.m7048e();
            this.f8423a.mo7024B();
        }
    }

    public C1862at(InterfaceC1887br interfaceC1887br) {
        C1899cc c1899cc = new C1899cc();
        this.f8424b = c1899cc;
        this.f8423a = interfaceC1887br.mo7004a(c1899cc);
    }

    /* renamed from: a */
    public void m6910a(InterfaceC1859aq interfaceC1859aq, String str, String str2) throws C1865aw {
        try {
            try {
                m6911a(interfaceC1859aq, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new C1865aw("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f8423a.mo7024B();
        }
    }

    /* renamed from: a */
    public void m6912a(InterfaceC1859aq interfaceC1859aq, byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        try {
            try {
                if (m6907j(bArr, interfaceC1866ax, interfaceC1866axArr) != null) {
                    interfaceC1859aq.read(this.f8423a);
                }
            } catch (Exception e4) {
                throw new C1865aw(e4);
            }
        } finally {
            this.f8424b.m7048e();
            this.f8423a.mo7024B();
        }
    }

    /* renamed from: a */
    public Boolean m6908a(byte[] bArr, InterfaceC1866ax interfaceC1866ax, InterfaceC1866ax... interfaceC1866axArr) throws C1865aw {
        return (Boolean) m6906a((byte) 2, bArr, interfaceC1866ax, interfaceC1866axArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m6906a(byte r1, byte[] r2, com.umeng.analytics.pro.InterfaceC1866ax r3, com.umeng.analytics.pro.InterfaceC1866ax... r4) throws com.umeng.analytics.pro.C1865aw {
        /*
            r0 = this;
            com.umeng.analytics.pro.bk r2 = r0.m6907j(r2, r3, r4)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r2 == 0) goto L9e
            r3 = 2
            if (r1 == r3) goto L8f
            r3 = 3
            if (r1 == r3) goto L80
            r3 = 4
            if (r1 == r3) goto L71
            r3 = 6
            if (r1 == r3) goto L62
            r3 = 8
            if (r1 == r3) goto L53
            r3 = 100
            r4 = 11
            if (r1 == r3) goto L48
            r3 = 10
            if (r1 == r3) goto L39
            if (r1 == r4) goto L24
            goto L9e
        L24:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r4) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.String r1 = r1.mo7003z()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
        L2e:
            com.umeng.analytics.pro.cc r2 = r0.f8424b
            r2.m7048e()
            com.umeng.analytics.pro.bp r2 = r0.f8423a
            r2.mo7024B()
            return r1
        L39:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            long r1 = r1.mo7001x()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L48:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r4) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.nio.ByteBuffer r1 = r1.mo6960A()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L53:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            int r1 = r1.mo7000w()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L62:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            short r1 = r1.mo6999v()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Short r1 = java.lang.Short.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L71:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            double r1 = r1.mo7002y()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L80:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            byte r1 = r1.mo6998u()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L8f:
            byte r1 = r2.f8499b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.analytics.pro.bp r1 = r0.f8423a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            boolean r1 = r1.mo6997t()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L9e:
            r1 = 0
            goto L2e
        La0:
            r1 = move-exception
            goto La9
        La2:
            r1 = move-exception
            com.umeng.analytics.pro.aw r2 = new com.umeng.analytics.pro.aw     // Catch: java.lang.Throwable -> La0
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La0
            throw r2     // Catch: java.lang.Throwable -> La0
        La9:
            com.umeng.analytics.pro.cc r2 = r0.f8424b
            r2.m7048e()
            com.umeng.analytics.pro.bp r2 = r0.f8423a
            r2.mo7024B()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1862at.m6906a(byte, byte[], com.umeng.analytics.pro.ax, com.umeng.analytics.pro.ax[]):java.lang.Object");
    }

    /* renamed from: a */
    public void m6909a(InterfaceC1859aq interfaceC1859aq, String str) throws C1865aw {
        m6911a(interfaceC1859aq, str.getBytes());
    }
}
