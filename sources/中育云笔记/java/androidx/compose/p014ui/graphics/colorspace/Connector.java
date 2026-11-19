package androidx.compose.p014ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.colorspace.ColorModel;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public class Connector {
    public static final Companion Companion = new Companion(null);
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m31302computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i10) {
            if (!RenderIntent.m31308equalsimpl0(i10, RenderIntent.Companion.m31312getAbsoluteuksYyKA())) {
                return null;
            }
            long jM31294getModelxdoWZVw = colorSpace.m31294getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean zM31285equalsimpl0 = ColorModel.m31285equalsimpl0(jM31294getModelxdoWZVw, companion.m31292getRgbxdoWZVw());
            boolean zM31285equalsimpl02 = ColorModel.m31285equalsimpl0(colorSpace2.m31294getModelxdoWZVw(), companion.m31292getRgbxdoWZVw());
            if (zM31285equalsimpl0 && zM31285equalsimpl02) {
                return null;
            }
            if (!zM31285equalsimpl0 && !zM31285equalsimpl02) {
                return null;
            }
            if (!zM31285equalsimpl0) {
                colorSpace = colorSpace2;
            }
            AbstractC9979u.m20292e(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = zM31285equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM31285equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        public final Connector identity$ui_graphics_release(final ColorSpace colorSpace) {
            final int iM31314getRelativeuksYyKA = RenderIntent.Companion.m31314getRelativeuksYyKA();
            return new Connector(colorSpace, iM31314getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(colorSpace, colorSpace, iM31314getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.p014ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.p014ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-l2rxGTc$ui_graphics_release */
                public long mo31300transformToColorl2rxGTc$ui_graphics_release(long j10) {
                    return j10;
                }
            };
        }

        private Companion() {
        }
    }

    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i10, AbstractC9972n abstractC9972n) {
            this(rgb, rgb2, i10);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m31303computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i10) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), xyz$ui_graphics_release, illuminant.newD50Xyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), xyz$ui_graphics_release2, illuminant.newD50Xyz$ui_graphics_release()), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m31308equalsimpl0(i10, RenderIntent.Companion.m31312getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.p014ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.p014ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public long mo31300transformToColorl2rxGTc$ui_graphics_release(long j10) {
            float fM30884getRedimpl = Color.m30884getRedimpl(j10);
            float fM30883getGreenimpl = Color.m30883getGreenimpl(j10);
            float fM30881getBlueimpl = Color.m30881getBlueimpl(j10);
            float fM30880getAlphaimpl = Color.m30880getAlphaimpl(j10);
            float fInvoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM30884getRedimpl);
            float fInvoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM30883getGreenimpl);
            float fInvoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM30881getBlueimpl);
            float[] fArr = this.mTransform;
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3)), fM30880getAlphaimpl, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i10) {
            super(rgb, rgb2, rgb, rgb2, i10, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m31303computeTransformYBCOT_4(rgb, rgb2, i10);
        }
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i10, AbstractC9972n abstractC9972n) {
        this(colorSpace, colorSpace2, i10);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m31299getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    @Size(3)
    public final float[] transform(float f10, float f11, float f12) {
        return transform(new float[]{f10, f11, f12});
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo31300transformToColorl2rxGTc$ui_graphics_release(long j10) {
        float fM30884getRedimpl = Color.m30884getRedimpl(j10);
        float fM30883getGreenimpl = Color.m30883getGreenimpl(j10);
        float fM30881getBlueimpl = Color.m30881getBlueimpl(j10);
        float fM30880getAlphaimpl = Color.m30880getAlphaimpl(j10);
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(fM30884getRedimpl, fM30883getGreenimpl, fM30881getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(fM30884getRedimpl, fM30883getGreenimpl, fM30881getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.transformDestination.mo31295xyzaToColorJlNiLsg$ui_graphics_release(f10, fIntBitsToFloat2, z$ui_graphics_release, fM30880getAlphaimpl, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i10, float[] fArr, AbstractC9972n abstractC9972n) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i10, fArr);
    }

    @Size(min = 3)
    public float[] transform(@Size(min = 3) float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i10, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i10;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i10) {
        long jM31294getModelxdoWZVw = colorSpace.m31294getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        this(colorSpace, colorSpace2, ColorModel.m31285equalsimpl0(jM31294getModelxdoWZVw, companion.m31292getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m31285equalsimpl0(colorSpace2.m31294getModelxdoWZVw(), companion.m31292getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i10, Companion.m31302computeTransformYBCOT_4(colorSpace, colorSpace2, i10), null);
    }
}
