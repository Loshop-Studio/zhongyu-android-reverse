package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;

/* renamed from: anetwork.channel.aidl.adapter.e */
/* loaded from: classes.dex */
final class ServiceConnectionC0976e implements ServiceConnection {
    ServiceConnectionC0976e() {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.RemoteGetter", "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
        }
        synchronized (C0975d.class) {
            C0975d.f5525a = IRemoteNetworkGetter.Stub.asInterface(iBinder);
            if (C0975d.f5528d != null) {
                C0975d.f5528d.countDown();
            }
        }
        C0975d.f5526b = false;
        C0975d.f5527c = false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.RemoteGetter", "ANet_Service Disconnected", null, new Object[0]);
        }
        C0975d.f5525a = null;
        C0975d.f5527c = false;
        if (C0975d.f5528d != null) {
            C0975d.f5528d.countDown();
        }
    }
}
