package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SpannableStringBuilderKt {
    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, @ColorInt int i10, InterfaceC9540l interfaceC9540l) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString buildSpannedString(InterfaceC9540l interfaceC9540l) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        interfaceC9540l.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, @ColorInt int i10, InterfaceC9540l interfaceC9540l) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, InterfaceC9540l interfaceC9540l) {
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f10, InterfaceC9540l interfaceC9540l) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f10);
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, InterfaceC9540l interfaceC9540l) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, InterfaceC9540l interfaceC9540l) {
        int length = spannableStringBuilder.length();
        interfaceC9540l.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
