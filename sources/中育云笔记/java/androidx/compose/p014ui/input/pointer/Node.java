package androidx.compose.p014ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.util.PointerIdArray;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(InterfaceC9529a interfaceC9529a) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        interfaceC9529a.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!Offset.m30634equalsimpl0(pointerEvent.getChanges().get(i10).m32104getPositionF1C5BW0(), pointerEvent2.getChanges().get(i10).m32104getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0260  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.p014ui.input.pointer.PointerInputChange> r46, androidx.compose.p014ui.layout.LayoutCoordinates r47, androidx.compose.p014ui.input.pointer.InternalPointerEvent r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.pointer.Node.buildCache(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = changes.get(i10);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM32032activeHoverEvent0FcD4WY = internalPointerEvent.m32032activeHoverEvent0FcD4WY(pointerInputChange.m32102getIdJ3iCeTQ());
            boolean z10 = this.isIn;
            if ((!pressed && !zM32032activeHoverEvent0FcD4WY) || (!pressed && !z10)) {
                this.pointerIds.remove(pointerInputChange.m32102getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m32053equalsimpl0(pointerEvent.m32046getType7fucELk(), PointerEventType.Companion.m32058getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].dispatchCancel();
        }
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).onCancelPointerInput();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        boolean z10 = false;
        z10 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            AbstractC9979u.m20291d(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            AbstractC9979u.m20291d(layoutCoordinates);
            long jMo32237getSizeYbymL2g = layoutCoordinates.mo32237getSizeYbymL2g();
            DelegatingNode delegatingNodePop = this.modifierNode;
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop).mo26920onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo32237getSizeYbymL2g);
                } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
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
            if (this.modifierNode.isAttached()) {
                MutableVector<Node> children = getChildren();
                Node[] nodeArr = children.content;
                int size = children.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    nodeArr[i11].dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z10 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z10) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        AbstractC9979u.m20291d(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        AbstractC9979u.m20291d(layoutCoordinates2);
        long jMo32237getSizeYbymL2g = layoutCoordinates2.mo32237getSizeYbymL2g();
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).mo26920onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo32237getSizeYbymL2g);
            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
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
        if (this.modifierNode.isAttached()) {
            MutableVector<Node> children = getChildren();
            Node[] nodeArr = children.content;
            int size = children.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                Node node = nodeArr[i11];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                AbstractC9979u.m20291d(layoutCoordinates3);
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z10);
            }
        }
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNodePop2 = this.modifierNode;
            int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNodePop2 != 0) {
                if (delegatingNodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop2).mo26920onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo32237getSizeYbymL2g);
                } else if ((delegatingNodePop2.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (delegatingNodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release2 = delegatingNodePop2.getDelegate$ui_release();
                    int i12 = 0;
                    delegatingNodePop2 = delegatingNodePop2;
                    while (delegate$ui_release2 != null) {
                        if ((delegate$ui_release2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                delegatingNodePop2 = delegate$ui_release2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop2 != 0) {
                                    mutableVector2.add(delegatingNodePop2);
                                    delegatingNodePop2 = 0;
                                }
                                mutableVector2.add(delegate$ui_release2);
                            }
                        }
                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                        delegatingNodePop2 = delegatingNodePop2;
                    }
                    if (i12 == 1) {
                    }
                }
                delegatingNodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.p014ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j10, MutableObjectList<Node> mutableObjectList) {
        if (this.pointerIds.contains(j10) && !mutableObjectList.contains(this)) {
            this.pointerIds.remove(j10);
            this.relevantChanges.remove(j10);
        }
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].removeInvalidPointerIdsAndChanges(j10, mutableObjectList);
        }
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
