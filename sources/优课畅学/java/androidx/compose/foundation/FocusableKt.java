package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class FocusableKt {
    @Stable
    public static final Modifier focusGroup(Modifier modifier) {
        return modifier.then(FocusGroupElement.INSTANCE);
    }

    @Stable
    public static final Modifier focusable(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(z10 ? new FocusableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z10, mutableInteractionSource);
    }
}
