package androidx.compose.material3;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m5110d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitAlwaysScrollBehavior this$0;

    public ExitAlwaysScrollBehavior$nestedScrollConnection$1(ExitAlwaysScrollBehavior exitAlwaysScrollBehavior) {
        this.this$0 = exitAlwaysScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7033onPostFlingRZ2iAVY(long r9, long r11, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r13
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            if (r1 != r7) goto L2e
            long r9 = r6.J$0
            kotlin.AbstractC5774b.m5119b(r13)
            goto L80
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r11 = r6.J$0
            java.lang.Object r9 = r6.L$0
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1 r9 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1) r9
            kotlin.AbstractC5774b.m5119b(r13)
            goto L55
        L40:
            kotlin.AbstractC5774b.m5119b(r13)
            r6.L$0 = r8
            r6.J$0 = r11
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r13 = super.mo7033onPostFlingRZ2iAVY(r2, r4, r6)
            if (r13 != r0) goto L53
            goto L7e
        L53:
            r9 = r8
            r11 = r4
        L55:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.p011ui.unit.Velocity) r13
            long r1 = r13.getPackedValue()
            androidx.compose.material3.ExitAlwaysScrollBehavior r10 = r9.this$0
            androidx.compose.material3.BottomAppBarState r10 = r10.getState()
            float r11 = androidx.compose.p011ui.unit.Velocity.m13544getYimpl(r11)
            androidx.compose.material3.ExitAlwaysScrollBehavior r12 = r9.this$0
            androidx.compose.animation.core.DecayAnimationSpec r12 = r12.getFlingAnimationSpec()
            androidx.compose.material3.ExitAlwaysScrollBehavior r9 = r9.this$0
            androidx.compose.animation.core.AnimationSpec r9 = r9.getSnapAnimationSpec()
            r13 = 0
            r6.L$0 = r13
            r6.J$0 = r1
            r6.label = r7
            java.lang.Object r13 = androidx.compose.material3.AppBarKt.access$settleAppBarBottom(r10, r11, r12, r9, r6)
            if (r13 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r9 = r1
        L80:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.p011ui.unit.Velocity) r13
            long r11 = r13.getPackedValue()
            long r9 = androidx.compose.p011ui.unit.Velocity.m13547plusAH228Gc(r9, r11)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1.mo7033onPostFlingRZ2iAVY(long, long, h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        BottomAppBarState state = this.this$0.getState();
        state.setContentOffset(Offset.m10442getYimpl(consumed) + state.getContentOffset());
        if ((this.this$0.getState().getHeightOffset() == 0.0f || this.this$0.getState().getHeightOffset() == this.this$0.getState().getHeightOffsetLimit()) && Offset.m10442getYimpl(consumed) == 0.0f && Offset.m10442getYimpl(available) > 0.0f) {
            this.this$0.getState().setContentOffset(0.0f);
        }
        this.this$0.getState().setHeightOffset(Offset.m10442getYimpl(consumed) + this.this$0.getState().getHeightOffset());
        return Offset.INSTANCE.m10457getZeroF1C5BW0();
    }
}
