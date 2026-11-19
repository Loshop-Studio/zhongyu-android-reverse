package androidx.compose.p006ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.InternalTextApi;
import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.TtsAnnotation;
import androidx.compose.p006ui.text.UrlAnnotation;
import androidx.compose.p006ui.text.font.AbstractC1669b;
import androidx.compose.p006ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p006ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p006ui.text.font.Font;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.font.GenericFontFamily;
import androidx.compose.p006ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p006ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.p006ui.text.platform.extensions.UrlAnnotationExtensions_androidKt;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m5175d2 = {"setSpanStyle", "", "Landroid/text/SpannableString;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/AnnotatedString;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n33#2,6:199\n33#2,6:205\n33#2,6:211\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n75#1:199,6\n82#1:205,6\n91#1:211,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i4, int i5, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m11311setColorRPmYEkk(spannableString, spanStyle.m11037getColor0d7_KjU(), i4, i5);
        SpannableExtensions_androidKt.m11312setFontSizeKmRG4DE(spannableString, spanStyle.getFontSize(), density, i4, i5);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m11117getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.m11165unboximpl() : FontStyle.INSTANCE.m11167getNormal_LCdwA())), i4, i5, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i4, i5, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                Object value = AbstractC1669b.m881a(resolver, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m11177getAllGVVA2EU(), 6, null).getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i4, i5, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i4, i5, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i4, i5, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i4, i5, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i4, i5);
        SpannableExtensions_androidKt.m11309setBackgroundRPmYEkk(spannableString, spanStyle.getBackground(), i4, i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return toAccessibilitySpannableString(annotatedString, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i4);
                SpanStyle spanStyleComponent1 = range.component1();
                setSpanStyle(spannableString, spanStyleComponent1.m11033copyIuqyXdg((16351 & 1) != 0 ? spanStyleComponent1.m11037getColor0d7_KjU() : 0L, (16351 & 2) != 0 ? spanStyleComponent1.fontSize : 0L, (16351 & 4) != 0 ? spanStyleComponent1.fontWeight : null, (16351 & 8) != 0 ? spanStyleComponent1.fontStyle : null, (16351 & 16) != 0 ? spanStyleComponent1.fontSynthesis : null, (16351 & 32) != 0 ? spanStyleComponent1.fontFamily : null, (16351 & 64) != 0 ? spanStyleComponent1.fontFeatureSettings : null, (16351 & 128) != 0 ? spanStyleComponent1.letterSpacing : 0L, (16351 & 256) != 0 ? spanStyleComponent1.baselineShift : null, (16351 & 512) != 0 ? spanStyleComponent1.textGeometricTransform : null, (16351 & 1024) != 0 ? spanStyleComponent1.localeList : null, (16351 & 2048) != 0 ? spanStyleComponent1.background : 0L, (16351 & 4096) != 0 ? spanStyleComponent1.textDecoration : null, (16351 & 8192) != 0 ? spanStyleComponent1.shadow : null), range.getStart(), range.getEnd(), density, fontFamilyResolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i5);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.getStart(), range2.getEnd(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i6 = 0; i6 < size3; i6++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i6);
            spannableString.setSpan(UrlAnnotationExtensions_androidKt.toSpan(range3.component1()), range3.getStart(), range3.getEnd(), 33);
        }
        return spannableString;
    }
}
