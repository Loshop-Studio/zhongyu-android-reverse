package androidx.work.multiprocess;

import androidx.arch.core.util.Function;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8873s0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class RemoteClientUtilsKt {

    @InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteClientUtilsKt$map$1", m17801f = "RemoteClientUtils.kt", m17802l = {31}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteClientUtilsKt$map$1 */
    public static final class C49731 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ ListenableFuture<I> $this_map;
        final /* synthetic */ Function<I, O> $transformation;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49731(Function<I, O> function, ListenableFuture<I> listenableFuture, InterfaceC9324c<? super C49731> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$transformation = function;
            this.$this_map = listenableFuture;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C49731(this.$transformation, this.$this_map, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super O> interfaceC9324c) {
            return ((C49731) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Function function;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Function function2 = this.$transformation;
                ListenableFuture<I> listenableFuture = this.$this_map;
                this.L$0 = function2;
                this.label = 1;
                Object objAwait = ListenableFutureKt.await(listenableFuture, this);
                if (objAwait == objM17291f) {
                    return objM17291f;
                }
                function = function2;
                obj = objAwait;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function = (Function) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            return function.apply(obj);
        }
    }

    public static final <I, O> ListenableFuture<O> map(ListenableFuture<I> listenableFuture, Function<I, O> transformation, Executor executor) {
        AbstractC9133u.m16133g(listenableFuture, "<this>");
        AbstractC9133u.m16133g(transformation, "transformation");
        AbstractC9133u.m16133g(executor, "executor");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(AbstractC8873s0.m14908b(executor), false, new C49731(transformation, listenableFuture, null));
    }
}
