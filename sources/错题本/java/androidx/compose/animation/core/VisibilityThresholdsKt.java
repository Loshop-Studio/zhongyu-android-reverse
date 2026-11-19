package androidx.compose.animation.core;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.DpOffset;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.C5828i;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"4\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00000\u00078\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0013\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016\"\u0015\u0010\u0013\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019\"\u0015\u0010\u0013\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001c\"\u0015\u0010\u0013\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001f\"\u0015\u0010\u0013\u001a\u00020!*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\"\"\u0015\u0010\u0013\u001a\u00020$*\u00020#8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010%\"\u0015\u0010\u0013\u001a\u00020\u0004*\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010'¨\u0006("}, m5110d2 = {"", "DpVisibilityThreshold", "F", "PxVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "RectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "VisibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/i;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,115:1\n32#2:116\n80#3:117\n53#3,3:119\n53#3,3:124\n53#3,3:128\n80#3:132\n30#4:118\n123#5:122\n188#5:123\n33#6:127\n30#7:131\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n40#1:116\n40#1:117\n48#1:119,3\n72#1:124,3\n80#1:128,3\n88#1:132\n48#1:118\n64#1:122\n72#1:123\n80#1:127\n88#1:131\n*E\n"})
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;

    @NotNull
    private static final Rect RectVisibilityThreshold;

    @NotNull
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C5828i.f9220a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = new Pair(vectorConverter, fValueOf2);
        Pair pair2 = new Pair(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf2);
        Pair pair3 = new Pair(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf2);
        Pair pair4 = new Pair(VectorConvertersKt.getVectorConverter(C5825f.f9219a), Float.valueOf(0.01f));
        Pair pair5 = new Pair(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf);
        Pair pair6 = new Pair(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf);
        Pair pair7 = new Pair(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf);
        TwoWayConverter<C2331Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C2331Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        VisibilityThresholdMap = AbstractC5785e0.m5151E(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(vectorConverter2, fValueOf3), new Pair(VectorConvertersKt.getVectorConverter(DpOffset.INSTANCE), fValueOf3));
    }

    public static final int getVisibilityThreshold(@NotNull C5828i c5828i) {
        return 1;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final long getVisibilityThreshold(@NotNull DpOffset.Companion companion) {
        C2331Dp.Companion companion2 = C2331Dp.INSTANCE;
        float visibilityThreshold = getVisibilityThreshold(companion2);
        float visibilityThreshold2 = getVisibilityThreshold(companion2);
        return DpOffset.m13361constructorimpl((Float.floatToRawIntBits(visibilityThreshold) << 32) | (Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        long j7 = 1;
        return IntOffset.m13427constructorimpl((j7 & 4294967295L) | (j7 << 32));
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(@NotNull C2331Dp.Companion companion) {
        return C2331Dp.m13305constructorimpl(0.1f);
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        return Size.m10501constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        long j7 = 1;
        return IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
    }
}
