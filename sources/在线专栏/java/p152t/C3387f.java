package p152t;

import android.graphics.Path;
import android.util.Log;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C3387f {

    /* renamed from: t.f$a */
    private static class a {

        /* renamed from: a */
        int f11904a;

        /* renamed from: b */
        boolean f11905b;

        a() {
        }
    }

    /* renamed from: a */
    private static void m10309a(ArrayList<b> arrayList, char c4, float[] fArr) {
        arrayList.add(new b(c4, fArr));
    }

    /* renamed from: b */
    public static boolean m10310b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            if (bVarArr[i4].f11906a != bVarArr2[i4].f11906a || bVarArr[i4].f11907b.length != bVarArr2[i4].f11907b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m10311c(float[] fArr, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i4 < 0 || i4 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = i5 - i4;
        int iMin = Math.min(i6, length - i4);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i4, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: d */
    public static b[] m10312d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            int iM10317i = m10317i(str, i4);
            String strTrim = str.substring(i5, iM10317i).trim();
            if (strTrim.length() > 0) {
                m10309a(arrayList, strTrim.charAt(0), m10316h(strTrim));
            }
            i5 = iM10317i;
            i4 = iM10317i + 1;
        }
        if (i4 - i5 == 1 && i5 < str.length()) {
            m10309a(arrayList, str.charAt(i5), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m10313e(String str) {
        Path path = new Path();
        b[] bVarArrM10312d = m10312d(str);
        if (bVarArrM10312d == null) {
            return null;
        }
        try {
            b.m10322e(bVarArrM10312d, path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing " + str, e4);
        }
    }

    /* renamed from: f */
    public static b[] m10314f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr2[i4] = new b(bVarArr[i4]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m10315g(java.lang.String r8, int r9, p152t.C3387f.a r10) {
        /*
            r0 = 0
            r10.f11905b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.f11905b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f11905b = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f11904a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152t.C3387f.m10315g(java.lang.String, int, t.f$a):void");
    }

    /* renamed from: h */
    private static float[] m10316h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i4 = 1;
            int i5 = 0;
            while (i4 < length) {
                m10315g(str, i4, aVar);
                int i6 = aVar.f11904a;
                if (i4 < i6) {
                    fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                    i5++;
                }
                i4 = aVar.f11905b ? i6 : i6 + 1;
            }
            return m10311c(fArr, 0, i5);
        } catch (NumberFormatException e4) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e4);
        }
    }

    /* renamed from: i */
    private static int m10317i(String str, int i4) {
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    /* renamed from: j */
    public static void m10318j(b[] bVarArr, b[] bVarArr2) {
        for (int i4 = 0; i4 < bVarArr2.length; i4++) {
            bVarArr[i4].f11906a = bVarArr2[i4].f11906a;
            for (int i5 = 0; i5 < bVarArr2[i4].f11907b.length; i5++) {
                bVarArr[i4].f11907b[i5] = bVarArr2[i4].f11907b[i5];
            }
        }
    }

    /* renamed from: t.f$b */
    public static class b {

        /* renamed from: a */
        public char f11906a;

        /* renamed from: b */
        public float[] f11907b;

        b(char c4, float[] fArr) {
            this.f11906a = c4;
            this.f11907b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m10319a(Path path, float[] fArr, char c4, char c5, float[] fArr2) {
            int i4;
            int i5;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c6 = c5;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i4 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    i4 = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i6 = 0;
            char c7 = c4;
            while (i6 < fArr2.length) {
                if (c6 != 'A') {
                    if (c6 == 'C') {
                        i5 = i6;
                        int i7 = i5 + 2;
                        int i8 = i5 + 3;
                        int i9 = i5 + 4;
                        int i10 = i5 + 5;
                        path.cubicTo(fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f18 = fArr2[i9];
                        float f22 = fArr2[i10];
                        float f23 = fArr2[i7];
                        float f24 = fArr2[i8];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c6 == 'H') {
                        i5 = i6;
                        int i11 = i5 + 0;
                        path.lineTo(fArr2[i11], f19);
                        f18 = fArr2[i11];
                    } else if (c6 == 'Q') {
                        i5 = i6;
                        int i12 = i5 + 0;
                        int i13 = i5 + 1;
                        int i14 = i5 + 2;
                        int i15 = i5 + 3;
                        path.quadTo(fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        float f25 = fArr2[i12];
                        float f26 = fArr2[i13];
                        f18 = fArr2[i14];
                        f19 = fArr2[i15];
                        f14 = f25;
                        f15 = f26;
                    } else if (c6 == 'V') {
                        i5 = i6;
                        int i16 = i5 + 0;
                        path.lineTo(f18, fArr2[i16]);
                        f19 = fArr2[i16];
                    } else if (c6 != 'a') {
                        if (c6 != 'c') {
                            if (c6 == 'h') {
                                int i17 = i6 + 0;
                                path.rLineTo(fArr2[i17], IGoodView.DEFAULT_TO_ALPHA);
                                f18 += fArr2[i17];
                            } else if (c6 != 'q') {
                                if (c6 == 'v') {
                                    int i18 = i6 + 0;
                                    path.rLineTo(IGoodView.DEFAULT_TO_ALPHA, fArr2[i18]);
                                    f7 = fArr2[i18];
                                } else if (c6 == 'L') {
                                    int i19 = i6 + 0;
                                    int i20 = i6 + 1;
                                    path.lineTo(fArr2[i19], fArr2[i20]);
                                    f18 = fArr2[i19];
                                    f19 = fArr2[i20];
                                } else if (c6 == 'M') {
                                    int i21 = i6 + 0;
                                    f18 = fArr2[i21];
                                    int i22 = i6 + 1;
                                    f19 = fArr2[i22];
                                    if (i6 > 0) {
                                        path.lineTo(fArr2[i21], fArr2[i22]);
                                    } else {
                                        path.moveTo(fArr2[i21], fArr2[i22]);
                                        i5 = i6;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 'S') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    float f27 = f19;
                                    int i23 = i6 + 0;
                                    int i24 = i6 + 1;
                                    int i25 = i6 + 2;
                                    int i26 = i6 + 3;
                                    path.cubicTo(f18, f27, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f4 = fArr2[i23];
                                    f5 = fArr2[i24];
                                    f18 = fArr2[i25];
                                    f19 = fArr2[i26];
                                    f14 = f4;
                                    f15 = f5;
                                } else if (c6 == 'T') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    int i27 = i6 + 0;
                                    int i28 = i6 + 1;
                                    path.quadTo(f18, f19, fArr2[i27], fArr2[i28]);
                                    float f28 = fArr2[i27];
                                    float f29 = fArr2[i28];
                                    i5 = i6;
                                    f15 = f19;
                                    f14 = f18;
                                    f18 = f28;
                                    f19 = f29;
                                } else if (c6 == 'l') {
                                    int i29 = i6 + 0;
                                    int i30 = i6 + 1;
                                    path.rLineTo(fArr2[i29], fArr2[i30]);
                                    f18 += fArr2[i29];
                                    f7 = fArr2[i30];
                                } else if (c6 == 'm') {
                                    int i31 = i6 + 0;
                                    f18 += fArr2[i31];
                                    int i32 = i6 + 1;
                                    f19 += fArr2[i32];
                                    if (i6 > 0) {
                                        path.rLineTo(fArr2[i31], fArr2[i32]);
                                    } else {
                                        path.rMoveTo(fArr2[i31], fArr2[i32]);
                                        i5 = i6;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        float f30 = f18 - f14;
                                        f8 = f19 - f15;
                                        f9 = f30;
                                    } else {
                                        f9 = IGoodView.DEFAULT_TO_ALPHA;
                                        f8 = IGoodView.DEFAULT_TO_ALPHA;
                                    }
                                    int i33 = i6 + 0;
                                    int i34 = i6 + 1;
                                    int i35 = i6 + 2;
                                    int i36 = i6 + 3;
                                    path.rCubicTo(f9, f8, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f4 = fArr2[i33] + f18;
                                    f5 = fArr2[i34] + f19;
                                    f18 += fArr2[i35];
                                    f6 = fArr2[i36];
                                } else if (c6 == 't') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f10 = f18 - f14;
                                        f11 = f19 - f15;
                                    } else {
                                        f11 = IGoodView.DEFAULT_TO_ALPHA;
                                        f10 = IGoodView.DEFAULT_TO_ALPHA;
                                    }
                                    int i37 = i6 + 0;
                                    int i38 = i6 + 1;
                                    path.rQuadTo(f10, f11, fArr2[i37], fArr2[i38]);
                                    float f31 = f10 + f18;
                                    float f32 = f11 + f19;
                                    f18 += fArr2[i37];
                                    f19 += fArr2[i38];
                                    f15 = f32;
                                    f14 = f31;
                                }
                                f19 += f7;
                            } else {
                                int i39 = i6 + 0;
                                int i40 = i6 + 1;
                                int i41 = i6 + 2;
                                int i42 = i6 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f4 = fArr2[i39] + f18;
                                f5 = fArr2[i40] + f19;
                                f18 += fArr2[i41];
                                f6 = fArr2[i42];
                            }
                            i5 = i6;
                        } else {
                            int i43 = i6 + 2;
                            int i44 = i6 + 3;
                            int i45 = i6 + 4;
                            int i46 = i6 + 5;
                            path.rCubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                            f4 = fArr2[i43] + f18;
                            f5 = fArr2[i44] + f19;
                            f18 += fArr2[i45];
                            f6 = fArr2[i46];
                        }
                        f19 += f6;
                        f14 = f4;
                        f15 = f5;
                        i5 = i6;
                    } else {
                        int i47 = i6 + 5;
                        int i48 = i6 + 6;
                        i5 = i6;
                        m10321c(path, f18, f19, fArr2[i47] + f18, fArr2[i48] + f19, fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != IGoodView.DEFAULT_TO_ALPHA, fArr2[i6 + 4] != IGoodView.DEFAULT_TO_ALPHA);
                        f18 += fArr2[i47];
                        f19 += fArr2[i48];
                    }
                    i6 = i5 + i4;
                    c7 = c5;
                    c6 = c7;
                } else {
                    i5 = i6;
                    int i49 = i5 + 5;
                    int i50 = i5 + 6;
                    m10321c(path, f18, f19, fArr2[i49], fArr2[i50], fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != IGoodView.DEFAULT_TO_ALPHA, fArr2[i5 + 4] != IGoodView.DEFAULT_TO_ALPHA);
                    f18 = fArr2[i49];
                    f19 = fArr2[i50];
                }
                f15 = f19;
                f14 = f18;
                i6 = i5 + i4;
                c7 = c5;
                c6 = c7;
            }
            fArr[0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        /* renamed from: b */
        private static void m10320b(Path path, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
            double d13 = d6;
            int iCeil = (int) Math.ceil(Math.abs((d12 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d10);
            double dSin = Math.sin(d10);
            double dCos2 = Math.cos(d11);
            double dSin2 = Math.sin(d11);
            double d14 = -d13;
            double d15 = d14 * dCos;
            double d16 = d7 * dSin;
            double d17 = (d15 * dSin2) - (d16 * dCos2);
            double d18 = d14 * dSin;
            double d19 = d7 * dCos;
            double d20 = (dSin2 * d18) + (dCos2 * d19);
            double d21 = d12 / iCeil;
            double d22 = d11;
            double d23 = d20;
            double d24 = d17;
            int i4 = 0;
            double d25 = d8;
            double d26 = d9;
            while (i4 < iCeil) {
                double d27 = d22 + d21;
                double dSin3 = Math.sin(d27);
                double dCos3 = Math.cos(d27);
                double d28 = (d4 + ((d13 * dCos) * dCos3)) - (d16 * dSin3);
                double d29 = d5 + (d13 * dSin * dCos3) + (d19 * dSin3);
                double d30 = (d15 * dSin3) - (d16 * dCos3);
                double d31 = (dSin3 * d18) + (dCos3 * d19);
                double d32 = d27 - d22;
                double dTan = Math.tan(d32 / 2.0d);
                double dSin4 = (Math.sin(d32) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d33 = d25 + (d24 * dSin4);
                path.rLineTo(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
                path.cubicTo((float) d33, (float) (d26 + (d23 * dSin4)), (float) (d28 - (dSin4 * d30)), (float) (d29 - (dSin4 * d31)), (float) d28, (float) d29);
                i4++;
                d21 = d21;
                dSin = dSin;
                d25 = d28;
                d18 = d18;
                dCos = dCos;
                d22 = d27;
                d23 = d31;
                d24 = d30;
                iCeil = iCeil;
                d26 = d29;
                d13 = d6;
            }
        }

        /* renamed from: c */
        private static void m10321c(Path path, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z3, boolean z4) {
            double d4;
            double d5;
            double radians = Math.toRadians(f10);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d6 = f4;
            double d7 = d6 * dCos;
            double d8 = f5;
            double d9 = f8;
            double d10 = (d7 + (d8 * dSin)) / d9;
            double d11 = ((-f4) * dSin) + (d8 * dCos);
            double d12 = f9;
            double d13 = d11 / d12;
            double d14 = f7;
            double d15 = ((f6 * dCos) + (d14 * dSin)) / d9;
            double d16 = (((-f6) * dSin) + (d14 * dCos)) / d12;
            double d17 = d10 - d15;
            double d18 = d13 - d16;
            double d19 = (d10 + d15) / 2.0d;
            double d20 = (d13 + d16) / 2.0d;
            double d21 = (d17 * d17) + (d18 * d18);
            if (d21 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d21);
                float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                m10321c(path, f4, f5, f6, f7, f8 * fSqrt, f9 * fSqrt, f10, z3, z4);
                return;
            }
            double dSqrt = Math.sqrt(d22);
            double d23 = d17 * dSqrt;
            double d24 = dSqrt * d18;
            if (z3 == z4) {
                d4 = d19 - d24;
                d5 = d20 + d23;
            } else {
                d4 = d19 + d24;
                d5 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d13 - d5, d10 - d4);
            double dAtan22 = Math.atan2(d16 - d5, d15 - d4) - dAtan2;
            if (z4 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d4 * d9;
            double d26 = d5 * d12;
            m10320b(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d9, d12, d6, d8, radians, dAtan2, dAtan22);
        }

        /* renamed from: e */
        public static void m10322e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c4 = 'm';
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                m10319a(path, fArr, c4, bVarArr[i4].f11906a, bVarArr[i4].f11907b);
                c4 = bVarArr[i4].f11906a;
            }
        }

        /* renamed from: d */
        public void m10323d(b bVar, b bVar2, float f4) {
            this.f11906a = bVar.f11906a;
            int i4 = 0;
            while (true) {
                float[] fArr = bVar.f11907b;
                if (i4 >= fArr.length) {
                    return;
                }
                this.f11907b[i4] = (fArr[i4] * (1.0f - f4)) + (bVar2.f11907b[i4] * f4);
                i4++;
            }
        }

        b(b bVar) {
            this.f11906a = bVar.f11906a;
            float[] fArr = bVar.f11907b;
            this.f11907b = C3387f.m10311c(fArr, 0, fArr.length);
        }
    }
}
