package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = C3156Dp.m26899constructorimpl(30);

    @Stable
    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        return modifier.then(orientation == Orientation.Vertical ? ClipKt.clip(Modifier.Companion, VerticalScrollableClipShape.INSTANCE) : ClipKt.clip(Modifier.Companion, HorizontalScrollableClipShape.INSTANCE));
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
