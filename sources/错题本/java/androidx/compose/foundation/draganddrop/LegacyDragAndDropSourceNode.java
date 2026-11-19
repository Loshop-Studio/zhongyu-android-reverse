package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p011ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.p011ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p011ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lh6/c;", "", "dragAndDropSourceHandler", "<init>", "(Lr6/c;Lr6/e;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Lr6/c;", "getDrawDragDecoration", "()Lr6/c;", "setDrawDragDecoration", "(Lr6/c;)V", "Lr6/e;", "getDragAndDropSourceHandler", "()Lr6/e;", "setDragAndDropSourceHandler", "(Lr6/e;)V", "J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;

    @NotNull
    private InterfaceC6473e dragAndDropSourceHandler;

    @NotNull
    private InterfaceC6471c drawDragDecoration;
    private long size = IntSize.INSTANCE.m13481getZeroYbymL2g();

    public LegacyDragAndDropSourceNode(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e) {
        this.drawDragDecoration = interfaceC6471c;
        this.dragAndDropSourceHandler = interfaceC6473e;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode());
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            @Metadata(m5109d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0016\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u0017*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\u0017*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0014\u0010%\u001a\u00020$*\u00020#H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001b*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001eJ\u0017\u0010+\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u0011*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010*J\u001a\u0010+\u001a\u00020\u0011*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u00104R$\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020;8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020B8\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bC\u00107R\u0014\u0010H\u001a\u00020E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m5110d2 = {"androidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Ld6/s;", "startTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;)V", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                public <R> Object awaitPointerEventScope(InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super R> interfaceC5631c) {
                    return this.$$delegate_0.awaitPointerEventScope(interfaceC6473e, interfaceC5631c);
                }

                @Override // androidx.compose.p011ui.unit.Density
                public float getDensity() {
                    return this.$$delegate_0.getDensity();
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
                public long mo6893getExtendedTouchPaddingNHjbRc() {
                    return this.$$delegate_0.mo6893getExtendedTouchPaddingNHjbRc();
                }

                @Override // androidx.compose.p011ui.unit.FontScaling
                public float getFontScale() {
                    return this.$$delegate_0.getFontScale();
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                public boolean getInterceptOutOfBoundsChildEvents() {
                    return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                /* renamed from: getSize-YbymL2g */
                public long getBoundsSize() {
                    return this.$$delegate_0.getBoundsSize();
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.$$delegate_0.getViewConfiguration();
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: roundToPx--R2X_6o */
                public int mo6896roundToPxR2X_6o(long j7) {
                    return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: roundToPx-0680j_4 */
                public int mo6897roundToPx0680j_4(float f) {
                    return this.$$delegate_0.mo6897roundToPx0680j_4(f);
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                public void setInterceptOutOfBoundsChildEvents(boolean z8) {
                    this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z8);
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public void startTransfer(DragAndDropTransferData transferData) {
                    this.$dragAndDropModifierNode.mo10271drag12SF9DM(transferData, IntSizeKt.m13488toSizeozmzZPI(getBoundsSize()), this.this$0.getDrawDragDecoration());
                }

                @Override // androidx.compose.p011ui.unit.FontScaling
                @Stable
                /* renamed from: toDp-GaN1DYA */
                public float mo6898toDpGaN1DYA(long j7) {
                    return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo6899toDpu2uoSUM(float f) {
                    return this.$$delegate_0.mo6899toDpu2uoSUM(f);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toDpSize-k-rfVVM */
                public long mo6901toDpSizekrfVVM(long j7) {
                    return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toPx--R2X_6o */
                public float mo6902toPxR2X_6o(long j7) {
                    return this.$$delegate_0.mo6902toPxR2X_6o(j7);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toPx-0680j_4 */
                public float mo6903toPx0680j_4(float f) {
                    return this.$$delegate_0.mo6903toPx0680j_4(f);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                public Rect toRect(DpRect dpRect) {
                    return this.$$delegate_0.toRect(dpRect);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toSize-XkaWNTQ */
                public long mo6904toSizeXkaWNTQ(long j7) {
                    return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
                }

                @Override // androidx.compose.p011ui.unit.FontScaling
                @Stable
                /* renamed from: toSp-0xMU5do */
                public long mo6905toSp0xMU5do(float f) {
                    return this.$$delegate_0.mo6905toSp0xMU5do(f);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo6906toSpkPz2Gy4(float f) {
                    return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo6900toDpu2uoSUM(int i) {
                    return this.$$delegate_0.mo6900toDpu2uoSUM(i);
                }

                @Override // androidx.compose.p011ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo6907toSpkPz2Gy4(int i) {
                    return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objInvoke = LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new AnonymousClass1(pointerInputScope, dragAndDropModifierNode, LegacyDragAndDropSourceNode.this), interfaceC5631c);
                return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : C5443s.f8405a;
            }
        }));
    }

    @NotNull
    public final InterfaceC6473e getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @NotNull
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo6891onRemeasuredozmzZPI(long size) {
        this.size = size;
    }

    public final void setDragAndDropSourceHandler(@NotNull InterfaceC6473e interfaceC6473e) {
        this.dragAndDropSourceHandler = interfaceC6473e;
    }

    public final void setDrawDragDecoration(@NotNull InterfaceC6471c interfaceC6471c) {
        this.drawDragDecoration = interfaceC6471c;
    }
}
