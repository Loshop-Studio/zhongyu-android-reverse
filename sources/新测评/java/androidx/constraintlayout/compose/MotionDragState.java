package androidx.constraintlayout.compose;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u000f\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0016\u0010\u0011\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionDragState;", "", "isDragging", "", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "velocity", "Landroidx/compose/ui/unit/Velocity;", "(ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDragAmount-F1C5BW0", "()J", "J", "()Z", "getVelocity-9UxMQ8M", "component1", "component2", "component2-F1C5BW0", "component3", "component3-9UxMQ8M", "copy", "copy-dhPbTwU", "(ZJJ)Landroidx/constraintlayout/compose/MotionDragState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MotionDragState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long dragAmount;
    private final boolean isDragging;
    private final long velocity;

    @Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionDragState$Companion;", "", "()V", "onDrag", "Landroidx/constraintlayout/compose/MotionDragState;", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "onDrag-k-4lQ0M", "(J)Landroidx/constraintlayout/compose/MotionDragState;", "onDragEnd", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragEnd-TH1AsA0", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public final MotionDragState m23974onDragk4lQ0M(long dragAmount) {
            return new MotionDragState(true, dragAmount, Velocity.INSTANCE.m23810getZero9UxMQ8M(), null);
        }

        /* renamed from: onDragEnd-TH1AsA0, reason: not valid java name */
        public final MotionDragState m23975onDragEndTH1AsA0(long velocity) {
            return new MotionDragState(false, Offset.INSTANCE.m20750getUnspecifiedF1C5BW0(), velocity, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MotionDragState(boolean z9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, j10, j11);
    }

    /* renamed from: copy-dhPbTwU$default, reason: not valid java name */
    public static /* synthetic */ MotionDragState m23968copydhPbTwU$default(MotionDragState motionDragState, boolean z9, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = motionDragState.isDragging;
        }
        if ((i10 & 2) != 0) {
            j10 = motionDragState.dragAmount;
        }
        if ((i10 & 4) != 0) {
            j11 = motionDragState.velocity;
        }
        return motionDragState.m23971copydhPbTwU(z9, j10, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getDragAmount() {
        return this.dragAmount;
    }

    /* renamed from: component3-9UxMQ8M, reason: not valid java name and from getter */
    public final long getVelocity() {
        return this.velocity;
    }

    /* renamed from: copy-dhPbTwU, reason: not valid java name */
    public final MotionDragState m23971copydhPbTwU(boolean isDragging, long dragAmount, long velocity) {
        return new MotionDragState(isDragging, dragAmount, velocity, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionDragState)) {
            return false;
        }
        MotionDragState motionDragState = (MotionDragState) other;
        return this.isDragging == motionDragState.isDragging && Offset.m20732equalsimpl0(this.dragAmount, motionDragState.dragAmount) && Velocity.m23798equalsimpl0(this.velocity, motionDragState.velocity);
    }

    /* renamed from: getDragAmount-F1C5BW0, reason: not valid java name */
    public final long m23972getDragAmountF1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
    public final long m23973getVelocity9UxMQ8M() {
        return this.velocity;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isDragging) * 31) + Offset.m20737hashCodeimpl(this.dragAmount)) * 31) + Velocity.m23801hashCodeimpl(this.velocity);
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public String toString() {
        return "MotionDragState(isDragging=" + this.isDragging + ", dragAmount=" + ((Object) Offset.m20743toStringimpl(this.dragAmount)) + ", velocity=" + ((Object) Velocity.m23806toStringimpl(this.velocity)) + ')';
    }

    private MotionDragState(boolean z9, long j10, long j11) {
        this.isDragging = z9;
        this.dragAmount = j10;
        this.velocity = j11;
    }
}
