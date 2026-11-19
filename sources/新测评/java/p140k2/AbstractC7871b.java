package p140k2;

import java.io.UnsupportedEncodingException;
import kotlin.UByte;

/* renamed from: k2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7871b {

    /* renamed from: a */
    public static final /* synthetic */ boolean f13637a = true;

    /* renamed from: k2.b$a */
    public static abstract class a {

        /* renamed from: a */
        public byte[] f13638a;

        /* renamed from: b */
        public int f13639b;
    }

    /* renamed from: k2.b$b */
    public static class b extends a {

        /* renamed from: f */
        public static final int[] f13640f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        public static final int[] f13641g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        public int f13642c;

        /* renamed from: d */
        public int f13643d;

        /* renamed from: e */
        public final int[] f13644e;

        public b(int i10, byte[] bArr) {
            this.f13638a = bArr;
            this.f13644e = (i10 & 8) == 0 ? f13640f : f13641g;
            this.f13642c = 0;
            this.f13643d = 0;
        }

        /* renamed from: a */
        public boolean m13398a(byte[] bArr, int i10, int i11, boolean z9) {
            int i12 = this.f13642c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f13643d;
            byte[] bArr2 = this.f13638a;
            int[] iArr = this.f13644e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i18 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i18 + 2] & UByte.MAX_VALUE] << 6) | iArr[bArr[i18 + 3] & UByte.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & UByte.MAX_VALUE];
                if (i17 != 0) {
                    if (i17 == 1) {
                        if (i21 < 0) {
                            if (i21 != -1) {
                                this.f13642c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 == 2) {
                        if (i21 < 0) {
                            if (i21 == -2) {
                                bArr2[i15] = (byte) (i16 >> 4);
                                i15++;
                                i17 = 4;
                            } else if (i21 != -1) {
                                this.f13642c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 != 3) {
                        if (i17 != 4) {
                            if (i17 == 5 && i21 != -1) {
                                this.f13642c = 6;
                                return false;
                            }
                        } else if (i21 == -2) {
                            i17++;
                        } else if (i21 != -1) {
                            this.f13642c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        int i22 = i21 | (i16 << 6);
                        bArr2[i15 + 2] = (byte) i22;
                        bArr2[i15 + 1] = (byte) (i22 >> 8);
                        bArr2[i15] = (byte) (i22 >> 16);
                        i15 += 3;
                        i16 = i22;
                        i17 = 0;
                    } else if (i21 == -2) {
                        bArr2[i15 + 1] = (byte) (i16 >> 2);
                        bArr2[i15] = (byte) (i16 >> 10);
                        i15 += 2;
                        i17 = 5;
                    } else if (i21 != -1) {
                        this.f13642c = 6;
                        return false;
                    }
                    i17++;
                    i16 = i21;
                } else if (i21 >= 0) {
                    i17++;
                    i16 = i21;
                } else if (i21 != -1) {
                    this.f13642c = 6;
                    return false;
                }
                i18 = i20;
            }
            if (!z9) {
                this.f13642c = i17;
                this.f13643d = i16;
                this.f13639b = i15;
                return true;
            }
            if (i17 == 1) {
                this.f13642c = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 += 2;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f13642c = 6;
                return false;
            }
            this.f13642c = i17;
            this.f13639b = i15;
            return true;
        }
    }

    /* renamed from: k2.b$c */
    public static class c extends a {

        /* renamed from: j */
        public static final byte[] f13645j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        public static final byte[] f13646k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: l */
        public static final /* synthetic */ boolean f13647l = true;

        /* renamed from: c */
        public final byte[] f13648c;

        /* renamed from: d */
        public int f13649d;

        /* renamed from: e */
        public int f13650e;

        /* renamed from: f */
        public final boolean f13651f;

        /* renamed from: g */
        public final boolean f13652g;

        /* renamed from: h */
        public final boolean f13653h;

        /* renamed from: i */
        public final byte[] f13654i;

        public c(int i10, byte[] bArr) {
            this.f13638a = bArr;
            this.f13651f = (i10 & 1) == 0;
            boolean z9 = (i10 & 2) == 0;
            this.f13652g = z9;
            this.f13653h = (i10 & 4) != 0;
            this.f13654i = (i10 & 8) == 0 ? f13645j : f13646k;
            this.f13648c = new byte[2];
            this.f13649d = 0;
            this.f13650e = z9 ? 19 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01d3 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m13399a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p140k2.AbstractC7871b.c.m13399a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m13392a(String str, int i10) {
        return m13393b(str.getBytes(), i10);
    }

    /* renamed from: b */
    public static byte[] m13393b(byte[] bArr, int i10) {
        return m13394c(bArr, 0, bArr.length, i10);
    }

    /* renamed from: c */
    public static byte[] m13394c(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.m13398a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f13639b;
        byte[] bArr2 = bVar.f13638a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    /* renamed from: d */
    public static byte[] m13395d(byte[] bArr, int i10) {
        return m13396e(bArr, 0, bArr.length, i10);
    }

    /* renamed from: e */
    public static byte[] m13396e(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f13651f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f13652g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f13653h ? 2 : 1);
        }
        cVar.f13638a = new byte[i13];
        cVar.m13399a(bArr, i10, i11, true);
        if (f13637a || cVar.f13639b == i13) {
            return cVar.f13638a;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public static String m13397f(byte[] bArr, int i10) {
        try {
            return new String(m13395d(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
