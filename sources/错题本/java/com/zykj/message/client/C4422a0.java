package com.zykj.message.client;

import android.os.Handler;
import android.os.Message;
import com.zykj.message.client.MessageClient;

/* renamed from: com.zykj.message.client.a0 */
/* loaded from: classes3.dex */
public final class C4422a0 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5677a;

    public C4422a0(MessageClient.INSTANCES instances) {
        this.f5677a = instances;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2) {
            return true;
        }
        MessageClient.INSTANCES instances = this.f5677a;
        instances.goUnLoginActivity(MessageClient.INSTANCES.access$getMContext$p(instances), false);
        return true;
    }
}
