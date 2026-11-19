package androidx.compose.p013ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p013ui.text.TextGranularity;
import androidx.compose.p013ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.p013ui.text.android.TextLayout;
import androidx.compose.p013ui.text.android.style.IndentationFixSpan;
import androidx.compose.p013ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p013ui.text.style.Hyphens;
import androidx.compose.p013ui.text.style.LineBreak;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;

/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i10) {
        int lineCount = textLayout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (textLayout.getLineBottom(i11) > i10) {
                return i11;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z10) {
        if (z10 && !TextUnit.m27090equalsimpl0(textStyle.m26400getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m27090equalsimpl0(textStyle.m26400getLetterSpacingXSAIIZE(), TextUnit.Companion.m27104getUnspecifiedXSAIIZE())) {
            int iM26405getTextAligne0LSkKk = textStyle.m26405getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.Companion;
            if (!TextAlign.m26779equalsimpl0(iM26405getTextAligne0LSkKk, companion.m26789getUnspecifiede0LSkKk()) && !TextAlign.m26779equalsimpl0(textStyle.m26405getTextAligne0LSkKk(), companion.m26788getStarte0LSkKk()) && !TextAlign.m26779equalsimpl0(textStyle.m26405getTextAligne0LSkKk(), companion.m26785getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m26187toLayoutAlignaXe7zB0(int i10) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m26779equalsimpl0(i10, companion.m26786getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m26779equalsimpl0(i10, companion.m26787getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m26779equalsimpl0(i10, companion.m26783getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m26779equalsimpl0(i10, companion.m26788getStarte0LSkKk()) && TextAlign.m26779equalsimpl0(i10, companion.m26784getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m26188toLayoutBreakStrategyxImikfE(int i10) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m26708equalsimpl0(i10, companion.m26714getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m26708equalsimpl0(i10, companion.m26713getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m26708equalsimpl0(i10, companion.m26712getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m26189toLayoutHyphenationFrequency3fSNIE(int i10) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m26677equalsimpl0(i10, companion.m26681getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m26677equalsimpl0(i10, companion.m26682getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m26190toLayoutLineBreakStylehpcqdu8(int i10) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m26719equalsimpl0(i10, companion.m26723getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m26719equalsimpl0(i10, companion.m26724getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m26719equalsimpl0(i10, companion.m26725getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m26719equalsimpl0(i10, companion.m26726getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m26191toLayoutLineBreakWordStylewPN0Rpw(int i10) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m26731equalsimpl0(i10, companion.m26735getDefaultjp8hJ3c()) && LineBreak.WordBreak.m26731equalsimpl0(i10, companion.m26736getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m26192toLayoutTextGranularityduNsdkg(int i10) {
        TextGranularity.Companion companion = TextGranularity.Companion;
        return (!TextGranularity.m26322equalsimpl0(i10, companion.m26326getCharacterDRrd7Zo()) && TextGranularity.m26322equalsimpl0(i10, companion.m26327getWordDRrd7Zo())) ? 1 : 0;
    }
}
