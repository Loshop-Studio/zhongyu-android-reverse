package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class BasicTooltipKt {
    @Stable
    public static final TooltipState BasicTooltipState(boolean z10, boolean z11, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z10, z11, mutatorMutex);
    }

    public static /* synthetic */ TooltipState BasicTooltipState$default(boolean z10, boolean z11, MutatorMutex mutatorMutex, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z10, z11, mutatorMutex);
    }

    @Composable
    public static final TooltipState rememberBasicTooltipState(boolean z10, boolean z11, MutatorMutex mutatorMutex, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1483057531, i10, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:88)");
        }
        boolean z12 = ((((i10 & 112) ^ 48) > 32 && composer.changed(z11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z12 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new BasicTooltipStateImpl(z10, z11, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }
}
