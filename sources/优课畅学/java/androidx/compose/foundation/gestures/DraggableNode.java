package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineStart;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    private InterfaceC10575q onDragStarted;
    private InterfaceC10575q onDragStopped;
    private Orientation orientation;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private DraggableState state;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", m17801f = "Draggable.kt", m17802l = {300}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$drag$2 */
    public static final class C12842 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12842(InterfaceC10574p interfaceC10574p, DraggableNode draggableNode, InterfaceC9324c<? super C12842> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$forEachDelta = interfaceC10574p;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12842 c12842 = new C12842(this.$forEachDelta, this.this$0, interfaceC9324c);
            c12842.L$0 = obj;
            return c12842;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(DragScope dragScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12842) create(dragScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$forEachDelta;
                final DraggableNode draggableNode = this.this$0;
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        dragScope.dragBy(DraggableKt.m20582toFloat3MmeM6k(draggableNode.m20589reverseIfNeededMKHz9U(dragDelta.m20535getDeltaF1C5BW0()), draggableNode.orientation));
                    }
                };
                this.label = 1;
                if (interfaceC10574p.invoke(interfaceC10570l, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public DraggableNode(DraggableState draggableState, InterfaceC10570l interfaceC10570l, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, boolean z12) {
        super(interfaceC10570l, z10, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.orientation = orientation;
        this.startDragImmediately = z11;
        this.onDragStarted = interfaceC10575q;
        this.onDragStopped = interfaceC10575q2;
        this.reverseDirection = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m20588reverseIfNeededAH228Gc(long j10) {
        return Velocity.m27143timesadjELrA(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m20589reverseIfNeededMKHz9U(long j10) {
        return Offset.m24042timestuRUvjQ(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C12842(interfaceC10574p, this, null), interfaceC9324c);
        return objDrag == AbstractC9434a.m17291f() ? objDrag : C8736p.f16368a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo20515onDragStartedk4lQ0M(long j10) {
        if (!isAttached() || AbstractC9133u.m16128b(this.onDragStarted, DraggableKt.NoOpOnDragStarted)) {
            return;
        }
        AbstractC8839h.m14861d(getCoroutineScope(), null, CoroutineStart.f17555d, new DraggableNode$onDragStarted$1(this, j10, null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo20516onDragStoppedTH1AsA0(long j10) {
        if (!isAttached() || AbstractC9133u.m16128b(this.onDragStopped, DraggableKt.NoOpOnDragStopped)) {
            return;
        }
        AbstractC8839h.m14861d(getCoroutineScope(), null, CoroutineStart.f17555d, new DraggableNode$onDragStopped$1(this, j10, null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(DraggableState draggableState, InterfaceC10570l interfaceC10570l, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (AbstractC9133u.m16128b(this.state, draggableState)) {
            z13 = false;
        } else {
            this.state = draggableState;
            z13 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z13 = true;
        }
        if (this.reverseDirection != z12) {
            this.reverseDirection = z12;
        } else {
            z14 = z13;
        }
        this.onDragStarted = interfaceC10575q;
        this.onDragStopped = interfaceC10575q2;
        this.startDragImmediately = z11;
        update(interfaceC10570l, z10, mutableInteractionSource, orientation, z14);
    }
}
