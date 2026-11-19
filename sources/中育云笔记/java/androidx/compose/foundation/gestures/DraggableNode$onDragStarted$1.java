package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", m26211f = "Draggable.kt", m26212l = {309}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableNode$onDragStarted$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $startedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j10, InterfaceC11588c<? super DraggableNode$onDragStarted$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = draggableNode;
        this.$startedPosition = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, this.$startedPosition, interfaceC11588c);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            InterfaceC9545q interfaceC9545q = this.this$0.onDragStarted;
            Offset offsetM30626boximpl = Offset.m30626boximpl(this.$startedPosition);
            this.label = 1;
            if (interfaceC9545q.invoke(interfaceC11122i0, offsetM30626boximpl, this) == objM25952f) {
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
        return ((DraggableNode$onDragStarted$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
