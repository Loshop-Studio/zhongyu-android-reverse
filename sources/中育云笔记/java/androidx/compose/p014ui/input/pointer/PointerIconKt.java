package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.DpTouchBoundsExpansion;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z10) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z10));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z10);
    }

    public static final Modifier stylusHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z10, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z10, dpTouchBoundsExpansion);
    }
}
