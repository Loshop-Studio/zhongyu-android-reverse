package androidx.compose.foundation.gestures;

import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000f*\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u0005X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m13413d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "initialPositionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "totalPositionChange", "J", "addPointerInputChange", "dragEvent", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "touchSlop", "", "addPointerInputChange-dBAh8RU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "calculatePostSlopOffset", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "reset", "", "crossAxis", "crossAxis-k-4lQ0M", "(J)F", "mainAxis", "mainAxis-k-4lQ0M", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1045:1\n65#2:1046\n69#2:1049\n69#2:1051\n65#2:1054\n60#3:1047\n70#3:1050\n70#3:1052\n60#3:1055\n53#3,3:1057\n53#3,3:1061\n22#4:1048\n22#4:1053\n30#5:1056\n30#5:1060\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n*L\n881#1:1046\n881#1:1049\n883#1:1051\n883#1:1054\n881#1:1047\n881#1:1050\n883#1:1052\n883#1:1055\n931#1:1057,3\n933#1:1061,3\n881#1:1048\n883#1:1053\n931#1:1056\n933#1:1060\n*E\n"})
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j9);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m17909calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j9 = this.totalPositionChange;
            return Offset.m21172minusMKHz9U(this.totalPositionChange, Offset.m21175timestuRUvjQ(Offset.m21163divtuRUvjQ(j9, Offset.m21166getDistanceimpl(j9)), touchSlop));
        }
        float fM17912mainAxisk4lQ0M = m17912mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m17912mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float fM17911crossAxisk4lQ0M = m17911crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m21160constructorimpl((Float.floatToRawIntBits(fM17912mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM17911crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m21160constructorimpl((Float.floatToRawIntBits(fM17911crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM17912mainAxisk4lQ0M) & 4294967295L));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m17910addPointerInputChangedBAh8RU(PointerInputChange dragEvent, float touchSlop) {
        long jM21173plusMKHz9U = Offset.m21173plusMKHz9U(this.totalPositionChange, Offset.m21172minusMKHz9U(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jM21173plusMKHz9U;
        return (this.orientation == null ? Offset.m21166getDistanceimpl(jM21173plusMKHz9U) : Math.abs(m17912mainAxisk4lQ0M(jM21173plusMKHz9U))) >= touchSlop ? m17909calculatePostSlopOffsettuRUvjQ(touchSlop) : Offset.INSTANCE.m21183getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m17911crossAxisk4lQ0M(long j9) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j9 & 4294967295L : j9 >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m17912mainAxisk4lQ0M(long j9) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j9 >> 32 : j9 & 4294967295L));
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m21184getZeroF1C5BW0();
    }

    private TouchSlopDetector(Orientation orientation, long j9) {
        this.orientation = orientation;
        this.totalPositionChange = j9;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : orientation, (i9 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9, null);
    }
}
