package androidx.compose.foundation.text;

import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;
    public static final TextAutoSizeDefaults INSTANCE = new TextAutoSizeDefaults();
    private static final long MinFontSize = TextUnitKt.getSp(12);
    private static final long MaxFontSize = TextUnitKt.getSp(TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m21278getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m21279getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }
}
