package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface BoxScope {
    @Stable
    Modifier align(Modifier modifier, Alignment alignment);

    @Stable
    Modifier matchParentSize(Modifier modifier);
}
