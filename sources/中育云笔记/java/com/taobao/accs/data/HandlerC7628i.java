package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.i */
/* loaded from: classes5.dex */
class HandlerC7628i extends Handler {

    /* renamed from: a */
    final /* synthetic */ MsgDistributeService f13005a;

    public HandlerC7628i(MsgDistributeService msgDistributeService) {
        this.f13005a = msgDistributeService;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message != null) {
            ALog.m10119i("MsgDistributeService", "handleMessage on receive msg", NotificationCompat.CATEGORY_MESSAGE, message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m10119i("MsgDistributeService", "handleMessage get intent success", "intent", intent.toString());
                this.f13005a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
