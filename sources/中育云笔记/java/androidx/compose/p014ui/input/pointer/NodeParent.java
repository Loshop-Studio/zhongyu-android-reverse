package androidx.compose.p014ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class NodeParent {
    public static final int $stable = 8;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);
    private final MutableObjectList<NodeParent> removeMatchingPointerInputModifierNodeList = new MutableObjectList<>(10);

    public boolean buildCache(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z10) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z11 = nodeArr[i10].buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z10) || z11;
        }
        return z11;
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
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 = nodeArr[i10].dispatchFinalEventPass(internalPointerEvent) || z10;
        }
        cleanUpHits(internalPointerEvent);
        return z10;
    }

    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z10) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z11 = nodeArr[i10].dispatchMainEventPass(longSparseArray, layoutCoordinates, internalPointerEvent, z10) || z11;
        }
        return z11;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public void removeInvalidPointerIdsAndChanges(long j10, MutableObjectList<Node> mutableObjectList) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            nodeArr[i10].removeInvalidPointerIdsAndChanges(j10, mutableObjectList);
        }
    }

    public void removePointerInputModifierNode(Modifier.Node node) {
        this.removeMatchingPointerInputModifierNodeList.clear();
        this.removeMatchingPointerInputModifierNodeList.add(this);
        while (this.removeMatchingPointerInputModifierNodeList.isNotEmpty()) {
            NodeParent nodeParentRemoveAt = this.removeMatchingPointerInputModifierNodeList.removeAt(r0.getSize() - 1);
            int i10 = 0;
            while (i10 < nodeParentRemoveAt.children.getSize()) {
                Node node2 = nodeParentRemoveAt.children.content[i10];
                if (AbstractC9979u.m20289b(node2.getModifierNode(), node)) {
                    nodeParentRemoveAt.children.remove(node2);
                    node2.dispatchCancel();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.add(node2);
                    i10++;
                }
            }
        }
    }
}
