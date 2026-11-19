package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;

/* loaded from: classes2.dex */
public final class TimePicker_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final int getDefaultTimePickerLayoutType(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1979410629, i10, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:27)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        int iM29353getHorizontalQJTpgSE = configuration.screenHeightDp < configuration.screenWidthDp ? TimePickerLayoutType.Companion.m29353getHorizontalQJTpgSE() : TimePickerLayoutType.Companion.m29354getVerticalQJTpgSE();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iM29353getHorizontalQJTpgSE;
    }

    public static /* synthetic */ void getDefaultTimePickerLayoutType$annotations() {
    }
}
