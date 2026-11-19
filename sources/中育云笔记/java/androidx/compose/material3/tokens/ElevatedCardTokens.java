package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ElevatedCardTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    private static final float DisabledContainerOpacity;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float PressedContainerElevation;
    public static final ElevatedCardTokens INSTANCE = new ElevatedCardTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = ColorSchemeKeyTokens.Surface;
        DisabledContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        DisabledContainerOpacity = 0.38f;
        DraggedContainerElevation = elevationTokens.m29791getLevel4D9Ej5fM();
        FocusContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        HoverContainerElevation = elevationTokens.m29789getLevel2D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = C3186Dp.m33501constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
    }

    private ElevatedCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29780getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29781getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29782getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29783getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29784getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29785getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29786getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
