package androidx.compose.p014ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.colorspace.Rgb;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.i
        @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d10) {
            return Rgb.DoubleIdentity$lambda$8(d10);
        }
    };
    private final InterfaceC9540l eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final InterfaceC9540l oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private final float area(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean compare(double d10, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d10) - doubleFunction2.invoke(d10)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            return new WhitePoint(f10 / f12, f11 / f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float x10 = whitePoint.getX();
            float y10 = whitePoint.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2];
            float f15 = fArr2[2];
            float f16 = fArr[3];
            float f17 = fArr2[3];
            float f18 = fArr[4];
            float f19 = fArr2[4];
            float f20 = fArr[5];
            float f21 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr3[4];
                    float f27 = fArr3[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.p
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateEotf$lambda$4(transferParameters, d10);
                }
            } : transferParameters.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateEotf$lambda$5(transferParameters, d10);
                }
            } : (transferParameters.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && transferParameters.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.r
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateEotf$lambda$6(transferParameters, d10);
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.s
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateEotf$lambda$7(transferParameters, d10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$4(TransferParameters transferParameters, double d10) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$5(TransferParameters transferParameters, double d10) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$6(TransferParameters transferParameters, double d10) {
            return ColorSpaceKt.response(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$7(TransferParameters transferParameters, double d10) {
            return ColorSpaceKt.response(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.t
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateOetf$lambda$0(transferParameters, d10);
                }
            } : transferParameters.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.u
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateOetf$lambda$1(transferParameters, d10);
                }
            } : (transferParameters.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && transferParameters.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.v
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateOetf$lambda$2(transferParameters, d10);
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.w
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    return Rgb.Companion.generateOetf$lambda$3(transferParameters, d10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d10) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d10) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d10) {
            return ColorSpaceKt.rcpResponse(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d10) {
            return ColorSpaceKt.rcpResponse(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d10 = AudioStats.AUDIO_AMPLITUDE_NONE; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!compare(d10, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d10, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f10, float f11) {
            float fArea = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                AbstractC10964p.m24026s(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            float f13 = fArrMul3x3Float32[0];
            float f14 = fArrMul3x3Float32[1];
            float f15 = f13 + f14 + fArrMul3x3Float32[2];
            float f16 = fArrMul3x3Float33[0];
            float f17 = fArrMul3x3Float33[1];
            float f18 = f16 + f17 + fArrMul3x3Float33[2];
            return new float[]{f10 / f12, f11 / f12, f13 / f15, f14 / f15, f16 / f18, f17 / f18};
        }

        private Companion() {
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f10, float f11, TransferParameters transferParameters, int i10) {
        super(str, ColorModel.Companion.m31292getRgbxdoWZVw(), i10, null);
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double invoke(double d10) {
                return Double.valueOf(AbstractC10410o.m21759l(this.this$0.getOetfOrig$ui_graphics_release().invoke(d10), this.this$0.min, this.this$0.max));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb.oetfFunc$lambda$0(this.f1164a, d10);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double invoke(double d10) {
                return Double.valueOf(this.this$0.getEotfOrig$ui_graphics_release().invoke(AbstractC10410o.m21759l(d10, this.this$0.min, this.this$0.max)));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb.eotfFunc$lambda$1(this.f1165a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f10, f11);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$8(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(InterfaceC9540l interfaceC9540l, double d10) {
        return ((Number) interfaceC9540l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(InterfaceC9540l interfaceC9540l, double d10) {
        return ((Number) interfaceC9540l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(InterfaceC9540l interfaceC9540l, double d10) {
        return ((Number) interfaceC9540l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(InterfaceC9540l interfaceC9540l, double d10) {
        return ((Number) interfaceC9540l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(double d10, double d11) {
        if (d11 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(double d10, double d11) {
        if (d11 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d10) {
        return rgb.eotfOrig.invoke(AbstractC10410o.m21759l(d10, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d10) {
        return AbstractC10410o.m21759l(rgb.oetfOrig.invoke(d10), rgb.min, rgb.max);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !AbstractC9979u.m20289b(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return AbstractC9979u.m20289b(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (AbstractC9979u.m20289b(this.oetfOrig, rgb.oetfOrig)) {
            return AbstractC9979u.m20289b(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Size(3)
    public final float[] fromLinear(float f10, float f11, float f12) {
        return fromLinear(new float[]{f10, f11, f12});
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final InterfaceC9540l getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @Size(9)
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i10) {
        return this.max;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i10) {
        return this.min;
    }

    public final InterfaceC9540l getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @Size(9)
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @Size(3)
    public final float[] toLinear(float f10, float f11, float f12) {
        return toLinear(new float[]{f10, f11, f12});
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f10, float f11, float f12) {
        float fInvoke = (float) this.eotfFunc.invoke(f10);
        float fInvoke2 = (float) this.eotfFunc.invoke(f11);
        float fInvoke3 = (float) this.eotfFunc.invoke(f12);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3);
        float f14 = (fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3);
        return (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f10, float f11, float f12) {
        float fInvoke = (float) this.eotfFunc.invoke(f10);
        float fInvoke2 = (float) this.eotfFunc.invoke(f11);
        float fInvoke3 = (float) this.eotfFunc.invoke(f12);
        float[] fArr = this.transform;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo31295xyzaToColorJlNiLsg$ui_graphics_release(float f10, float f11, float f12, float f13, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.oetfFunc.invoke((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.oetfFunc.invoke((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, colorSpace);
    }

    @Size(min = 3)
    public final float[] fromLinear(@Size(min = 3) float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Size(min = 9)
    public final float[] getInverseTransform(@Size(min = 9) float[] fArr) {
        return AbstractC10964p.m24026s(this.inverseTransform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries(@Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr) {
        return AbstractC10964p.m24026s(this.primaries, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 9)
    public final float[] getTransform(@Size(min = 9) float[] fArr) {
        return AbstractC10964p.m24026s(this.transform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 3)
    public final float[] toLinear(@Size(min = 3) float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$2(interfaceC9540l, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.k
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$3(interfaceC9540l2, d10);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, float f10, float f11) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$4(interfaceC9540l, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$5(interfaceC9540l2, d10);
            }
        }, f10, f11, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, TransferParameters transferParameters) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i10) {
        Companion companion = Companion;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, double d10) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d10, 0.0f, 1.0f, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, double d10) {
        this(str, fArr, whitePoint, d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d10 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.l
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    return Rgb._init_$lambda$6(d10, d11);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d10 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.m
                @Override // androidx.compose.p014ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    return Rgb._init_$lambda$7(d10, d11);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f10, f11, new TransferParameters(d10, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), i10);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
