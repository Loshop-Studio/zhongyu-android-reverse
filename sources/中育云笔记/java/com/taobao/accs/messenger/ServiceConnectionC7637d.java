package com.taobao.accs.messenger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.lifecycle.CoroutineLiveDataKt;

/* renamed from: com.taobao.accs.messenger.d */
/* loaded from: classes5.dex */
public class ServiceConnectionC7637d implements ServiceConnection {

    /* renamed from: a */
    private final Context f13036a;

    /* renamed from: c */
    private Messenger f13038c;

    /* renamed from: d */
    private final String f13039d;

    /* renamed from: e */
    private final C7634a f13040e;

    /* renamed from: b */
    private int f13037b = 1;

    /* renamed from: f */
    private final long f13041f = System.currentTimeMillis();

    public ServiceConnectionC7637d(Context context, String str, C7634a c7634a) {
        this.f13036a = context;
        this.f13039d = str;
        this.f13040e = c7634a;
    }

    /* renamed from: a */
    public void m10005a(Intent intent) throws RemoteException {
        Message message = new Message();
        message.getData().putParcelable("intent", intent);
        this.f13038c.send(message);
    }

    /* renamed from: b */
    public boolean m10007b() {
        int i10 = this.f13037b;
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public boolean m10008c() {
        return this.f13037b == 1 && System.currentTimeMillis() - this.f13041f > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f13036a.unbindService(this);
            this.f13037b = 0;
        } else {
            this.f13038c = new Messenger(iBinder);
            this.f13037b = 2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f13040e.m10003a(this.f13039d, this);
        this.f13037b = 0;
        this.f13038c = null;
    }

    /* renamed from: a */
    public boolean m10006a() {
        return this.f13037b == 2;
    }
}
