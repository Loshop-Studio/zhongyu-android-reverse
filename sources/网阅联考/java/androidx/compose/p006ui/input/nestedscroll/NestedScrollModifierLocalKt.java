package androidx.compose.p006ui.input.nestedscroll;

import androidx.compose.p006ui.modifier.ModifierLocalKt;
import androidx.compose.p006ui.modifier.ProvidableModifierLocal;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5175d2 = {"ModifierLocalNestedScroll", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "getModifierLocalNestedScroll", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class NestedScrollModifierLocalKt {
    private static final ProvidableModifierLocal<NestedScrollModifierLocal> ModifierLocalNestedScroll = ModifierLocalKt.modifierLocalOf(new Function0<NestedScrollModifierLocal>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocalKt$ModifierLocalNestedScroll$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final NestedScrollModifierLocal invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<NestedScrollModifierLocal> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }
}
