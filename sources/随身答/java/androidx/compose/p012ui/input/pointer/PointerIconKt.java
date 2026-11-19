package androidx.compose.p012ui.input.pointer;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.node.DpTouchBoundsExpansion;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, m13413d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "stylusHoverIcon", "touchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z9) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z9));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z9);
    }

    public static final Modifier stylusHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z9, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z9, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z9, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        if ((i9 & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z9, dpTouchBoundsExpansion);
    }
}
