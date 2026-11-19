package org.repackage.p131a.p132a.p133a.p134a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.p131a.p132a.p133a.InterfaceC2976a;

/* renamed from: org.repackage.a.a.a.a.b */
/* loaded from: classes.dex */
public class ServiceConnectionC2978b implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C2979c f11470a;

    public ServiceConnectionC2978b(C2979c c2979c) {
        this.f11470a = c2979c;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11470a.f11471a = InterfaceC2976a.a.m10043a(iBinder);
        synchronized (this.f11470a.f11474d) {
            this.f11470a.f11474d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f11470a.f11471a = null;
    }
}
