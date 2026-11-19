package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableFutureKt;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;

/* loaded from: classes3.dex */
public final class WorkerUpdater {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Operation enqueueUniquelyNamedPeriodic(final WorkManagerImpl workManagerImpl, final String name, final WorkRequest workRequest) {
        AbstractC9979u.m20294g(workManagerImpl, "<this>");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(workRequest, "workRequest");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, serialTaskExecutor, new InterfaceC9529a() { // from class: androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33962invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33962invoke() {
                final WorkRequest workRequest2 = workRequest;
                final WorkManagerImpl workManagerImpl2 = workManagerImpl;
                final String str2 = name;
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m33963invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m33963invoke() {
                        EnqueueRunnable.enqueue(new WorkContinuationImpl(workManagerImpl2, str2, ExistingWorkPolicy.KEEP, AbstractC10976v.m24126e(workRequest2)));
                    }
                };
                WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
                List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(name);
                if (workSpecIdAndStatesForName.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) AbstractC10947g0.m23946o0(workSpecIdAndStatesForName);
                if (idAndState == null) {
                    interfaceC9529a.invoke();
                    return;
                }
                WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.f2165id);
                if (workSpec == null) {
                    throw new IllegalStateException("WorkSpec with " + idAndState.f2165id + ", that matches a name \"" + name + "\", wasn't found");
                }
                if (!workSpec.isPeriodic()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (idAndState.state == WorkInfo.State.CANCELLED) {
                    workSpecDao.delete(idAndState.f2165id);
                    interfaceC9529a.invoke();
                    return;
                }
                WorkSpec workSpecCopy$default = WorkSpec.copy$default(workRequest.getWorkSpec(), idAndState.f2165id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
                Processor processor = workManagerImpl.getProcessor();
                AbstractC9979u.m20293f(processor, "processor");
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                AbstractC9979u.m20293f(workDatabase, "workDatabase");
                Configuration configuration = workManagerImpl.getConfiguration();
                AbstractC9979u.m20293f(configuration, "configuration");
                List<Scheduler> schedulers = workManagerImpl.getSchedulers();
                AbstractC9979u.m20293f(schedulers, "schedulers");
                WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workSpecCopy$default, workRequest.getTags());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkManager.UpdateResult updateWorkImpl(Processor processor, final WorkDatabase workDatabase, Configuration configuration, final List<? extends Scheduler> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.f2164id;
        final WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (workSpec2.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new InterfaceC9540l() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // p181hd.InterfaceC9540l
                public final String invoke(WorkSpec spec) {
                    AbstractC9979u.m20294g(spec, "spec");
                    return spec.isPeriodic() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec2)) + " Worker to " + ((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zIsEnqueued = processor.isEnqueued(str);
        if (!zIsEnqueued) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.k
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.updateWorkImpl$lambda$2(workDatabase, workSpec2, workSpec, list, str, set, zIsEnqueued);
            }
        });
        if (!zIsEnqueued) {
            Schedulers.schedule(configuration, workDatabase, list);
        }
        return zIsEnqueued ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z10) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkSpec workSpecCopy$default = WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecCopy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            workSpecCopy$default.setNextScheduleTimeOverrideGeneration(workSpecCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, workSpecCopy$default));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z10) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    public static final ListenableFuture<WorkManager.UpdateResult> updateWorkImpl(final WorkManagerImpl workManagerImpl, final WorkRequest workRequest) {
        AbstractC9979u.m20294g(workManagerImpl, "<this>");
        AbstractC9979u.m20294g(workRequest, "workRequest");
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "updateWorkImpl", new InterfaceC9529a() { // from class: androidx.work.impl.WorkerUpdater.updateWorkImpl.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final WorkManager.UpdateResult invoke() {
                Processor processor = workManagerImpl.getProcessor();
                AbstractC9979u.m20293f(processor, "processor");
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                AbstractC9979u.m20293f(workDatabase, "workDatabase");
                Configuration configuration = workManagerImpl.getConfiguration();
                AbstractC9979u.m20293f(configuration, "configuration");
                List<Scheduler> schedulers = workManagerImpl.getSchedulers();
                AbstractC9979u.m20293f(schedulers, "schedulers");
                return WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags());
            }
        });
    }
}
