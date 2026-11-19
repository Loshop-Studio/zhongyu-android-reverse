package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m30098getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = C3186Dp.m33501constructorimpl(56);
    private static final float SheetMaxWidth = C3186Dp.m33501constructorimpl(640);

    private BottomSheetDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28371DragHandlelgZ2HuY(androidx.compose.p014ui.Modifier r23, float r24, float r25, androidx.compose.p014ui.graphics.Shape r26, long r27, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.m28371DragHandlelgZ2HuY(androidx.compose.ui.Modifier, float, float, androidx.compose.ui.graphics.Shape, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:299)");
        }
        long value = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m28372getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final Shape getExpandedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getHiddenShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:291)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getScrimColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM30877copywmQWz5c$default;
    }

    /* renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m28373getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m28374getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:316)");
        }
        WindowInsets windowInsetsM27531onlybOOhFvg = WindowInsetsKt.m27531onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer, 6), WindowInsetsSides.Companion.m27551getBottomJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM27531onlybOOhFvg;
    }
}
