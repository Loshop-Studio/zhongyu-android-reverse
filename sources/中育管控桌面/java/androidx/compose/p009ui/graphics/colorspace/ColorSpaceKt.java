package androidx.compose.p009ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.p009ui.graphics.colorspace.ColorModel;
import androidx.compose.p009ui.graphics.colorspace.Connector;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000\u001a\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a)\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010'\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010(\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a8\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010-\u001a\u00020\u0015*\u00020\u00152\u0006\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u000200H\u0007\u001a(\u00101\u001a\u00020\u0013*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m7880d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "createConnector", "Landroidx/compose/ui/graphics/colorspace/Connector;", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "connect-YBCOT_4", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n326#2:718\n679#3:719\n1#4:720\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n401#1:718\n401#1:719\n401#1:720\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d6, double d7, double d8, double d9, double d10, double d11) {
        return Math.copySign(rcpResponse(d6 < 0.0d ? -d6 : d6, d7, d8, d9, d10, d11), d6);
    }

    public static final double absResponse(double d6, double d7, double d8, double d9, double d10, double d11) {
        return Math.copySign(response(d6 < 0.0d ? -d6 : d6, d7, d8, d9, d10, d11), d6);
    }

    @JvmOverloads
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m14317connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i6) {
        int id$ui_graphics_release = colorSpace.getId();
        int id$ui_graphics_release2 = colorSpace2.getId();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m14319createConnectorYBCOT_4(colorSpace, colorSpace2, i6);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i7 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i6 << 12);
        Connector connectorM14319createConnectorYBCOT_4 = connectors.get(i7);
        if (connectorM14319createConnectorYBCOT_4 == null) {
            connectorM14319createConnectorYBCOT_4 = m14319createConnectorYBCOT_4(colorSpace, colorSpace2, i6);
            connectors.set(i7, connectorM14319createConnectorYBCOT_4);
        }
        return connectorM14319createConnectorYBCOT_4;
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m14318connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i7 & 2) != 0) {
            i6 = RenderIntent.INSTANCE.m14334getPerceptualuksYyKA();
        }
        return m14317connectYBCOT_4(colorSpace, colorSpace2, i6);
    }

    /* renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m14319createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i6) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.identity$ui_graphics_release(colorSpace);
        }
        long jM14315getModelxdoWZVw = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!ColorModel.m14306equalsimpl0(jM14315getModelxdoWZVw, companion.m14313getRgbxdoWZVw()) || !ColorModel.m14306equalsimpl0(colorSpace2.getModel(), companion.m14313getRgbxdoWZVw())) {
            return new Connector(colorSpace, colorSpace2, i6, defaultConstructorMarker);
        }
        Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.checkNotNull(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i6, defaultConstructorMarker);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[3];
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f9 * f14);
        float f17 = (f9 * f13) - (f10 * f12);
        float f18 = (f6 * f15) + (f7 * f16) + (f8 * f17);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = ((f8 * f13) - (f7 * f14)) / f18;
        fArr2[4] = ((f14 * f6) - (f8 * f12)) / f18;
        fArr2[5] = ((f12 * f7) - (f13 * f6)) / f18;
        fArr2[6] = ((f7 * f11) - (f8 * f10)) / f18;
        fArr2[7] = ((f8 * f9) - (f11 * f6)) / f18;
        fArr2[8] = ((f6 * f10) - (f7 * f9)) / f18;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f6 = fArr[0] * fArr2[0];
        float f7 = fArr[3];
        float f8 = fArr2[1];
        float f9 = fArr[6];
        float f10 = fArr2[2];
        fArr3[0] = f6 + (f7 * f8) + (f9 * f10);
        float f11 = fArr[1];
        float f12 = fArr2[0];
        float f13 = fArr[4];
        float f14 = fArr[7];
        fArr3[1] = (f11 * f12) + (f8 * f13) + (f14 * f10);
        float f15 = fArr[2] * f12;
        float f16 = fArr[5];
        float f17 = f15 + (fArr2[1] * f16);
        float f18 = fArr[8];
        fArr3[2] = f17 + (f10 * f18);
        float f19 = fArr[0];
        float f20 = fArr2[3] * f19;
        float f21 = fArr2[4];
        float f22 = f20 + (f7 * f21);
        float f23 = fArr2[5];
        fArr3[3] = f22 + (f9 * f23);
        float f24 = fArr[1];
        float f25 = fArr2[3];
        fArr3[4] = (f24 * f25) + (f13 * f21) + (f14 * f23);
        float f26 = fArr[2];
        fArr3[5] = (f25 * f26) + (f16 * fArr2[4]) + (f23 * f18);
        float f27 = f19 * fArr2[6];
        float f28 = fArr[3];
        float f29 = fArr2[7];
        float f30 = f27 + (f28 * f29);
        float f31 = fArr2[8];
        fArr3[6] = f30 + (f9 * f31);
        float f32 = fArr2[6];
        fArr3[7] = (f24 * f32) + (fArr[4] * f29) + (f14 * f31);
        fArr3[8] = (f26 * f32) + (fArr[5] * fArr2[7]) + (f18 * f31);
        return fArr3;
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f7 = fArr2[0] * f6;
        float f8 = fArr[1];
        float f9 = fArr2[1] * f8;
        float f10 = fArr[2];
        return new float[]{f7, f9, fArr2[2] * f10, fArr2[3] * f6, fArr2[4] * f8, fArr2[5] * f10, f6 * fArr2[6], f8 * fArr2[7], f10 * fArr2[8]};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f6 = fArr2[0];
        float f7 = fArr2[1];
        float f8 = fArr2[2];
        fArr2[0] = (fArr[0] * f6) + (fArr[3] * f7) + (fArr[6] * f8);
        fArr2[1] = (fArr[1] * f6) + (fArr[4] * f7) + (fArr[7] * f8);
        fArr2[2] = (fArr[2] * f6) + (fArr[5] * f7) + (fArr[8] * f8);
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f6, float f7, float f8) {
        return (fArr[0] * f6) + (fArr[3] * f7) + (fArr[6] * f8);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f6, float f7, float f8) {
        return (fArr[1] * f6) + (fArr[4] * f7) + (fArr[7] * f8);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f6, float f7, float f8) {
        return (fArr[2] * f6) + (fArr[5] * f7) + (fArr[8] * f8);
    }

    public static final double rcpResponse(double d6, double d7, double d8, double d9, double d10, double d11) {
        return d6 >= d10 * d9 ? (Math.pow(d6, 1.0d / d11) - d8) / d7 : d6 / d9;
    }

    public static final double response(double d6, double d7, double d8, double d9, double d10, double d11) {
        return d6 >= d10 ? Math.pow((d7 * d6) + d8, d11) : d9 * d6;
    }

    @JvmOverloads
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m14306equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m14313getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return d6 >= d10 * d9 ? (Math.pow(d6 - d11, 1.0d / d13) - d8) / d7 : (d6 - d12) / d9;
    }

    public static final double response(double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return d6 >= d10 ? Math.pow((d7 * d6) + d8, d13) + d11 : (d9 * d6) + d12;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (Float.compare(fArr[i6], fArr2[i6]) != 0 && Math.abs(fArr[i6] - fArr2[i6]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
