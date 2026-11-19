package androidx.compose.material3;

import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p135i8.AbstractC8839h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean autoSwitchToMinute;
    private long center;
    private float offsetX;
    private float offsetY;
    private final SuspendingPointerInputModifierNode pointerInputDragNode;
    private final SuspendingPointerInputModifierNode pointerInputTapNode;
    private int selection;
    private AnalogTimePickerState state;

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(analogTimePickerState, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxDist() {
        return DelegatableNodeKt.requireDensity(this).mo20497toPx0680j_4(TimePickerKt.MaxDistance);
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputTapNode.onCancelPointerInput();
        this.pointerInputDragNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.pointerInputTapNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        this.pointerInputDragNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo20485onRemeasuredozmzZPI(long j10) {
        this.center = IntSizeKt.m27076getCenterozmzZPI(j10);
    }

    /* renamed from: updateNode-e8ubxrI, reason: not valid java name */
    public final void m21862updateNodee8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        if (TimePickerSelectionMode.m22756equalsimpl0(this.selection, i10)) {
            return;
        }
        this.selection = i10;
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new ClockDialNode$updateNode$1(analogTimePickerState, null), 3, null);
    }

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        this.selection = i10;
        this.center = IntOffset.Companion.m27038getZeronOccac();
        this.pointerInputTapNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputTapNode$1(this, null)));
        this.pointerInputDragNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputDragNode$1(this, null)));
    }
}
