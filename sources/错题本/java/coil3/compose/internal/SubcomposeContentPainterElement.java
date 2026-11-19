package coil3.compose.internal;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m5110d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/SubcomposeContentPainterNode;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class SubcomposeContentPainterElement extends ModifierNodeElement<SubcomposeContentPainterNode> {
    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public final Modifier.Node getNode() {
        return new SubcomposeContentPainterNode(null, null, 0.0f, false, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        ((SubcomposeContentPainterElement) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("painter", null);
        inspectorInfo.getProperties().set("alignment", null);
        inspectorInfo.getProperties().set("contentScale", null);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(0.0f));
        inspectorInfo.getProperties().set("colorFilter", null);
        inspectorInfo.getProperties().set("clipToBounds", Boolean.FALSE);
        inspectorInfo.getProperties().set("contentDescription", null);
    }

    public final String toString() {
        return "SubcomposeContentPainterElement(painter=null, alignment=null, contentScale=null, alpha=0.0, colorFilter=null, clipToBounds=false, contentDescription=null)";
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((SubcomposeContentPainterNode) node).getClass();
        throw null;
    }
}
