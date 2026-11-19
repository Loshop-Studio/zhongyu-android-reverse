package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import com.taobao.accs.messenger.MessengerService;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.i */
/* loaded from: classes.dex */
class HandlerC1731i extends Handler {

    /* renamed from: a */
    final /* synthetic */ MsgDistributeService f7607a;

    HandlerC1731i(MsgDistributeService msgDistributeService) {
        this.f7607a = msgDistributeService;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message != null) {
            ALog.m6093i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable(MessengerService.INTENT);
            if (intent != null) {
                ALog.m6093i("MsgDistributeService", "handleMessage get intent success", MessengerService.INTENT, intent.toString());
                this.f7607a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
