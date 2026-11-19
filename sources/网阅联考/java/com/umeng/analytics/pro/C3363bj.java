package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* renamed from: com.umeng.analytics.pro.bj */
/* loaded from: classes2.dex */
public class C3363bj extends AbstractC3369bp {

    /* renamed from: d */
    private static final C3374bu f1876d = new C3374bu("");

    /* renamed from: e */
    private static final C3364bk f1877e = new C3364bk("", (byte) 0, 0);

    /* renamed from: f */
    private static final byte[] f1878f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* renamed from: h */
    private static final byte f1879h = -126;

    /* renamed from: i */
    private static final byte f1880i = 1;

    /* renamed from: j */
    private static final byte f1881j = 31;

    /* renamed from: k */
    private static final byte f1882k = -32;

    /* renamed from: l */
    private static final int f1883l = 5;

    /* renamed from: a */
    byte[] f1884a;

    /* renamed from: b */
    byte[] f1885b;

    /* renamed from: c */
    byte[] f1886c;

    /* renamed from: m */
    private C3341ao f1887m;

    /* renamed from: n */
    private short f1888n;

    /* renamed from: o */
    private C3364bk f1889o;

    /* renamed from: p */
    private Boolean f1890p;

    /* renamed from: q */
    private final long f1891q;

    /* renamed from: r */
    private byte[] f1892r;

    /* renamed from: com.umeng.analytics.pro.bj$b */
    public static class b {

        /* renamed from: a */
        public static final byte f1894a = 1;

        /* renamed from: b */
        public static final byte f1895b = 2;

        /* renamed from: c */
        public static final byte f1896c = 3;

        /* renamed from: d */
        public static final byte f1897d = 4;

        /* renamed from: e */
        public static final byte f1898e = 5;

        /* renamed from: f */
        public static final byte f1899f = 6;

        /* renamed from: g */
        public static final byte f1900g = 7;

        /* renamed from: h */
        public static final byte f1901h = 8;

        /* renamed from: i */
        public static final byte f1902i = 9;

        /* renamed from: j */
        public static final byte f1903j = 10;

        /* renamed from: k */
        public static final byte f1904k = 11;

        /* renamed from: l */
        public static final byte f1905l = 12;

        private b() {
        }
    }

    public C3363bj(AbstractC3384cd abstractC3384cd, long j4) {
        super(abstractC3384cd);
        this.f1887m = new C3341ao(15);
        this.f1888n = (short) 0;
        this.f1889o = null;
        this.f1890p = null;
        this.f1884a = new byte[5];
        this.f1885b = new byte[10];
        this.f1892r = new byte[1];
        this.f1886c = new byte[1];
        this.f1891q = j4;
    }

    /* renamed from: E */
    private int m3082E() throws C3349aw {
        int i4 = 0;
        if (this.f1921g.mo3128h() >= 5) {
            byte[] bArrMo3126f = this.f1921g.mo3126f();
            int iMo3127g = this.f1921g.mo3127g();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                byte b4 = bArrMo3126f[iMo3127g + i4];
                i5 |= (b4 & ByteCompanionObject.MAX_VALUE) << i6;
                if ((b4 & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.f1921g.mo3122a(i4 + 1);
                    return i5;
                }
                i6 += 7;
                i4++;
            }
        } else {
            int i7 = 0;
            while (true) {
                byte bMo3075u = mo3075u();
                i4 |= (bMo3075u & ByteCompanionObject.MAX_VALUE) << i7;
                if ((bMo3075u & ByteCompanionObject.MIN_VALUE) != 128) {
                    return i4;
                }
                i7 += 7;
            }
        }
    }

