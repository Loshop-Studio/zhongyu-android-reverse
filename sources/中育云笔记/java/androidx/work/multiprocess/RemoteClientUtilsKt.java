package androidx.work.multiprocess;

import androidx.arch.core.util.Function;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11115g1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RemoteClientUtilsKt {

    @InterfaceC11829d(m26210c = "androidx.work.multiprocess.RemoteClientUtilsKt$map$1", m26211f = "RemoteClientUtils.kt", m26212l = {31}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteClientUtilsKt$map$1 */
    public static final class C49211 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ListenableFuture<I> $this_map;
        final /* synthetic */ Function<I, O> $transformation;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49211(Function<I, O> function, ListenableFuture<I> listenableFuture, InterfaceC11588c<? super C49211> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$transformation = function;
            this.$this_map = listenableFuture;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C49211(this.$transformation, this.$this_map, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Function function;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Function function2 = this.$transformation;
                ListenableFuture<I> listenableFuture = this.$this_map;
                this.L$0 = function2;
                this.label = 1;
                Object objAwait = ListenableFutureKt.await(listenableFuture, this);
                if (objAwait == objM25952f) {
                    return objM25952f;
                }
                function = function2;
                obj = objAwait;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function = (Function) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            return function.apply(obj);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super O> interfaceC11588c) {
            return ((C49211) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <I, O> ListenableFuture<O> map(ListenableFuture<I> listenableFuture, Function<I, O> transformation, Executor executor) {
        AbstractC9979u.m20294g(listenableFuture, "<this>");
        AbstractC9979u.m20294g(transformation, "transformation");
        AbstractC9979u.m20294g(executor, "executor");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(AbstractC11115g1.m24721b(executor), false, new C49211(transformation, listenableFuture, null));
    }
}
