package androidx.compose.material3.internal;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", m26211f = "AnchoredDraggable.kt", m26212l = {277}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ InterfaceC9544p $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        super(3, interfaceC11588c);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = interfaceC9544p;
    }

    @Override // p181hd.InterfaceC9545q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, interfaceC11588c).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            InterfaceC9544p interfaceC9544p = this.$block;
            this.label = 1;
            if (interfaceC9544p.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == objM25952f) {
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
