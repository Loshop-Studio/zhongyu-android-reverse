package androidx.compose.p013ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J.\u0010\u0019\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m13558d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "()V", "children", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "removeMatchingPointerInputModifierNodeList", "Landroidx/collection/MutableObjectList;", "buildCache", "", "changes", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "parentCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clear", "dispatchCancel", "dispatchFinalEventPass", "dispatchMainEventPass", "removeInvalidPointerIdsAndChanges", "pointerIdValue", "", "hitNodes", "removePointerInputModifierNode", "pointerInputModifierNode", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,688:1\n1101#2:689\n1083#2,2:690\n423#3,9:692\n423#3,9:701\n423#3,9:710\n423#3,9:719\n472#3:728\n423#3,9:729\n44#3:738\n472#3:739\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n234#1:689\n234#1:690,2\n246#1:692,9\n273#1:701,9\n293#1:710,9\n302#1:719,9\n319#1:728\n343#1:729,9\n347#1:738\n348#1:739\n*E\n"})
/* loaded from: classes2.dex */
public class NodeParent {
    public static final int $stable = 8;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);
    private final MutableObjectList<NodeParent> removeMatchingPointerInputModifierNodeList = new MutableObjectList<>(10);

    public boolean buildCache(LongSparseArray<PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z9 = nodeArr[i10].buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds) || z9;
        }
        return z9;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].dispatchCancel();
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z9 = nodeArr[i10].dispatchFinalEventPass(internalPointerEvent) || z9;
        }
        cleanUpHits(internalPointerEvent);
        return z9;
    }

    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z9 = nodeArr[i10].dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, isInBounds) || z9;
        }
        return z9;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, MutableObjectList<Node> hitNodes) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
        }
    }

    public void removePointerInputModifierNode(Modifier.Node pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.clear();
        this.removeMatchingPointerInputModifierNodeList.add(this);
        while (this.removeMatchingPointerInputModifierNodeList.isNotEmpty()) {
            NodeParent nodeParentRemoveAt = this.removeMatchingPointerInputModifierNodeList.removeAt(r0.getSize() - 1);
            int i10 = 0;
            while (i10 < nodeParentRemoveAt.children.getSize()) {
                Node node = nodeParentRemoveAt.children.content[i10];
                if (Intrinsics.areEqual(node.getModifierNode(), pointerInputModifierNode)) {
                    nodeParentRemoveAt.children.remove(node);
                    node.dispatchCancel();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.add(node);
                    i10++;
                }
            }
        }
    }
}
