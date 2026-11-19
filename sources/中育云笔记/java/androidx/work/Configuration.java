package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11115g1;
import sd.C11157r0;

/* loaded from: classes3.dex */
public final class Configuration {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final String defaultProcessName;
    private final Executor executor;
    private final Consumer<Throwable> initializationExceptionHandler;
    private final InputMergerFactory inputMergerFactory;
    private final boolean isMarkingJobsAsImportantWhileForeground;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final RunnableScheduler runnableScheduler;
    private final Consumer<Throwable> schedulingExceptionHandler;
    private final Executor taskExecutor;
    private final Tracer tracer;
    private final InterfaceC9945d workerCoroutineContext;
    private final Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
    private final WorkerFactory workerFactory;
    private final Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(Builder builder) {
        AbstractC9979u.m20294g(builder, "builder");
        InterfaceC9945d workerContext$work_runtime_release = builder.getWorkerContext$work_runtime_release();
        Executor executor$work_runtime_release = builder.getExecutor$work_runtime_release();
        if (executor$work_runtime_release == null) {
            executor$work_runtime_release = workerContext$work_runtime_release != null ? ConfigurationKt.asExecutor(workerContext$work_runtime_release) : null;
            if (executor$work_runtime_release == null) {
                executor$work_runtime_release = ConfigurationKt.createDefaultExecutor(false);
            }
        }
        this.executor = executor$work_runtime_release;
        this.workerCoroutineContext = workerContext$work_runtime_release == null ? builder.getExecutor$work_runtime_release() != null ? AbstractC11115g1.m24721b(executor$work_runtime_release) : C11157r0.m24798a() : workerContext$work_runtime_release;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor$work_runtime_release() == null;
        Executor taskExecutor$work_runtime_release = builder.getTaskExecutor$work_runtime_release();
        this.taskExecutor = taskExecutor$work_runtime_release == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor$work_runtime_release;
        Clock clock$work_runtime_release = builder.getClock$work_runtime_release();
        this.clock = clock$work_runtime_release == null ? new SystemClock() : clock$work_runtime_release;
        WorkerFactory workerFactory$work_runtime_release = builder.getWorkerFactory$work_runtime_release();
        this.workerFactory = workerFactory$work_runtime_release == null ? DefaultWorkerFactory.INSTANCE : workerFactory$work_runtime_release;
        InputMergerFactory inputMergerFactory$work_runtime_release = builder.getInputMergerFactory$work_runtime_release();
        this.inputMergerFactory = inputMergerFactory$work_runtime_release == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory$work_runtime_release;
        RunnableScheduler runnableScheduler$work_runtime_release = builder.getRunnableScheduler$work_runtime_release();
        this.runnableScheduler = runnableScheduler$work_runtime_release == null ? new DefaultRunnableScheduler() : runnableScheduler$work_runtime_release;
        this.minimumLoggingLevel = builder.getLoggingLevel$work_runtime_release();
        this.minJobSchedulerId = builder.getMinJobSchedulerId$work_runtime_release();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId$work_runtime_release();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit$work_runtime_release();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName$work_runtime_release();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit$work_runtime_release();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground$work_runtime_release();
        Tracer tracer$work_runtime_release = builder.getTracer$work_runtime_release();
        this.tracer = tracer$work_runtime_release == null ? ConfigurationKt.createDefaultTracer() : tracer$work_runtime_release;
    }

