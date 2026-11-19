package p000a.p031h.p035d;

import android.graphics.Path;
import android.util.Log;
import p000a.p031h.p032b.C0190e;

/* renamed from: a.h.d.c */
/* loaded from: classes.dex */
public class C0204c {

    /* renamed from: a */
    public char f1458a;

    /* renamed from: b */
    public float[] f1459b;

    public C0204c(char c2, float[] fArr) {
        this.f1458a = c2;
        this.f1459b = fArr;
    }

    public C0204c(C0204c c0204c) {
        this.f1458a = c0204c.f1458a;
        float[] fArr = c0204c.f1459b;
        this.f1459b = C0190e.m717l(fArr, 0, fArr.length);
    }

    /* renamed from: a */
    public static void m761a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        double d2;
        double d3;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = f2;
        double d5 = f3;
        double d6 = (d5 * dSin) + (d4 * dCos);
        double d7 = d4;
        double d8 = f6;
        double d9 = d6 / d8;
        double d10 = f7;
        double d11 = ((d5 * dCos) + ((-f2) * dSin)) / d10;
        double d12 = d5;
        double d13 = f5;
        double d14 = ((d13 * dSin) + (f4 * dCos)) / d8;
        double d15 = ((d13 * dCos) + ((-f4) * dSin)) / d10;
        double d16 = d9 - d14;
        double d17 = d11 - d15;
        double d18 = (d9 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m761a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d21);
        double d22 = d16 * dSqrt;
        double d23 = dSqrt * d17;
        if (z == z2) {
            d2 = d18 - d23;
            d3 = d19 + d22;
        } else {
            d2 = d18 + d23;
            d3 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d11 - d3, d9 - d2);
        double dAtan22 = Math.atan2(d15 - d3, d14 - d2) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d2 * d8;
        double d25 = d3 * d10;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d8;
        double d29 = d28 * dCos2;
        double d30 = d10 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d10 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = d33;
        double d36 = dAtan22 / iCeil;
        int i = 0;
        while (i < iCeil) {
            double d37 = dAtan2 + d36;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d36;
            double d39 = (((d8 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d40 = d35;
            double d41 = d26;
            double d42 = (d40 * dSin4) + (d8 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d40) + (dSin4 * d32);
            double d45 = d37 - dAtan2;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * dSqrt2) + d7), (float) ((d34 * dSqrt2) + d12), (float) (d39 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d39, (float) d42);
            i++;
            dAtan2 = d37;
            d32 = d32;
            dCos2 = dCos2;
            iCeil = iCeil;
            d34 = d44;
            d8 = d8;
            d31 = d43;
            d7 = d39;
            d12 = d42;
            d26 = d41;
            d36 = d38;
            d35 = d40;
        }
    }

