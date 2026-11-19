package androidx.compose.p006ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m5175d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", C3335ai.f1662aC, "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", C3335ai.f1661aB, C3335ai.f1705at, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f119A = 0.008856452f;

    /* renamed from: B */
    private static final float f120B = 7.787037f;

    /* renamed from: C */
    private static final float f121C = 0.13793103f;

    /* renamed from: D */
    private static final float f122D = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(String name, int i4) {
        super(name, ColorModel.INSTANCE.m9561getLabxdoWZVw(), i4, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        float f4 = v3[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f4 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f6 = v3[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f7 = v3[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f5 > f119A ? (float) Math.pow(f5, 0.33333334f) : (f5 * f120B) + f121C;
        float fPow2 = f6 > f119A ? (float) Math.pow(f6, 0.33333334f) : (f6 * f120B) + f121C;
        float fPow3 = f7 > f119A ? (float) Math.pow(f7, 0.33333334f) : (f7 * f120B) + f121C;
        v3[0] = RangesKt___RangesKt.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v3[1] = RangesKt___RangesKt.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v3[2] = RangesKt___RangesKt.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v3;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fCoerceIn = (RangesKt___RangesKt.coerceIn(v02, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fCoerceIn2 = (RangesKt___RangesKt.coerceIn(v02, -128.0f, 128.0f) * 0.002f) + fCoerceIn;
        float f4 = fCoerceIn2 > f122D ? fCoerceIn2 * fCoerceIn2 * fCoerceIn2 : (fCoerceIn2 - f121C) * 0.12841855f;
        float f5 = fCoerceIn > f122D ? fCoerceIn * fCoerceIn * fCoerceIn : (fCoerceIn - f121C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (Float.floatToIntBits(f4 * illuminant.getD50Xyz$ui_graphics_release()[0]) << 32) | (Float.floatToIntBits(f5 * illuminant.getD50Xyz$ui_graphics_release()[1]) & 4294967295L);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = RangesKt___RangesKt.coerceIn(v3[0], 0.0f, 100.0f);
        v3[1] = RangesKt___RangesKt.coerceIn(v3[1], -128.0f, 128.0f);
        float fCoerceIn = RangesKt___RangesKt.coerceIn(v3[2], -128.0f, 128.0f);
        v3[2] = fCoerceIn;
        float f4 = (v3[0] + 16.0f) / 116.0f;
        float f5 = (v3[1] * 0.002f) + f4;
        float f6 = f4 - (fCoerceIn * 0.005f);
        float f7 = f5 > f122D ? f5 * f5 * f5 : (f5 - f121C) * 0.12841855f;
        float f8 = f4 > f122D ? f4 * f4 * f4 : (f4 - f121C) * 0.12841855f;
        float f9 = f6 > f122D ? f6 * f6 * f6 : (f6 - f121C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v3[0] = f7 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v3[1] = f8 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v3[2] = f9 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v3;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        float fCoerceIn = ((RangesKt___RangesKt.coerceIn(v02, 0.0f, 100.0f) + 16.0f) / 116.0f) - (RangesKt___RangesKt.coerceIn(v22, -128.0f, 128.0f) * 0.005f);
        return (fCoerceIn > f122D ? fCoerceIn * fCoerceIn * fCoerceIn : 0.12841855f * (fCoerceIn - f121C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo9565xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y3, float z3, float a4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f4 = x3 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f5 = y3 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f6 = z3 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f4 > f119A ? (float) Math.pow(f4, 0.33333334f) : (f4 * f120B) + f121C;
        float fPow2 = f5 > f119A ? (float) Math.pow(f5, 0.33333334f) : (f5 * f120B) + f121C;
        return ColorKt.Color(RangesKt___RangesKt.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), RangesKt___RangesKt.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f), RangesKt___RangesKt.coerceIn((fPow2 - (f6 > f119A ? (float) Math.pow(f6, 0.33333334f) : (f6 * f120B) + f121C)) * 200.0f, -128.0f, 128.0f), a4, colorSpace);
    }
}
