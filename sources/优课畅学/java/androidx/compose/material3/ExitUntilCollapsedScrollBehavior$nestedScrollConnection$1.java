package androidx.compose.material3;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;

/* loaded from: classes2.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo20627onPostFlingRZ2iAVY(long r9, long r11, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.unit.Velocity> r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof androidx.compose.material3.C2134x78ae0263
            if (r0 == 0) goto L14
            r0 = r13
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.C2134x78ae0263) r0
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
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r9 = r6.J$0
            kotlin.AbstractC9079b.m15926b(r13)
            goto L82
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            long r11 = r6.J$0
            java.lang.Object r9 = r6.L$0
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 r9 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) r9
            kotlin.AbstractC9079b.m15926b(r13)
            goto L57
        L42:
            kotlin.AbstractC9079b.m15926b(r13)
            r6.L$0 = r8
            r6.J$0 = r11
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r13 = super.mo20627onPostFlingRZ2iAVY(r2, r4, r6)
            if (r13 != r0) goto L55
            goto L80
        L55:
            r9 = r8
            r11 = r4
        L57:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.p013ui.unit.Velocity) r13
            long r1 = r13.m27146unboximpl()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r10 = r9.this$0
            androidx.compose.material3.TopAppBarState r10 = r10.getState()
            float r11 = androidx.compose.p013ui.unit.Velocity.m27138getYimpl(r11)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r12 = r9.this$0
            androidx.compose.animation.core.DecayAnimationSpec r12 = r12.getFlingAnimationSpec()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r9 = r9.this$0
            androidx.compose.animation.core.AnimationSpec r9 = r9.getSnapAnimationSpec()
            r13 = 0
            r6.L$0 = r13
            r6.J$0 = r1
            r6.label = r7
            java.lang.Object r13 = androidx.compose.material3.AppBarKt.access$settleAppBar(r10, r11, r12, r9, r6)
            if (r13 != r0) goto L81
        L80:
            return r0
        L81:
            r9 = r1
        L82:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.p013ui.unit.Velocity) r13
            long r11 = r13.m27146unboximpl()
            long r9 = androidx.compose.p013ui.unit.Velocity.m27141plusAH228Gc(r9, r11)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.p013ui.unit.Velocity.m27128boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo20627onPostFlingRZ2iAVY(long, long, m7.c):java.lang.Object");
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        state.setContentOffset(state.getContentOffset() + Offset.m24036getYimpl(j10));
        if (Offset.m24036getYimpl(j11) < 0.0f || Offset.m24036getYimpl(j10) < 0.0f) {
            float heightOffset = this.this$0.getState().getHeightOffset();
            this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m24036getYimpl(j10));
            return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset);
        }
        if (Offset.m24036getYimpl(j10) == 0.0f && Offset.m24036getYimpl(j11) > 0.0f) {
            this.this$0.getState().setContentOffset(0.0f);
        }
        if (Offset.m24036getYimpl(j11) <= 0.0f) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        float heightOffset2 = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m24036getYimpl(j11));
        return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset2);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo20934onPreScrollOzD1aCk(long j10, int i10) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue() || Offset.m24036getYimpl(j10) > 0.0f) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m24036getYimpl(j10));
        return heightOffset == this.this$0.getState().getHeightOffset() ? Offset.Companion.m24051getZeroF1C5BW0() : Offset.m24029copydBAh8RU$default(j10, 0.0f, 0.0f, 2, null);
    }
}
