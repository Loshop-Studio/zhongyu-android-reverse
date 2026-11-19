package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.PointerIconKt;
import androidx.compose.p014ui.node.DpTouchBoundsExpansion;
import androidx.compose.p014ui.node.TouchBoundsExpansionKt;
import androidx.compose.p014ui.unit.C3186Dp;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class StylusHandwritingKt {
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(40);
        HandwritingBoundsVerticalOffset = fM33501constructorimpl;
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(10);
        HandwritingBoundsHorizontalOffset = fM33501constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m32606DpTouchBoundsExpansiona9UjIt4(fM33501constructorimpl2, fM33501constructorimpl, fM33501constructorimpl2, fM33501constructorimpl);
    }

    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    public static final Modifier stylusHandwriting(Modifier modifier, boolean z10, boolean z11, InterfaceC9529a interfaceC9529a) {
        if (!z10 || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z11) {
            modifier = PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(interfaceC9529a));
    }
}
