package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m21590timesNB67dxo(long j10, long j11) {
        if (!TextUnit.m27095isEmimpl(j11)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m27100toStringimpl(j11)) + '.');
        }
        if (TextUnit.m27095isEmimpl(j10)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m27100toStringimpl(j11)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m27091getRawTypeimpl(j10) != 0) {
            float fM27093getValueimpl = TextUnit.m27093getValueimpl(j11);
            TextUnitKt.m27106checkArithmeticR2X_6o(j10);
            return TextUnitKt.pack(TextUnit.m27091getRawTypeimpl(j10), TextUnit.m27093getValueimpl(j10) * fM27093getValueimpl);
        }
        long j12 = DefaultFontSize;
        float fM27093getValueimpl2 = TextUnit.m27093getValueimpl(j11);
        TextUnitKt.m27106checkArithmeticR2X_6o(j12);
        return TextUnitKt.pack(TextUnit.m27091getRawTypeimpl(j12), TextUnit.m27093getValueimpl(j12) * fM27093getValueimpl2);
    }
}
