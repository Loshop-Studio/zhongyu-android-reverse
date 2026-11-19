package androidx.compose.p014ui.focus;

import android.os.Trace;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.BeyondBoundsLayout;
import androidx.compose.p014ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private FocusStateImpl committedFocusState;
    private int focusability;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private final InterfaceC9540l onDispatchEventsCompleted;
    private final InterfaceC9544p onFocusChange;
    private int previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    @StabilityInferred(parameters = 1)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.p014ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode(0, null, null, 7, null);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(i10, interfaceC9544p, interfaceC9540l);
    }

    /* renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m30553fetchCustomEnterOrExitULY8qGw(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        Object objFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        interfaceC9544p.invoke(objFetchFocusProperties$ui_release, cancelIndicatingFocusBoundaryScope);
        int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            interfaceC9540l.invoke(FocusRequester.Companion.getCancel());
        } else {
            if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null)) {
                return;
            }
            interfaceC9540l.invoke(FocusRequester.Companion.getRedirect$ui_release());
        }
    }

    private static final boolean initializeFocusState$hasActiveChild(FocusTargetNode focusTargetNode) {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        Modifier.Node nodePop = child$ui_release2;
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector2.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
        return false;
    }

    private static final boolean initializeFocusState$isInActiveSubTree(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i10 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i10 != 1 && i10 != 2) {
                                        if (i10 == 3) {
                                            return true;
                                        }
                                        if (i10 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        return false;
    }

    public static /* synthetic */ void initializeFocusState$ui_release$default(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            focusStateImpl = null;
        }
        focusTargetNode.initializeFocusState$ui_release(focusStateImpl);
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState != null) {
            this.committedFocusState = uncommittedFocusState;
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui_release() {
        NodeChain nodes$ui_release;
        InterfaceC9544p interfaceC9544p;
        FocusStateImpl focusStateImpl = this.committedFocusState;
        if (focusStateImpl == null) {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        FocusStateImpl focusState = getFocusState();
        if (focusStateImpl != focusState && (interfaceC9544p = this.onFocusChange) != null) {
            interfaceC9544p.invoke(focusStateImpl, focusState);
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4096);
        int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(1024);
        Modifier.Node node = getNode();
        int i10 = iM32510constructorimpl | iM32510constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodePop;
                                    focusEventModifierNode.onFocusEvent(FocusEventModifierNodeKt.getFocusState(focusEventModifierNode));
                                } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i11 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        InterfaceC9540l interfaceC9540l = this.onDispatchEventsCompleted;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(this);
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m30554fetchCustomEnteraToIllA$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                interfaceC9540l.invoke(FocusRequester.Companion.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                interfaceC9540l.invoke(FocusRequester.Companion.getRedirect$ui_release());
            }
            AbstractC9977s.m20286b(1);
            this.isProcessingCustomEnter = false;
            AbstractC9977s.m20285a(1);
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            this.isProcessingCustomEnter = false;
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m30555fetchCustomExitaToIllA$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                interfaceC9540l.invoke(FocusRequester.Companion.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                interfaceC9540l.invoke(FocusRequester.Companion.getRedirect$ui_release());
            }
            AbstractC9977s.m20286b(1);
            this.isProcessingCustomExit = false;
            AbstractC9977s.m20285a(1);
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            this.isProcessingCustomExit = false;
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m30566canFocusimpl$ui_release(mo30548getFocusabilityLCbbffg(), this));
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(2048);
        int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(1024);
        Modifier.Node node = getNode();
        int i10 = iM32510constructorimpl | iM32510constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNodePop).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i11 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return focusPropertiesImpl;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.p014ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg */
    public int mo30548getFocusabilityLCbbffg() {
        return this.focusability;
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void initializeFocusState$ui_release(FocusStateImpl focusStateImpl) {
        if (isInitialized$ui_release()) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
        try {
            if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            if (focusStateImpl == null) {
                focusStateImpl = (initializeFocusState$isInActiveSubTree(this) && initializeFocusState$hasActiveChild(this)) ? FocusStateImpl.ActiveParent : FocusStateImpl.Inactive;
            }
            setFocusState(focusStateImpl);
            C10786q c10786q = C10786q.f26013a;
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
            throw th;
        }
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties = null;
        if (!isInitialized$ui_release()) {
            initializeFocusState$ui_release$default(this, null, 1, null);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i10 == 1 || i10 == 2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m30556invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m30556invoke() {
                    ref$ObjectRef.f23402c = this.fetchFocusProperties$ui_release();
                }
            });
            Object obj = ref$ObjectRef.f23402c;
            if (obj == null) {
                AbstractC9979u.m20312y("focusProperties");
            } else {
                focusProperties = (FocusProperties) obj;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    public final boolean isInitialized$ui_release() {
        return ComposeUiFlags.isTrackFocusEnabled || this.committedFocusState != null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.invalidateFocusTarget(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i10 == 1 || i10 == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo30531clearFocusI7lrPNg(true, true, false, FocusDirection.Companion.m30520getExitdhqQ8s());
            if (ComposeUiFlags.isTrackFocusEnabled) {
                focusOwner.scheduleInvalidationForOwner();
            } else {
                FocusTargetNodeKt.invalidateFocusTarget(this);
            }
        } else if (i10 == 3 && !ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                    focusTransactionManagerRequireTransactionManager.cancelTransaction();
                }
                focusTransactionManagerRequireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                C10786q c10786q = C10786q.f26013a;
                focusTransactionManagerRequireTransactionManager.commitTransaction();
            } catch (Throwable th) {
                focusTransactionManagerRequireTransactionManager.commitTransaction();
                throw th;
            }
        }
        this.committedFocusState = null;
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateFocus$ui_release();
            return;
        }
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            dispatchFocusCallbacks$ui_release();
        }
    }

    @Override // androidx.compose.p014ui.focus.FocusTargetModifierNode
    @InterfaceC10770a
    public /* synthetic */ boolean requestFocus() {
        return mo30549requestFocus3ESFkO8(FocusDirection.Companion.m30519getEnterdhqQ8s());
    }

    @Override // androidx.compose.p014ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public boolean mo30549requestFocus3ESFkO8(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zPerformRequestFocus = false;
            if (!fetchFocusProperties$ui_release().getCanFocus()) {
                Trace.endSection();
                return false;
            }
            if (ComposeUiFlags.isTrackFocusEnabled) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m30561performCustomRequestFocusMxy_nc0(this, i10).ordinal()];
                if (i11 == 1) {
                    zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(this);
                } else if (i11 == 2) {
                    zPerformRequestFocus = true;
                } else if (i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m30557invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m30557invoke() {
                        if (this.this$0.getNode().isAttached()) {
                            this.this$0.dispatchFocusCallbacks$ui_release();
                        }
                    }
                };
                try {
                    if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                        focusTransactionManagerRequireTransactionManager.cancelTransaction();
                    }
                    focusTransactionManagerRequireTransactionManager.beginTransaction();
                    focusTransactionManagerRequireTransactionManager.cancellationListener.add(interfaceC9529a);
                    int i12 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m30561performCustomRequestFocusMxy_nc0(this, i10).ordinal()];
                    if (i12 == 1) {
                        zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(this);
                    } else if (i12 == 2) {
                        zPerformRequestFocus = true;
                    } else if (i12 != 3 && i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } finally {
                    focusTransactionManagerRequireTransactionManager.commitTransaction();
                }
            }
            return zPerformRequestFocus;
        } finally {
            Trace.endSection();
        }
    }

    public void setFocusState(FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    @Override // androidx.compose.p014ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public void mo30550setFocusabilityjosRg5g(int i10) {
        if (Focusability.m30569equalsimpl0(this.focusability, i10)) {
            return;
        }
        this.focusability = i10;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            if (isAttached() && isInitialized$ui_release()) {
                onObservedReadsChanged();
                return;
            }
            return;
        }
        if (isAttached() && this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m30566canFocusimpl$ui_release(this.focusability, this)) {
            FocusTransactionsKt.clearFocus(this, true, true);
        }
    }

    public final void setPreviouslyFocusedChildHash(int i10) {
        this.previouslyFocusedChildHash = i10;
    }

    public /* synthetic */ FocusTargetNode(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? Focusability.Companion.m30573getAlwaysLCbbffg() : i10, (i11 & 2) != 0 ? null : interfaceC9544p, (i11 & 4) != 0 ? null : interfaceC9540l, null);
    }

    @Override // androidx.compose.p014ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusOwner focusOwner;
        FocusTargetNode activeFocusTargetNode;
        NodeChain nodes$ui_release;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            if (focusTransactionManager != null && (uncommittedFocusState = focusTransactionManager.getUncommittedFocusState(this)) != null) {
                return uncommittedFocusState;
            }
            FocusStateImpl focusStateImpl = this.committedFocusState;
            return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
        }
        if (isAttached() && (activeFocusTargetNode = (focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner()).getActiveFocusTargetNode()) != null) {
            if (this == activeFocusTargetNode) {
                return focusOwner.isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
            }
            if (activeFocusTargetNode.isAttached()) {
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
                                Modifier.Node nodePop = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) nodePop)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
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
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    private FocusTargetNode(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        this.onFocusChange = interfaceC9544p;
        this.onDispatchEventsCompleted = interfaceC9540l;
        this.focusability = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui_release(FocusState focusState, FocusState focusState2) {
        NodeChain nodes$ui_release;
        InterfaceC9544p interfaceC9544p;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!AbstractC9979u.m20289b(focusState, focusState2) && (interfaceC9544p = this.onFocusChange) != null) {
            interfaceC9544p.invoke(focusState, focusState2);
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4096);
        int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(1024);
        Modifier.Node node = getNode();
        int i10 = iM32510constructorimpl | iM32510constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodePop;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusState2);
                                    }
                                } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i11 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        InterfaceC9540l interfaceC9540l = this.onDispatchEventsCompleted;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(this);
        }
    }
}
