package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TopAppBarLargeTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens HeadlineColor;
    private static final TypographyKeyTokens HeadlineFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;
    public static final TopAppBarLargeTokens INSTANCE = new TopAppBarLargeTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m29787getLevel0D9Ej5fM();
    private static final float ContainerHeight = C3186Dp.m33501constructorimpl((float) 152.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        HeadlineColor = colorSchemeKeyTokens;
        HeadlineFont = TypographyKeyTokens.HeadlineMedium;
        LeadingIconColor = colorSchemeKeyTokens;
        float f10 = (float) 24.0d;
        LeadingIconSize = C3186Dp.m33501constructorimpl(f10);
        TrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        TrailingIconSize = C3186Dp.m33501constructorimpl(f10);
    }

    private TopAppBarLargeTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30166getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m30167getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m30168getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m30169getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
