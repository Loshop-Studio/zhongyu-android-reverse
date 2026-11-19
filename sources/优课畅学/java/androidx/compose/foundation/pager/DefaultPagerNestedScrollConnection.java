package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import p077d8.AbstractC8323h;
import p179m7.InterfaceC9324c;

/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    private final Orientation orientation;
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m21096mainAxisk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m21097consumeOnOrientationQWom1Mo(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m27133copyOhffZ5M$default(j10, 0.0f, 0.0f, 2, null) : Velocity.m27133copyOhffZ5M$default(j10, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo20627onPostFlingRZ2iAVY(long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return Velocity.m27128boximpl(m21097consumeOnOrientationQWom1Mo(j11, this.orientation));
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25393getSideEffectWNlRxjI()) || m21096mainAxisk4lQ0M(j11) == 0.0f) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo20934onPreScrollOzD1aCk(long j10, int i10) {
        if (!NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25394getUserInputWNlRxjI()) || Math.abs(this.state.getCurrentPageOffsetFraction()) <= 1.0E-6d) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
        float pageSize = ((this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
        if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
            pageSize = currentPageOffsetFraction;
            currentPageOffsetFraction = pageSize;
        }
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Horizontal;
        float fIntBitsToFloat = -this.state.dispatchRawDelta(-AbstractC8323h.m13517l(Float.intBitsToFloat((int) (orientation == orientation2 ? j10 >> 32 : j10 & 4294967295L)), currentPageOffsetFraction, pageSize));
        float fIntBitsToFloat2 = this.orientation == orientation2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j10 >> 32));
        if (this.orientation != Orientation.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return Offset.m24028copydBAh8RU(j10, fIntBitsToFloat2, fIntBitsToFloat);
    }
}
