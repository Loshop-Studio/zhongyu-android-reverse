package androidx.compose.material3.tokens;

import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.font.GenericFontFamily;
import androidx.compose.p006ui.text.intl.LocaleList;
import androidx.compose.p006ui.text.style.BaselineShift;
import androidx.compose.p006ui.text.style.TextAlign;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextDirection;
import androidx.compose.p006ui.text.style.TextGeometricTransform;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, m5175d2 = {"Landroidx/compose/material3/tokens/TypographyTokens;", "", "()V", "BodyLarge", "Landroidx/compose/ui/text/TextStyle;", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "BodyMedium", "getBodyMedium", "BodySmall", "getBodySmall", "DisplayLarge", "getDisplayLarge", "DisplayMedium", "getDisplayMedium", "DisplaySmall", "getDisplaySmall", "HeadlineLarge", "getHeadlineLarge", "HeadlineMedium", "getHeadlineMedium", "HeadlineSmall", "getHeadlineSmall", "LabelLarge", "getLabelLarge", "LabelMedium", "getLabelMedium", "LabelSmall", "getLabelSmall", "TitleLarge", "getTitleLarge", "TitleMedium", "getTitleMedium", "TitleSmall", "getTitleSmall", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        long j4 = 0;
        BodyLarge = new TextStyle(j4, typeScaleTokens.m8754getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), null, null, bodyLargeFont, null, typeScaleTokens.m8755getBodyLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m8753getBodyLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        long j5 = 0;
        FontStyle fontStyle = null;
        FontSynthesis fontSynthesis = null;
        String str = null;
        BaselineShift baselineShift = null;
        TextGeometricTransform textGeometricTransform = null;
        LocaleList localeList = null;
        long j6 = 0;
        TextDecoration textDecoration = null;
        Shadow shadow = null;
        TextAlign textAlign = null;
        TextDirection textDirection = null;
        TextIndent textIndent = null;
        int i4 = 196441;
        DefaultConstructorMarker defaultConstructorMarker = null;
        BodyMedium = new TextStyle(j5, typeScaleTokens.m8757getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), fontStyle, fontSynthesis, bodyMediumFont, str, typeScaleTokens.m8758getBodyMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8756getBodyMediumLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        FontWeight bodySmallWeight = typeScaleTokens.getBodySmallWeight();
        long j7 = 0;
        FontSynthesis fontSynthesis2 = null;
        String str2 = null;
        LocaleList localeList2 = null;
        long j8 = 0;
        TextDirection textDirection2 = null;
        TextIndent textIndent2 = null;
        int i5 = 196441;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        BodySmall = new TextStyle(j7, typeScaleTokens.m8760getBodySmallSizeXSAIIZE(), bodySmallWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) bodySmallFont, str2, typeScaleTokens.m8761getBodySmallTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8759getBodySmallLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = new TextStyle(j5, typeScaleTokens.m8763getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), fontStyle, fontSynthesis, displayLargeFont, str, typeScaleTokens.m8764getDisplayLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8762getDisplayLargeLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        FontWeight displayMediumWeight = typeScaleTokens.getDisplayMediumWeight();
        DisplayMedium = new TextStyle(j7, typeScaleTokens.m8766getDisplayMediumSizeXSAIIZE(), displayMediumWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) displayMediumFont, str2, typeScaleTokens.m8767getDisplayMediumTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8765getDisplayMediumLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = new TextStyle(j5, typeScaleTokens.m8769getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), fontStyle, fontSynthesis, displaySmallFont, str, typeScaleTokens.m8770getDisplaySmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8768getDisplaySmallLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        FontWeight headlineLargeWeight = typeScaleTokens.getHeadlineLargeWeight();
        HeadlineLarge = new TextStyle(j7, typeScaleTokens.m8772getHeadlineLargeSizeXSAIIZE(), headlineLargeWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) headlineLargeFont, str2, typeScaleTokens.m8773getHeadlineLargeTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8771getHeadlineLargeLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = new TextStyle(j5, typeScaleTokens.m8775getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), fontStyle, fontSynthesis, headlineMediumFont, str, typeScaleTokens.m8776getHeadlineMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8774getHeadlineMediumLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        FontWeight headlineSmallWeight = typeScaleTokens.getHeadlineSmallWeight();
        HeadlineSmall = new TextStyle(j7, typeScaleTokens.m8778getHeadlineSmallSizeXSAIIZE(), headlineSmallWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) headlineSmallFont, str2, typeScaleTokens.m8779getHeadlineSmallTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8777getHeadlineSmallLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = new TextStyle(j5, typeScaleTokens.m8781getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), fontStyle, fontSynthesis, labelLargeFont, str, typeScaleTokens.m8782getLabelLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8780getLabelLargeLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        FontWeight labelMediumWeight = typeScaleTokens.getLabelMediumWeight();
        LabelMedium = new TextStyle(j7, typeScaleTokens.m8784getLabelMediumSizeXSAIIZE(), labelMediumWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) labelMediumFont, str2, typeScaleTokens.m8785getLabelMediumTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8783getLabelMediumLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = new TextStyle(j5, typeScaleTokens.m8787getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), fontStyle, fontSynthesis, labelSmallFont, str, typeScaleTokens.m8788getLabelSmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8786getLabelSmallLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        FontWeight titleLargeWeight = typeScaleTokens.getTitleLargeWeight();
        TitleLarge = new TextStyle(j7, typeScaleTokens.m8790getTitleLargeSizeXSAIIZE(), titleLargeWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) titleLargeFont, str2, typeScaleTokens.m8791getTitleLargeTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8789getTitleLargeLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = new TextStyle(j5, typeScaleTokens.m8793getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), fontStyle, fontSynthesis, titleMediumFont, str, typeScaleTokens.m8794getTitleMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j6, textDecoration, shadow, textAlign, textDirection, typeScaleTokens.m8792getTitleMediumLineHeightXSAIIZE(), textIndent, i4, defaultConstructorMarker);
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        FontWeight titleSmallWeight = typeScaleTokens.getTitleSmallWeight();
        TitleSmall = new TextStyle(j7, typeScaleTokens.m8796getTitleSmallSizeXSAIIZE(), titleSmallWeight, (FontStyle) (0 == true ? 1 : 0), fontSynthesis2, (FontFamily) titleSmallFont, str2, typeScaleTokens.m8797getTitleSmallTrackingXSAIIZE(), (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), localeList2, j8, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (TextAlign) (0 == true ? 1 : 0), textDirection2, typeScaleTokens.m8795getTitleSmallLineHeightXSAIIZE(), textIndent2, i5, defaultConstructorMarker2);
    }

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
