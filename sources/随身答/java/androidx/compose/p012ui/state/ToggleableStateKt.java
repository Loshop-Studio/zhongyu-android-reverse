package androidx.compose.p012ui.state;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m13413d2 = {"ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "value", "", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ToggleableStateKt {
    public static final ToggleableState ToggleableState(boolean z9) {
        return z9 ? ToggleableState.f1266On : ToggleableState.Off;
    }
}
