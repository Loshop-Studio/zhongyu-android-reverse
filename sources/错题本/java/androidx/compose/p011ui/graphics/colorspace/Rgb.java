package androidx.compose.p011ui.graphics.colorspace;

import android.view.result.C0100a;
import androidx.annotation.Size;
import androidx.autofill.HintConstants;
import androidx.camera.core.ImageCapture;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\u0018\u0000 m2\u00020\u0001:\u0001mB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BE\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0013\u0010\u0018B]\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0019B%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001bB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001cB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001dB%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u001fB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010%J\u0019\u0010$\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010(J\u0019\u0010&\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010(J\u0019\u0010'\u001a\u00020\u00042\b\b\u0001\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010,J'\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0007¢\u0006\u0004\b1\u00102J\u0019\u00101\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010(J'\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0007¢\u0006\u0004\b4\u00102J\u0019\u00104\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010(J'\u0010<\u001a\u0002092\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b=\u0010>J=\u0010G\u001a\u00020D2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010(J\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IH\u0096\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0011H\u0016¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bX\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bY\u0010%R\u001a\u0010)\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010W\u001a\u0004\bZ\u0010%R\u001a\u0010[\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\n\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010^R\u001a\u0010d\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010\\\u001a\u0004\be\u0010^R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010_\u001a\u0004\bf\u0010aR\u001a\u0010g\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010\\\u001a\u0004\bh\u0010^R\u001a\u0010i\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bi\u0010kR\u001a\u0010l\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010j\u001a\u0004\bl\u0010k\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, m5110d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", HintConstants.AUTOFILL_HINT_NAME, "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLr6/c;Lr6/c;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lr6/c;Lr6/c;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "getPrimaries", "()[F", "getTransform", "getInverseTransform", "([F)[F", "inverseTransform", "component", "getMinValue", "(I)F", "getMaxValue", "r", "g", "b", "toLinear", "(FFF)[F", "v", "fromLinear", "toXyz", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics_release", "getTransform$ui_graphics_release", "getInverseTransform$ui_graphics_release", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "Lr6/c;", "getOetf", "()Lr6/c;", "oetfFunc", "getOetfFunc$ui_graphics_release", "eotfOrig", "getEotfOrig$ui_graphics_release", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics_release", "isWideGamut", "Z", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1259:1\n638#2:1260\n653#2:1261\n668#2:1265\n638#2:1266\n653#2:1267\n668#2:1268\n53#3,3:1262\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n788#1:1260\n789#1:1261\n799#1:1265\n811#1:1266\n812#1:1267\n813#1:1268\n791#1:1262,3\n*E\n"})
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DoubleFunction DoubleIdentity = new C2111a(6);

    @NotNull
    private final InterfaceC6471c eotf;

    @NotNull
    private final DoubleFunction eotfFunc;

    @NotNull
    private final DoubleFunction eotfOrig;

    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @NotNull
    private final InterfaceC6471c oetf;

    @NotNull
    private final DoubleFunction oetfFunc;

    @NotNull
    private final DoubleFunction oetfOrig;

    @NotNull
    private final float[] primaries;

    @Nullable
    private final TransferParameters transferParameters;

    @NotNull
    private final float[] transform;

    @NotNull
    private final WhitePoint whitePoint;

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0082\bJ\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J@\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0002J \u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m5110d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "generateEotf", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "generateOetf", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1#1,1259:1\n977#1:1260\n977#1:1261\n977#1:1262\n977#1:1263\n977#1:1264\n977#1:1265\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1050#1:1260\n1051#1:1261\n1057#1:1262\n1058#1:1263\n1063#1:1264\n1064#1:1265\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private final float area(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f = primaries[0];
            float f7 = primaries[1];
            float f8 = primaries[2];
            float f9 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float fM1061y = AbstractC1923c.m1061y(f, f11, (((f8 * f11) + ((f7 * f10) + (f * f9))) - (f9 * f10)) - (f7 * f8), 0.5f);
            return fM1061y < 0.0f ? -fM1061y : fM1061y;
        }

        private final boolean compare(double point, DoubleFunction a9, DoubleFunction b6) {
            return Math.abs(a9.invoke(point) - b6.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f7 = fArrMul3x3Float3[1];
            float f8 = f + f7 + fArrMul3x3Float3[2];
            return new WhitePoint(f / f8, f7 / f8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f7 = primaries[1];
            float f8 = primaries[2];
            float f9 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float x3 = whitePoint.getX();
            float y2 = whitePoint.getY();
            float f12 = 1;
            float f13 = (f12 - f) / f7;
            float f14 = (f12 - f8) / f9;
            float f15 = (f12 - f10) / f11;
            float f16 = (f12 - x3) / y2;
            float f17 = f / f7;
            float f18 = x3 / y2;
            float f19 = (f8 / f9) - f17;
            float f20 = f18 - f17;
            float f21 = f14 - f13;
            float f22 = ((f16 - f13) * f19) - (f20 * f21);
            float f23 = (f15 - f13) * f19;
            float f24 = (f10 / f11) - f17;
            float f25 = f22 / (f23 - (f21 * f24));
            float fM1037a = AbstractC1923c.m1037a(f25, f24, f20, f19);
            float f26 = (1.0f - fM1037a) - f25;
            float f27 = f26 / f7;
            float f28 = fM1037a / f9;
            float f29 = f25 / f11;
            return new float[]{f27 * f, f26, ((1.0f - f) - f7) * f27, f28 * f8, fM1037a, ((1.0f - f8) - f9) * f28, f29 * f10, f25, ((1.0f - f10) - f11) * f29};
        }

        private final boolean contains(float[] p1, float[] p22) {
            float f = p1[0];
            float f7 = p22[0];
            float f8 = p1[1];
            float f9 = p22[1];
            float f10 = p1[2];
            float f11 = p22[2];
            float f12 = p1[3];
            float f13 = p22[3];
            float f14 = p1[4];
            float f15 = p22[4];
            float f16 = p1[5];
            float f17 = p22[5];
            float[] fArr = {f - f7, f8 - f9, f10 - f11, f12 - f13, f14 - f15, f16 - f17};
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
        public final DoubleFunction generateEotf(TransferParameters function) {
            return function.isHLGish$ui_graphics_release() ? new C2114d(function, 0) : function.isPQish$ui_graphics_release() ? new C2114d(function, 1) : (function.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && function.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new C2114d(function, 2) : new C2114d(function, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$4(TransferParameters transferParameters, double d9) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release(transferParameters, d9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$5(TransferParameters transferParameters, double d9) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release(transferParameters, d9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$6(TransferParameters transferParameters, double d9) {
            return ColorSpaceKt.response(d9, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$7(TransferParameters transferParameters, double d9) {
            return ColorSpaceKt.response(d9, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(TransferParameters function) {
            return function.isHLGish$ui_graphics_release() ? new C2114d(function, 4) : function.isPQish$ui_graphics_release() ? new C2114d(function, 5) : (function.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && function.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new C2114d(function, 6) : new C2114d(function, 7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d9) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release(transferParameters, d9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d9) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release(transferParameters, d9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d9) {
            return ColorSpaceKt.rcpResponse(d9, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d9) {
            return ColorSpaceKt.rcpResponse(d9, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
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
            for (double d9 = AudioStats.AUDIO_AMPLITUDE_NONE; d9 <= 1.0d; d9 += 0.00392156862745098d) {
                if (!compare(d9, OETF, srgb.getOetfOrig()) || !compare(d9, EOTF, srgb.getEotfOrig())) {
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
                AbstractC5802q.m5180G(primaries, 0, fArr, 6);
                return fArr;
            }
            float f = primaries[0];
            float f7 = primaries[1];
            float f8 = f + f7 + primaries[2];
            fArr[0] = f / f8;
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

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f7 = fArrMul3x3Float3[1];
            float f8 = f + f7 + fArrMul3x3Float3[2];
            float f9 = fArrMul3x3Float32[0];
            float f10 = fArrMul3x3Float32[1];
            float f11 = f9 + f10 + fArrMul3x3Float32[2];
            float f12 = fArrMul3x3Float33[0];
            float f13 = fArrMul3x3Float33[1];
            float f14 = f12 + f13 + fArrMul3x3Float33[2];
            return new float[]{f / f8, f7 / f8, f9 / f11, f10 / f11, f12 / f14, f13 / f14};
        }

        private Companion() {
        }
    }

    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @Nullable float[] fArr2, @NotNull DoubleFunction doubleFunction, @NotNull DoubleFunction doubleFunction2, float f, float f7, @Nullable TransferParameters transferParameters, int i) {
        super(str, ColorModel.INSTANCE.m11096getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f7;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double invoke(double d9) {
                return Double.valueOf(AbstractC5806u.m5272k(this.this$0.getOetfOrig().invoke(d9), this.this$0.min, this.this$0.max));
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        final int i8 = 0;
        this.oetfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.b

            /* renamed from: b */
            public final /* synthetic */ Rgb f823b;

            {
                this.f823b = this;
            }

            @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d9) {
                switch (i8) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f823b, d9);
                    default:
                        return Rgb.eotfFunc$lambda$1(this.f823b, d9);
                }
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double invoke(double d9) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(AbstractC5806u.m5272k(d9, this.this$0.min, this.this$0.max)));
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        final int i9 = 1;
        this.eotfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.b

            /* renamed from: b */
            public final /* synthetic */ Rgb f823b;

            {
                this.f823b = this;
            }

            @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d9) {
                switch (i9) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f823b, d9);
                    default:
                        return Rgb.eotfFunc$lambda$1(this.f823b, d9);
                }
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f7) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f7 + "; min must be strictly < max");
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
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f, f7);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f7, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$8(double d9) {
        return d9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(InterfaceC6471c interfaceC6471c, double d9) {
        return ((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(double d9, double d10) {
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 = 0.0d;
        }
        return Math.pow(d10, 1.0d / d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(double d9, double d10) {
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 = 0.0d;
        }
        return Math.pow(d10, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d9) {
        return rgb.eotfOrig.invoke(AbstractC5806u.m5272k(d9, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d9) {
        return AbstractC5806u.m5272k(rgb.oetfOrig.invoke(d9), rgb.min, rgb.max);
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !AbstractC5830k.m5325b(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return AbstractC5830k.m5325b(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (AbstractC5830k.m5325b(this.oetfOrig, rgb.oetfOrig)) {
            return AbstractC5830k.m5325b(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Size(ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] fromLinear(float r, float g6, float b6) {
        return fromLinear(new float[]{r, g6, b6});
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v2) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v2);
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.oetfFunc.invoke(v2[0]);
        v2[1] = (float) this.oetfFunc.invoke(v2[1]);
        v2[2] = (float) this.oetfFunc.invoke(v2[2]);
        return v2;
    }

    @NotNull
    public final InterfaceC6471c getEotf() {
        return this.eotf;
    }

    @NotNull
    /* renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    @NotNull
    /* renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    @Size(9)
    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @NotNull
    /* renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @NotNull
    public final InterfaceC6471c getOetf() {
        return this.oetf;
    }

    @NotNull
    /* renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    @NotNull
    /* renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    @Size(6)
    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @NotNull
    /* renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @Size(9)
    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @NotNull
    /* renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.min;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f7 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Size(ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] toLinear(float r, float g6, float b6) {
        return toLinear(new float[]{r, g6, b6});
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f = (fArr[6] * fInvoke3) + (fArr[3] * fInvoke2) + (fArr[0] * fInvoke);
        float f7 = (fArr[7] * fInvoke3) + (fArr[4] * fInvoke2) + (fArr[1] * fInvoke);
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v2) {
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.eotfFunc.invoke(v2[0]);
        v2[1] = (float) this.eotfFunc.invoke(v2[1]);
        v2[2] = (float) this.eotfFunc.invoke(v2[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v2);
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        return (fArr[8] * fInvoke3) + (fArr[5] * fInvoke2) + (fArr[2] * fInvoke);
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo11099xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y2, float z8, float a9, @NotNull ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[6] * z8) + (fArr[3] * y2) + (fArr[0] * x3)), (float) this.oetfFunc.invoke((fArr[7] * z8) + (fArr[4] * y2) + (fArr[1] * x3)), (float) this.oetfFunc.invoke((fArr[8] * z8) + (fArr[5] * y2) + (fArr[2] * x3)), a9, colorSpace);
    }

    @Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] fromLinear(@Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) @NotNull float[] v2) {
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.oetfFunc.invoke(v2[0]);
        v2[1] = (float) this.oetfFunc.invoke(v2[1]);
        v2[2] = (float) this.oetfFunc.invoke(v2[2]);
        return v2;
    }

    @Size(min = 9)
    @NotNull
    public final float[] getInverseTransform(@Size(min = 9) @NotNull float[] inverseTransform) {
        AbstractC5802q.m5180G(this.inverseTransform, 0, inverseTransform, 14);
        return inverseTransform;
    }

    @Size(min = 6)
    @NotNull
    public final float[] getPrimaries(@Size(min = 6) @NotNull float[] primaries) {
        AbstractC5802q.m5180G(this.primaries, 0, primaries, 14);
        return primaries;
    }

    @Size(min = 9)
    @NotNull
    public final float[] getTransform(@Size(min = 9) @NotNull float[] transform) {
        AbstractC5802q.m5180G(this.transform, 0, transform, 14);
        return transform;
    }

    @Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] toLinear(@Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) @NotNull float[] v2) {
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.eotfFunc.invoke(v2[0]);
        v2[1] = (float) this.eotfFunc.invoke(v2[1]);
        v2[2] = (float) this.eotfFunc.invoke(v2[2]);
        return v2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(9) @NotNull float[] fArr, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new C0100a(interfaceC6471c, 2), new C0100a(interfaceC6471c2, 3), 0.0f, 1.0f, null, -1);
    }

    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(max = 9, min = 6) @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, float f, float f7) {
        this(str, fArr, whitePoint, null, new C0100a(interfaceC6471c, 4), new C0100a(interfaceC6471c2, 5), f, f7, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(9) @NotNull float[] fArr, @NotNull TransferParameters transferParameters) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(max = 9, min = 6) @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull TransferParameters transferParameters, int i) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(9) @NotNull float[] fArr, double d9) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d9, 0.0f, 1.0f, -1);
    }

    public Rgb(@Size(min = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) @NotNull String str, @Size(max = 9, min = 6) @NotNull float[] fArr, @NotNull WhitePoint whitePoint, double d9) {
        this(str, fArr, whitePoint, d9, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, final double d9, float f, float f7, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d9 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            final int i8 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    switch (i8) {
                        case 0:
                            return Rgb._init_$lambda$6(d9, d10);
                        default:
                            return Rgb._init_$lambda$7(d9, d10);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d9 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            final int i9 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d10) {
                    switch (i9) {
                        case 0:
                            return Rgb._init_$lambda$6(d9, d10);
                        default:
                            return Rgb._init_$lambda$7(d9, d10);
                    }
                }
            };
        }
        DoubleFunction doubleFunction4 = doubleFunction2;
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction4, f, f7, new TransferParameters(d9, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), i);
    }

    public Rgb(@NotNull Rgb rgb, @NotNull float[] fArr, @NotNull WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
