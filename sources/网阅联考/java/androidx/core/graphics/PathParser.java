package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import com.p040uc.crashsdk.export.ExitType;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c4, float[] fArr) {
        arrayList.add(new PathDataNode(c4, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
            PathDataNode pathDataNode = pathDataNodeArr[i4];
            char c4 = pathDataNode.mType;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i4];
            if (c4 != pathDataNode2.mType || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i4, int i5) {
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

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            int iNextStart = nextStart(str, i4);
            String strTrim = str.substring(i5, iNextStart).trim();
            if (strTrim.length() > 0) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i5 = iNextStart;
            i4 = iNextStart + 1;
        }
        if (i4 - i5 == 1 && i5 < str.length()) {
            addNode(arrayList, str.charAt(i5), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = createNodesFromPathData(str);
        if (pathDataNodeArrCreateNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(pathDataNodeArrCreateNodesFromPathData, path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing " + str, e4);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
            pathDataNodeArr2[i4] = new PathDataNode(pathDataNodeArr[i4]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
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
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.mEndWithNegOrDot = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.mEndWithNegOrDot = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i4 = 1;
            int i5 = 0;
            while (i4 < length) {
                extract(str, i4, extractFloatResult);
                int i6 = extractFloatResult.mEndPosition;
                if (i4 < i6) {
                    fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                    i5++;
                }
                i4 = extractFloatResult.mEndWithNegOrDot ? i6 : i6 + 1;
            }
            return copyOfRange(fArr, 0, i5);
        } catch (NumberFormatException e4) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e4);
        }
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f4) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
            pathDataNodeArr[i4].interpolatePathDataNode(pathDataNodeArr2[i4], pathDataNodeArr3[i4], f4);
        }
        return true;
    }

    private static int nextStart(String str, int i4) {
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i4 = 0; i4 < pathDataNodeArr2.length; i4++) {
            pathDataNodeArr[i4].mType = pathDataNodeArr2[i4].mType;
            int i5 = 0;
            while (true) {
                float[] fArr = pathDataNodeArr2[i4].mParams;
                if (i5 < fArr.length) {
                    pathDataNodeArr[i4].mParams[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c4, float[] fArr) {
            this.mType = c4;
            this.mParams = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c4, char c5, float[] fArr2) {
            int i4;
            int i5;
            int i6;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c6 = c5;
            boolean z3 = false;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c6) {
                case 'A':
                case ExitType.UNEXP_FOREGROUND_CRASH /* 97 */:
                    i4 = 7;
                    i5 = i4;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    i5 = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                case 't':
                default:
                    i5 = 2;
                    break;
                case 'Q':
                case 'S':
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    i5 = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i7 = 0;
            char c7 = c4;
            while (i7 < fArr2.length) {
                if (c6 != 'A') {
                    if (c6 == 'C') {
                        i6 = i7;
                        int i8 = i6 + 2;
                        int i9 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        f18 = fArr2[i10];
                        float f22 = fArr2[i11];
                        float f23 = fArr2[i8];
                        float f24 = fArr2[i9];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c6 == 'H') {
                        i6 = i7;
                        int i12 = i6 + 0;
                        path.lineTo(fArr2[i12], f19);
                        f18 = fArr2[i12];
                    } else if (c6 == 'Q') {
                        i6 = i7;
                        int i13 = i6 + 0;
                        int i14 = i6 + 1;
                        int i15 = i6 + 2;
                        int i16 = i6 + 3;
                        path.quadTo(fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f25 = fArr2[i13];
                        float f26 = fArr2[i14];
                        f18 = fArr2[i15];
                        f19 = fArr2[i16];
                        f14 = f25;
                        f15 = f26;
                    } else if (c6 == 'V') {
                        i6 = i7;
                        int i17 = i6 + 0;
                        path.lineTo(f18, fArr2[i17]);
                        f19 = fArr2[i17];
                    } else if (c6 != 'a') {
                        if (c6 != 'c') {
                            if (c6 == 'h') {
                                int i18 = i7 + 0;
                                path.rLineTo(fArr2[i18], 0.0f);
                                f18 += fArr2[i18];
                            } else if (c6 != 'q') {
                                if (c6 == 'v') {
                                    int i19 = i7 + 0;
                                    path.rLineTo(0.0f, fArr2[i19]);
                                    f7 = fArr2[i19];
                                } else if (c6 == 'L') {
                                    int i20 = i7 + 0;
                                    int i21 = i7 + 1;
                                    path.lineTo(fArr2[i20], fArr2[i21]);
                                    f18 = fArr2[i20];
                                    f19 = fArr2[i21];
                                } else if (c6 == 'M') {
                                    f18 = fArr2[i7 + 0];
                                    f19 = fArr2[i7 + 1];
                                    if (i7 > 0) {
                                        path.lineTo(f18, f19);
                                    } else {
                                        path.moveTo(f18, f19);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 'S') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    float f27 = f19;
                                    int i22 = i7 + 0;
                                    int i23 = i7 + 1;
                                    int i24 = i7 + 2;
                                    int i25 = i7 + 3;
                                    path.cubicTo(f18, f27, fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f4 = fArr2[i22];
                                    f5 = fArr2[i23];
                                    f18 = fArr2[i24];
                                    f19 = fArr2[i25];
                                    f14 = f4;
                                    f15 = f5;
                                } else if (c6 == 'T') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    int i26 = i7 + 0;
                                    int i27 = i7 + 1;
                                    path.quadTo(f18, f19, fArr2[i26], fArr2[i27]);
                                    float f28 = fArr2[i26];
                                    float f29 = fArr2[i27];
                                    i6 = i7;
                                    f15 = f19;
                                    f14 = f18;
                                    f18 = f28;
                                    f19 = f29;
                                } else if (c6 == 'l') {
                                    int i28 = i7 + 0;
                                    int i29 = i7 + 1;
                                    path.rLineTo(fArr2[i28], fArr2[i29]);
                                    f18 += fArr2[i28];
                                    f7 = fArr2[i29];
                                } else if (c6 == 'm') {
                                    float f30 = fArr2[i7 + 0];
                                    f18 += f30;
                                    float f31 = fArr2[i7 + 1];
                                    f19 += f31;
                                    if (i7 > 0) {
                                        path.rLineTo(f30, f31);
                                    } else {
                                        path.rMoveTo(f30, f31);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        float f32 = f18 - f14;
                                        f8 = f19 - f15;
                                        f9 = f32;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i30 = i7 + 0;
                                    int i31 = i7 + 1;
                                    int i32 = i7 + 2;
                                    int i33 = i7 + 3;
                                    path.rCubicTo(f9, f8, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f4 = fArr2[i30] + f18;
                                    f5 = fArr2[i31] + f19;
                                    f18 += fArr2[i32];
                                    f6 = fArr2[i33];
                                } else if (c6 == 't') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f10 = f18 - f14;
                                        f11 = f19 - f15;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i34 = i7 + 0;
                                    int i35 = i7 + 1;
                                    path.rQuadTo(f10, f11, fArr2[i34], fArr2[i35]);
                                    float f33 = f10 + f18;
                                    float f34 = f11 + f19;
                                    f18 += fArr2[i34];
                                    f19 += fArr2[i35];
                                    f15 = f34;
                                    f14 = f33;
                                }
                                f19 += f7;
                            } else {
                                int i36 = i7 + 0;
                                int i37 = i7 + 1;
                                int i38 = i7 + 2;
                                int i39 = i7 + 3;
                                path.rQuadTo(fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                f4 = fArr2[i36] + f18;
                                f5 = fArr2[i37] + f19;
                                f18 += fArr2[i38];
                                f6 = fArr2[i39];
                            }
                            i6 = i7;
                        } else {
                            int i40 = i7 + 2;
                            int i41 = i7 + 3;
                            int i42 = i7 + 4;
                            int i43 = i7 + 5;
                            path.rCubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f4 = fArr2[i40] + f18;
                            f5 = fArr2[i41] + f19;
                            f18 += fArr2[i42];
                            f6 = fArr2[i43];
                        }
                        f19 += f6;
                        f14 = f4;
                        f15 = f5;
                        i6 = i7;
                    } else {
                        int i44 = i7 + 5;
                        int i45 = i7 + 6;
                        i6 = i7;
                        drawArc(path, f18, f19, fArr2[i44] + f18, fArr2[i45] + f19, fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f18 += fArr2[i44];
                        f19 += fArr2[i45];
                    }
                    i7 = i6 + i5;
                    c7 = c5;
                    c6 = c7;
                    z3 = false;
                } else {
                    i6 = i7;
                    int i46 = i6 + 5;
                    int i47 = i6 + 6;
                    drawArc(path, f18, f19, fArr2[i46], fArr2[i47], fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f18 = fArr2[i46];
                    f19 = fArr2[i47];
                }
                f15 = f19;
                f14 = f18;
                i7 = i6 + i5;
                c7 = c5;
                c6 = c7;
                z3 = false;
            }
            fArr[z3 ? 1 : 0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        private static void arcToBezier(Path path, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
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
            double d22 = d20;
            double d23 = d17;
            int i4 = 0;
            double d24 = d8;
            double d25 = d9;
            double d26 = d11;
            while (i4 < iCeil) {
                double d27 = d26 + d21;
                double dSin3 = Math.sin(d27);
                double dCos3 = Math.cos(d27);
                double d28 = (d4 + ((d13 * dCos) * dCos3)) - (d16 * dSin3);
                double d29 = d5 + (d13 * dSin * dCos3) + (d19 * dSin3);
                double d30 = (d15 * dSin3) - (d16 * dCos3);
                double d31 = (dSin3 * d18) + (dCos3 * d19);
                double d32 = d27 - d26;
                double dTan = Math.tan(d32 / 2.0d);
                double dSin4 = (Math.sin(d32) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d33 = d24 + (d23 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d33, (float) (d25 + (d22 * dSin4)), (float) (d28 - (dSin4 * d30)), (float) (d29 - (dSin4 * d31)), (float) d28, (float) d29);
                i4++;
                d21 = d21;
                dSin = dSin;
                d24 = d28;
                d18 = d18;
                dCos = dCos;
                d26 = d27;
                d22 = d31;
                d23 = d30;
                iCeil = iCeil;
                d25 = d29;
                d13 = d6;
            }
        }

        private static void drawArc(Path path, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z3, boolean z4) {
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
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d21);
                float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                drawArc(path, f4, f5, f6, f7, f8 * fSqrt, f9 * fSqrt, f10, z3, z4);
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
            arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d9, d12, d6, d8, radians, dAtan2, dAtan22);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c4 = 'm';
            for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
                PathDataNode pathDataNode = pathDataNodeArr[i4];
                addCommand(path, fArr, c4, pathDataNode.mType, pathDataNode.mParams);
                c4 = pathDataNodeArr[i4].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f4) {
            this.mType = pathDataNode.mType;
            int i4 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i4 >= fArr.length) {
                    return;
                }
                this.mParams[i4] = (fArr[i4] * (1.0f - f4)) + (pathDataNode2.mParams[i4] * f4);
                i4++;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }
}
