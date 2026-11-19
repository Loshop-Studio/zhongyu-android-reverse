package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ProgressIndicatorTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveShape;
    private static final float ActiveThickness;
    private static final float ActiveTrackSpace;
    public static final ProgressIndicatorTokens INSTANCE = new ProgressIndicatorTokens();
    private static final float Size;
    private static final ColorSchemeKeyTokens StopColor;
    private static final float StopShape;
    private static final float StopSize;
    private static final ColorSchemeKeyTokens TrackColor;
    private static final ShapeKeyTokens TrackShape;
    private static final float TrackThickness;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveShape = shapeKeyTokens;
        float f10 = (float) 4.0d;
        ActiveThickness = C3186Dp.m33501constructorimpl(f10);
        ActiveTrackSpace = C3186Dp.m33501constructorimpl(f10);
        StopColor = colorSchemeKeyTokens;
        StopShape = C3186Dp.m33501constructorimpl(f10);
        StopSize = C3186Dp.m33501constructorimpl(f10);
        TrackColor = ColorSchemeKeyTokens.SecondaryContainer;
        TrackShape = shapeKeyTokens;
        TrackThickness = C3186Dp.m33501constructorimpl(f10);
        Size = C3186Dp.m33501constructorimpl((float) 48.0d);
    }

    private ProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    /* renamed from: getActiveThickness-D9Ej5fM, reason: not valid java name */
    public final float m30077getActiveThicknessD9Ej5fM() {
        return ActiveThickness;
    }

    /* renamed from: getActiveTrackSpace-D9Ej5fM, reason: not valid java name */
    public final float m30078getActiveTrackSpaceD9Ej5fM() {
        return ActiveTrackSpace;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m30079getSizeD9Ej5fM() {
        return Size;
    }

    public final ColorSchemeKeyTokens getStopColor() {
        return StopColor;
    }

    /* renamed from: getStopShape-D9Ej5fM, reason: not valid java name */
    public final float m30080getStopShapeD9Ej5fM() {
        return StopShape;
    }

    /* renamed from: getStopSize-D9Ej5fM, reason: not valid java name */
    public final float m30081getStopSizeD9Ej5fM() {
        return StopSize;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }

    /* renamed from: getTrackThickness-D9Ej5fM, reason: not valid java name */
    public final float m30082getTrackThicknessD9Ej5fM() {
        return TrackThickness;
    }
}
