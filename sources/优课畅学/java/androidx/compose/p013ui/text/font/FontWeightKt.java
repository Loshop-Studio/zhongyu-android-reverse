package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.util.MathHelpersKt;
import p077d8.AbstractC8323h;

/* loaded from: classes2.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f10) {
        return new FontWeight(AbstractC8323h.m13518m(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f10), 1, 1000));
    }
}
