package androidx.compose.p006ui.input.pointer;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.node.PointerInputModifierNode;
import androidx.compose.p006ui.node.PointerInputModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0082\bJ7\u0010&\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u001a\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "pointerInputNode", "Landroidx/compose/ui/node/PointerInputModifierNode;", "(Landroidx/compose/ui/node/PointerInputModifierNode;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "getPointerInputNode", "()Landroidx/compose/ui/node/PointerInputModifierNode;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,538:1\n486#1,5:542\n493#1:558\n486#1,5:559\n493#1:575\n1182#2:539\n1161#2,2:540\n460#3,11:547\n460#3,11:564\n48#3:582\n523#3:583\n460#3,11:593\n33#4,6:576\n116#4,2:584\n33#4,6:586\n118#4:592\n33#4,6:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:542,5\n292#1:558\n326#1:559,5\n326#1:575\n263#1:539\n263#1:540,2\n300#1:547,11\n334#1:564,11\n407#1:582\n408#1:583\n504#1:593,11\n377#1:576,6\n415#1:584,2\n415#1:586,6\n415#1:592\n519#1:604,6\n*E\n"})
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;
    private PointerEvent pointerEvent;
    private final MutableVector<PointerId> pointerIds;

    /* renamed from: pointerInputNode, reason: from kotlin metadata and from toString */
    private final PointerInputModifierNode pointerInputFilter;
    private final Map<PointerId, PointerInputChange> relevantChanges;
    private boolean wasIn;

    public Node(PointerInputModifierNode pointerInputNode) {
        Intrinsics.checkNotNullParameter(pointerInputNode, "pointerInputNode");
        this.pointerInputFilter = pointerInputNode;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if (this.relevantChanges.isEmpty() || !PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
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
        for (int i4 = 0; i4 < size; i4++) {
            if (!Offset.m8942equalsimpl0(oldEvent.getChanges().get(i4).getPosition(), newEvent.getChanges().get(i4).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    @Override // androidx.compose.p006ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(java.util.Map<androidx.compose.p006ui.input.pointer.PointerId, androidx.compose.p006ui.input.pointer.PointerInputChange> r31, androidx.compose.p006ui.layout.LayoutCoordinates r32, androidx.compose.p006ui.input.pointer.InternalPointerEvent r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.p006ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i4 = 0; i4 < size; i4++) {
            PointerInputChange pointerInputChange = changes.get(i4);
            if ((pointerInputChange.getPressed() || (internalPointerEvent.m10412issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) && this.isIn)) ? false : true) {
                this.pointerIds.remove(PointerId.m10462boximpl(pointerInputChange.getId()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m10432equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m10437getExit7fucELk());
    }

    @Override // androidx.compose.p006ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i4 = 0;
            do {
                content[i4].dispatchCancel();
                i4++;
            } while (i4 < size);
        }
        this.pointerInputFilter.onCancelPointerInput();
    }

    @Override // androidx.compose.p006ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z3 = false;
        int i4 = 0;
        z3 = false;
        if (!this.relevantChanges.isEmpty() && PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            this.pointerInputFilter.mo10659onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, layoutCoordinates.mo10589getSizeYbymL2g());
            if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter) && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i4].dispatchFinalEventPass(internalPointerEvent);
                    i4++;
                } while (i4 < size);
            }
            z3 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z3;
    }

    @Override // androidx.compose.p006ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(Map<PointerId, PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i4 = 0;
        if (this.relevantChanges.isEmpty() || !PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long jMo10589getSizeYbymL2g = layoutCoordinates.mo10589getSizeYbymL2g();
        this.pointerInputFilter.mo10659onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo10589getSizeYbymL2g);
        if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter) && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            do {
                Node node = content[i4];
                Map<PointerId, PointerInputChange> map = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(map, layoutCoordinates2, internalPointerEvent, isInBounds);
                i4++;
            } while (i4 < size);
        }
        if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            this.pointerInputFilter.mo10659onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo10589getSizeYbymL2g);
        }
        return true;
    }

    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    /* renamed from: getPointerInputNode, reason: from getter */
    public final PointerInputModifierNode getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
