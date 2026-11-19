package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.C0825a;
import p169x0.AbstractC3445n;

/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements C0825a.b {

    /* renamed from: f */
    private static final String f4827f = AbstractC3445n.m10503f("SystemFgService");

    /* renamed from: g */
    private static SystemForegroundService f4828g = null;

    /* renamed from: b */
    private Handler f4829b;

    /* renamed from: c */
    private boolean f4830c;

    /* renamed from: d */
    C0825a f4831d;

    /* renamed from: e */
    NotificationManager f4832e;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class RunnableC0822a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4833a;

        /* renamed from: b */
        final /* synthetic */ Notification f4834b;

        /* renamed from: c */
        final /* synthetic */ int f4835c;

        RunnableC0822a(int i4, Notification notification, int i5) {
            this.f4833a = i4;
            this.f4834b = notification;
            this.f4835c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4833a, this.f4834b, this.f4835c);
            } else {
                SystemForegroundService.this.startForeground(this.f4833a, this.f4834b);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class RunnableC0823b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4837a;

        /* renamed from: b */
        final /* synthetic */ Notification f4838b;

        RunnableC0823b(int i4, Notification notification) {
            this.f4837a = i4;
            this.f4838b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4832e.notify(this.f4837a, this.f4838b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class RunnableC0824c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4840a;

        RunnableC0824c(int i4) {
            this.f4840a = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4832e.cancel(this.f4840a);
        }
    }

    /* renamed from: e */
    private void m4230e() {
        this.f4829b = new Handler(Looper.getMainLooper());
        this.f4832e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0825a c0825a = new C0825a(getApplicationContext());
        this.f4831d = c0825a;
        c0825a.m4243m(this);
    }

    @Override // androidx.work.impl.foreground.C0825a.b
    /* renamed from: b */
    public void mo4231b(int i4) {
        this.f4829b.post(new RunnableC0824c(i4));
    }

    @Override // androidx.work.impl.foreground.C0825a.b
    /* renamed from: c */
    public void mo4232c(int i4, int i5, Notification notification) {
        this.f4829b.post(new RunnableC0822a(i4, notification, i5));
    }

    @Override // androidx.work.impl.foreground.C0825a.b
    /* renamed from: d */
    public void mo4233d(int i4, Notification notification) {
        this.f4829b.post(new RunnableC0823b(i4, notification));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4828g = this;
        m4230e();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4831d.m4241k();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f4830c) {
            AbstractC3445n.m10501c().mo10506d(f4827f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4831d.m4241k();
            m4230e();
            this.f4830c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4831d.m4242l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.C0825a.b
    public void stop() {
        this.f4830c = true;
        AbstractC3445n.m10501c().mo10504a(f4827f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4828g = null;
        stopSelf();
    }
}
