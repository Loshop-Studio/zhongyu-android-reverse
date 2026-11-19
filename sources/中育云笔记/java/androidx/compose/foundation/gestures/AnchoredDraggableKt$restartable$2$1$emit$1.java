package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", m26211f = "AnchoredDraggable.kt", m26212l = {1548}, m26213m = "emit")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableKt.C12682.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt.C12682.AnonymousClass1<? super T> anonymousClass1, InterfaceC11588c<? super AnchoredDraggableKt$restartable$2$1$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
