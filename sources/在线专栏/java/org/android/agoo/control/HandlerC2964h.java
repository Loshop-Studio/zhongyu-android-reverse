package org.android.agoo.control;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.messenger.MessengerService;
import com.taobao.accs.utl.ALog;

/* renamed from: org.android.agoo.control.h */
/* loaded from: classes.dex */
class HandlerC2964h extends Handler {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f11448a;

    HandlerC2964h(BaseIntentService baseIntentService) {
        this.f11448a = baseIntentService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null) {
            ALog.m6093i("BaseIntentService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable(MessengerService.INTENT);
            if (intent != null) {
                ALog.m6093i("BaseIntentService", "handleMessage get intent success", MessengerService.INTENT, intent.toString());
                ThreadPoolExecutorFactory.execute(new RunnableC2965i(this, intent));
            }
        }
    }
}
