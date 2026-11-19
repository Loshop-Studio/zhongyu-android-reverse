package com.taobao.accs.messenger;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.taobao.accs.messenger.b */
/* loaded from: classes5.dex */
class HandlerC7635b extends Handler {

    /* renamed from: a */
    final /* synthetic */ MessengerService f13033a;

    public HandlerC7635b(MessengerService messengerService) {
        this.f13033a = messengerService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Intent intent;
        if (message == null || (intent = (Intent) message.getData().getParcelable("intent")) == null) {
            return;
        }
        this.f13033a.f13028a.execute(new RunnableC7636c(this, intent));
    }
}
