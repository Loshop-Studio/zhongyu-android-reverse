package androidx.compose.foundation.gestures;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.$pressScope.release();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
