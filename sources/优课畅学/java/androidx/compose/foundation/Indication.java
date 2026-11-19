package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import p123h7.InterfaceC8721a;

@Stable
/* loaded from: classes.dex */
public interface Indication {
    @Composable
    @InterfaceC8721a
    default IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i10) {
        composer.startReplaceGroup(1257603829);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1257603829, i10, -1, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:74)");
        }
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return noIndicationInstance;
    }
}
