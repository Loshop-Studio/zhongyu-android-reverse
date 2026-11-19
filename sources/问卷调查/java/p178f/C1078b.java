package p178f;

import java.io.Serializable;
import java.util.Arrays;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;
import p178f.p179h.C1084a;

/* renamed from: f.b */
/* loaded from: classes.dex */
public class C1078b implements Serializable, Comparable<C1078b> {

    /* renamed from: e */
    public static final C1078b f5647e = new C1078b(new byte[0]);

    /* renamed from: f */
    public static final C1078b f5648f = null;

    /* renamed from: b */
    public transient int f5649b;

    /* renamed from: c */
    public transient String f5650c;

    /* renamed from: d */
    public final byte[] f5651d;

    public C1078b(byte[] bArr) {
        C1011d.m2809e(bArr, "data");
        this.f5651d = bArr;
    }

    /* renamed from: a */
    public static final C1078b m2864a(String str) {
        C1011d.m2809e(str, "$this$decodeHex");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(C0561a.m2076d("Unexpected hex string: ", str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (C1084a.m2880a(str.charAt(i2 + 1)) + (C1084a.m2880a(str.charAt(i2)) << 4));
        }
        return new C1078b(bArr);
    }

    /* renamed from: b */
    public int mo2865b() {
        return this.f5651d.length;
    }

    /* renamed from: c */
    public String mo2866c() {
        byte[] bArr = this.f5651d;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C1084a.f5666a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6 < r7) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(p178f.C1078b r9) {
        /*
            r8 = this;
            f.b r9 = (p178f.C1078b) r9
            java.lang.String r0 = "other"
            p160d.p162f.p164b.C1011d.m2809e(r9, r0)
            int r0 = r8.mo2865b()
            int r1 = r9.mo2865b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = -1
            if (r4 >= r2) goto L2c
            byte r6 = r8.mo2868e(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.mo2868e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L29
            int r4 = r4 + 1
            goto L15
        L29:
            if (r6 >= r7) goto L33
            goto L31
        L2c:
            if (r0 != r1) goto L2f
            goto L34
        L2f:
            if (r0 >= r1) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = 1
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p178f.C1078b.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public byte[] mo2867d() {
        return this.f5651d;
    }

    /* renamed from: e */
    public byte mo2868e(int i) {
        return this.f5651d[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1078b) {
            C1078b c1078b = (C1078b) obj;
            int iMo2865b = c1078b.mo2865b();
            byte[] bArr = this.f5651d;
            if (iMo2865b == bArr.length && c1078b.mo2870g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo2869f(int i, C1078b c1078b, int i2, int i3) {
        C1011d.m2809e(c1078b, "other");
        return c1078b.mo2870g(i2, this.f5651d, i, i3);
    }

    /* renamed from: g */
    public boolean mo2870g(int i, byte[] bArr, int i2, int i3) {
        C1011d.m2809e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f5651d;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C0787a.m2468b(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f5649b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f5651d);
        this.f5649b = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178f.C1078b.toString():java.lang.String");
    }
}
