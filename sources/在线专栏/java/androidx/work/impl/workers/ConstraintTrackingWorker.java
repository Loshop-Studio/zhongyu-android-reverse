package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import p012b1.C1029d;
import p012b1.InterfaceC1028c;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1028c {

    /* renamed from: f */
    private static final String f4891f = AbstractC3445n.m10503f("ConstraintTrkngWrkr");

    /* renamed from: a */
    private WorkerParameters f4892a;

    /* renamed from: b */
    final Object f4893b;

    /* renamed from: c */
    volatile boolean f4894c;

    /* renamed from: d */
    C0829d<ListenableWorker.AbstractC0807a> f4895d;

    /* renamed from: e */
    private ListenableWorker f4896e;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class RunnableC0830a implements Runnable {
        RunnableC0830a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.m4283f();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class RunnableC0831b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListenableFuture f4898a;

        RunnableC0831b(ListenableFuture listenableFuture) {
            this.f4898a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4893b) {
                if (ConstraintTrackingWorker.this.f4894c) {
                    ConstraintTrackingWorker.this.m4282e();
                } else {
                    ConstraintTrackingWorker.this.f4895d.mo4270q(this.f4898a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4892a = workerParameters;
        this.f4893b = new Object();
        this.f4894c = false;
        this.f4895d = C0829d.m4279s();
    }

    /* renamed from: a */
    public WorkDatabase m4280a() {
        return C3494i.m10599n(getApplicationContext()).m10613s();
    }

    /* renamed from: b */
    void m4281b() {
        this.f4895d.mo4268o(ListenableWorker.AbstractC0807a.m4122a());
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: c */
    public void mo4213c(List<String> list) {
        AbstractC3445n.m10501c().mo10504a(f4891f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f4893b) {
            this.f4894c = true;
        }
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: d */
    public void mo4214d(List<String> list) {
    }

    /* renamed from: e */
    void m4282e() {
        this.f4895d.mo4268o(ListenableWorker.AbstractC0807a.m4124c());
    }

    /* renamed from: f */
    void m4283f() {
        String strM4152j = getInputData().m4152j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strM4152j)) {
            AbstractC3445n.m10501c().mo10505b(f4891f, "No worker to delegate to.", new Throwable[0]);
            m4281b();
            return;
        }
        ListenableWorker listenableWorkerM10551b = getWorkerFactory().m10551b(getApplicationContext(), strM4152j, this.f4892a);
        this.f4896e = listenableWorkerM10551b;
        if (listenableWorkerM10551b == null) {
            AbstractC3445n.m10501c().mo10504a(f4891f, "No worker to delegate to.", new Throwable[0]);
            m4281b();
            return;
        }
        C2520r c2520rMo8463k = m4280a().mo4171M().mo8463k(getId().toString());
        if (c2520rMo8463k == null) {
            m4281b();
            return;
        }
        C1029d c1029d = new C1029d(getApplicationContext(), getTaskExecutor(), this);
        c1029d.m4793d(Collections.singletonList(c2520rMo8463k));
        if (!c1029d.m4792c(getId().toString())) {
            AbstractC3445n.m10501c().mo10504a(f4891f, String.format("Constraints not met for delegate %s. Requesting retry.", strM4152j), new Throwable[0]);
            m4282e();
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f4891f, String.format("Constraints met for delegate %s", strM4152j), new Throwable[0]);
        try {
            ListenableFuture<ListenableWorker.AbstractC0807a> listenableFutureStartWork = this.f4896e.startWork();
            listenableFutureStartWork.addListener(new RunnableC0831b(listenableFutureStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
            String str = f4891f;
            abstractC3445nM10501c.mo10504a(str, String.format("Delegated worker %s threw exception in startWork.", strM4152j), th);
            synchronized (this.f4893b) {
                if (this.f4894c) {
                    AbstractC3445n.m10501c().mo10504a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                    m4282e();
                } else {
                    m4281b();
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC2654a getTaskExecutor() {
        return C3494i.m10599n(getApplicationContext()).m10615u();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4896e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4896e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f4896e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.AbstractC0807a> startWork() {
        getBackgroundExecutor().execute(new RunnableC0830a());
        return this.f4895d;
    }
}
