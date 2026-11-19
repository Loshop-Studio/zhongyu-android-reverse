package p344t5;

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

/* renamed from: t5.p */
/* loaded from: classes5.dex */
public class C11242p {

    /* renamed from: a */
    public ServiceConnection f26982a;

    /* renamed from: b */
    public Messenger f26983b = null;

    /* renamed from: t5.p$a */
    public class a implements ServiceConnection {

        /* renamed from: c */
        public final /* synthetic */ Bundle f26984c;

        /* renamed from: d */
        public final /* synthetic */ Context f26985d;

        public a(Bundle bundle, Context context) {
            this.f26984c = bundle;
            this.f26985d = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.m8727i("RemoteService", "remote service onConnected");
            C11242p.this.f26983b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f26984c);
            try {
                C11242p.this.f26983b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.m8727i("RemoteService", "remote service message send failed");
            }
            HMSLog.m8727i("RemoteService", "remote service unbindservice");
            this.f26985d.unbindService(C11242p.this.f26982a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.m8727i("RemoteService", "remote service onDisconnected");
            C11242p.this.f26983b = null;
        }
    }

    /* renamed from: c */
    public boolean m25074c(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f26982a = new a(bundle, applicationContext);
        HMSLog.m8727i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f26982a, 1);
    }
}
