package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m5110d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/geometry/Offset;", "", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "Landroidx/compose/ui/unit/Velocity;", "consumeOnOrientation-QWom1Mo", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,592:1\n65#2:593\n69#2:596\n65#2:598\n69#2:601\n65#2:604\n69#2:607\n60#3:594\n70#3:597\n60#3:599\n70#3:602\n60#3:605\n70#3:608\n22#4:595\n22#4:600\n22#4:603\n22#4:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n*L\n505#1:593\n505#1:596\n510#1:598\n511#1:601\n534#1:604\n534#1:607\n505#1:594\n505#1:597\n510#1:599\n511#1:602\n534#1:605\n534#1:608\n505#1:595\n510#1:600\n511#1:603\n534#1:606\n*E\n"})
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    @NotNull
    private final Orientation orientation;

    @NotNull
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(@NotNull PagerState pagerState, @NotNull Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m7502mainAxisk4lQ0M(long j7) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j7 >> 32 : j7 & 4294967295L));
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m7503consumeOnOrientationQWom1Mo(long j7, @NotNull Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m13539copyOhffZ5M$default(j7, 0.0f, 0.0f, 2, null) : Velocity.m13539copyOhffZ5M$default(j7, 0.0f, 0.0f, 1, null);
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo7033onPostFlingRZ2iAVY(long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return Velocity.m13534boximpl(m7503consumeOnOrientationQWom1Mo(j8, this.orientation));
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11799getSideEffectWNlRxjI()) || m7502mainAxisk4lQ0M(available) == 0.0f) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7340onPreScrollOzD1aCk(long available, int source) {
        if (!NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI()) || Math.abs(this.state.getCurrentPageOffsetFraction()) <= 1.0E-6d) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
        float pageSpacing = ((this.state.getLayoutInfo().getPageSpacing() + this.state.getLayoutInfo().getPageSize()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
        if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
            pageSpacing = currentPageOffsetFraction;
            currentPageOffsetFraction = pageSpacing;
        }
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Horizontal;
        float fIntBitsToFloat = -this.state.dispatchRawDelta(-AbstractC5806u.m5273l(Float.intBitsToFloat((int) (orientation == orientation2 ? available >> 32 : available & 4294967295L)), currentPageOffsetFraction, pageSpacing));
        float fIntBitsToFloat2 = this.orientation == orientation2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (available >> 32));
        if (this.orientation != Orientation.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        }
        return Offset.m10434copydBAh8RU(available, fIntBitsToFloat2, fIntBitsToFloat);
    }
}
