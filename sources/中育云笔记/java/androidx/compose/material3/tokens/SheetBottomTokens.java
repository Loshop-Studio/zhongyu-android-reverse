package androidx.compose.material3.tokens;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SheetBottomTokens {
    public static final int $stable = 0;
    private static final float DockedModalContainerElevation;
    private static final float DockedStandardContainerElevation;
    private static final ColorSchemeKeyTokens FocusIndicatorColor;
    public static final SheetBottomTokens INSTANCE = new SheetBottomTokens();
    private static final ColorSchemeKeyTokens DockedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
    private static final ShapeKeyTokens DockedContainerShape = ShapeKeyTokens.CornerExtraLargeTop;
    private static final ColorSchemeKeyTokens DockedDragHandleColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float DockedDragHandleHeight = C3186Dp.m33501constructorimpl((float) 4.0d);
    private static final float DockedDragHandleWidth = C3186Dp.m33501constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens DockedMinimizedContainerShape = ShapeKeyTokens.CornerNone;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DockedModalContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        DockedStandardContainerElevation = elevationTokens.m29788getLevel1D9Ej5fM();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    }

    private SheetBottomTokens() {
    }

    public final ColorSchemeKeyTokens getDockedContainerColor() {
        return DockedContainerColor;
    }

    public final ShapeKeyTokens getDockedContainerShape() {
        return DockedContainerShape;
    }

    public final ColorSchemeKeyTokens getDockedDragHandleColor() {
        return DockedDragHandleColor;
    }

    /* renamed from: getDockedDragHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m30096getDockedDragHandleHeightD9Ej5fM() {
        return DockedDragHandleHeight;
    }

    /* renamed from: getDockedDragHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m30097getDockedDragHandleWidthD9Ej5fM() {
        return DockedDragHandleWidth;
    }

    public final ShapeKeyTokens getDockedMinimizedContainerShape() {
        return DockedMinimizedContainerShape;
    }

    /* renamed from: getDockedModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30098getDockedModalContainerElevationD9Ej5fM() {
        return DockedModalContainerElevation;
    }

    /* renamed from: getDockedStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m30099getDockedStandardContainerElevationD9Ej5fM() {
        return DockedStandardContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }
}
