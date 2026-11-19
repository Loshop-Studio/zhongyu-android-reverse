package androidx.compose.p011ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020GH\u0080\b¢\u0006\u0002\bHJ\u001a\u0010I\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020\u0010J\u001d\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bPJ\u001d\u0010Q\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bRJ\u001d\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bUJ\u001d\u0010V\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bWR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u0011\u0010*\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0006R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0011\u0010.\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0006R\u0011\u00100\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0006R\u000e\u00102\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001aR\u0011\u00107\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u001aR\u0014\u0010A\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0012R\u0014\u0010C\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006¨\u0006X"}, m5110d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "()V", "Aces", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getAces", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Acescg", "getAcescg", "AdobeRgb", "getAdobeRgb", "Bt2020", "getBt2020", "Bt2020Hlg", "getBt2020Hlg", "Bt2020HlgTransferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getBt2020HlgTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Bt2020Pq", "getBt2020Pq", "Bt2020PqTransferParameters", "getBt2020PqTransferParameters$ui_graphics_release", "Bt2020Primaries", "", "getBt2020Primaries$ui_graphics_release", "()[F", "Bt709", "getBt709", "CieLab", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieLab", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "getCieXyz", "ColorSpacesArray", "", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "DciP3", "getDciP3", "DisplayP3", "getDisplayP3", "ExtendedSrgb", "getExtendedSrgb", "LinearExtendedSrgb", "getLinearExtendedSrgb", "LinearSrgb", "getLinearSrgb", "NoneTransferParameters", "Ntsc1953", "getNtsc1953", "Ntsc1953Primaries", "getNtsc1953Primaries$ui_graphics_release", "Oklab", "getOklab", "ProPhotoRgb", "getProPhotoRgb", "SmpteC", "getSmpteC", "Srgb", "getSrgb", "SrgbPrimaries", "getSrgbPrimaries$ui_graphics_release", "SrgbTransferParameters", "getSrgbTransferParameters$ui_graphics_release", "Unspecified", "getUnspecified$ui_graphics_release", "getColorSpace", "id", "", "getColorSpace$ui_graphics_release", "match", "toXYZD50", "function", "transferHlgEotf", "", "params", "x", "transferHlgEotf$ui_graphics_release", "transferHlgOetf", "transferHlgOetf$ui_graphics_release", "transferSt2048Eotf", "pq", "transferSt2048Eotf$ui_graphics_release", "transferSt2048Oetf", "transferSt2048Oetf$ui_graphics_release", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ColorSpaces {

    @NotNull
    private static final Rgb Aces;

    @NotNull
    private static final Rgb Acescg;

    @NotNull
    private static final Rgb AdobeRgb;

    @NotNull
    private static final Rgb Bt2020;

    @NotNull
    private static final Rgb Bt2020Hlg;

    @NotNull
    private static final TransferParameters Bt2020HlgTransferParameters;

    @NotNull
    private static final Rgb Bt2020Pq;

    @NotNull
    private static final TransferParameters Bt2020PqTransferParameters;

    @NotNull
    private static final float[] Bt2020Primaries;

    @NotNull
    private static final Rgb Bt709;

    @NotNull
    private static final ColorSpace CieLab;

    @NotNull
    private static final ColorSpace CieXyz;

    @NotNull
    private static final ColorSpace[] ColorSpacesArray;

    @NotNull
    private static final Rgb DciP3;

    @NotNull
    private static final Rgb DisplayP3;

    @NotNull
    private static final Rgb ExtendedSrgb;

    @NotNull
    public static final ColorSpaces INSTANCE = new ColorSpaces();

    @NotNull
    private static final Rgb LinearExtendedSrgb;

    @NotNull
    private static final Rgb LinearSrgb;

    @NotNull
    private static final TransferParameters NoneTransferParameters;

    @NotNull
    private static final Rgb Ntsc1953;

    @NotNull
    private static final float[] Ntsc1953Primaries;

    @NotNull
    private static final ColorSpace Oklab;

    @NotNull
    private static final Rgb ProPhotoRgb;

    @NotNull
    private static final Rgb SmpteC;

    @NotNull
    private static final Rgb Srgb;

    @NotNull
    private static final float[] SrgbPrimaries;

    @NotNull
    private static final TransferParameters SrgbTransferParameters;

    @NotNull
    private static final Rgb Unspecified;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        Illuminant illuminant = Illuminant.INSTANCE;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, illuminant.getD65(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, illuminant.getD65(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, illuminant.getD65(), null, new C2111a(0), new C2111a(1), -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, illuminant.getD65(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.getD65(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.getD65(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.getD50(), new TransferParameters(1.8d, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE, 0.0625d, 0.031248d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        CieXyz = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        CieLab = lab;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.getD65(), transferParameters2, 16);
        Unspecified = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, illuminant.getD65(), null, new C2111a(2), new C2111a(3), 0.0f, 1.0f, transferParameters3, 17);
        Bt2020Hlg = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, illuminant.getD65(), null, new C2111a(4), new C2111a(5), 0.0f, 1.0f, transferParameters4, 18);
        Bt2020Pq = rgb17;
        Oklab oklab = new Oklab("Oklab", 19);
        Oklab = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
    }

    private ColorSpaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Hlg$lambda$2(double d9) {
        return INSTANCE.transferHlgOetf$ui_graphics_release(Bt2020HlgTransferParameters, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Hlg$lambda$3(double d9) {
        return INSTANCE.transferHlgEotf$ui_graphics_release(Bt2020HlgTransferParameters, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Pq$lambda$4(double d9) {
        return INSTANCE.transferSt2048Oetf$ui_graphics_release(Bt2020PqTransferParameters, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Pq$lambda$5(double d9) {
        return INSTANCE.transferSt2048Eotf$ui_graphics_release(Bt2020PqTransferParameters, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$0(double d9) {
        return ColorSpaceKt.absRcpResponse(d9, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$1(double d9) {
        return ColorSpaceKt.absResponse(d9, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @NotNull
    public final Rgb getAces() {
        return Aces;
    }

    @NotNull
    public final Rgb getAcescg() {
        return Acescg;
    }

    @NotNull
    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    @NotNull
    public final Rgb getBt2020() {
        return Bt2020;
    }

    @NotNull
    public final Rgb getBt2020Hlg() {
        return Bt2020Hlg;
    }

    @NotNull
    public final TransferParameters getBt2020HlgTransferParameters$ui_graphics_release() {
        return Bt2020HlgTransferParameters;
    }

    @NotNull
    public final Rgb getBt2020Pq() {
        return Bt2020Pq;
    }

    @NotNull
    public final TransferParameters getBt2020PqTransferParameters$ui_graphics_release() {
        return Bt2020PqTransferParameters;
    }

    @NotNull
    public final float[] getBt2020Primaries$ui_graphics_release() {
        return Bt2020Primaries;
    }

    @NotNull
    public final Rgb getBt709() {
        return Bt709;
    }

    @NotNull
    public final ColorSpace getCieLab() {
        return CieLab;
    }

    @NotNull
    public final ColorSpace getCieXyz() {
        return CieXyz;
    }

    @NotNull
    public final ColorSpace getColorSpace$ui_graphics_release(int id) {
        return getColorSpacesArray$ui_graphics_release()[id];
    }

    @NotNull
    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpacesArray;
    }

    @NotNull
    public final Rgb getDciP3() {
        return DciP3;
    }

    @NotNull
    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    @NotNull
    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    @NotNull
    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    @NotNull
    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return Ntsc1953Primaries;
    }

    @NotNull
    public final ColorSpace getOklab() {
        return Oklab;
    }

    @NotNull
    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    @NotNull
    public final Rgb getSmpteC() {
        return SmpteC;
    }

    @NotNull
    public final Rgb getSrgb() {
        return Srgb;
    }

    @NotNull
    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return SrgbPrimaries;
    }

    @NotNull
    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return SrgbTransferParameters;
    }

    @NotNull
    public final Rgb getUnspecified$ui_graphics_release() {
        return Unspecified;
    }

    @Nullable
    public final ColorSpace match(@Size(9) @NotNull float[] toXYZD50, @NotNull TransferParameters function) {
        for (ColorSpace colorSpace : ColorSpacesArray) {
            if (ColorModel.m11089equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m11096getRgbxdoWZVw())) {
                ColorSpace colorSpaceAdapt$default = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
                AbstractC5830k.m5328e(colorSpaceAdapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) colorSpaceAdapt$default;
                if (ColorSpaceKt.compare(toXYZD50, rgb.getTransform()) && ColorSpaceKt.compare(function, rgb.getTransferParameters())) {
                    return colorSpace;
                }
            }
        }
        return null;
    }

    public final double transferHlgEotf$ui_graphics_release(@NotNull TransferParameters params, double x3) {
        double d9 = x3 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d10 = x3 * d9;
        double a9 = params.getA();
        double b6 = params.getB();
        double c = params.getC();
        double d11 = params.getD();
        double e = params.getE();
        double d12 = a9 * d10;
        return (params.getF() + 1.0d) * d9 * (d12 <= 1.0d ? Math.pow(d12, b6) : Math.exp((d10 - e) * c) + d11);
    }

    public final double transferHlgOetf$ui_graphics_release(@NotNull TransferParameters params, double x3) {
        double d9 = x3 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double a9 = 1.0d / params.getA();
        double b6 = 1.0d / params.getB();
        double c = 1.0d / params.getC();
        double d10 = params.getD();
        double e = params.getE();
        double f = (x3 * d9) / (params.getF() + 1.0d);
        return d9 * (f <= 1.0d ? Math.pow(f, b6) * a9 : (Math.log(f - d10) * c) + e);
    }

    public final double transferSt2048Eotf$ui_graphics_release(@NotNull TransferParameters pq, double x3) {
        double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d10 = x3 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d11 = x3 * d10;
        double dPow = (Math.pow(d11, pq.getC()) * pq.getB()) + pq.getA();
        if (dPow >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d9 = dPow;
        }
        return Math.pow(d9 / ((Math.pow(d11, pq.getC()) * pq.getE()) + pq.getD()), pq.getF()) * d10;
    }

    public final double transferSt2048Oetf$ui_graphics_release(@NotNull TransferParameters params, double x3) {
        double d9 = x3 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d10 = x3 * d9;
        double d11 = -params.getA();
        double d12 = params.getD();
        double f = 1.0d / params.getF();
        return Math.pow(Math.max((Math.pow(d10, f) * d12) + d11, AudioStats.AUDIO_AMPLITUDE_NONE) / ((Math.pow(d10, f) * (-params.getE())) + params.getB()), 1.0d / params.getC()) * d9;
    }
}
