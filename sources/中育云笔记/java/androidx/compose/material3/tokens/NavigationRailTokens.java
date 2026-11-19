package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class NavigationRailTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActiveFocusIconColor;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final float ActiveIndicatorWidth;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final ColorSchemeKeyTokens ActivePressedIconColor;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidth;
    public static final NavigationRailTokens INSTANCE = new NavigationRailTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveFocusIconColor;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final ColorSchemeKeyTokens InactivePressedIconColor;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens MenuFocusIconColor;
    private static final ColorSchemeKeyTokens MenuHoverIconColor;
    private static final ColorSchemeKeyTokens MenuIconColor;
    private static final float MenuIconSize;
    private static final ColorSchemeKeyTokens MenuPressedIconColor;
    private static final float NoLabelActiveIndicatorHeight;
    private static final ShapeKeyTokens NoLabelActiveIndicatorShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens2;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ActiveIconColor = colorSchemeKeyTokens;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        ActiveIndicatorHeight = C3186Dp.m33501constructorimpl((float) 32.0d);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveIndicatorShape = shapeKeyTokens;
        float f10 = (float) 56.0d;
        ActiveIndicatorWidth = C3186Dp.m33501constructorimpl(f10);
        ActiveLabelTextColor = colorSchemeKeyTokens2;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens2;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m29787getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerWidth = C3186Dp.m33501constructorimpl((float) 80.0d);
        float f11 = (float) 24.0d;
        IconSize = C3186Dp.m33501constructorimpl(f11);
        InactiveFocusIconColor = colorSchemeKeyTokens2;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens2;
        InactiveHoverIconColor = colorSchemeKeyTokens2;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens3;
        InactiveLabelTextColor = colorSchemeKeyTokens3;
        InactivePressedIconColor = colorSchemeKeyTokens2;
        InactivePressedLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        MenuFocusIconColor = colorSchemeKeyTokens2;
        MenuHoverIconColor = colorSchemeKeyTokens2;
        MenuIconColor = colorSchemeKeyTokens3;
        MenuIconSize = C3186Dp.m33501constructorimpl(f11);
        MenuPressedIconColor = colorSchemeKeyTokens2;
        NoLabelActiveIndicatorHeight = C3186Dp.m33501constructorimpl(f10);
        NoLabelActiveIndicatorShape = shapeKeyTokens;
    }

    private NavigationRailTokens() {
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m29943getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m29944getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29945getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m29946getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29947getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getMenuFocusIconColor() {
        return MenuFocusIconColor;
    }

    public final ColorSchemeKeyTokens getMenuHoverIconColor() {
        return MenuHoverIconColor;
    }

    public final ColorSchemeKeyTokens getMenuIconColor() {
        return MenuIconColor;
    }

    /* renamed from: getMenuIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29948getMenuIconSizeD9Ej5fM() {
        return MenuIconSize;
    }

    public final ColorSchemeKeyTokens getMenuPressedIconColor() {
        return MenuPressedIconColor;
    }

    /* renamed from: getNoLabelActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m29949getNoLabelActiveIndicatorHeightD9Ej5fM() {
        return NoLabelActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getNoLabelActiveIndicatorShape() {
        return NoLabelActiveIndicatorShape;
    }
}
