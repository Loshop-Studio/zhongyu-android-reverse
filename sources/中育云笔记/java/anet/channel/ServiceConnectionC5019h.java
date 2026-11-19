package anet.channel;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import anet.channel.util.ALog;

/* renamed from: anet.channel.h */
/* loaded from: classes3.dex */
class ServiceConnectionC5019h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ Intent f2446a;

    /* renamed from: b */
    final /* synthetic */ Context f2447b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f2448c;

    public ServiceConnectionC5019h(SessionRequest sessionRequest, Intent intent, Context context) {
        this.f2448c = sessionRequest;
        this.f2446a = intent;
        this.f2447b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m2527d("awcn.SessionRequest", "onServiceConnected", null, new Object[0]);
        try {
            try {
                Messenger messenger = new Messenger(iBinder);
                Message message = new Message();
                message.getData().putParcelable("intent", this.f2446a);
                messenger.send(message);
            } catch (Exception e10) {
                ALog.m2528e("awcn.SessionRequest", "onServiceConnected sendMessage error.", null, e10, new Object[0]);
            }
        } finally {
            this.f2447b.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m2527d("awcn.SessionRequest", "onServiceDisconnected", null, new Object[0]);
        this.f2447b.unbindService(this);
    }
}
