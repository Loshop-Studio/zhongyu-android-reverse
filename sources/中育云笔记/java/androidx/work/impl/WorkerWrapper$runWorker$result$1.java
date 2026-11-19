package androidx.work.impl;

import android.content.Context;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", m26211f = "WorkerWrapper.kt", m26212l = {300, 311}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ ForegroundUpdater $foregroundUpdater;
    final /* synthetic */ ListenableWorker $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, InterfaceC11588c<? super WorkerWrapper$runWorker$result$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = workerWrapper;
        this.$worker = listenableWorker;
        this.$foregroundUpdater = foregroundUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Context context = this.this$0.appContext;
            WorkSpec workSpec = this.this$0.getWorkSpec();
            ListenableWorker listenableWorker = this.$worker;
            ForegroundUpdater foregroundUpdater = this.$foregroundUpdater;
            TaskExecutor taskExecutor = this.this$0.workTaskExecutor;
            this.label = 1;
            workerWrapper$runWorker$result$1 = this;
            if (WorkForegroundKt.workForeground(context, workSpec, listenableWorker, foregroundUpdater, taskExecutor, workerWrapper$runWorker$result$1) != objM25952f) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = WorkerWrapperKt.TAG;
        WorkerWrapper workerWrapper = workerWrapper$runWorker$result$1.this$0;
        Logger.get().debug(str, "Starting work for " + workerWrapper.getWorkSpec().workerClassName);
        ListenableFuture<ListenableWorker.Result> listenableFutureStartWork = workerWrapper$runWorker$result$1.$worker.startWork();
        AbstractC9979u.m20293f(listenableFutureStartWork, "worker.startWork()");
        ListenableWorker listenableWorker2 = workerWrapper$runWorker$result$1.$worker;
        workerWrapper$runWorker$result$1.label = 2;
        Object objAwaitWithin = WorkerWrapperKt.awaitWithin(listenableFutureStartWork, listenableWorker2, this);
        return objAwaitWithin == objM25952f ? objM25952f : objAwaitWithin;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
        return ((WorkerWrapper$runWorker$result$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
