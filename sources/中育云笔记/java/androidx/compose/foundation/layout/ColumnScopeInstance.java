package androidx.compose.foundation.layout;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final int $stable = 0;
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(verticalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, float f10, boolean z10) {
        if (!(((double) f10) > AudioStats.AUDIO_AMPLITUDE_NONE)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(AbstractC10410o.m21755h(f10, Float.MAX_VALUE), z10));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new WithAlignmentLineBlockElement(interfaceC9540l));
    }
}
