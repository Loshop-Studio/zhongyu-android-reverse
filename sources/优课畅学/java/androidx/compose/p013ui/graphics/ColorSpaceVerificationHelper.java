package androidx.compose.p013ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p013ui.graphics.colorspace.Rgb;
import androidx.compose.p013ui.graphics.colorspace.TransferParameters;
import androidx.compose.p013ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(androidx.compose.p013ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Rgb.TransferParameters transferParametersM1068a;
        ColorSpace.Rgb rgbM1080a;
        ColorSpace colorSpaceObtainAndroidColorSpace;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC9133u.m16128b(colorSpace, colorSpaces.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceObtainAndroidColorSpace = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace(colorSpace)) != null) {
            return colorSpaceObtainAndroidColorSpace;
        }
        if (!(colorSpace instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
        TransferParameters transferParameters = rgb.getTransferParameters();
        if (transferParameters != null) {
            AbstractC2736h2.m1084a();
            transferParametersM1068a = AbstractC2719d2.m1068a(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        } else {
            transferParametersM1068a = null;
        }
        if (transferParametersM1068a != null) {
            AbstractC2740i2.m1088a();
            rgbM1080a = AbstractC2728f2.m1076a(colorSpace.getName(), rgb.getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParametersM1068a);
        } else {
            AbstractC2740i2.m1088a();
            String name = colorSpace.getName();
            float[] primaries$ui_graphics_release = rgb.getPrimaries$ui_graphics_release();
            final InterfaceC10570l oetf = rgb.getOetf();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.p2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(oetf, d10);
                }
            };
            final InterfaceC10570l eotf = rgb.getEotf();
            rgbM1080a = AbstractC2732g2.m1080a(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.q2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(eotf, d10);
                }
            }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
        }
        return AbstractC2723e1.m1071a(rgbM1080a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(InterfaceC10570l interfaceC10570l, double d10) {
        return ((Number) interfaceC10570l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(InterfaceC10570l interfaceC10570l, double d10) {
        return ((Number) interfaceC10570l.invoke(Double.valueOf(d10))).doubleValue();
    }

    @RequiresApi(26)
    public static final androidx.compose.p013ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.p013ui.graphics.colorspace.ColorSpace colorSpaceObtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!AbstractC9133u.m16128b(colorSpaceObtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release())) {
                return colorSpaceObtainComposeColorSpaceFromId;
            }
        }
        if (!AbstractC2790m1.m1136a(colorSpace)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb.TransferParameters transferParameters = AbstractC2839x0.m1174a(colorSpace).getTransferParameters();
        return new Rgb(AbstractC2839x0.m1174a(colorSpace).getName(), AbstractC2839x0.m1174a(colorSpace).getPrimaries(), AbstractC2839x0.m1174a(colorSpace).getWhitePoint().length == 3 ? new WhitePoint(AbstractC2839x0.m1174a(colorSpace).getWhitePoint()[0], AbstractC2839x0.m1174a(colorSpace).getWhitePoint()[1], AbstractC2839x0.m1174a(colorSpace).getWhitePoint()[2]) : new WhitePoint(AbstractC2839x0.m1174a(colorSpace).getWhitePoint()[0], AbstractC2839x0.m1174a(colorSpace).getWhitePoint()[1]), AbstractC2839x0.m1174a(colorSpace).getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.r2
            @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.s2
            @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d10);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, AbstractC2839x0.m1174a(colorSpace).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d10) {
        return AbstractC2839x0.m1174a(colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d10) {
        return AbstractC2839x0.m1174a(colorSpace).getEotf().applyAsDouble(d10);
    }
}
