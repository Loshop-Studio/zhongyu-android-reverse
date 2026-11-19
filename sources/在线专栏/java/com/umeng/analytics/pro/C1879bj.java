package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.bj */
/* loaded from: classes.dex */
public class C1879bj extends AbstractC1885bp {

    /* renamed from: d */
    private static final C1890bu f8468d = new C1890bu("");

    /* renamed from: e */
    private static final C1880bk f8469e = new C1880bk("", (byte) 0, 0);

    /* renamed from: f */
    private static final byte[] f8470f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* renamed from: h */
    private static final byte f8471h = -126;

    /* renamed from: i */
    private static final byte f8472i = 1;

    /* renamed from: j */
    private static final byte f8473j = 31;

    /* renamed from: k */
    private static final byte f8474k = -32;

    /* renamed from: l */
    private static final int f8475l = 5;

    /* renamed from: a */
    byte[] f8476a;

    /* renamed from: b */
    byte[] f8477b;

    /* renamed from: c */
    byte[] f8478c;

    /* renamed from: m */
    private C1857ao f8479m;

    /* renamed from: n */
    private short f8480n;

    /* renamed from: o */
    private C1880bk f8481o;

    /* renamed from: p */
    private Boolean f8482p;

    /* renamed from: q */
    private final long f8483q;

    /* renamed from: r */
    private byte[] f8484r;

    /* renamed from: com.umeng.analytics.pro.bj$b */
    private static class b {

        /* renamed from: a */
        public static final byte f8486a = 1;

        /* renamed from: b */
        public static final byte f8487b = 2;

        /* renamed from: c */
        public static final byte f8488c = 3;

        /* renamed from: d */
        public static final byte f8489d = 4;

        /* renamed from: e */
        public static final byte f8490e = 5;

        /* renamed from: f */
        public static final byte f8491f = 6;

        /* renamed from: g */
        public static final byte f8492g = 7;

        /* renamed from: h */
        public static final byte f8493h = 8;

        /* renamed from: i */
        public static final byte f8494i = 9;

        /* renamed from: j */
        public static final byte f8495j = 10;

        /* renamed from: k */
        public static final byte f8496k = 11;

        /* renamed from: l */
        public static final byte f8497l = 12;

        private b() {
        }
    }

    public C1879bj(AbstractC1900cd abstractC1900cd, long j4) {
        super(abstractC1900cd);
        this.f8479m = new C1857ao(15);
        this.f8480n = (short) 0;
        this.f8481o = null;
        this.f8482p = null;
        this.f8476a = new byte[5];
        this.f8477b = new byte[10];
        this.f8484r = new byte[1];
        this.f8478c = new byte[1];
        this.f8483q = j4;
    }

