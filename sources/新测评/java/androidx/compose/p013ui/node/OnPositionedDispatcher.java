package androidx.compose.p013ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "()V", "cachedNodes", "", "Landroidx/compose/ui/node/LayoutNode;", "[Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "Landroidx/compose/runtime/collection/MutableVector;", "dispatch", "", "dispatchHierarchy", "layoutNode", "isNotEmpty", "", "onNodePositioned", "node", "onRootNodePositioned", "rootNode", "remove", "Companion", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,96:1\n1101#2:97\n1083#2,2:98\n519#3:100\n641#3,2:101\n641#3,2:103\n472#3:105\n423#3,9:107\n207#4:106\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:97\n26#1:98,2\n29#1:100\n32#1:101,2\n42#1:103,2\n61#1:105\n79#1:107,9\n79#1:106\n*E\n"})
/* loaded from: classes2.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);
    public static final int $stable = 8;

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            dispatchHierarchy(layoutNodeArr[i10]);
        }
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10] = this.layoutNodes.content[i10];
        }
        this.layoutNodes.clear();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            Intrinsics.checkNotNull(layoutNode);
            if (layoutNode.getNeedsOnPositionedDispatch()) {
                dispatchHierarchy(layoutNode);
            }
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void onNodePositioned(LayoutNode node) {
        this.layoutNodes.add(node);
        node.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(LayoutNode rootNode) {
        this.layoutNodes.clear();
        this.layoutNodes.add(rootNode);
        rootNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(LayoutNode node) {
        this.layoutNodes.remove(node);
    }
}
