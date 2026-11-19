package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class OutlinedCardTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final float DisabledContainerElevation;
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    public static final float DisabledOutlineOpacity = 0.12f;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedOutlineColor;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusOutlineColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedOutlineColor;
    public static final OutlinedCardTokens INSTANCE = new OutlinedCardTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        DisabledOutlineColor = ColorSchemeKeyTokens.Outline;
        DraggedContainerElevation = elevationTokens.m29790getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OutlineVariant;
        DraggedOutlineColor = colorSchemeKeyTokens;
        FocusContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        FocusOutlineColor = ColorSchemeKeyTokens.OnSurface;
        HoverContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        HoverOutlineColor = colorSchemeKeyTokens;
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = C3186Dp.m33501constructorimpl((float) 24.0d);
        OutlineColor = colorSchemeKeyTokens;
        OutlineWidth = C3186Dp.m33501constructorimpl((float) 1.0d);
        PressedContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        PressedOutlineColor = colorSchemeKeyTokens;
    }

    private OutlinedCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29960getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29961getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29962getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedOutlineColor() {
        return DraggedOutlineColor;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29963getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29964getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29965getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29966getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29967getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedOutlineColor() {
        return PressedOutlineColor;
    }
}
