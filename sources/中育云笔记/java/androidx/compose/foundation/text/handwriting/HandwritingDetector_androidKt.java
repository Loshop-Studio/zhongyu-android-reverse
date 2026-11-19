package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.PointerIconKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class HandwritingDetector_androidKt {
    public static final Modifier handwritingDetector(Modifier modifier, InterfaceC9529a interfaceC9529a) {
        return StylusHandwriting_androidKt.isStylusHandwritingSupported() ? PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, StylusHandwritingKt.getHandwritingBoundsExpansion()).then(new HandwritingDetectorElement(interfaceC9529a)) : modifier;
    }
}
