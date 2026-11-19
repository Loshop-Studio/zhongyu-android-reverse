package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;

/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z10) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z10;
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
    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo27229onPostFlingRZ2iAVY(long r4, long r6, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r8) throws java.lang.Throwable {
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
            java.lang.Object r8 = p393wc.AbstractC11725a.m25952f()
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L36
            if (r0 != r1) goto L2e
            long r6 = r4.J$0
            kotlin.AbstractC9924b.m20071b(r5)
            goto L77
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            long r6 = r4.J$0
            kotlin.AbstractC9924b.m20071b(r5)
            goto L63
        L3c:
            kotlin.AbstractC9924b.m20071b(r5)
            boolean r5 = r3.enabled
            if (r5 == 0) goto L82
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.NewNestedFlingPropagationEnabled
            if (r5 == 0) goto L6a
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            boolean r5 = r5.isFlinging()
            if (r5 == 0) goto L56
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p014ui.unit.Velocity.Companion
            long r4 = r4.m33750getZero9UxMQ8M()
            goto L7d
        L56:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r5 = r5.m27242doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L63
            goto L76
        L63:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p014ui.unit.Velocity) r5
            long r4 = r5.m33748unboximpl()
            goto L7d
        L6a:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r1
            java.lang.Object r5 = r5.m27242doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L77
        L76:
            return r8
        L77:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p014ui.unit.Velocity) r5
            long r4 = r5.m33748unboximpl()
        L7d:
            long r4 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r6, r4)
            goto L88
        L82:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p014ui.unit.Velocity.Companion
            long r4 = r4.m33750getZero9UxMQ8M()
        L88:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo27229onPostFlingRZ2iAVY(long, long, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return this.enabled ? this.scrollingLogic.m27244performRawScrollMKHz9U(j11) : Offset.Companion.m30653getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }
}
