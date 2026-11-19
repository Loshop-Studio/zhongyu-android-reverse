package androidx.compose.foundation.layout;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RowScopeInstance implements RowScope {
    public static final int $stable = 0;
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(horizontalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        return alignBy(modifier, androidx.compose.p014ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, float f10, boolean z10) {
        if (!(((double) f10) > AudioStats.AUDIO_AMPLITUDE_NONE)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(AbstractC10410o.m21755h(f10, Float.MAX_VALUE), z10));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new WithAlignmentLineBlockElement(interfaceC9540l));
    }
}
