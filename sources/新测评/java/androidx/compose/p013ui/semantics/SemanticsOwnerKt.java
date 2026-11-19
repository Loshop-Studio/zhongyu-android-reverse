package androidx.compose.p013ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u000b"}, m13558d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "skipDeactivatedNodes", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n34#2,6:122\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n109#1:122,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsOwnerKt {
    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z9, boolean z10) {
        return CollectionsKt.toList(getAllSemanticsNodesToMap(semanticsOwner, !z9, z10).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z9, z10);
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z9, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z9 ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z10 && unmergedRootSemanticsNode.getLayoutNode().getIsDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z10, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z9, z10);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z9, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui_release$default = SemanticsNode.getChildren$ui_release$default(semanticsNode, false, false, !z9, 3, null);
        int size = children$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z9, (SemanticsNode) children$ui_release$default.get(i10));
        }
    }
}
