package androidx.compose.p014ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p014ui.text.TextGranularity;
import androidx.compose.p014ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.p014ui.text.android.TextLayout;
import androidx.compose.p014ui.text.android.style.IndentationFixSpan;
import androidx.compose.p014ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;

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
        if (z10 && !TextUnit.m33692equalsimpl0(textStyle.m33002getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m33692equalsimpl0(textStyle.m33002getLetterSpacingXSAIIZE(), TextUnit.Companion.m33706getUnspecifiedXSAIIZE())) {
            int iM33007getTextAligne0LSkKk = textStyle.m33007getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.Companion;
            if (!TextAlign.m33381equalsimpl0(iM33007getTextAligne0LSkKk, companion.m33391getUnspecifiede0LSkKk()) && !TextAlign.m33381equalsimpl0(textStyle.m33007getTextAligne0LSkKk(), companion.m33390getStarte0LSkKk()) && !TextAlign.m33381equalsimpl0(textStyle.m33007getTextAligne0LSkKk(), companion.m33387getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m32789toLayoutAlignaXe7zB0(int i10) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m33381equalsimpl0(i10, companion.m33388getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m33381equalsimpl0(i10, companion.m33389getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m33381equalsimpl0(i10, companion.m33385getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m33381equalsimpl0(i10, companion.m33390getStarte0LSkKk()) && TextAlign.m33381equalsimpl0(i10, companion.m33386getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m32790toLayoutBreakStrategyxImikfE(int i10) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m33310equalsimpl0(i10, companion.m33316getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m33310equalsimpl0(i10, companion.m33315getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m33310equalsimpl0(i10, companion.m33314getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m32791toLayoutHyphenationFrequency3fSNIE(int i10) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m33279equalsimpl0(i10, companion.m33283getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m33279equalsimpl0(i10, companion.m33284getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m32792toLayoutLineBreakStylehpcqdu8(int i10) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m33321equalsimpl0(i10, companion.m33325getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m33321equalsimpl0(i10, companion.m33326getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m33321equalsimpl0(i10, companion.m33327getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m33321equalsimpl0(i10, companion.m33328getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m32793toLayoutLineBreakWordStylewPN0Rpw(int i10) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m33333equalsimpl0(i10, companion.m33337getDefaultjp8hJ3c()) && LineBreak.WordBreak.m33333equalsimpl0(i10, companion.m33338getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m32794toLayoutTextGranularityduNsdkg(int i10) {
        TextGranularity.Companion companion = TextGranularity.Companion;
        return (!TextGranularity.m32924equalsimpl0(i10, companion.m32928getCharacterDRrd7Zo()) && TextGranularity.m32924equalsimpl0(i10, companion.m32929getWordDRrd7Zo())) ? 1 : 0;
    }
}
