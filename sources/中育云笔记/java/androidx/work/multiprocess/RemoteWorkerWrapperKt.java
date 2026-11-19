package androidx.work.multiprocess;

import android.content.Context;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import sd.AbstractC11115g1;

/* loaded from: classes3.dex */
public final class RemoteWorkerWrapperKt {
    public static final ListenableFuture<ListenableWorker.Result> executeRemoteWorker(Context context, Configuration configuration, String workerClassName, WorkerParameters workerParameters, InterfaceC10045g job, TaskExecutor taskExecutor) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workerClassName, "workerClassName");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        AbstractC9979u.m20294g(job, "job");
        AbstractC9979u.m20294g(taskExecutor, "taskExecutor");
        Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "taskExecutor.mainThreadExecutor");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(AbstractC11115g1.m24721b(mainThreadExecutor).plus(job), false, new RemoteWorkerWrapperKt$executeRemoteWorker$future$1(configuration, context, workerClassName, workerParameters, taskExecutor, null));
    }
}
