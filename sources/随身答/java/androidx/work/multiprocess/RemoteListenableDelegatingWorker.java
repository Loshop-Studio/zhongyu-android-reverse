package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0017J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m13413d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;", "Landroidx/work/ListenableWorker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client", "Landroidx/work/multiprocess/ListenableWorkerImplClient;", "getClient$work_multiprocess_release", "()Landroidx/work/multiprocess/ListenableWorkerImplClient;", "componentName", "Landroid/content/ComponentName;", "onStopped", "", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "Companion", "work-multiprocess_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RemoteListenableDelegatingWorker extends ListenableWorker {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
    private static final String TAG = "RemoteListenableDelegatingWorker";
    private final ListenableWorkerImplClient client;
    private ComponentName componentName;
    private final Context context;
    private final WorkerParameters workerParameters;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1", m13451f = "RemoteListenableDelegatingWorker.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1 */
    public static final class C50391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        int label;

        public C50391(Continuation<? super C50391> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(String str, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
            byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableRemoteWorkRequest(str, remoteListenableDelegatingWorker.workerParameters));
            Intrinsics.checkNotNullExpressionValue(bArrMarshall, "marshall(remoteWorkRequest)");
            iListenableWorkerImpl.startWork(bArrMarshall, iWorkManagerImplCallback);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RemoteListenableDelegatingWorker.this.new C50391(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
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
                ListenableWorkerImplClient client = RemoteListenableDelegatingWorker.this.getClient();
                ComponentName componentName = RemoteListenableDelegatingWorker.this.componentName;
                Intrinsics.checkNotNull(componentName);
                final RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                ListenableFuture<byte[]> listenableFutureExecute = client.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.c
                    @Override // androidx.work.multiprocess.RemoteDispatcher
                    public final void execute(Object obj2, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                        RemoteListenableDelegatingWorker.C50391.invokeSuspend$lambda$3(string3, remoteListenableDelegatingWorker, (IListenableWorkerImpl) obj2, iWorkManagerImplCallback);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenableFutureExecute, "client\n                 …ck)\n                    }");
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = RemoteListenableDelegatingWorker.this;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(listenableFutureExecute, remoteListenableDelegatingWorker2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Object objUnmarshall = ParcelConverters.unmarshall((byte[]) obj, ParcelableResult.CREATOR);
            Intrinsics.checkNotNullExpressionValue(objUnmarshall, "unmarshall(response, ParcelableResult.CREATOR)");
            Logger.get().debug(RemoteListenableDelegatingWorker.TAG, "Cleaning up");
            RemoteListenableDelegatingWorker.this.getClient().unbindService();
            ListenableWorker.Result result = ((ParcelableResult) objUnmarshall).getResult();
            Intrinsics.checkNotNullExpressionValue(result, "parcelableResult.result");
            return result;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((C50391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
        this.client = new ListenableWorkerImplClient(context, workerParameters.getBackgroundExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStopped$lambda$0(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(iListenableWorkerImpl, "iListenableWorkerImpl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = remoteListenableDelegatingWorker.workerParameters.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "workerParameters.id.toString()");
        byte[] bArrMarshall = ParcelConverters.marshall(new ParcelableInterruptRequest(string, remoteListenableDelegatingWorker.getStopReason()));
        Intrinsics.checkNotNullExpressionValue(bArrMarshall, "marshall(interruptRequest)");
        iListenableWorkerImpl.interrupt(bArrMarshall, callback);
    }

    /* renamed from: getClient$work_multiprocess_release, reason: from getter */
    public final ListenableWorkerImplClient getClient() {
        return this.client;
    }

    @Override // androidx.work.ListenableWorker
    @SuppressLint({"NewApi"})
    public void onStopped() {
        super.onStopped();
        ComponentName componentName = this.componentName;
        if (componentName != null) {
            ListenableWorkerImplClient listenableWorkerImplClient = this.client;
            Intrinsics.checkNotNull(componentName);
            listenableWorkerImplClient.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.b
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                    RemoteListenableDelegatingWorker.onStopped$lambda$0(this.f2174a, (IListenableWorkerImpl) obj, iWorkManagerImplCallback);
                }
            });
        }
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.Result> startWork() {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(this.context.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(context.applicationContext)");
        CoroutineDispatcher taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        Intrinsics.checkNotNullExpressionValue(taskCoroutineDispatcher, "workManager.workTaskExec…r.taskCoroutineDispatcher");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, taskCoroutineDispatcher, false, new C50391(null), 2, null);
    }
}
