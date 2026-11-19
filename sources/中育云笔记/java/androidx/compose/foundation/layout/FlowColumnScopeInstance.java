package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final int $stable = 0;
    public static final FlowColumnScopeInstance INSTANCE = new FlowColumnScopeInstance();
    private final /* synthetic */ ColumnScopeInstance $$delegate_0 = ColumnScopeInstance.INSTANCE;

    private FlowColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier modifier, float f10) {
        if (!(f10 >= 0.0f && f10 <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
