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
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8878u;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

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
    private final InterfaceC8878u workerJob;

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
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(configuration, "configuration");
            AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
            AbstractC9133u.m16133g(foregroundProcessor, "foregroundProcessor");
            AbstractC9133u.m16133g(workDatabase, "workDatabase");
            AbstractC9133u.m16133g(workSpec, "workSpec");
            AbstractC9133u.m16133g(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            AbstractC9133u.m16132f(applicationContext, "context.applicationContext");
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
            AbstractC9133u.m16133g(runtimeExtras, "<set-?>");
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
            AbstractC9133u.m16133g(worker, "worker");
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
                AbstractC9133u.m16133g(result, "result");
                this.result = result;
            }

            public /* synthetic */ Failed(ListenableWorker.Result result, int i10, AbstractC9126n abstractC9126n) {
                this((i10 & 1) != 0 ? new ListenableWorker.Result.Failure() : result);
            }
        }

        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                AbstractC9133u.m16133g(result, "result");
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

            public /* synthetic */ ResetWorkerStatus(int i10, int i11, AbstractC9126n abstractC9126n) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ Resolution(AbstractC9126n abstractC9126n) {
            this();
        }

        private Resolution() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.impl.WorkerWrapper$launch$1", m17801f = "WorkerWrapper.kt", m17802l = {98}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.WorkerWrapper$launch$1 */
    public static final class C48371 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C48371(InterfaceC9324c<? super C48371> interfaceC9324c) {
            super(2, interfaceC9324c);
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
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return WorkerWrapper.this.new C48371(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C48371) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            final Resolution failed;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            int i11 = 1;
            ListenableWorker.Result result = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC8878u interfaceC8878u = WorkerWrapper.this.workerJob;
                    WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null);
                    this.label = 1;
                    obj = AbstractC8833f.m14848g(interfaceC8878u, workerWrapper$launch$1$resolution$1, this);
                    if (obj == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
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
                    return WorkerWrapper.C48371.invokeSuspend$lambda$1(failed, workerWrapper);
                }
            });
            AbstractC9133u.m16132f(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
            return objRunInTransaction;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.impl.WorkerWrapper", m17801f = "WorkerWrapper.kt", m17802l = {299}, m17803m = "runWorker")
    /* renamed from: androidx.work.impl.WorkerWrapper$runWorker$1 */
    public static final class C48381 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C48381(InterfaceC9324c<? super C48381> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    public WorkerWrapper(Builder builder) {
        AbstractC9133u.m16133g(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.f2050id;
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
        this.workerJob = JobKt__JobKt.m16233b(null, 1, null);
    }

    private final String createWorkDescription(List<String> list) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + AbstractC8778f0.m14576v0(list, ",", null, null, 0, null, null, 62, null) + " } ]";
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
        List listM14776s = AbstractC8809v.m14776s(str);
        while (!listM14776s.isEmpty()) {
            String str2 = (String) AbstractC8768a0.m14493O(listM14776s);
            if (this.workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            listM14776s.addAll(this.dependencyDao.getDependentWorkIds(str2));
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
    /* JADX WARN: Removed duplicated region for block: B:68:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(p179m7.InterfaceC9324c<? super androidx.work.impl.WorkerWrapper.Resolution> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.runWorker(m7.c):java.lang.Object");
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
        AbstractC9133u.m16131e(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        AbstractC9133u.m16132f(outputData, "success.outputData");
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
                return WorkerWrapper.trySetRunning$lambda$11(this.f2049a);
            }
        });
        AbstractC9133u.m16132f(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
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
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(JobKt__JobKt.m16233b(null, 1, null)), null, new C48371(null), 2, null);
    }

    @VisibleForTesting
    public final boolean setFailed(ListenableWorker.Result result) {
        AbstractC9133u.m16133g(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        AbstractC9133u.m16132f(outputData, "failure.outputData");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }
}
