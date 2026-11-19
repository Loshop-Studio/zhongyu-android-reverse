package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: a */
    C0829d<ListenableWorker.AbstractC0807a> f4737a;

    /* renamed from: androidx.work.Worker$a */
    class RunnableC0808a implements Runnable {
        RunnableC0808a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f4737a.mo4268o(Worker.this.mo4129a());
            } catch (Throwable th) {
                Worker.this.f4737a.mo4269p(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public abstract ListenableWorker.AbstractC0807a mo4129a();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.AbstractC0807a> startWork() {
        this.f4737a = C0829d.m4279s();
        getBackgroundExecutor().execute(new RunnableC0808a());
        return this.f4737a;
    }
}
