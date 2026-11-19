package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p014ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.p014ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.p014ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private InterfaceC9544p detectDragStart;
    private InterfaceC9540l drawDragDecoration;
    private PointerInputModifierNode inputModifierNode;
    private InterfaceC9540l transferData;
    private long size = IntSize.Companion.m33677getZeroYbymL2g();
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new InterfaceC9544p() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m27088invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m30647unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m27088invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j10) {
            DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) this.this$0.getTransferData().invoke(Offset.m30626boximpl(j10));
            if (dragAndDropTransferData != null) {
                dragAndDropStartTransferScope.mo30466startDragAndDropTransfer12SF9DM(dragAndDropTransferData, IntSizeKt.m33684toSizeozmzZPI(this.this$0.size), this.this$0.getDrawDragDecoration());
            }
        }
    }));

    public DragAndDropSourceNode(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2) {
        this.drawDragDecoration = interfaceC9540l;
        this.detectDragStart = interfaceC9544p;
        this.transferData = interfaceC9540l2;
    }

    public final InterfaceC9544p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC9540l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final InterfaceC9540l getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            this.inputModifierNode = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode.onAttach.1

                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
                        this.$$delegate_0 = pointerInputScope;
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
                        return this.$$delegate_0.awaitPointerEventScope(interfaceC9544p, interfaceC11588c);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo27089getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo27089getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.p014ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long mo27090getSizeYbymL2g() {
                        return this.$$delegate_0.mo27090getSizeYbymL2g();
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo27091requestDragAndDropTransferk4lQ0M(long j10) {
                        this.this$0.dragAndDropModifierNode.mo30469requestDragAndDropTransferk4lQ0M(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo27092roundToPxR2X_6o(long j10) {
                        return this.$$delegate_0.mo27092roundToPxR2X_6o(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo27093roundToPx0680j_4(float f10) {
                        return this.$$delegate_0.mo27093roundToPx0680j_4(f10);
                    }

                    @Override // androidx.compose.p014ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z10);
                    }

                    @Override // androidx.compose.p014ui.unit.FontScaling
                    @Stable
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo27094toDpGaN1DYA(long j10) {
                        return this.$$delegate_0.mo27094toDpGaN1DYA(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo27095toDpu2uoSUM(float f10) {
                        return this.$$delegate_0.mo27095toDpu2uoSUM(f10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo27097toDpSizekrfVVM(long j10) {
                        return this.$$delegate_0.mo27097toDpSizekrfVVM(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo27098toPxR2X_6o(long j10) {
                        return this.$$delegate_0.mo27098toPxR2X_6o(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo27099toPx0680j_4(float f10) {
                        return this.$$delegate_0.mo27099toPx0680j_4(f10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo27100toSizeXkaWNTQ(long j10) {
                        return this.$$delegate_0.mo27100toSizeXkaWNTQ(j10);
                    }

                    @Override // androidx.compose.p014ui.unit.FontScaling
                    @Stable
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo27101toSp0xMU5do(float f10) {
                        return this.$$delegate_0.mo27101toSp0xMU5do(f10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo27102toSpkPz2Gy4(float f10) {
                        return this.$$delegate_0.mo27102toSpkPz2Gy4(f10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo27096toDpu2uoSUM(int i10) {
                        return this.$$delegate_0.mo27096toDpu2uoSUM(i10);
                    }

                    @Override // androidx.compose.p014ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo27103toSpkPz2Gy4(int i10) {
                        return this.$$delegate_0.mo27103toSpkPz2Gy4(i10);
                    }
                }

                @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    Object objInvoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), interfaceC11588c);
                    return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
                }
            }));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PointerInputModifierNode pointerInputModifierNode = this.inputModifierNode;
        if (pointerInputModifierNode != null) {
            undelegate(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropModifierNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        this.size = j10;
        this.dragAndDropModifierNode.mo27087onRemeasuredozmzZPI(j10);
    }

    public final void setDetectDragStart(InterfaceC9544p interfaceC9544p) {
        this.detectDragStart = interfaceC9544p;
    }

    public final void setDrawDragDecoration(InterfaceC9540l interfaceC9540l) {
        this.drawDragDecoration = interfaceC9540l;
    }

    public final void setTransferData(InterfaceC9540l interfaceC9540l) {
        this.transferData = interfaceC9540l;
    }
}
