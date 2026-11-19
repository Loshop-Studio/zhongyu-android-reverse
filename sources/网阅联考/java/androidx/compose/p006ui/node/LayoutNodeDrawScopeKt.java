package androidx.compose.p006ui.node;

import androidx.compose.p006ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m5175d2 = {"nextDrawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DrawModifierNode nextDrawNode(DelegatableNode delegatableNode) {
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(4);
        int iM10773constructorimpl2 = NodeKind.m10773constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            return null;
        }
        int aggregateChildKindSet = child.getAggregateChildKindSet() & iM10773constructorimpl;
        if (aggregateChildKindSet == 0) {
            return null;
        }
        for (Modifier.Node child2 = child; child2 != 0 && (child2.getKindSet() & iM10773constructorimpl2) == 0; child2 = child2.getChild()) {
            if ((child2.getKindSet() & iM10773constructorimpl) != 0) {
                return (DrawModifierNode) child2;
            }
        }
        return null;
    }
}
