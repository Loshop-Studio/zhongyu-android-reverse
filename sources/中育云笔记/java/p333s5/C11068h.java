package p333s5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* renamed from: s5.h */
/* loaded from: classes5.dex */
public class C11068h {

    /* renamed from: a */
    public ServiceConnection f26701a;

    /* renamed from: b */
    public Messenger f26702b = null;

    /* renamed from: s5.h$a */
    public class a implements ServiceConnection {

        /* renamed from: c */
        public final /* synthetic */ Bundle f26703c;

        /* renamed from: d */
        public final /* synthetic */ Context f26704d;

        public a(Bundle bundle, Context context) {
            this.f26703c = bundle;
            this.f26704d = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.m8727i("RemoteService", "remote service onConnected");
            C11068h.this.f26702b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f26703c);
            try {
                C11068h.this.f26702b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.m8727i("RemoteService", "remote service message send failed");
            }
            HMSLog.m8727i("RemoteService", "remote service unbindservice");
            this.f26704d.unbindService(C11068h.this.f26701a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.m8727i("RemoteService", "remote service onDisconnected");
            C11068h.this.f26702b = null;
        }
    }

    /* renamed from: c */
    public boolean m24544c(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f26701a = new a(bundle, applicationContext);
        HMSLog.m8727i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f26701a, 1);
    }
}
