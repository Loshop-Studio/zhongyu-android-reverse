package com.taobao.accs.messenger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.taobao.accs.messenger.d */
/* loaded from: classes.dex */
public class ServiceConnectionC1740d implements ServiceConnection {

    /* renamed from: a */
    private final Context f7638a;

    /* renamed from: c */
    private Messenger f7640c;

    /* renamed from: d */
    private final String f7641d;

    /* renamed from: e */
    private final C1737a f7642e;

    /* renamed from: b */
    private int f7639b = 1;

    /* renamed from: f */
    private final long f7643f = System.currentTimeMillis();

    public ServiceConnectionC1740d(Context context, String str, C1737a c1737a) {
        this.f7638a = context;
        this.f7641d = str;
        this.f7642e = c1737a;
    }

    /* renamed from: a */
    public void m5979a(Intent intent) throws RemoteException {
        Message message = new Message();
        message.getData().putParcelable(MessengerService.INTENT, intent);
        this.f7640c.send(message);
    }

    /* renamed from: b */
    public boolean m5981b() {
        int i4 = this.f7639b;
        return i4 == 1 || i4 == 2;
    }

    /* renamed from: c */
    public boolean m5982c() {
        return this.f7639b == 1 && System.currentTimeMillis() - this.f7643f > 5000;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f7638a.unbindService(this);
            this.f7639b = 0;
        } else {
            this.f7640c = new Messenger(iBinder);
            this.f7639b = 2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f7642e.m5977a(this.f7641d, this);
        this.f7639b = 0;
        this.f7640c = null;
    }

    /* renamed from: a */
    public boolean m5980a() {
        return this.f7639b == 2;
    }
}
