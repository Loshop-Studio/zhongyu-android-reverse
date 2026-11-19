package androidx.compose.p011ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.autofill.AbstractC2079b;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p011ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p011ui.graphics.colorspace.Rgb;
import androidx.compose.p011ui.graphics.colorspace.TransferParameters;
import androidx.compose.p011ui.graphics.colorspace.WhitePoint;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@RequiresApi(26)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelper {

    @NotNull
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @JvmStatic
    @RequiresApi(26)
    @NotNull
    public static final ColorSpace androidColorSpace(@NotNull androidx.compose.p011ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace colorSpaceObtainAndroidColorSpace;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getSmpteC())) {
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
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        if (transferParameters2 != null) {
            return new ColorSpace.Rgb(colorSpace.getName(), rgb.getPrimaries(), xyz$ui_graphics_release, transferParameters2);
        }
        String name = colorSpace.getName();
        float[] primaries = rgb.getPrimaries();
        final InterfaceC6471c oetf = rgb.getOetf();
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.f
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d9) {
                switch (i) {
                    case 0:
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(oetf, d9);
                    default:
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(oetf, d9);
                }
            }
        };
        final InterfaceC6471c eotf = rgb.getEotf();
        final int i8 = 1;
        return new ColorSpace.Rgb(name, primaries, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.f
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d9) {
                switch (i8) {
                    case 0:
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(eotf, d9);
                    default:
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(eotf, d9);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    @JvmStatic
    @RequiresApi(26)
    @NotNull
    public static final androidx.compose.p011ui.graphics.colorspace.ColorSpace composeColorSpace(@NotNull final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Named unused2 = ColorSpace.Named.ACES;
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        ColorSpace.Named unused3 = ColorSpace.Named.ACESCG;
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        ColorSpace.Named unused4 = ColorSpace.Named.ADOBE_RGB;
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        ColorSpace.Named unused5 = ColorSpace.Named.BT2020;
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        ColorSpace.Named unused6 = ColorSpace.Named.BT709;
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        ColorSpace.Named unused7 = ColorSpace.Named.CIE_LAB;
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        ColorSpace.Named unused8 = ColorSpace.Named.CIE_XYZ;
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        ColorSpace.Named unused9 = ColorSpace.Named.DCI_P3;
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        ColorSpace.Named unused10 = ColorSpace.Named.DISPLAY_P3;
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        ColorSpace.Named unused11 = ColorSpace.Named.EXTENDED_SRGB;
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        ColorSpace.Named unused12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        ColorSpace.Named unused13 = ColorSpace.Named.LINEAR_SRGB;
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        ColorSpace.Named unused14 = ColorSpace.Named.NTSC_1953;
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        ColorSpace.Named unused15 = ColorSpace.Named.PRO_PHOTO_RGB;
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        ColorSpace.Named unused16 = ColorSpace.Named.SMPTE_C;
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.p011ui.graphics.colorspace.ColorSpace colorSpaceObtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!AbstractC5830k.m5325b(colorSpaceObtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release())) {
                return colorSpaceObtainComposeColorSpaceFromId;
            }
        }
        if (!AbstractC2115d.m1270j(colorSpace)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb.TransferParameters transferParameters = AbstractC2079b.m1115f(colorSpace).getTransferParameters();
        WhitePoint whitePoint = AbstractC2079b.m1115f(colorSpace).getWhitePoint().length == 3 ? new WhitePoint(AbstractC2079b.m1115f(colorSpace).getWhitePoint()[0], AbstractC2079b.m1115f(colorSpace).getWhitePoint()[1], AbstractC2079b.m1115f(colorSpace).getWhitePoint()[2]) : new WhitePoint(AbstractC2079b.m1115f(colorSpace).getWhitePoint()[0], AbstractC2079b.m1115f(colorSpace).getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = AbstractC2079b.m1115f(colorSpace).getName();
        float[] primaries = AbstractC2079b.m1115f(colorSpace).getPrimaries();
        float[] transform = AbstractC2079b.m1115f(colorSpace).getTransform();
        final int i = 0;
        DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.g
            @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d9) {
                switch (i) {
                    case 0:
                        return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d9);
                    default:
                        return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d9);
                }
            }
        };
        final int i8 = 1;
        return new Rgb(name, primaries, whitePoint, transform, doubleFunction, new DoubleFunction() { // from class: androidx.compose.ui.graphics.g
            @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d9) {
                switch (i8) {
                    case 0:
                        return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d9);
                    default:
                        return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d9);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters2, AbstractC2079b.m1115f(colorSpace).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d9) {
        return AbstractC2079b.m1115f(colorSpace).getOetf().applyAsDouble(d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d9) {
        return AbstractC2079b.m1115f(colorSpace).getEotf().applyAsDouble(d9);
    }
}
