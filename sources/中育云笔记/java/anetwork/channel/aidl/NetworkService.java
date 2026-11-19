package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.http.HttpNetworkDelegate;

/* loaded from: classes3.dex */
public class NetworkService extends Service {

    /* renamed from: b */
    private Context f2790b;

    /* renamed from: c */
    private RemoteNetwork.Stub f2791c = null;

    /* renamed from: d */
    private RemoteNetwork.Stub f2792d = null;

    /* renamed from: a */
    IRemoteNetworkGetter.Stub f2789a = new IRemoteNetworkGetter.Stub() { // from class: anetwork.channel.aidl.NetworkService.1
        @Override // anetwork.channel.aidl.IRemoteNetworkGetter
        public RemoteNetwork get(int i10) {
            return i10 == 1 ? NetworkService.this.f2791c : NetworkService.this.f2792d;
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f2790b = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.NetworkService", "onBind:" + intent.getAction(), null, new Object[0]);
        }
        this.f2791c = new DegradableNetworkDelegate(this.f2790b);
        this.f2792d = new HttpNetworkDelegate(this.f2790b);
        if (IRemoteNetworkGetter.class.getName().equals(intent.getAction())) {
            return this.f2789a;
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }
}
