package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.RunnableScheduler;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class RemoteWorkManagerClient extends RemoteWorkManager {
    private static final long SESSION_TIMEOUT_MILLIS = 6000000;
    static final String TAG = Logger.tagWithPrefix("RemoteWorkManagerClient");
    public static final Function<byte[], Void> sVoidMapper = new Function() { // from class: androidx.work.multiprocess.g
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return RemoteWorkManagerClient.m2222a((byte[]) obj);
        }
    };
    final Context mContext;
    final Executor mExecutor;
    final Object mLock;
    private final RunnableScheduler mRunnableScheduler;
    Session mSession;
    private volatile long mSessionIndex;
    private final long mSessionTimeout;
    private final SessionTracker mSessionTracker;
    final WorkManagerImpl mWorkManager;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class Session implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("RemoteWMgr.Connection");
        final RemoteWorkManagerClient mClient;
        final SettableFuture<IWorkManagerImpl> mFuture = SettableFuture.create();

        public Session(@NonNull RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(@NonNull ComponentName componentName) {
            onBindingDied();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NonNull ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IWorkManagerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NonNull ComponentName componentName) {
            Logger.get().debug(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
            this.mClient.cleanUp();
        }

        public void onBindingDied() {
            Logger.get().debug(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
            this.mClient.cleanUp();
        }
    }

    public static class SessionTracker implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("SessionHandler");
        private final RemoteWorkManagerClient mClient;

        public SessionTracker(@NonNull RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            long sessionIndex = this.mClient.getSessionIndex();
            synchronized (this.mClient.getSessionLock()) {
                try {
                    long sessionIndex2 = this.mClient.getSessionIndex();
                    Session currentSession = this.mClient.getCurrentSession();
                    if (currentSession != null) {
                        if (sessionIndex == sessionIndex2) {
                            Logger.get().debug(TAG, "Unbinding service");
                            this.mClient.getContext().unbindService(currentSession);
                            currentSession.onBindingDied();
                        } else {
                            Logger.get().debug(TAG, "Ignoring request to unbind.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public RemoteWorkManagerClient(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, SESSION_TIMEOUT_MILLIS);
    }

    /* renamed from: a */
    public static /* synthetic */ Void m2222a(byte[] bArr) {
        return null;
    }

    /* renamed from: c */
    public static /* synthetic */ void m2224c(RemoteWorkManagerClient remoteWorkManagerClient, ListenableFuture listenableFuture) throws ExecutionException, InterruptedException {
        remoteWorkManagerClient.getClass();
        try {
            listenableFuture.get();
        } catch (InterruptedException | ExecutionException unused) {
            remoteWorkManagerClient.cleanUp();
        }
    }

    private static Intent newIntent(@NonNull Context context) {
        return new Intent(context, (Class<?>) RemoteWorkManagerService.class);
    }

    private void unableToBind(@NonNull Session session, @NonNull Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        session.mFuture.setException(th);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public RemoteWorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginUniqueWork(str, existingWorkPolicy, list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public RemoteWorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginWith(list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> cancelAllWork() {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.6
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelAllWork(iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> cancelAllWorkByTag(@NonNull final String str) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.4
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelAllWorkByTag(str, iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> cancelUniqueWork(@NonNull final String str) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.5
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelUniqueWork(str, iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> cancelWorkById(@NonNull final UUID uuid) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.3
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelWorkById(uuid.toString(), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    public void cleanUp() {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Cleaning up.");
            this.mSession = null;
        }
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> enqueue(@NonNull WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> enqueueUniquePeriodicWork(@NonNull final String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull final PeriodicWorkRequest periodicWorkRequest) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? RemoteClientUtilsKt.map(execute(new RemoteDispatcher() { // from class: androidx.work.multiprocess.h
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) {
                IWorkManagerImpl iWorkManagerImpl = (IWorkManagerImpl) obj;
                iWorkManagerImpl.updateUniquePeriodicWorkRequest(str, ParcelConverters.marshall(new ParcelableWorkRequest(periodicWorkRequest)), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor) : enqueue(this.mWorkManager.createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list) {
        return beginUniqueWork(str, existingWorkPolicy, list).enqueue();
    }

    @NonNull
    public ListenableFuture<byte[]> execute(@NonNull RemoteDispatcher<IWorkManagerImpl> remoteDispatcher) {
        return execute(getSession(), remoteDispatcher);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public Session getCurrentSession() {
        return this.mSession;
    }

    @NonNull
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @NonNull
    public ListenableFuture<IWorkManagerImpl> getSession() {
        return getSession(newIntent(this.mContext));
    }

    public long getSessionIndex() {
        return this.mSessionIndex;
    }

    @NonNull
    public Object getSessionLock() {
        return this.mLock;
    }

    public long getSessionTimeout() {
        return this.mSessionTimeout;
    }

    @NonNull
    public SessionTracker getSessionTracker() {
        return this.mSessionTracker;
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfos(@NonNull final WorkQuery workQuery) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.7
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.queryWorkInfo(ParcelConverters.marshall(new ParcelableWorkQuery(workQuery)), iWorkManagerImplCallback);
            }
        }), new Function<byte[], List<WorkInfo>>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.8
            @Override // androidx.arch.core.util.Function
            public List<WorkInfo> apply(byte[] bArr) {
                return ((ParcelableWorkInfos) ParcelConverters.unmarshall(bArr, ParcelableWorkInfos.CREATOR)).getWorkInfos();
            }
        }, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> setForegroundAsync(@NonNull final String str, @NonNull final ForegroundInfo foregroundInfo) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.10
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.setForegroundAsync(ParcelConverters.marshall(new ParcelableForegroundRequestInfo(str, foregroundInfo)), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> setProgress(@NonNull final UUID uuid, @NonNull final Data data) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.9
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.setProgress(ParcelConverters.marshall(new ParcelableUpdateRequest(uuid, data)), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    public RemoteWorkManagerClient(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, long j10) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        this.mLock = new Object();
        this.mSession = null;
        this.mSessionTracker = new SessionTracker(this);
        this.mSessionTimeout = j10;
        this.mRunnableScheduler = workManagerImpl.getConfiguration().getRunnableScheduler();
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> enqueue(@NonNull final List<WorkRequest> list) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.enqueueWorkRequests(ParcelConverters.marshall(new ParcelableWorkRequests((List<WorkRequest>) list)), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }

    @NonNull
    @VisibleForTesting
    public ListenableFuture<byte[]> execute(@NonNull final ListenableFuture<IWorkManagerImpl> listenableFuture, @NonNull RemoteDispatcher<IWorkManagerImpl> remoteDispatcher) {
        listenableFuture.addListener(new Runnable() { // from class: androidx.work.multiprocess.e
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                RemoteWorkManagerClient.m2224c(this.f2207c, listenableFuture);
            }
        }, this.mExecutor);
        ListenableFuture<byte[]> listenableFutureExecute = RemoteExecuteKt.execute(this.mExecutor, listenableFuture, remoteDispatcher);
        listenableFutureExecute.addListener(new Runnable() { // from class: androidx.work.multiprocess.f
            @Override // java.lang.Runnable
            public final void run() {
                RemoteWorkManagerClient remoteWorkManagerClient = this.f2209c;
                remoteWorkManagerClient.mRunnableScheduler.scheduleWithDelay(remoteWorkManagerClient.getSessionTimeout(), remoteWorkManagerClient.getSessionTracker());
            }
        }, this.mExecutor);
        return listenableFutureExecute;
    }

    @NonNull
    @VisibleForTesting
    public ListenableFuture<IWorkManagerImpl> getSession(@NonNull Intent intent) {
        SettableFuture<IWorkManagerImpl> settableFuture;
        synchronized (this.mLock) {
            try {
                this.mSessionIndex++;
                if (this.mSession == null) {
                    Logger.get().debug(TAG, "Creating a new session");
                    Session session = new Session(this);
                    this.mSession = session;
                    try {
                        if (!this.mContext.bindService(intent, session, 1)) {
                            unableToBind(this.mSession, new RuntimeException("Unable to bind to service"));
                        }
                    } catch (Throwable th) {
                        unableToBind(this.mSession, th);
                    }
                }
                this.mRunnableScheduler.cancel(this.mSessionTracker);
                settableFuture = this.mSession.mFuture;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return settableFuture;
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @NonNull
    public ListenableFuture<Void> enqueue(@NonNull final WorkContinuation workContinuation) {
        return RemoteClientUtilsKt.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.2
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IWorkManagerImpl iWorkManagerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.enqueueContinuation(ParcelConverters.marshall(new ParcelableWorkContinuationImpl((WorkContinuationImpl) workContinuation)), iWorkManagerImplCallback);
            }
        }), sVoidMapper, this.mExecutor);
    }
}
