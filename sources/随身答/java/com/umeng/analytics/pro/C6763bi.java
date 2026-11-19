package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import p114g2.AbstractC8008c0;
import p114g2.AbstractC8039s;
import p114g2.C8033p;
import p114g2.C8035q;
import p114g2.C8037r;
import p114g2.C8041t;
import p114g2.C8043u;

/* renamed from: com.umeng.analytics.pro.bi */
/* loaded from: classes4.dex */
public class C6763bi extends AbstractC8039s {

    /* renamed from: n */
    public static final C8043u f6625n = new C8043u();

    /* renamed from: b */
    public boolean f6626b;

    /* renamed from: c */
    public boolean f6627c;

    /* renamed from: d */
    public int f6628d;

    /* renamed from: e */
    public boolean f6629e;

    /* renamed from: f */
    public byte[] f6630f;

    /* renamed from: g */
    public byte[] f6631g;

    /* renamed from: h */
    public byte[] f6632h;

    /* renamed from: i */
    public byte[] f6633i;

    /* renamed from: j */
    public byte[] f6634j;

    /* renamed from: k */
    public byte[] f6635k;

    /* renamed from: l */
    public byte[] f6636l;

    /* renamed from: m */
    public byte[] f6637m;

    /* renamed from: com.umeng.analytics.pro.bi$a */
    public static class a implements InterfaceC6766br {

        /* renamed from: a */
        public boolean f6638a;

        /* renamed from: b */
        public boolean f6639b;

        /* renamed from: c */
        public int f6640c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.InterfaceC6766br
        /* renamed from: h */
        public AbstractC8039s mo6107h(AbstractC8008c0 abstractC8008c0) {
            C6763bi c6763bi = new C6763bi(abstractC8008c0, this.f6638a, this.f6639b);
            int i9 = this.f6640c;
            if (i9 != 0) {
                c6763bi.m6081L(i9);
            }
            return c6763bi;
        }

        public a(boolean z9, boolean z10) {
            this(z9, z10, 0);
        }

        public a(boolean z9, boolean z10, int i9) {
            this.f6638a = z9;
            this.f6639b = z10;
            this.f6640c = i9;
        }
    }

