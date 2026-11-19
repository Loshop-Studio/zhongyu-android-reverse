package androidx.compose.material3;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.nestedscroll.AbstractC1378a;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m5174d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m5175d2 = {"androidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ EnterAlwaysScrollBehavior this$0;

    public EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.this$0 = enterAlwaysScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7212onPostFlingRZ2iAVY(long r10, long r12, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            long r10 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L80
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1) r10
            kotlin.ResultKt.throwOnFailure(r14)
            goto L55
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = androidx.compose.p006ui.input.nestedscroll.AbstractC1378a.m559a(r1, r2, r4, r6)
            if (r14 != r7) goto L54
            return r7
        L54:
            r10 = r9
        L55:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p006ui.unit.Velocity) r14
            long r1 = r14.getPackedValue()
            androidx.compose.material3.EnterAlwaysScrollBehavior r11 = r10.this$0
            androidx.compose.material3.TopAppBarState r11 = r11.getState()
            float r12 = androidx.compose.p006ui.unit.Velocity.m11751getYimpl(r12)
            androidx.compose.material3.EnterAlwaysScrollBehavior r13 = r10.this$0
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.getFlingAnimationSpec()
            androidx.compose.material3.EnterAlwaysScrollBehavior r10 = r10.this$0
            androidx.compose.animation.core.AnimationSpec r10 = r10.getSnapAnimationSpec()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.access$settleAppBar(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L7f
            return r7
        L7f:
            r10 = r1
        L80:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p006ui.unit.Velocity) r14
            long r12 = r14.getPackedValue()
            long r10 = androidx.compose.p006ui.unit.Velocity.m11754plusAH228Gc(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.p006ui.unit.Velocity.m11741boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1.mo7212onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo7213onPostScrollDzOQY0M(long r5, long r7, int r9) {
        /*
            r4 = this;
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            kotlin.jvm.functions.Function0 r9 = r9.getCanScroll()
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L19
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.p006ui.geometry.Offset.INSTANCE
            long r5 = r5.m8961getZeroF1C5BW0()
            return r5
        L19:
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r0 = r9.getContentOffset()
            float r1 = androidx.compose.p006ui.geometry.Offset.m8946getYimpl(r5)
            float r0 = r0 + r1
            r9.setContentOffset(r0)
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L3e
            r9 = r1
            goto L3f
        L3e:
            r9 = r2
        L3f:
            if (r9 != 0) goto L5e
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            androidx.compose.material3.EnterAlwaysScrollBehavior r3 = r4.this$0
            androidx.compose.material3.TopAppBarState r3 = r3.getState()
            float r3 = r3.getHeightOffsetLimit()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L5b
            r9 = r1
            goto L5c
        L5b:
            r9 = r2
        L5c:
            if (r9 == 0) goto L7b
        L5e:
            float r9 = androidx.compose.p006ui.geometry.Offset.m8946getYimpl(r5)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L67
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 == 0) goto L7b
            float r7 = androidx.compose.p006ui.geometry.Offset.m8946getYimpl(r7)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L7b
            androidx.compose.material3.EnterAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            r7.setContentOffset(r0)
        L7b:
            androidx.compose.material3.EnterAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            androidx.compose.material3.EnterAlwaysScrollBehavior r8 = r4.this$0
            androidx.compose.material3.TopAppBarState r8 = r8.getState()
            float r8 = r8.getHeightOffset()
            float r5 = androidx.compose.p006ui.geometry.Offset.m8946getYimpl(r5)
            float r8 = r8 + r5
            r7.setHeightOffset(r8)
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.p006ui.geometry.Offset.INSTANCE
            long r5 = r5.m8961getZeroF1C5BW0()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1.mo7213onPostScrollDzOQY0M(long, long, int):long");
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo7214onPreFlingQWom1Mo(long j4, Continuation continuation) {
        return AbstractC1378a.m561c(this, j4, continuation);
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7215onPreScrollOzD1aCk(long available, int source) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.INSTANCE.m8961getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m8946getYimpl(available));
        return !((heightOffset > this.this$0.getState().getHeightOffset() ? 1 : (heightOffset == this.this$0.getState().getHeightOffset() ? 0 : -1)) == 0) ? Offset.m8939copydBAh8RU$default(available, 0.0f, 0.0f, 2, null) : Offset.INSTANCE.m8961getZeroF1C5BW0();
    }
}
