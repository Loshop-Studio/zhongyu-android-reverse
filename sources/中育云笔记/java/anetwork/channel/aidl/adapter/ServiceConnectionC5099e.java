package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;

/* renamed from: anetwork.channel.aidl.adapter.e */
/* loaded from: classes3.dex */
final class ServiceConnectionC5099e implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.RemoteGetter", "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
        }
        synchronized (C5098d.class) {
            try {
                C5098d.f2803a = IRemoteNetworkGetter.Stub.asInterface(iBinder);
                if (C5098d.f2806d != null) {
                    C5098d.f2806d.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5098d.f2804b = false;
        C5098d.f2805c = false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.RemoteGetter", "ANet_Service Disconnected", null, new Object[0]);
        }
        C5098d.f2803a = null;
        C5098d.f2805c = false;
        if (C5098d.f2806d != null) {
            C5098d.f2806d.countDown();
        }
    }
}
