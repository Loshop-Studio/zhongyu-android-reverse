package androidx.work.impl.utils;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class EnqueueUtilsKt {
    public static final String ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
    public static final String ARGUMENT_SERVICE_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final String ARGUMENT_SERVICE_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    public static final String REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";

    public static final void checkContentUriTriggerWorkerLimits(WorkDatabase workDatabase, Configuration configuration, WorkContinuationImpl continuation) {
        int i10;
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(continuation, "continuation");
        List listM24141s = AbstractC10978w.m24141s(continuation);
        int i11 = 0;
        while (!listM24141s.isEmpty()) {
            WorkContinuationImpl workContinuationImpl = (WorkContinuationImpl) AbstractC10937b0.m23870O(listM24141s);
            List<? extends WorkRequest> work = workContinuationImpl.getWork();
            AbstractC9979u.m20293f(work, "current.work");
            List<? extends WorkRequest> list = work;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((WorkRequest) it.next()).getWorkSpec().constraints.hasContentUriTriggers() && (i10 = i10 + 1) < 0) {
                        AbstractC10978w.m24144v();
                    }
                }
            }
            i11 += i10;
            List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
            if (parents != null) {
                listM24141s.addAll(parents);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iCountNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iCountNonFinishedContentUriTriggerWorkers + i11 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iCountNonFinishedContentUriTriggerWorkers + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final WorkSpec tryDelegateConstrainedWorkSpec(WorkSpec workSpec) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        Constraints constraints = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (AbstractC9979u.m20289b(str, ConstraintTrackingWorker.class.getName()) || !(constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow())) {
            return workSpec;
        }
        Data dataBuild = new Data.Builder().putAll(workSpec.input).putString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        String name = ConstraintTrackingWorker.class.getName();
        AbstractC9979u.m20293f(name, "name");
        return WorkSpec.copy$default(workSpec, null, null, name, null, dataBuild, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @VisibleForTesting
    public static final WorkSpec tryDelegateRemoteListenableWorker(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        boolean zHasKeyWithValueOfType = workSpec.input.hasKeyWithValueOfType("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zHasKeyWithValueOfType2 = workSpec.input.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zHasKeyWithValueOfType3 = workSpec.input.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zHasKeyWithValueOfType || !zHasKeyWithValueOfType2 || !zHasKeyWithValueOfType3) {
            return workSpec;
        }
        return WorkSpec.copy$default(workSpec, null, null, REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME, null, new Data.Builder().putAll(workSpec.input).putString("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).build(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    private static final boolean usesScheduler(List<? extends Scheduler> list, String str) throws ClassNotFoundException {
        Class<?> cls;
        List<? extends Scheduler> list2;
        try {
            cls = Class.forName(str);
            list2 = list;
        } catch (ClassNotFoundException unused) {
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((Scheduler) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public static final WorkSpec wrapWorkSpecIfNeeded(List<? extends Scheduler> schedulers, WorkSpec workSpec) {
        AbstractC9979u.m20294g(schedulers, "schedulers");
        AbstractC9979u.m20294g(workSpec, "workSpec");
        WorkSpec workSpecTryDelegateRemoteListenableWorker = tryDelegateRemoteListenableWorker(workSpec);
        return Build.VERSION.SDK_INT < 26 ? tryDelegateConstrainedWorkSpec(workSpecTryDelegateRemoteListenableWorker) : workSpecTryDelegateRemoteListenableWorker;
    }
}
