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
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(26)
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @JvmStatic
    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(androidx.compose.p013ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Rgb.TransferParameters transferParametersM1295a;
        ColorSpace.Rgb rgbM1307a;
        ColorSpace colorSpaceObtainAndroidColorSpace;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
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
            AbstractC2707h2.m1311a();
            transferParametersM1295a = AbstractC2690d2.m1295a(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        } else {
            transferParametersM1295a = null;
        }
        if (transferParametersM1295a != null) {
            AbstractC2711i2.m1315a();
            rgbM1307a = AbstractC2699f2.m1303a(colorSpace.getName(), rgb.getPrimaries(), xyz$ui_graphics_release, transferParametersM1295a);
        } else {
            AbstractC2711i2.m1315a();
            String name = colorSpace.getName();
            float[] primaries = rgb.getPrimaries();
            final Function1<Double, Double> oetf = rgb.getOetf();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.p2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(oetf, d10);
                }
            };
            final Function1<Double, Double> eotf = rgb.getEotf();
            rgbM1307a = AbstractC2703g2.m1307a(name, primaries, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.q2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(eotf, d10);
                }
            }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
        }
        return AbstractC2694e1.m1298a(rgbM1307a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    @JvmStatic
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
            if (!Intrinsics.areEqual(colorSpaceObtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release())) {
                return colorSpaceObtainComposeColorSpaceFromId;
            }
        }
        if (!AbstractC2761m1.m1363a(colorSpace)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb.TransferParameters transferParameters = AbstractC2810x0.m1401a(colorSpace).getTransferParameters();
        return new Rgb(AbstractC2810x0.m1401a(colorSpace).getName(), AbstractC2810x0.m1401a(colorSpace).getPrimaries(), AbstractC2810x0.m1401a(colorSpace).getWhitePoint().length == 3 ? new WhitePoint(AbstractC2810x0.m1401a(colorSpace).getWhitePoint()[0], AbstractC2810x0.m1401a(colorSpace).getWhitePoint()[1], AbstractC2810x0.m1401a(colorSpace).getWhitePoint()[2]) : new WhitePoint(AbstractC2810x0.m1401a(colorSpace).getWhitePoint()[0], AbstractC2810x0.m1401a(colorSpace).getWhitePoint()[1]), AbstractC2810x0.m1401a(colorSpace).getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.r2
            @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.s2
            @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d10);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, AbstractC2810x0.m1401a(colorSpace).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d10) {
        return AbstractC2810x0.m1401a(colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d10) {
        return AbstractC2810x0.m1401a(colorSpace).getEotf().applyAsDouble(d10);
    }
}
