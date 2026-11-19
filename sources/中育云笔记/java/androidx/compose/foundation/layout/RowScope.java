package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface RowScope {

    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(RowScope rowScope, Modifier modifier, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return rowScope.weight(modifier, f10, z10);
    }

    @Stable
    Modifier align(Modifier modifier, Alignment.Vertical vertical);

    @Stable
    Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine);

    @Stable
    Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l);

    @Stable
    Modifier alignByBaseline(Modifier modifier);

    @Stable
    Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10);
}
