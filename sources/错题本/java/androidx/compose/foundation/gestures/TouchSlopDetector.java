package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000f\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Offset;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/e;)V", "", "touchSlop", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "calculatePostSlopOffset", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "crossAxis-k-4lQ0M", "crossAxis", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragEvent", "addPointerInputChange-dBAh8RU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "addPointerInputChange", "Ld6/s;", "reset", "()V", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "totalPositionChange", "J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1045:1\n65#2:1046\n69#2:1049\n69#2:1051\n65#2:1054\n60#3:1047\n70#3:1050\n70#3:1052\n60#3:1055\n53#3,3:1057\n53#3,3:1061\n22#4:1048\n22#4:1053\n30#5:1056\n30#5:1060\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n*L\n881#1:1046\n881#1:1049\n883#1:1051\n883#1:1054\n881#1:1047\n881#1:1050\n883#1:1052\n883#1:1055\n931#1:1057,3\n933#1:1061,3\n881#1:1048\n883#1:1053\n931#1:1056\n933#1:1060\n*E\n"})
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;

    @Nullable
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j7, AbstractC5824e abstractC5824e) {
        this(orientation, j7);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m7057calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j7 = this.totalPositionChange;
            return Offset.m10445minusMKHz9U(this.totalPositionChange, Offset.m10448timestuRUvjQ(Offset.m10436divtuRUvjQ(j7, Offset.m10439getDistanceimpl(j7)), touchSlop));
        }
        float fM7060mainAxisk4lQ0M = m7060mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m7060mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float fM7059crossAxisk4lQ0M = m7059crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m10433constructorimpl((Float.floatToRawIntBits(fM7060mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM7059crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(fM7059crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM7060mainAxisk4lQ0M) & 4294967295L));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m7058addPointerInputChangedBAh8RU(@NotNull PointerInputChange dragEvent, float touchSlop) {
        long jM10446plusMKHz9U = Offset.m10446plusMKHz9U(this.totalPositionChange, Offset.m10445minusMKHz9U(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jM10446plusMKHz9U;
        return (this.orientation == null ? Offset.m10439getDistanceimpl(jM10446plusMKHz9U) : Math.abs(m7060mainAxisk4lQ0M(jM10446plusMKHz9U))) >= touchSlop ? m7057calculatePostSlopOffsettuRUvjQ(touchSlop) : Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m7059crossAxisk4lQ0M(long j7) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j7 & 4294967295L : j7 >> 32));
    }

    @Nullable
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m7060mainAxisk4lQ0M(long j7) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j7 >> 32 : j7 & 4294967295L));
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    private TouchSlopDetector(Orientation orientation, long j7) {
        this.orientation = orientation;
        this.totalPositionChange = j7;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j7, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7, null);
    }
}
