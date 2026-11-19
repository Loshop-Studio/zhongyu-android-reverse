package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.Paragraph;
import androidx.compose.p013ui.text.ParagraphKt;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;

/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement = AbstractC8687z.m14097E("H", 10);

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i10) {
        Paragraph paragraphM26233ParagraphUl8oQg4 = ParagraphKt.m26233ParagraphUl8oQg4(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, (64 & 32) != 0 ? AbstractC8809v.m14771n() : AbstractC8809v.m14771n(), (64 & 64) != 0 ? AbstractC8809v.m14771n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & 256) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : TextOverflow.Companion.m26834getClipgIe3tQ8());
        return IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(paragraphM26233ParagraphUl8oQg4.getMinIntrinsicWidth()) << 32) | (TextDelegateKt.ceilToIntPx(paragraphM26233ParagraphUl8oQg4.getHeight()) & 4294967295L));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i10);
    }

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
