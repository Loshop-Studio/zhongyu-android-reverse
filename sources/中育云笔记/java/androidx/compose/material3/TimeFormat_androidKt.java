package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;

/* loaded from: classes2.dex */
public final class TimeFormat_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean is24HourFormat(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-972868615, i10, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zIs24HourFormat;
    }
}
