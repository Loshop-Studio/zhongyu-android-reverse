package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class DragInteractionKt {
    @Composable
    public static final State<Boolean> collectIsDraggedAsState(InteractionSource interactionSource, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(101276833, i10, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:77)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z10 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new DragInteractionKt$collectIsDraggedAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC9544p) objRememberedValue2, composer, i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
