package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.bi */
/* loaded from: classes.dex */
public class C1878bi extends AbstractC1885bp {

    /* renamed from: a */
    protected static final int f8450a = -65536;

    /* renamed from: b */
    protected static final int f8451b = -2147418112;

    /* renamed from: h */
    private static final C1890bu f8452h = new C1890bu();

    /* renamed from: c */
    protected boolean f8453c;

    /* renamed from: d */
    protected boolean f8454d;

    /* renamed from: e */
    protected int f8455e;

    /* renamed from: f */
    protected boolean f8456f;

    /* renamed from: i */
    private byte[] f8457i;

    /* renamed from: j */
    private byte[] f8458j;

    /* renamed from: k */
    private byte[] f8459k;

    /* renamed from: l */
    private byte[] f8460l;

    /* renamed from: m */
    private byte[] f8461m;

    /* renamed from: n */
    private byte[] f8462n;

    /* renamed from: o */
    private byte[] f8463o;

    /* renamed from: p */
    private byte[] f8464p;

    /* renamed from: com.umeng.analytics.pro.bi$a */
    public static class a implements InterfaceC1887br {

        /* renamed from: a */
        protected boolean f8465a;

        /* renamed from: b */
        protected boolean f8466b;

        /* renamed from: c */
        protected int f8467c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1887br
        /* renamed from: a */
        public AbstractC1885bp mo7004a(AbstractC1900cd abstractC1900cd) {
            C1878bi c1878bi = new C1878bi(abstractC1900cd, this.f8465a, this.f8466b);
            int i4 = this.f8467c;
            if (i4 != 0) {
                c1878bi.m6979c(i4);
            }
            return c1878bi;
        }

        public a(boolean z3, boolean z4) {
            this(z3, z4, 0);
        }

        public a(boolean z3, boolean z4, int i4) {
            this.f8465a = z3;
            this.f8466b = z4;
            this.f8467c = i4;
        }
    }

