package androidx.compose.p014ui.input.nestedscroll;

import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC11122i0 getNestedCoroutineScope() {
        InterfaceC11122i0 nestedCoroutineScope;
        NestedScrollNode parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
        if (parentNestedScrollNode$ui_release != null && (nestedCoroutineScope = parentNestedScrollNode$ui_release.getNestedCoroutineScope()) != null) {
            return nestedCoroutineScope;
        }
        InterfaceC11122i0 scope$ui_release = this.resolvedDispatcher.getScope$ui_release();
        if (scope$ui_release != null) {
            return scope$ui_release;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui_release() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!AbstractC9979u.m20289b(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            this.resolvedDispatcher.setLastKnownParentNode$ui_release(null);
            this.lastKnownParentNode = null;
        }
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new InterfaceC9529a() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final InterfaceC11122i0 invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollNode getLastKnownParentNode$ui_release() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
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
    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo27229onPostFlingRZ2iAVY(long r11, long r13, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.p014ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r0
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
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            long r11 = r6.J$0
            kotlin.AbstractC9924b.m20071b(r15)
            goto L95
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            long r13 = r6.J$1
            long r11 = r6.J$0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollNode) r1
            kotlin.AbstractC9924b.m20071b(r15)
            goto L5e
        L45:
            kotlin.AbstractC9924b.m20071b(r15)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r10.connection
            r6.L$0 = r10
            r6.J$0 = r11
            r6.J$1 = r13
            r6.label = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo27229onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L5b
            goto L93
        L5b:
            r1 = r10
            r11 = r2
            r13 = r4
        L5e:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.p014ui.unit.Velocity) r15
            long r8 = r15.m33748unboximpl()
            boolean r15 = androidx.compose.p014ui.ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled
            if (r15 == 0) goto L77
            boolean r15 = r1.isAttached()
            if (r15 == 0) goto L74
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r15 = r1.getParentConnection()
        L72:
            r1 = r15
            goto L7c
        L74:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r15 = r1.lastKnownParentNode
            goto L72
        L77:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r15 = r1.getParentConnection()
            goto L72
        L7c:
            if (r1 == 0) goto L9d
            long r2 = androidx.compose.p014ui.unit.Velocity.m33743plusAH228Gc(r11, r8)
            long r4 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r13, r8)
            r11 = 0
            r6.L$0 = r11
            r6.J$0 = r8
            r6.label = r7
            java.lang.Object r15 = r1.mo27229onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L94
        L93:
            return r0
        L94:
            r11 = r8
        L95:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.p014ui.unit.Velocity) r15
            long r13 = r15.m33748unboximpl()
            r8 = r11
            goto La3
        L9d:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p014ui.unit.Velocity.Companion
            long r13 = r11.m33750getZero9UxMQ8M()
        La3:
            long r11 = androidx.compose.p014ui.unit.Velocity.m33743plusAH228Gc(r8, r13)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.nestedscroll.NestedScrollNode.mo27229onPostFlingRZ2iAVY(long, long, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        long jMo27230onPostScrollDzOQY0M = this.connection.mo27230onPostScrollDzOQY0M(j10, j11, i10);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m30642plusMKHz9U(jMo27230onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo27230onPostScrollDzOQY0M(Offset.m30642plusMKHz9U(j10, jMo27230onPostScrollDzOQY0M), Offset.m30641minusMKHz9U(j11, jMo27230onPostScrollDzOQY0M), i10) : Offset.Companion.m30653getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo27535onPreFlingQWom1Mo(long r9, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.p014ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.J$0
            kotlin.AbstractC9924b.m20071b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.p014ui.input.nestedscroll.NestedScrollNode) r2
            kotlin.AbstractC9924b.m20071b(r11)
            goto L57
        L40:
            kotlin.AbstractC9924b.m20071b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r8.getParentConnection()
            if (r11 == 0) goto L61
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo27535onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L56
            goto L7c
        L56:
            r2 = r8
        L57:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p014ui.unit.Velocity) r11
            long r4 = r11.m33748unboximpl()
        L5d:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L69
        L61:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p014ui.unit.Velocity.Companion
            long r4 = r11.m33750getZero9UxMQ8M()
            r2 = r8
            goto L5d
        L69:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.connection
            long r4 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo27535onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7d
        L7c:
            return r1
        L7d:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p014ui.unit.Velocity) r11
            long r0 = r11.m33748unboximpl()
            long r9 = androidx.compose.p014ui.unit.Velocity.m33743plusAH228Gc(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.nestedscroll.NestedScrollNode.mo27535onPreFlingQWom1Mo(long, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo27536onPreScrollOzD1aCk(long j10, int i10) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo27536onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo27536onPreScrollOzD1aCk(j10, i10) : Offset.Companion.m30653getZeroF1C5BW0();
        return Offset.m30642plusMKHz9U(jMo27536onPreScrollOzD1aCk, this.connection.mo27536onPreScrollOzD1aCk(Offset.m30641minusMKHz9U(j10, jMo27536onPreScrollOzD1aCk), i10));
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void updateNode$ui_release(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
