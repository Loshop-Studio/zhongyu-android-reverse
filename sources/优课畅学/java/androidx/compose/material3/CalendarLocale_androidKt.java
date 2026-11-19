package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class CalendarLocale_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final Locale defaultLocale(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1612326743, i10, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:30)");
        }
        composer.startReplaceGroup(-1190822718);
        Locale localeDefaultLocale = Locale24.Companion.defaultLocale(composer, 6);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return localeDefaultLocale;
    }
}
