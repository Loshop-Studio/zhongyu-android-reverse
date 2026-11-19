package androidx.compose.foundation.draganddrop;

import androidx.compose.p009ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p009ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.p009ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.p009ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p009ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p009ui.input.pointer.PointerInputScope;
import androidx.compose.p009ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p009ui.layout.LayoutCoordinates;
import androidx.compose.p009ui.node.DelegatingNode;
import androidx.compose.p009ui.node.LayoutAwareModifierNode;
import androidx.compose.p009ui.node.PointerInputModifierNode;
import androidx.compose.p009ui.platform.ViewConfiguration;
import androidx.compose.p009ui.unit.DpRect;
import androidx.compose.p009ui.unit.IntSize;
import androidx.compose.p009ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\u0007\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004¢\u0006\u0002\u0010\u0010J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*R=\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m7880d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "drawDragDecoration", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "detectDragStart", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "transferData", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getDetectDragStart", "()Lkotlin/jvm/functions/Function2;", "setDetectDragStart", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "dragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "getDrawDragDecoration", "()Lkotlin/jvm/functions/Function1;", "setDrawDragDecoration", "(Lkotlin/jvm/functions/Function1;)V", "inputModifierNode", "Landroidx/compose/ui/node/PointerInputModifierNode;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "getTransferData", "setTransferData", "onAttach", "onDetach", "onPlaced", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onRemeasured", "onRemeasured-ozmzZPI", "(J)V", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nDragAndDropSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropSource.kt\nandroidx/compose/foundation/draganddrop/DragAndDropSourceNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> detectDragStart;
    private Function1<? super DrawScope, Unit> drawDragDecoration;
    private PointerInputModifierNode inputModifierNode;
    private Function1<? super Offset, DragAndDropTransferData> transferData;
    private long size = IntSize.INSTANCE.m16660getZeroYbymL2g();
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new Function2<DragAndDropStartTransferScope, Offset, Unit>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
            m10244invokeUv8p0NA(dragAndDropStartTransferScope, offset.m13668unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m10244invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j6) {
            DragAndDropTransferData dragAndDropTransferDataInvoke = this.this$0.getTransferData().invoke(Offset.m13647boximpl(j6));
            if (dragAndDropTransferDataInvoke != null) {
                dragAndDropStartTransferScope.mo13495startDragAndDropTransfer12SF9DM(dragAndDropTransferDataInvoke, IntSizeKt.m16667toSizeozmzZPI(this.this$0.size), this.this$0.getDrawDragDecoration());
            }
        }
    }));

    public DragAndDropSourceNode(Function1<? super DrawScope, Unit> function1, Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Offset, DragAndDropTransferData> function12) {
        this.drawDragDecoration = function1;
        this.detectDragStart = function2;
        this.transferData = function12;
    }

    public final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    public final Function1<DrawScope, Unit> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final Function1<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            this.inputModifierNode = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode.onAttach.1

                @Metadata(m7879d1 = {"\u0000\u0085\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J=\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2'\u0010\u001d\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001e¢\u0006\u0002\b\"H\u0096A¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020+*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010*\u001a\u00020+*\u00020/H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020,*\u00020/H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001a\u00102\u001a\u00020,*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00102\u001a\u00020,*\u00020+H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00107J\u0017\u00108\u001a\u000209*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u0004*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b=\u00106J\u0017\u0010<\u001a\u00020\u0004*\u00020/H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b>\u00104J\r\u0010?\u001a\u00020@*\u00020AH\u0097\u0001J\u0017\u0010B\u001a\u00020\b*\u000209H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010;J\u0017\u0010D\u001a\u00020/*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001a\u0010D\u001a\u00020/*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010FJ\u001a\u0010D\u001a\u00020/*\u00020+H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0012\u0010\u0017\u001a\u00020\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m7880d2 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceNode$onAttach$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "density", "", "getDensity", "()F", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "fontScale", "getFontScale", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDragAndDropTransfer", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "requestDragAndDropTransfer-k-4lQ0M", "(J)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
                        this.$$delegate_0 = pointerInputScope;
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
                        return this.$$delegate_0.awaitPointerEventScope(function2, continuation);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo10245getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo10245getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.p009ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long getBoundsSize() {
                        return this.$$delegate_0.getBoundsSize();
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo10247requestDragAndDropTransferk4lQ0M(long offset) {
                        this.this$0.dragAndDropModifierNode.mo13498requestDragAndDropTransferk4lQ0M(offset);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo10248roundToPxR2X_6o(long j6) {
                        return this.$$delegate_0.mo10248roundToPxR2X_6o(j6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo10249roundToPx0680j_4(float f6) {
                        return this.$$delegate_0.mo10249roundToPx0680j_4(f6);
                    }

                    @Override // androidx.compose.p009ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z6) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z6);
                    }

                    @Override // androidx.compose.p009ui.unit.FontScaling
                    @Stable
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo10250toDpGaN1DYA(long j6) {
                        return this.$$delegate_0.mo10250toDpGaN1DYA(j6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo10251toDpu2uoSUM(float f6) {
                        return this.$$delegate_0.mo10251toDpu2uoSUM(f6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo10253toDpSizekrfVVM(long j6) {
                        return this.$$delegate_0.mo10253toDpSizekrfVVM(j6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo10254toPxR2X_6o(long j6) {
                        return this.$$delegate_0.mo10254toPxR2X_6o(j6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo10255toPx0680j_4(float f6) {
                        return this.$$delegate_0.mo10255toPx0680j_4(f6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo10256toSizeXkaWNTQ(long j6) {
                        return this.$$delegate_0.mo10256toSizeXkaWNTQ(j6);
                    }

                    @Override // androidx.compose.p009ui.unit.FontScaling
                    @Stable
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo10257toSp0xMU5do(float f6) {
                        return this.$$delegate_0.mo10257toSp0xMU5do(f6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo10258toSpkPz2Gy4(float f6) {
                        return this.$$delegate_0.mo10258toSpkPz2Gy4(f6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo10252toDpu2uoSUM(int i6) {
                        return this.$$delegate_0.mo10252toDpu2uoSUM(i6);
                    }

                    @Override // androidx.compose.p009ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo10259toSpkPz2Gy4(int i6) {
                        return this.$$delegate_0.mo10259toSpkPz2Gy4(i6);
                    }
                }

                @Override // androidx.compose.p009ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    Object objInvoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), continuation);
                    return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
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

    @Override // androidx.compose.p009ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        this.dragAndDropModifierNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.p009ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo10243onRemeasuredozmzZPI(long size) {
        this.size = size;
        this.dragAndDropModifierNode.mo10243onRemeasuredozmzZPI(size);
    }

    public final void setDetectDragStart(Function2<? super DragAndDropStartDetectorScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.detectDragStart = function2;
    }

    public final void setDrawDragDecoration(Function1<? super DrawScope, Unit> function1) {
        this.drawDragDecoration = function1;
    }

    public final void setTransferData(Function1<? super Offset, DragAndDropTransferData> function1) {
        this.transferData = function1;
    }
}
