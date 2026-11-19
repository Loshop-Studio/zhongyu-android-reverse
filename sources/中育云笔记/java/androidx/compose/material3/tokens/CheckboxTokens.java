package androidx.compose.material3.tokens;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CheckboxTokens {
    public static final int $stable = 0;
    private static final float ContainerHeight;
    private static final RoundedCornerShape ContainerShape;
    private static final float ContainerWidth;
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor;
    public static final float SelectedDisabledContainerOpacity = 0.38f;
    private static final float SelectedDisabledContainerOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor;
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor;
    private static final float SelectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor;
    private static final float SelectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorIconColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor;
    private static final float SelectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final float SelectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final float SelectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final float SelectedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final float SelectedPressedOutlineWidth;
    private static final ShapeKeyTokens StateLayerShape;
    private static final float StateLayerSize;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor;
    private static final float UnselectedDisabledOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor;
    private static final float UnselectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor;
    private static final float UnselectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor;
    private static final float UnselectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;
    private static final float UnselectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor;
    private static final float UnselectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor;
    private static final float UnselectedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor;
    private static final float UnselectedPressedOutlineWidth;

    static {
        float f10 = (float) 18.0d;
        ContainerHeight = C3186Dp.m33501constructorimpl(f10);
        float f11 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl(f11));
        ContainerWidth = C3186Dp.m33501constructorimpl(f10);
        IconSize = C3186Dp.m33501constructorimpl(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        SelectedDisabledContainerColor = colorSchemeKeyTokens2;
        float f12 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        SelectedDisabledContainerOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        SelectedErrorContainerColor = colorSchemeKeyTokens3;
        SelectedErrorFocusContainerColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        SelectedErrorFocusIconColor = colorSchemeKeyTokens4;
        SelectedErrorFocusOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedErrorHoverContainerColor = colorSchemeKeyTokens3;
        SelectedErrorHoverIconColor = colorSchemeKeyTokens4;
        SelectedErrorHoverOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedErrorIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedContainerColor = colorSchemeKeyTokens3;
        SelectedErrorPressedIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedFocusContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        SelectedFocusIconColor = colorSchemeKeyTokens5;
        SelectedFocusOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedHoverContainerColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens5;
        SelectedHoverOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedIconColor = colorSchemeKeyTokens5;
        SelectedOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        SelectedPressedContainerColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens5;
        SelectedPressedOutlineWidth = C3186Dp.m33501constructorimpl(f12);
        StateLayerShape = ShapeKeyTokens.CornerFull;
        StateLayerSize = C3186Dp.m33501constructorimpl((float) 40.0d);
        UnselectedDisabledOutlineColor = colorSchemeKeyTokens2;
        UnselectedDisabledOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedErrorFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorFocusOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedErrorHoverOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorHoverOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedErrorOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedFocusOutlineColor = colorSchemeKeyTokens2;
        UnselectedFocusOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedHoverOutlineColor = colorSchemeKeyTokens2;
        UnselectedHoverOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedOutlineWidth = C3186Dp.m33501constructorimpl(f11);
        UnselectedPressedOutlineColor = colorSchemeKeyTokens2;
        UnselectedPressedOutlineWidth = C3186Dp.m33501constructorimpl(f11);
    }

    private CheckboxTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m29632getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final RoundedCornerShape getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m29633getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m29634getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    /* renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29635getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return SelectedDisabledContainerOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return SelectedDisabledIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return SelectedErrorContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return SelectedErrorFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return SelectedErrorFocusIconColor;
    }

    /* renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29636getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return SelectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return SelectedErrorHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return SelectedErrorHoverIconColor;
    }

    /* renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29637getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return SelectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return SelectedErrorIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return SelectedErrorPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return SelectedErrorPressedIconColor;
    }

    /* renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29638getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return SelectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return SelectedFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    /* renamed from: getSelectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29639getSelectedFocusOutlineWidthD9Ej5fM() {
        return SelectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return SelectedHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    /* renamed from: getSelectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29640getSelectedHoverOutlineWidthD9Ej5fM() {
        return SelectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29641getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return SelectedPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* renamed from: getSelectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29642getSelectedPressedOutlineWidthD9Ej5fM() {
        return SelectedPressedOutlineWidth;
    }

    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m29643getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    /* renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29644getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return UnselectedDisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return UnselectedErrorFocusOutlineColor;
    }

    /* renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29645getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return UnselectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return UnselectedErrorHoverOutlineColor;
    }

    /* renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29646getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return UnselectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return UnselectedErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return UnselectedErrorPressedOutlineColor;
    }

    /* renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29647getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return UnselectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    /* renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29648getUnselectedFocusOutlineWidthD9Ej5fM() {
        return UnselectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return UnselectedHoverOutlineColor;
    }

    /* renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29649getUnselectedHoverOutlineWidthD9Ej5fM() {
        return UnselectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29650getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return UnselectedPressedOutlineColor;
    }

    /* renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m29651getUnselectedPressedOutlineWidthD9Ej5fM() {
        return UnselectedPressedOutlineWidth;
    }
}
