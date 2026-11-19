package androidx.compose.p013ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0015J\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m13558d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "clearNodeCacheAfterDispatchedEvent", "", "dispatchCancelAfterDispatchedEvent", "dispatchingEvent", "hitPointerIdsAndNodes", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "nodesToRemove", "Landroidx/compose/ui/Modifier$Node;", "removeSpecificNodesAfterDispatchedEvent", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "addHitPath", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "addHitPath-QJqDSyo", "(JLjava/util/List;Z)V", "clearPreviouslyHitModifierNodeCache", "dispatchChanges", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "processCancel", "removeInvalidPointerIdsAndChanges", "", "hitNodes", "removePointerInputModifierNode", "pointerInputNode", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n+ 4 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,688:1\n347#2,8:689\n128#3:697\n128#3:702\n679#4:698\n679#4:703\n1516#5:699\n1516#5:704\n1#6:700\n1#6:701\n1#6:705\n382#7,4:706\n354#7,6:710\n364#7,3:717\n367#7,9:721\n386#7:730\n1399#8:716\n1270#8:720\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n89#1:689,8\n93#1:697\n108#1:702\n96#1:698\n111#1:703\n97#1:699\n111#1:704\n96#1:700\n111#1:705\n121#1:706,4\n121#1:710,6\n121#1:717,3\n121#1:721,9\n121#1:730\n121#1:716\n121#1:720\n*E\n"})
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
    public static /* synthetic */ void m22124addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j10, List list, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        hitPathTracker.m22125addHitPathQJqDSyo(j10, list, z9);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z9);
    }

    private final void removeInvalidPointerIdsAndChanges(long pointerId, MutableObjectList<Node> hitNodes) {
        this.root.removeInvalidPointerIdsAndChanges(pointerId, hitNodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointerInputModifierNode(Modifier.Node pointerInputNode) {
        if (!this.dispatchingEvent) {
            this.root.removePointerInputModifierNode(pointerInputNode);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.add(pointerInputNode);
        }
    }

    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m22125addHitPathQJqDSyo(long pointerId, List<? extends Modifier.Node> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        Node node;
        NodeParent nodeParent = this.root;
        this.hitPointerIdsAndNodes.clear();
        int size = pointerInputNodes.size();
        boolean z9 = true;
        for (int i10 = 0; i10 < size; i10++) {
            final Modifier.Node node2 = pointerInputNodes.get(i10);
            if (node2.getIsAttached()) {
                node2.setDetachedListener$ui_release(new Function0<Unit>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.removePointerInputModifierNode(node2);
                    }
                });
                if (z9) {
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
                        if (Intrinsics.areEqual(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    Node node3 = node;
                    if (node3 != null) {
                        node3.markIsIn();
                        node3.getPointerIds().add(pointerId);
                        MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap = this.hitPointerIdsAndNodes;
                        MutableObjectList<Node> mutableObjectList = mutableLongObjectMap.get(pointerId);
                        if (mutableObjectList == null) {
                            mutableObjectList = new MutableObjectList<>(0, 1, null);
                            mutableLongObjectMap.set(pointerId, mutableObjectList);
                        }
                        mutableObjectList.add(node3);
                        nodeParent = node3;
                    } else {
                        z9 = false;
                    }
                }
                Node node4 = new Node(node2);
                node4.getPointerIds().add(pointerId);
                MutableLongObjectMap<MutableObjectList<Node>> mutableLongObjectMap2 = this.hitPointerIdsAndNodes;
                MutableObjectList<Node> mutableObjectList2 = mutableLongObjectMap2.get(pointerId);
                if (mutableObjectList2 == null) {
                    mutableObjectList2 = new MutableObjectList<>(0, 1, null);
                    mutableLongObjectMap2.set(pointerId, mutableObjectList2);
                }
                mutableObjectList2.add(node4);
                nodeParent.getChildren().add(node4);
                nodeParent = node4;
            }
        }
        if (!prunePointerIdsAndChangesNotInNodesList) {
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
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        removeInvalidPointerIdsAndChanges(jArr[i15], (MutableObjectList) objArr[i15]);
                    }
                    j10 >>= 8;
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

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z9 = true;
        this.dispatchingEvent = true;
        boolean zDispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !zDispatchMainEventPass) {
            z9 = false;
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
        return z9;
    }

    /* renamed from: getRoot$ui_release, reason: from getter */
    public final NodeParent getRoot() {
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
