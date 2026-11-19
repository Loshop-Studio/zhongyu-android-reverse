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
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private InterfaceC9540l onDragStarted;
    private InterfaceC9540l onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", m26211f = "Draggable2D.kt", m26212l = {257}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2 */
    public static final class C13132 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13132(InterfaceC9544p interfaceC9544p, Draggable2DNode draggable2DNode, InterfaceC11588c<? super C13132> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$forEachDelta = interfaceC9544p;
            this.this$0 = draggable2DNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13132 c13132 = new C13132(this.$forEachDelta, this.this$0, interfaceC11588c);
            c13132.L$0 = obj;
            return c13132;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Drag2DScope drag2DScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13132) create(drag2DScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                InterfaceC9544p interfaceC9544p = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.Draggable2DNode.drag.2.1
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
                        Drag2DScope drag2DScope2 = drag2DScope;
                        Draggable2DNode draggable2DNode2 = draggable2DNode;
                        long jM27137getDeltaF1C5BW0 = dragDelta.m27137getDeltaF1C5BW0();
                        if (draggable2DNode2.reverseDirection) {
                            jM27137getDeltaF1C5BW0 = Offset.m30629constructorimpl(jM27137getDeltaF1C5BW0 ^ (-9223372034707292160L));
                        }
                        drag2DScope2.mo27135dragByk4lQ0M(jM27137getDeltaF1C5BW0);
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

    public Draggable2DNode(Draggable2DState draggable2DState, InterfaceC9540l interfaceC9540l, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, boolean z12, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3) {
        super(interfaceC9540l, z10, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z11;
        this.reverseDirection = z12;
        this.onDragStarted = interfaceC9540l2;
        this.onDragStopped = interfaceC9540l3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m27180reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m30629constructorimpl(j10 ^ (-9223372034707292160L)) : j10;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C13132(interfaceC9544p, this, null), interfaceC11588c);
        return objDrag == AbstractC11725a.m25952f() ? objDrag : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo27117onDragStartedk4lQ0M(long j10) {
        this.onDragStarted.invoke(Offset.m30626boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo27118onDragStoppedTH1AsA0(long j10) {
        this.onDragStopped.invoke(Velocity.m33730boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(Draggable2DState draggable2DState, InterfaceC9540l interfaceC9540l, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, boolean z12, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3) {
        boolean z13;
        boolean z14 = true;
        if (AbstractC9979u.m20289b(this.state, draggable2DState)) {
            z13 = false;
        } else {
            this.state = draggable2DState;
            z13 = true;
        }
        if (this.reverseDirection != z12) {
            this.reverseDirection = z12;
        } else {
            z14 = z13;
        }
        this.onDragStarted = interfaceC9540l2;
        this.onDragStopped = interfaceC9540l3;
        this.startDragImmediately = z11;
        update(interfaceC9540l, z10, mutableInteractionSource, null, z14);
    }
}
