package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkLauncherImpl implements WorkLauncher {
    private final Processor processor;
    private final TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(Processor processor, TaskExecutor workTaskExecutor) {
        AbstractC9979u.m20294g(processor, "processor");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) throws Throwable {
        workLauncherImpl.processor.startWork(startStopToken, runtimeExtras);
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(final StartStopToken workSpecId, final WorkerParameters.RuntimeExtras runtimeExtras) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.h
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WorkLauncherImpl.startWork$lambda$0(this.f2150c, workSpecId, runtimeExtras);
            }
        });
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(StartStopToken workSpecId, int i10) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this.processor, workSpecId, false, i10));
    }
}
