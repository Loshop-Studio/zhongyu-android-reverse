package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m29808getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m28711bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3186Dp.m33501constructorimpl(0);
        }
        return floatingActionButtonDefaults.m28712bottomAppBarFabElevationa9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m28712bottomAppBarFabElevationa9UjIt4(float f10, float f11, float f12, float f13) {
        return new FloatingActionButtonElevation(f10, f11, f12, f13, null);
    }

    @Composable
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m28713elevationxZ9QkE(float f10, float f11, float f12, float f13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m29825getContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m29835getPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FabPrimaryTokens.INSTANCE.m29828getFocusContainerElevationD9Ej5fM();
        }
        float f14 = f12;
        if ((i11 & 8) != 0) {
            f13 = FabPrimaryTokens.INSTANCE.m29829getHoverContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
        }
        float f15 = f10;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f15, f11, f14, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
        }
        long value = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getExtendedFabShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:422)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m28714getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    @Composable
    public final Shape getLargeShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:418)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getSmallShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:414)");
        }
        Shape value = ShapesKt.getValue(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    /* renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m28715loweredElevationxZ9QkE(float f10, float f11, float f12, float f13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m29831getLoweredContainerElevationD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m29834getLoweredPressedContainerElevationD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = FabPrimaryTokens.INSTANCE.m29832getLoweredFocusContainerElevationD9Ej5fM();
        }
        float f14 = f12;
        if ((i11 & 8) != 0) {
            f13 = FabPrimaryTokens.INSTANCE.m29833getLoweredHoverContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:470)");
        }
        float f15 = f10;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f15, f11, f14, f13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }
}
