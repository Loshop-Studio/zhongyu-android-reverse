package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final float estimatedLazyMaxScrollOffset(int i10, int i11, boolean z10) {
        return z10 ? estimatedLazyScrollOffset(i10, i11) + 100 : estimatedLazyScrollOffset(i10, i11);
    }

    public static final float estimatedLazyScrollOffset(int i10, int i11) {
        return i11 + (i10 * 500);
    }

    @Composable
    public static final Modifier lazyLayoutSemantics(Modifier modifier, InterfaceC9529a interfaceC9529a, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier modifierThen = modifier.then(new LazyLayoutSemanticsModifier(interfaceC9529a, lazyLayoutSemanticState, orientation, z10, z11));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }
}
