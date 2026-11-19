package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3363bj;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.at */
/* loaded from: classes2.dex */
public class C3346at {

    /* renamed from: a */
    private final AbstractC3369bp f1831a;

    /* renamed from: b */
    private final C3383cc f1832b;

    public C3346at() {
        this(new C3363bj.a());
    }

    /* renamed from: j */
    private C3364bk m2984j(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        this.f1832b.m3123a(bArr);
        int length = interfaceC3350axArr.length + 1;
        InterfaceC3350ax[] interfaceC3350axArr2 = new InterfaceC3350ax[length];
        int i4 = 0;
        interfaceC3350axArr2[0] = interfaceC3350ax;
        int i5 = 0;
        while (i5 < interfaceC3350axArr.length) {
            int i6 = i5 + 1;
            interfaceC3350axArr2[i6] = interfaceC3350axArr[i5];
            i5 = i6;
        }
        this.f1831a.mo3064j();
        C3364bk c3364bkMo3066l = null;
        while (i4 < length) {
            c3364bkMo3066l = this.f1831a.mo3066l();
            if (c3364bkMo3066l.f1907b == 0 || c3364bkMo3066l.f1908c > interfaceC3350axArr2[i4].mo2921a()) {
                return null;
            }
            if (c3364bkMo3066l.f1908c != interfaceC3350axArr2[i4].mo2921a()) {
                C3372bs.m3110a(this.f1831a, c3364bkMo3066l.f1907b);
                this.f1831a.mo3067m();
            } else {
                i4++;
                if (i4 < length) {
                    this.f1831a.mo3064j();
                }
            }
        }
        return c3364bkMo3066l;
    }

    /* renamed from: a */
    public void m2988a(InterfaceC3343aq interfaceC3343aq, byte[] bArr) throws C3349aw {
        try {
            this.f1832b.m3123a(bArr);
            interfaceC3343aq.read(this.f1831a);
        } finally {
            this.f1832b.m3125e();
            this.f1831a.mo3101B();
        }
    }

    /* renamed from: b */
    public Byte m2990b(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Byte) m2983a((byte) 3, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: c */
    public Double m2991c(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Double) m2983a((byte) 4, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: d */
    public Short m2992d(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Short) m2983a((byte) 6, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: e */
    public Integer m2993e(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Integer) m2983a((byte) 8, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: f */
    public Long m2994f(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Long) m2983a((byte) 10, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: g */
    public String m2995g(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (String) m2983a((byte) 11, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: h */
    public ByteBuffer m2996h(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (ByteBuffer) m2983a((byte) 100, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: i */
    public Short m2997i(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        try {
            try {
                if (m2984j(bArr, interfaceC3350ax, interfaceC3350axArr) != null) {
                    this.f1831a.mo3064j();
                    return Short.valueOf(this.f1831a.mo3066l().f1908c);
                }
                this.f1832b.m3125e();
                this.f1831a.mo3101B();
                return null;
            } catch (Exception e4) {
                throw new C3349aw(e4);
            }
        } finally {
            this.f1832b.m3125e();
            this.f1831a.mo3101B();
        }
    }

    public C3346at(InterfaceC3371br interfaceC3371br) {
        C3383cc c3383cc = new C3383cc();
        this.f1832b = c3383cc;
        this.f1831a = interfaceC3371br.mo3081a(c3383cc);
    }

    /* renamed from: a */
    public void m2987a(InterfaceC3343aq interfaceC3343aq, String str, String str2) throws C3349aw {
        try {
            try {
                m2988a(interfaceC3343aq, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new C3349aw("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f1831a.mo3101B();
        }
    }

    /* renamed from: a */
    public void m2989a(InterfaceC3343aq interfaceC3343aq, byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        try {
            try {
                if (m2984j(bArr, interfaceC3350ax, interfaceC3350axArr) != null) {
                    interfaceC3343aq.read(this.f1831a);
                }
            } catch (Exception e4) {
                throw new C3349aw(e4);
            }
        } finally {
            this.f1832b.m3125e();
            this.f1831a.mo3101B();
        }
    }

    /* renamed from: a */
    public Boolean m2985a(byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        return (Boolean) m2983a((byte) 2, bArr, interfaceC3350ax, interfaceC3350axArr);
    }

    /* renamed from: a */
    private Object m2983a(byte b4, byte[] bArr, InterfaceC3350ax interfaceC3350ax, InterfaceC3350ax... interfaceC3350axArr) throws C3349aw {
        try {
            try {
                C3364bk c3364bkM2984j = m2984j(bArr, interfaceC3350ax, interfaceC3350axArr);
                if (c3364bkM2984j != null) {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            if (b4 != 4) {
                                if (b4 != 6) {
                                    if (b4 != 8) {
                                        if (b4 != 100) {
                                            if (b4 != 10) {
                                                if (b4 == 11 && c3364bkM2984j.f1907b == 11) {
                                                    return this.f1831a.mo3080z();
                                                }
                                            } else if (c3364bkM2984j.f1907b == 10) {
                                                return Long.valueOf(this.f1831a.mo3078x());
                                            }
                                        } else if (c3364bkM2984j.f1907b == 11) {
                                            return this.f1831a.mo3037A();
                                        }
                                    } else if (c3364bkM2984j.f1907b == 8) {
                                        return Integer.valueOf(this.f1831a.mo3077w());
                                    }
                                } else if (c3364bkM2984j.f1907b == 6) {
                                    return Short.valueOf(this.f1831a.mo3076v());
                                }
                            } else if (c3364bkM2984j.f1907b == 4) {
                                return Double.valueOf(this.f1831a.mo3079y());
                            }
                        } else if (c3364bkM2984j.f1907b == 3) {
                            return Byte.valueOf(this.f1831a.mo3075u());
                        }
                    } else if (c3364bkM2984j.f1907b == 2) {
                        return Boolean.valueOf(this.f1831a.mo3074t());
                    }
                }
                this.f1832b.m3125e();
                this.f1831a.mo3101B();
                return null;
            } catch (Exception e4) {
                throw new C3349aw(e4);
            }
        } finally {
            this.f1832b.m3125e();
            this.f1831a.mo3101B();
        }
    }

    /* renamed from: a */
    public void m2986a(InterfaceC3343aq interfaceC3343aq, String str) throws C3349aw {
        m2988a(interfaceC3343aq, str.getBytes());
    }
}
