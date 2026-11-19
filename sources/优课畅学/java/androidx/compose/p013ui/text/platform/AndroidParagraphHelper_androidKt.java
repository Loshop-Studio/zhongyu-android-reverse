package androidx.compose.p013ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.EmojiSupportMatch;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.PlatformParagraphStyle;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.p013ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10576r;

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
    public static final CharSequence createCharSequence(String str, float f10, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, InterfaceC10576r interfaceC10576r, boolean z10) {
        String str2;
        CharSequence charSequenceProcess;
        float f11;
        Density density2;
        PlatformParagraphStyle paragraphStyle;
        if (z10 && EmojiCompat.isConfigured()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch emojiSupportMatchM26201boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m26201boximpl(paragraphStyle.m26282getEmojiSupportMatch_3YsG6Y());
            str2 = str;
            charSequenceProcess = EmojiCompat.get().process(str2, 0, str.length(), Integer.MAX_VALUE, emojiSupportMatchM26201boximpl == null ? 0 : EmojiSupportMatch.m26204equalsimpl0(emojiSupportMatchM26201boximpl.m26207unboximpl(), EmojiSupportMatch.Companion.m26208getAll_3YsG6Y()));
            AbstractC9133u.m16130d(charSequenceProcess);
        } else {
            str2 = str;
            charSequenceProcess = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC9133u.m16128b(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnit.m27091getRawTypeimpl(textStyle.m26403getLineHeightXSAIIZE()) == 0) {
            return charSequenceProcess;
        }
        SpannableString spannableString = charSequenceProcess instanceof Spannable ? (Spannable) charSequenceProcess : new SpannableString(charSequenceProcess);
        if (AbstractC9133u.m16128b(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str2.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m26646setLineHeightr9BaKPg(spannableString, textStyle.m26403getLineHeightXSAIIZE(), f10, density);
            f11 = f10;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            f11 = f10;
            density2 = density;
            SpannableExtensions_androidKt.m26645setLineHeightKmRG4DE(spannableString, textStyle.m26403getLineHeightXSAIIZE(), f11, density2, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f11, density2);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density2, interfaceC10576r);
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
