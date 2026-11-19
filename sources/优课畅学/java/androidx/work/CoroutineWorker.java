package androidx.work;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final CoroutineDispatcher coroutineContext;
    private final WorkerParameters params;

    public static final class DeprecatedDispatcher extends CoroutineDispatcher {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final CoroutineDispatcher dispatcher = C8843i0.m14866a();

        private DeprecatedDispatcher() {
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public void dispatch(InterfaceC9100d context, Runnable block) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(block, "block");
            dispatcher.dispatch(context, block);
        }

        public final CoroutineDispatcher getDispatcher() {
            return dispatcher;
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public boolean isDispatchNeeded(InterfaceC9100d context) {
            AbstractC9133u.m16133g(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m17801f = "CoroutineWorker.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1 */
    public static final class C48121 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C48121(InterfaceC9324c<? super C48121> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return CoroutineWorker.this.new C48121(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super ForegroundInfo> interfaceC9324c) {
            return ((C48121) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == objM17291f ? objM17291f : foregroundInfo;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.CoroutineWorker$startWork$1", m17801f = "CoroutineWorker.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$startWork$1 */
    public static final class C48131 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C48131(InterfaceC9324c<? super C48131> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return CoroutineWorker.this.new C48131(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
            return ((C48131) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == objM17291f ? objM17291f : objDoWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(params, "params");
        this.params = params;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    @InterfaceC8721a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC9324c<? super ForegroundInfo> interfaceC9324c) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c);

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC9324c<? super ForegroundInfo> interfaceC9324c) {
        return getForegroundInfo$suspendImpl(this, interfaceC9324c);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(JobKt__JobKt.m16233b(null, 1, null)), null, new C48121(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC9133u.m16132f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, interfaceC9324c);
        return objAwait == AbstractC9434a.m17291f() ? objAwait : C8736p.f16368a;
    }

    public final Object setProgress(Data data, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        AbstractC9133u.m16132f(progressAsync, "setProgressAsync(data)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, interfaceC9324c);
        return objAwait == AbstractC9434a.m17291f() ? objAwait : C8736p.f16368a;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        InterfaceC9100d coroutineContext = !AbstractC9133u.m16128b(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        AbstractC9133u.m16132f(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(JobKt__JobKt.m16233b(null, 1, null)), null, new C48131(null), 2, null);
    }
}
