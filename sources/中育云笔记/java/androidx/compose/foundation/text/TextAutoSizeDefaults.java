package androidx.compose.foundation.text;

import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;
    public static final TextAutoSizeDefaults INSTANCE = new TextAutoSizeDefaults();
    private static final long MinFontSize = TextUnitKt.getSp(12);
    private static final long MaxFontSize = TextUnitKt.getSp(112);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m27880getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m27881getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }
}
