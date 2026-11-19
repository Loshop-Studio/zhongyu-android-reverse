package androidx.compose.p012ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m13413d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n65#2,10:173\n65#2,10:183\n65#2,10:193\n65#2,10:203\n65#2,10:213\n65#2,10:223\n65#2,10:241\n65#2,10:251\n65#2,10:261\n638#3:233\n653#3:234\n668#3:235\n638#3:236\n653#3:237\n638#3:271\n653#3:272\n668#3:273\n668#3:274\n638#3:275\n653#3:276\n668#3:277\n638#3:278\n653#3:279\n668#3:280\n53#4,3:238\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n39#1:173,10\n40#1:183,10\n41#1:193,10\n53#1:203,10\n54#1:213,10\n55#1:223,10\n72#1:241,10\n73#1:251,10\n74#1:261,10\n57#1:233\n58#1:234\n59#1:235\n65#1:236\n66#1:237\n76#1:271\n77#1:272\n78#1:273\n84#1:274\n96#1:275\n97#1:276\n98#1:277\n104#1:278\n105#1:279\n106#1:280\n68#1:238,3\n*E\n"})
/* loaded from: classes2.dex */
public final class Oklab extends ColorSpace {
    private static final float[] InverseM1;
    private static final float[] InverseM2;

    /* renamed from: M1 */
    private static final float[] f1139M1;

    /* renamed from: M2 */
    private static final float[] f1140M2;

    static {
        float[] transform = Adaptation.INSTANCE.getBradford().getTransform();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f1139M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f1140M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(String str, int i9) {
        super(str, ColorModel.INSTANCE.m21822getLabxdoWZVw(), i9, null);
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v9) {
        ColorSpaceKt.mul3x3Float3(f1139M1, v9);
        v9[0] = MathHelpersKt.fastCbrt(v9[0]);
        v9[1] = MathHelpersKt.fastCbrt(v9[1]);
        v9[2] = MathHelpersKt.fastCbrt(v9[2]);
        ColorSpaceKt.mul3x3Float3(f1140M2, v9);
        return v9;
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = InverseM2;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = InverseM1;
        return (Float.floatToRawIntBits(((fArr2[0] * f14) + (fArr2[3] * f15)) + (fArr2[6] * f16)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f14) + (fArr2[4] * f15) + (fArr2[7] * f16)) & 4294967295L);
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v9) {
        float f10 = v9[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        v9[0] = f10;
        float f11 = v9[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        v9[1] = f11;
        float f12 = v9[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        v9[2] = f13 <= 0.5f ? f13 : 0.5f;
        ColorSpaceKt.mul3x3Float3(InverseM2, v9);
        float f14 = v9[0];
        v9[0] = f14 * f14 * f14;
        float f15 = v9[1];
        v9[1] = f15 * f15 * f15;
        float f16 = v9[2];
        v9[2] = f16 * f16 * f16;
        ColorSpaceKt.mul3x3Float3(InverseM1, v9);
        return v9;
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = InverseM2;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = InverseM1;
        return (fArr2[2] * f14) + (fArr2[5] * f15) + (fArr2[8] * f13 * f13 * f13);
    }

    @Override // androidx.compose.p012ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo21826xyzaToColorJlNiLsg$ui_graphics_release(float x9, float y9, float z9, float a10, ColorSpace colorSpace) {
        float[] fArr = f1139M1;
        float f10 = (fArr[0] * x9) + (fArr[3] * y9) + (fArr[6] * z9);
        float f11 = (fArr[1] * x9) + (fArr[4] * y9) + (fArr[7] * z9);
        float f12 = (fArr[2] * x9) + (fArr[5] * y9) + (fArr[8] * z9);
        float fFastCbrt = MathHelpersKt.fastCbrt(f10);
        float fFastCbrt2 = MathHelpersKt.fastCbrt(f11);
        float fFastCbrt3 = MathHelpersKt.fastCbrt(f12);
        float[] fArr2 = f1140M2;
        return ColorKt.Color((fArr2[0] * fFastCbrt) + (fArr2[3] * fFastCbrt2) + (fArr2[6] * fFastCbrt3), (fArr2[1] * fFastCbrt) + (fArr2[4] * fFastCbrt2) + (fArr2[7] * fFastCbrt3), (fArr2[2] * fFastCbrt) + (fArr2[5] * fFastCbrt2) + (fArr2[8] * fFastCbrt3), a10, colorSpace);
    }
}
