package androidx.work;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final AbstractC11106e0 coroutineContext;
    private final WorkerParameters params;

    public static final class DeprecatedDispatcher extends AbstractC11106e0 {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final AbstractC11106e0 dispatcher = C11157r0.m24798a();

        private DeprecatedDispatcher() {
        }

        @Override // sd.AbstractC11106e0
        public void dispatch(InterfaceC9945d context, Runnable block) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(block, "block");
            dispatcher.dispatch(context, block);
        }

        public final AbstractC11106e0 getDispatcher() {
            return dispatcher;
        }

        @Override // sd.AbstractC11106e0
        public boolean isDispatchNeeded(InterfaceC9945d context) {
            AbstractC9979u.m20294g(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m26211f = "CoroutineWorker.kt", m26212l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1 */
    public static final class C47601 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C47601(InterfaceC11588c<? super C47601> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return CoroutineWorker.this.new C47601(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == objM25952f ? objM25952f : foregroundInfo;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ForegroundInfo> interfaceC11588c) {
            return ((C47601) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.CoroutineWorker$startWork$1", m26211f = "CoroutineWorker.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$startWork$1 */
    public static final class C47611 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C47611(InterfaceC11588c<? super C47611> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return CoroutineWorker.this.new C47611(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == objM25952f ? objM25952f : objDoWork;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C47611) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(params, "params");
        this.params = params;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC11588c<? super ForegroundInfo> interfaceC11588c) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c);

    public AbstractC11106e0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC11588c<? super ForegroundInfo> interfaceC11588c) {
        return getForegroundInfo$suspendImpl(this, interfaceC11588c);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(JobKt__JobKt.m20385b(null, 1, null)), null, new C47601(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC9979u.m20293f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, interfaceC11588c);
        return objAwait == AbstractC11725a.m25952f() ? objAwait : C10786q.f26013a;
    }

    public final Object setProgress(Data data, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        AbstractC9979u.m20293f(progressAsync, "setProgressAsync(data)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, interfaceC11588c);
        return objAwait == AbstractC11725a.m25952f() ? objAwait : C10786q.f26013a;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        InterfaceC9945d coroutineContext = !AbstractC9979u.m20289b(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        AbstractC9979u.m20293f(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(JobKt__JobKt.m20385b(null, 1, null)), null, new C47611(null), 2, null);
    }
}
