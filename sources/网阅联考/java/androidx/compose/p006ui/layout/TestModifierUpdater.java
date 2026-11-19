package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m5175d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "updateModifier", "", "modifier", "Landroidx/compose/ui/Modifier;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
    }

    public final void updateModifier(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.node.setModifier(modifier);
    }
}
