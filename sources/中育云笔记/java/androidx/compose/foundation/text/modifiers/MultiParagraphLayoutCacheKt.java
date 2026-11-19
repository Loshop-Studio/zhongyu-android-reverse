package androidx.compose.foundation.text.modifiers;

import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m28192timesNB67dxo(long j10, long j11) {
        if (!TextUnit.m33697isEmimpl(j11)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m33702toStringimpl(j11)) + '.');
        }
        if (TextUnit.m33697isEmimpl(j10)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m33702toStringimpl(j11)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m33693getRawTypeimpl(j10) != 0) {
            float fM33695getValueimpl = TextUnit.m33695getValueimpl(j11);
            TextUnitKt.m33708checkArithmeticR2X_6o(j10);
            return TextUnitKt.pack(TextUnit.m33693getRawTypeimpl(j10), TextUnit.m33695getValueimpl(j10) * fM33695getValueimpl);
        }
        long j12 = DefaultFontSize;
        float fM33695getValueimpl2 = TextUnit.m33695getValueimpl(j11);
        TextUnitKt.m33708checkArithmeticR2X_6o(j12);
        return TextUnitKt.pack(TextUnit.m33693getRawTypeimpl(j12), TextUnit.m33695getValueimpl(j12) * fM33695getValueimpl2);
    }
}
