package org.android.agoo.control;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: org.android.agoo.control.j */
/* loaded from: classes6.dex */
class ServiceConnectionC10566j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f25333a;

    public ServiceConnectionC10566j(BaseIntentService baseIntentService) {
        this.f25333a = baseIntentService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
