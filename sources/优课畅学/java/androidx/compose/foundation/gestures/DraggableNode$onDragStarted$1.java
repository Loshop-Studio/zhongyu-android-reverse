package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", m17801f = "Draggable.kt", m17802l = {309}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableNode$onDragStarted$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $startedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j10, InterfaceC9324c<? super DraggableNode$onDragStarted$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = draggableNode;
        this.$startedPosition = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, this.$startedPosition, interfaceC9324c);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((DraggableNode$onDragStarted$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            InterfaceC10575q interfaceC10575q = this.this$0.onDragStarted;
            Offset offsetM24024boximpl = Offset.m24024boximpl(this.$startedPosition);
            this.label = 1;
            if (interfaceC10575q.invoke(interfaceC8822b0, offsetM24024boximpl, this) == objM17291f) {
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
