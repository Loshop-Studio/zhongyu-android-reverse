package androidx.compose.p013ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p134i7.AbstractC8778f0;

/* loaded from: classes2.dex */
public final class SemanticsOwnerKt {
    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z10, boolean z11) {
        return AbstractC8778f0.m14544U0(getAllSemanticsNodesToMap(semanticsOwner, !z10, z11).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z10, z11);
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z10, boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z10 ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z11 && unmergedRootSemanticsNode.getLayoutNode$ui_release().isDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z11, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z10, z11);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z10, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui_release$default = SemanticsNode.getChildren$ui_release$default(semanticsNode, false, false, !z10, 3, null);
        int size = children$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z10, (SemanticsNode) children$ui_release$default.get(i10));
        }
    }
}
