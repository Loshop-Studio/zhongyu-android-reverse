package com.umeng.analytics.pro;

import androidx.work.WorkInfo;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import p114g2.AbstractC8008c0;
import p114g2.AbstractC8039s;
import p114g2.C8027m;
import p114g2.C8033p;
import p114g2.C8035q;
import p114g2.C8037r;
import p114g2.C8041t;
import p114g2.C8043u;

/* renamed from: com.umeng.analytics.pro.bj */
/* loaded from: classes4.dex */
public class C6764bj extends AbstractC8039s {

    /* renamed from: k */
    public static final C8043u f6641k = new C8043u("");

    /* renamed from: l */
    public static final C8033p f6642l = new C8033p("", (byte) 0, 0);

    /* renamed from: m */
    public static final byte[] f6643m = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* renamed from: b */
    public C8027m f6644b;

    /* renamed from: c */
    public short f6645c;

    /* renamed from: d */
    public C8033p f6646d;

    /* renamed from: e */
    public Boolean f6647e;

    /* renamed from: f */
    public final long f6648f;

    /* renamed from: g */
    public byte[] f6649g;

    /* renamed from: h */
    public byte[] f6650h;

    /* renamed from: i */
    public byte[] f6651i;

    /* renamed from: j */
    public byte[] f6652j;

    /* renamed from: com.umeng.analytics.pro.bj$a */
    public static class a implements InterfaceC6766br {

        /* renamed from: a */
        public final long f6653a = -1;

        @Override // com.umeng.analytics.pro.InterfaceC6766br
        /* renamed from: h */
        public AbstractC8039s mo6107h(AbstractC8008c0 abstractC8008c0) {
            return new C6764bj(abstractC8008c0, this.f6653a);
        }
    }

    public C6764bj(AbstractC8008c0 abstractC8008c0, long j9) {
        super(abstractC8008c0);
        this.f6644b = new C8027m(15);
        this.f6645c = (short) 0;
        this.f6646d = null;
        this.f6647e = null;
        this.f6649g = new byte[5];
        this.f6650h = new byte[10];
        this.f6651i = new byte[1];
        this.f6652j = new byte[1];
        this.f6648f = j9;
    }