    /* renamed from: F */
    private long m3083F() throws C3349aw {
        int i4 = 0;
        long j4 = 0;
        if (this.f1921g.mo3128h() >= 10) {
            byte[] bArrMo3126f = this.f1921g.mo3126f();
            int iMo3127g = this.f1921g.mo3127g();
            long j5 = 0;
            int i5 = 0;
            while (true) {
                j5 |= (r7 & ByteCompanionObject.MAX_VALUE) << i5;
                if ((bArrMo3126f[iMo3127g + i4] & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.f1921g.mo3122a(i4 + 1);
                    return j5;
                }
                i5 += 7;
                i4++;
            }
        } else {
            while (true) {
                j4 |= (r0 & ByteCompanionObject.MAX_VALUE) << i4;
                if ((mo3075u() & ByteCompanionObject.MIN_VALUE) != 128) {
                    return j4;
                }
                i4 += 7;
            }
        }
    }

    /* renamed from: c */
    private int m3091c(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    /* renamed from: d */
    private long m3095d(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    /* renamed from: g */
    private int m3100g(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: A */
    public ByteBuffer mo3037A() throws C3349aw {
        int iM3082E = m3082E();
        m3099f(iM3082E);
        if (iM3082E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iM3082E];
        this.f1921g.m3130d(bArr, 0, iM3082E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: B */
    public void mo3101B() {
        this.f1887m.m2956c();
        this.f1888n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3038a() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: b */
    public void mo3054b() throws C3349aw {
        this.f1888n = this.f1887m.m2953a();
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: e */
    public void mo3059e() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: f */
    public void mo3060f() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: h */
    public C3367bn mo3062h() throws C3349aw {
        byte bMo3075u = mo3075u();
        if (bMo3075u != -126) {
            throw new C3370bq("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bMo3075u));
        }
        byte bMo3075u2 = mo3075u();
        byte b4 = (byte) (bMo3075u2 & f1881j);
        if (b4 == 1) {
            return new C3367bn(mo3080z(), (byte) ((bMo3075u2 >> 5) & 3), m3082E());
        }
        throw new C3370bq("Expected version 1 but got " + ((int) b4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: i */
    public void mo3063i() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: j */
    public C3374bu mo3064j() throws C3349aw {
        this.f1887m.m2954a(this.f1888n);
        this.f1888n = (short) 0;
        return f1876d;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: k */
    public void mo3065k() throws C3349aw {
        this.f1888n = this.f1887m.m2953a();
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: l */
    public C3364bk mo3066l() throws C3349aw {
        byte bMo3075u = mo3075u();
        if (bMo3075u == 0) {
            return f1877e;
        }
        short s3 = (short) ((bMo3075u & 240) >> 4);
        short sMo3076v = s3 == 0 ? mo3076v() : (short) (this.f1888n + s3);
        byte b4 = (byte) (bMo3075u & C3376bw.f1946m);
        C3364bk c3364bk = new C3364bk("", m3094d(b4), sMo3076v);
        if (m3093c(bMo3075u)) {
            this.f1890p = b4 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f1888n = c3364bk.f1908c;
        return c3364bk;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: m */
    public void mo3067m() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: n */
    public C3366bm mo3068n() throws C3349aw {
        int iM3082E = m3082E();
        byte bMo3075u = iM3082E == 0 ? (byte) 0 : mo3075u();
        return new C3366bm(m3094d((byte) (bMo3075u >> 4)), m3094d((byte) (bMo3075u & C3376bw.f1946m)), iM3082E);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: o */
    public void mo3069o() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: p */
    public C3365bl mo3070p() throws C3349aw {
        byte bMo3075u = mo3075u();
        int iM3082E = (bMo3075u >> 4) & 15;
        if (iM3082E == 15) {
            iM3082E = m3082E();
        }
        return new C3365bl(m3094d(bMo3075u), iM3082E);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: q */
    public void mo3071q() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: r */
    public C3373bt mo3072r() throws C3349aw {
        return new C3373bt(mo3070p());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: s */
    public void mo3073s() throws C3349aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: t */
    public boolean mo3074t() throws C3349aw {
        Boolean bool = this.f1890p;
        if (bool == null) {
            return mo3075u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f1890p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: u */
    public byte mo3075u() throws C3349aw {
        if (this.f1921g.mo3128h() <= 0) {
            this.f1921g.m3130d(this.f1886c, 0, 1);
            return this.f1886c[0];
        }
        byte b4 = this.f1921g.mo3126f()[this.f1921g.mo3127g()];
        this.f1921g.mo3122a(1);
        return b4;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: v */
    public short mo3076v() throws C3349aw {
        return (short) m3100g(m3082E());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: w */
    public int mo3077w() throws C3349aw {
        return m3100g(m3082E());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: x */
    public long mo3078x() throws C3349aw {
        return m3095d(m3083F());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: y */
    public double mo3079y() throws C3349aw {
        byte[] bArr = new byte[8];
        this.f1921g.m3130d(bArr, 0, 8);
        return Double.longBitsToDouble(m3084a(bArr));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: z */
    public String mo3080z() throws C3349aw {
        int iM3082E = m3082E();
        m3099f(iM3082E);
        if (iM3082E == 0) {
            return "";
        }
        try {
            if (this.f1921g.mo3128h() < iM3082E) {
                return new String(m3098e(iM3082E), "UTF-8");
            }
            String str = new String(this.f1921g.mo3126f(), this.f1921g.mo3127g(), iM3082E, "UTF-8");
            this.f1921g.mo3122a(iM3082E);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("UTF-8 not supported!");
        }
    }

    /* renamed from: com.umeng.analytics.pro.bj$a */
    public static class a implements InterfaceC3371br {

        /* renamed from: a */
        private final long f1893a;

        public a() {
            this.f1893a = -1L;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3371br
        /* renamed from: a */
        public AbstractC3369bp mo3081a(AbstractC3384cd abstractC3384cd) {
            return new C3363bj(abstractC3384cd, this.f1893a);
        }

        public a(int i4) {
            this.f1893a = i4;
        }
    }

    /* renamed from: b */
    private void m3089b(int i4) throws C3349aw {
        int i5 = 0;
        while ((i4 & (-128)) != 0) {
            this.f1884a[i5] = (byte) ((i4 & WorkQueueKt.MASK) | 128);
            i4 >>>= 7;
            i5++;
        }
        byte[] bArr = this.f1884a;
        bArr[i5] = (byte) i4;
        this.f1921g.mo3119b(bArr, 0, i5 + 1);
    }

    /* renamed from: c */
    private long m3092c(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    /* renamed from: e */
    private byte[] m3098e(int i4) throws C3349aw {
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i4];
        this.f1921g.m3130d(bArr, 0, i4);
        return bArr;
    }

    /* renamed from: f */
    private void m3099f(int i4) throws C3370bq {
        if (i4 < 0) {
            throw new C3370bq("Negative length: " + i4);
        }
        long j4 = this.f1891q;
        if (j4 == -1 || i4 <= j4) {
            return;
        }
        throw new C3370bq("Length exceeded max allowed: " + i4);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3046a(C3367bn c3367bn) throws C3349aw {
        m3088b(f1879h);
        m3096d(((c3367bn.f1915b << 5) & (-32)) | 1);
        m3089b(c3367bn.f1916c);
        mo3049a(c3367bn.f1914a);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: d */
    public void mo3057d() throws C3349aw {
        m3088b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: g */
    public void mo3061g() throws C3349aw {
    }

    /* renamed from: d */
    private void m3096d(int i4) throws C3349aw {
        m3088b((byte) i4);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: c */
    public void mo3055c() throws C3349aw {
    }

    /* renamed from: c */
    private boolean m3093c(byte b4) {
        int i4 = b4 & C3376bw.f1946m;
        return i4 == 1 || i4 == 2;
    }

    /* renamed from: d */
    private byte m3094d(byte b4) throws C3370bq {
        byte b5 = (byte) (b4 & C3376bw.f1946m);
        switch (b5) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return C3376bw.f1946m;
            case 10:
                return C3376bw.f1945l;
            case 11:
                return C3376bw.f1944k;
            case 12:
                return (byte) 12;
            default:
                throw new C3370bq("don't know what type: " + ((int) b5));
        }
    }

    /* renamed from: e */
    private byte m3097e(byte b4) {
        return f1878f[b4];
    }

    /* renamed from: b */
    private void m3090b(long j4) throws C3349aw {
        int i4 = 0;
        while (((-128) & j4) != 0) {
            this.f1885b[i4] = (byte) ((127 & j4) | 128);
            j4 >>>= 7;
            i4++;
        }
        byte[] bArr = this.f1885b;
        bArr[i4] = (byte) j4;
        this.f1921g.mo3119b(bArr, 0, i4 + 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3048a(C3374bu c3374bu) throws C3349aw {
        this.f1887m.m2954a(this.f1888n);
        this.f1888n = (short) 0;
    }

    /* renamed from: b */
    private void m3088b(byte b4) throws C3349aw {
        byte[] bArr = this.f1892r;
        bArr[0] = b4;
        this.f1921g.m3129b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3043a(C3364bk c3364bk) throws C3349aw {
        if (c3364bk.f1907b == 2) {
            this.f1889o = c3364bk;
        } else {
            m3086a(c3364bk, (byte) -1);
        }
    }

    public C3363bj(AbstractC3384cd abstractC3384cd) {
        this(abstractC3384cd, -1L);
    }

    /* renamed from: a */
    private void m3086a(C3364bk c3364bk, byte b4) throws C3349aw {
        if (b4 == -1) {
            b4 = m3097e(c3364bk.f1907b);
        }
        short s3 = c3364bk.f1908c;
        short s4 = this.f1888n;
        if (s3 > s4 && s3 - s4 <= 15) {
            m3096d(b4 | ((s3 - s4) << 4));
        } else {
            m3088b(b4);
            mo3051a(c3364bk.f1908c);
        }
        this.f1888n = c3364bk.f1908c;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3045a(C3366bm c3366bm) throws C3349aw {
        int i4 = c3366bm.f1913c;
        if (i4 == 0) {
            m3096d(0);
            return;
        }
        m3089b(i4);
        m3096d(m3097e(c3366bm.f1912b) | (m3097e(c3366bm.f1911a) << 4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3044a(C3365bl c3365bl) throws C3349aw {
        m3102a(c3365bl.f1909a, c3365bl.f1910b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3047a(C3373bt c3373bt) throws C3349aw {
        m3102a(c3373bt.f1931a, c3373bt.f1932b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3052a(boolean z3) throws C3349aw {
        C3364bk c3364bk = this.f1889o;
        if (c3364bk != null) {
            m3086a(c3364bk, z3 ? (byte) 1 : (byte) 2);
            this.f1889o = null;
        } else {
            m3088b(z3 ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3039a(byte b4) throws C3349aw {
        m3088b(b4);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3051a(short s3) throws C3349aw {
        m3089b(m3091c((int) s3));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3041a(int i4) throws C3349aw {
        m3089b(m3091c(i4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3042a(long j4) throws C3349aw {
        m3090b(m3092c(j4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3040a(double d4) throws C3349aw {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m3085a(Double.doubleToLongBits(d4), bArr, 0);
        this.f1921g.m3129b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3049a(String str) throws C3349aw {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m3087a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3050a(ByteBuffer byteBuffer) throws C3349aw {
        m3087a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: a */
    private void m3087a(byte[] bArr, int i4, int i5) throws C3349aw {
        m3089b(i5);
        this.f1921g.mo3119b(bArr, i4, i5);
    }

    /* renamed from: a */
    public void m3102a(byte b4, int i4) throws C3349aw {
        if (i4 <= 14) {
            m3096d(m3097e(b4) | (i4 << 4));
        } else {
            m3096d(m3097e(b4) | 240);
            m3089b(i4);
        }
    }

    /* renamed from: a */
    private void m3085a(long j4, byte[] bArr, int i4) {
        bArr[i4 + 0] = (byte) (j4 & 255);
        bArr[i4 + 1] = (byte) ((j4 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((j4 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((j4 >> 24) & 255);
        bArr[i4 + 4] = (byte) ((j4 >> 32) & 255);
        bArr[i4 + 5] = (byte) ((j4 >> 40) & 255);
        bArr[i4 + 6] = (byte) ((j4 >> 48) & 255);
        bArr[i4 + 7] = (byte) ((j4 >> 56) & 255);
    }

    /* renamed from: a */
    private long m3084a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }
}
