package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.nestedscroll.AbstractC1378a;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p006ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m5175d2 = {"Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/gestures/Orientation;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "consumeOnOrientation", "consumeOnOrientation-8S9VItk", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation-QWom1Mo", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ConsumeAllFlingOnDirection implements NestedScrollConnection {
    private final Orientation orientation;

    public ConsumeAllFlingOnDirection(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.orientation = orientation;
    }

    /* renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m7553consumeOnOrientation8S9VItk(long j4, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? Offset.m8939copydBAh8RU$default(j4, 0.0f, 0.0f, 2, null) : Offset.m8939copydBAh8RU$default(j4, 0.0f, 0.0f, 1, null);
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m7554consumeOnOrientationQWom1Mo(long j4, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? Velocity.m11746copyOhffZ5M$default(j4, 0.0f, 0.0f, 2, null) : Velocity.m11746copyOhffZ5M$default(j4, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo7212onPostFlingRZ2iAVY(long j4, long j5, Continuation<? super Velocity> continuation) {
        return Velocity.m11741boximpl(m7554consumeOnOrientationQWom1Mo(j5, this.orientation));
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7213onPostScrollDzOQY0M(long consumed, long available, int source) {
        return NestedScrollSource.m10387equalsimpl0(source, NestedScrollSource.INSTANCE.m10393getFlingWNlRxjI()) ? m7553consumeOnOrientation8S9VItk(available, this.orientation) : Offset.INSTANCE.m8961getZeroF1C5BW0();
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo7214onPreFlingQWom1Mo(long j4, Continuation continuation) {
        return AbstractC1378a.m561c(this, j4, continuation);
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo7215onPreScrollOzD1aCk(long j4, int i4) {
        return AbstractC1378a.m562d(this, j4, i4);
    }
}
