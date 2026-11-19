package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b$\u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m5110d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "newDispatcher", "Ld6/s;", "updateDispatcher", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "updateDispatcherFields", "()V", "resetDispatcherFields", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "onAttach", "onDetach", "updateNode$ui_release", "updateNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "resolvedDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "lastKnownParentNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "getParentConnection", "parentConnection", "Lkotlinx/coroutines/v;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/v;", "nestedCoroutineScope", "getParentNestedScrollNode$ui_release", "parentNestedScrollNode", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;

    @NotNull
    private NestedScrollConnection connection;

    @Nullable
    private NestedScrollNode lastKnownParentNode;

    @NotNull
    private NestedScrollDispatcher resolvedDispatcher;

    @NotNull
    private final Object traverseKey;

    public NestedScrollNode(@NotNull NestedScrollConnection nestedScrollConnection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6009v getNestedCoroutineScope() {
        InterfaceC6009v nestedCoroutineScope;
        NestedScrollNode parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
        if (parentNestedScrollNode$ui_release != null && (nestedCoroutineScope = parentNestedScrollNode$ui_release.getNestedCoroutineScope()) != null) {
            return nestedCoroutineScope;
        }
        InterfaceC6009v scope = this.resolvedDispatcher.getScope();
        if (scope != null) {
            return scope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollConnection getParentConnection() {
        if (getIsAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher newDispatcher) {
        resetDispatcherFields();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!newDispatcher.equals(this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            this.resolvedDispatcher.setLastKnownParentNode$ui_release(null);
            this.lastKnownParentNode = null;
        }
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new InterfaceC6469a() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final InterfaceC6009v invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @Nullable
    /* renamed from: getLastKnownParentNode$ui_release, reason: from getter */
    public final NestedScrollNode getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    @Nullable
    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (getIsAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.findNearestAttachedAncestor(this);
            this.lastKnownParentNode = nestedScrollNode;
            this.resolvedDispatcher.setLastKnownParentNode$ui_release(nestedScrollNode);
        }
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7033onPostFlingRZ2iAVY(long r11, long r13, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.p011ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r0
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
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            long r11 = r6.J$0
            kotlin.AbstractC5774b.m5119b(r15)
            goto L93
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r13 = r6.J$1
            long r11 = r6.J$0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollNode) r1
            kotlin.AbstractC5774b.m5119b(r15)
            goto L5c
        L43:
            kotlin.AbstractC5774b.m5119b(r15)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r10.connection
            r6.L$0 = r10
            r6.J$0 = r11
            r6.J$1 = r13
            r6.label = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo7033onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L59
            goto L91
        L59:
            r1 = r10
            r11 = r2
            r13 = r4
        L5c:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.p011ui.unit.Velocity) r15
            long r8 = r15.getPackedValue()
            boolean r15 = androidx.compose.p011ui.ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled
            if (r15 == 0) goto L75
            boolean r15 = r1.getIsAttached()
            if (r15 == 0) goto L72
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r15 = r1.getParentConnection()
        L70:
            r1 = r15
            goto L7a
        L72:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r15 = r1.lastKnownParentNode
            goto L70
        L75:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r15 = r1.getParentConnection()
            goto L70
        L7a:
            if (r1 == 0) goto L9b
            long r2 = androidx.compose.p011ui.unit.Velocity.m13547plusAH228Gc(r11, r8)
            long r4 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r13, r8)
            r11 = 0
            r6.L$0 = r11
            r6.J$0 = r8
            r6.label = r7
            java.lang.Object r15 = r1.mo7033onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L92
        L91:
            return r0
        L92:
            r11 = r8
        L93:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.p011ui.unit.Velocity) r15
            long r13 = r15.getPackedValue()
            r8 = r11
            goto La1
        L9b:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r13 = r11.m13554getZero9UxMQ8M()
        La1:
            long r11 = androidx.compose.p011ui.unit.Velocity.m13547plusAH228Gc(r8, r13)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.input.nestedscroll.NestedScrollNode.mo7033onPostFlingRZ2iAVY(long, long, h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jMo7034onPostScrollDzOQY0M = this.connection.mo7034onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m10446plusMKHz9U(jMo7034onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo7034onPostScrollDzOQY0M(Offset.m10446plusMKHz9U(consumed, jMo7034onPostScrollDzOQY0M), Offset.m10445minusMKHz9U(available, jMo7034onPostScrollDzOQY0M), source) : Offset.INSTANCE.m10457getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7339onPreFlingQWom1Mo(long r9, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.p011ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.J$0
            kotlin.AbstractC5774b.m5119b(r11)
            goto L7b
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.p011ui.input.nestedscroll.NestedScrollNode) r2
            kotlin.AbstractC5774b.m5119b(r11)
            goto L55
        L3e:
            kotlin.AbstractC5774b.m5119b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r8.getParentConnection()
            if (r11 == 0) goto L5f
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo7339onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L54
            goto L7a
        L54:
            r2 = r8
        L55:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p011ui.unit.Velocity) r11
            long r4 = r11.getPackedValue()
        L5b:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L67
        L5f:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r4 = r11.m13554getZero9UxMQ8M()
            r2 = r8
            goto L5b
        L67:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.connection
            long r4 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo7339onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7b
        L7a:
            return r1
        L7b:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p011ui.unit.Velocity) r11
            long r0 = r11.getPackedValue()
            long r9 = androidx.compose.p011ui.unit.Velocity.m13547plusAH228Gc(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.input.nestedscroll.NestedScrollNode.mo7339onPreFlingQWom1Mo(long, h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7340onPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo7340onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo7340onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m10457getZeroF1C5BW0();
        return Offset.m10446plusMKHz9U(jMo7340onPreScrollOzD1aCk, this.connection.mo7340onPreScrollOzD1aCk(Offset.m10445minusMKHz9U(available, jMo7340onPreScrollOzD1aCk), source));
    }

    public final void setConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui_release(@Nullable NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void updateNode$ui_release(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        updateDispatcher(dispatcher);
    }
}
