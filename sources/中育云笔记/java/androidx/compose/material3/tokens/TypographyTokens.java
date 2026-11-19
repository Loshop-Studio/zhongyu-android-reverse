package androidx.compose.material3.tokens;

import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.GenericFontFamily;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
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
        BodyLarge = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle, 0L, typeScaleTokens.m30186getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), null, null, bodyLargeFont, null, typeScaleTokens.m30187getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30185getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        BodyMedium = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle2, 0L, typeScaleTokens.m30189getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), null, null, bodyMediumFont, null, typeScaleTokens.m30190getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30188getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        BodySmall = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle3, 0L, typeScaleTokens.m30192getBodySmallSizeXSAIIZE(), typeScaleTokens.getBodySmallWeight(), null, null, bodySmallFont, null, typeScaleTokens.m30193getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30191getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle4, 0L, typeScaleTokens.m30195getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), null, null, displayLargeFont, null, typeScaleTokens.m30196getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30194getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        DisplayMedium = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle5, 0L, typeScaleTokens.m30198getDisplayMediumSizeXSAIIZE(), typeScaleTokens.getDisplayMediumWeight(), null, null, displayMediumFont, null, typeScaleTokens.m30199getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30197getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle6, 0L, typeScaleTokens.m30201getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), null, null, displaySmallFont, null, typeScaleTokens.m30202getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30200getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        HeadlineLarge = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle7, 0L, typeScaleTokens.m30204getHeadlineLargeSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeWeight(), null, null, headlineLargeFont, null, typeScaleTokens.m30205getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30203getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle8, 0L, typeScaleTokens.m30207getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), null, null, headlineMediumFont, null, typeScaleTokens.m30208getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30206getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        HeadlineSmall = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle9, 0L, typeScaleTokens.m30210getHeadlineSmallSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallWeight(), null, null, headlineSmallFont, null, typeScaleTokens.m30211getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30209getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle10, 0L, typeScaleTokens.m30213getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), null, null, labelLargeFont, null, typeScaleTokens.m30214getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30212getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        LabelMedium = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle11, 0L, typeScaleTokens.m30216getLabelMediumSizeXSAIIZE(), typeScaleTokens.getLabelMediumWeight(), null, null, labelMediumFont, null, typeScaleTokens.m30217getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30215getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle12, 0L, typeScaleTokens.m30219getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), null, null, labelSmallFont, null, typeScaleTokens.m30220getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30218getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        TitleLarge = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle13, 0L, typeScaleTokens.m30222getTitleLargeSizeXSAIIZE(), typeScaleTokens.getTitleLargeWeight(), null, null, titleLargeFont, null, typeScaleTokens.m30223getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30221getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle14, 0L, typeScaleTokens.m30225getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), null, null, titleMediumFont, null, typeScaleTokens.m30226getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30224getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        TitleSmall = TextStyle.m32979copyp1EtxEg$default(defaultTextStyle15, 0L, typeScaleTokens.m30228getTitleSmallSizeXSAIIZE(), typeScaleTokens.getTitleSmallWeight(), null, null, titleSmallFont, null, typeScaleTokens.m30229getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, typeScaleTokens.m30227getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
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
