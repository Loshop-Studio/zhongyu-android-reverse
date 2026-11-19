package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(24)
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13558d2 = {"Landroidx/compose/material3/Locale24;", "", "()V", "Companion", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class Locale24 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/material3/Locale24$Companion;", "", "()V", "defaultLocale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nCalendarLocale.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLocale.android.kt\nandroidx/compose/material3/Locale24$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n77#2:50\n*S KotlinDebug\n*F\n+ 1 CalendarLocale.android.kt\nandroidx/compose/material3/Locale24$Companion\n*L\n45#1:50\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
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
