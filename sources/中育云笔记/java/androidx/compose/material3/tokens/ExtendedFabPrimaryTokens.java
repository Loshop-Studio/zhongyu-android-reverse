package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ExtendedFabPrimaryTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final float LoweredContainerElevation;
    private static final float LoweredFocusContainerElevation;
    private static final float LoweredHoverContainerElevation;
    private static final float LoweredPressedContainerElevation;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    public static final ExtendedFabPrimaryTokens INSTANCE = new ExtendedFabPrimaryTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m29790getLevel3D9Ej5fM();
        ContainerHeight = C3186Dp.m33501constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerLarge;
        FocusContainerElevation = elevationTokens.m29790getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m29791getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        IconSize = C3186Dp.m33501constructorimpl((float) 24.0d);
        LabelTextColor = colorSchemeKeyTokens;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        LoweredContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m29789getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m29790getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
        PressedLabelTextColor = colorSchemeKeyTokens;
    }

    private ExtendedFabPrimaryTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29793getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m29794getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29795getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29796getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29797getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* renamed from: getLoweredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29798getLoweredContainerElevationD9Ej5fM() {
        return LoweredContainerElevation;
    }

    /* renamed from: getLoweredFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29799getLoweredFocusContainerElevationD9Ej5fM() {
        return LoweredFocusContainerElevation;
    }

    /* renamed from: getLoweredHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29800getLoweredHoverContainerElevationD9Ej5fM() {
        return LoweredHoverContainerElevation;
    }

    /* renamed from: getLoweredPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29801getLoweredPressedContainerElevationD9Ej5fM() {
        return LoweredPressedContainerElevation;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29802getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}
