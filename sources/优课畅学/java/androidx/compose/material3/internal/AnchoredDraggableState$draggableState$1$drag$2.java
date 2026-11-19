package androidx.compose.material3.internal;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", m17801f = "AnchoredDraggable.kt", m17802l = {277}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ InterfaceC10574p $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = interfaceC10574p;
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, interfaceC9324c).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            InterfaceC10574p interfaceC10574p = this.$block;
            this.label = 1;
            if (interfaceC10574p.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == objM17291f) {
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
