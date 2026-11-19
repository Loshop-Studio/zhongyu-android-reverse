package androidx.compose.p014ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.EmojiSupportMatch;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.PlatformParagraphStyle;
import androidx.compose.p014ui.text.PlatformTextStyle;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.p014ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9546r;

/* loaded from: classes2.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.EmojiCompat] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.text.Spannable] */
    public static final CharSequence createCharSequence(String str, float f10, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, InterfaceC9546r interfaceC9546r, boolean z10) {
        String str2;
        CharSequence charSequenceProcess;
        float f11;
        Density density2;
        PlatformParagraphStyle paragraphStyle;
        if (z10 && EmojiCompat.isConfigured()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch emojiSupportMatchM32803boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m32803boximpl(paragraphStyle.m32884getEmojiSupportMatch_3YsG6Y());
            str2 = str;
            charSequenceProcess = EmojiCompat.get().process(str2, 0, str.length(), Integer.MAX_VALUE, emojiSupportMatchM32803boximpl == null ? 0 : EmojiSupportMatch.m32806equalsimpl0(emojiSupportMatchM32803boximpl.m32809unboximpl(), EmojiSupportMatch.Companion.m32810getAll_3YsG6Y()));
            AbstractC9979u.m20291d(charSequenceProcess);
        } else {
            str2 = str;
            charSequenceProcess = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC9979u.m20289b(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnit.m33693getRawTypeimpl(textStyle.m33005getLineHeightXSAIIZE()) == 0) {
            return charSequenceProcess;
        }
        SpannableString spannableString = charSequenceProcess instanceof Spannable ? (Spannable) charSequenceProcess : new SpannableString(charSequenceProcess);
        if (AbstractC9979u.m20289b(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str2.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m33248setLineHeightr9BaKPg(spannableString, textStyle.m33005getLineHeightXSAIIZE(), f10, density);
            f11 = f10;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            f11 = f10;
            density2 = density;
            SpannableExtensions_androidKt.m33247setLineHeightKmRG4DE(spannableString, textStyle.m33005getLineHeightXSAIIZE(), f11, density2, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f11, density2);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density2, interfaceC9546r);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f11, density2, textStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density2);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
