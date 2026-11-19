package androidx.work;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public abstract class Worker extends ListenableWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(workerParams, "workerParams");
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
        AbstractC9133u.m16132f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new InterfaceC10559a() { // from class: androidx.work.Worker.getForegroundInfoAsync.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ForegroundInfo invoke() {
                return Worker.this.getForegroundInfo();
            }
        });
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC9133u.m16132f(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new InterfaceC10559a() { // from class: androidx.work.Worker.startWork.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ListenableWorker.Result invoke() {
                return Worker.this.doWork();
            }
        });
    }
}
