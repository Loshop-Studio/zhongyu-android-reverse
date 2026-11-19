package androidx.compose.foundation.draganddrop;

import androidx.compose.p011ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p011ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.p011ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.p011ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u001c\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lh6/c;", "", "detectDragStart", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lr6/c;Lr6/e;Lr6/c;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Lr6/c;", "getDrawDragDecoration", "()Lr6/c;", "setDrawDragDecoration", "(Lr6/c;)V", "Lr6/e;", "getDetectDragStart", "()Lr6/e;", "setDetectDragStart", "(Lr6/e;)V", "getTransferData", "setTransferData", "J", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "dragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "inputModifierNode", "Landroidx/compose/ui/node/PointerInputModifierNode;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragAndDropSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropSource.kt\nandroidx/compose/foundation/draganddrop/DragAndDropSourceNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;

    @NotNull
    private InterfaceC6473e detectDragStart;

    @NotNull
    private InterfaceC6471c drawDragDecoration;

    @Nullable
    private PointerInputModifierNode inputModifierNode;

    @NotNull
    private InterfaceC6471c transferData;
    private long size = IntSize.INSTANCE.m13481getZeroYbymL2g();

    @NotNull
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new InterfaceC6473e() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m6892invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m10451unboximpl());
            return C5443s.f8405a;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m6892invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j7) {
            DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) this.this$0.getTransferData().invoke(Offset.m10430boximpl(j7));
            if (dragAndDropTransferData != null) {
                dragAndDropStartTransferScope.mo10270startDragAndDropTransfer12SF9DM(dragAndDropTransferData, IntSizeKt.m13488toSizeozmzZPI(this.this$0.size), this.this$0.getDrawDragDecoration());
            }
        }
    }));

    public DragAndDropSourceNode(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c2) {
        this.drawDragDecoration = interfaceC6471c;
        this.detectDragStart = interfaceC6473e;
        this.transferData = interfaceC6471c2;
    }

    @NotNull
    public final InterfaceC6473e getDetectDragStart() {
        return this.detectDragStart;
    }

    @NotNull
    public final InterfaceC6471c getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @NotNull
    public final InterfaceC6471c getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            this.inputModifierNode = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode.onAttach.1

                @Metadata(m5109d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0016\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u0017*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\u0017*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0014\u0010%\u001a\u00020$*\u00020#H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001b*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001eJ\u0017\u0010+\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u0011*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010*J\u001a\u0010+\u001a\u00020\u0011*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u00103\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b:\u00105R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020C8\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u00108R\u0014\u0010I\u001a\u00020F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, m5110d2 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceNode$onAttach$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "requestDragAndDropTransfer-k-4lQ0M", "(J)V", "requestDragAndDropTransfer", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
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
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
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
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long getBoundsSize() {
                        return this.$$delegate_0.getBoundsSize();
                    }

                    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo6895requestDragAndDropTransferk4lQ0M(long offset) {
                        this.this$0.dragAndDropModifierNode.mo10273requestDragAndDropTransferk4lQ0M(offset);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo6896roundToPxR2X_6o(long j7) {
                        return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo6897roundToPx0680j_4(float f) {
                        return this.$$delegate_0.mo6897roundToPx0680j_4(f);
                    }

                    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z8) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z8);
                    }

                    @Override // androidx.compose.p011ui.unit.FontScaling
                    @Stable
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo6898toDpGaN1DYA(long j7) {
                        return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo6899toDpu2uoSUM(float f) {
                        return this.$$delegate_0.mo6899toDpu2uoSUM(f);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo6901toDpSizekrfVVM(long j7) {
                        return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo6902toPxR2X_6o(long j7) {
                        return this.$$delegate_0.mo6902toPxR2X_6o(j7);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
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
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo6904toSizeXkaWNTQ(long j7) {
                        return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
                    }

                    @Override // androidx.compose.p011ui.unit.FontScaling
                    @Stable
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo6905toSp0xMU5do(float f) {
                        return this.$$delegate_0.mo6905toSp0xMU5do(f);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo6906toSpkPz2Gy4(float f) {
                        return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo6900toDpu2uoSUM(int i) {
                        return this.$$delegate_0.mo6900toDpu2uoSUM(i);
                    }

                    @Override // androidx.compose.p011ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo6907toSpkPz2Gy4(int i) {
                        return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
                    }
                }

                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    Object objInvoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), interfaceC5631c);
                    return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : C5443s.f8405a;
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

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        this.dragAndDropModifierNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo6891onRemeasuredozmzZPI(long size) {
        this.size = size;
        this.dragAndDropModifierNode.mo6891onRemeasuredozmzZPI(size);
    }

    public final void setDetectDragStart(@NotNull InterfaceC6473e interfaceC6473e) {
        this.detectDragStart = interfaceC6473e;
    }

    public final void setDrawDragDecoration(@NotNull InterfaceC6471c interfaceC6471c) {
        this.drawDragDecoration = interfaceC6471c;
    }

    public final void setTransferData(@NotNull InterfaceC6471c interfaceC6471c) {
        this.transferData = interfaceC6471c;
    }
}
