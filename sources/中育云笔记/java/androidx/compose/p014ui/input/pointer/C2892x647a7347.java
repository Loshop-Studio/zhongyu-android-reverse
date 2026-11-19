package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m26211f = "SuspendingPointerInputFilter.kt", m26212l = {891}, m26213m = "withTimeout")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 */
/* loaded from: classes2.dex */
public final class C2892x647a7347<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2892x647a7347(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, InterfaceC11588c<? super C2892x647a7347> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withTimeout(0L, null, this);
    }
}
