package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;

    @NotNull
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(@NotNull ScrollingLogic scrollingLogic, boolean z8) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z8;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7033onPostFlingRZ2iAVY(long r4, long r6, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r8) {
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L34
            if (r0 != r1) goto L2c
            long r6 = r4.J$0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L75
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            long r6 = r4.J$0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L61
        L3a:
            kotlin.AbstractC5774b.m5119b(r5)
            boolean r5 = r3.enabled
            if (r5 == 0) goto L80
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.NewNestedFlingPropagationEnabled
            if (r5 == 0) goto L68
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            boolean r5 = r5.getIsFlinging()
            if (r5 == 0) goto L54
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r4 = r4.m13554getZero9UxMQ8M()
            goto L7b
        L54:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r5 = r5.m7046doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L61
            goto L74
        L61:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p011ui.unit.Velocity) r5
            long r4 = r5.getPackedValue()
            goto L7b
        L68:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r1
            java.lang.Object r5 = r5.m7046doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L75
        L74:
            return r8
        L75:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.p011ui.unit.Velocity) r5
            long r4 = r5.getPackedValue()
        L7b:
            long r4 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r6, r4)
            goto L86
        L80:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r4 = r4.m13554getZero9UxMQ8M()
        L86:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo7033onPostFlingRZ2iAVY(long, long, h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.m7048performRawScrollMKHz9U(available) : Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z8) {
        this.enabled = z8;
    }
}