    public C1878bi(AbstractC1900cd abstractC1900cd) {
        this(abstractC1900cd, false, true);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: A */
    public ByteBuffer mo6960A() throws C1865aw {
        int iMo7000w = mo7000w();
        m6981d(iMo7000w);
        if (this.f8513g.mo7051h() >= iMo7000w) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f8513g.mo7049f(), this.f8513g.mo7050g(), iMo7000w);
            this.f8513g.mo7045a(iMo7000w);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo7000w];
        this.f8513g.m7053d(bArr, 0, iMo7000w);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6961a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6969a(C1883bn c1883bn) throws C1865aw, UnsupportedEncodingException {
        if (this.f8454d) {
            mo6964a(f8451b | c1883bn.f8507b);
            mo6972a(c1883bn.f8506a);
            mo6964a(c1883bn.f8508c);
        } else {
            mo6972a(c1883bn.f8506a);
            mo6962a(c1883bn.f8507b);
            mo6964a(c1883bn.f8508c);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6971a(C1890bu c1890bu) {
    }

    /* renamed from: b */
    public String m6976b(int i4) throws C1865aw {
        try {
            m6981d(i4);
            byte[] bArr = new byte[i4];
            this.f8513g.m7053d(bArr, 0, i4);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: b */
    public void mo6977b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: c */
    public void mo6978c() {
    }

    /* renamed from: c */
    public void m6979c(int i4) {
        this.f8455e = i4;
        this.f8456f = true;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: d */
    public void mo6980d() throws C1865aw {
        mo6962a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: e */
    public void mo6982e() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: f */
    public void mo6983f() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: g */
    public void mo6984g() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: h */
    public C1883bn mo6985h() throws C1865aw {
        int iMo7000w = mo7000w();
        if (iMo7000w < 0) {
            if ((f8450a & iMo7000w) == f8451b) {
                return new C1883bn(mo7003z(), (byte) (iMo7000w & 255), mo7000w());
            }
            throw new C1886bq(4, "Bad version in readMessageBegin");
        }
        if (this.f8453c) {
            throw new C1886bq(4, "Missing version in readMessageBegin, old client?");
        }
        return new C1883bn(m6976b(iMo7000w), mo6998u(), mo7000w());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: i */
    public void mo6986i() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: j */
    public C1890bu mo6987j() {
        return f8452h;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: k */
    public void mo6988k() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: l */
    public C1880bk mo6989l() throws C1865aw {
        byte bMo6998u = mo6998u();
        return new C1880bk("", bMo6998u, bMo6998u == 0 ? (short) 0 : mo6999v());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: m */
    public void mo6990m() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: n */
    public C1882bm mo6991n() throws C1865aw {
        return new C1882bm(mo6998u(), mo6998u(), mo7000w());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: o */
    public void mo6992o() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: p */
    public C1881bl mo6993p() throws C1865aw {
        return new C1881bl(mo6998u(), mo7000w());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: q */
    public void mo6994q() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: r */
    public C1889bt mo6995r() throws C1865aw {
        return new C1889bt(mo6998u(), mo7000w());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: s */
    public void mo6996s() {
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: t */
    public boolean mo6997t() throws C1865aw {
        return mo6998u() == 1;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: u */
    public byte mo6998u() throws C1865aw {
        if (this.f8513g.mo7051h() < 1) {
            m6959a(this.f8461m, 0, 1);
            return this.f8461m[0];
        }
        byte b4 = this.f8513g.mo7049f()[this.f8513g.mo7050g()];
        this.f8513g.mo7045a(1);
        return b4;
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: v */
    public short mo6999v() throws C1865aw {
        byte[] bArrMo7049f = this.f8462n;
        int iMo7050g = 0;
        if (this.f8513g.mo7051h() >= 2) {
            bArrMo7049f = this.f8513g.mo7049f();
            iMo7050g = this.f8513g.mo7050g();
            this.f8513g.mo7045a(2);
        } else {
            m6959a(this.f8462n, 0, 2);
        }
        return (short) ((bArrMo7049f[iMo7050g + 1] & 255) | ((bArrMo7049f[iMo7050g] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: w */
    public int mo7000w() throws C1865aw {
        byte[] bArrMo7049f = this.f8463o;
        int iMo7050g = 0;
        if (this.f8513g.mo7051h() >= 4) {
            bArrMo7049f = this.f8513g.mo7049f();
            iMo7050g = this.f8513g.mo7050g();
            this.f8513g.mo7045a(4);
        } else {
            m6959a(this.f8463o, 0, 4);
        }
        return (bArrMo7049f[iMo7050g + 3] & 255) | ((bArrMo7049f[iMo7050g] & 255) << 24) | ((bArrMo7049f[iMo7050g + 1] & 255) << 16) | ((bArrMo7049f[iMo7050g + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: x */
    public long mo7001x() throws C1865aw {
        byte[] bArrMo7049f = this.f8464p;
        int iMo7050g = 0;
        if (this.f8513g.mo7051h() >= 8) {
            bArrMo7049f = this.f8513g.mo7049f();
            iMo7050g = this.f8513g.mo7050g();
            this.f8513g.mo7045a(8);
        } else {
            m6959a(this.f8464p, 0, 8);
        }
        return (bArrMo7049f[iMo7050g + 7] & 255) | ((bArrMo7049f[iMo7050g] & 255) << 56) | ((bArrMo7049f[iMo7050g + 1] & 255) << 48) | ((bArrMo7049f[iMo7050g + 2] & 255) << 40) | ((bArrMo7049f[iMo7050g + 3] & 255) << 32) | ((bArrMo7049f[iMo7050g + 4] & 255) << 24) | ((bArrMo7049f[iMo7050g + 5] & 255) << 16) | ((bArrMo7049f[iMo7050g + 6] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: y */
    public double mo7002y() throws C1865aw {
        return Double.longBitsToDouble(mo7001x());
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: z */
    public String mo7003z() throws C1865aw {
        int iMo7000w = mo7000w();
        if (this.f8513g.mo7051h() < iMo7000w) {
            return m6976b(iMo7000w);
        }
        try {
            String str = new String(this.f8513g.mo7049f(), this.f8513g.mo7050g(), iMo7000w, "UTF-8");
            this.f8513g.mo7045a(iMo7000w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public C1878bi(AbstractC1900cd abstractC1900cd, boolean z3, boolean z4) {
        super(abstractC1900cd);
        this.f8456f = false;
        this.f8457i = new byte[1];
        this.f8458j = new byte[2];
        this.f8459k = new byte[4];
        this.f8460l = new byte[8];
        this.f8461m = new byte[1];
        this.f8462n = new byte[2];
        this.f8463o = new byte[4];
        this.f8464p = new byte[8];
        this.f8453c = z3;
        this.f8454d = z4;
    }

    /* renamed from: d */
    protected void m6981d(int i4) throws C1865aw {
        if (i4 < 0) {
            throw new C1886bq("Negative length: " + i4);
        }
        if (this.f8456f) {
            int i5 = this.f8455e - i4;
            this.f8455e = i5;
            if (i5 >= 0) {
                return;
            }
            throw new C1886bq("Message length exceeded: " + i4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6966a(C1880bk c1880bk) throws C1865aw {
        mo6962a(c1880bk.f8499b);
        mo6974a(c1880bk.f8500c);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6968a(C1882bm c1882bm) throws C1865aw {
        mo6962a(c1882bm.f8503a);
        mo6962a(c1882bm.f8504b);
        mo6964a(c1882bm.f8505c);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6967a(C1881bl c1881bl) throws C1865aw {
        mo6962a(c1881bl.f8501a);
        mo6964a(c1881bl.f8502b);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6970a(C1889bt c1889bt) throws C1865aw {
        mo6962a(c1889bt.f8523a);
        mo6964a(c1889bt.f8524b);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6975a(boolean z3) throws C1865aw {
        mo6962a(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6962a(byte b4) throws C1865aw {
        byte[] bArr = this.f8457i;
        bArr[0] = b4;
        this.f8513g.mo7042b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6974a(short s3) throws C1865aw {
        byte[] bArr = this.f8458j;
        bArr[0] = (byte) ((s3 >> 8) & 255);
        bArr[1] = (byte) (s3 & 255);
        this.f8513g.mo7042b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6964a(int i4) throws C1865aw {
        byte[] bArr = this.f8459k;
        bArr[0] = (byte) ((i4 >> 24) & 255);
        bArr[1] = (byte) ((i4 >> 16) & 255);
        bArr[2] = (byte) ((i4 >> 8) & 255);
        bArr[3] = (byte) (i4 & 255);
        this.f8513g.mo7042b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6965a(long j4) throws C1865aw {
        byte[] bArr = this.f8460l;
        bArr[0] = (byte) ((j4 >> 56) & 255);
        bArr[1] = (byte) ((j4 >> 48) & 255);
        bArr[2] = (byte) ((j4 >> 40) & 255);
        bArr[3] = (byte) ((j4 >> 32) & 255);
        bArr[4] = (byte) ((j4 >> 24) & 255);
        bArr[5] = (byte) ((j4 >> 16) & 255);
        bArr[6] = (byte) ((j4 >> 8) & 255);
        bArr[7] = (byte) (j4 & 255);
        this.f8513g.mo7042b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6963a(double d4) throws C1865aw {
        mo6965a(Double.doubleToLongBits(d4));
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6972a(String str) throws C1865aw, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo6964a(bytes.length);
            this.f8513g.mo7042b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C1865aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: a */
    public void mo6973a(ByteBuffer byteBuffer) throws C1865aw {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        mo6964a(iLimit);
        this.f8513g.mo7042b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    /* renamed from: a */
    private int m6959a(byte[] bArr, int i4, int i5) throws C1865aw {
        m6981d(i5);
        return this.f8513g.m7053d(bArr, i4, i5);
    }
}
