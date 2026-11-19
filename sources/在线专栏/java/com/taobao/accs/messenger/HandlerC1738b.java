package com.taobao.accs.messenger;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.taobao.accs.messenger.b */
/* loaded from: classes.dex */
class HandlerC1738b extends Handler {

    /* renamed from: a */
    final /* synthetic */ MessengerService f7635a;

    HandlerC1738b(MessengerService messengerService) {
        this.f7635a = messengerService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Intent intent;
        if (message == null || (intent = (Intent) message.getData().getParcelable(MessengerService.INTENT)) == null) {
            return;
        }
        this.f7635a.f7630a.execute(new RunnableC1739c(this, intent));
    }
}
