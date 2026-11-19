package androidx.compose.material3.tokens;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DateInputModalTokens {
    public static final int $stable = 0;
    private static final float ContainerWidth;
    private static final float HeaderContainerWidth;
    private static final ColorSchemeKeyTokens HeaderHeadlineColor;
    private static final TypographyKeyTokens HeaderHeadlineFont;
    private static final ColorSchemeKeyTokens HeaderSupportingTextColor;
    private static final TypographyKeyTokens HeaderSupportingTextFont;
    public static final DateInputModalTokens INSTANCE = new DateInputModalTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m23188getLevel3D9Ej5fM();
    private static final float ContainerHeight = C3156Dp.m26899constructorimpl((float) 512.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final float HeaderContainerHeight = C3156Dp.m26899constructorimpl((float) 120.0d);

    static {
        float f10 = (float) 328.0d;
        ContainerWidth = C3156Dp.m26899constructorimpl(f10);
        HeaderContainerWidth = C3156Dp.m26899constructorimpl(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeaderHeadlineColor = colorSchemeKeyTokens;
        HeaderHeadlineFont = TypographyKeyTokens.HeadlineLarge;
        HeaderSupportingTextColor = colorSchemeKeyTokens;
        HeaderSupportingTextFont = TypographyKeyTokens.LabelLarge;
    }

    private DateInputModalTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m23146getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23147getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23148getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m23149getHeaderContainerHeightD9Ej5fM() {
        return HeaderContainerHeight;
    }

    /* renamed from: getHeaderContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m23150getHeaderContainerWidthD9Ej5fM() {
        return HeaderContainerWidth;
    }

    public final ColorSchemeKeyTokens getHeaderHeadlineColor() {
        return HeaderHeadlineColor;
    }

    public final TypographyKeyTokens getHeaderHeadlineFont() {
        return HeaderHeadlineFont;
    }

    public final ColorSchemeKeyTokens getHeaderSupportingTextColor() {
        return HeaderSupportingTextColor;
    }

    public final TypographyKeyTokens getHeaderSupportingTextFont() {
        return HeaderSupportingTextFont;
    }
}
