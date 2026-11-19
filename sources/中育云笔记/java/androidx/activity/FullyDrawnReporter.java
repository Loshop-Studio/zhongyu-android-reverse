package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<InterfaceC9529a> onReportCallbacks;
    private final InterfaceC9529a reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, InterfaceC9529a reportFullyDrawn) {
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.q
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(this.f176c);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.lock) {
            try {
                fullyDrawnReporter.reportPosted = false;
                if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                    fullyDrawnReporter.reportFullyDrawn.invoke();
                    fullyDrawnReporter.fullyDrawnReported();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(InterfaceC9529a callback) {
        boolean z10;
        AbstractC9979u.m20294g(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z10 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9529a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.reportedFullyDrawn;
        }
        return z10;
    }

    public final void removeOnReportDrawnListener(InterfaceC9529a callback) {
        AbstractC9979u.m20294g(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final void removeReporter() {
        int i10;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i10 = this.reporterCount) > 0) {
                    this.reporterCount = i10 - 1;
                    postWhenReportersAreDone();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
