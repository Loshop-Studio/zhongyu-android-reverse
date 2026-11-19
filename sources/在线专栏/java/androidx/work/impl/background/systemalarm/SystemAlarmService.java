package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.C0820e;
import p090g1.C2641m;
import p169x0.AbstractC3445n;

/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements C0820e.c {

    /* renamed from: d */
    private static final String f4782d = AbstractC3445n.m10503f("SystemAlarmService");

    /* renamed from: b */
    private C0820e f4783b;

    /* renamed from: c */
    private boolean f4784c;

    /* renamed from: e */
    private void m4187e() {
        C0820e c0820e = new C0820e(this);
        this.f4783b = c0820e;
        c0820e.m4227m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C0820e.c
    /* renamed from: a */
    public void mo4188a() {
        this.f4784c = true;
        AbstractC3445n.m10501c().mo10504a(f4782d, "All commands completed in dispatcher", new Throwable[0]);
        C2641m.m8849a();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m4187e();
        this.f4784c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4784c = true;
        this.f4783b.m4225j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f4784c) {
            AbstractC3445n.m10501c().mo10506d(f4782d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4783b.m4225j();
            m4187e();
            this.f4784c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4783b.m4219b(intent, i5);
        return 3;
    }
}
