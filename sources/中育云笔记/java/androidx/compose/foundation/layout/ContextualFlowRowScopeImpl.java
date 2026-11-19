package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.HorizontalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextualFlowRowScopeImpl implements RowScope, ContextualFlowRowScope {
    public static final int $stable = 0;
    private final /* synthetic */ RowScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeight;
    private final float maxWidthInLine;

    public /* synthetic */ ContextualFlowRowScopeImpl(int i10, int i11, float f10, float f11, AbstractC9972n abstractC9972n) {
        this(i10, i11, f10, f11);
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

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public Modifier fillMaxRowHeight(Modifier modifier, float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo27376getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* renamed from: getMaxWidthInLine-D9Ej5fM */
    public float mo27377getMaxWidthInLineD9Ej5fM() {
        return this.maxWidthInLine;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    private ContextualFlowRowScopeImpl(int i10, int i11, float f10, float f11) {
        this.lineIndex = i10;
        this.indexInLine = i11;
        this.maxWidthInLine = f10;
        this.maxHeight = f11;
        this.$$delegate_0 = RowScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
