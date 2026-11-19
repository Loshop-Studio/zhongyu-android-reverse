package org.repackage.p203a.p204a.p205a.p206a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.p203a.p204a.p205a.InterfaceC9283a;

/* renamed from: org.repackage.a.a.a.a.b */
/* loaded from: classes5.dex */
public class ServiceConnectionC9285b implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C9286c f16011a;

    public ServiceConnectionC9285b(C9286c c9286c) {
        this.f16011a = c9286c;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16011a.f16012a = InterfaceC9283a.a.m15090a(iBinder);
        synchronized (this.f16011a.f16015d) {
            this.f16011a.f16015d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f16011a.f16012a = null;
    }
}
