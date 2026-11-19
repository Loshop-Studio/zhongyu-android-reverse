package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SecondaryNavigationTabTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DividerColor;
    private static final float DividerHeight;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    public static final SecondaryNavigationTabTokens INSTANCE = new SecondaryNavigationTabTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m29787getLevel0D9Ej5fM();
        ContainerHeight = C3186Dp.m33501constructorimpl((float) 48.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        DividerColor = ColorSchemeKeyTokens.SurfaceVariant;
        DividerHeight = C3186Dp.m33501constructorimpl((float) 1.0d);
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.TitleSmall;
        PressedLabelTextColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        FocusIconColor = colorSchemeKeyTokens;
        HoverIconColor = colorSchemeKeyTokens;
        IconSize = C3186Dp.m33501constructorimpl((float) 24.0d);
        InactiveIconColor = colorSchemeKeyTokens2;
        PressedIconColor = colorSchemeKeyTokens;
    }

    private SecondaryNavigationTabTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30092getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m30093getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDividerColor() {
        return DividerColor;
    }

    /* renamed from: getDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m30094getDividerHeightD9Ej5fM() {
        return DividerHeight;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m30095getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}
