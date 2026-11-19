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
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a\u0016\u0010 \u001a\u00020\u0006*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m13558d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
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
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z9) {
        if (z9 && !TextUnit.m23752equalsimpl0(textStyle.m23063getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m23752equalsimpl0(textStyle.m23063getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE())) {
            int iM23068getTextAligne0LSkKk = textStyle.m23068getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            if (!TextAlign.m23441equalsimpl0(iM23068getTextAligne0LSkKk, companion.m23451getUnspecifiede0LSkKk()) && !TextAlign.m23441equalsimpl0(textStyle.m23068getTextAligne0LSkKk(), companion.m23450getStarte0LSkKk()) && !TextAlign.m23441equalsimpl0(textStyle.m23068getTextAligne0LSkKk(), companion.m23447getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m22850toLayoutAlignaXe7zB0(int i10) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m23441equalsimpl0(i10, companion.m23448getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m23441equalsimpl0(i10, companion.m23449getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m23441equalsimpl0(i10, companion.m23445getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m23441equalsimpl0(i10, companion.m23450getStarte0LSkKk()) && TextAlign.m23441equalsimpl0(i10, companion.m23446getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m22851toLayoutBreakStrategyxImikfE(int i10) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (LineBreak.Strategy.m23370equalsimpl0(i10, companion.m23376getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m23370equalsimpl0(i10, companion.m23375getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m23370equalsimpl0(i10, companion.m23374getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m22852toLayoutHyphenationFrequency3fSNIE(int i10) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (Hyphens.m23339equalsimpl0(i10, companion.m23343getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m23339equalsimpl0(i10, companion.m23344getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m22853toLayoutLineBreakStylehpcqdu8(int i10) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (LineBreak.Strictness.m23381equalsimpl0(i10, companion.m23385getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m23381equalsimpl0(i10, companion.m23386getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m23381equalsimpl0(i10, companion.m23387getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m23381equalsimpl0(i10, companion.m23388getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m22854toLayoutLineBreakWordStylewPN0Rpw(int i10) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        return (!LineBreak.WordBreak.m23393equalsimpl0(i10, companion.m23397getDefaultjp8hJ3c()) && LineBreak.WordBreak.m23393equalsimpl0(i10, companion.m23398getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m22855toLayoutTextGranularityduNsdkg(int i10) {
        TextGranularity.Companion companion = TextGranularity.INSTANCE;
        return (!TextGranularity.m22985equalsimpl0(i10, companion.m22989getCharacterDRrd7Zo()) && TextGranularity.m22985equalsimpl0(i10, companion.m22990getWordDRrd7Zo())) ? 1 : 0;
    }
}