    public C6763bi(AbstractC8008c0 abstractC8008c0, boolean z9, boolean z10) {
        super(abstractC8008c0);
        this.f6629e = false;
        this.f6630f = new byte[1];
        this.f6631g = new byte[2];
        this.f6632h = new byte[4];
        this.f6633i = new byte[8];
        this.f6634j = new byte[1];
        this.f6635k = new byte[2];
        this.f6636l = new byte[4];
        this.f6637m = new byte[8];
        this.f6626b = z9;
        this.f6627c = z10;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: A */
    public boolean mo6070A() {
        return mo6071B() == 1;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: B */
    public byte mo6071B() throws C6765bq {
        if (this.f13630a.mo12565h() < 1) {
            m6077H(this.f6634j, 0, 1);
            return this.f6634j[0];
        }
        byte b10 = this.f13630a.mo12563f()[this.f13630a.mo12564g()];
        this.f13630a.mo12562b(1);
        return b10;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: C */
    public short mo6072C() throws C6765bq {
        int iMo12564g;
        byte[] bArrMo12563f = this.f6635k;
        if (this.f13630a.mo12565h() >= 2) {
            bArrMo12563f = this.f13630a.mo12563f();
            iMo12564g = this.f13630a.mo12564g();
            this.f13630a.mo12562b(2);
        } else {
            m6077H(this.f6635k, 0, 2);
            iMo12564g = 0;
        }
        return (short) ((bArrMo12563f[iMo12564g + 1] & UByte.MAX_VALUE) | ((bArrMo12563f[iMo12564g] & UByte.MAX_VALUE) << 8));
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: D */
    public int mo6073D() throws C6765bq {
        int iMo12564g;
        byte[] bArrMo12563f = this.f6636l;
        if (this.f13630a.mo12565h() >= 4) {
            bArrMo12563f = this.f13630a.mo12563f();
            iMo12564g = this.f13630a.mo12564g();
            this.f13630a.mo12562b(4);
        } else {
            m6077H(this.f6636l, 0, 4);
            iMo12564g = 0;
        }
        return (bArrMo12563f[iMo12564g + 3] & UByte.MAX_VALUE) | ((bArrMo12563f[iMo12564g] & UByte.MAX_VALUE) << 24) | ((bArrMo12563f[iMo12564g + 1] & UByte.MAX_VALUE) << 16) | ((bArrMo12563f[iMo12564g + 2] & UByte.MAX_VALUE) << 8);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: E */
    public long mo6074E() throws C6765bq {
        int iMo12564g;
        byte[] bArrMo12563f = this.f6637m;
        if (this.f13630a.mo12565h() >= 8) {
            bArrMo12563f = this.f13630a.mo12563f();
            iMo12564g = this.f13630a.mo12564g();
            this.f13630a.mo12562b(8);
        } else {
            m6077H(this.f6637m, 0, 8);
            iMo12564g = 0;
        }
        return (bArrMo12563f[iMo12564g + 7] & UByte.MAX_VALUE) | ((bArrMo12563f[iMo12564g] & UByte.MAX_VALUE) << 56) | ((bArrMo12563f[iMo12564g + 1] & UByte.MAX_VALUE) << 48) | ((bArrMo12563f[iMo12564g + 2] & UByte.MAX_VALUE) << 40) | ((bArrMo12563f[iMo12564g + 3] & UByte.MAX_VALUE) << 32) | ((bArrMo12563f[iMo12564g + 4] & UByte.MAX_VALUE) << 24) | ((bArrMo12563f[iMo12564g + 5] & UByte.MAX_VALUE) << 16) | ((bArrMo12563f[iMo12564g + 6] & UByte.MAX_VALUE) << 8);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: F */
    public double mo6075F() {
        return Double.longBitsToDouble(mo6074E());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: G */
    public String mo6076G() throws C6756aw {
        int iMo6073D = mo6073D();
        if (this.f13630a.mo12565h() < iMo6073D) {
            return m6080K(iMo6073D);
        }
        try {
            String str = new String(this.f13630a.mo12563f(), this.f13630a.mo12564g(), iMo6073D, "UTF-8");
            this.f13630a.mo12562b(iMo6073D);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C6756aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: H */
    public final int m6077H(byte[] bArr, int i9, int i10) throws C6765bq {
        m6082M(i10);
        return this.f13630a.m12573e(bArr, i9, i10);
    }

    /* renamed from: I */
    public void m6078I(byte b10) {
        byte[] bArr = this.f6630f;
        bArr[0] = b10;
        this.f13630a.mo12560d(bArr, 0, 1);
    }

    /* renamed from: J */
    public void m6079J(short s9) {
        byte[] bArr = this.f6631g;
        bArr[0] = (byte) ((s9 >> 8) & 255);
        bArr[1] = (byte) (s9 & 255);
        this.f13630a.mo12560d(bArr, 0, 2);
    }

    /* renamed from: K */
    public String m6080K(int i9) throws C6756aw {
        try {
            m6082M(i9);
            byte[] bArr = new byte[i9];
            this.f13630a.m12573e(bArr, 0, i9);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C6756aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: L */
    public void m6081L(int i9) {
        this.f6628d = i9;
        this.f6629e = true;
    }

    /* renamed from: M */
    public void m6082M(int i9) throws C6765bq {
        if (i9 < 0) {
            throw new C6765bq("Negative length: " + i9);
        }
        if (this.f6629e) {
            int i10 = this.f6628d - i9;
            this.f6628d = i10;
            if (i10 >= 0) {
                return;
            }
            throw new C6765bq("Message length exceeded: " + i9);
        }
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: a */
    public ByteBuffer mo6083a() throws C6765bq, C6768ce {
        int iMo6073D = mo6073D();
        m6082M(iMo6073D);
        if (this.f13630a.mo12565h() >= iMo6073D) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f13630a.mo12563f(), this.f13630a.mo12564g(), iMo6073D);
            this.f13630a.mo12562b(iMo6073D);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo6073D];
        this.f13630a.m12573e(bArr, 0, iMo6073D);
        return ByteBuffer.wrap(bArr);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: d */
    public void mo6084d(int i9) {
        byte[] bArr = this.f6632h;
        bArr[0] = (byte) ((i9 >> 24) & 255);
        bArr[1] = (byte) ((i9 >> 16) & 255);
        bArr[2] = (byte) ((i9 >> 8) & 255);
        bArr[3] = (byte) (i9 & 255);
        this.f13630a.mo12560d(bArr, 0, 4);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: e */
    public void mo6085e(long j9) {
        byte[] bArr = this.f6633i;
        bArr[0] = (byte) ((j9 >> 56) & 255);
        bArr[1] = (byte) ((j9 >> 48) & 255);
        bArr[2] = (byte) ((j9 >> 40) & 255);
        bArr[3] = (byte) ((j9 >> 32) & 255);
        bArr[4] = (byte) ((j9 >> 24) & 255);
        bArr[5] = (byte) ((j9 >> 16) & 255);
        bArr[6] = (byte) ((j9 >> 8) & 255);
        bArr[7] = (byte) (j9 & 255);
        this.f13630a.mo12560d(bArr, 0, 8);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: f */
    public void mo6086f(C8033p c8033p) {
        m6078I(c8033p.f13622b);
        m6079J(c8033p.f13623c);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: g */
    public void mo6087g(C8035q c8035q) {
        m6078I(c8035q.f13624a);
        mo6084d(c8035q.f13625b);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: h */
    public void mo6088h(C8037r c8037r) {
        m6078I(c8037r.f13626a);
        m6078I(c8037r.f13627b);
        mo6084d(c8037r.f13628c);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: j */
    public void mo6090j(String str) throws C6756aw, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo6084d(bytes.length);
            this.f13630a.mo12560d(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C6756aw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: k */
    public void mo6091k(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        mo6084d(iLimit);
        this.f13630a.mo12560d(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: l */
    public void mo6092l() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: m */
    public void mo6093m() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: n */
    public void mo6094n() {
        m6078I((byte) 0);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: o */
    public void mo6095o() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: p */
    public void mo6096p() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: q */
    public C8043u mo6097q() {
        return f6625n;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: r */
    public void mo6098r() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: s */
    public C8033p mo6099s() throws C6765bq {
        byte bMo6071B = mo6071B();
        return new C8033p("", bMo6071B, bMo6071B == 0 ? (short) 0 : mo6072C());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: t */
    public void mo6100t() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: u */
    public C8037r mo6101u() {
        return new C8037r(mo6071B(), mo6071B(), mo6073D());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: v */
    public void mo6102v() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: w */
    public C8035q mo6103w() {
        return new C8035q(mo6071B(), mo6073D());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: x */
    public void mo6104x() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: y */
    public C8041t mo6105y() {
        return new C8041t(mo6071B(), mo6073D());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: z */
    public void mo6106z() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: i */
    public void mo6089i(C8043u c8043u) {
    }
}
