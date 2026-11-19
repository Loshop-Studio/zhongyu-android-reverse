package androidx.compose.material3.tokens;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DatePickerModalTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidth;
    private static final float DateContainerHeight;
    private static final ShapeKeyTokens DateContainerShape;
    private static final float DateContainerWidth;
    private static final TypographyKeyTokens DateLabelTextFont;
    private static final ColorSchemeKeyTokens DateSelectedContainerColor;
    private static final ColorSchemeKeyTokens DateSelectedLabelTextColor;
    private static final float DateStateLayerHeight;
    private static final ShapeKeyTokens DateStateLayerShape;
    private static final float DateStateLayerWidth;
    private static final ColorSchemeKeyTokens DateTodayContainerOutlineColor;
    private static final float DateTodayContainerOutlineWidth;
    private static final ColorSchemeKeyTokens DateTodayLabelTextColor;
    private static final ColorSchemeKeyTokens DateUnselectedLabelTextColor;
    private static final float HeaderContainerHeight;
    private static final float HeaderContainerWidth;
    private static final ColorSchemeKeyTokens HeaderHeadlineColor;
    private static final TypographyKeyTokens HeaderHeadlineFont;
    private static final ColorSchemeKeyTokens HeaderSupportingTextColor;
    private static final TypographyKeyTokens HeaderSupportingTextFont;
    private static final ColorSchemeKeyTokens RangeSelectionActiveIndicatorContainerColor;
    private static final float RangeSelectionActiveIndicatorContainerHeight;
    private static final ShapeKeyTokens RangeSelectionActiveIndicatorContainerShape;
    private static final float RangeSelectionContainerElevation;
    private static final ShapeKeyTokens RangeSelectionContainerShape;
    private static final float RangeSelectionHeaderContainerHeight;
    private static final TypographyKeyTokens RangeSelectionHeaderHeadlineFont;
    private static final ColorSchemeKeyTokens RangeSelectionMonthSubheadColor;
    private static final TypographyKeyTokens RangeSelectionMonthSubheadFont;
    private static final ColorSchemeKeyTokens SelectionDateInRangeLabelTextColor;
    private static final float SelectionYearContainerHeight;
    private static final float SelectionYearContainerWidth;
    private static final TypographyKeyTokens SelectionYearLabelTextFont;
    private static final ColorSchemeKeyTokens SelectionYearSelectedContainerColor;
    private static final ColorSchemeKeyTokens SelectionYearSelectedLabelTextColor;
    private static final float SelectionYearStateLayerHeight;
    private static final ShapeKeyTokens SelectionYearStateLayerShape;
    private static final float SelectionYearStateLayerWidth;
    private static final ColorSchemeKeyTokens SelectionYearUnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens WeekdaysLabelTextColor;
    private static final TypographyKeyTokens WeekdaysLabelTextFont;
    public static final DatePickerModalTokens INSTANCE = new DatePickerModalTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHigh;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m23188getLevel3D9Ej5fM();
        ContainerHeight = C3156Dp.m26899constructorimpl((float) 568.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraLarge;
        float f10 = (float) 360.0d;
        ContainerWidth = C3156Dp.m26899constructorimpl(f10);
        float f11 = (float) 40.0d;
        DateContainerHeight = C3156Dp.m26899constructorimpl(f11);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        DateContainerShape = shapeKeyTokens;
        DateContainerWidth = C3156Dp.m26899constructorimpl(f11);
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        DateLabelTextFont = typographyKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        DateSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnPrimary;
        DateSelectedLabelTextColor = colorSchemeKeyTokens2;
        DateStateLayerHeight = C3156Dp.m26899constructorimpl(f11);
        DateStateLayerShape = shapeKeyTokens;
        DateStateLayerWidth = C3156Dp.m26899constructorimpl(f11);
        DateTodayContainerOutlineColor = colorSchemeKeyTokens;
        DateTodayContainerOutlineWidth = C3156Dp.m26899constructorimpl((float) 1.0d);
        DateTodayLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        DateUnselectedLabelTextColor = colorSchemeKeyTokens3;
        HeaderContainerHeight = C3156Dp.m26899constructorimpl((float) 120.0d);
        HeaderContainerWidth = C3156Dp.m26899constructorimpl(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeaderHeadlineColor = colorSchemeKeyTokens4;
        HeaderHeadlineFont = TypographyKeyTokens.HeadlineLarge;
        HeaderSupportingTextColor = colorSchemeKeyTokens4;
        HeaderSupportingTextFont = TypographyKeyTokens.LabelLarge;
        RangeSelectionActiveIndicatorContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        RangeSelectionActiveIndicatorContainerHeight = C3156Dp.m26899constructorimpl(f11);
        RangeSelectionActiveIndicatorContainerShape = shapeKeyTokens;
        RangeSelectionContainerElevation = elevationTokens.m23185getLevel0D9Ej5fM();
        RangeSelectionContainerShape = ShapeKeyTokens.CornerNone;
        SelectionDateInRangeLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
        RangeSelectionHeaderContainerHeight = C3156Dp.m26899constructorimpl((float) 128.0d);
        RangeSelectionHeaderHeadlineFont = TypographyKeyTokens.TitleLarge;
        RangeSelectionMonthSubheadColor = colorSchemeKeyTokens4;
        RangeSelectionMonthSubheadFont = TypographyKeyTokens.TitleSmall;
        WeekdaysLabelTextColor = colorSchemeKeyTokens3;
        WeekdaysLabelTextFont = typographyKeyTokens;
        float f12 = (float) 36.0d;
        SelectionYearContainerHeight = C3156Dp.m26899constructorimpl(f12);
        float f13 = (float) 72.0d;
        SelectionYearContainerWidth = C3156Dp.m26899constructorimpl(f13);
        SelectionYearLabelTextFont = typographyKeyTokens;
        SelectionYearSelectedContainerColor = colorSchemeKeyTokens;
        SelectionYearSelectedLabelTextColor = colorSchemeKeyTokens2;
        SelectionYearStateLayerHeight = C3156Dp.m26899constructorimpl(f12);
        SelectionYearStateLayerShape = shapeKeyTokens;
        SelectionYearStateLayerWidth = C3156Dp.m26899constructorimpl(f13);
        SelectionYearUnselectedLabelTextColor = colorSchemeKeyTokens4;
    }

    private DatePickerModalTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m23151getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23152getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23153getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getDateContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23154getDateContainerHeightD9Ej5fM() {
        return DateContainerHeight;
    }

    public final ShapeKeyTokens getDateContainerShape() {
        return DateContainerShape;
    }

    /* renamed from: getDateContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23155getDateContainerWidthD9Ej5fM() {
        return DateContainerWidth;
    }

    public final TypographyKeyTokens getDateLabelTextFont() {
        return DateLabelTextFont;
    }

    public final ColorSchemeKeyTokens getDateSelectedContainerColor() {
        return DateSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getDateSelectedLabelTextColor() {
        return DateSelectedLabelTextColor;
    }

    /* renamed from: getDateStateLayerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23156getDateStateLayerHeightD9Ej5fM() {
        return DateStateLayerHeight;
    }

    public final ShapeKeyTokens getDateStateLayerShape() {
        return DateStateLayerShape;
    }

    /* renamed from: getDateStateLayerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23157getDateStateLayerWidthD9Ej5fM() {
        return DateStateLayerWidth;
    }

    public final ColorSchemeKeyTokens getDateTodayContainerOutlineColor() {
        return DateTodayContainerOutlineColor;
    }

    /* renamed from: getDateTodayContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m23158getDateTodayContainerOutlineWidthD9Ej5fM() {
        return DateTodayContainerOutlineWidth;
    }

    public final ColorSchemeKeyTokens getDateTodayLabelTextColor() {
        return DateTodayLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDateUnselectedLabelTextColor() {
        return DateUnselectedLabelTextColor;
    }

    /* renamed from: getHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23159getHeaderContainerHeightD9Ej5fM() {
        return HeaderContainerHeight;
    }

    /* renamed from: getHeaderContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23160getHeaderContainerWidthD9Ej5fM() {
        return HeaderContainerWidth;
    }

    public final ColorSchemeKeyTokens getHeaderHeadlineColor() {
        return HeaderHeadlineColor;
    }

    public final TypographyKeyTokens getHeaderHeadlineFont() {
        return HeaderHeadlineFont;
    }

    public final ColorSchemeKeyTokens getHeaderSupportingTextColor() {
        return HeaderSupportingTextColor;
    }

    public final TypographyKeyTokens getHeaderSupportingTextFont() {
        return HeaderSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getRangeSelectionActiveIndicatorContainerColor() {
        return RangeSelectionActiveIndicatorContainerColor;
    }

    /* renamed from: getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23161getRangeSelectionActiveIndicatorContainerHeightD9Ej5fM() {
        return RangeSelectionActiveIndicatorContainerHeight;
    }

    public final ShapeKeyTokens getRangeSelectionActiveIndicatorContainerShape() {
        return RangeSelectionActiveIndicatorContainerShape;
    }

    /* renamed from: getRangeSelectionContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m23162getRangeSelectionContainerElevationD9Ej5fM() {
        return RangeSelectionContainerElevation;
    }

    public final ShapeKeyTokens getRangeSelectionContainerShape() {
        return RangeSelectionContainerShape;
    }

    /* renamed from: getRangeSelectionHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23163getRangeSelectionHeaderContainerHeightD9Ej5fM() {
        return RangeSelectionHeaderContainerHeight;
    }

    public final TypographyKeyTokens getRangeSelectionHeaderHeadlineFont() {
        return RangeSelectionHeaderHeadlineFont;
    }

    public final ColorSchemeKeyTokens getRangeSelectionMonthSubheadColor() {
        return RangeSelectionMonthSubheadColor;
    }

    public final TypographyKeyTokens getRangeSelectionMonthSubheadFont() {
        return RangeSelectionMonthSubheadFont;
    }

    public final ColorSchemeKeyTokens getSelectionDateInRangeLabelTextColor() {
        return SelectionDateInRangeLabelTextColor;
    }

    /* renamed from: getSelectionYearContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23164getSelectionYearContainerHeightD9Ej5fM() {
        return SelectionYearContainerHeight;
    }

    /* renamed from: getSelectionYearContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23165getSelectionYearContainerWidthD9Ej5fM() {
        return SelectionYearContainerWidth;
    }

    public final TypographyKeyTokens getSelectionYearLabelTextFont() {
        return SelectionYearLabelTextFont;
    }

    public final ColorSchemeKeyTokens getSelectionYearSelectedContainerColor() {
        return SelectionYearSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectionYearSelectedLabelTextColor() {
        return SelectionYearSelectedLabelTextColor;
    }

    /* renamed from: getSelectionYearStateLayerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23166getSelectionYearStateLayerHeightD9Ej5fM() {
        return SelectionYearStateLayerHeight;
    }

    public final ShapeKeyTokens getSelectionYearStateLayerShape() {
        return SelectionYearStateLayerShape;
    }

    /* renamed from: getSelectionYearStateLayerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23167getSelectionYearStateLayerWidthD9Ej5fM() {
        return SelectionYearStateLayerWidth;
    }

    public final ColorSchemeKeyTokens getSelectionYearUnselectedLabelTextColor() {
        return SelectionYearUnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getWeekdaysLabelTextColor() {
        return WeekdaysLabelTextColor;
    }

    public final TypographyKeyTokens getWeekdaysLabelTextFont() {
        return WeekdaysLabelTextFont;
    }
}
