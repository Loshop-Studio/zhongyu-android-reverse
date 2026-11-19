package com.aliyun.ams.emas.push;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.messenger.MessengerService;

/* renamed from: com.aliyun.ams.emas.push.e */
/* loaded from: classes.dex */
class HandlerC1197e extends Handler {

    /* renamed from: a */
    final /* synthetic */ AgooMessageIntentService f6920a;

    HandlerC1197e(AgooMessageIntentService agooMessageIntentService) {
        this.f6920a = agooMessageIntentService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Intent intent;
        if (message == null || (intent = (Intent) message.getData().getParcelable(MessengerService.INTENT)) == null) {
            return;
        }
        this.f6920a.onStartCommand(intent, 0, 0);
    }
}
