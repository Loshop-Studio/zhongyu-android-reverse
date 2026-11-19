package androidx.room;

import java.util.concurrent.Callable;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m17801f = "CoroutinesRoom.android.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC8845j $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC8845j interfaceC8845j, InterfaceC9324c<? super CoroutinesRoom$Companion$execute$4$job$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$callable = callable;
        this.$continuation = interfaceC8845j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        try {
            this.$continuation.resumeWith(Result.m15909b(this.$callable.call()));
        } catch (Throwable th) {
            InterfaceC8845j interfaceC8845j = this.$continuation;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(th)));
        }
        return C8736p.f16368a;
    }
}
