package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class HoverableKt {
    @Stable
    public static final Modifier hoverable(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10) {
        return modifier.then(z10 ? new HoverableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z10);
    }
}
