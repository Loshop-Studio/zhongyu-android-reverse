package com.zykj.message.client;

import android.content.Intent;
import android.util.Log;
import com.zykj.message.client.MessageClient;
import java.util.TimerTask;

/* renamed from: com.zykj.message.client.b0 */
/* loaded from: classes3.dex */
public final class C4424b0 extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5683a;

    public C4424b0(MessageClient.INSTANCES instances) {
        this.f5683a = instances;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Log.d("MessageClient", "重启服务 1S后的超时任务启动" + System.currentTimeMillis());
        Intent intent = new Intent(MessageClient.serverAction);
        intent.setPackage(MessageClient.serverPackageName);
        MessageClient.INSTANCES instances = this.f5683a;
        if (MessageClient.INSTANCES.access$getMContext$p(instances).bindService(intent, instances.mConnection, 1)) {
            return;
        }
        Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
        instances.mHandler.sendEmptyMessage(2);
    }
}
