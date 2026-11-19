package androidx.compose.material3.tokens;

import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.GenericFontFamily;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, m13558d2 = {"Landroidx/compose/material3/tokens/TypographyTokens;", "", "()V", "BodyLarge", "Landroidx/compose/ui/text/TextStyle;", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "BodyMedium", "getBodyMedium", "BodySmall", "getBodySmall", "DisplayLarge", "getDisplayLarge", "DisplayMedium", "getDisplayMedium", "DisplaySmall", "getDisplaySmall", "HeadlineLarge", "getHeadlineLarge", "HeadlineMedium", "getHeadlineMedium", "HeadlineSmall", "getHeadlineSmall", "LabelLarge", "getLabelLarge", "LabelMedium", "getLabelMedium", "LabelSmall", "getLabelSmall", "TitleLarge", "getTitleLarge", "TitleMedium", "getTitleMedium", "TitleSmall", "getTitleSmall", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TypographyTokens {
    public static final int $stable = 0;
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

    static {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        BodyLarge = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle, 0L, typeScaleTokens.m20308getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), null, null, bodyLargeFont, null, typeScaleTokens.m20309getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20307getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        BodyMedium = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle2, 0L, typeScaleTokens.m20311getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), null, null, bodyMediumFont, null, typeScaleTokens.m20312getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20310getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        BodySmall = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle3, 0L, typeScaleTokens.m20314getBodySmallSizeXSAIIZE(), typeScaleTokens.getBodySmallWeight(), null, null, bodySmallFont, null, typeScaleTokens.m20315getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20313getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle4, 0L, typeScaleTokens.m20317getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), null, null, displayLargeFont, null, typeScaleTokens.m20318getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20316getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        DisplayMedium = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle5, 0L, typeScaleTokens.m20320getDisplayMediumSizeXSAIIZE(), typeScaleTokens.getDisplayMediumWeight(), null, null, displayMediumFont, null, typeScaleTokens.m20321getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20319getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle6, 0L, typeScaleTokens.m20323getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), null, null, displaySmallFont, null, typeScaleTokens.m20324getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20322getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        HeadlineLarge = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle7, 0L, typeScaleTokens.m20326getHeadlineLargeSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeWeight(), null, null, headlineLargeFont, null, typeScaleTokens.m20327getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20325getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle8, 0L, typeScaleTokens.m20329getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), null, null, headlineMediumFont, null, typeScaleTokens.m20330getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20328getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        HeadlineSmall = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle9, 0L, typeScaleTokens.m20332getHeadlineSmallSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallWeight(), null, null, headlineSmallFont, null, typeScaleTokens.m20333getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20331getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle10, 0L, typeScaleTokens.m20335getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), null, null, labelLargeFont, null, typeScaleTokens.m20336getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20334getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        LabelMedium = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle11, 0L, typeScaleTokens.m20338getLabelMediumSizeXSAIIZE(), typeScaleTokens.getLabelMediumWeight(), null, null, labelMediumFont, null, typeScaleTokens.m20339getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20337getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle12, 0L, typeScaleTokens.m20341getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), null, null, labelSmallFont, null, typeScaleTokens.m20342getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20340getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        TitleLarge = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle13, 0L, typeScaleTokens.m20344getTitleLargeSizeXSAIIZE(), typeScaleTokens.getTitleLargeWeight(), null, null, titleLargeFont, null, typeScaleTokens.m20345getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20343getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle14, 0L, typeScaleTokens.m20347getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), null, null, titleMediumFont, null, typeScaleTokens.m20348getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20346getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        TitleSmall = TextStyle.m23040copyp1EtxEg$default(defaultTextStyle15, 0L, typeScaleTokens.m20350getTitleSmallSizeXSAIIZE(), typeScaleTokens.getTitleSmallWeight(), null, null, titleSmallFont, null, typeScaleTokens.m20351getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m20349getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
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