    /* renamed from: b */
    public static void m762b(C0204c[] c0204cArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c2;
        int i3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        C0204c[] c0204cArr2 = c0204cArr;
        int i4 = 6;
        float[] fArr2 = new float[6];
        char c3 = 'm';
        int i5 = 0;
        char c4 = 'm';
        int i6 = 0;
        while (i6 < c0204cArr2.length) {
            char c5 = c0204cArr2[i6].f1458a;
            float[] fArr3 = c0204cArr2[i6].f1459b;
            float f21 = fArr2[i5];
            float f22 = fArr2[1];
            float f23 = fArr2[2];
            float f24 = fArr2[3];
            float f25 = fArr2[4];
            float f26 = fArr2[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i = 2;
                    break;
            }
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i7 = i5;
            while (i7 < fArr3.length) {
                if (c5 != 'A') {
                    if (c5 != 'C') {
                        if (c5 == 'H') {
                            i2 = i7;
                            fArr = fArr3;
                            c2 = c5;
                            i3 = i6;
                            int i8 = i2 + 0;
                            path.lineTo(fArr[i8], f30);
                            f29 = fArr[i8];
                        } else if (c5 == 'Q') {
                            i2 = i7;
                            fArr = fArr3;
                            c2 = c5;
                            i3 = i6;
                            int i9 = i2 + 0;
                            int i10 = i2 + 1;
                            int i11 = i2 + 2;
                            int i12 = i2 + 3;
                            path.quadTo(fArr[i9], fArr[i10], fArr[i11], fArr[i12]);
                            f2 = fArr[i9];
                            f3 = fArr[i10];
                            f29 = fArr[i11];
                            f30 = fArr[i12];
                        } else if (c5 == 'V') {
                            i2 = i7;
                            fArr = fArr3;
                            c2 = c5;
                            i3 = i6;
                            int i13 = i2 + 0;
                            path.lineTo(f29, fArr[i13]);
                            f30 = fArr[i13];
                        } else if (c5 != 'a') {
                            if (c5 != 'c') {
                                if (c5 == 'h') {
                                    i2 = i7;
                                    int i14 = i2 + 0;
                                    path.rLineTo(fArr3[i14], 0.0f);
                                    f29 += fArr3[i14];
                                } else if (c5 != 'q') {
                                    if (c5 == 'v') {
                                        i2 = i7;
                                        f11 = f30;
                                        int i15 = i2 + 0;
                                        path.rLineTo(0.0f, fArr3[i15]);
                                        f12 = fArr3[i15];
                                    } else if (c5 == 'L') {
                                        i2 = i7;
                                        int i16 = i2 + 0;
                                        int i17 = i2 + 1;
                                        path.lineTo(fArr3[i16], fArr3[i17]);
                                        f29 = fArr3[i16];
                                        f30 = fArr3[i17];
                                    } else if (c5 == 'M') {
                                        i2 = i7;
                                        int i18 = i2 + 0;
                                        float f31 = fArr3[i18];
                                        int i19 = i2 + 1;
                                        float f32 = fArr3[i19];
                                        if (i2 > 0) {
                                            path.lineTo(fArr3[i18], fArr3[i19]);
                                            f29 = f31;
                                            f30 = f32;
                                        } else {
                                            path.moveTo(fArr3[i18], fArr3[i19]);
                                            f27 = f31;
                                            f28 = f32;
                                            f29 = f27;
                                            f30 = f28;
                                        }
                                    } else if (c5 == 'S') {
                                        i2 = i7;
                                        float f33 = f30;
                                        float f34 = f29;
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f13 = (f33 * 2.0f) - f24;
                                            f14 = (f34 * 2.0f) - f23;
                                        } else {
                                            f14 = f34;
                                            f13 = f33;
                                        }
                                        int i20 = i2 + 0;
                                        int i21 = i2 + 1;
                                        int i22 = i2 + 2;
                                        int i23 = i2 + 3;
                                        path.cubicTo(f14, f13, fArr3[i20], fArr3[i21], fArr3[i22], fArr3[i23]);
                                        float f35 = fArr3[i20];
                                        float f36 = fArr3[i21];
                                        f10 = fArr3[i22];
                                        f9 = fArr3[i23];
                                        f23 = f35;
                                        f24 = f36;
                                        f29 = f10;
                                        f30 = f9;
                                    } else if (c5 == 'T') {
                                        i2 = i7;
                                        float f37 = f30;
                                        float f38 = f29;
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f15 = (f38 * 2.0f) - f23;
                                            f16 = (f37 * 2.0f) - f24;
                                        } else {
                                            f15 = f38;
                                            f16 = f37;
                                        }
                                        int i24 = i2 + 0;
                                        int i25 = i2 + 1;
                                        path.quadTo(f15, f16, fArr3[i24], fArr3[i25]);
                                        f24 = f16;
                                        f23 = f15;
                                        fArr = fArr3;
                                        c2 = c5;
                                        i3 = i6;
                                        f29 = fArr3[i24];
                                        f30 = fArr3[i25];
                                    } else if (c5 == 'l') {
                                        i2 = i7;
                                        f11 = f30;
                                        int i26 = i2 + 0;
                                        int i27 = i2 + 1;
                                        path.rLineTo(fArr3[i26], fArr3[i27]);
                                        f29 += fArr3[i26];
                                        f12 = fArr3[i27];
                                    } else if (c5 == c3) {
                                        i2 = i7;
                                        int i28 = i2 + 0;
                                        f29 += fArr3[i28];
                                        int i29 = i2 + 1;
                                        f30 += fArr3[i29];
                                        if (i2 > 0) {
                                            path.rLineTo(fArr3[i28], fArr3[i29]);
                                        } else {
                                            path.rMoveTo(fArr3[i28], fArr3[i29]);
                                            f28 = f30;
                                            f27 = f29;
                                            f29 = f27;
                                            f30 = f28;
                                        }
                                    } else if (c5 != 's') {
                                        if (c5 == 't') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f19 = f29 - f23;
                                                f20 = f30 - f24;
                                            } else {
                                                f20 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i30 = i7 + 0;
                                            int i31 = i7 + 1;
                                            path.rQuadTo(f19, f20, fArr3[i30], fArr3[i31]);
                                            float f39 = f19 + f29;
                                            float f40 = f20 + f30;
                                            f29 += fArr3[i30];
                                            f30 += fArr3[i31];
                                            f24 = f40;
                                            f23 = f39;
                                        }
                                        i2 = i7;
                                    } else {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f17 = f30 - f24;
                                            f18 = f29 - f23;
                                        } else {
                                            f18 = 0.0f;
                                            f17 = 0.0f;
                                        }
                                        int i32 = i7 + 0;
                                        int i33 = i7 + 1;
                                        int i34 = i7 + 2;
                                        int i35 = i7 + 3;
                                        i2 = i7;
                                        f4 = f30;
                                        float f41 = f29;
                                        path.rCubicTo(f18, f17, fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                                        f5 = fArr3[i32] + f41;
                                        f6 = fArr3[i33] + f4;
                                        f7 = f41 + fArr3[i34];
                                        f8 = fArr3[i35];
                                    }
                                    f30 = f11 + f12;
                                } else {
                                    i2 = i7;
                                    f4 = f30;
                                    float f42 = f29;
                                    int i36 = i2 + 0;
                                    int i37 = i2 + 1;
                                    int i38 = i2 + 2;
                                    int i39 = i2 + 3;
                                    path.rQuadTo(fArr3[i36], fArr3[i37], fArr3[i38], fArr3[i39]);
                                    f5 = fArr3[i36] + f42;
                                    f6 = fArr3[i37] + f4;
                                    float f43 = f42 + fArr3[i38];
                                    float f44 = fArr3[i39];
                                    f7 = f43;
                                    f8 = f44;
                                }
                                fArr = fArr3;
                                c2 = c5;
                                i3 = i6;
                            } else {
                                i2 = i7;
                                f4 = f30;
                                float f45 = f29;
                                int i40 = i2 + 2;
                                int i41 = i2 + 3;
                                int i42 = i2 + 4;
                                int i43 = i2 + 5;
                                path.rCubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i40], fArr3[i41], fArr3[i42], fArr3[i43]);
                                f5 = fArr3[i40] + f45;
                                f6 = fArr3[i41] + f4;
                                f7 = f45 + fArr3[i42];
                                f8 = fArr3[i43];
                            }
                            f9 = f4 + f8;
                            f23 = f5;
                            f24 = f6;
                            f10 = f7;
                            f29 = f10;
                            f30 = f9;
                            fArr = fArr3;
                            c2 = c5;
                            i3 = i6;
                        } else {
                            i2 = i7;
                            float f46 = f30;
                            float f47 = f29;
                            int i44 = i2 + 5;
                            int i45 = i2 + 6;
                            fArr = fArr3;
                            c2 = c5;
                            i3 = i6;
                            m761a(path, f47, f46, fArr3[i44] + f47, fArr3[i45] + f46, fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                            f29 = f47 + fArr[i44];
                            f30 = f46 + fArr[i45];
                        }
                        i7 = i2 + i;
                        c4 = c2;
                        c5 = c4;
                        fArr3 = fArr;
                        i6 = i3;
                        c3 = 'm';
                        i5 = 0;
                    } else {
                        i2 = i7;
                        fArr = fArr3;
                        c2 = c5;
                        i3 = i6;
                        int i46 = i2 + 2;
                        int i47 = i2 + 3;
                        int i48 = i2 + 4;
                        int i49 = i2 + 5;
                        path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i46], fArr[i47], fArr[i48], fArr[i49]);
                        float f48 = fArr[i48];
                        float f49 = fArr[i49];
                        f2 = fArr[i46];
                        f29 = f48;
                        f30 = f49;
                        f3 = fArr[i47];
                    }
                    f23 = f2;
                    f24 = f3;
                    i7 = i2 + i;
                    c4 = c2;
                    c5 = c4;
                    fArr3 = fArr;
                    i6 = i3;
                    c3 = 'm';
                    i5 = 0;
                } else {
                    i2 = i7;
                    fArr = fArr3;
                    c2 = c5;
                    i3 = i6;
                    int i50 = i2 + 5;
                    int i51 = i2 + 6;
                    m761a(path, f29, f30, fArr[i50], fArr[i51], fArr[i2 + 0], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f29 = fArr[i50];
                    f30 = fArr[i51];
                }
                f24 = f30;
                f23 = f29;
                i7 = i2 + i;
                c4 = c2;
                c5 = c4;
                fArr3 = fArr;
                i6 = i3;
                c3 = 'm';
                i5 = 0;
            }
            int i52 = i6;
            fArr2[i5] = f29;
            fArr2[1] = f30;
            fArr2[2] = f23;
            fArr2[3] = f24;
            fArr2[4] = f27;
            fArr2[5] = f28;
            i6 = i52 + 1;
            i4 = 6;
            c3 = 'm';
            c4 = c0204cArr[i52].f1458a;
            c0204cArr2 = c0204cArr;
        }
    }
}
