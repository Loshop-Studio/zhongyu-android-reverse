package androidx.compose.p006ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nBW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\u001e\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010?\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0006\u0010I\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010J\u001a\u00020\u0005J\u000e\u0010J\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010K\u001a\u00020\u0017H\u0016J\u001e\u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010L\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ@\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006_"}, m5175d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", C3335ai.f1662aC, "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", C3335ai.f1661aB, C3335ai.f1705at, "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
        @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d4) {
            return Rgb.DoubleIdentity$lambda$12(d4);
        }
    };
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    @Metadata(m5174d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m5175d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", C3335ai.f1705at, "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            float f4 = primaries[0];
            float f5 = primaries[1];
            float f6 = primaries[2];
            float f7 = primaries[3];
            float f8 = primaries[4];
            float f9 = primaries[5];
            float f10 = ((((((f4 * f7) + (f5 * f8)) + (f6 * f9)) - (f7 * f8)) - (f5 * f6)) - (f4 * f9)) * 0.5f;
            return f10 < 0.0f ? -f10 : f10;
        }

        private final boolean compare(double point, DoubleFunction a4, DoubleFunction b4) {
            return Math.abs(a4.invoke(point) - b4.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f4 = fArrMul3x3Float3[0];
            float f5 = fArrMul3x3Float3[1];
            float f6 = f4 + f5 + fArrMul3x3Float3[2];
            return new WhitePoint(f4 / f6, f5 / f6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f4 = primaries[0];
            float f5 = primaries[1];
            float f6 = primaries[2];
            float f7 = primaries[3];
            float f8 = primaries[4];
            float f9 = primaries[5];
            float x3 = whitePoint.getX();
            float y3 = whitePoint.getY();
            float f10 = 1;
            float f11 = (f10 - f4) / f5;
            float f12 = (f10 - f6) / f7;
            float f13 = (f10 - f8) / f9;
            float f14 = (f10 - x3) / y3;
            float f15 = f4 / f5;
            float f16 = (f6 / f7) - f15;
            float f17 = (x3 / y3) - f15;
            float f18 = f12 - f11;
            float f19 = (f8 / f9) - f15;
            float f20 = (((f14 - f11) * f16) - (f17 * f18)) / (((f13 - f11) * f16) - (f18 * f19));
            float f21 = (f17 - (f19 * f20)) / f16;
            float f22 = (1.0f - f21) - f20;
            float f23 = f22 / f5;
            float f24 = f21 / f7;
            float f25 = f20 / f9;
            return new float[]{f23 * f4, f22, f23 * ((1.0f - f4) - f5), f24 * f6, f21, f24 * ((1.0f - f6) - f7), f25 * f8, f20, f25 * ((1.0f - f8) - f9)};
        }

        private final boolean contains(float[] p12, float[] p22) {
            float f4 = p12[0] - p22[0];
            float f5 = p12[1] - p22[1];
            float[] fArr = {f4, f5, p12[2] - p22[2], p12[3] - p22[3], p12[4] - p22[4], p12[5] - p22[5]};
            return cross(f4, f5, p22[0] - p22[4], p22[1] - p22[5]) >= 0.0f && cross(p22[0] - p22[2], p22[1] - p22[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p22[2] - p22[0], p22[3] - p22[1]) >= 0.0f && cross(p22[2] - p22[4], p22[3] - p22[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p22[4] - p22[2], p22[5] - p22[3]) >= 0.0f && cross(p22[4] - p22[0], p22[5] - p22[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (!(min == 0.0f)) {
                return false;
            }
            if (!(max == 1.0f)) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d4 = 0.0d; d4 <= 1.0d; d4 += 0.00392156862745098d) {
                if (!compare(d4, OETF, srgb.getOetfOrig()) || !compare(d4, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f4 = primaries[0];
                float f5 = primaries[1];
                float f6 = f4 + f5 + primaries[2];
                fArr[0] = f4 / f6;
                fArr[1] = f5 / f6;
                float f7 = primaries[3];
                float f8 = primaries[4];
                float f9 = f7 + f8 + primaries[5];
                fArr[2] = f7 / f9;
                fArr[3] = f8 / f9;
                float f10 = primaries[6];
                float f11 = primaries[7];
                float f12 = f10 + f11 + primaries[8];
                fArr[4] = f10 / f12;
                fArr[5] = f11 / f12;
            } else {
                ArraysKt___ArraysJvmKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
            }
            return fArr;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f4 = fArrMul3x3Float3[0];
            float f5 = fArrMul3x3Float3[1];
            float f6 = f4 + f5 + fArrMul3x3Float3[2];
            float f7 = fArrMul3x3Float32[0] + fArrMul3x3Float32[1] + fArrMul3x3Float32[2];
            float f8 = fArrMul3x3Float33[0] + fArrMul3x3Float33[1] + fArrMul3x3Float33[2];
            return new float[]{f4 / f6, f5 / f6, fArrMul3x3Float32[0] / f7, fArrMul3x3Float32[1] / f7, fArrMul3x3Float33[0] / f8, fArrMul3x3Float33[1] / f8};
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, float[] fArr, DoubleFunction oetf, DoubleFunction eotf, float f4, float f5, TransferParameters transferParameters, int i4) {
        super(name, ColorModel.INSTANCE.m9562getRgbxdoWZVw(), i4, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f4;
        this.max = f5;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d4) {
                return invoke(d4.doubleValue());
            }

            public final Double invoke(double d4) {
                return Double.valueOf(RangesKt___RangesKt.coerceIn(this.this$0.getOetfOrig().invoke(d4), this.this$0.min, this.this$0.max));
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb.oetfFunc$lambda$0(this.f139a, d4);
            }
        };
        this.eotfOrig = eotf;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d4) {
                return invoke(d4.doubleValue());
            }

            public final Double invoke(double d4) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(RangesKt___RangesKt.coerceIn(d4, this.this$0.min, this.this$0.max)));
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.k
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb.eotfFunc$lambda$1(this.f140a, d4);
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f4 >= f5) {
            throw new IllegalArgumentException("Invalid range: min=" + f4 + ", max=" + f5 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(primaries);
        this.primaries = fArrXyPrimaries;
        if (fArr == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f4, f5);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, oetf, eotf, f4, f5, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d4) {
        return d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d4, double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        return Math.pow(d5, 1.0d / d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d4, double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        return Math.pow(d5, d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 oetf, double d4) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d4))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 eotf, double d4) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d4))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 oetf, double d4) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d4))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 eotf, double d4) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d4))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters function, double d4) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d4, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters function, double d4) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d4, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters function, double d4) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d4, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters function, double d4) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d4, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb this$0, double d4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.eotfOrig.invoke(RangesKt___RangesKt.coerceIn(d4, this$0.min, this$0.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb this$0, double d4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return RangesKt___RangesKt.coerceIn(this$0.oetfOrig.invoke(d4), this$0.min, this$0.max);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    public final float[] fromLinear(float r3, float g4, float b4) {
        return fromLinear(new float[]{r3, g4, b4});
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v3);
        v3[0] = (float) this.oetfFunc.invoke(v3[0]);
        v3[1] = (float) this.oetfFunc.invoke(v3[1]);
        v3[2] = (float) this.oetfFunc.invoke(v3[2]);
        return v3;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    /* renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    /* renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    /* renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    /* renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f4 = this.min;
        int iFloatToIntBits = (iHashCode + (!((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f5 == 0.0f) ? Float.floatToIntBits(f5) : 0)) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float r3, float g4, float b4) {
        return toLinear(new float[]{r3, g4, b4});
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v22);
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(this.transform, fInvoke, fInvoke2, fInvoke3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(this.transform, fInvoke, fInvoke2, fInvoke3);
        return (Float.floatToIntBits(fMul3x3Float3_0) << 32) | (Float.floatToIntBits(fMul3x3Float3_1) & 4294967295L);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = (float) this.eotfFunc.invoke(v3[0]);
        v3[1] = (float) this.eotfFunc.invoke(v3[1]);
        v3[2] = (float) this.eotfFunc.invoke(v3[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v3);
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(v02), (float) this.eotfFunc.invoke(v12), (float) this.eotfFunc.invoke(v22));
    }

    @Override // androidx.compose.p006ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo9565xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y3, float z3, float a4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, x3, y3, z3)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, x3, y3, z3)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, x3, y3, z3)), a4, colorSpace);
    }

    public final float[] fromLinear(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = (float) this.oetfFunc.invoke(v3[0]);
        v3[1] = (float) this.oetfFunc.invoke(v3[1]);
        v3[2] = (float) this.oetfFunc.invoke(v3[2]);
        return v3;
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getPrimaries(float[] primaries) {
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] toLinear(float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = (float) this.eotfFunc.invoke(v3[0]);
        v3[1] = (float) this.eotfFunc.invoke(v3[1]);
        v3[2] = (float) this.eotfFunc.invoke(v3[2]);
        return v3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String name, float[] toXYZ, final Function1<? super Double, Double> oetf, final Function1<? super Double, Double> eotf) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb._init_$lambda$2(oetf, d4);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.i
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb._init_$lambda$3(eotf, d4);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final Function1<? super Double, Double> oetf, final Function1<? super Double, Double> eotf, float f4, float f5) {
        this(name, primaries, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb._init_$lambda$4(oetf, d4);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return Rgb._init_$lambda$5(eotf, d4);
            }
        }, f4, f5, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String name, float[] toXYZ, TransferParameters function) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(function, "function");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), function, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(java.lang.String r14, float[] r15, androidx.compose.p006ui.graphics.colorspace.WhitePoint r16, final androidx.compose.p006ui.graphics.colorspace.TransferParameters r17, int r18) {
        /*
            r13 = this;
            r9 = r17
            java.lang.String r0 = "name"
            r1 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "primaries"
            r2 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = 0
            double r5 = r17.getE()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L2a
            r0 = r5
            goto L2b
        L2a:
            r0 = r6
        L2b:
            if (r0 == 0) goto L40
            double r10 = r17.getF()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L37
            r0 = r5
            goto L38
        L37:
            r0 = r6
        L38:
            if (r0 == 0) goto L40
            androidx.compose.ui.graphics.colorspace.l r0 = new androidx.compose.ui.graphics.colorspace.l
            r0.<init>()
            goto L45
        L40:
            androidx.compose.ui.graphics.colorspace.m r0 = new androidx.compose.ui.graphics.colorspace.m
            r0.<init>()
        L45:
            r10 = r0
            double r11 = r17.getE()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            r0 = r5
            goto L51
        L50:
            r0 = r6
        L51:
            if (r0 == 0) goto L65
            double r11 = r17.getF()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r5 = r6
        L5d:
            if (r5 == 0) goto L65
            androidx.compose.ui.graphics.colorspace.n r0 = new androidx.compose.ui.graphics.colorspace.n
            r0.<init>()
            goto L6a
        L65:
            androidx.compose.ui.graphics.colorspace.o r0 = new androidx.compose.ui.graphics.colorspace.o
            r0.<init>()
        L6a:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r10
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String name, float[] toXYZ, double d4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), d4, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, double d4) {
        this(name, primaries, whitePoint, d4, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final double d4, float f4, float f5, int i4) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        if (d4 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
                @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    return Rgb._init_$lambda$10(d4, d5);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d4 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.f
                @Override // androidx.compose.p006ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    return Rgb._init_$lambda$11(d4, d5);
                }
            };
        }
        this(name, primaries, whitePoint, null, doubleFunction3, doubleFunction2, f4, f5, new TransferParameters(d4, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb colorSpace, float[] transform, WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
