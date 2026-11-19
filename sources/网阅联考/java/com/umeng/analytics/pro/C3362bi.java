package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* renamed from: com.umeng.analytics.pro.bi */
/* loaded from: classes2.dex */
public class C3362bi extends AbstractC3369bp {

    /* renamed from: a */
    protected static final int f1858a = -65536;

    /* renamed from: b */
    protected static final int f1859b = -2147418112;

    /* renamed from: h */
    private static final C3374bu f1860h = new C3374bu();

    /* renamed from: c */
    protected boolean f1861c;

    /* renamed from: d */
    protected boolean f1862d;

    /* renamed from: e */
    protected int f1863e;

    /* renamed from: f */
    protected boolean f1864f;

    /* renamed from: i */
    private byte[] f1865i;

    /* renamed from: j */
    private byte[] f1866j;

    /* renamed from: k */
    private byte[] f1867k;

    /* renamed from: l */
    private byte[] f1868l;

    /* renamed from: m */
    private byte[] f1869m;

    /* renamed from: n */
    private byte[] f1870n;

    /* renamed from: o */
    private byte[] f1871o;

    /* renamed from: p */
    private byte[] f1872p;

    /* renamed from: com.umeng.analytics.pro.bi$a */
    public static class a implements InterfaceC3371br {

        /* renamed from: a */
        protected boolean f1873a;

        /* renamed from: b */
        protected boolean f1874b;

        /* renamed from: c */
        protected int f1875c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3371br
        /* renamed from: a */
        public AbstractC3369bp mo3081a(AbstractC3384cd abstractC3384cd) {
            C3362bi c3362bi = new C3362bi(abstractC3384cd, this.f1873a, this.f1874b);
            int i4 = this.f1875c;
            if (i4 != 0) {
                c3362bi.m3056c(i4);
            }
            return c3362bi;
        }

        public a(boolean z3, boolean z4) {
            this(z3, z4, 0);
        }

        public a(boolean z3, boolean z4, int i4) {
            this.f1873a = z3;
            this.f1874b = z4;
            this.f1875c = i4;
        }
    }

