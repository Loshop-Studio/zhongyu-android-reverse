package androidx.work.multiprocess;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteWorkerWrapperKt$executeRemoteWorker$future$1", m17801f = "RemoteWorkerWrapper.kt", m17802l = {62, 64}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RemoteWorkerWrapperKt$executeRemoteWorker$future$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ TaskExecutor $taskExecutor;
    final /* synthetic */ String $workerClassName;
    final /* synthetic */ WorkerParameters $workerParameters;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteWorkerWrapperKt$executeRemoteWorker$future$1(Configuration configuration, Context context, String str, WorkerParameters workerParameters, TaskExecutor taskExecutor, InterfaceC9324c<? super RemoteWorkerWrapperKt$executeRemoteWorker$future$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$configuration = configuration;
        this.$context = context;
        this.$workerClassName = str;
        this.$workerParameters = workerParameters;
        this.$taskExecutor = taskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(Consumer consumer, String str, WorkerParameters workerParameters, Throwable th) {
        WorkerExceptionInfo workerExceptionInfo = new WorkerExceptionInfo(str, workerParameters, th);
        String TAG = ListenableWorkerImpl.TAG;
        AbstractC9133u.m16132f(TAG, "TAG");
        WorkerExceptionUtilsKt.safeAccept(consumer, workerExceptionInfo, TAG);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new RemoteWorkerWrapperKt$executeRemoteWorker$future$1(this.$configuration, this.$context, this.$workerClassName, this.$workerParameters, this.$taskExecutor, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
        return ((RemoteWorkerWrapperKt$executeRemoteWorker$future$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)
            goto L5f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4a
        L1e:
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.work.Configuration r7 = r6.$configuration     // Catch: java.lang.Throwable -> L67
            androidx.work.WorkerFactory r7 = r7.getWorkerFactory()     // Catch: java.lang.Throwable -> L67
            android.content.Context r1 = r6.$context     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r6.$workerClassName     // Catch: java.lang.Throwable -> L67
            androidx.work.WorkerParameters r5 = r6.$workerParameters     // Catch: java.lang.Throwable -> L67
            androidx.work.ListenableWorker r7 = r7.createWorkerWithDefaultFallback(r1, r4, r5)     // Catch: java.lang.Throwable -> L67
            boolean r1 = r7 instanceof androidx.work.multiprocess.RemoteListenableWorker
            if (r1 == 0) goto L4d
            r1 = r7
            androidx.work.multiprocess.RemoteListenableWorker r1 = (androidx.work.multiprocess.RemoteListenableWorker) r1
            com.google.common.util.concurrent.ListenableFuture r1 = r1.startRemoteWork()
            java.lang.String r2 = "worker.startRemoteWork()"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r2)
            r6.label = r3
            java.lang.Object r7 = androidx.work.impl.WorkerWrapperKt.awaitWithin(r1, r7, r6)
            if (r7 != r0) goto L4a
            goto L5e
        L4a:
            androidx.work.ListenableWorker$Result r7 = (androidx.work.ListenableWorker.Result) r7
            goto L61
        L4d:
            com.google.common.util.concurrent.ListenableFuture r1 = r7.startWork()
            java.lang.String r3 = "worker.startWork()"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r3)
            r6.label = r2
            java.lang.Object r7 = androidx.work.impl.WorkerWrapperKt.awaitWithin(r1, r7, r6)
            if (r7 != r0) goto L5f
        L5e:
            return r0
        L5f:
            androidx.work.ListenableWorker$Result r7 = (androidx.work.ListenableWorker.Result) r7
        L61:
            java.lang.String r0 = "when (worker) {\n        …ated worker\n            }"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r0)
            return r7
        L67:
            r7 = move-exception
            androidx.work.Configuration r0 = r6.$configuration
            androidx.core.util.Consumer r0 = r0.getWorkerInitializationExceptionHandler()
            if (r0 == 0) goto L7e
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r6.$taskExecutor
            java.lang.String r2 = r6.$workerClassName
            androidx.work.WorkerParameters r3 = r6.$workerParameters
            androidx.work.multiprocess.i r4 = new androidx.work.multiprocess.i
            r4.<init>()
            r1.executeOnTaskThread(r4)
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.RemoteWorkerWrapperKt$executeRemoteWorker$future$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