    /* renamed from: E */
    private int m7005E() throws C1865aw {
        int i4 = 0;
        if (this.f8513g.mo7051h() >= 5) {
            byte[] bArrMo7049f = this.f8513g.mo7049f();
            int iMo7050g = this.f8513g.mo7050g();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                byte b4 = bArrMo7049f[iMo7050g + i4];
                i5 |= (b4 & 127) << i6;
                if ((b4 & 128) != 128) {
                    this.f8513g.mo7045a(i4 + 1);
                    return i5;
                }
                i6 += 7;
                i4++;
            }
        } else {
            int i7 = 0;
            while (true) {
                byte bMo6998u = mo6998u();
                i4 |= (bMo6998u & 127) << i7;
                if ((bMo6998u & 128) != 128) {
                    return i4;
                }
                i7 += 7;
            }
        }
    }

    /* renamed from: F */
    private long m7006F() throws C1865aw {
        int i4 = 0;
        long j4 = 0;
        if (this.f8513g.mo7051h() >= 10) {
            byte[] bArrMo7049f = this.f8513g.mo7049f();
            int iMo7050g = this.f8513g.mo7050g();
            long j5 = 0;
            int i5 = 0;
            while (true) {
                j5 |= (r4 & 127) << i5;
                if ((bArrMo7049f[iMo7050g + i4] & 128) != 128) {
                    this.f8513g.mo7045a(i4 + 1);
                    return j5;
                }
                i5 += 7;
                i4++;
            }
        } else {
            while (true) {
                j4 |= (r0 & 127) << i4;
                if ((mo6998u() & 128) != 128) {
                    return j4;
                }
                i4 += 7;
            }
        }
    }

    /* renamed from: c */
    private int m7014c(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    /* renamed from: c */
    private long m7015c(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    /* renamed from: c */
    private boolean m7016c(byte b4) {
        int i4 = b4 & C1892bw.f8538m;
        return i4 == 1 || i4 == 2;
    }

    /* renamed from: d */
    private long m7018d(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    /* renamed from: e */
    private byte[] m7021e(int i4) throws C1865aw {
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i4];
        this.f8513g.m7053d(bArr, 0, i4);
        return bArr;
    }

    /* renamed from: f */
    private void m7022f(int i4) throws C1886bq {
        if (i4 < 0) {
            throw new C1886bq("Negative length: " + i4);
        }
        long j4 = this.f8483q;
        if (j4 == -1 || i4 <= j4) {
            return;
        }
        throw new C1886bq("Length exceeded max allowed: " + i4);
    }

    /* renamed from: g */
    private int m7023g(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: A */
    public ByteBuffer mo6960A() throws C1865aw {
        int iM7005E = m7005E();
        m7022f(iM7005E);
        if (iM7005E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iM7005E];
        this.f8513g.m7053d(bArr, 0, iM7005E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: B */
    public void mo7024B() {
        this.f8479m.m6879c();
        this.f8480n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6961a() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6969a(C1883bn c1883bn) throws C1865aw {
        m7011b(f8471h);
        m7019d(((c1883bn.f8507b << 5) & (-32)) | 1);
        m7012b(c1883bn.f8508c);
        mo6972a(c1883bn.f8506a);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: b */
    public void mo6977b() throws C1865aw {
        this.f8480n = this.f8479m.m6876a();
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: c */
    public void mo6978c() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: d */
    public void mo6980d() throws C1865aw {
        m7011b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: e */
    public void mo6982e() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: f */
    public void mo6983f() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: g */
    public void mo6984g() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: h */
    public C1883bn mo6985h() throws C1865aw {
        byte bMo6998u = mo6998u();
        if (bMo6998u != -126) {
            throw new C1886bq("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bMo6998u));
        }
        byte bMo6998u2 = mo6998u();
        byte b4 = (byte) (bMo6998u2 & f8473j);
        if (b4 == 1) {
            return new C1883bn(mo7003z(), (byte) ((bMo6998u2 >> 5) & 3), m7005E());
        }
        throw new C1886bq("Expected version 1 but got " + ((int) b4));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: i */
    public void mo6986i() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: j */
    public C1890bu mo6987j() throws C1865aw {
        this.f8479m.m6877a(this.f8480n);
        this.f8480n = (short) 0;
        return f8468d;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: k */
    public void mo6988k() throws C1865aw {
        this.f8480n = this.f8479m.m6876a();
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: l */
    public C1880bk mo6989l() throws C1865aw {
        byte bMo6998u = mo6998u();
        if (bMo6998u == 0) {
            return f8469e;
        }
        short s3 = (short) ((bMo6998u & 240) >> 4);
        short sMo6999v = s3 == 0 ? mo6999v() : (short) (this.f8480n + s3);
        byte b4 = (byte) (bMo6998u & C1892bw.f8538m);
        C1880bk c1880bk = new C1880bk("", m7017d(b4), sMo6999v);
        if (m7016c(bMo6998u)) {
            this.f8482p = b4 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f8480n = c1880bk.f8500c;
        return c1880bk;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: m */
    public void mo6990m() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: n */
    public C1882bm mo6991n() throws C1865aw {
        int iM7005E = m7005E();
        byte bMo6998u = iM7005E == 0 ? (byte) 0 : mo6998u();
        return new C1882bm(m7017d((byte) (bMo6998u >> 4)), m7017d((byte) (bMo6998u & C1892bw.f8538m)), iM7005E);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: o */
    public void mo6992o() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: p */
    public C1881bl mo6993p() throws C1865aw {
        byte bMo6998u = mo6998u();
        int iM7005E = (bMo6998u >> 4) & 15;
        if (iM7005E == 15) {
            iM7005E = m7005E();
        }
        return new C1881bl(m7017d(bMo6998u), iM7005E);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: q */
    public void mo6994q() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: r */
    public C1889bt mo6995r() throws C1865aw {
        return new C1889bt(mo6993p());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: s */
    public void mo6996s() throws C1865aw {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: t */
    public boolean mo6997t() throws C1865aw {
        Boolean bool = this.f8482p;
        if (bool == null) {
            return mo6998u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f8482p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: u */
    public byte mo6998u() throws C1865aw {
        if (this.f8513g.mo7051h() <= 0) {
            this.f8513g.m7053d(this.f8478c, 0, 1);
            return this.f8478c[0];
        }
        byte b4 = this.f8513g.mo7049f()[this.f8513g.mo7050g()];
        this.f8513g.mo7045a(1);
        return b4;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: v */
    public short mo6999v() throws C1865aw {
        return (short) m7023g(m7005E());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: w */
    public int mo7000w() throws C1865aw {
        return m7023g(m7005E());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: x */
    public long mo7001x() throws C1865aw {
        return m7018d(m7006F());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: y */
    public double mo7002y() throws C1865aw {
        byte[] bArr = new byte[8];
        this.f8513g.m7053d(bArr, 0, 8);
        return Double.longBitsToDouble(m7007a(bArr));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: z */
    public String mo7003z() throws C1865aw {
        int iM7005E = m7005E();
        m7022f(iM7005E);
        if (iM7005E == 0) {
            return "";
        }
        try {
            if (this.f8513g.mo7051h() < iM7005E) {
                return new String(m7021e(iM7005E), "UTF-8");
            }
            String str = new String(this.f8513g.mo7049f(), this.f8513g.mo7050g(), iM7005E, "UTF-8");
            this.f8513g.mo7045a(iM7005E);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("UTF-8 not supported!");
        }
    }

    /* renamed from: com.umeng.analytics.pro.bj$a */
    public static class a implements InterfaceC1887br {

        /* renamed from: a */
        private final long f8485a;

        public a() {
            this.f8485a = -1L;
        }

        @Override // com.umeng.analytics.pro.InterfaceC1887br
        /* renamed from: a */
        public AbstractC1885bp mo7004a(AbstractC1900cd abstractC1900cd) {
            return new C1879bj(abstractC1900cd, this.f8485a);
        }

        public a(int i4) {
            this.f8485a = i4;
        }
    }

    /* renamed from: b */
    private void m7012b(int i4) throws C1865aw {
        int i5 = 0;
        while ((i4 & (-128)) != 0) {
            this.f8476a[i5] = (byte) ((i4 & 127) | 128);
            i4 >>>= 7;
            i5++;
        }
        byte[] bArr = this.f8476a;
        bArr[i5] = (byte) i4;
        this.f8513g.mo7042b(bArr, 0, i5 + 1);
    }

    /* renamed from: d */
    private void m7019d(int i4) throws C1865aw {
        m7011b((byte) i4);
    }

    /* renamed from: d */
    private byte m7017d(byte b4) throws C1886bq {
        byte b5 = (byte) (b4 & C1892bw.f8538m);
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
                return C1892bw.f8538m;
            case 10:
                return C1892bw.f8537l;
            case 11:
                return C1892bw.f8536k;
            case 12:
                return (byte) 12;
            default:
                throw new C1886bq("don't know what type: " + ((int) b5));
        }
    }

    /* renamed from: e */
    private byte m7020e(byte b4) {
        return f8470f[b4];
    }

    /* renamed from: b */
    private void m7013b(long j4) throws C1865aw {
        int i4 = 0;
        while (((-128) & j4) != 0) {
            this.f8477b[i4] = (byte) ((127 & j4) | 128);
            j4 >>>= 7;
            i4++;
        }
        byte[] bArr = this.f8477b;
        bArr[i4] = (byte) j4;
        this.f8513g.mo7042b(bArr, 0, i4 + 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6971a(C1890bu c1890bu) throws C1865aw {
        this.f8479m.m6877a(this.f8480n);
        this.f8480n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6966a(C1880bk c1880bk) throws C1865aw {
        if (c1880bk.f8499b == 2) {
            this.f8481o = c1880bk;
        } else {
            m7009a(c1880bk, (byte) -1);
        }
    }

    /* renamed from: b */
    private void m7011b(byte b4) throws C1865aw {
        byte[] bArr = this.f8484r;
        bArr[0] = b4;
        this.f8513g.m7052b(bArr);
    }

    /* renamed from: a */
    private void m7009a(C1880bk c1880bk, byte b4) throws C1865aw {
        if (b4 == -1) {
            b4 = m7020e(c1880bk.f8499b);
        }
        short s3 = c1880bk.f8500c;
        short s4 = this.f8480n;
        if (s3 > s4 && s3 - s4 <= 15) {
            m7019d(b4 | ((s3 - s4) << 4));
        } else {
            m7011b(b4);
            mo6974a(c1880bk.f8500c);
        }
        this.f8480n = c1880bk.f8500c;
    }

    public C1879bj(AbstractC1900cd abstractC1900cd) {
        this(abstractC1900cd, -1L);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6968a(C1882bm c1882bm) throws C1865aw {
        int i4 = c1882bm.f8505c;
        if (i4 == 0) {
            m7019d(0);
            return;
        }
        m7012b(i4);
        m7019d(m7020e(c1882bm.f8504b) | (m7020e(c1882bm.f8503a) << 4));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6967a(C1881bl c1881bl) throws C1865aw {
        m7025a(c1881bl.f8501a, c1881bl.f8502b);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6970a(C1889bt c1889bt) throws C1865aw {
        m7025a(c1889bt.f8523a, c1889bt.f8524b);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6975a(boolean z3) throws C1865aw {
        C1880bk c1880bk = this.f8481o;
        if (c1880bk != null) {
            m7009a(c1880bk, z3 ? (byte) 1 : (byte) 2);
            this.f8481o = null;
        } else {
            m7011b(z3 ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6962a(byte b4) throws C1865aw {
        m7011b(b4);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6974a(short s3) throws C1865aw {
        m7012b(m7014c((int) s3));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6964a(int i4) throws C1865aw {
        m7012b(m7014c(i4));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6965a(long j4) throws C1865aw {
        m7013b(m7015c(j4));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6963a(double d4) throws C1865aw {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m7008a(Double.doubleToLongBits(d4), bArr, 0);
        this.f8513g.m7052b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6972a(String str) throws C1865aw {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m7010a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6973a(ByteBuffer byteBuffer) throws C1865aw {
        m7010a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: a */
    private void m7010a(byte[] bArr, int i4, int i5) throws C1865aw {
        m7012b(i5);
        this.f8513g.mo7042b(bArr, i4, i5);
    }

    /* renamed from: a */
    protected void m7025a(byte b4, int i4) throws C1865aw {
        if (i4 <= 14) {
            m7019d(m7020e(b4) | (i4 << 4));
        } else {
            m7019d(m7020e(b4) | 240);
            m7012b(i4);
        }
    }

    /* renamed from: a */
    private void m7008a(long j4, byte[] bArr, int i4) {
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
    private long m7007a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }
}