    public C3362bi(AbstractC3384cd abstractC3384cd) {
        this(abstractC3384cd, false, true);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: A */
    public ByteBuffer mo3037A() throws C3349aw {
        int iMo3077w = mo3077w();
        m3058d(iMo3077w);
        if (this.f1921g.mo3128h() >= iMo3077w) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f1921g.mo3126f(), this.f1921g.mo3127g(), iMo3077w);
            this.f1921g.mo3122a(iMo3077w);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo3077w];
        this.f1921g.m3130d(bArr, 0, iMo3077w);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3038a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: b */
    public void mo3054b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: c */
    public void mo3055c() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: d */
    public void mo3057d() throws C3349aw {
        mo3039a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: e */
    public void mo3059e() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: f */
    public void mo3060f() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: g */
    public void mo3061g() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: h */
    public C3367bn mo3062h() throws C3349aw {
        int iMo3077w = mo3077w();
        if (iMo3077w < 0) {
            if (((-65536) & iMo3077w) == f1859b) {
                return new C3367bn(mo3080z(), (byte) (iMo3077w & 255), mo3077w());
            }
            throw new C3370bq(4, "Bad version in readMessageBegin");
        }
        if (this.f1861c) {
            throw new C3370bq(4, "Missing version in readMessageBegin, old client?");
        }
        return new C3367bn(m3053b(iMo3077w), mo3075u(), mo3077w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: i */
    public void mo3063i() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: j */
    public C3374bu mo3064j() {
        return f1860h;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: k */
    public void mo3065k() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: l */
    public C3364bk mo3066l() throws C3349aw {
        byte bMo3075u = mo3075u();
        return new C3364bk("", bMo3075u, bMo3075u == 0 ? (short) 0 : mo3076v());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: m */
    public void mo3067m() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: n */
    public C3366bm mo3068n() throws C3349aw {
        return new C3366bm(mo3075u(), mo3075u(), mo3077w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: o */
    public void mo3069o() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: p */
    public C3365bl mo3070p() throws C3349aw {
        return new C3365bl(mo3075u(), mo3077w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: q */
    public void mo3071q() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: r */
    public C3373bt mo3072r() throws C3349aw {
        return new C3373bt(mo3075u(), mo3077w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: s */
    public void mo3073s() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: t */
    public boolean mo3074t() throws C3349aw {
        return mo3075u() == 1;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: u */
    public byte mo3075u() throws C3349aw {
        if (this.f1921g.mo3128h() < 1) {
            m3036a(this.f1869m, 0, 1);
            return this.f1869m[0];
        }
        byte b4 = this.f1921g.mo3126f()[this.f1921g.mo3127g()];
        this.f1921g.mo3122a(1);
        return b4;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: v */
    public short mo3076v() throws C3349aw {
        int iMo3127g;
        byte[] bArrMo3126f = this.f1870n;
        if (this.f1921g.mo3128h() >= 2) {
            bArrMo3126f = this.f1921g.mo3126f();
            iMo3127g = this.f1921g.mo3127g();
            this.f1921g.mo3122a(2);
        } else {
            m3036a(this.f1870n, 0, 2);
            iMo3127g = 0;
        }
        return (short) ((bArrMo3126f[iMo3127g + 1] & UByte.MAX_VALUE) | ((bArrMo3126f[iMo3127g] & UByte.MAX_VALUE) << 8));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: w */
    public int mo3077w() throws C3349aw {
        int iMo3127g;
        byte[] bArrMo3126f = this.f1871o;
        if (this.f1921g.mo3128h() >= 4) {
            bArrMo3126f = this.f1921g.mo3126f();
            iMo3127g = this.f1921g.mo3127g();
            this.f1921g.mo3122a(4);
        } else {
            m3036a(this.f1871o, 0, 4);
            iMo3127g = 0;
        }
        return (bArrMo3126f[iMo3127g + 3] & UByte.MAX_VALUE) | ((bArrMo3126f[iMo3127g] & UByte.MAX_VALUE) << 24) | ((bArrMo3126f[iMo3127g + 1] & UByte.MAX_VALUE) << 16) | ((bArrMo3126f[iMo3127g + 2] & UByte.MAX_VALUE) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: x */
    public long mo3078x() throws C3349aw {
        int iMo3127g;
        byte[] bArrMo3126f = this.f1872p;
        if (this.f1921g.mo3128h() >= 8) {
            bArrMo3126f = this.f1921g.mo3126f();
            iMo3127g = this.f1921g.mo3127g();
            this.f1921g.mo3122a(8);
        } else {
            m3036a(this.f1872p, 0, 8);
            iMo3127g = 0;
        }
        return (bArrMo3126f[iMo3127g + 7] & UByte.MAX_VALUE) | ((bArrMo3126f[iMo3127g] & UByte.MAX_VALUE) << 56) | ((bArrMo3126f[iMo3127g + 1] & UByte.MAX_VALUE) << 48) | ((bArrMo3126f[iMo3127g + 2] & UByte.MAX_VALUE) << 40) | ((bArrMo3126f[iMo3127g + 3] & UByte.MAX_VALUE) << 32) | ((bArrMo3126f[iMo3127g + 4] & UByte.MAX_VALUE) << 24) | ((bArrMo3126f[iMo3127g + 5] & UByte.MAX_VALUE) << 16) | ((bArrMo3126f[iMo3127g + 6] & UByte.MAX_VALUE) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: y */
    public double mo3079y() throws C3349aw {
        return Double.longBitsToDouble(mo3078x());
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: z */
    public String mo3080z() throws C3349aw {
        int iMo3077w = mo3077w();
        if (this.f1921g.mo3128h() < iMo3077w) {
            return m3053b(iMo3077w);
        }
        try {
            String str = new String(this.f1921g.mo3126f(), this.f1921g.mo3127g(), iMo3077w, "UTF-8");
            this.f1921g.mo3122a(iMo3077w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public C3362bi(AbstractC3384cd abstractC3384cd, boolean z3, boolean z4) {
        super(abstractC3384cd);
        this.f1864f = false;
        this.f1865i = new byte[1];
        this.f1866j = new byte[2];
        this.f1867k = new byte[4];
        this.f1868l = new byte[8];
        this.f1869m = new byte[1];
        this.f1870n = new byte[2];
        this.f1871o = new byte[4];
        this.f1872p = new byte[8];
        this.f1861c = z3;
        this.f1862d = z4;
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3048a(C3374bu c3374bu) {
    }

    /* renamed from: b */
    public String m3053b(int i4) throws C3349aw {
        try {
            m3058d(i4);
            byte[] bArr = new byte[i4];
            this.f1921g.m3130d(bArr, 0, i4);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: c */
    public void m3056c(int i4) {
        this.f1863e = i4;
        this.f1864f = true;
    }

    /* renamed from: d */
    public void m3058d(int i4) throws C3349aw {
        if (i4 < 0) {
            throw new C3370bq("Negative length: " + i4);
        }
        if (this.f1864f) {
            int i5 = this.f1863e - i4;
            this.f1863e = i5;
            if (i5 >= 0) {
                return;
            }
            throw new C3370bq("Message length exceeded: " + i4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3046a(C3367bn c3367bn) throws C3349aw, UnsupportedEncodingException {
        if (this.f1862d) {
            mo3041a(c3367bn.f1915b | f1859b);
            mo3049a(c3367bn.f1914a);
            mo3041a(c3367bn.f1916c);
        } else {
            mo3049a(c3367bn.f1914a);
            mo3039a(c3367bn.f1915b);
            mo3041a(c3367bn.f1916c);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3043a(C3364bk c3364bk) throws C3349aw {
        mo3039a(c3364bk.f1907b);
        mo3051a(c3364bk.f1908c);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3045a(C3366bm c3366bm) throws C3349aw {
        mo3039a(c3366bm.f1911a);
        mo3039a(c3366bm.f1912b);
        mo3041a(c3366bm.f1913c);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3044a(C3365bl c3365bl) throws C3349aw {
        mo3039a(c3365bl.f1909a);
        mo3041a(c3365bl.f1910b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3047a(C3373bt c3373bt) throws C3349aw {
        mo3039a(c3373bt.f1931a);
        mo3041a(c3373bt.f1932b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3052a(boolean z3) throws C3349aw {
        mo3039a(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3039a(byte b4) throws C3349aw {
        byte[] bArr = this.f1865i;
        bArr[0] = b4;
        this.f1921g.mo3119b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3051a(short s3) throws C3349aw {
        byte[] bArr = this.f1866j;
        bArr[0] = (byte) ((s3 >> 8) & 255);
        bArr[1] = (byte) (s3 & 255);
        this.f1921g.mo3119b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3041a(int i4) throws C3349aw {
        byte[] bArr = this.f1867k;
        bArr[0] = (byte) ((i4 >> 24) & 255);
        bArr[1] = (byte) ((i4 >> 16) & 255);
        bArr[2] = (byte) ((i4 >> 8) & 255);
        bArr[3] = (byte) (i4 & 255);
        this.f1921g.mo3119b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3042a(long j4) throws C3349aw {
        byte[] bArr = this.f1868l;
        bArr[0] = (byte) ((j4 >> 56) & 255);
        bArr[1] = (byte) ((j4 >> 48) & 255);
        bArr[2] = (byte) ((j4 >> 40) & 255);
        bArr[3] = (byte) ((j4 >> 32) & 255);
        bArr[4] = (byte) ((j4 >> 24) & 255);
        bArr[5] = (byte) ((j4 >> 16) & 255);
        bArr[6] = (byte) ((j4 >> 8) & 255);
        bArr[7] = (byte) (j4 & 255);
        this.f1921g.mo3119b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3040a(double d4) throws C3349aw {
        mo3042a(Double.doubleToLongBits(d4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3049a(String str) throws C3349aw, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo3041a(bytes.length);
            this.f1921g.mo3119b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3349aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: a */
    public void mo3050a(ByteBuffer byteBuffer) throws C3349aw {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        mo3041a(iLimit);
        this.f1921g.mo3119b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    /* renamed from: a */
    private int m3036a(byte[] bArr, int i4, int i5) throws C3349aw {
        m3058d(i5);
        return this.f1921g.m3130d(bArr, i4, i5);
    }
}
