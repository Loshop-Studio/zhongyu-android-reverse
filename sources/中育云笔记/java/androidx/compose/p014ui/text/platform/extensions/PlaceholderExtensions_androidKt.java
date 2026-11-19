package androidx.compose.p014ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.PlaceholderVerticalAlign;
import androidx.compose.p014ui.text.android.style.PlaceholderSpan;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;

/* loaded from: classes2.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m33236getSpanUnitR2X_6o(long j10) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m33237getSpanUnitR2X_6o$annotations(long j10) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m33238getSpanVerticalAligndo9XGg(int i10) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32877getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32883getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32878getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32879getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32882getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32880getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m32873equalsimpl0(i10, companion.m32881getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m33239getSpanVerticalAligndo9XGg$annotations(int i10) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i10, int i11, Density density) {
        for (Object obj : spannable.getSpans(i10, i11, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m33695getValueimpl(placeholder.m32869getWidthXSAIIZE()), m33236getSpanUnitR2X_6o(placeholder.m32869getWidthXSAIIZE()), TextUnit.m33695getValueimpl(placeholder.m32867getHeightXSAIIZE()), m33236getSpanUnitR2X_6o(placeholder.m32867getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m33238getSpanVerticalAligndo9XGg(placeholder.m32868getPlaceholderVerticalAlignJ6kI3mc())), i10, i11);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<Placeholder> range = list.get(i10);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
