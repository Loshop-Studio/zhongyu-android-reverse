package androidx.compose.p014ui.input.nestedscroll;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private InterfaceC9529a calculateNestedScrollScope = new InterfaceC9529a() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final InterfaceC11122i0 invoke() {
            return this.this$0.getScope$ui_release();
        }
    };
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private InterfaceC11122i0 scope;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31977dispatchPostFlingRZ2iAVY(long r8, long r10, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
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
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.AbstractC9924b.m20071b(r12)
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.AbstractC9924b.m20071b(r12)
            goto L56
        L3a:
            kotlin.AbstractC9924b.m20071b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r7.getParent$ui_release()
            if (r12 != 0) goto L64
            boolean r12 = androidx.compose.p014ui.ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled
            if (r12 == 0) goto L64
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L5d
            r6.label = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo27229onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L56
            goto L74
        L56:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p014ui.unit.Velocity) r12
            long r8 = r12.m33748unboximpl()
            goto L82
        L5d:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p014ui.unit.Velocity.Companion
            long r8 = r8.m33750getZero9UxMQ8M()
            goto L82
        L64:
            r4 = r10
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L7c
            r6.label = r2
            r2 = r8
            java.lang.Object r12 = r1.mo27229onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L75
        L74:
            return r0
        L75:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p014ui.unit.Velocity) r12
            long r8 = r12.m33748unboximpl()
            goto L82
        L7c:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p014ui.unit.Velocity.Companion
            long r8 = r8.m33750getZero9UxMQ8M()
        L82:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher.m31977dispatchPostFlingRZ2iAVY(long, long, vc.c):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m31978dispatchPostScrollDzOQY0M(long j10, long j11, int i10) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo27230onPostScrollDzOQY0M(j10, j11, i10) : Offset.Companion.m30653getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31979dispatchPreFlingQWom1Mo(long r5, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L4a
            r0.label = r3
            java.lang.Object r7 = r7.mo27535onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.p014ui.unit.Velocity) r7
            long r5 = r7.m33748unboximpl()
            goto L50
        L4a:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.p014ui.unit.Velocity.Companion
            long r5 = r5.m33750getZero9UxMQ8M()
        L50:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher.m31979dispatchPreFlingQWom1Mo(long, vc.c):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m31980dispatchPreScrollOzD1aCk(long j10, int i10) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo27536onPreScrollOzD1aCk(j10, i10) : Offset.Companion.m30653getZeroF1C5BW0();
    }

    public final InterfaceC9529a getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final InterfaceC11122i0 getCoroutineScope() {
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.calculateNestedScrollScope.invoke();
        if (interfaceC11122i0 != null) {
            return interfaceC11122i0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollNode getLastKnownParentNode$ui_release() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getNestedScrollNode$ui_release() {
        return this.nestedScrollNode;
    }

    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    public final InterfaceC11122i0 getScope$ui_release() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(InterfaceC9529a interfaceC9529a) {
        this.calculateNestedScrollScope = interfaceC9529a;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui_release(InterfaceC11122i0 interfaceC11122i0) {
        this.scope = interfaceC11122i0;
    }
}
