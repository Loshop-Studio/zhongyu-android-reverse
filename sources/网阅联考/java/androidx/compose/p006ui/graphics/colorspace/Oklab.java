package androidx.compose.p006ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m5175d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", C3335ai.f1662aC, "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", C3335ai.f1661aB, C3335ai.f1705at, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {
    private static final float[] InverseM1;
    private static final float[] InverseM2;

    /* renamed from: M1 */
    private static final float[] f123M1;

    /* renamed from: M2 */
    private static final float[] f124M2;

    static {
        float[] transform = Adaptation.INSTANCE.getBradford().getTransform();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f123M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f124M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oklab(String name, int i4) {
        super(name, ColorModel.INSTANCE.m9561getLabxdoWZVw(), i4, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        ColorSpaceKt.mul3x3Float3(f123M1, v3);
        double d4 = 0.33333334f;
        v3[0] = Math.signum(v3[0]) * ((float) Math.pow(Math.abs(v3[0]), d4));
        v3[1] = Math.signum(v3[1]) * ((float) Math.pow(Math.abs(v3[1]), d4));
        v3[2] = Math.signum(v3[2]) * ((float) Math.pow(Math.abs(v3[2]), d4));
        ColorSpaceKt.mul3x3Float3(f124M2, v3);
        return v3;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fCoerceIn = RangesKt___RangesKt.coerceIn(v02, 0.0f, 1.0f);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(v12, -0.5f, 0.5f);
        float fCoerceIn3 = RangesKt___RangesKt.coerceIn(v22, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float f4 = fMul3x3Float3_0 * fMul3x3Float3_0 * fMul3x3Float3_0;
        float f5 = fMul3x3Float3_1 * fMul3x3Float3_1 * fMul3x3Float3_1;
        float f6 = fMul3x3Float3_2 * fMul3x3Float3_2 * fMul3x3Float3_2;
        float[] fArr2 = InverseM1;
        float fMul3x3Float3_02 = ColorSpaceKt.mul3x3Float3_0(fArr2, f4, f5, f6);
        float fMul3x3Float3_12 = ColorSpaceKt.mul3x3Float3_1(fArr2, f4, f5, f6);
        return (Float.floatToIntBits(fMul3x3Float3_02) << 32) | (Float.floatToIntBits(fMul3x3Float3_12) & 4294967295L);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = RangesKt___RangesKt.coerceIn(v3[0], 0.0f, 1.0f);
        v3[1] = RangesKt___RangesKt.coerceIn(v3[1], -0.5f, 0.5f);
        v3[2] = RangesKt___RangesKt.coerceIn(v3[2], -0.5f, 0.5f);
        ColorSpaceKt.mul3x3Float3(InverseM2, v3);
        float f4 = v3[0];
        v3[0] = f4 * f4 * f4;
        float f5 = v3[1];
        v3[1] = f5 * f5 * f5;
        float f6 = v3[2];
        v3[2] = f6 * f6 * f6;
        ColorSpaceKt.mul3x3Float3(InverseM1, v3);
        return v3;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        float fCoerceIn = RangesKt___RangesKt.coerceIn(v02, 0.0f, 1.0f);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(v12, -0.5f, 0.5f);
        float fCoerceIn3 = RangesKt___RangesKt.coerceIn(v22, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float f4 = fMul3x3Float3_2 * fMul3x3Float3_2 * fMul3x3Float3_2;
        return ColorSpaceKt.mul3x3Float3_2(InverseM1, fMul3x3Float3_0 * fMul3x3Float3_0 * fMul3x3Float3_0, fMul3x3Float3_1 * fMul3x3Float3_1 * fMul3x3Float3_1, f4);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo9565xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y3, float z3, float a4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = f123M1;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, x3, y3, z3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, x3, y3, z3);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, x3, y3, z3);
        double d4 = 0.33333334f;
        float fSignum = Math.signum(fMul3x3Float3_0) * ((float) Math.pow(Math.abs(fMul3x3Float3_0), d4));
        float fSignum2 = Math.signum(fMul3x3Float3_1) * ((float) Math.pow(Math.abs(fMul3x3Float3_1), d4));
        float fSignum3 = Math.signum(fMul3x3Float3_2) * ((float) Math.pow(Math.abs(fMul3x3Float3_2), d4));
        float[] fArr2 = f124M2;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, fSignum, fSignum2, fSignum3), ColorSpaceKt.mul3x3Float3_1(fArr2, fSignum, fSignum2, fSignum3), ColorSpaceKt.mul3x3Float3_2(fArr2, fSignum, fSignum2, fSignum3), a4, colorSpace);
    }
}
