package androidx.compose.p006ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p006ui.text.android.TextLayout;
import androidx.compose.p006ui.text.android.style.IndentationFixSpan;
import androidx.compose.p006ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p006ui.text.style.Hyphens;
import androidx.compose.p006ui.text.style.LineBreak;
import androidx.compose.p006ui.text.style.TextAlign;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m5175d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i4) {
        int lineCount = textLayout.getLineCount();
        for (int i5 = 0; i5 < lineCount; i5++) {
            if (textLayout.getLineBottom(i5) > i4) {
                return i5;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z3) {
        if (!z3 || TextUnit.m11703equalsimpl0(textStyle.m11102getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m11703equalsimpl0(textStyle.m11102getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE()) || textStyle.m11105getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign textAlignM11105getTextAlignbuA522U = textStyle.m11105getTextAlignbuA522U();
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlignM11105getTextAlignbuA522U == null ? false : TextAlign.m11427equalsimpl0(textAlignM11105getTextAlignbuA522U.getValue(), companion.m11436getStarte0LSkKk())) {
            return false;
        }
        TextAlign textAlignM11105getTextAlignbuA522U2 = textStyle.m11105getTextAlignbuA522U();
        return !(textAlignM11105getTextAlignbuA522U2 == null ? false : TextAlign.m11427equalsimpl0(textAlignM11105getTextAlignbuA522U2.getValue(), companion.m11433getJustifye0LSkKk()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m10952toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlign == null ? false : TextAlign.m11427equalsimpl0(textAlign.getValue(), companion.m11434getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m11427equalsimpl0(textAlign.getValue(), companion.m11435getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m11427equalsimpl0(textAlign.getValue(), companion.m11431getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m11427equalsimpl0(textAlign.getValue(), companion.m11436getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m11427equalsimpl0(textAlign.getValue(), companion.m11432getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m10953toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (strategy == null ? false : LineBreak.Strategy.m11367equalsimpl0(strategy.getValue(), companion.m11373getSimplefcGXIks())) {
            return 0;
        }
        if (strategy == null ? false : LineBreak.Strategy.m11367equalsimpl0(strategy.getValue(), companion.m11372getHighQualityfcGXIks())) {
            return 1;
        }
        return strategy == null ? false : LineBreak.Strategy.m11367equalsimpl0(strategy.getValue(), companion.m11371getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m10954toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (hyphens == null ? false : Hyphens.m11342equalsimpl0(hyphens.getValue(), companion.m11346getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 1 : 3;
        }
        int iM11347getNonevmbZdU8 = companion.m11347getNonevmbZdU8();
        if (hyphens == null) {
            return 0;
        }
        Hyphens.m11342equalsimpl0(hyphens.getValue(), iM11347getNonevmbZdU8);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m10955toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (strictness == null ? false : LineBreak.Strictness.m11377equalsimpl0(strictness.getValue(), companion.m11381getDefaultusljTpc())) {
            return 0;
        }
        if (strictness == null ? false : LineBreak.Strictness.m11377equalsimpl0(strictness.getValue(), companion.m11382getLooseusljTpc())) {
            return 1;
        }
        if (strictness == null ? false : LineBreak.Strictness.m11377equalsimpl0(strictness.getValue(), companion.m11383getNormalusljTpc())) {
            return 2;
        }
        return strictness == null ? false : LineBreak.Strictness.m11377equalsimpl0(strictness.getValue(), companion.m11384getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m10956toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        if (wordBreak == null ? false : LineBreak.WordBreak.m11388equalsimpl0(wordBreak.getValue(), companion.m11392getDefaultjp8hJ3c())) {
            return 0;
        }
        return wordBreak == null ? false : LineBreak.WordBreak.m11388equalsimpl0(wordBreak.getValue(), companion.m11393getPhrasejp8hJ3c()) ? 1 : 0;
    }
}
