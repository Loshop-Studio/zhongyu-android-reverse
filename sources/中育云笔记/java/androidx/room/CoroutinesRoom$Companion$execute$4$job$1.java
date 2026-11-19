package androidx.room;

import java.util.concurrent.Callable;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m26211f = "CoroutinesRoom.android.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC11125j $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC11125j interfaceC11125j, InterfaceC11588c<? super CoroutinesRoom$Companion$execute$4$job$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$callable = callable;
        this.$continuation = interfaceC11125j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        try {
            this.$continuation.resumeWith(Result.m20054c(this.$callable.call()));
        } catch (Throwable th) {
            InterfaceC11125j interfaceC11125j = this.$continuation;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(th)));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
