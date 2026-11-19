package androidx.work;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkerExceptionInfo {
    private final Throwable throwable;
    private final String workerClassName;
    private final WorkerParameters workerParameters;

    public WorkerExceptionInfo(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        AbstractC9979u.m20294g(workerClassName, "workerClassName");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        AbstractC9979u.m20294g(throwable, "throwable");
        this.workerClassName = workerClassName;
        this.workerParameters = workerParameters;
        this.throwable = throwable;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    public final WorkerParameters getWorkerParameters() {
        return this.workerParameters;
    }
}
