package androidx.compose.foundation;

import android.content.res.Resources;
import androidx.compose.p014ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BasicTooltipStrings {
    public static final int $stable = 0;
    public static final BasicTooltipStrings INSTANCE = new BasicTooltipStrings();

    private BasicTooltipStrings() {
    }

    @Composable
    public final String description(Composer composer, int i10) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1416633714, i10, -1, "androidx.compose.foundation.BasicTooltipStrings.description (BasicTooltip.android.kt:26)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C1224R.string.tooltip_description, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }

    @Composable
    public final String label(Composer composer, int i10) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(187295226, i10, -1, "androidx.compose.foundation.BasicTooltipStrings.label (BasicTooltip.android.kt:24)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C1224R.string.tooltip_label, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }
}
