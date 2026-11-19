package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FilledIconButtonTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens Color;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidth;
    private static final ColorSchemeKeyTokens DisabledColor;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerOpacity;
    private static final float DisabledOpacity;
    private static final ColorSchemeKeyTokens FocusColor;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    private static final ColorSchemeKeyTokens HoverColor;
    public static final FilledIconButtonTokens INSTANCE = new FilledIconButtonTokens();
    private static final ColorSchemeKeyTokens PressedColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final float Size;
    private static final ColorSchemeKeyTokens ToggleSelectedColor;
    private static final ColorSchemeKeyTokens ToggleSelectedFocusColor;
    private static final ColorSchemeKeyTokens ToggleSelectedHoverColor;
    private static final ColorSchemeKeyTokens ToggleSelectedPressedColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedFocusColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedHoverColor;
    private static final ColorSchemeKeyTokens ToggleUnselectedPressedColor;
    private static final ColorSchemeKeyTokens UnselectedContainerColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ContainerColor = colorSchemeKeyTokens;
        float f10 = (float) 40.0d;
        ContainerHeight = C3186Dp.m33501constructorimpl(f10);
        ContainerShape = ShapeKeyTokens.CornerFull;
        ContainerWidth = C3186Dp.m33501constructorimpl(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerColor = colorSchemeKeyTokens2;
        DisabledContainerOpacity = 0.12f;
        DisabledColor = colorSchemeKeyTokens2;
        DisabledOpacity = 0.38f;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        FocusColor = colorSchemeKeyTokens3;
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        HoverColor = colorSchemeKeyTokens3;
        Color = colorSchemeKeyTokens3;
        Size = C3186Dp.m33501constructorimpl((float) 24.0d);
        PressedColor = colorSchemeKeyTokens3;
        SelectedContainerColor = colorSchemeKeyTokens;
        ToggleSelectedFocusColor = colorSchemeKeyTokens3;
        ToggleSelectedHoverColor = colorSchemeKeyTokens3;
        ToggleSelectedColor = colorSchemeKeyTokens3;
        ToggleSelectedPressedColor = colorSchemeKeyTokens3;
        ToggleUnselectedFocusColor = colorSchemeKeyTokens;
        ToggleUnselectedHoverColor = colorSchemeKeyTokens;
        ToggleUnselectedColor = colorSchemeKeyTokens;
        ToggleUnselectedPressedColor = colorSchemeKeyTokens;
        UnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;
    }

    private FilledIconButtonTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m29868getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m29869getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    public final float getDisabledOpacity() {
        return DisabledOpacity;
    }

    public final ColorSchemeKeyTokens getFocusColor() {
        return FocusColor;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getHoverColor() {
        return HoverColor;
    }

    public final ColorSchemeKeyTokens getPressedColor() {
        return PressedColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m29870getSizeD9Ej5fM() {
        return Size;
    }

    public final ColorSchemeKeyTokens getToggleSelectedColor() {
        return ToggleSelectedColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedFocusColor() {
        return ToggleSelectedFocusColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedHoverColor() {
        return ToggleSelectedHoverColor;
    }

    public final ColorSchemeKeyTokens getToggleSelectedPressedColor() {
        return ToggleSelectedPressedColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedColor() {
        return ToggleUnselectedColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedFocusColor() {
        return ToggleUnselectedFocusColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedHoverColor() {
        return ToggleUnselectedHoverColor;
    }

    public final ColorSchemeKeyTokens getToggleUnselectedPressedColor() {
        return ToggleUnselectedPressedColor;
    }

    public final ColorSchemeKeyTokens getUnselectedContainerColor() {
        return UnselectedContainerColor;
    }
}
