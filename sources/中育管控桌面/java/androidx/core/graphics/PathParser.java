package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c7, float[] fArr) {
        arrayList.add(new PathDataNode(c7, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < pathDataNodeArr.length; i6++) {
            if (pathDataNodeArr[i6].mType != pathDataNodeArr2[i6].mType || pathDataNodeArr[i6].mParams.length != pathDataNodeArr2[i6].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i6, int i7) {
        if (i6 > i7) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i6 < 0 || i6 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = i7 - i6;
        int iMin = Math.min(i8, length - i6);
        float[] fArr2 = new float[i8];
        System.arraycopy(fArr, i6, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        int i7 = 1;
        while (i7 < str.length()) {
            int iNextStart = nextStart(str, i7);
            String strTrim = str.substring(i6, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i6 = iNextStart;
            i7 = iNextStart + 1;
        }
        if (i7 - i6 == 1 && i6 < str.length()) {
            addNode(arrayList, str.charAt(i6), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing " + str, e6);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i6 = 0; i6 < pathDataNodeArr.length; i6++) {
            pathDataNodeArr2[i6] = new PathDataNode(pathDataNodeArr[i6]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
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
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.mEndWithNegOrDot = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.mEndWithNegOrDot = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
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
            int i6 = 1;
            int i7 = 0;
            while (i6 < length) {
                extract(str, i6, extractFloatResult);
                int i8 = extractFloatResult.mEndPosition;
                if (i6 < i8) {
                    fArr[i7] = Float.parseFloat(str.substring(i6, i8));
                    i7++;
                }
                i6 = extractFloatResult.mEndWithNegOrDot ? i8 : i8 + 1;
            }
            return copyOfRange(fArr, 0, i7);
        } catch (NumberFormatException e6) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e6);
        }
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f6, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f6)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i6) {
        while (i6 < str.length()) {
            char cCharAt = str.charAt(i6);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i6++;
        }
        return i6;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c7 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c7, pathDataNode.mType, pathDataNode.mParams);
            c7 = pathDataNode.mType;
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i6 = 0; i6 < pathDataNodeArr2.length; i6++) {
            pathDataNodeArr[i6].mType = pathDataNodeArr2[i6].mType;
            for (int i7 = 0; i7 < pathDataNodeArr2[i6].mParams.length; i7++) {
                pathDataNodeArr[i6].mParams[i7] = pathDataNodeArr2[i6].mParams[i7];
            }
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public PathDataNode(char c7, float[] fArr) {
            this.mType = c7;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c7, char c8, float[] fArr2) {
            int i6;
            int i7;
            boolean z6;
            boolean z7;
            char c9;
            char c10;
            int i8;
            float f6;
            boolean z8;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            boolean z9;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            Path path2 = path;
            boolean z10 = false;
            float f22 = fArr[0];
            boolean z11 = true;
            float f23 = fArr[1];
            char c11 = 2;
            float f24 = fArr[2];
            char c12 = 3;
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i6 = 7;
                    i7 = i6;
                    break;
                case 'C':
                case 'c':
                    i6 = 6;
                    i7 = i6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i7 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    i7 = 2;
                    break;
            }
            float f28 = f22;
            float f29 = f23;
            float f30 = f26;
            float f31 = f27;
            int i9 = 0;
            char c13 = c7;
            while (i9 < fArr2.length) {
                if (c8 == 'A') {
                    float f32 = f28;
                    float f33 = f29;
                    z6 = z10;
                    z7 = z11;
                    c9 = c11;
                    c10 = c12;
                    i8 = i9;
                    int i10 = i8 + 5;
                    float f34 = fArr2[i10];
                    int i11 = i8 + 6;
                    float f35 = fArr2[i11];
                    float f36 = fArr2[i8];
                    float f37 = fArr2[i8 + 1];
                    float f38 = fArr2[i8 + 2];
                    if (fArr2[i8 + 3] != 0.0f) {
                        f6 = 0.0f;
                        z8 = z7;
                    } else {
                        f6 = 0.0f;
                        z8 = z6;
                    }
                    drawArc(path, f32, f33, f34, f35, f36, f37, f38, z8, fArr2[i8 + 4] != f6 ? z7 : z6);
                    f24 = fArr2[i10];
                    f28 = f24;
                    f25 = fArr2[i11];
                    f29 = f25;
                } else if (c8 == 'C') {
                    z6 = z10;
                    z7 = z11;
                    c9 = c11;
                    c10 = c12;
                    i8 = i9;
                    int i12 = i8 + 2;
                    int i13 = i8 + 3;
                    int i14 = i8 + 4;
                    int i15 = i8 + 5;
                    path2.cubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                    float f39 = fArr2[i14];
                    float f40 = fArr2[i15];
                    float f41 = fArr2[i12];
                    float f42 = fArr2[i13];
                    f28 = f39;
                    f29 = f40;
                    f25 = f42;
                    f24 = f41;
                } else if (c8 != 'H') {
                    if (c8 != 'Q') {
                        z6 = z10;
                        if (c8 == 'V') {
                            z7 = z11;
                            c9 = c11;
                            c10 = c12;
                            i8 = i9;
                            path2.lineTo(f28, fArr2[i8]);
                            f9 = fArr2[i8];
                        } else if (c8 != 'a') {
                            if (c8 != 'c') {
                                z7 = z11;
                                if (c8 != 'h') {
                                    if (c8 != 'q') {
                                        c9 = c11;
                                        if (c8 != 'v') {
                                            if (c8 != 'L') {
                                                if (c8 != 'M') {
                                                    c10 = c12;
                                                    if (c8 == 'S') {
                                                        if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                            f28 = (f28 * 2.0f) - f24;
                                                            f29 = (f29 * 2.0f) - f25;
                                                        }
                                                        float f43 = f28;
                                                        float f44 = f29;
                                                        int i16 = i9 + 1;
                                                        int i17 = i9 + 2;
                                                        int i18 = i9 + 3;
                                                        path2.cubicTo(f43, f44, fArr2[i9], fArr2[i16], fArr2[i17], fArr2[i18]);
                                                        f7 = fArr2[i9];
                                                        f8 = fArr2[i16];
                                                        f28 = fArr2[i17];
                                                        f29 = fArr2[i18];
                                                        i8 = i9;
                                                    } else if (c8 == 'T') {
                                                        if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                            f28 = (f28 * 2.0f) - f24;
                                                            f29 = (f29 * 2.0f) - f25;
                                                        }
                                                        int i19 = i9 + 1;
                                                        path2.quadTo(f28, f29, fArr2[i9], fArr2[i19]);
                                                        float f45 = fArr2[i9];
                                                        f9 = fArr2[i19];
                                                        f24 = f28;
                                                        f25 = f29;
                                                        i8 = i9;
                                                        f28 = f45;
                                                    } else if (c8 == 'l') {
                                                        int i20 = i9 + 1;
                                                        path2.rLineTo(fArr2[i9], fArr2[i20]);
                                                        f28 += fArr2[i9];
                                                        f15 = fArr2[i20];
                                                    } else if (c8 == 'm') {
                                                        float f46 = fArr2[i9];
                                                        f28 += f46;
                                                        float f47 = fArr2[i9 + 1];
                                                        f29 += f47;
                                                        if (i9 > 0) {
                                                            path2.rLineTo(f46, f47);
                                                        } else {
                                                            path2.rMoveTo(f46, f47);
                                                            f30 = f28;
                                                        }
                                                    } else if (c8 == 's') {
                                                        if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                            f18 = f29 - f25;
                                                            f19 = f28 - f24;
                                                        } else {
                                                            f19 = 0.0f;
                                                            f18 = 0.0f;
                                                        }
                                                        int i21 = i9 + 1;
                                                        int i22 = i9 + 2;
                                                        int i23 = i9 + 3;
                                                        path2.rCubicTo(f19, f18, fArr2[i9], fArr2[i21], fArr2[i22], fArr2[i23]);
                                                        f12 = fArr2[i9] + f28;
                                                        f13 = fArr2[i21] + f29;
                                                        f28 += fArr2[i22];
                                                        f14 = fArr2[i23];
                                                    } else if (c8 == 't') {
                                                        if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                            f20 = f28 - f24;
                                                            f21 = f29 - f25;
                                                        } else {
                                                            f21 = 0.0f;
                                                            f20 = 0.0f;
                                                        }
                                                        int i24 = i9 + 1;
                                                        path2.rQuadTo(f20, f21, fArr2[i9], fArr2[i24]);
                                                        float f48 = f20 + f28;
                                                        float f49 = f21 + f29;
                                                        f28 += fArr2[i9];
                                                        f29 += fArr2[i24];
                                                        f25 = f49;
                                                        f24 = f48;
                                                    }
                                                } else {
                                                    c10 = c12;
                                                    f16 = fArr2[i9];
                                                    f17 = fArr2[i9 + 1];
                                                    if (i9 > 0) {
                                                        path2.lineTo(f16, f17);
                                                    } else {
                                                        path2.moveTo(f16, f17);
                                                        f28 = f16;
                                                        f30 = f28;
                                                        f29 = f17;
                                                    }
                                                }
                                                f31 = f29;
                                            } else {
                                                c10 = c12;
                                                int i25 = i9 + 1;
                                                path2.lineTo(fArr2[i9], fArr2[i25]);
                                                f16 = fArr2[i9];
                                                f17 = fArr2[i25];
                                            }
                                            f28 = f16;
                                            f29 = f17;
                                        } else {
                                            c10 = c12;
                                            path2.rLineTo(0.0f, fArr2[i9]);
                                            f15 = fArr2[i9];
                                        }
                                        f29 += f15;
                                    } else {
                                        c9 = c11;
                                        c10 = c12;
                                        int i26 = i9 + 1;
                                        int i27 = i9 + 2;
                                        int i28 = i9 + 3;
                                        path2.rQuadTo(fArr2[i9], fArr2[i26], fArr2[i27], fArr2[i28]);
                                        f12 = fArr2[i9] + f28;
                                        f13 = fArr2[i26] + f29;
                                        f28 += fArr2[i27];
                                        f14 = fArr2[i28];
                                    }
                                    f29 += f14;
                                    f24 = f12;
                                    f25 = f13;
                                } else {
                                    c9 = c11;
                                    c10 = c12;
                                    path2.rLineTo(fArr2[i9], 0.0f);
                                    f28 += fArr2[i9];
                                }
                            } else {
                                z7 = z11;
                                c9 = c11;
                                c10 = c12;
                                int i29 = i9 + 2;
                                int i30 = i9 + 3;
                                int i31 = i9 + 4;
                                int i32 = i9 + 5;
                                path2.rCubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                float f50 = fArr2[i29] + f28;
                                float f51 = fArr2[i30] + f29;
                                f28 += fArr2[i31];
                                f29 += fArr2[i32];
                                f24 = f50;
                                f25 = f51;
                            }
                            i8 = i9;
                        } else {
                            z7 = z11;
                            c9 = c11;
                            c10 = c12;
                            int i33 = i9 + 5;
                            float f52 = fArr2[i33] + f28;
                            int i34 = i9 + 6;
                            float f53 = fArr2[i34] + f29;
                            float f54 = fArr2[i9];
                            float f55 = fArr2[i9 + 1];
                            float f56 = fArr2[i9 + 2];
                            if (fArr2[i9 + 3] != 0.0f) {
                                f10 = 0.0f;
                                f11 = f29;
                                z9 = z7;
                            } else {
                                f10 = 0.0f;
                                f11 = f29;
                                z9 = z6;
                            }
                            i8 = i9;
                            boolean z12 = fArr2[i9 + 4] != f10 ? z7 : z6;
                            float f57 = f28;
                            drawArc(path, f57, f11, f52, f53, f54, f55, f56, z9, z12);
                            f28 = f57 + fArr2[i33];
                            f29 = f11 + fArr2[i34];
                            f24 = f28;
                            f25 = f29;
                        }
                        f29 = f9;
                    } else {
                        z6 = z10;
                        z7 = z11;
                        c9 = c11;
                        c10 = c12;
                        i8 = i9;
                        int i35 = i8 + 1;
                        int i36 = i8 + 2;
                        int i37 = i8 + 3;
                        path2.quadTo(fArr2[i8], fArr2[i35], fArr2[i36], fArr2[i37]);
                        f7 = fArr2[i8];
                        f8 = fArr2[i35];
                        f28 = fArr2[i36];
                        f29 = fArr2[i37];
                    }
                    f24 = f7;
                    f25 = f8;
                } else {
                    z6 = z10;
                    z7 = z11;
                    c9 = c11;
                    c10 = c12;
                    i8 = i9;
                    path2.lineTo(fArr2[i8], f29);
                    f28 = fArr2[i8];
                }
                i9 = i8 + i7;
                path2 = path;
                c13 = c8;
                z10 = z6;
                z11 = z7;
                c11 = c9;
                c12 = c10;
            }
            fArr[z10 ? 1 : 0] = f28;
            fArr[z11 ? 1 : 0] = f29;
            fArr[c11] = f24;
            fArr[c12] = f25;
            fArr[4] = f30;
            fArr[5] = f31;
        }

        private static void arcToBezier(Path path, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
            double d15 = d8;
            int iCeil = (int) Math.ceil(Math.abs((d14 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d12);
            double dSin = Math.sin(d12);
            double dCos2 = Math.cos(d13);
            double dSin2 = Math.sin(d13);
            double d16 = -d15;
            double d17 = d16 * dCos;
            double d18 = d9 * dSin;
            double d19 = (d17 * dSin2) - (d18 * dCos2);
            double d20 = d16 * dSin;
            double d21 = d9 * dCos;
            double d22 = (dSin2 * d20) + (dCos2 * d21);
            double d23 = d14 / iCeil;
            double d24 = d22;
            double d25 = d19;
            int i6 = 0;
            double d26 = d10;
            double d27 = d11;
            double d28 = d13;
            while (i6 < iCeil) {
                double d29 = d28 + d23;
                double dSin3 = Math.sin(d29);
                double dCos3 = Math.cos(d29);
                double d30 = (d6 + ((d15 * dCos) * dCos3)) - (d18 * dSin3);
                int i7 = i6;
                double d31 = d7 + (d8 * dSin * dCos3) + (d21 * dSin3);
                double d32 = (d17 * dSin3) - (d18 * dCos3);
                double d33 = (dSin3 * d20) + (dCos3 * d21);
                double d34 = d29 - d28;
                double dTan = Math.tan(d34 / 2.0d);
                double dSin4 = (Math.sin(d34) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d35 = d26 + (d25 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d35, (float) (d27 + (d24 * dSin4)), (float) (d30 - (dSin4 * d32)), (float) (d31 - (dSin4 * d33)), (float) d30, (float) d31);
                dSin = dSin;
                d23 = d23;
                d26 = d30;
                d20 = d20;
                d28 = d29;
                d24 = d33;
                dCos = dCos;
                d15 = d8;
                d27 = d31;
                i6 = i7 + 1;
                iCeil = iCeil;
                d25 = d32;
            }
        }

        private static void drawArc(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7) {
            double d6;
            double d7;
            double radians = Math.toRadians(f12);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d8 = f6;
            double d9 = f7;
            double d10 = f10;
            double d11 = ((d8 * dCos) + (d9 * dSin)) / d10;
            double d12 = f11;
            double d13 = (((-f6) * dSin) + (d9 * dCos)) / d12;
            double d14 = f9;
            double d15 = ((f8 * dCos) + (d14 * dSin)) / d10;
            double d16 = (((-f8) * dSin) + (d14 * dCos)) / d12;
            double d17 = d11 - d15;
            double d18 = d13 - d16;
            double d19 = (d11 + d15) / 2.0d;
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
                drawArc(path, f6, f7, f8, f9, f10 * fSqrt, fSqrt * f11, f12, z6, z7);
                return;
            }
            double dSqrt = Math.sqrt(d22);
            double d23 = d17 * dSqrt;
            double d24 = dSqrt * d18;
            if (z6 == z7) {
                d6 = d19 - d24;
                d7 = d20 + d23;
            } else {
                d6 = d19 + d24;
                d7 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d13 - d7, d11 - d6);
            double dAtan22 = Math.atan2(d16 - d7, d15 - d6) - dAtan2;
            if (z7 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d6 * d10;
            double d26 = d7 * d12;
            arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d10, d12, d8, d9, radians, dAtan2, dAtan22);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f6) {
            this.mType = pathDataNode.mType;
            int i6 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i6 >= fArr.length) {
                    return;
                }
                this.mParams[i6] = (fArr[i6] * (1.0f - f6)) + (pathDataNode2.mParams[i6] * f6);
                i6++;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f6) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i6 = 0; i6 < pathDataNodeArr.length; i6++) {
                pathDataNodeArr[i6].interpolatePathDataNode(pathDataNodeArr2[i6], pathDataNodeArr3[i6], f6);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
