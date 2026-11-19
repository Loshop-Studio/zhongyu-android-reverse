package androidx.compose.p014ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final MutableObjectList<SemanticsListener> listeners = new MutableObjectList<>(2);
    private final IntObjectMap<LayoutNode> nodes;
    private final EmptySemanticsModifier outerSemanticsNode;
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, IntObjectMap<LayoutNode> intObjectMap) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = intObjectMap;
    }

    public final SemanticsInfo get$ui_release(int i10) {
        return this.nodes.get(i10);
    }

    public final MutableObjectList<SemanticsListener> getListeners$ui_release() {
        return this.listeners;
    }

    public final SemanticsInfo getRootInfo$ui_release() {
        return this.rootNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui_release(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        MutableObjectList<SemanticsListener> mutableObjectList = this.listeners;
        Object[] objArr = mutableObjectList.content;
        int i10 = mutableObjectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ((SemanticsListener) objArr[i11]).onSemanticsChanged(semanticsInfo, semanticsConfiguration);
        }
    }
}
