package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3457z;
import p169x0.C3440i;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class AbstractC0807a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class a extends AbstractC0807a {

            /* renamed from: a */
            private final C0810a f4735a;

            public a() {
                this(C0810a.f4753c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f4735a.equals(((a) obj).f4735a);
            }

            /* renamed from: f */
            public C0810a m4127f() {
                return this.f4735a;
            }

            public int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.f4735a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4735a + '}';
            }

            public a(C0810a c0810a) {
                this.f4735a = c0810a;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class b extends AbstractC0807a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class c extends AbstractC0807a {

            /* renamed from: a */
            private final C0810a f4736a;

            public c() {
                this(C0810a.f4753c);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f4736a.equals(((c) obj).f4736a);
            }

            /* renamed from: f */
            public C0810a m4128f() {
                return this.f4736a;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f4736a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4736a + '}';
            }

            public c(C0810a c0810a) {
                this.f4736a = c0810a;
            }
        }

        AbstractC0807a() {
        }

        /* renamed from: a */
        public static AbstractC0807a m4122a() {
            return new a();
        }

        /* renamed from: b */
        public static AbstractC0807a m4123b(C0810a c0810a) {
            return new a(c0810a);
        }

        /* renamed from: c */
        public static AbstractC0807a m4124c() {
            return new b();
        }

        /* renamed from: d */
        public static AbstractC0807a m4125d() {
            return new c();
        }

        /* renamed from: e */
        public static AbstractC0807a m4126e(C0810a c0810a) {
            return new c(c0810a);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.m4130a();
    }

    public final UUID getId() {
        return this.mWorkerParams.m4132c();
    }

    public final C0810a getInputData() {
        return this.mWorkerParams.m4133d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.m4134e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.m4136g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.m4137h();
    }

    public InterfaceC2654a getTaskExecutor() {
        return this.mWorkerParams.m4138i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.m4139j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m4140k();
    }

    public AbstractC3457z getWorkerFactory() {
        return this.mWorkerParams.m4141l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ListenableFuture<Void> setForegroundAsync(C3440i c3440i) {
        this.mRunInForeground = true;
        return this.mWorkerParams.m4131b().mo8851a(getApplicationContext(), getId(), c3440i);
    }

    public final ListenableFuture<Void> setProgressAsync(C0810a c0810a) {
        return this.mWorkerParams.m4135f().mo8852a(getApplicationContext(), getId(), c0810a);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture<AbstractC0807a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
