package androidx.compose.foundation;

import android.content.res.Resources;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/foundation/BasicTooltipStrings;", "", "()V", "description", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "label", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
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
        String strStringResource = StringResources_androidKt.stringResource(C1165R.string.tooltip_description, composer, 0);
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
        String strStringResource = StringResources_androidKt.stringResource(C1165R.string.tooltip_label, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }
}
