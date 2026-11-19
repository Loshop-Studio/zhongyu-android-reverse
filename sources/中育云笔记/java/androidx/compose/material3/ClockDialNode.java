package androidx.compose.material3;

import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import sd.AbstractC11117h;

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

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(analogTimePickerState, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxDist() {
        return DelegatableNodeKt.requireDensity(this).mo27099toPx0680j_4(TimePickerKt.MaxDistance);
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputTapNode.onCancelPointerInput();
        this.pointerInputDragNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.pointerInputTapNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        this.pointerInputDragNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        this.center = IntSizeKt.m33678getCenterozmzZPI(j10);
    }

    /* renamed from: updateNode-e8ubxrI, reason: not valid java name */
    public final void m28464updateNodee8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        if (TimePickerSelectionMode.m29358equalsimpl0(this.selection, i10)) {
            return;
        }
        this.selection = i10;
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new ClockDialNode$updateNode$1(analogTimePickerState, null), 3, null);
    }

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        this.selection = i10;
        this.center = IntOffset.Companion.m33640getZeronOccac();
        this.pointerInputTapNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputTapNode$1(this, null)));
        this.pointerInputDragNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputDragNode$1(this, null)));
    }
}
