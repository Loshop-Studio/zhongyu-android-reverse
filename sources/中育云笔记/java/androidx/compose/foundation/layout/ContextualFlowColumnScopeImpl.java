package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextualFlowColumnScopeImpl implements ColumnScope, ContextualFlowColumnScope {
    public static final int $stable = 0;
    private final /* synthetic */ ColumnScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeightInLine;
    private final float maxWidth;

    public /* synthetic */ ContextualFlowColumnScopeImpl(int i10, int i11, float f10, float f11, AbstractC9972n abstractC9972n) {
        this(i10, i11, f10, f11);
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

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier modifier, float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxHeightInLine-D9Ej5fM */
    public float mo27373getMaxHeightInLineD9Ej5fM() {
        return this.maxHeightInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo27374getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier weight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, boolean z10) {
        return this.$$delegate_0.weight(modifier, f10, z10);
    }

    private ContextualFlowColumnScopeImpl(int i10, int i11, float f10, float f11) {
        this.lineIndex = i10;
        this.indexInLine = i11;
        this.maxWidth = f10;
        this.maxHeightInLine = f11;
        this.$$delegate_0 = ColumnScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    public Modifier alignBy(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return this.$$delegate_0.alignBy(modifier, interfaceC9540l);
    }
}
