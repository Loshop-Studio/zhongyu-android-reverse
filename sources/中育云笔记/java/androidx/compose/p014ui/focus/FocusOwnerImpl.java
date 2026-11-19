package androidx.compose.p014ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p014ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p014ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private MutableLongSet keysCurrentlyDown;
    private final InterfaceC9529a onClearFocusForOwner;
    private final InterfaceC9529a onFocusRectInterop;
    private final InterfaceC9529a onLayoutDirection;
    private final InterfaceC9540l onMoveFocusInterop;
    private final InterfaceC9544p onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.Companion.m30574getNeverLCbbffg(), null, null, 6, null);
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode$ui_release().hashCode();
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return this.this$0.getRootFocusNode$ui_release();
        }
    };
    private final MutableObjectList<FocusListener> listeners = new MutableObjectList<>(1);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3) {
        this.onRequestFocusForOwner = interfaceC9544p;
        this.onMoveFocusInterop = interfaceC9540l2;
        this.onClearFocusForOwner = interfaceC9529a;
        this.onFocusRectInterop = interfaceC9529a2;
        this.onLayoutDirection = interfaceC9529a3;
        this.focusInvalidationManager = new FocusInvalidationManager(interfaceC9540l, new FocusOwnerImpl$focusInvalidationManager$1(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, p280od.InterfaceC10479m
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getRootState();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$3
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, p280od.InterfaceC10479m
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            public void set(Object obj) {
                ((FocusOwnerImpl) this.receiver).setActiveFocusTargetNode((FocusTargetNode) obj);
            }
        });
    }

    public static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return focusOwnerImpl.clearFocus(z10, z11);
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if ((ComposeUiFlags.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024) | NodeKind.m32510constructorimpl(8192);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    if ((NodeKind.m32510constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                        return node2;
                    }
                    node2 = child$ui_release;
                }
            }
        }
        return node2;
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m30537nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i10) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object node = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node != null) {
                    if ((((Modifier.Node) node).getKindSet$ui_release() & i10) != 0) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) node;
                    }
                    node = (T) ((Modifier.Node) node).getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? (T) null : (T) nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m30538traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l2) {
        int size;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = parent$ui_release; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i11 = size - 1;
                interfaceC9540l.invoke(arrayList.get(size));
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = DelegatableNodeKt.pop(null)) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            interfaceC9540l.invoke(node);
        }
        interfaceC9529a.invoke();
        for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            interfaceC9540l2.invoke(node2);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                interfaceC9540l2.invoke(arrayList.get(i12));
            }
        }
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m30539validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        int iM31960getTypeZmokQxo = KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m31952equalsimpl0(iM31960getTypeZmokQxo, companion.m31956getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(jM31959getKeyZmokQxo);
        } else if (KeyEventType.m31952equalsimpl0(iM31960getTypeZmokQxo, companion.m31957getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(jM31959getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(jM31959getKeyZmokQxo);
            }
        }
        return true;
    }

    @Override // androidx.compose.p014ui.focus.FocusManager
    public void clearFocus(boolean z10) {
        mo30531clearFocusI7lrPNg(z10, true, true, FocusDirection.Companion.m30520getExitdhqQ8s());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x0037, B:18:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x0051, B:29:0x0065), top: B:37:0x0037 }] */
    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo30531clearFocusI7lrPNg(boolean r8, boolean r9, boolean r10, int r11) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.p014ui.ComposeUiFlags.isTrackFocusEnabled
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r8 != 0) goto L2c
            androidx.compose.ui.focus.FocusTargetNode r0 = r7.rootFocusNode
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.p014ui.focus.FocusTransactionsKt.m30558performCustomClearFocusMxy_nc0(r0, r11)
            int[] r0 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r0[r11]
            if (r11 == r4) goto L6e
            if (r11 == r3) goto L6e
            if (r11 == r2) goto L6e
            r0 = 4
            if (r11 != r0) goto L26
            boolean r1 = r7.clearFocus(r8, r9)
            goto L6e
        L26:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L2c:
            boolean r1 = r7.clearFocus(r8, r9)
            goto L6e
        L31:
            androidx.compose.ui.focus.FocusTransactionManager r0 = r7.getFocusTransactionManager()
            androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r5 = new p181hd.InterfaceC9529a() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                static {
                    /*
                        androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r0 = new androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1) androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.INSTANCE androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<init>():void");
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m30540invoke() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.m30540invoke():void");
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    /*
                        r1 = this;
                        r1.m30540invoke()
                        qc.q r0 = p309qc.C10786q.f26013a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.invoke():java.lang.Object");
                }
            }
            boolean r6 = r0.getOngoingTransaction()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L43
            androidx.compose.p014ui.focus.FocusTransactionManager.access$cancelTransaction(r0)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r8 = move-exception
            goto L78
        L43:
            androidx.compose.p014ui.focus.FocusTransactionManager.access$beginTransaction(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L4f
            androidx.compose.runtime.collection.MutableVector r6 = androidx.compose.p014ui.focus.FocusTransactionManager.access$getCancellationListener$p(r0)     // Catch: java.lang.Throwable -> L41
            r6.add(r5)     // Catch: java.lang.Throwable -> L41
        L4f:
            if (r8 != 0) goto L65
            androidx.compose.ui.focus.FocusTargetNode r5 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.p014ui.focus.FocusTransactionsKt.m30558performCustomClearFocusMxy_nc0(r5, r11)     // Catch: java.lang.Throwable -> L41
            int[] r5 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L41
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L41
            r11 = r5[r11]     // Catch: java.lang.Throwable -> L41
            if (r11 == r4) goto L6b
            if (r11 == r3) goto L6b
            if (r11 == r2) goto L6b
        L65:
            androidx.compose.ui.focus.FocusTargetNode r11 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            boolean r1 = androidx.compose.p014ui.focus.FocusTransactionsKt.clearFocus(r11, r8, r9)     // Catch: java.lang.Throwable -> L41
        L6b:
            androidx.compose.p014ui.focus.FocusTransactionManager.access$commitTransaction(r0)
        L6e:
            if (r1 == 0) goto L77
            if (r10 == 0) goto L77
            hd.a r8 = r7.onClearFocusForOwner
            r8.invoke()
        L77:
            return r1
        L78:
            androidx.compose.p014ui.focus.FocusTransactionManager.access$commitTransaction(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl.mo30531clearFocusI7lrPNg(boolean, boolean, boolean, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo30532dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNodePop;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(131072);
            if (!focusTargetNodeFindActiveFocusNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindActiveFocusNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i10 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                delegatingNodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release2 = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNodePop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = softKeyboardInterceptionModifierNode.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i11 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nodePop = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode2 == null || (nodes$ui_release = layoutNodeRequireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo31647onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).mo31647onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate$ui_release3 != null) {
                        if ((delegate$ui_release3.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate$ui_release3);
                            }
                        }
                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo31646onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate$ui_release4 != null) {
                        if ((delegate$ui_release4.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate$ui_release4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate$ui_release4);
                            }
                        }
                        delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i15)).mo31646onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0039, B:114:0x0189, B:116:0x0197, B:117:0x019a, B:119:0x01a9, B:122:0x01ba, B:126:0x01c5, B:129:0x01cb, B:130:0x01d0, B:150:0x0210, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:169:0x0252, B:170:0x0262, B:172:0x0266, B:174:0x026a, B:201:0x02c7, B:178:0x0276, B:180:0x027f, B:182:0x0285, B:184:0x028e, B:186:0x0295, B:188:0x0299, B:189:0x029c, B:191:0x02a2, B:192:0x02a9, B:194:0x02b1, B:195:0x02b6, B:197:0x02bc, B:198:0x02bf, B:202:0x02d2, B:206:0x02e2, B:207:0x02f2, B:209:0x02f6, B:211:0x02fa, B:238:0x0357, B:215:0x0306, B:217:0x030f, B:219:0x0315, B:221:0x031e, B:223:0x0325, B:225:0x0329, B:226:0x032c, B:228:0x0332, B:229:0x0339, B:231:0x0341, B:232:0x0346, B:234:0x034c, B:235:0x034f, B:240:0x0364, B:242:0x036b, B:247:0x037e, B:248:0x0380, B:20:0x0041, B:22:0x004f, B:23:0x0052, B:25:0x005c, B:28:0x006d, B:32:0x0078, B:63:0x00d7, B:65:0x00db, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:47:0x00a1, B:49:0x00aa, B:50:0x00ae, B:51:0x00b1, B:54:0x00b9, B:55:0x00be, B:56:0x00c3, B:58:0x00c9, B:60:0x00cf, B:66:0x00e1, B:68:0x00f1, B:69:0x00f4, B:71:0x0102, B:74:0x0113, B:78:0x011e, B:109:0x017d, B:111:0x0181, B:81:0x0123, B:83:0x012a, B:85:0x012e, B:87:0x0138, B:89:0x013f, B:93:0x0147, B:95:0x0150, B:96:0x0154, B:97:0x0157, B:100:0x015f, B:101:0x0164, B:102:0x0169, B:104:0x016f, B:106:0x0175), top: B:253:0x0009 }] */
    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo30533dispatchKeyEventYhN2O0w(android.view.KeyEvent r17, p181hd.InterfaceC9529a r18) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusOwnerImpl.mo30533dispatchKeyEventYhN2O0w(android.view.KeyEvent, hd.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.p014ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, InterfaceC9529a interfaceC9529a) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNodePop;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(16384);
            if (!focusTargetNodeFindFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindFocusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i10 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                delegatingNodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release2 = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNodePop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(16384);
            if (!rotaryInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = rotaryInputModifierNode.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i11 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nodePop = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode2 == null || (nodes$ui_release = layoutNodeRequireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            DelegatingNode node2 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release3 = node2.getDelegate$ui_release();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate$ui_release3 != null) {
                        if ((delegate$ui_release3.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate$ui_release3);
                            }
                        }
                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            if (((Boolean) interfaceC9529a.invoke()).booleanValue()) {
                return true;
            }
            DelegatingNode node3 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release4 = node3.getDelegate$ui_release();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate$ui_release4 != null) {
                        if ((delegate$ui_release4.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate$ui_release4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate$ui_release4);
                            }
                        }
                        delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((RotaryInputModifierNode) arrayList.get(i15)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo30534focusSearchULY8qGw(int i10, Rect rect, final InterfaceC9540l interfaceC9540l) {
        final FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            FocusRequester focusRequesterM30563customFocusSearchOMvw8 = FocusTraversalKt.m30563customFocusSearchOMvw8(focusTargetNodeFindFocusTargetNode, i10, (LayoutDirection) this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (AbstractC9979u.m20289b(focusRequesterM30563customFocusSearchOMvw8, companion.getCancel())) {
                return null;
            }
            if (AbstractC9979u.m20289b(focusRequesterM30563customFocusSearchOMvw8, companion.getRedirect$ui_release())) {
                FocusTargetNode focusTargetNodeFindFocusTargetNode2 = findFocusTargetNode();
                if (focusTargetNodeFindFocusTargetNode2 != null) {
                    return (Boolean) interfaceC9540l.invoke(focusTargetNodeFindFocusTargetNode2);
                }
                return null;
            }
            if (!AbstractC9979u.m20289b(focusRequesterM30563customFocusSearchOMvw8, companion.getDefault())) {
                return Boolean.valueOf(focusRequesterM30563customFocusSearchOMvw8.findFocusTargetNode$ui_release(interfaceC9540l));
            }
        } else {
            focusTargetNodeFindFocusTargetNode = null;
        }
        return FocusTraversalKt.m30564focusSearch0X8WOeE(this.rootFocusNode, i10, (LayoutDirection) this.onLayoutDirection.invoke(), rect, new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (AbstractC9979u.m20289b(focusTargetNode, focusTargetNodeFindFocusTargetNode)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC9979u.m20289b(focusTargetNode, this.getRootFocusNode$ui_release())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) interfaceC9540l.invoke(focusTargetNode)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindFocusTargetNode);
        }
        return null;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public MutableObjectList<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public boolean isFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.p014ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo30529moveFocus3ESFkO8(final int i10) {
        if (ComposeUiFlags.isViewFocusFixEnabled && ((Boolean) this.onMoveFocusInterop.invoke(FocusDirection.m30511boximpl(i10))).booleanValue()) {
            return true;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = Boolean.FALSE;
        int generation = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean boolMo30534focusSearchULY8qGw = mo30534focusSearchULY8qGw(i10, (Rect) this.onFocusRectInterop.invoke(), new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                ref$ObjectRef.f23402c = Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(i10));
                Boolean bool = (Boolean) ref$ObjectRef.f23402c;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        int generation2 = getFocusTransactionManager().getGeneration();
        Boolean bool = Boolean.TRUE;
        if (AbstractC9979u.m20289b(boolMo30534focusSearchULY8qGw, bool) && (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != getActiveFocusTargetNode()))) {
            return true;
        }
        if (boolMo30534focusSearchULY8qGw != null && ref$ObjectRef.f23402c != null) {
            if (AbstractC9979u.m20289b(boolMo30534focusSearchULY8qGw, bool) && AbstractC9979u.m20289b(ref$ObjectRef.f23402c, bool)) {
                return true;
            }
            if (FocusOwnerImplKt.m30542is1dFocusSearch3ESFkO8(i10)) {
                return mo30531clearFocusI7lrPNg(false, true, false, i10) && mo30536takeFocusaToIllA(i10, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && ((Boolean) this.onMoveFocusInterop.invoke(FocusDirection.m30511boximpl(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void releaseFocus() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.getOngoingTransaction()) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.beginTransaction();
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo30535requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect) {
        return ((Boolean) this.onRequestFocusForOwner.invoke(focusDirection, rect)).booleanValue();
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidationForOwner();
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            MutableObjectList<FocusListener> listeners = getListeners();
            Object[] objArr = listeners.content;
            int i10 = listeners._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((FocusListener) objArr[i11]).onFocusChanged(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void setFocusCaptured(boolean z10) {
        if (!((z10 && getActiveFocusTargetNode() == null) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z10;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo30536takeFocusaToIllA(final int i10, Rect rect) {
        Boolean boolMo30534focusSearchULY8qGw = mo30534focusSearchULY8qGw(i10, rect, new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(i10));
            }
        });
        if (boolMo30534focusSearchULY8qGw != null) {
            return boolMo30534focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    private final boolean clearFocus(boolean z10, boolean z11) {
        NodeChain nodes$ui_release;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (isFocusCaptured() && !z10) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (z11 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui_release(isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = activeFocusTargetNode.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodePop = parent$ui_release;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    ((FocusTargetNode) nodePop).dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i10 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
        }
        return true;
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.p014ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }
}
