package androidx.compose.p006ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.Placeholder;
import androidx.compose.p006ui.text.PlatformParagraphStyle;
import androidx.compose.p006ui.text.PlatformTextStyle;
import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.p006ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p006ui.text.style.LineHeightStyle;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000]\n\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0001\u001a\u0083\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0011\u001a\u00020\u00122&\u0010\u0013\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\nH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m5175d2 = {"NoopSpan", "androidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "createCharSequence", "", "text", "", "contextFontSize", "", "contextTextStyle", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "useEmojiCompat", "", "isIncludeFontPaddingEnabled", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p02) {
        }
    };

    public static final CharSequence createCharSequence(String text, float f4, TextStyle contextTextStyle, List<AnnotatedString.Range<SpanStyle>> spanStyles, List<AnnotatedString.Range<Placeholder>> placeholders, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, boolean z3) {
        CharSequence charSequenceProcess;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        if (z3 && EmojiCompat.isConfigured()) {
            charSequenceProcess = EmojiCompat.get().process(text);
            Intrinsics.checkNotNull(charSequenceProcess);
        } else {
            charSequenceProcess = text;
        }
        Intrinsics.checkNotNullExpressionValue(charSequenceProcess, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && Intrinsics.areEqual(contextTextStyle.getTextIndent(), TextIndent.INSTANCE.getNone()) && TextUnitKt.m11724isUnspecifiedR2X_6o(contextTextStyle.m11104getLineHeightXSAIIZE())) {
            return charSequenceProcess;
        }
        Spannable spannableString = charSequenceProcess instanceof Spannable ? (Spannable) charSequenceProcess : new SpannableString(charSequenceProcess);
        if (Intrinsics.areEqual(contextTextStyle.getTextDecoration(), TextDecoration.INSTANCE.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, text.length());
        }
        if (isIncludeFontPaddingEnabled(contextTextStyle) && contextTextStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m11314setLineHeightr9BaKPg(spannableString, contextTextStyle.m11104getLineHeightXSAIIZE(), f4, density);
        } else {
            LineHeightStyle lineHeightStyle = contextTextStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.INSTANCE.getDefault();
            }
            SpannableExtensions_androidKt.m11313setLineHeightKmRG4DE(spannableString, contextTextStyle.m11104getLineHeightXSAIIZE(), f4, density, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, contextTextStyle.getTextIndent(), f4, density);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, contextTextStyle, spanStyles, density, resolveTypeface);
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, placeholders, density);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return true;
        }
        return paragraphSyle.getIncludeFontPadding();
    }
}
