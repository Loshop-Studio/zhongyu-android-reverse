package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.runtime.Immutable;

@ExperimentalSharedTransitionApi
@Immutable
/* loaded from: classes.dex */
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final ContentScale contentScale;

    public ScaleToBoundsImpl(ContentScale contentScale, Alignment alignment) {
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }
}
