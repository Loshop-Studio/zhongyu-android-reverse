package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import p325rc.AbstractC10964p;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo27229onPostFlingRZ2iAVY(long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        if (!this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m33739getXimpl(j11)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m33740getYimpl(j11)), true)) {
            j11 = Velocity.Companion.m33750getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m33730boximpl(j11);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m32693getScrollAxesk4lQ0M(j11), NestedScrollInteropConnectionKt.m32695toViewTypeGyEprt8(i10))) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        AbstractC10964p.m23989D(this.consumedScrollCache, 0, 0, 0, 6, null);
        this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j10 >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j10 & 4294967295L))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j11 >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j11 & 4294967295L))), null, NestedScrollInteropConnectionKt.m32695toViewTypeGyEprt8(i10), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m32694toOffsetUv8p0NA(this.consumedScrollCache, j11);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo27535onPreFlingQWom1Mo(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m33739getXimpl(j10)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m33740getYimpl(j10)))) {
            j10 = Velocity.Companion.m33750getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m33730boximpl(j10);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo27536onPreScrollOzD1aCk(long j10, int i10) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m32693getScrollAxesk4lQ0M(j10), NestedScrollInteropConnectionKt.m32695toViewTypeGyEprt8(i10))) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        AbstractC10964p.m23989D(this.consumedScrollCache, 0, 0, 0, 6, null);
        this.nestedScrollChildHelper.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j10 >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j10))), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m32695toViewTypeGyEprt8(i10));
        return NestedScrollInteropConnectionKt.m32694toOffsetUv8p0NA(this.consumedScrollCache, j10);
    }
}
