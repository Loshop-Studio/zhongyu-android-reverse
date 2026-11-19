package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p013ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.p013ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.p013ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private InterfaceC10574p detectDragStart;
    private InterfaceC10570l drawDragDecoration;
    private PointerInputModifierNode inputModifierNode;
    private InterfaceC10570l transferData;
    private long size = IntSize.Companion.m27075getZeroYbymL2g();
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new InterfaceC10574p() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m20486invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m24045unboximpl());
            return C8736p.f16368a;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m20486invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j10) {
            DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) this.this$0.getTransferData().invoke(Offset.m24024boximpl(j10));
            if (dragAndDropTransferData != null) {
                dragAndDropStartTransferScope.mo23864startDragAndDropTransfer12SF9DM(dragAndDropTransferData, IntSizeKt.m27082toSizeozmzZPI(this.this$0.size), this.this$0.getDrawDragDecoration());
            }
        }
    }));

    public DragAndDropSourceNode(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2) {
        this.drawDragDecoration = interfaceC10570l;
        this.detectDragStart = interfaceC10574p;
        this.transferData = interfaceC10570l2;
    }

    public final InterfaceC10574p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC10570l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final InterfaceC10570l getTransferData() {
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

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
                        return this.$$delegate_0.awaitPointerEventScope(interfaceC10574p, interfaceC9324c);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo20487getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo20487getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.p013ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long mo20488getSizeYbymL2g() {
                        return this.$$delegate_0.mo20488getSizeYbymL2g();
                    }

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo20489requestDragAndDropTransferk4lQ0M(long j10) {
                        this.this$0.dragAndDropModifierNode.mo23867requestDragAndDropTransferk4lQ0M(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo20490roundToPxR2X_6o(long j10) {
                        return this.$$delegate_0.mo20490roundToPxR2X_6o(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo20491roundToPx0680j_4(float f10) {
                        return this.$$delegate_0.mo20491roundToPx0680j_4(f10);
                    }

                    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z10);
                    }

                    @Override // androidx.compose.p013ui.unit.FontScaling
                    @Stable
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo20492toDpGaN1DYA(long j10) {
                        return this.$$delegate_0.mo20492toDpGaN1DYA(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo20493toDpu2uoSUM(float f10) {
                        return this.$$delegate_0.mo20493toDpu2uoSUM(f10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo20495toDpSizekrfVVM(long j10) {
                        return this.$$delegate_0.mo20495toDpSizekrfVVM(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo20496toPxR2X_6o(long j10) {
                        return this.$$delegate_0.mo20496toPxR2X_6o(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo20497toPx0680j_4(float f10) {
                        return this.$$delegate_0.mo20497toPx0680j_4(f10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo20498toSizeXkaWNTQ(long j10) {
                        return this.$$delegate_0.mo20498toSizeXkaWNTQ(j10);
                    }

                    @Override // androidx.compose.p013ui.unit.FontScaling
                    @Stable
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo20499toSp0xMU5do(float f10) {
                        return this.$$delegate_0.mo20499toSp0xMU5do(f10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo20500toSpkPz2Gy4(float f10) {
                        return this.$$delegate_0.mo20500toSpkPz2Gy4(f10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo20494toDpu2uoSUM(int i10) {
                        return this.$$delegate_0.mo20494toDpu2uoSUM(i10);
                    }

                    @Override // androidx.compose.p013ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo20501toSpkPz2Gy4(int i10) {
                        return this.$$delegate_0.mo20501toSpkPz2Gy4(i10);
                    }
                }

                @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    Object objInvoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), interfaceC9324c);
                    return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
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

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropModifierNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo20485onRemeasuredozmzZPI(long j10) {
        this.size = j10;
        this.dragAndDropModifierNode.mo20485onRemeasuredozmzZPI(j10);
    }

    public final void setDetectDragStart(InterfaceC10574p interfaceC10574p) {
        this.detectDragStart = interfaceC10574p;
    }

    public final void setDrawDragDecoration(InterfaceC10570l interfaceC10570l) {
        this.drawDragDecoration = interfaceC10570l;
    }

    public final void setTransferData(InterfaceC10570l interfaceC10570l) {
        this.transferData = interfaceC10570l;
    }
}
