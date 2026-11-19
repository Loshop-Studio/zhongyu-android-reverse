package androidx.compose.material3.tokens;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SliderTokens {
    public static final int $stable = 0;
    private static final float ActiveHandleHeight;
    private static final float ActiveHandleLeadingSpace;
    private static final float ActiveHandlePadding;
    private static final ShapeKeyTokens ActiveHandleShape;
    private static final float ActiveHandleTrailingSpace;
    private static final float ActiveHandleWidth;
    private static final ColorSchemeKeyTokens ActiveTrackColor;
    private static final float ActiveTrackHeight;
    private static final ShapeKeyTokens ActiveTrackShape;
    private static final ShapeKeyTokens ActiveTrackShapeLeading;
    private static final ColorSchemeKeyTokens DisabledActiveTrackColor;
    private static final float DisabledActiveTrackOpacity;
    private static final ColorSchemeKeyTokens DisabledHandleColor;
    private static final float DisabledHandleOpacity;
    private static final float DisabledHandleWidth;
    private static final ColorSchemeKeyTokens DisabledInactiveTrackColor;
    private static final float DisabledInactiveTrackOpacity;
    private static final ColorSchemeKeyTokens DisabledStopColor;
    private static final ColorSchemeKeyTokens FocusActiveTrackColor;
    private static final float FocusHandleWidth;
    private static final ColorSchemeKeyTokens FocusInactiveTrackColor;
    private static final ColorSchemeKeyTokens FocusStopColor;
    private static final ColorSchemeKeyTokens HandleColor;
    private static final float HandleHeight;
    private static final ShapeKeyTokens HandleShape;
    private static final float HandleWidth;
    private static final ColorSchemeKeyTokens HoverHandleColor;
    private static final float HoverHandleWidth;
    private static final ColorSchemeKeyTokens HoverStopColor;
    private static final float InactiveContainerOpacity;
    private static final ColorSchemeKeyTokens InactiveTrackColor;
    private static final float InactiveTrackHeight;
    private static final ShapeKeyTokens InactiveTrackShape;
    private static final ColorSchemeKeyTokens LabelContainerColor;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final ColorSchemeKeyTokens PressedActiveTrackColor;
    private static final ColorSchemeKeyTokens PressedHandleColor;
    private static final float PressedHandleWidth;
    private static final ColorSchemeKeyTokens PressedInactiveTrackColor;
    private static final ColorSchemeKeyTokens PressedStopColor;
    private static final ColorSchemeKeyTokens SliderActiveHandleColor;
    private static final ColorSchemeKeyTokens StopIndicatorColor;
    private static final ColorSchemeKeyTokens StopIndicatorColorSelected;
    private static final ShapeKeyTokens StopIndicatorShape;
    private static final float StopIndicatorSize;
    private static final float StopIndicatorTrailingSpace;
    private static final float ValueIndicatorActiveBottomSpace;
    private static final ColorSchemeKeyTokens ValueIndicatorContainerColor;
    private static final ColorSchemeKeyTokens ValueIndicatorLabelTextColor;
    private static final TypographyKeyTokens ValueIndicatorLabelTextFont;
    public static final SliderTokens INSTANCE = new SliderTokens();
    private static final float ActiveContainerOpacity = 1.0f;

    static {
        float f10 = (float) 44.0d;
        ActiveHandleHeight = C3156Dp.m26899constructorimpl(f10);
        float f11 = (float) 6.0d;
        ActiveHandleLeadingSpace = C3156Dp.m26899constructorimpl(f11);
        ActiveHandlePadding = C3156Dp.m26899constructorimpl(f11);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveHandleShape = shapeKeyTokens;
        ActiveHandleTrailingSpace = C3156Dp.m26899constructorimpl(f11);
        float f12 = (float) 4.0d;
        ActiveHandleWidth = C3156Dp.m26899constructorimpl(f12);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        float f13 = (float) 16.0d;
        ActiveTrackHeight = C3156Dp.m26899constructorimpl(f13);
        ActiveTrackShape = shapeKeyTokens;
        ActiveTrackShapeLeading = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledActiveTrackOpacity = 0.38f;
        DisabledHandleColor = colorSchemeKeyTokens2;
        DisabledHandleOpacity = 0.38f;
        DisabledHandleWidth = C3156Dp.m26899constructorimpl(f12);
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        DisabledInactiveTrackOpacity = 0.12f;
        DisabledStopColor = colorSchemeKeyTokens2;
        FocusActiveTrackColor = colorSchemeKeyTokens;
        float f14 = (float) 2.0d;
        FocusHandleWidth = C3156Dp.m26899constructorimpl(f14);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.SecondaryContainer;
        FocusInactiveTrackColor = colorSchemeKeyTokens3;
        FocusStopColor = colorSchemeKeyTokens;
        HandleColor = colorSchemeKeyTokens;
        HandleHeight = C3156Dp.m26899constructorimpl(f10);
        HandleShape = shapeKeyTokens;
        HandleWidth = C3156Dp.m26899constructorimpl(f12);
        HoverHandleColor = colorSchemeKeyTokens;
        HoverHandleWidth = C3156Dp.m26899constructorimpl(f12);
        HoverStopColor = colorSchemeKeyTokens;
        InactiveContainerOpacity = 1.0f;
        InactiveTrackColor = colorSchemeKeyTokens3;
        InactiveTrackHeight = C3156Dp.m26899constructorimpl(f13);
        InactiveTrackShape = shapeKeyTokens;
        LabelContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.InverseOnSurface;
        LabelTextColor = colorSchemeKeyTokens4;
        PressedActiveTrackColor = colorSchemeKeyTokens;
        PressedHandleColor = colorSchemeKeyTokens;
        PressedHandleWidth = C3156Dp.m26899constructorimpl(f14);
        PressedInactiveTrackColor = colorSchemeKeyTokens3;
        PressedStopColor = colorSchemeKeyTokens;
        SliderActiveHandleColor = colorSchemeKeyTokens;
        StopIndicatorColor = colorSchemeKeyTokens3;
        StopIndicatorColorSelected = colorSchemeKeyTokens3;
        StopIndicatorShape = shapeKeyTokens;
        StopIndicatorSize = C3156Dp.m26899constructorimpl(f12);
        StopIndicatorTrailingSpace = C3156Dp.m26899constructorimpl(f11);
        ValueIndicatorActiveBottomSpace = C3156Dp.m26899constructorimpl((float) 12.0d);
        ValueIndicatorContainerColor = ColorSchemeKeyTokens.InverseSurface;
        ValueIndicatorLabelTextColor = colorSchemeKeyTokens4;
        ValueIndicatorLabelTextFont = TypographyKeyTokens.LabelLarge;
    }

    private SliderTokens() {
    }

    public final float getActiveContainerOpacity() {
        return ActiveContainerOpacity;
    }

    /* renamed from: getActiveHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m23498getActiveHandleHeightD9Ej5fM() {
        return ActiveHandleHeight;
    }

    /* renamed from: getActiveHandleLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m23499getActiveHandleLeadingSpaceD9Ej5fM() {
        return ActiveHandleLeadingSpace;
    }

    /* renamed from: getActiveHandlePadding-D9Ej5fM, reason: not valid java name */
    public final float m23500getActiveHandlePaddingD9Ej5fM() {
        return ActiveHandlePadding;
    }

    public final ShapeKeyTokens getActiveHandleShape() {
        return ActiveHandleShape;
    }

    /* renamed from: getActiveHandleTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m23501getActiveHandleTrailingSpaceD9Ej5fM() {
        return ActiveHandleTrailingSpace;
    }

    /* renamed from: getActiveHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23502getActiveHandleWidthD9Ej5fM() {
        return ActiveHandleWidth;
    }

    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return ActiveTrackColor;
    }

    /* renamed from: getActiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m23503getActiveTrackHeightD9Ej5fM() {
        return ActiveTrackHeight;
    }

    public final ShapeKeyTokens getActiveTrackShape() {
        return ActiveTrackShape;
    }

    public final ShapeKeyTokens getActiveTrackShapeLeading() {
        return ActiveTrackShapeLeading;
    }

    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return DisabledActiveTrackColor;
    }

    public final float getDisabledActiveTrackOpacity() {
        return DisabledActiveTrackOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return DisabledHandleColor;
    }

    public final float getDisabledHandleOpacity() {
        return DisabledHandleOpacity;
    }

    /* renamed from: getDisabledHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23504getDisabledHandleWidthD9Ej5fM() {
        return DisabledHandleWidth;
    }

    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return DisabledInactiveTrackColor;
    }

    public final float getDisabledInactiveTrackOpacity() {
        return DisabledInactiveTrackOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledStopColor() {
        return DisabledStopColor;
    }

    public final ColorSchemeKeyTokens getFocusActiveTrackColor() {
        return FocusActiveTrackColor;
    }

    /* renamed from: getFocusHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23505getFocusHandleWidthD9Ej5fM() {
        return FocusHandleWidth;
    }

    public final ColorSchemeKeyTokens getFocusInactiveTrackColor() {
        return FocusInactiveTrackColor;
    }

    public final ColorSchemeKeyTokens getFocusStopColor() {
        return FocusStopColor;
    }

    public final ColorSchemeKeyTokens getHandleColor() {
        return HandleColor;
    }

    /* renamed from: getHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m23506getHandleHeightD9Ej5fM() {
        return HandleHeight;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* renamed from: getHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23507getHandleWidthD9Ej5fM() {
        return HandleWidth;
    }

    public final ColorSchemeKeyTokens getHoverHandleColor() {
        return HoverHandleColor;
    }

    /* renamed from: getHoverHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23508getHoverHandleWidthD9Ej5fM() {
        return HoverHandleWidth;
    }

    public final ColorSchemeKeyTokens getHoverStopColor() {
        return HoverStopColor;
    }

    public final float getInactiveContainerOpacity() {
        return InactiveContainerOpacity;
    }

    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return InactiveTrackColor;
    }

    /* renamed from: getInactiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m23509getInactiveTrackHeightD9Ej5fM() {
        return InactiveTrackHeight;
    }

    public final ShapeKeyTokens getInactiveTrackShape() {
        return InactiveTrackShape;
    }

    public final ColorSchemeKeyTokens getLabelContainerColor() {
        return LabelContainerColor;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final ColorSchemeKeyTokens getPressedActiveTrackColor() {
        return PressedActiveTrackColor;
    }

    public final ColorSchemeKeyTokens getPressedHandleColor() {
        return PressedHandleColor;
    }

    /* renamed from: getPressedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m23510getPressedHandleWidthD9Ej5fM() {
        return PressedHandleWidth;
    }

    public final ColorSchemeKeyTokens getPressedInactiveTrackColor() {
        return PressedInactiveTrackColor;
    }

    public final ColorSchemeKeyTokens getPressedStopColor() {
        return PressedStopColor;
    }

    public final ColorSchemeKeyTokens getSliderActiveHandleColor() {
        return SliderActiveHandleColor;
    }

    public final ColorSchemeKeyTokens getStopIndicatorColor() {
        return StopIndicatorColor;
    }

    public final ColorSchemeKeyTokens getStopIndicatorColorSelected() {
        return StopIndicatorColorSelected;
    }

    public final ShapeKeyTokens getStopIndicatorShape() {
        return StopIndicatorShape;
    }

    /* renamed from: getStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m23511getStopIndicatorSizeD9Ej5fM() {
        return StopIndicatorSize;
    }

    /* renamed from: getStopIndicatorTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m23512getStopIndicatorTrailingSpaceD9Ej5fM() {
        return StopIndicatorTrailingSpace;
    }

    /* renamed from: getValueIndicatorActiveBottomSpace-D9Ej5fM, reason: not valid java name */
    public final float m23513getValueIndicatorActiveBottomSpaceD9Ej5fM() {
        return ValueIndicatorActiveBottomSpace;
    }

    public final ColorSchemeKeyTokens getValueIndicatorContainerColor() {
        return ValueIndicatorContainerColor;
    }

    public final ColorSchemeKeyTokens getValueIndicatorLabelTextColor() {
        return ValueIndicatorLabelTextColor;
    }

    public final TypographyKeyTokens getValueIndicatorLabelTextFont() {
        return ValueIndicatorLabelTextFont;
    }
}
