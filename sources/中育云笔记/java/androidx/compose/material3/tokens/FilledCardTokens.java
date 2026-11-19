package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FilledCardTokens {
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
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        DisabledContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        DisabledContainerOpacity = 0.38f;
        DraggedContainerElevation = elevationTokens.m29790getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        HoverContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = C3186Dp.m33501constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
    }

    private FilledCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29861getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29862getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29863getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29864getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29865getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29866getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m29867getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
