package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0016\u00103\u001a\u0004\u0018\u0001008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, m5110d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "nestedScrollNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getNestedScrollNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setNestedScrollNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "lastKnownParentNode", "getLastKnownParentNode$ui_release", "setLastKnownParentNode$ui_release", "Lkotlin/Function0;", "Lkotlinx/coroutines/v;", "calculateNestedScrollScope", "Lr6/a;", "getCalculateNestedScrollScope$ui_release", "()Lr6/a;", "setCalculateNestedScrollScope$ui_release", "(Lr6/a;)V", "scope", "Lkotlinx/coroutines/v;", "getScope$ui_release", "()Lkotlinx/coroutines/v;", "setScope$ui_release", "(Lkotlinx/coroutines/v;)V", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;

    @NotNull
    private InterfaceC6469a calculateNestedScrollScope = new InterfaceC6469a() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // p152r6.InterfaceC6469a
        public final InterfaceC6009v invoke() {
            return this.this$0.getScope();
        }
    };

    @Nullable
    private NestedScrollNode lastKnownParentNode;

    @Nullable
    private NestedScrollNode nestedScrollNode;

    @Nullable
    private InterfaceC6009v scope;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11781dispatchPostFlingRZ2iAVY(long r8, long r10, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.AbstractC5774b.m5119b(r12)
            goto L73
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.AbstractC5774b.m5119b(r12)
            goto L54
        L38:
            kotlin.AbstractC5774b.m5119b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r7.getParent$ui_release()
            if (r12 != 0) goto L62
            boolean r12 = androidx.compose.p011ui.ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled
            if (r12 == 0) goto L62
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L5b
            r6.label = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo7033onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L54
            goto L72
        L54:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p011ui.unit.Velocity) r12
            long r8 = r12.getPackedValue()
            goto L80
        L5b:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r8 = r8.m13554getZero9UxMQ8M()
            goto L80
        L62:
            r4 = r10
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L7a
            r6.label = r2
            r2 = r8
            java.lang.Object r12 = r1.mo7033onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L73
        L72:
            return r0
        L73:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p011ui.unit.Velocity) r12
            long r8 = r12.getPackedValue()
            goto L80
        L7a:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r8 = r8.m13554getZero9UxMQ8M()
        L80:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher.m11781dispatchPostFlingRZ2iAVY(long, long, h6.c):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m11782dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo7034onPostScrollDzOQY0M(consumed, available, source) : Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11783dispatchPreFlingQWom1Mo(long r5, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.AbstractC5774b.m5119b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.AbstractC5774b.m5119b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L48
            r0.label = r3
            java.lang.Object r7 = r7.mo7339onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.p011ui.unit.Velocity) r7
            long r5 = r7.getPackedValue()
            goto L4e
        L48:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r5 = r5.m13554getZero9UxMQ8M()
        L4e:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher.m11783dispatchPreFlingQWom1Mo(long, h6.c):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m11784dispatchPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo7340onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    @NotNull
    /* renamed from: getCalculateNestedScrollScope$ui_release, reason: from getter */
    public final InterfaceC6469a getCalculateNestedScrollScope() {
        return this.calculateNestedScrollScope;
    }

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.calculateNestedScrollScope.invoke();
        if (interfaceC6009v != null) {
            return interfaceC6009v;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    /* renamed from: getLastKnownParentNode$ui_release, reason: from getter */
    public final NestedScrollNode getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    @Nullable
    /* renamed from: getNestedScrollNode$ui_release, reason: from getter */
    public final NestedScrollNode getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    @Nullable
    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @Nullable
    /* renamed from: getScope$ui_release, reason: from getter */
    public final InterfaceC6009v getScope() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(@NotNull InterfaceC6469a interfaceC6469a) {
        this.calculateNestedScrollScope = interfaceC6469a;
    }

    public final void setLastKnownParentNode$ui_release(@Nullable NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(@Nullable NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui_release(@Nullable InterfaceC6009v interfaceC6009v) {
        this.scope = interfaceC6009v;
    }
}
