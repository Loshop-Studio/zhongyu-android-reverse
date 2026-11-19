package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkerWrapper {
    private final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    private final Configuration configuration;
    private final DependencyDao dependencyDao;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final List<String> tags;
    private final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    private final TaskExecutor workTaskExecutor;
    private final InterfaceC11168v workerJob;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras;
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        @SuppressLint({"LambdaLast"})
        public Builder(Context context, Configuration configuration, TaskExecutor workTaskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> tags) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(configuration, "configuration");
            AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
            AbstractC9979u.m20294g(foregroundProcessor, "foregroundProcessor");
            AbstractC9979u.m20294g(workDatabase, "workDatabase");
            AbstractC9979u.m20294g(workSpec, "workSpec");
            AbstractC9979u.m20294g(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            AbstractC9979u.m20293f(applicationContext, "context.applicationContext");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.RuntimeExtras();
        }

        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        public final ListenableWorker getWorker() {
            return this.worker;
        }

        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            AbstractC9979u.m20294g(runtimeExtras, "<set-?>");
            this.runtimeExtras = runtimeExtras;
        }

        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }

        @VisibleForTesting
        public final Builder withWorker(ListenableWorker worker) {
            AbstractC9979u.m20294g(worker, "worker");
            this.worker = worker;
            return this;
        }
    }

    public static abstract class Resolution {

        public static final class Failed extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: Multi-variable type inference failed */
            public Failed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(ListenableWorker.Result result) {
                super(null);
                AbstractC9979u.m20294g(result, "result");
                this.result = result;
            }

            public /* synthetic */ Failed(ListenableWorker.Result result, int i10, AbstractC9972n abstractC9972n) {
                this((i10 & 1) != 0 ? new ListenableWorker.Result.Failure() : result);
            }
        }

        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                AbstractC9979u.m20294g(result, "result");
                this.result = result;
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }

        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            public ResetWorkerStatus() {
                this(0, 1, null);
            }

            public final int getReason() {
                return this.reason;
            }

            public ResetWorkerStatus(int i10) {
                super(null);
                this.reason = i10;
            }

            public /* synthetic */ ResetWorkerStatus(int i10, int i11, AbstractC9972n abstractC9972n) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ Resolution(AbstractC9972n abstractC9972n) {
            this();
        }

        private Resolution() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.WorkerWrapper$launch$1", m26211f = "WorkerWrapper.kt", m26212l = {98}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.WorkerWrapper$launch$1 */
    public static final class C47851 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C47851(InterfaceC11588c<? super C47851> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean invokeSuspend$lambda$1(Resolution resolution, WorkerWrapper workerWrapper) {
            boolean zResetWorkerStatus;
            if (resolution instanceof Resolution.Finished) {
                zResetWorkerStatus = workerWrapper.onWorkFinished(((Resolution.Finished) resolution).getResult());
            } else if (resolution instanceof Resolution.Failed) {
                workerWrapper.setFailed(((Resolution.Failed) resolution).getResult());
                zResetWorkerStatus = false;
            } else {
                if (!(resolution instanceof Resolution.ResetWorkerStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                zResetWorkerStatus = workerWrapper.resetWorkerStatus(((Resolution.ResetWorkerStatus) resolution).getReason());
            }
            return Boolean.valueOf(zResetWorkerStatus);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return WorkerWrapper.this.new C47851(interfaceC11588c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            final Resolution failed;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            int i11 = 1;
            ListenableWorker.Result result = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11168v interfaceC11168v = WorkerWrapper.this.workerJob;
                    WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null);
                    this.label = 1;
                    obj = AbstractC11109f.m24709g(interfaceC11168v, workerWrapper$launch$1$resolution$1, this);
                    if (obj == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                failed = (Resolution) obj;
            } catch (WorkerStoppedException e10) {
                failed = new Resolution.ResetWorkerStatus(e10.getReason());
            } catch (CancellationException unused) {
                failed = new Resolution.Failed(result, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th) {
                Logger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                failed = new Resolution.Failed(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = WorkerWrapper.this.workDatabase;
            final WorkerWrapper workerWrapper = WorkerWrapper.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.C47851.invokeSuspend$lambda$1(failed, workerWrapper);
                }
            });
            AbstractC9979u.m20293f(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
            return objRunInTransaction;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C47851) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.WorkerWrapper", m26211f = "WorkerWrapper.kt", m26212l = {299}, m26213m = "runWorker")
    /* renamed from: androidx.work.impl.WorkerWrapper$runWorker$1 */
    public static final class C47861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C47861(InterfaceC11588c<? super C47861> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    public WorkerWrapper(Builder builder) {
        AbstractC9979u.m20294g(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.f2164id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        this.workerJob = JobKt__JobKt.m20385b(null, 1, null);
    }

    private final String createWorkDescription(List<String> list) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + AbstractC10947g0.m23954w0(list, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().info(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.isPeriodic() ? resetPeriodic() : setSucceeded(result);
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            String str2 = WorkerWrapperKt.TAG;
            Logger.get().info(str2, "Worker result RETRY for " + this.workDescription);
            return reschedule(-256);
        }
        String str3 = WorkerWrapperKt.TAG;
        Logger.get().info(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.isPeriodic()) {
            return resetPeriodic();
        }
        if (result == null) {
            result = new ListenableWorker.Result.Failure();
        }
        return setFailed(result);
    }

    private final void iterativelyFailWorkAndDependents(String str) {
        List listM24141s = AbstractC10978w.m24141s(str);
        while (!listM24141s.isEmpty()) {
            String str2 = (String) AbstractC10937b0.m23870O(listM24141s);
            if (this.workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            listM24141s.addAll(this.dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result result) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (state.isFinished()) {
            return false;
        }
        return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
    }

    private final boolean reschedule(int i10) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, i10);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int i10) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, "Status for " + this.workSpecId + " is " + state + " ; not doing any work");
            return false;
        }
        String str2 = WorkerWrapperKt.TAG;
        Logger.get().debug(str2, "Status for " + this.workSpecId + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, i10);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(vc.InterfaceC11588c<? super androidx.work.impl.WorkerWrapper.Resolution> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.runWorker(vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        WorkSpec workSpec = workerWrapper.workSpec;
        if (workSpec.state != WorkInfo.State.ENQUEUED) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!workSpec.isPeriodic() && !workerWrapper.workSpec.isBackedOff()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.calculateNextRunTime()) {
            return Boolean.FALSE;
        }
        Logger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    private final boolean setSucceeded(ListenableWorker.Result result) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        AbstractC9979u.m20292e(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        AbstractC9979u.m20293f(outputData, "success.outputData");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str)) {
                String str2 = WorkerWrapperKt.TAG;
                Logger.get().info(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    private final boolean trySetRunning() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.trySetRunning$lambda$11(this.f2163a);
            }
        });
        AbstractC9979u.m20293f(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$11(WorkerWrapper workerWrapper) {
        boolean z10;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void interrupt(int i10) {
        this.workerJob.cancel(new WorkerStoppedException(i10));
    }

    public final ListenableFuture<Boolean> launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(JobKt__JobKt.m20385b(null, 1, null)), null, new C47851(null), 2, null);
    }

    @VisibleForTesting
    public final boolean setFailed(ListenableWorker.Result result) {
        AbstractC9979u.m20294g(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        AbstractC9979u.m20293f(outputData, "failure.outputData");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }
}
