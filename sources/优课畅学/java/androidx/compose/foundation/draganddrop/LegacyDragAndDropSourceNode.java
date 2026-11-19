package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.p013ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p013ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
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
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private InterfaceC10574p dragAndDropSourceHandler;
    private InterfaceC10570l drawDragDecoration;
    private long size = IntSize.Companion.m27075getZeroYbymL2g();

    public LegacyDragAndDropSourceNode(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        this.drawDragDecoration = interfaceC10570l;
        this.dragAndDropSourceHandler = interfaceC10574p;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode());
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements DragAndDropSourceScope, PointerInputScope {
                private final /* synthetic */ PointerInputScope $$delegate_0;
                final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
                final /* synthetic */ LegacyDragAndDropSourceNode this$0;

                public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.$dragAndDropModifierNode = dragAndDropModifierNode;
                    this.this$0 = legacyDragAndDropSourceNode;
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
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
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
                /* renamed from: getSize-YbymL2g */
                public long mo20488getSizeYbymL2g() {
                    return this.$$delegate_0.mo20488getSizeYbymL2g();
                }

                @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.$$delegate_0.getViewConfiguration();
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: roundToPx--R2X_6o */
                public int mo20490roundToPxR2X_6o(long j10) {
                    return this.$$delegate_0.mo20490roundToPxR2X_6o(j10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: roundToPx-0680j_4 */
                public int mo20491roundToPx0680j_4(float f10) {
                    return this.$$delegate_0.mo20491roundToPx0680j_4(f10);
                }

                @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
                public void setInterceptOutOfBoundsChildEvents(boolean z10) {
                    this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z10);
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public void startTransfer(DragAndDropTransferData dragAndDropTransferData) {
                    this.$dragAndDropModifierNode.mo23865drag12SF9DM(dragAndDropTransferData, IntSizeKt.m27082toSizeozmzZPI(mo20488getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
                }

                @Override // androidx.compose.p013ui.unit.FontScaling
                @Stable
                /* renamed from: toDp-GaN1DYA */
                public float mo20492toDpGaN1DYA(long j10) {
                    return this.$$delegate_0.mo20492toDpGaN1DYA(j10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo20493toDpu2uoSUM(float f10) {
                    return this.$$delegate_0.mo20493toDpu2uoSUM(f10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toDpSize-k-rfVVM */
                public long mo20495toDpSizekrfVVM(long j10) {
                    return this.$$delegate_0.mo20495toDpSizekrfVVM(j10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toPx--R2X_6o */
                public float mo20496toPxR2X_6o(long j10) {
                    return this.$$delegate_0.mo20496toPxR2X_6o(j10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toPx-0680j_4 */
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
                /* renamed from: toSize-XkaWNTQ */
                public long mo20498toSizeXkaWNTQ(long j10) {
                    return this.$$delegate_0.mo20498toSizeXkaWNTQ(j10);
                }

                @Override // androidx.compose.p013ui.unit.FontScaling
                @Stable
                /* renamed from: toSp-0xMU5do */
                public long mo20499toSp0xMU5do(float f10) {
                    return this.$$delegate_0.mo20499toSp0xMU5do(f10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo20500toSpkPz2Gy4(float f10) {
                    return this.$$delegate_0.mo20500toSpkPz2Gy4(f10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo20494toDpu2uoSUM(int i10) {
                    return this.$$delegate_0.mo20494toDpu2uoSUM(i10);
                }

                @Override // androidx.compose.p013ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo20501toSpkPz2Gy4(int i10) {
                    return this.$$delegate_0.mo20501toSpkPz2Gy4(i10);
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                Object objInvoke = LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new AnonymousClass1(pointerInputScope, dragAndDropModifierNode, LegacyDragAndDropSourceNode.this), interfaceC9324c);
                return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
            }
        }));
    }

    public final InterfaceC10574p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final InterfaceC10570l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo20485onRemeasuredozmzZPI(long j10) {
        this.size = j10;
    }

    public final void setDragAndDropSourceHandler(InterfaceC10574p interfaceC10574p) {
        this.dragAndDropSourceHandler = interfaceC10574p;
    }

    public final void setDrawDragDecoration(InterfaceC10570l interfaceC10570l) {
        this.drawDragDecoration = interfaceC10570l;
    }
}