    /* renamed from: W */
    private void m6108W(int i9) {
        m6116O((byte) i9);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: A */
    public boolean mo6070A() {
        Boolean bool = this.f6647e;
        if (bool == null) {
            return mo6071B() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f6647e = null;
        return zBooleanValue;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: B */
    public byte mo6071B() throws C6768ce {
        if (this.f13630a.mo12565h() <= 0) {
            this.f13630a.m12573e(this.f6652j, 0, 1);
            return this.f6652j[0];
        }
        byte b10 = this.f13630a.mo12563f()[this.f13630a.mo12564g()];
        this.f13630a.mo12562b(1);
        return b10;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: C */
    public short mo6072C() {
        return (short) m6127a0(m6109H());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: D */
    public int mo6073D() {
        return m6127a0(m6109H());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: E */
    public long mo6074E() {
        return m6123V(m6110I());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: F */
    public double mo6075F() throws C6768ce {
        byte[] bArr = new byte[8];
        this.f13630a.m12573e(bArr, 0, 8);
        return Double.longBitsToDouble(m6111J(bArr));
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: G */
    public String mo6076G() throws C6756aw {
        int iM6109H = m6109H();
        m6126Z(iM6109H);
        if (iM6109H == 0) {
            return "";
        }
        try {
            if (this.f13630a.mo12565h() < iM6109H) {
                return new String(m6125Y(iM6109H), "UTF-8");
            }
            String str = new String(this.f13630a.mo12563f(), this.f13630a.mo12564g(), iM6109H, "UTF-8");
            this.f13630a.mo12562b(iM6109H);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C6756aw("UTF-8 not supported!");
        }
    }

    /* renamed from: H */
    public final int m6109H() throws C6768ce {
        int i9 = 0;
        if (this.f13630a.mo12565h() >= 5) {
            byte[] bArrMo12563f = this.f13630a.mo12563f();
            int iMo12564g = this.f13630a.mo12564g();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                byte b10 = bArrMo12563f[iMo12564g + i9];
                i10 |= (b10 & ByteCompanionObject.MAX_VALUE) << i11;
                if ((b10 & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.f13630a.mo12562b(i9 + 1);
                    return i10;
                }
                i11 += 7;
                i9++;
            }
        } else {
            int i12 = 0;
            while (true) {
                byte bMo6071B = mo6071B();
                i9 |= (bMo6071B & ByteCompanionObject.MAX_VALUE) << i12;
                if ((bMo6071B & ByteCompanionObject.MIN_VALUE) != 128) {
                    return i9;
                }
                i12 += 7;
            }
        }
    }

    /* renamed from: I */
    public final long m6110I() throws C6768ce {
        int i9 = 0;
        long j9 = 0;
        if (this.f13630a.mo12565h() >= 10) {
            byte[] bArrMo12563f = this.f13630a.mo12563f();
            int iMo12564g = this.f13630a.mo12564g();
            long j10 = 0;
            int i10 = 0;
            while (true) {
                j10 |= (r7 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((bArrMo12563f[iMo12564g + i9] & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.f13630a.mo12562b(i9 + 1);
                    return j10;
                }
                i10 += 7;
                i9++;
            }
        } else {
            while (true) {
                j9 |= (r0 & ByteCompanionObject.MAX_VALUE) << i9;
                if ((mo6071B() & ByteCompanionObject.MIN_VALUE) != 128) {
                    return j9;
                }
                i9 += 7;
            }
        }
    }

    /* renamed from: J */
    public final long m6111J(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }

    /* renamed from: K */
    public void m6112K(byte b10, int i9) {
        if (i9 <= 14) {
            m6108W(m6124X(b10) | (i9 << 4));
        } else {
            m6108W(m6124X(b10) | 240);
            m6117P(i9);
        }
    }

    /* renamed from: L */
    public final void m6113L(C8033p c8033p, byte b10) {
        if (b10 == -1) {
            b10 = m6124X(c8033p.f13622b);
        }
        short s9 = c8033p.f13623c;
        short s10 = this.f6645c;
        if (s9 <= s10 || s9 - s10 > 15) {
            m6116O(b10);
            m6114M(c8033p.f13623c);
        } else {
            m6108W(b10 | ((s9 - s10) << 4));
        }
        this.f6645c = c8033p.f13623c;
    }

    /* renamed from: M */
    public void m6114M(short s9) {
        m6117P(m6119R(s9));
    }

    /* renamed from: N */
    public final void m6115N(byte[] bArr, int i9, int i10) {
        m6117P(i10);
        this.f13630a.mo12560d(bArr, i9, i10);
    }

    /* renamed from: O */
    public final void m6116O(byte b10) {
        byte[] bArr = this.f6651i;
        bArr[0] = b10;
        this.f13630a.m12572c(bArr);
    }

    /* renamed from: P */
    public final void m6117P(int i9) {
        int i10 = 0;
        while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            this.f6649g[i10] = (byte) ((i9 & WorkQueueKt.MASK) | 128);
            i9 >>>= 7;
            i10++;
        }
        byte[] bArr = this.f6649g;
        bArr[i10] = (byte) i9;
        this.f13630a.mo12560d(bArr, 0, i10 + 1);
    }

    /* renamed from: Q */
    public final void m6118Q(long j9) {
        int i9 = 0;
        while (((-128) & j9) != 0) {
            this.f6650h[i9] = (byte) ((127 & j9) | 128);
            j9 >>>= 7;
            i9++;
        }
        byte[] bArr = this.f6650h;
        bArr[i9] = (byte) j9;
        this.f13630a.mo12560d(bArr, 0, i9 + 1);
    }

    /* renamed from: R */
    public final int m6119R(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    /* renamed from: S */
    public final long m6120S(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    /* renamed from: T */
    public final boolean m6121T(byte b10) {
        int i9 = b10 & 15;
        return i9 == 1 || i9 == 2;
    }

    /* renamed from: U */
    public final byte m6122U(byte b10) throws C6765bq {
        byte b11 = (byte) (b10 & 15);
        switch (b11) {
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
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return (byte) 13;
            case 12:
                return (byte) 12;
            default:
                throw new C6765bq("don't know what type: " + ((int) b11));
        }
    }

    /* renamed from: V */
    public final long m6123V(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    /* renamed from: X */
    public final byte m6124X(byte b10) {
        return f6643m[b10];
    }

    /* renamed from: Y */
    public final byte[] m6125Y(int i9) throws C6768ce {
        if (i9 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i9];
        this.f13630a.m12573e(bArr, 0, i9);
        return bArr;
    }

    /* renamed from: Z */
    public final void m6126Z(int i9) throws C6765bq {
        if (i9 < 0) {
            throw new C6765bq("Negative length: " + i9);
        }
        long j9 = this.f6648f;
        if (j9 == -1 || i9 <= j9) {
            return;
        }
        throw new C6765bq("Length exceeded max allowed: " + i9);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: a */
    public ByteBuffer mo6083a() throws C6765bq, C6768ce {
        int iM6109H = m6109H();
        m6126Z(iM6109H);
        if (iM6109H == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iM6109H];
        this.f13630a.m12573e(bArr, 0, iM6109H);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a0 */
    public final int m6127a0(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: b */
    public void mo6128b() {
        this.f6644b.m12684c();
        this.f6645c = (short) 0;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: d */
    public void mo6084d(int i9) {
        m6117P(m6119R(i9));
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: e */
    public void mo6085e(long j9) {
        m6118Q(m6120S(j9));
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: f */
    public void mo6086f(C8033p c8033p) {
        if (c8033p.f13622b == 2) {
            this.f6646d = c8033p;
        } else {
            m6113L(c8033p, (byte) -1);
        }
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: g */
    public void mo6087g(C8035q c8035q) {
        m6112K(c8035q.f13624a, c8035q.f13625b);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: h */
    public void mo6088h(C8037r c8037r) {
        int i9 = c8037r.f13628c;
        if (i9 == 0) {
            m6108W(0);
            return;
        }
        m6117P(i9);
        m6108W(m6124X(c8037r.f13627b) | (m6124X(c8037r.f13626a) << 4));
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: i */
    public void mo6089i(C8043u c8043u) {
        this.f6644b.m12683b(this.f6645c);
        this.f6645c = (short) 0;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: j */
    public void mo6090j(String str) throws C6756aw, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m6115N(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C6756aw("UTF-8 not supported!");
        }
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: k */
    public void mo6091k(ByteBuffer byteBuffer) {
        m6115N(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: l */
    public void mo6092l() {
        this.f6645c = this.f6644b.m12682a();
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: m */
    public void mo6093m() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: n */
    public void mo6094n() {
        m6116O((byte) 0);
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
        this.f6644b.m12683b(this.f6645c);
        this.f6645c = (short) 0;
        return f6641k;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: r */
    public void mo6098r() {
        this.f6645c = this.f6644b.m12682a();
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: s */
    public C8033p mo6099s() throws C6768ce {
        byte bMo6071B = mo6071B();
        if (bMo6071B == 0) {
            return f6642l;
        }
        short s9 = (short) ((bMo6071B & 240) >> 4);
        byte b10 = (byte) (bMo6071B & 15);
        C8033p c8033p = new C8033p("", m6122U(b10), s9 == 0 ? mo6072C() : (short) (this.f6645c + s9));
        if (m6121T(bMo6071B)) {
            this.f6647e = b10 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f6645c = c8033p.f13623c;
        return c8033p;
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: t */
    public void mo6100t() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: u */
    public C8037r mo6101u() throws C6768ce {
        int iM6109H = m6109H();
        byte bMo6071B = iM6109H == 0 ? (byte) 0 : mo6071B();
        return new C8037r(m6122U((byte) (bMo6071B >> 4)), m6122U((byte) (bMo6071B & 15)), iM6109H);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: v */
    public void mo6102v() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: w */
    public C8035q mo6103w() throws C6768ce {
        byte bMo6071B = mo6071B();
        int iM6109H = (bMo6071B >> 4) & 15;
        if (iM6109H == 15) {
            iM6109H = m6109H();
        }
        return new C8035q(m6122U(bMo6071B), iM6109H);
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: x */
    public void mo6104x() {
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: y */
    public C8041t mo6105y() {
        return new C8041t(mo6103w());
    }

    @Override // p114g2.AbstractC8039s
    /* renamed from: z */
    public void mo6106z() {
    }

    public C6764bj(AbstractC8008c0 abstractC8008c0) {
        this(abstractC8008c0, -1L);
    }
}
