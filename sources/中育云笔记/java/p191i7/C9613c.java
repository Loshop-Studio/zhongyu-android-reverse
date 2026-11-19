package p191i7;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p212k.AbstractC9764r;

/* renamed from: i7.c */
/* loaded from: classes5.dex */
public class C9613c extends ThreadPoolExecutor {

    /* renamed from: c */
    public Handler f22136c;

    /* renamed from: d */
    public List f22137d;

    /* renamed from: e */
    public List f22138e;

    /* renamed from: i7.c$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Runnable f22139c;

        public a(d dVar, Runnable runnable) {
            this.f22139c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: i7.c$b */
    public class b implements Runnable {
        public b(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: i7.c$c */
    public interface c {
    }

    /* renamed from: i7.c$d */
    public interface d {
    }

    public C9613c(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f22136c = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        List list;
        super.afterExecute(runnable, th);
        List list2 = this.f22137d;
        if (list2 != null && list2.size() > 0) {
            Iterator it = this.f22137d.iterator();
            while (it.hasNext()) {
                AbstractC9764r.m19682a(it.next());
                this.f22136c.post(new a(null, runnable));
            }
        }
        if (getActiveCount() != 1 || getQueue().size() != 0 || (list = this.f22138e) == null || list.size() <= 0) {
            return;
        }
        Iterator it2 = this.f22138e.iterator();
        while (it2.hasNext()) {
            AbstractC9764r.m19682a(it2.next());
            this.f22136c.post(new b(null));
        }
    }
}
