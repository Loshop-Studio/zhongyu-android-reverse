package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class LifecycleService extends Service implements InterfaceC0504l {

    /* renamed from: a */
    private final C0487a0 f3367a = new C0487a0(this);

    @Override // androidx.lifecycle.InterfaceC0504l
    public AbstractC0496f getLifecycle() {
        return this.f3367a.m2825a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f3367a.m2826b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3367a.m2827c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3367a.m2828d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i4) {
        this.f3367a.m2829e();
        super.onStart(intent, i4);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
