package androidx.compose.foundation.gestures;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", m26211f = "Draggable.kt", m26212l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStopped$1(DraggableNode draggableNode, long j10, InterfaceC11588c<? super DraggableNode$onDragStopped$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = draggableNode;
        this.$velocity = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.this$0, this.$velocity, interfaceC11588c);
        draggableNode$onDragStopped$1.L$0 = obj;
        return draggableNode$onDragStopped$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            InterfaceC9545q interfaceC9545q = this.this$0.onDragStopped;
            Float fM26207b = AbstractC11826a.m26207b(DraggableKt.m27185toFloatsFctU(this.this$0.m27190reverseIfNeededAH228Gc(this.$velocity), this.this$0.orientation));
            this.label = 1;
            if (interfaceC9545q.invoke(interfaceC11122i0, fM26207b, this) == objM25952f) {
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((DraggableNode$onDragStopped$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
