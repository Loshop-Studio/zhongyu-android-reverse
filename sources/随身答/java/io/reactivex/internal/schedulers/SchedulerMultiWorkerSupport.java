package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i9, @NonNull Scheduler.Worker worker);
    }

    void createWorkers(int i9, @NonNull WorkerCallback workerCallback);
}
