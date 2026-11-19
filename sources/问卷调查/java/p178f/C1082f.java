package p178f;

import p070b.p113c.p114a.C0787a;
import p160d.p161e.C0999e;
import p160d.p162f.p164b.C1011d;
import p178f.p179h.C1084a;

/* renamed from: f.f */
/* loaded from: classes.dex */
public final class C1082f extends C1078b {

    /* renamed from: g */
    public final transient byte[][] f5664g;

    /* renamed from: h */
    public final transient int[] f5665h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1082f(byte[][] bArr, int[] iArr) {
        super(C1078b.f5647e.f5651d);
        C1011d.m2809e(bArr, "segments");
        C1011d.m2809e(iArr, "directory");
        this.f5664g = bArr;
        this.f5665h = iArr;
    }

    @Override // p178f.C1078b
    /* renamed from: b */
    public int mo2865b() {
        return this.f5665h[this.f5664g.length - 1];
    }

    @Override // p178f.C1078b
    /* renamed from: c */
    public String mo2866c() {
        byte[] bArrM2879h = m2879h();
        C1011d.m2809e(bArrM2879h, "data");
        char[] cArr = new char[bArrM2879h.length * 2];
        int i = 0;
        for (byte b2 : bArrM2879h) {
            int i2 = i + 1;
            char[] cArr2 = C1084a.f5666a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @Override // p178f.C1078b
    /* renamed from: d */
    public byte[] mo2867d() {
        return m2879h();
    }

    @Override // p178f.C1078b
    /* renamed from: e */
    public byte mo2868e(int i) {
        C0787a.m2473g(this.f5665h[this.f5664g.length - 1], i, 1L);
        int iM2465E = C0787a.m2465E(this, i);
        int i2 = iM2465E == 0 ? 0 : this.f5665h[iM2465E - 1];
        int[] iArr = this.f5665h;
        byte[][] bArr = this.f5664g;
        return bArr[iM2465E][(i - i2) + iArr[bArr.length + iM2465E]];
    }

    @Override // p178f.C1078b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1078b) {
            C1078b c1078b = (C1078b) obj;
            if (c1078b.mo2865b() == mo2865b() && mo2869f(0, c1078b, 0, mo2865b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p178f.C1078b
    /* renamed from: f */
    public boolean mo2869f(int i, C1078b c1078b, int i2, int i3) {
        C1011d.m2809e(c1078b, "other");
        if (i < 0 || i > mo2865b() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM2465E = C0787a.m2465E(this, i);
        while (i < i4) {
            int i5 = iM2465E == 0 ? 0 : this.f5665h[iM2465E - 1];
            int[] iArr = this.f5665h;
            int i6 = iArr[iM2465E] - i5;
            int i7 = iArr[this.f5664g.length + iM2465E];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!c1078b.mo2870g(i2, this.f5664g[iM2465E], (i - i5) + i7, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM2465E++;
        }
        return true;
    }

    @Override // p178f.C1078b
    /* renamed from: g */
    public boolean mo2870g(int i, byte[] bArr, int i2, int i3) {
        C1011d.m2809e(bArr, "other");
        if (i < 0 || i > mo2865b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM2465E = C0787a.m2465E(this, i);
        while (i < i4) {
            int i5 = iM2465E == 0 ? 0 : this.f5665h[iM2465E - 1];
            int[] iArr = this.f5665h;
            int i6 = iArr[iM2465E] - i5;
            int i7 = iArr[this.f5664g.length + iM2465E];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!C0787a.m2468b(this.f5664g[iM2465E], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM2465E++;
        }
        return true;
    }

    /* renamed from: h */
    public byte[] m2879h() {
        byte[] bArr = new byte[mo2865b()];
        int length = this.f5664g.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f5665h;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C0999e.m2794a(this.f5664g[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p178f.C1078b
    public int hashCode() {
        int i = this.f5649b;
        if (i != 0) {
            return i;
        }
        int length = this.f5664g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f5665h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f5664g[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f5649b = i3;
        return i3;
    }

    @Override // p178f.C1078b
    public String toString() {
        return new C1078b(m2879h()).toString();
    }
}
