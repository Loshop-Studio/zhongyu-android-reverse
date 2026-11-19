package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AlertDialogDefaults {
    public static final int $stable = 0;
    public static final AlertDialogDefaults INSTANCE = new AlertDialogDefaults();
    private static final float TonalElevation = C3186Dp.m33501constructorimpl(0);

    private AlertDialogDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(616766901, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:211)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getIconContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1646653461, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:215)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952504159, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:207)");
        }
        Shape value = ShapesKt.getValue(DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getTextContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1729845653, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:223)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getTitleContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(247083549, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:219)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getHeadlineColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m28334getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }
}
