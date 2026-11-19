package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusTargetModifierNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, m5175d2 = {"focusModifier", "Landroidx/compose/ui/Modifier;", "focusTarget", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusModifierKt {
    @Deprecated(message = "Replaced by focusTarget", replaceWith = @ReplaceWith(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    public static final Modifier focusModifier(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(FocusTargetModifierNode.FocusTargetModifierElement.INSTANCE);
    }
}
