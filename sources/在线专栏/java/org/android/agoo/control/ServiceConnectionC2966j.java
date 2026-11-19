package org.android.agoo.control;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: org.android.agoo.control.j */
/* loaded from: classes.dex */
class ServiceConnectionC2966j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f11451a;

    ServiceConnectionC2966j(BaseIntentService baseIntentService) {
        this.f11451a = baseIntentService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
