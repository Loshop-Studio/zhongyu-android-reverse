package androidx.compose.p014ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.InternalTextApi;
import androidx.compose.p014ui.text.LinkAnnotation;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.TtsAnnotation;
import androidx.compose.p014ui.text.UrlAnnotation;
import androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.font.GenericFontFamily;
import androidx.compose.p014ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p014ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i10, int i11, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m33245setColorRPmYEkk(spannableString, spanStyle.m32907getColor0d7_KjU(), i10, i11);
        SpannableExtensions_androidKt.m33246setFontSizeKmRG4DE(spannableString, spanStyle.m32908getFontSizeXSAIIZE(), density, i10, i11);
        if (spanStyle.getFontWeight() != null || spanStyle.m32909getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM32909getFontStyle4Lr2A7w = spanStyle.m32909getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m33029getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyleM32909getFontStyle4Lr2A7w != null ? fontStyleM32909getFontStyle4Lr2A7w.m33080unboximpl() : FontStyle.Companion.m33084getNormal_LCdwA())), i10, i11, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = spanStyle.m32910getFontSynthesisZQGJjVo();
                Object value = FontFamily.Resolver.m33049resolveDPcqOEQ$default(resolver, fontFamily, null, 0, fontSynthesisM32910getFontSynthesisZQGJjVo != null ? fontSynthesisM32910getFontSynthesisZQGJjVo.m33093unboximpl() : FontSynthesis.Companion.m33094getAllGVVA2EU(), 6, null).getValue();
                AbstractC9979u.m20292e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i10, i11, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i10, i11, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i10, i11);
        SpannableExtensions_androidKt.m33243setBackgroundRPmYEkk(spannableString, spanStyle.m32905getBackground0d7_KjU(), i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i10);
                setSpanStyle(spannableString, SpanStyle.m32898copyGSF8kmg$default(range.component1(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.component2(), range.component3(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i11);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i12 = 0; i12 < size3; i12++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i12);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size4 = linkAnnotations.size();
        for (int i13 = 0; i13 < size4; i13++) {
            AnnotatedString.Range<LinkAnnotation> range4 = linkAnnotations.get(i13);
            if (range4.getStart() != range4.getEnd()) {
                LinkAnnotation item = range4.getItem();
                if ((item instanceof LinkAnnotation.Url) && item.getLinkInteractionListener() == null) {
                    spannableString.setSpan(uRLSpanCache.toURLSpan(toUrlLink(range4)), range4.getStart(), range4.getEnd(), 33);
                } else {
                    spannableString.setSpan(uRLSpanCache.toClickableSpan(range4), range4.getStart(), range4.getEnd(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final AnnotatedString.Range<LinkAnnotation.Url> toUrlLink(AnnotatedString.Range<LinkAnnotation> range) {
        LinkAnnotation item = range.getItem();
        AbstractC9979u.m20292e(item, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new AnnotatedString.Range<>((LinkAnnotation.Url) item, range.getStart(), range.getEnd());
    }
}
