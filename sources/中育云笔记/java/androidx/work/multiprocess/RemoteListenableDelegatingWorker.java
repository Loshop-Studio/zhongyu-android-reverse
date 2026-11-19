package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RemoteListenableDelegatingWorker extends ListenableWorker {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RemoteListenableDelegatingWorker";
    private final ListenableWorkerImplClient client;
    private ComponentName componentName;
    private final Context context;
    private final WorkerParameters workerParameters;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1", m26211f = "RemoteListenableDelegatingWorker.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1 */
    public static final class C49251 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C49251(InterfaceC11588c<? super C49251> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(String str, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
            byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableRemoteWorkRequest(str, remoteListenableDelegatingWorker.workerParameters));
            AbstractC9979u.m20293f(bArrMarshall, "marshall(remoteWorkRequest)");
            iListenableWorkerImpl.startWork(bArrMarshall, iWorkManagerImplCallback);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return RemoteListenableDelegatingWorker.this.new C49251(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                String string = RemoteListenableDelegatingWorker.this.getInputData().getString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                String string2 = RemoteListenableDelegatingWorker.this.getInputData().getString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                final String string3 = RemoteListenableDelegatingWorker.this.getInputData().getString("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                if (string == null) {
                    throw new IllegalArgumentException("Need to specify a package name for the Remote Service.");
                }
                if (string2 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the Remote Service.");
                }
                if (string3 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                }
                RemoteListenableDelegatingWorker.this.componentName = new ComponentName(string, string2);
                ListenableWorkerImplClient client$work_multiprocess_release = RemoteListenableDelegatingWorker.this.getClient$work_multiprocess_release();
                ComponentName componentName = RemoteListenableDelegatingWorker.this.componentName;
                AbstractC9979u.m20291d(componentName);
                final RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                ListenableFuture<byte[]> listenableFutureExecute = client$work_multiprocess_release.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.c
                    @Override // androidx.work.multiprocess.RemoteDispatcher
                    public final void execute(Object obj2, IWorkManagerImplCallback iWorkManagerImplCallback) {
                        RemoteListenableDelegatingWorker.C49251.invokeSuspend$lambda$3(string3, remoteListenableDelegatingWorker, (IListenableWorkerImpl) obj2, iWorkManagerImplCallback);
                    }
                });
                AbstractC9979u.m20293f(listenableFutureExecute, "client\n                 …ck)\n                    }");
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = RemoteListenableDelegatingWorker.this;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(listenableFutureExecute, remoteListenableDelegatingWorker2, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            Object objUnmarshall = ParcelConverters.unmarshall((byte[]) obj, ParcelableResult.CREATOR);
            AbstractC9979u.m20293f(objUnmarshall, "unmarshall(response, ParcelableResult.CREATOR)");
            Logger.get().debug(RemoteListenableDelegatingWorker.TAG, "Cleaning up");
            RemoteListenableDelegatingWorker.this.getClient$work_multiprocess_release().unbindService();
            ListenableWorker.Result result = ((ParcelableResult) objUnmarshall).getResult();
            AbstractC9979u.m20293f(result, "parcelableResult.result");
            return result;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C49251) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
        this.client = new ListenableWorkerImplClient(context, workerParameters.getBackgroundExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStopped$lambda$0(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback callback) {
        AbstractC9979u.m20294g(iListenableWorkerImpl, "iListenableWorkerImpl");
        AbstractC9979u.m20294g(callback, "callback");
        String string = remoteListenableDelegatingWorker.workerParameters.getId().toString();
        AbstractC9979u.m20293f(string, "workerParameters.id.toString()");
        byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableInterruptRequest(string, remoteListenableDelegatingWorker.getStopReason()));
        AbstractC9979u.m20293f(bArrMarshall, "marshall(interruptRequest)");
        iListenableWorkerImpl.interrupt(bArrMarshall, callback);
    }

    public final ListenableWorkerImplClient getClient$work_multiprocess_release() {
        return this.client;
    }

    @Override // androidx.work.ListenableWorker
    @SuppressLint({"NewApi"})
    public void onStopped() {
        super.onStopped();
        ComponentName componentName = this.componentName;
        if (componentName != null) {
            ListenableWorkerImplClient listenableWorkerImplClient = this.client;
            AbstractC9979u.m20291d(componentName);
            listenableWorkerImplClient.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.b
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) {
                    RemoteListenableDelegatingWorker.onStopped$lambda$0(this.f2203a, (IListenableWorkerImpl) obj, iWorkManagerImplCallback);
                }
            });
        }
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.Result> startWork() {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(this.context.getApplicationContext());
        AbstractC9979u.m20293f(workManagerImpl, "getInstance(context.applicationContext)");
        AbstractC11106e0 taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        AbstractC9979u.m20293f(taskCoroutineDispatcher, "workManager.workTaskExec…r.taskCoroutineDispatcher");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, taskCoroutineDispatcher, false, new C49251(null), 2, null);
    }
}
