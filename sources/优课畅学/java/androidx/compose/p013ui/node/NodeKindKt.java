package androidx.compose.p013ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p013ui.Actual_jvmKt;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.DrawModifier;
import androidx.compose.p013ui.focus.FocusEventModifier;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusEventModifierNodeKt;
import androidx.compose.p013ui.focus.FocusOrderModifier;
import androidx.compose.p013ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p013ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.p013ui.focus.FocusTargetNode;
import androidx.compose.p013ui.focus.FocusTargetNodeKt;
import androidx.compose.p013ui.input.key.KeyInputModifierNode;
import androidx.compose.p013ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p013ui.input.pointer.PointerInputModifier;
import androidx.compose.p013ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p013ui.layout.LayoutModifier;
import androidx.compose.p013ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p013ui.layout.OnPlacedModifier;
import androidx.compose.p013ui.layout.OnRemeasuredModifier;
import androidx.compose.p013ui.layout.ParentDataModifier;
import androidx.compose.p013ui.modifier.ModifierLocalConsumer;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalProvider;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p013ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;

/* loaded from: classes2.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final MutableObjectIntMap<Object> classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i10, int i11) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i10 & node.getKindSet$ui_release(), i11);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui_release() & i10, i11);
        int i12 = (~delegatingNode.getSelfKindSet$ui_release()) & i10;
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui_release, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i10, int i11) {
        if (i11 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m25908constructorimpl(2) & i10) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i11 == 2) {
                    DelegatableNodeKt.m25754requireCoordinator64DMado(node, NodeKind.m25908constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m25908constructorimpl(128) & i10) != 0 && (node instanceof LayoutAwareModifierNode) && i11 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m25908constructorimpl(256) & i10) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i11 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui_release();
            }
            if ((NodeKind.m25908constructorimpl(4) & i10) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m25908constructorimpl(8) & i10) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui_release(true);
            }
            if ((NodeKind.m25908constructorimpl(64) & i10) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m25908constructorimpl(2048) & i10) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.isTrackFocusEnabled || i11 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i10 & NodeKind.m25908constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int iFindKeyIndex = mutableObjectIntMap.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex >= 0) {
            return mutableObjectIntMap.values[iFindKeyIndex];
        }
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(131072);
        }
        if (node instanceof TraversableNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(524288);
        }
        if (node instanceof OnUnplacedModifierNode) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(1048576);
        }
        mutableObjectIntMap.set(objClassKeyForObject, iM25908constructorimpl);
        return iM25908constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
        }
        return selfKindSet$ui_release;
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m25916contains64DMado(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m25917getIncludeSelfInTraversalH91voCI(int i10) {
        return (i10 & NodeKind.m25908constructorimpl(128)) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m25918or64DMado(int i10, int i11) {
        return i10 | i11;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM25908constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            iM25908constructorimpl |= NodeKind.m25908constructorimpl(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m25908constructorimpl(524288) | iM25908constructorimpl : iM25908constructorimpl;
    }
}
