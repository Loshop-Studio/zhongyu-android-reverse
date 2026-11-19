package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.http.HttpNetworkDelegate;

/* loaded from: classes.dex */
public class NetworkService extends Service {

    /* renamed from: b */
    private Context f5512b;

    /* renamed from: c */
    private RemoteNetwork.Stub f5513c = null;

    /* renamed from: d */
    private RemoteNetwork.Stub f5514d = null;

    /* renamed from: a */
    IRemoteNetworkGetter.Stub f5511a = new IRemoteNetworkGetter.Stub() { // from class: anetwork.channel.aidl.NetworkService.1
        @Override // anetwork.channel.aidl.IRemoteNetworkGetter
        public RemoteNetwork get(int i4) throws RemoteException {
            return i4 == 1 ? NetworkService.this.f5513c : NetworkService.this.f5514d;
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f5512b = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.NetworkService", "onBind:" + intent.getAction(), null, new Object[0]);
        }
        this.f5513c = new DegradableNetworkDelegate(this.f5512b);
        this.f5514d = new HttpNetworkDelegate(this.f5512b);
        if (IRemoteNetworkGetter.class.getName().equals(intent.getAction())) {
            return this.f5511a;
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        return 2;
    }
}
