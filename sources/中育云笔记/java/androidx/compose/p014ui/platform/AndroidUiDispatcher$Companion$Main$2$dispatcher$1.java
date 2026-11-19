package androidx.compose.p014ui.platform;

import android.view.Choreographer;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", m26211f = "AndroidUiDispatcher.android.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements InterfaceC9544p {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(InterfaceC11588c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return Choreographer.getInstance();
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super Choreographer> interfaceC11588c) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
