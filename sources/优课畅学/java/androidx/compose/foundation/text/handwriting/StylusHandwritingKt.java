package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.input.pointer.PointerIconKt;
import androidx.compose.p013ui.node.DpTouchBoundsExpansion;
import androidx.compose.p013ui.node.TouchBoundsExpansionKt;
import androidx.compose.p013ui.unit.C3156Dp;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class StylusHandwritingKt {
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    static {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(40);
        HandwritingBoundsVerticalOffset = fM26899constructorimpl;
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(10);
        HandwritingBoundsHorizontalOffset = fM26899constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m26004DpTouchBoundsExpansiona9UjIt4(fM26899constructorimpl2, fM26899constructorimpl, fM26899constructorimpl2, fM26899constructorimpl);
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

    public static final Modifier stylusHandwriting(Modifier modifier, boolean z10, boolean z11, InterfaceC10559a interfaceC10559a) {
        if (!z10 || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z11) {
            modifier = PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(interfaceC10559a));
    }
}
