package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class Locale24 {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Composable
        @ReadOnlyComposable
        public final Locale defaultLocale(Composer composer, int i10) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(317587697, i10, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
            }
            Locale locale = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales().get(0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return locale;
        }

        private Companion() {
        }
    }
}
