package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.util.MathHelpersKt;
import p265nd.AbstractC10410o;

/* loaded from: classes2.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f10) {
        return new FontWeight(AbstractC10410o.m21761n(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f10), 1, 1000));
    }
}
