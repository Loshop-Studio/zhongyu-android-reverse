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
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1", m17801f = "RemoteListenableDelegatingWorker.kt", m17802l = {76}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1 */
    public static final class C49771 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C49771(InterfaceC9324c<? super C49771> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(String str, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
            byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableRemoteWorkRequest(str, remoteListenableDelegatingWorker.workerParameters));
            AbstractC9133u.m16132f(bArrMarshall, "marshall(remoteWorkRequest)");
            iListenableWorkerImpl.startWork(bArrMarshall, iWorkManagerImplCallback);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return RemoteListenableDelegatingWorker.this.new C49771(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
            return ((C49771) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
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
                AbstractC9133u.m16130d(componentName);
                final RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                ListenableFuture<byte[]> listenableFutureExecute = client$work_multiprocess_release.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.c
                    @Override // androidx.work.multiprocess.RemoteDispatcher
                    public final void execute(Object obj2, IWorkManagerImplCallback iWorkManagerImplCallback) {
                        RemoteListenableDelegatingWorker.C49771.invokeSuspend$lambda$3(string3, remoteListenableDelegatingWorker, (IListenableWorkerImpl) obj2, iWorkManagerImplCallback);
                    }
                });
                AbstractC9133u.m16132f(listenableFutureExecute, "client\n                 …ck)\n                    }");
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = RemoteListenableDelegatingWorker.this;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(listenableFutureExecute, remoteListenableDelegatingWorker2, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            Object objUnmarshall = ParcelConverters.unmarshall((byte[]) obj, ParcelableResult.CREATOR);
            AbstractC9133u.m16132f(objUnmarshall, "unmarshall(response, ParcelableResult.CREATOR)");
            Logger.get().debug(RemoteListenableDelegatingWorker.TAG, "Cleaning up");
            RemoteListenableDelegatingWorker.this.getClient$work_multiprocess_release().unbindService();
            ListenableWorker.Result result = ((ParcelableResult) objUnmarshall).getResult();
            AbstractC9133u.m16132f(result, "parcelableResult.result");
            return result;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
        this.client = new ListenableWorkerImplClient(context, workerParameters.getBackgroundExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStopped$lambda$0(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback callback) {
        AbstractC9133u.m16133g(iListenableWorkerImpl, "iListenableWorkerImpl");
        AbstractC9133u.m16133g(callback, "callback");
        String string = remoteListenableDelegatingWorker.workerParameters.getId().toString();
        AbstractC9133u.m16132f(string, "workerParameters.id.toString()");
        byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableInterruptRequest(string, remoteListenableDelegatingWorker.getStopReason()));
        AbstractC9133u.m16132f(bArrMarshall, "marshall(interruptRequest)");
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
            AbstractC9133u.m16130d(componentName);
            listenableWorkerImplClient.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.b
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) {
                    RemoteListenableDelegatingWorker.onStopped$lambda$0(this.f2089a, (IListenableWorkerImpl) obj, iWorkManagerImplCallback);
                }
            });
        }
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.Result> startWork() {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(this.context.getApplicationContext());
        AbstractC9133u.m16132f(workManagerImpl, "getInstance(context.applicationContext)");
        CoroutineDispatcher taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        AbstractC9133u.m16132f(taskCoroutineDispatcher, "workManager.workTaskExec…r.taskCoroutineDispatcher");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, taskCoroutineDispatcher, false, new C49771(null), 2, null);
    }
}
