package androidx.core.graphics;

import android.graphics.Path;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
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

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i, int i8) {
        if (i > i8) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = i8 - i;
        int iMin = Math.min(i9, length - i);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i8 = 1;
        while (i8 < str.length()) {
            int iNextStart = nextStart(str, i8);
            String strTrim = str.substring(i, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i = iNextStart;
            i8 = iNextStart + 1;
        }
        if (i8 - i == 1 && i < str.length()) {
            addNode(arrayList, str.charAt(i), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AbstractC0037f.m85j("Error in parsing ", str), e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
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
            int i = 1;
            int i8 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i9 = extractFloatResult.mEndPosition;
                if (i < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i, i9));
                    i8++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i9 : i9 + 1;
            }
            return copyOfRange(fArr, 0, i8);
        } catch (NumberFormatException e) {
            throw new RuntimeException(AbstractC0037f.m86k("error in parsing \"", str, "\""), e);
        }
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                    continue;
                }
                i++;
            }
            if (cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
            c = pathDataNode.mType;
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i8 = 0; i8 < pathDataNodeArr2[i].mParams.length; i8++) {
                pathDataNodeArr[i].mParams[i8] = pathDataNodeArr2[i].mParams[i8];
            }
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c, char c9, float[] fArr2) {
            int i;
            int i8;
            boolean z8;
            boolean z9;
            char c10;
            char c11;
            int i9;
            float f;
            boolean z10;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            boolean z11;
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
            boolean z12 = false;
            float f22 = fArr[0];
            boolean z13 = true;
            float f23 = fArr[1];
            char c12 = 2;
            float f24 = fArr[2];
            char c13 = 3;
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c9) {
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case 'a':
                    i = 7;
                    i8 = i;
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 'c':
                    i = 6;
                    i8 = i;
                    break;
                case 'H':
                case 'V':
                case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    i8 = 2;
                    break;
            }
            float f28 = f22;
            float f29 = f23;
            float f30 = f26;
            float f31 = f27;
            int i10 = 0;
            char c14 = c;
            while (i10 < fArr2.length) {
                if (c9 == 'A') {
                    float f32 = f28;
                    float f33 = f29;
                    z8 = z12;
                    z9 = z13;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    int i11 = i9 + 5;
                    float f34 = fArr2[i11];
                    int i12 = i9 + 6;
                    float f35 = fArr2[i12];
                    float f36 = fArr2[i9];
                    float f37 = fArr2[i9 + 1];
                    float f38 = fArr2[i9 + 2];
                    if (fArr2[i9 + 3] != 0.0f) {
                        f = 0.0f;
                        z10 = z9;
                    } else {
                        f = 0.0f;
                        z10 = z8;
                    }
                    drawArc(path, f32, f33, f34, f35, f36, f37, f38, z10, fArr2[i9 + 4] != f ? z9 : z8);
                    f24 = fArr2[i11];
                    f28 = f24;
                    f25 = fArr2[i12];
                    f29 = f25;
                } else if (c9 == 'C') {
                    z8 = z12;
                    z9 = z13;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    int i13 = i9 + 2;
                    int i14 = i9 + 3;
                    int i15 = i9 + 4;
                    int i16 = i9 + 5;
                    path2.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                    float f39 = fArr2[i15];
                    float f40 = fArr2[i16];
                    float f41 = fArr2[i13];
                    float f42 = fArr2[i14];
                    f28 = f39;
                    f29 = f40;
                    f25 = f42;
                    f24 = f41;
                } else if (c9 != 'H') {
                    if (c9 != 'Q') {
                        z8 = z12;
                        if (c9 == 'V') {
                            z9 = z13;
                            c10 = c12;
                            c11 = c13;
                            i9 = i10;
                            path2.lineTo(f28, fArr2[i9]);
                            f9 = fArr2[i9];
                        } else if (c9 != 'a') {
                            if (c9 != 'c') {
                                z9 = z13;
                                if (c9 != 'h') {
                                    if (c9 != 'q') {
                                        c10 = c12;
                                        if (c9 != 'v') {
                                            if (c9 != 'L') {
                                                if (c9 != 'M') {
                                                    c11 = c13;
                                                    if (c9 == 'S') {
                                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                            f28 = (f28 * 2.0f) - f24;
                                                            f29 = (f29 * 2.0f) - f25;
                                                        }
                                                        float f43 = f28;
                                                        float f44 = f29;
                                                        int i17 = i10 + 1;
                                                        int i18 = i10 + 2;
                                                        int i19 = i10 + 3;
                                                        path2.cubicTo(f43, f44, fArr2[i10], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                        f7 = fArr2[i10];
                                                        f8 = fArr2[i17];
                                                        f28 = fArr2[i18];
                                                        f29 = fArr2[i19];
                                                        i9 = i10;
                                                    } else if (c9 == 'T') {
                                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                            f28 = (f28 * 2.0f) - f24;
                                                            f29 = (f29 * 2.0f) - f25;
                                                        }
                                                        int i20 = i10 + 1;
                                                        path2.quadTo(f28, f29, fArr2[i10], fArr2[i20]);
                                                        float f45 = fArr2[i10];
                                                        f9 = fArr2[i20];
                                                        f24 = f28;
                                                        f25 = f29;
                                                        i9 = i10;
                                                        f28 = f45;
                                                    } else if (c9 == 'l') {
                                                        int i21 = i10 + 1;
                                                        path2.rLineTo(fArr2[i10], fArr2[i21]);
                                                        f28 += fArr2[i10];
                                                        f15 = fArr2[i21];
                                                    } else if (c9 == 'm') {
                                                        float f46 = fArr2[i10];
                                                        f28 += f46;
                                                        float f47 = fArr2[i10 + 1];
                                                        f29 += f47;
                                                        if (i10 > 0) {
                                                            path2.rLineTo(f46, f47);
                                                        } else {
                                                            path2.rMoveTo(f46, f47);
                                                            f30 = f28;
                                                        }
                                                    } else if (c9 == 's') {
                                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                            f18 = f29 - f25;
                                                            f19 = f28 - f24;
                                                        } else {
                                                            f19 = 0.0f;
                                                            f18 = 0.0f;
                                                        }
                                                        int i22 = i10 + 1;
                                                        int i23 = i10 + 2;
                                                        int i24 = i10 + 3;
                                                        path2.rCubicTo(f19, f18, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f12 = fArr2[i10] + f28;
                                                        f13 = fArr2[i22] + f29;
                                                        f28 += fArr2[i23];
                                                        f14 = fArr2[i24];
                                                    } else if (c9 == 't') {
                                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                            f20 = f28 - f24;
                                                            f21 = f29 - f25;
                                                        } else {
                                                            f21 = 0.0f;
                                                            f20 = 0.0f;
                                                        }
                                                        int i25 = i10 + 1;
                                                        path2.rQuadTo(f20, f21, fArr2[i10], fArr2[i25]);
                                                        float f48 = f20 + f28;
                                                        float f49 = f21 + f29;
                                                        f28 += fArr2[i10];
                                                        f29 += fArr2[i25];
                                                        f25 = f49;
                                                        f24 = f48;
                                                    }
                                                } else {
                                                    c11 = c13;
                                                    f16 = fArr2[i10];
                                                    f17 = fArr2[i10 + 1];
                                                    if (i10 > 0) {
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
                                                c11 = c13;
                                                int i26 = i10 + 1;
                                                path2.lineTo(fArr2[i10], fArr2[i26]);
                                                f16 = fArr2[i10];
                                                f17 = fArr2[i26];
                                            }
                                            f28 = f16;
                                            f29 = f17;
                                        } else {
                                            c11 = c13;
                                            path2.rLineTo(0.0f, fArr2[i10]);
                                            f15 = fArr2[i10];
                                        }
                                        f29 += f15;
                                    } else {
                                        c10 = c12;
                                        c11 = c13;
                                        int i27 = i10 + 1;
                                        int i28 = i10 + 2;
                                        int i29 = i10 + 3;
                                        path2.rQuadTo(fArr2[i10], fArr2[i27], fArr2[i28], fArr2[i29]);
                                        f12 = fArr2[i10] + f28;
                                        f13 = fArr2[i27] + f29;
                                        f28 += fArr2[i28];
                                        f14 = fArr2[i29];
                                    }
                                    f29 += f14;
                                    f24 = f12;
                                    f25 = f13;
                                } else {
                                    c10 = c12;
                                    c11 = c13;
                                    path2.rLineTo(fArr2[i10], 0.0f);
                                    f28 += fArr2[i10];
                                }
                            } else {
                                z9 = z13;
                                c10 = c12;
                                c11 = c13;
                                int i30 = i10 + 2;
                                int i31 = i10 + 3;
                                int i32 = i10 + 4;
                                int i33 = i10 + 5;
                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                float f50 = fArr2[i30] + f28;
                                float f51 = fArr2[i31] + f29;
                                f28 += fArr2[i32];
                                f29 += fArr2[i33];
                                f24 = f50;
                                f25 = f51;
                            }
                            i9 = i10;
                        } else {
                            z9 = z13;
                            c10 = c12;
                            c11 = c13;
                            int i34 = i10 + 5;
                            float f52 = fArr2[i34] + f28;
                            int i35 = i10 + 6;
                            float f53 = fArr2[i35] + f29;
                            float f54 = fArr2[i10];
                            float f55 = fArr2[i10 + 1];
                            float f56 = fArr2[i10 + 2];
                            if (fArr2[i10 + 3] != 0.0f) {
                                f10 = 0.0f;
                                f11 = f29;
                                z11 = z9;
                            } else {
                                f10 = 0.0f;
                                f11 = f29;
                                z11 = z8;
                            }
                            i9 = i10;
                            boolean z14 = fArr2[i10 + 4] != f10 ? z9 : z8;
                            float f57 = f28;
                            drawArc(path, f57, f11, f52, f53, f54, f55, f56, z11, z14);
                            f28 = f57 + fArr2[i34];
                            f29 = f11 + fArr2[i35];
                            f24 = f28;
                            f25 = f29;
                        }
                        f29 = f9;
                    } else {
                        z8 = z12;
                        z9 = z13;
                        c10 = c12;
                        c11 = c13;
                        i9 = i10;
                        int i36 = i9 + 1;
                        int i37 = i9 + 2;
                        int i38 = i9 + 3;
                        path2.quadTo(fArr2[i9], fArr2[i36], fArr2[i37], fArr2[i38]);
                        f7 = fArr2[i9];
                        f8 = fArr2[i36];
                        f28 = fArr2[i37];
                        f29 = fArr2[i38];
                    }
                    f24 = f7;
                    f25 = f8;
                } else {
                    z8 = z12;
                    z9 = z13;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    path2.lineTo(fArr2[i9], f29);
                    f28 = fArr2[i9];
                }
                i10 = i9 + i8;
                path2 = path;
                c14 = c9;
                z12 = z8;
                z13 = z9;
                c12 = c10;
                c13 = c11;
            }
            fArr[z12 ? 1 : 0] = f28;
            fArr[z13 ? 1 : 0] = f29;
            fArr[c12] = f24;
            fArr[c13] = f25;
            fArr[4] = f30;
            fArr[5] = f31;
        }

        private static void arcToBezier(Path path, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
            double d18 = d11;
            int iCeil = (int) Math.ceil(Math.abs((d17 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d15);
            double dSin = Math.sin(d15);
            double dCos2 = Math.cos(d16);
            double dSin2 = Math.sin(d16);
            double d19 = -d18;
            double d20 = d19 * dCos;
            double d21 = d12 * dSin;
            double d22 = (d20 * dSin2) - (d21 * dCos2);
            double d23 = d19 * dSin;
            double d24 = d12 * dCos;
            double d25 = (dCos2 * d24) + (dSin2 * d23);
            double d26 = d17 / iCeil;
            double d27 = d25;
            double d28 = d22;
            int i = 0;
            double d29 = d13;
            double d30 = d14;
            double d31 = d16;
            while (i < iCeil) {
                double d32 = d31 + d26;
                double dSin3 = Math.sin(d32);
                double dCos3 = Math.cos(d32);
                double d33 = (((d18 * dCos) * dCos3) + d9) - (d21 * dSin3);
                int i8 = i;
                double d34 = (d24 * dSin3) + (d11 * dSin * dCos3) + d10;
                double d35 = (d20 * dSin3) - (d21 * dCos3);
                double d36 = (dCos3 * d24) + (dSin3 * d23);
                double d37 = d32 - d31;
                double dTan = Math.tan(d37 / 2.0d);
                double dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d37)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d28 * dSqrt) + d29), (float) ((d27 * dSqrt) + d30), (float) (d33 - (dSqrt * d35)), (float) (d34 - (dSqrt * d36)), (float) d33, (float) d34);
                dSin = dSin;
                d26 = d26;
                d29 = d33;
                d23 = d23;
                dCos = dCos;
                d27 = d36;
                d28 = d35;
                d18 = d11;
                d30 = d34;
                i = i8 + 1;
                iCeil = iCeil;
                d31 = d32;
            }
        }

        private static void drawArc(Path path, float f, float f7, float f8, float f9, float f10, float f11, float f12, boolean z8, boolean z9) {
            double d9;
            double d10;
            double radians = Math.toRadians(f12);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d11 = f;
            double d12 = f7;
            double d13 = f10;
            double d14 = ((d12 * dSin) + (d11 * dCos)) / d13;
            double d15 = f11;
            double d16 = ((d12 * dCos) + ((-f) * dSin)) / d15;
            double d17 = f9;
            double d18 = ((d17 * dSin) + (f8 * dCos)) / d13;
            double d19 = ((d17 * dCos) + ((-f8) * dSin)) / d15;
            double d20 = d14 - d18;
            double d21 = d16 - d19;
            double d22 = (d14 + d18) / 2.0d;
            double d23 = (d16 + d19) / 2.0d;
            double d24 = (d21 * d21) + (d20 * d20);
            if (d24 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d24);
                float fSqrt = (float) (Math.sqrt(d24) / 1.99999d);
                drawArc(path, f, f7, f8, f9, f10 * fSqrt, fSqrt * f11, f12, z8, z9);
                return;
            }
            double dSqrt = Math.sqrt(d25);
            double d26 = dSqrt * d20;
            double d27 = dSqrt * d21;
            if (z8 == z9) {
                d9 = d22 - d27;
                d10 = d23 + d26;
            } else {
                d9 = d22 + d27;
                d10 = d23 - d26;
            }
            double dAtan2 = Math.atan2(d16 - d10, d14 - d9);
            double dAtan22 = Math.atan2(d19 - d10, d18 - d9) - dAtan2;
            if (z9 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan22 = dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d28 = d9 * d13;
            double d29 = d10 * d15;
            arcToBezier(path, (d28 * dCos) - (d29 * dSin), (d29 * dCos) + (d28 * dSin), d13, d15, d11, d12, radians, dAtan2, dAtan22);
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

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i >= fArr.length) {
                    return;
                }
                this.mParams[i] = (pathDataNode2.mParams[i] * f) + ((1.0f - f) * fArr[i]);
                i++;
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
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
