package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TopAppBarSmallTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens HeadlineColor;
    private static final TypographyKeyTokens HeadlineFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens OnScrollContainerColor;
    private static final float OnScrollContainerElevation;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;
    public static final TopAppBarSmallTokens INSTANCE = new TopAppBarSmallTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m29787getLevel0D9Ej5fM();
        ContainerHeight = C3186Dp.m33501constructorimpl((float) 64.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        HeadlineColor = colorSchemeKeyTokens;
        HeadlineFont = TypographyKeyTokens.TitleLarge;
        LeadingIconColor = colorSchemeKeyTokens;
        float f10 = (float) 24.0d;
        LeadingIconSize = C3186Dp.m33501constructorimpl(f10);
        OnScrollContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        OnScrollContainerElevation = elevationTokens.m29789getLevel2D9Ej5fM();
        TrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        TrailingIconSize = C3186Dp.m33501constructorimpl(f10);
    }

    private TopAppBarSmallTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30180getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m30181getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
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
    public final float m30182getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getOnScrollContainerColor() {
        return OnScrollContainerColor;
    }

    /* renamed from: getOnScrollContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30183getOnScrollContainerElevationD9Ej5fM() {
        return OnScrollContainerElevation;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m30184getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
