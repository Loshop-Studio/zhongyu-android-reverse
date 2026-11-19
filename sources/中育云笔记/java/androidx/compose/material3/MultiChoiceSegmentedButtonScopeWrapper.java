package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class MultiChoiceSegmentedButtonScopeWrapper implements MultiChoiceSegmentedButtonRowScope, RowScope {
    private final /* synthetic */ RowScope $$delegate_0;

    public MultiChoiceSegmentedButtonScopeWrapper(RowScope rowScope) {
        this.$$delegate_0 = rowScope;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
