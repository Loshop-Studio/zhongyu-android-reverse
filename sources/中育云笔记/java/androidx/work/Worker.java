package androidx.work;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public abstract class Worker extends ListenableWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(workerParams, "workerParams");
    }

    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC9979u.m20293f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new InterfaceC9529a() { // from class: androidx.work.Worker.getForegroundInfoAsync.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ForegroundInfo invoke() {
                return Worker.this.getForegroundInfo();
            }
        });
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC9979u.m20293f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new InterfaceC9529a() { // from class: androidx.work.Worker.startWork.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ListenableWorker.Result invoke() {
                return Worker.this.doWork();
            }
        });
    }
}
