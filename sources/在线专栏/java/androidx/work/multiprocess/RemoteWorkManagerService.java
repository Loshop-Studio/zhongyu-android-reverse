package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p169x0.AbstractC3445n;

/* loaded from: classes.dex */
public class RemoteWorkManagerService extends Service {

    /* renamed from: b */
    static final String f4908b = AbstractC3445n.m10503f("RemoteWorkManagerService");

    /* renamed from: a */
    private IBinder f4909a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC3445n.m10501c().mo10506d(f4908b, "Binding to RemoteWorkManager", new Throwable[0]);
        return this.f4909a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4909a = new BinderC0836d(this);
    }
}
