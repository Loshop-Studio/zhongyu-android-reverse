package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(InterfaceC9540l interfaceC9540l) {
        return new DefaultScrollableState(interfaceC9540l);
    }

    @Composable
    public static final ScrollableState rememberScrollableState(InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9540l, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = ScrollableState(new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Float invoke(float f10) {
                    return (Float) stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10));
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollableState scrollableState = (ScrollableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollableState;
    }
}
