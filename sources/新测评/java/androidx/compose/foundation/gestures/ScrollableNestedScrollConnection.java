package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m13558d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z9) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z9;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo17452onPostFlingRZ2iAVY(long r4, long r6, kotlin.coroutines.Continuation<? super androidx.compose.p013ui.unit.Velocity> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r4 == 0) goto L13
            r4 = r8
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r4
            int r5 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.label = r5
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r4.<init>(r3, r8)
        L18:
            java.lang.Object r5 = r4.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L36
            if (r0 != r1) goto L2e
            long r6 = r4.J$0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L77
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            long r6 = r4.J$0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L63
        L3c:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r3.enabled
            if (r5 == 0) goto L82
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.NewNestedFlingPropagationEnabled
            if (r5 == 0) goto L6a
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            boolean r5 = r5.getIsFlinging()
            if (r5 == 0) goto L56
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p013ui.unit.Velocity.INSTANCE
            long r4 = r4.m23810getZero9UxMQ8M()
            goto L7d
        L56:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r5 = r5.m17465doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L63
            goto L76
        L63:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p013ui.unit.Velocity) r5
            long r4 = r5.getPackedValue()
            goto L7d
        L6a:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r1
            java.lang.Object r5 = r5.m17465doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L77
        L76:
            return r8
        L77:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p013ui.unit.Velocity) r5
            long r4 = r5.getPackedValue()
        L7d:
            long r4 = androidx.compose.p013ui.unit.Velocity.m23802minusAH228Gc(r6, r4)
            goto L88
        L82:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p013ui.unit.Velocity.INSTANCE
            long r4 = r4.m23810getZero9UxMQ8M()
        L88:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.p013ui.unit.Velocity.m23790boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo17452onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo17453onPostScrollDzOQY0M(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.m17467performRawScrollMKHz9U(available) : Offset.INSTANCE.m20751getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z9) {
        this.enabled = z9;
    }
}
