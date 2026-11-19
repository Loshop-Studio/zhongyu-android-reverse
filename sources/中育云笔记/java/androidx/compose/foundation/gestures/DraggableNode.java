package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    private InterfaceC9545q onDragStarted;
    private InterfaceC9545q onDragStopped;
    private Orientation orientation;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private DraggableState state;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", m26211f = "Draggable.kt", m26212l = {300}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$drag$2 */
    public static final class C13142 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13142(InterfaceC9544p interfaceC9544p, DraggableNode draggableNode, InterfaceC11588c<? super C13142> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$forEachDelta = interfaceC9544p;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13142 c13142 = new C13142(this.$forEachDelta, this.this$0, interfaceC11588c);
            c13142.L$0 = obj;
            return c13142;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(DragScope dragScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13142) create(dragScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                InterfaceC9544p interfaceC9544p = this.$forEachDelta;
                final DraggableNode draggableNode = this.this$0;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        dragScope.dragBy(DraggableKt.m27184toFloat3MmeM6k(draggableNode.m27191reverseIfNeededMKHz9U(dragDelta.m27137getDeltaF1C5BW0()), draggableNode.orientation));
                    }
                };
                this.label = 1;
                if (interfaceC9544p.invoke(interfaceC9540l, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    public DraggableNode(DraggableState draggableState, InterfaceC9540l interfaceC9540l, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, boolean z12) {
        super(interfaceC9540l, z10, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.orientation = orientation;
        this.startDragImmediately = z11;
        this.onDragStarted = interfaceC9545q;
        this.onDragStopped = interfaceC9545q2;
        this.reverseDirection = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m27190reverseIfNeededAH228Gc(long j10) {
        return Velocity.m33745timesadjELrA(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m27191reverseIfNeededMKHz9U(long j10) {
        return Offset.m30644timestuRUvjQ(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C13142(interfaceC9544p, this, null), interfaceC11588c);
        return objDrag == AbstractC11725a.m25952f() ? objDrag : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo27117onDragStartedk4lQ0M(long j10) {
        if (!isAttached() || AbstractC9979u.m20289b(this.onDragStarted, DraggableKt.NoOpOnDragStarted)) {
            return;
        }
        AbstractC11117h.m24726d(getCoroutineScope(), null, CoroutineStart.f23479f, new DraggableNode$onDragStarted$1(this, j10, null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo27118onDragStoppedTH1AsA0(long j10) {
        if (!isAttached() || AbstractC9979u.m20289b(this.onDragStopped, DraggableKt.NoOpOnDragStopped)) {
            return;
        }
        AbstractC11117h.m24726d(getCoroutineScope(), null, CoroutineStart.f23479f, new DraggableNode$onDragStopped$1(this, j10, null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(DraggableState draggableState, InterfaceC9540l interfaceC9540l, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (AbstractC9979u.m20289b(this.state, draggableState)) {
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
        this.onDragStarted = interfaceC9545q;
        this.onDragStopped = interfaceC9545q2;
        this.startDragImmediately = z11;
        update(interfaceC9540l, z10, mutableInteractionSource, orientation, z14);
    }
}
