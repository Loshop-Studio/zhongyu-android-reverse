package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: h */
    static final Object f2604h = new Object();

    /* renamed from: i */
    static final HashMap<ComponentName, AbstractC0319h> f2605i = new HashMap<>();

    /* renamed from: a */
    InterfaceC0313b f2606a;

    /* renamed from: b */
    AbstractC0319h f2607b;

    /* renamed from: c */
    AsyncTaskC0312a f2608c;

    /* renamed from: d */
    boolean f2609d = false;

    /* renamed from: e */
    boolean f2610e = false;

    /* renamed from: f */
    boolean f2611f = false;

    /* renamed from: g */
    final ArrayList<C0315d> f2612g;

    /* renamed from: androidx.core.app.JobIntentService$a */
    final class AsyncTaskC0312a extends AsyncTask<Void, Void, Void> {
        AsyncTaskC0312a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC0316e interfaceC0316eM1739a = JobIntentService.this.m1739a();
                if (interfaceC0316eM1739a == null) {
                    return null;
                }
                JobIntentService.this.m1742e(interfaceC0316eM1739a.getIntent());
                interfaceC0316eM1739a.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.m1744g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.m1744g();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    interface InterfaceC0313b {
        /* renamed from: a */
        InterfaceC0316e mo1748a();

        /* renamed from: b */
        IBinder mo1749b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    static final class C0314c extends AbstractC0319h {

        /* renamed from: d */
        private final Context f2614d;

        /* renamed from: e */
        private final PowerManager.WakeLock f2615e;

        /* renamed from: f */
        private final PowerManager.WakeLock f2616f;

        /* renamed from: g */
        boolean f2617g;

        /* renamed from: h */
        boolean f2618h;

        C0314c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2614d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2615e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2616f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0319h
        /* renamed from: b */
        public void mo1750b() {
            synchronized (this) {
                if (this.f2618h) {
                    if (this.f2617g) {
                        this.f2615e.acquire(60000L);
                    }
                    this.f2618h = false;
                    this.f2616f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0319h
        /* renamed from: c */
        public void mo1751c() {
            synchronized (this) {
                if (!this.f2618h) {
                    this.f2618h = true;
                    this.f2616f.acquire(600000L);
                    this.f2615e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0319h
        /* renamed from: d */
        public void mo1752d() {
            synchronized (this) {
                this.f2617g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    final class C0315d implements InterfaceC0316e {

        /* renamed from: a */
        final Intent f2619a;

        /* renamed from: b */
        final int f2620b;

        C0315d(Intent intent, int i4) {
            this.f2619a = intent;
            this.f2620b = i4;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0316e
        public void complete() {
            JobIntentService.this.stopSelf(this.f2620b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0316e
        public Intent getIntent() {
            return this.f2619a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    interface InterfaceC0316e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    static final class JobServiceEngineC0317f extends JobServiceEngine implements InterfaceC0313b {

        /* renamed from: a */
        final JobIntentService f2622a;

        /* renamed from: b */
        final Object f2623b;

        /* renamed from: c */
        JobParameters f2624c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        final class a implements InterfaceC0316e {

            /* renamed from: a */
            final JobWorkItem f2625a;

            a(JobWorkItem jobWorkItem) {
                this.f2625a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0316e
            public void complete() {
                synchronized (JobServiceEngineC0317f.this.f2623b) {
                    JobParameters jobParameters = JobServiceEngineC0317f.this.f2624c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2625a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0316e
            public Intent getIntent() {
                return this.f2625a.getIntent();
            }
        }

        JobServiceEngineC0317f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2623b = new Object();
            this.f2622a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0313b
        /* renamed from: a */
        public InterfaceC0316e mo1748a() {
            synchronized (this.f2623b) {
                JobParameters jobParameters = this.f2624c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f2622a.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0313b
        /* renamed from: b */
        public IBinder mo1749b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f2624c = jobParameters;
            this.f2622a.m1741c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zM1740b = this.f2622a.m1740b();
            synchronized (this.f2623b) {
                this.f2624c = null;
            }
            return zM1740b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    static final class C0318g extends AbstractC0319h {

        /* renamed from: d */
        private final JobInfo f2627d;

        /* renamed from: e */
        private final JobScheduler f2628e;

        C0318g(Context context, ComponentName componentName, int i4) {
            super(componentName);
            m1753a(i4);
            this.f2627d = new JobInfo.Builder(i4, this.f2629a).setOverrideDeadline(0L).build();
            this.f2628e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    static abstract class AbstractC0319h {

        /* renamed from: a */
        final ComponentName f2629a;

        /* renamed from: b */
        boolean f2630b;

        /* renamed from: c */
        int f2631c;

        AbstractC0319h(ComponentName componentName) {
            this.f2629a = componentName;
        }

        /* renamed from: a */
        void m1753a(int i4) {
            if (!this.f2630b) {
                this.f2630b = true;
                this.f2631c = i4;
            } else {
                if (this.f2631c == i4) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i4 + " is different than previous " + this.f2631c);
            }
        }

        /* renamed from: b */
        public void mo1750b() {
        }

        /* renamed from: c */
        public void mo1751c() {
        }

        /* renamed from: d */
        public void mo1752d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2612g = null;
        } else {
            this.f2612g = new ArrayList<>();
        }
    }

    /* renamed from: d */
    static AbstractC0319h m1738d(Context context, ComponentName componentName, boolean z3, int i4) {
        AbstractC0319h c0314c;
        HashMap<ComponentName, AbstractC0319h> map = f2605i;
        AbstractC0319h abstractC0319h = map.get(componentName);
        if (abstractC0319h != null) {
            return abstractC0319h;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c0314c = new C0314c(context, componentName);
        } else {
            if (!z3) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c0314c = new C0318g(context, componentName, i4);
        }
        AbstractC0319h abstractC0319h2 = c0314c;
        map.put(componentName, abstractC0319h2);
        return abstractC0319h2;
    }

    /* renamed from: a */
    InterfaceC0316e m1739a() {
        InterfaceC0313b interfaceC0313b = this.f2606a;
        if (interfaceC0313b != null) {
            return interfaceC0313b.mo1748a();
        }
        synchronized (this.f2612g) {
            if (this.f2612g.size() <= 0) {
                return null;
            }
            return this.f2612g.remove(0);
        }
    }

    /* renamed from: b */
    boolean m1740b() {
        AsyncTaskC0312a asyncTaskC0312a = this.f2608c;
        if (asyncTaskC0312a != null) {
            asyncTaskC0312a.cancel(this.f2609d);
        }
        this.f2610e = true;
        return m1743f();
    }

    /* renamed from: c */
    void m1741c(boolean z3) {
        if (this.f2608c == null) {
            this.f2608c = new AsyncTaskC0312a();
            AbstractC0319h abstractC0319h = this.f2607b;
            if (abstractC0319h != null && z3) {
                abstractC0319h.mo1751c();
            }
            this.f2608c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    protected abstract void m1742e(Intent intent);

    /* renamed from: f */
    public boolean m1743f() {
        return true;
    }

    /* renamed from: g */
    void m1744g() {
        ArrayList<C0315d> arrayList = this.f2612g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2608c = null;
                ArrayList<C0315d> arrayList2 = this.f2612g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m1741c(false);
                } else if (!this.f2611f) {
                    this.f2607b.mo1750b();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC0313b interfaceC0313b = this.f2606a;
        if (interfaceC0313b != null) {
            return interfaceC0313b.mo1749b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2606a = new JobServiceEngineC0317f(this);
            this.f2607b = null;
        } else {
            this.f2606a = null;
            this.f2607b = m1738d(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0315d> arrayList = this.f2612g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2611f = true;
                this.f2607b.mo1750b();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        if (this.f2612g == null) {
            return 2;
        }
        this.f2607b.mo1752d();
        synchronized (this.f2612g) {
            ArrayList<C0315d> arrayList = this.f2612g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0315d(intent, i5));
            m1741c(true);
        }
        return 3;
    }
}
