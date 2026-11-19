package androidx.work.multiprocess;

import android.content.Context;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8873s0;

/* loaded from: classes3.dex */
public final class RemoteWorkerWrapperKt {
    public static final ListenableFuture<ListenableWorker.Result> executeRemoteWorker(Context context, Configuration configuration, String workerClassName, WorkerParameters workerParameters, InterfaceC9212n job, TaskExecutor taskExecutor) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workerClassName, "workerClassName");
        AbstractC9133u.m16133g(workerParameters, "workerParameters");
        AbstractC9133u.m16133g(job, "job");
        AbstractC9133u.m16133g(taskExecutor, "taskExecutor");
        Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "taskExecutor.mainThreadExecutor");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(AbstractC8873s0.m14908b(mainThreadExecutor).plus(job), false, new RemoteWorkerWrapperKt$executeRemoteWorker$future$1(configuration, context, workerClassName, workerParameters, taskExecutor, null));
    }
}
