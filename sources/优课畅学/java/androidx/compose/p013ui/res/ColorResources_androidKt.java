package androidx.compose.p013ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes2.dex */
public final class ColorResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final long colorResource(@ColorRes int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i11, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:33)");
        }
        long jColor = ColorKt.Color(ResourcesCompat.getColor(Resources_androidKt.resources(composer, 0), i10, ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getTheme()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jColor;
    }
}
