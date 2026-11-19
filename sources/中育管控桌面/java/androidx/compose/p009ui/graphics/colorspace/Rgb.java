package androidx.compose.p009ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import androidx.autofill.HintConstants;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.graphics.colorspace.Rgb;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^BC\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nB[\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J \u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010?\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0007J\u0012\u0010E\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\u0005H\u0007J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\b\u0010I\u001a\u00020\u0005H\u0007J\u0012\u0010I\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010J\u001a\u00020\u0005H\u0007J\u0012\u0010J\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010K\u001a\u00020\u0017H\u0016J \u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010L\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ=\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m7880d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1259:1\n638#2:1260\n653#2:1261\n668#2:1265\n638#2:1266\n653#2:1267\n668#2:1268\n53#3,3:1262\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n788#1:1260\n789#1:1261\n799#1:1265\n811#1:1266\n812#1:1267\n813#1:1268\n791#1:1262,3\n*E\n"})
/* loaded from: classes2.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.i
        @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d6) {
            return Rgb.DoubleIdentity$lambda$8(d6);
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

    @Metadata(m7879d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0082\bJ\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J@\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0002J \u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m7880d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "generateEotf", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "generateOetf", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1#1,1259:1\n977#1:1260\n977#1:1261\n977#1:1262\n977#1:1263\n977#1:1264\n977#1:1265\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1050#1:1260\n1051#1:1261\n1057#1:1262\n1058#1:1263\n1063#1:1264\n1064#1:1265\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f6 = primaries[0];
            float f7 = primaries[1];
            float f8 = primaries[2];
            float f9 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float f12 = ((((((f6 * f9) + (f7 * f10)) + (f8 * f11)) - (f9 * f10)) - (f7 * f8)) - (f6 * f11)) * 0.5f;
            return f12 < 0.0f ? -f12 : f12;
        }

        private final boolean compare(double point, DoubleFunction a7, DoubleFunction b7) {
            return Math.abs(a7.invoke(point) - b7.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f6 = fArrMul3x3Float3[0];
            float f7 = fArrMul3x3Float3[1];
            float f8 = f6 + f7 + fArrMul3x3Float3[2];
            return new WhitePoint(f6 / f8, f7 / f8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f6 = primaries[0];
            float f7 = primaries[1];
            float f8 = primaries[2];
            float f9 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float x6 = whitePoint.getX();
            float y6 = whitePoint.getY();
            float f12 = 1;
            float f13 = (f12 - f6) / f7;
            float f14 = (f12 - f8) / f9;
            float f15 = (f12 - f10) / f11;
            float f16 = (f12 - x6) / y6;
            float f17 = f6 / f7;
            float f18 = (f8 / f9) - f17;
            float f19 = (x6 / y6) - f17;
            float f20 = f14 - f13;
            float f21 = (f10 / f11) - f17;
            float f22 = (((f16 - f13) * f18) - (f19 * f20)) / (((f15 - f13) * f18) - (f20 * f21));
            float f23 = (f19 - (f21 * f22)) / f18;
            float f24 = (1.0f - f23) - f22;
            float f25 = f24 / f7;
            float f26 = f23 / f9;
            float f27 = f22 / f11;
            return new float[]{f25 * f6, f24, f25 * ((1.0f - f6) - f7), f26 * f8, f23, f26 * ((1.0f - f8) - f9), f27 * f10, f22, f27 * ((1.0f - f10) - f11)};
        }

        private final boolean contains(float[] p12, float[] p22) {
            float f6 = p12[0];
            float f7 = p22[0];
            float f8 = p12[1];
            float f9 = p22[1];
            float f10 = p12[2];
            float f11 = p22[2];
            float f12 = p12[3];
            float f13 = p22[3];
            float f14 = p12[4];
            float f15 = p22[4];
            float f16 = p12[5];
            float f17 = p22[5];
            float[] fArr = {f6 - f7, f8 - f9, f10 - f11, f12 - f13, f14 - f15, f16 - f17};
            float f18 = fArr[0];
            float f19 = fArr[1];
            if (((f9 - f17) * f18) - ((f7 - f15) * f19) >= 0.0f && ((f7 - f11) * f19) - ((f9 - f13) * f18) >= 0.0f) {
                float f20 = fArr[2];
                float f21 = fArr[3];
                if (((f13 - f9) * f20) - ((f11 - f7) * f21) >= 0.0f && ((f11 - f15) * f21) - ((f13 - f17) * f20) >= 0.0f) {
                    float f22 = fArr[4];
                    float f23 = fArr[5];
                    if (((f17 - f13) * f22) - ((f15 - f11) * f23) >= 0.0f && ((f15 - f7) * f23) - ((f17 - f9) * f22) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(final TransferParameters function) {
            return function.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.p
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateEotf$lambda$4(function, d6);
                }
            } : function.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateEotf$lambda$5(function, d6);
                }
            } : (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.r
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateEotf$lambda$6(function, d6);
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.s
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateEotf$lambda$7(function, d6);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$4(TransferParameters transferParameters, double d6) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release(transferParameters, d6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$5(TransferParameters transferParameters, double d6) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release(transferParameters, d6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$6(TransferParameters transferParameters, double d6) {
            return ColorSpaceKt.response(d6, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$7(TransferParameters transferParameters, double d6) {
            return ColorSpaceKt.response(d6, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(final TransferParameters function) {
            return function.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.t
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateOetf$lambda$0(function, d6);
                }
            } : function.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.u
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateOetf$lambda$1(function, d6);
                }
            } : (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.v
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateOetf$lambda$2(function, d6);
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.w
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d6) {
                    return Rgb.Companion.generateOetf$lambda$3(function, d6);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d6) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release(transferParameters, d6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d6) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release(transferParameters, d6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d6) {
            return ColorSpaceKt.rcpResponse(d6, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d6) {
            return ColorSpaceKt.rcpResponse(d6, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d6 = 0.0d; d6 <= 1.0d; d6 += 0.00392156862745098d) {
                if (!compare(d6, OETF, srgb.getOetfOrig()) || !compare(d6, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) {
                return min < 0.0f && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                ArraysKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
                return fArr;
            }
            float f6 = primaries[0];
            float f7 = primaries[1];
            float f8 = f6 + f7 + primaries[2];
            fArr[0] = f6 / f8;
            fArr[1] = f7 / f8;
            float f9 = primaries[3];
            float f10 = primaries[4];
            float f11 = f9 + f10 + primaries[5];
            fArr[2] = f9 / f11;
            fArr[3] = f10 / f11;
            float f12 = primaries[6];
            float f13 = primaries[7];
            float f14 = f12 + f13 + primaries[8];
            fArr[4] = f12 / f14;
            fArr[5] = f13 / f14;
            return fArr;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f6 = fArrMul3x3Float3[0];
            float f7 = fArrMul3x3Float3[1];
            float f8 = f6 + f7 + fArrMul3x3Float3[2];
            float f9 = fArrMul3x3Float32[0];
            float f10 = fArrMul3x3Float32[1];
            float f11 = f9 + f10 + fArrMul3x3Float32[2];
            float f12 = fArrMul3x3Float33[0];
            float f13 = fArrMul3x3Float33[1];
            float f14 = f12 + f13 + fArrMul3x3Float33[2];
            return new float[]{f6 / f8, f7 / f8, f9 / f11, f10 / f11, f12 / f14, f13 / f14};
        }

        private Companion() {
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f6, float f7, TransferParameters transferParameters, int i6) {
        super(str, ColorModel.INSTANCE.m14313getRgbxdoWZVw(), i6, null);
        this.whitePoint = whitePoint;
        this.min = f6;
        this.max = f7;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double invoke(double d6) {
                return Double.valueOf(RangesKt.coerceIn(this.this$0.getOetfOrig().invoke(d6), this.this$0.min, this.this$0.max));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d6) {
                return invoke(d6.doubleValue());
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb.oetfFunc$lambda$0(this.f198a, d6);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double invoke(double d6) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(RangesKt.coerceIn(d6, this.this$0.min, this.this$0.max)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d6) {
                return invoke(d6.doubleValue());
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb.eotfFunc$lambda$1(this.f199a, d6);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f6 >= f7) {
            throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f7 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
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
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f6, f7);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f6, f7, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$8(double d6) {
        return d6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d6) {
        return ((Number) function1.invoke(Double.valueOf(d6))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d6) {
        return ((Number) function1.invoke(Double.valueOf(d6))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d6) {
        return ((Number) function1.invoke(Double.valueOf(d6))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d6) {
        return ((Number) function1.invoke(Double.valueOf(d6))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(double d6, double d7) {
        if (d7 < 0.0d) {
            d7 = 0.0d;
        }
        return Math.pow(d7, 1.0d / d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(double d6, double d7) {
        if (d7 < 0.0d) {
            d7 = 0.0d;
        }
        return Math.pow(d7, d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d6) {
        return rgb.eotfOrig.invoke(RangesKt.coerceIn(d6, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d6) {
        return RangesKt.coerceIn(rgb.oetfOrig.invoke(d6), rgb.min, rgb.max);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
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

    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] fromLinear(float r6, float g6, float b7) {
        return fromLinear(new float[]{r6, g6, b7});
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v6) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v6);
        if (v6.length < 3) {
            return v6;
        }
        v6[0] = (float) this.oetfFunc.invoke(v6[0]);
        v6[1] = (float) this.oetfFunc.invoke(v6[1]);
        v6[2] = (float) this.oetfFunc.invoke(v6[2]);
        return v6;
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

    @Size(9)
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    /* renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
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

    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    /* renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @Size(9)
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    /* renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f6 = this.min;
        int iFloatToIntBits = (iHashCode + (f6 == 0.0f ? 0 : Float.floatToIntBits(f6))) * 31;
        float f7 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toLinear(float r6, float g6, float b7) {
        return toLinear(new float[]{r6, g6, b7});
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v22);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f6 = (fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3);
        float f7 = (fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3);
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v6) {
        if (v6.length < 3) {
            return v6;
        }
        v6[0] = (float) this.eotfFunc.invoke(v6[0]);
        v6[1] = (float) this.eotfFunc.invoke(v6[1]);
        v6[2] = (float) this.eotfFunc.invoke(v6[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v6);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v22);
        float[] fArr = this.transform;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo14316xyzaToColorJlNiLsg$ui_graphics_release(float x6, float y6, float z6, float a7, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * x6) + (fArr[3] * y6) + (fArr[6] * z6)), (float) this.oetfFunc.invoke((fArr[1] * x6) + (fArr[4] * y6) + (fArr[7] * z6)), (float) this.oetfFunc.invoke((fArr[2] * x6) + (fArr[5] * y6) + (fArr[8] * z6)), a7, colorSpace);
    }

    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] fromLinear(@Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) float[] v6) {
        if (v6.length < 3) {
            return v6;
        }
        v6[0] = (float) this.oetfFunc.invoke(v6[0]);
        v6[1] = (float) this.oetfFunc.invoke(v6[1]);
        v6[2] = (float) this.oetfFunc.invoke(v6[2]);
        return v6;
    }

    @Size(min = 9)
    public final float[] getInverseTransform(@Size(min = 9) float[] inverseTransform) {
        return ArraysKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    public final float[] getPrimaries(@Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] primaries) {
        return ArraysKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
    }

    @Size(min = 9)
    public final float[] getTransform(@Size(min = 9) float[] transform) {
        return ArraysKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
    }

    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toLinear(@Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) float[] v6) {
        if (v6.length < 3) {
            return v6;
        }
        v6[0] = (float) this.eotfFunc.invoke(v6[0]);
        v6[1] = (float) this.eotfFunc.invoke(v6[1]);
        v6[2] = (float) this.eotfFunc.invoke(v6[2]);
        return v6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb._init_$lambda$2(function1, d6);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.k
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb._init_$lambda$3(function12, d6);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function12, float f6, float f7) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb._init_$lambda$4(function1, d6);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d6) {
                return Rgb._init_$lambda$5(function12, d6);
            }
        }, f6, f7, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, TransferParameters transferParameters) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i6) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = 1) String str, @Size(9) float[] fArr, double d6) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d6, 0.0f, 1.0f, -1);
    }

    public Rgb(@Size(min = 1) String str, @Size(max = 9, min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) float[] fArr, WhitePoint whitePoint, double d6) {
        this(str, fArr, whitePoint, d6, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d6, float f6, float f7, int i6) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d6 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.l
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d7) {
                    return Rgb._init_$lambda$6(d6, d7);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d6 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.m
                @Override // androidx.compose.p009ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d7) {
                    return Rgb._init_$lambda$7(d6, d7);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f6, f7, new TransferParameters(d6, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i6);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
