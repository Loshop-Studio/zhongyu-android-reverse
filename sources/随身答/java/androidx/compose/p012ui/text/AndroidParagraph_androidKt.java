package androidx.compose.p012ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p012ui.text.TextGranularity;
import androidx.compose.p012ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.p012ui.text.android.TextLayout;
import androidx.compose.p012ui.text.android.style.IndentationFixSpan;
import androidx.compose.p012ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p012ui.text.style.Hyphens;
import androidx.compose.p012ui.text.style.LineBreak;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.unit.TextUnit;
import androidx.compose.p012ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a\u0016\u0010 \u001a\u00020\u0006*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m13413d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i9) {
        int lineCount = textLayout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (textLayout.getLineBottom(i10) > i9) {
                return i10;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z9) {
        if (z9 && !TextUnit.m24185equalsimpl0(textStyle.m23496getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m24185equalsimpl0(textStyle.m23496getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m24199getUnspecifiedXSAIIZE())) {
            int iM23501getTextAligne0LSkKk = textStyle.m23501getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            if (!TextAlign.m23874equalsimpl0(iM23501getTextAligne0LSkKk, companion.m23884getUnspecifiede0LSkKk()) && !TextAlign.m23874equalsimpl0(textStyle.m23501getTextAligne0LSkKk(), companion.m23883getStarte0LSkKk()) && !TextAlign.m23874equalsimpl0(textStyle.m23501getTextAligne0LSkKk(), companion.m23880getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m23283toLayoutAlignaXe7zB0(int i9) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m23874equalsimpl0(i9, companion.m23881getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m23874equalsimpl0(i9, companion.m23882getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m23874equalsimpl0(i9, companion.m23878getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m23874equalsimpl0(i9, companion.m23883getStarte0LSkKk()) && TextAlign.m23874equalsimpl0(i9, companion.m23879getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m23284toLayoutBreakStrategyxImikfE(int i9) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (LineBreak.Strategy.m23803equalsimpl0(i9, companion.m23809getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m23803equalsimpl0(i9, companion.m23808getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m23803equalsimpl0(i9, companion.m23807getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m23285toLayoutHyphenationFrequency3fSNIE(int i9) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (Hyphens.m23772equalsimpl0(i9, companion.m23776getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m23772equalsimpl0(i9, companion.m23777getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m23286toLayoutLineBreakStylehpcqdu8(int i9) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (LineBreak.Strictness.m23814equalsimpl0(i9, companion.m23818getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m23814equalsimpl0(i9, companion.m23819getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m23814equalsimpl0(i9, companion.m23820getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m23814equalsimpl0(i9, companion.m23821getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m23287toLayoutLineBreakWordStylewPN0Rpw(int i9) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        return (!LineBreak.WordBreak.m23826equalsimpl0(i9, companion.m23830getDefaultjp8hJ3c()) && LineBreak.WordBreak.m23826equalsimpl0(i9, companion.m23831getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m23288toLayoutTextGranularityduNsdkg(int i9) {
        TextGranularity.Companion companion = TextGranularity.INSTANCE;
        return (!TextGranularity.m23418equalsimpl0(i9, companion.m23422getCharacterDRrd7Zo()) && TextGranularity.m23418equalsimpl0(i9, companion.m23423getWordDRrd7Zo())) ? 1 : 0;
    }
}
