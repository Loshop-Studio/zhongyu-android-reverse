package org.android.agoo.control;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* renamed from: org.android.agoo.control.h */
/* loaded from: classes6.dex */
class HandlerC10564h extends Handler {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f25330a;

    public HandlerC10564h(BaseIntentService baseIntentService) {
        this.f25330a = baseIntentService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null) {
            ALog.m10119i("BaseIntentService", "handleMessage on receive msg", NotificationCompat.CATEGORY_MESSAGE, message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m10119i("BaseIntentService", "handleMessage get intent success", "intent", intent.toString());
                ThreadPoolExecutorFactory.execute(new RunnableC10565i(this, intent));
            }
        }
    }
}
