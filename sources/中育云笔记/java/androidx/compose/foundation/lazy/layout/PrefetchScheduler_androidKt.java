package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class PrefetchScheduler_androidKt {
    private static final PrefetchScheduler_androidKt$RobolectricImpl$1 RobolectricImpl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1] */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        RobolectricImpl = AbstractC9979u.m20289b(lowerCase, "robolectric") ? new PrefetchScheduler() { // from class: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1
            @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
            public void schedulePrefetch(PrefetchRequest prefetchRequest) {
            }
        } : null;
    }

    @ExperimentalFoundationApi
    private static /* synthetic */ void getRobolectricImpl$annotations() {
    }

    @Composable
    @ExperimentalFoundationApi
    public static final PrefetchScheduler rememberDefaultPrefetchScheduler(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        PrefetchScheduler prefetchScheduler = RobolectricImpl;
        if (prefetchScheduler != null) {
            composer.startReplaceGroup(1213893039);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1213931944);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean zChanged = composer.changed(view);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new AndroidPrefetchScheduler(view);
                composer.updateRememberedValue(objRememberedValue);
            }
            prefetchScheduler = (AndroidPrefetchScheduler) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return prefetchScheduler;
    }
}
