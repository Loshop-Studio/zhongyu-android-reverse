package androidx.compose.p014ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class HitPathTracker {
    public static final int $stable = 8;
    private boolean clearNodeCacheAfterDispatchedEvent;
    private boolean dispatchCancelAfterDispatchedEvent;
    private boolean dispatchingEvent;
    private boolean removeSpecificNodesAfterDispatchedEvent;
    private final LayoutCoordinates rootCoordinates;
    private final MutableObjectList<Modifier.Node> nodesToRemove = new MutableObjectList<>(0, 1, null);
    private final NodeParent root = new NodeParent();
    private final MutableLongObjectMap<MutableObjectList<Node>> hitPointerIdsAndNodes = new MutableLongObjectMap<>(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m32028addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j10, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        hitPathTracker.m32029addHitPathQJqDSyo(j10, list, z10);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z10);
    }

    private final void removeInvalidPointerIdsAndChanges(long j10, MutableObjectList<Node> mutableObjectList) {
        this.root.removeInvalidPointerIdsAndChanges(j10, mutableObjectList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointerInputModifierNode(Modifier.Node node) {
        if (!this.dispatchingEvent) {
            this.root.removePointerInputModifierNode(node);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.add(node);
        }
    }

    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m32029addHitPathQJqDSyo(long j10, List<? extends Modifier.Node> list, boolean z10) {
        Node node;
        NodeParent nodeParent = this.root;
        this.hitPointerIdsAndNodes.clear();
        int size = list.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            final Modifier.Node node2 = list.get(i10);
            if (node2.isAttached()) {
                node2.setDetachedListener$ui_release(new InterfaceC9529a() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m32030invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m32030invoke() {
                        this.this$0.removePointerInputModifierNode(node2);
                    }
                });
                if (z11) {
                    MutableVector<Node> children = nodeParent.getChildren();
                    Node[] nodeArr = children.content;
                    int size2 = children.getSize();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i11];
                        if (AbstractC9979u.m20289b(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    Node node3 = node;
                    if (node3 != null) {
                        node3.markIsIn();
                        node3.getPointerIds().add(j10);
                        MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap = this.hitPointerIdsAndNodes;
                        MutableObjectList<Node> mutableObjectList = mutableLongObjectMap.get(j10);
                        if (mutableObjectList == null) {
                            mutableObjectList = new MutableObjectList<>(0, 1, null);
                            mutableLongObjectMap.set(j10, mutableObjectList);
                        }
                        mutableObjectList.add(node3);
                        nodeParent = node3;
                    } else {
                        z11 = false;
                    }
                }
                Node node4 = new Node(node2);
                node4.getPointerIds().add(j10);
                MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap2 = this.hitPointerIdsAndNodes;
                MutableObjectList<Node> mutableObjectList2 = mutableLongObjectMap2.get(j10);
                if (mutableObjectList2 == null) {
                    mutableObjectList2 = new MutableObjectList<>(0, 1, null);
                    mutableLongObjectMap2.set(j10, mutableObjectList2);
                }
                mutableObjectList2.add(node4);
                nodeParent.getChildren().add(node4);
                nodeParent = node4;
            }
        }
        if (!z10) {
            return;
        }
        MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap3 = this.hitPointerIdsAndNodes;
        long[] jArr = mutableLongObjectMap3.keys;
        Object[] objArr = mutableLongObjectMap3.values;
        long[] jArr2 = mutableLongObjectMap3.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr2[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i12 << 3) + i14;
                        removeInvalidPointerIdsAndChanges(jArr[i15], (MutableObjectList) objArr[i15]);
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.clear();
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z10) {
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z10)) {
            return false;
        }
        boolean z11 = true;
        this.dispatchingEvent = true;
        boolean zDispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z10);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !zDispatchMainEventPass) {
            z11 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int size = this.nodesToRemove.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                removePointerInputModifierNode(this.nodesToRemove.get(i10));
            }
            this.nodesToRemove.clear();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            processCancel();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            clearPreviouslyHitModifierNodeCache();
        }
        return z11;
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.dispatchCancel();
            clearPreviouslyHitModifierNodeCache();
        }
    }
}
