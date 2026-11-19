package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8823b1;
import p135i8.InterfaceC8878u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ListenableWorkerImpl extends IListenableWorkerImpl.Stub {
    static final String TAG = Logger.tagWithPrefix("WM-RemoteWorker ListenableWorkerImpl");
    static byte[] sEMPTY = new byte[0];
    static final Object sLock = new Object();
    final Configuration mConfiguration;
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final ProgressUpdater mProgressUpdater;
    final Map<String, InterfaceC9212n> mRemoteWorkerWrapperMap;
    final TaskExecutor mTaskExecutor;

    public ListenableWorkerImpl(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
        RemoteWorkManagerInfo remoteWorkManagerInfo = RemoteWorkManagerInfo.getInstance(context);
        this.mConfiguration = remoteWorkManagerInfo.getConfiguration();
        this.mTaskExecutor = remoteWorkManagerInfo.getTaskExecutor();
        this.mProgressUpdater = remoteWorkManagerInfo.getProgressUpdater();
        this.mForegroundUpdater = remoteWorkManagerInfo.getForegroundUpdater();
        this.mRemoteWorkerWrapperMap = new HashMap();
    }

    @NonNull
    private ListenableFuture<ListenableWorker.Result> executeWorkRequest(@NonNull String str, @NonNull String str2, @NonNull WorkerParameters workerParameters) {
        InterfaceC8878u interfaceC8878uM14805a = AbstractC8823b1.m14805a(null);
        synchronized (sLock) {
            this.mRemoteWorkerWrapperMap.put(str, interfaceC8878uM14805a);
        }
        return RemoteWorkerWrapperKt.executeRemoteWorker(this.mContext, this.mConfiguration, str2, workerParameters, interfaceC8878uM14805a, this.mTaskExecutor);
    }

    /* renamed from: k */
    public static /* synthetic */ void m2050k(InterfaceC9212n interfaceC9212n, int i10, IWorkManagerImplCallback iWorkManagerImplCallback) {
        interfaceC9212n.cancel(new WorkerStoppedException(i10));
        ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        final InterfaceC9212n interfaceC9212nRemove;
        try {
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) ParcelConverters.unmarshall(bArr, ParcelableInterruptRequest.CREATOR);
            String id = parcelableInterruptRequest.getId();
            final int stopReason = parcelableInterruptRequest.getStopReason();
            Logger.get().debug(TAG, "Interrupting work with id (" + id + ")");
            synchronized (sLock) {
                interfaceC9212nRemove = this.mRemoteWorkerWrapperMap.remove(id);
            }
            if (interfaceC9212nRemove != null) {
                this.mTaskExecutor.getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableWorkerImpl.m2050k(interfaceC9212nRemove, stopReason, iWorkManagerImplCallback);
                    }
                });
            } else {
                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
            }
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) ParcelConverters.unmarshall(bArr, ParcelableRemoteWorkRequest.CREATOR);
            WorkerParameters workerParameters = parcelableRemoteWorkRequest.getParcelableWorkerParameters().toWorkerParameters(this.mConfiguration, this.mTaskExecutor, this.mProgressUpdater, this.mForegroundUpdater);
            final String string = workerParameters.getId().toString();
            String workerClassName = parcelableRemoteWorkRequest.getWorkerClassName();
            Logger.get().debug(TAG, "Executing work request (" + string + ", " + workerClassName + ")");
            final ListenableFuture<ListenableWorker.Result> listenableFutureExecuteWorkRequest = executeWorkRequest(string, workerClassName, workerParameters);
            listenableFutureExecuteWorkRequest.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:50:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r5 = this;
                        com.google.common.util.concurrent.ListenableFuture r0 = r2     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        androidx.work.ListenableWorker$Result r0 = (androidx.work.ListenableWorker.Result) r0     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        androidx.work.multiprocess.parcelable.ParcelableResult r1 = new androidx.work.multiprocess.parcelable.ParcelableResult     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        byte[] r0 = androidx.work.multiprocess.parcelable.ParcelConverters.marshall(r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportSuccess(r1, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L24
                        java.util.Map<java.lang.String, kotlinx.coroutines.n> r1 = r1.mRemoteWorkerWrapperMap     // Catch: java.lang.Throwable -> L24
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L24
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L24
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                        return
                    L24:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                        throw r1
                    L27:
                        r0 = move-exception
                        goto L7c
                    L29:
                        r0 = move-exception
                        goto L2f
                    L2b:
                        r0 = move-exception
                        goto L66
                    L2d:
                        r0 = move-exception
                        goto L66
                    L2f:
                        androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L27
                        java.lang.String r2 = androidx.work.multiprocess.ListenableWorkerImpl.TAG     // Catch: java.lang.Throwable -> L27
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
                        r3.<init>()     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = "Worker ("
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L27
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = ") was cancelled"
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
                        r1.debug(r2, r3)     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r1, r0)     // Catch: java.lang.Throwable -> L27
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L63
                        java.util.Map<java.lang.String, kotlinx.coroutines.n> r1 = r1.mRemoteWorkerWrapperMap     // Catch: java.lang.Throwable -> L63
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L63
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L63
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
                        goto L78
                    L63:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
                        throw r1
                    L66:
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r1, r0)     // Catch: java.lang.Throwable -> L27
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L79
                        java.util.Map<java.lang.String, kotlinx.coroutines.n> r1 = r1.mRemoteWorkerWrapperMap     // Catch: java.lang.Throwable -> L79
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L79
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L79
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                    L78:
                        return
                    L79:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
                        throw r1
                    L7c:
                        java.lang.Object r1 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r1)
                        androidx.work.multiprocess.ListenableWorkerImpl r2 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L8a
                        java.util.Map<java.lang.String, kotlinx.coroutines.n> r2 = r2.mRemoteWorkerWrapperMap     // Catch: java.lang.Throwable -> L8a
                        java.lang.String r3 = r4     // Catch: java.lang.Throwable -> L8a
                        r2.remove(r3)     // Catch: java.lang.Throwable -> L8a
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
                        throw r0
                    L8a:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.ListenableWorkerImpl.RunnableC49711.run():void");
                }
            }, this.mTaskExecutor.getSerialTaskExecutor());
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }
}
