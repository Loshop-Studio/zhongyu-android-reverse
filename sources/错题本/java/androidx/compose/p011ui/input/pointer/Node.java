package androidx.compose.p011ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.util.PointerIdArray;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010!\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006?"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", "", "hasPositionChanged", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "Ld6/s;", "clearCache", "()V", "Lkotlin/Function0;", "block", "dispatchIfNeeded", "(Lr6/a;)Z", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "hitNodes", "removeInvalidPointerIdsAndChanges", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchMainEventPass", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "dispatchCancel", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Landroidx/collection/LongSparseArray;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "wasIn", "Z", "isIn", "hasExited", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,688:1\n633#1,5:698\n640#1:800\n633#1,5:801\n640#1:859\n423#2,9:689\n423#2,9:747\n423#2,9:850\n423#2,9:923\n95#3:703\n95#3:756\n95#3:806\n95#3:860\n95#3:932\n437#4,6:704\n447#4,2:711\n449#4,8:716\n457#4,9:727\n466#4,8:739\n437#4,6:757\n447#4,2:764\n449#4,8:769\n457#4,9:780\n466#4,8:792\n437#4,6:807\n447#4,2:814\n449#4,8:819\n457#4,9:830\n466#4,8:842\n437#4,6:861\n447#4,2:868\n449#4,8:873\n457#4,9:884\n466#4,8:896\n437#4,6:933\n447#4,2:940\n449#4,8:945\n457#4,9:956\n466#4,8:968\n246#5:710\n246#5:763\n246#5:813\n246#5:867\n246#5:939\n240#6,3:713\n243#6,3:736\n240#6,3:766\n243#6,3:789\n240#6,3:816\n243#6,3:839\n240#6,3:870\n243#6,3:893\n240#6,3:942\n243#6,3:965\n1101#7:724\n1083#7,2:725\n1101#7:777\n1083#7,2:778\n1101#7:827\n1083#7,2:828\n1101#7:881\n1083#7,2:882\n1101#7:953\n1083#7,2:954\n111#8,2:904\n111#8,2:910\n34#9,4:906\n39#9:912\n117#9,2:914\n34#9,6:916\n119#9:922\n34#9,4:976\n39#9:981\n40#10:913\n67#10:980\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n410#1:698,5\n410#1:800\n449#1:801,5\n449#1:859\n395#1:689,9\n421#1:747,9\n459#1:850,9\n650#1:923,9\n415#1:703\n435#1:756\n453#1:806\n487#1:860\n651#1:932\n415#1:704,6\n415#1:711,2\n415#1:716,8\n415#1:727,9\n415#1:739,8\n435#1:757,6\n435#1:764,2\n435#1:769,8\n435#1:780,9\n435#1:792,8\n453#1:807,6\n453#1:814,2\n453#1:819,8\n453#1:830,9\n453#1:842,8\n487#1:861,6\n487#1:868,2\n487#1:873,8\n487#1:884,9\n487#1:896,8\n651#1:933,6\n651#1:940,2\n651#1:945,8\n651#1:956,9\n651#1:968,8\n415#1:710\n435#1:763\n453#1:813\n487#1:867\n651#1:939\n415#1:713,3\n415#1:736,3\n435#1:766,3\n435#1:789,3\n453#1:816,3\n453#1:839,3\n487#1:870,3\n487#1:893,3\n651#1:942,3\n651#1:965,3\n415#1:724\n415#1:725,2\n435#1:777\n435#1:778,2\n453#1:827\n453#1:828,2\n487#1:881\n487#1:882,2\n651#1:953\n651#1:954,2\n504#1:904,2\n514#1:910,2\n509#1:906,4\n509#1:912\n563#1:914,2\n563#1:916,6\n563#1:922\n665#1:976,4\n665#1:981\n549#1:913\n676#1:980\n*E\n"})
/* loaded from: classes2.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;

    @Nullable
    private LayoutCoordinates coordinates;

    @NotNull
    private final Modifier.Node modifierNode;

    @Nullable
    private PointerEvent pointerEvent;
    private boolean wasIn;

    @NotNull
    private final PointerIdArray pointerIds = new PointerIdArray();

    @NotNull
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(@NotNull Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(InterfaceC6469a block) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m10438equalsimpl0(oldEvent.getChanges().get(i).getPosition(), newEvent.getChanges().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0259  */
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
    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<androidx.compose.p011ui.input.pointer.PointerInputChange> r46, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.layout.LayoutCoordinates r47, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.InternalPointerEvent r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.input.pointer.Node.buildCache(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM11836activeHoverEvent0FcD4WY = internalPointerEvent.m11836activeHoverEvent0FcD4WY(pointerInputChange.getId());
            boolean z8 = this.isIn;
            if ((!pressed && !zM11836activeHoverEvent0FcD4WY) || (!pressed && !z8)) {
                this.pointerIds.remove(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m11857equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m11862getExit7fucELk());
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
    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].dispatchCancel();
        }
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).onCancelPointerInput();
            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i8 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                        i8++;
                        if (i8 == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i8 == 1) {
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
    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        boolean z8 = false;
        z8 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.getIsAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            AbstractC5830k.m5327d(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            AbstractC5830k.m5327d(layoutCoordinates);
            long jMo12041getSizeYbymL2g = layoutCoordinates.mo12041getSizeYbymL2g();
            DelegatingNode delegatingNodePop = this.modifierNode;
            int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop).mo6724onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo12041getSizeYbymL2g);
                } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                    int i = 0;
                    delegatingNodePop = delegatingNodePop;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                delegatingNodePop = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop != 0) {
                                    mutableVector.add(delegatingNodePop);
                                    delegatingNodePop = 0;
                                }
                                mutableVector.add(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        delegatingNodePop = delegatingNodePop;
                    }
                    if (i == 1) {
                    }
                }
                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.getIsAttached()) {
                MutableVector<Node> children = getChildren();
                Node[] nodeArr = children.content;
                int size = children.getSize();
                for (int i8 = 0; i8 < size; i8++) {
                    nodeArr[i8].dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z8 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z8;
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
    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@NotNull LongSparseArray<PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        AbstractC5830k.m5327d(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        AbstractC5830k.m5327d(layoutCoordinates);
        long jMo12041getSizeYbymL2g = layoutCoordinates.mo12041getSizeYbymL2g();
        DelegatingNode delegatingNodePop = this.modifierNode;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).mo6724onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo12041getSizeYbymL2g);
            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
        if (this.modifierNode.getIsAttached()) {
            MutableVector<Node> children = getChildren();
            Node[] nodeArr = children.content;
            int size = children.getSize();
            for (int i8 = 0; i8 < size; i8++) {
                Node node = nodeArr[i8];
                LongSparseArray<PointerInputChange> longSparseArray = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                AbstractC5830k.m5327d(layoutCoordinates2);
                node.dispatchMainEventPass(longSparseArray, layoutCoordinates2, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            DelegatingNode delegatingNodePop2 = this.modifierNode;
            int iM12314constructorimpl2 = NodeKind.m12314constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNodePop2 != 0) {
                if (delegatingNodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop2).mo6724onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo12041getSizeYbymL2g);
                } else if ((delegatingNodePop2.getKindSet() & iM12314constructorimpl2) != 0 && (delegatingNodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate2 = delegatingNodePop2.getDelegate();
                    int i9 = 0;
                    delegatingNodePop2 = delegatingNodePop2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iM12314constructorimpl2) != 0) {
                            i9++;
                            if (i9 == 1) {
                                delegatingNodePop2 = delegate2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop2 != 0) {
                                    mutableVector2.add(delegatingNodePop2);
                                    delegatingNodePop2 = 0;
                                }
                                mutableVector2.add(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        delegatingNodePop2 = delegatingNodePop2;
                    }
                    if (i9 == 1) {
                    }
                }
                delegatingNodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    @NotNull
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    @NotNull
    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.p011ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, @NotNull MutableObjectList<Node> hitNodes) {
        if (this.pointerIds.contains(pointerIdValue) && !hitNodes.contains(this)) {
            this.pointerIds.remove(pointerIdValue);
            this.relevantChanges.remove(pointerIdValue);
        }
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
        }
    }

    @NotNull
    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
