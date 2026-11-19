package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(getInputData());
        AbstractC9979u.m20293f(resultSuccess, "success(inputData)");
        return resultSuccess;
    }
}
