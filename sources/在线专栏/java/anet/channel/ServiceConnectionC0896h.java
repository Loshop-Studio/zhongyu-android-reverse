package anet.channel;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import anet.channel.util.ALog;
import com.taobao.accs.messenger.MessengerService;

/* renamed from: anet.channel.h */
/* loaded from: classes.dex */
class ServiceConnectionC0896h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ Intent f5168a;

    /* renamed from: b */
    final /* synthetic */ Context f5169b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f5170c;

    ServiceConnectionC0896h(SessionRequest sessionRequest, Intent intent, Context context) {
        this.f5170c = sessionRequest;
        this.f5168a = intent;
        this.f5169b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m4636d("awcn.SessionRequest", "onServiceConnected", null, new Object[0]);
        try {
            try {
                Messenger messenger = new Messenger(iBinder);
                Message message = new Message();
                message.getData().putParcelable(MessengerService.INTENT, this.f5168a);
                messenger.send(message);
            } catch (Exception e4) {
                ALog.m4637e("awcn.SessionRequest", "onServiceConnected sendMessage error.", null, e4, new Object[0]);
            }
        } finally {
            this.f5169b.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m4636d("awcn.SessionRequest", "onServiceDisconnected", null, new Object[0]);
        this.f5169b.unbindService(this);
    }
}
