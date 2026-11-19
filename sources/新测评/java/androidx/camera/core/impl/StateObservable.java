package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class StateObservable<T> implements Observable<T> {
    private static final int INITIAL_VERSION = 0;
    private final AtomicReference<Object> mState;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private int mVersion = 0;

    @GuardedBy("mLock")
    private boolean mUpdating = false;

    @GuardedBy("mLock")
    private final Map<Observable.Observer<? super T>, ObserverWrapper<T>> mWrapperMap = new HashMap();

    @GuardedBy("mLock")
    private final CopyOnWriteArraySet<ObserverWrapper<T>> mNotifySet = new CopyOnWriteArraySet<>();

    @AutoValue
    public static abstract class ErrorWrapper {
        @NonNull
        public static ErrorWrapper wrap(@NonNull Throwable th) {
            return new AutoValue_StateObservable_ErrorWrapper(th);
        }

        @NonNull
        public abstract Throwable getError();
    }

    public static final class ObserverWrapper<T> implements Runnable {
        private static final Object NOT_SET = new Object();
        private static final int NO_VERSION = -1;
        private final Executor mExecutor;
        private final Observable.Observer<? super T> mObserver;
        private final AtomicReference<Object> mStateRef;
        private final AtomicBoolean mActive = new AtomicBoolean(true);
        private Object mLastState = NOT_SET;

        @GuardedBy("this")
        private int mLatestSignalledVersion = -1;

        @GuardedBy("this")
        private boolean mWrapperUpdating = false;

        public ObserverWrapper(@NonNull AtomicReference<Object> atomicReference, @NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
            this.mStateRef = atomicReference;
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        public void close() {
            this.mActive.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.mActive.get()) {
                        this.mWrapperUpdating = false;
                        return;
                    }
                    Object obj = this.mStateRef.get();
                    int i10 = this.mLatestSignalledVersion;
                    while (true) {
                        if (!Objects.equals(this.mLastState, obj)) {
                            this.mLastState = obj;
                            if (obj instanceof ErrorWrapper) {
                                this.mObserver.onError(((ErrorWrapper) obj).getError());
                            } else {
                                this.mObserver.onNewData(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.mLatestSignalledVersion || !this.mActive.get()) {
                                    break;
                                }
                                obj = this.mStateRef.get();
                                i10 = this.mLatestSignalledVersion;
                            } finally {
                            }
                        }
                    }
                    this.mWrapperUpdating = false;
                } finally {
                }
            }
        }

        public void update(int i10) {
            synchronized (this) {
                try {
                    if (this.mActive.get()) {
                        if (i10 <= this.mLatestSignalledVersion) {
                            return;
                        }
                        this.mLatestSignalledVersion = i10;
                        if (this.mWrapperUpdating) {
                            return;
                        }
                        this.mWrapperUpdating = true;
                        try {
                            this.mExecutor.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.mWrapperUpdating = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public StateObservable(@Nullable Object obj, boolean z9) {
        if (!z9) {
            this.mState = new AtomicReference<>(obj);
        } else {
            Preconditions.checkArgument(obj instanceof Throwable, "Initial errors must be Throwable");
            this.mState = new AtomicReference<>(ErrorWrapper.wrap((Throwable) obj));
        }
    }

    @GuardedBy("mLock")
    private void removeObserverLocked(@NonNull Observable.Observer<? super T> observer) {
        ObserverWrapper<T> observerWrapperRemove = this.mWrapperMap.remove(observer);
        if (observerWrapperRemove != null) {
            observerWrapperRemove.close();
            this.mNotifySet.remove(observerWrapperRemove);
        }
    }

    private void updateStateInternal(@Nullable Object obj) {
        Iterator<ObserverWrapper<T>> it;
        int i10;
        synchronized (this.mLock) {
            try {
                if (Objects.equals(this.mState.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.mVersion + 1;
                this.mVersion = i11;
                if (this.mUpdating) {
                    return;
                }
                this.mUpdating = true;
                Iterator<ObserverWrapper<T>> it2 = this.mNotifySet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().update(i11);
                    } else {
                        synchronized (this.mLock) {
                            try {
                                if (this.mVersion == i11) {
                                    this.mUpdating = false;
                                    return;
                                } else {
                                    it = this.mNotifySet.iterator();
                                    i10 = this.mVersion;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        ObserverWrapper<T> observerWrapper;
        synchronized (this.mLock) {
            removeObserverLocked(observer);
            observerWrapper = new ObserverWrapper<>(this.mState, executor, observer);
            this.mWrapperMap.put(observer, observerWrapper);
            this.mNotifySet.add(observerWrapper);
        }
        observerWrapper.update(0);
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public ListenableFuture<T> fetchData() {
        Object obj = this.mState.get();
        return obj instanceof ErrorWrapper ? Futures.immediateFailedFuture(((ErrorWrapper) obj).getError()) : Futures.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
        synchronized (this.mLock) {
            removeObserverLocked(observer);
        }
    }

    public void removeObservers() {
        synchronized (this.mLock) {
            try {
                Iterator it = new HashSet(this.mWrapperMap.keySet()).iterator();
                while (it.hasNext()) {
                    removeObserverLocked((Observable.Observer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateState(@Nullable T t10) {
        updateStateInternal(t10);
    }

    public void updateStateAsError(@NonNull Throwable th) {
        updateStateInternal(ErrorWrapper.wrap(th));
    }
}
