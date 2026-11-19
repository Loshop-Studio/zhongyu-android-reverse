package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SuggestionChipTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    private static final float DisabledLeadingIconOpacity;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedLabelTextColor;
    private static final ColorSchemeKeyTokens DraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens ElevatedContainerColor;
    private static final float ElevatedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;
    private static final float ElevatedDisabledContainerElevation;
    private static final float ElevatedDisabledContainerOpacity;
    private static final float ElevatedFocusContainerElevation;
    private static final float ElevatedHoverContainerElevation;
    private static final float ElevatedPressedContainerElevation;
    private static final float FlatContainerElevation;
    private static final ColorSchemeKeyTokens FlatDisabledOutlineColor;
    private static final float FlatDisabledOutlineOpacity;
    private static final ColorSchemeKeyTokens FlatFocusOutlineColor;
    private static final ColorSchemeKeyTokens FlatOutlineColor;
    private static final float FlatOutlineWidth;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens PressedLeadingIconColor;
    public static final SuggestionChipTokens INSTANCE = new SuggestionChipTokens();
    private static final float ContainerHeight = C3186Dp.m33501constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m29791getLevel4D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        DraggedLabelTextColor = colorSchemeKeyTokens2;
        ElevatedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
        ElevatedContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        ElevatedDisabledContainerOpacity = 0.12f;
        ElevatedFocusContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m29789getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        FlatContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        FlatDisabledOutlineColor = colorSchemeKeyTokens;
        FlatDisabledOutlineOpacity = 0.12f;
        FlatFocusOutlineColor = colorSchemeKeyTokens2;
        FlatOutlineColor = ColorSchemeKeyTokens.Outline;
        FlatOutlineWidth = C3186Dp.m33501constructorimpl((float) 1.0d);
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        FocusLabelTextColor = colorSchemeKeyTokens2;
        HoverLabelTextColor = colorSchemeKeyTokens2;
        LabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedLabelTextColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        DisabledLeadingIconOpacity = 0.38f;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        DraggedLeadingIconColor = colorSchemeKeyTokens3;
        FocusLeadingIconColor = colorSchemeKeyTokens3;
        HoverLeadingIconColor = colorSchemeKeyTokens3;
        LeadingIconColor = colorSchemeKeyTokens3;
        LeadingIconSize = C3186Dp.m33501constructorimpl((float) 18.0d);
        PressedLeadingIconColor = colorSchemeKeyTokens3;
    }

    private SuggestionChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m30120getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    public final float getDisabledLeadingIconOpacity() {
        return DisabledLeadingIconOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30121getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedLabelTextColor() {
        return DraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDraggedLeadingIconColor() {
        return DraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getElevatedContainerColor() {
        return ElevatedContainerColor;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30122getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30123getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    public final float getElevatedDisabledContainerOpacity() {
        return ElevatedDisabledContainerOpacity;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30124getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30125getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30126getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30127getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledOutlineColor() {
        return FlatDisabledOutlineColor;
    }

    public final float getFlatDisabledOutlineOpacity() {
        return FlatDisabledOutlineOpacity;
    }

    public final ColorSchemeKeyTokens getFlatFocusOutlineColor() {
        return FlatFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getFlatOutlineColor() {
        return FlatOutlineColor;
    }

    /* renamed from: getFlatOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m30128getFlatOutlineWidthD9Ej5fM() {
        return FlatOutlineWidth;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return HoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m30129getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPressedLeadingIconColor() {
        return PressedLeadingIconColor;
    }
}
