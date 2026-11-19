package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.DpTouchBoundsExpansion;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, m5110d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "stylusHoverIcon", "touchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerIconKt {
    @Stable
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier, @NotNull PointerIcon pointerIcon, boolean z8) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z8));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z8);
    }

    @NotNull
    public static final Modifier stylusHoverIcon(@NotNull Modifier modifier, @NotNull PointerIcon pointerIcon, boolean z8, @Nullable DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z8, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z8, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z8, dpTouchBoundsExpansion);
    }
}
