package androidx.compose.p006ui.graphics.colorspace;

import androidx.compose.p006ui.graphics.colorspace.ColorModel;
import androidx.compose.p006ui.graphics.colorspace.Connector;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a8\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a+\u0010)\u001a\u00020**\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020-ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m5175d2 = {"absRcpResponse", "", "x", C3335ai.f1705at, "b", C3335ai.f1663aD, "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d4, double d5, double d6, double d7, double d8, double d9) {
        return Math.copySign(rcpResponse(d4 < 0.0d ? -d4 : d4, d5, d6, d7, d8, d9), d4);
    }

    public static final double absResponse(double d4, double d5, double d6, double d7, double d8, double d9) {
        return Math.copySign(response(d4 < 0.0d ? -d4 : d4, d5, d6, d7, d8, d9), d4);
    }

    @JvmOverloads
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] fArrMul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] fArrMul3x3Float32 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(TransferParameters a4, TransferParameters transferParameters) {
        Intrinsics.checkNotNullParameter(a4, "a");
        return transferParameters != null && Math.abs(a4.getA() - transferParameters.getA()) < 0.001d && Math.abs(a4.getB() - transferParameters.getB()) < 0.001d && Math.abs(a4.getC() - transferParameters.getC()) < 0.001d && Math.abs(a4.getD() - transferParameters.getD()) < 0.002d && Math.abs(a4.getE() - transferParameters.getE()) < 0.001d && Math.abs(a4.getF() - transferParameters.getF()) < 0.001d && Math.abs(a4.getGamma() - transferParameters.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m9566connectYBCOT_4(ColorSpace connect, ColorSpace destination, int i4) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (connect == colorSpaces.getSrgb()) {
            if (destination == colorSpaces.getSrgb()) {
                return Connector.INSTANCE.getSrgbIdentity$ui_graphics_release();
            }
            if (destination == colorSpaces.getOklab() && RenderIntent.m9576equalsimpl0(i4, RenderIntent.INSTANCE.m9581getPerceptualuksYyKA())) {
                return Connector.INSTANCE.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (connect == colorSpaces.getOklab() && destination == colorSpaces.getSrgb() && RenderIntent.m9576equalsimpl0(i4, RenderIntent.INSTANCE.m9581getPerceptualuksYyKA())) {
            return Connector.INSTANCE.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (connect == destination) {
            return Connector.INSTANCE.identity$ui_graphics_release(connect);
        }
        long jM9564getModelxdoWZVw = connect.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return (ColorModel.m9555equalsimpl0(jM9564getModelxdoWZVw, companion.m9562getRgbxdoWZVw()) && ColorModel.m9555equalsimpl0(destination.getModel(), companion.m9562getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) connect, (Rgb) destination, i4, defaultConstructorMarker) : new Connector(connect, destination, i4, defaultConstructorMarker);
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m9567connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i5 & 2) != 0) {
            i4 = RenderIntent.INSTANCE.m9581getPerceptualuksYyKA();
        }
        return m9566connectYBCOT_4(colorSpace, colorSpace2, i4);
    }

    public static final float[] inverse3x3(float[] m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        float f4 = m4[0];
        float f5 = m4[3];
        float f6 = m4[6];
        float f7 = m4[1];
        float f8 = m4[4];
        float f9 = m4[7];
        float f10 = m4[2];
        float f11 = m4[5];
        float f12 = m4[8];
        float f13 = (f8 * f12) - (f9 * f11);
        float f14 = (f9 * f10) - (f7 * f12);
        float f15 = (f7 * f11) - (f8 * f10);
        float f16 = (f4 * f13) + (f5 * f14) + (f6 * f15);
        float[] fArr = new float[m4.length];
        fArr[0] = f13 / f16;
        fArr[1] = f14 / f16;
        fArr[2] = f15 / f16;
        fArr[3] = ((f6 * f11) - (f5 * f12)) / f16;
        fArr[4] = ((f12 * f4) - (f6 * f10)) / f16;
        fArr[5] = ((f10 * f5) - (f11 * f4)) / f16;
        fArr[6] = ((f5 * f9) - (f6 * f8)) / f16;
        fArr[7] = ((f6 * f7) - (f9 * f4)) / f16;
        fArr[8] = ((f4 * f8) - (f5 * f7)) / f16;
        return fArr;
    }

    public static final float[] mul3x3(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f4 = lhs[0] * rhs[0];
        float f5 = lhs[3];
        float f6 = rhs[1];
        float f7 = lhs[6];
        float f8 = rhs[2];
        float f9 = lhs[1];
        float f10 = rhs[0];
        float f11 = lhs[4];
        float f12 = lhs[7];
        float f13 = lhs[2] * f10;
        float f14 = lhs[5];
        float f15 = f13 + (rhs[1] * f14);
        float f16 = lhs[8];
        float f17 = lhs[0];
        float f18 = rhs[3] * f17;
        float f19 = rhs[4];
        float f20 = f18 + (f5 * f19);
        float f21 = rhs[5];
        float f22 = lhs[1];
        float f23 = rhs[3];
        float f24 = lhs[2];
        float f25 = f17 * rhs[6];
        float f26 = lhs[3];
        float f27 = rhs[7];
        float f28 = f25 + (f26 * f27);
        float f29 = rhs[8];
        float f30 = rhs[6];
        return new float[]{f4 + (f5 * f6) + (f7 * f8), (f9 * f10) + (f6 * f11) + (f12 * f8), f15 + (f8 * f16), f20 + (f7 * f21), (f22 * f23) + (f11 * f19) + (f12 * f21), (f23 * f24) + (f14 * rhs[4]) + (f21 * f16), f28 + (f7 * f29), (f22 * f30) + (lhs[4] * f27) + (f12 * f29), (f24 * f30) + (lhs[5] * rhs[7]) + (f16 * f29)};
    }

    public static final float[] mul3x3Diag(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f4 = lhs[0];
        float f5 = lhs[1];
        float f6 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f4, rhs[4] * f5, rhs[5] * f6, f4 * rhs[6], f5 * rhs[7], f6 * rhs[8]};
    }

    public static final float[] mul3x3Float3(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f4 = rhs[0];
        float f5 = rhs[1];
        float f6 = rhs[2];
        rhs[0] = (lhs[0] * f4) + (lhs[3] * f5) + (lhs[6] * f6);
        rhs[1] = (lhs[1] * f4) + (lhs[4] * f5) + (lhs[7] * f6);
        rhs[2] = (lhs[2] * f4) + (lhs[5] * f5) + (lhs[8] * f6);
        return rhs;
    }

    public static final float mul3x3Float3_0(float[] lhs, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[0] * f4) + (lhs[3] * f5) + (lhs[6] * f6);
    }

    public static final float mul3x3Float3_1(float[] lhs, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[1] * f4) + (lhs[4] * f5) + (lhs[7] * f6);
    }

    public static final float mul3x3Float3_2(float[] lhs, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[2] * f4) + (lhs[5] * f5) + (lhs[8] * f6);
    }

    public static final double rcpResponse(double d4, double d5, double d6, double d7, double d8, double d9) {
        return d4 >= d8 * d7 ? (Math.pow(d4, 1.0d / d9) - d6) / d5 : d4 / d7;
    }

    public static final double response(double d4, double d5, double d6, double d7, double d8, double d9) {
        return d4 >= d8 ? Math.pow((d5 * d4) + d6, d9) : d4 * d7;
    }

    @JvmOverloads
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (!ColorModel.m9555equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m9562getRgbxdoWZVw())) {
            return colorSpace;
        }
        Rgb rgb = (Rgb) colorSpace;
        if (compare(rgb.getWhitePoint(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
    }

    public static final double rcpResponse(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        return d4 >= d8 * d7 ? (Math.pow(d4 - d9, 1.0d / d11) - d6) / d5 : (d4 - d10) / d7;
    }

    public static final double response(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        return d4 >= d8 ? Math.pow((d5 * d4) + d6, d11) + d9 : (d7 * d4) + d10;
    }

    public static final boolean compare(WhitePoint a4, WhitePoint b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        if (a4 == b4) {
            return true;
        }
        return Math.abs(a4.getX() - b4.getX()) < 0.001f && Math.abs(a4.getY() - b4.getY()) < 0.001f;
    }

    public static final boolean compare(float[] a4, float[] b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        if (a4 == b4) {
            return true;
        }
        int length = a4.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (Float.compare(a4[i4], b4[i4]) != 0 && Math.abs(a4[i4] - b4[i4]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
