package androidx.work;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class WorkerExceptionInfo {
    private final Throwable throwable;
    private final String workerClassName;
    private final WorkerParameters workerParameters;

    public WorkerExceptionInfo(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        AbstractC9133u.m16133g(workerClassName, "workerClassName");
        AbstractC9133u.m16133g(workerParameters, "workerParameters");
        AbstractC9133u.m16133g(throwable, "throwable");
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