    @ExperimentalConfigurationApi
    public static /* synthetic */ void isMarkingJobsAsImportantWhileForeground$annotations() {
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    @IntRange(from = 20, m338to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Tracer getTracer() {
        return this.tracer;
    }

    public final InterfaceC9945d getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    @ExperimentalConfigurationApi
    public final boolean isMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    public static final class Builder {
        private Clock clock;
        private int contentUriTriggerWorkersLimit;
        private String defaultProcessName;
        private Executor executor;
        private Consumer<Throwable> initializationExceptionHandler;
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private boolean markJobsAsImportantWhileForeground;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;
        private RunnableScheduler runnableScheduler;
        private Consumer<Throwable> schedulingExceptionHandler;
        private Executor taskExecutor;
        private Tracer tracer;
        private InterfaceC9945d workerContext;
        private Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        private WorkerFactory workerFactory;
        private Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

        public Builder() {
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
        }

        public final Configuration build() {
            return new Configuration(this);
        }

        public final Clock getClock$work_runtime_release() {
            return this.clock;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final String getDefaultProcessName$work_runtime_release() {
            return this.defaultProcessName;
        }

        public final Executor getExecutor$work_runtime_release() {
            return this.executor;
        }

        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        public final InputMergerFactory getInputMergerFactory$work_runtime_release() {
            return this.inputMergerFactory;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.loggingLevel;
        }

        public final boolean getMarkJobsAsImportantWhileForeground$work_runtime_release() {
            return this.markJobsAsImportantWhileForeground;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.maxJobSchedulerId;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.maxSchedulerLimit;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.minJobSchedulerId;
        }

        public final RunnableScheduler getRunnableScheduler$work_runtime_release() {
            return this.runnableScheduler;
        }

        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        public final Executor getTaskExecutor$work_runtime_release() {
            return this.taskExecutor;
        }

        public final Tracer getTracer$work_runtime_release() {
            return this.tracer;
        }

        public final InterfaceC9945d getWorkerContext$work_runtime_release() {
            return this.workerContext;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.workerExecutionExceptionHandler;
        }

        public final WorkerFactory getWorkerFactory$work_runtime_release() {
            return this.workerFactory;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.workerInitializationExceptionHandler;
        }

        public final Builder setClock(Clock clock) {
            AbstractC9979u.m20294g(clock, "clock");
            this.clock = clock;
            return this;
        }

        public final void setClock$work_runtime_release(Clock clock) {
            this.clock = clock;
        }

        public final Builder setContentUriTriggerWorkersLimit(int i10) {
            this.contentUriTriggerWorkersLimit = Math.max(i10, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i10) {
            this.contentUriTriggerWorkersLimit = i10;
        }

        public final Builder setDefaultProcessName(String processName) {
            AbstractC9979u.m20294g(processName, "processName");
            this.defaultProcessName = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(String str) {
            this.defaultProcessName = str;
        }

        public final Builder setExecutor(Executor executor) {
            AbstractC9979u.m20294g(executor, "executor");
            this.executor = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(Executor executor) {
            this.executor = executor;
        }

        public final Builder setInitializationExceptionHandler(Consumer<Throwable> exceptionHandler) {
            AbstractC9979u.m20294g(exceptionHandler, "exceptionHandler");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final Builder setInputMergerFactory(InputMergerFactory inputMergerFactory) {
            AbstractC9979u.m20294g(inputMergerFactory, "inputMergerFactory");
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        public final Builder setJobSchedulerJobIdRange(int i10, int i11) {
            if (i11 - i10 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.minJobSchedulerId = i10;
            this.maxJobSchedulerId = i11;
            return this;
        }

        public final void setLoggingLevel$work_runtime_release(int i10) {
            this.loggingLevel = i10;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z10) {
            this.markJobsAsImportantWhileForeground = z10;
        }

        @ExperimentalConfigurationApi
        public final Builder setMarkingJobsAsImportantWhileForeground(boolean z10) {
            this.markJobsAsImportantWhileForeground = z10;
            return this;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i10) {
            this.maxJobSchedulerId = i10;
        }

        public final Builder setMaxSchedulerLimit(int i10) {
            if (i10 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.maxSchedulerLimit = Math.min(i10, 50);
            return this;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i10) {
            this.maxSchedulerLimit = i10;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i10) {
            this.minJobSchedulerId = i10;
        }

        public final Builder setMinimumLoggingLevel(int i10) {
            this.loggingLevel = i10;
            return this;
        }

        public final Builder setRunnableScheduler(RunnableScheduler runnableScheduler) {
            AbstractC9979u.m20294g(runnableScheduler, "runnableScheduler");
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        public final Builder setSchedulingExceptionHandler(Consumer<Throwable> schedulingExceptionHandler) {
            AbstractC9979u.m20294g(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.schedulingExceptionHandler = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final Builder setTaskExecutor(Executor taskExecutor) {
            AbstractC9979u.m20294g(taskExecutor, "taskExecutor");
            this.taskExecutor = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(Executor executor) {
            this.taskExecutor = executor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final Builder setTracer(Tracer tracer) {
            AbstractC9979u.m20294g(tracer, "tracer");
            this.tracer = tracer;
            return this;
        }

        public final void setTracer$work_runtime_release(Tracer tracer) {
            this.tracer = tracer;
        }

        public final void setWorkerContext$work_runtime_release(InterfaceC9945d interfaceC9945d) {
            this.workerContext = interfaceC9945d;
        }

        public final Builder setWorkerCoroutineContext(InterfaceC9945d context) {
            AbstractC9979u.m20294g(context, "context");
            this.workerContext = context;
            return this;
        }

        public final Builder setWorkerExecutionExceptionHandler(Consumer<WorkerExceptionInfo> workerExceptionHandler) {
            AbstractC9979u.m20294g(workerExceptionHandler, "workerExceptionHandler");
            this.workerExecutionExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        public final Builder setWorkerFactory(WorkerFactory workerFactory) {
            AbstractC9979u.m20294g(workerFactory, "workerFactory");
            this.workerFactory = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        public final Builder setWorkerInitializationExceptionHandler(Consumer<WorkerExceptionInfo> workerExceptionHandler) {
            AbstractC9979u.m20294g(workerExceptionHandler, "workerExceptionHandler");
            this.workerInitializationExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(Consumer<WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(Configuration configuration) {
            AbstractC9979u.m20294g(configuration, "configuration");
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.isMarkingJobsAsImportantWhileForeground();
            this.tracer = configuration.getTracer();
        }
    }
}
