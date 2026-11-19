package com.zykj.message.client;

/* renamed from: com.zykj.message.client.i */
/* loaded from: classes3.dex */
public final class RunnableC4437i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient$INSTANCES$getSNInfo$2 f5700a;

    public RunnableC4437i(MessageClient$INSTANCES$getSNInfo$2 messageClient$INSTANCES$getSNInfo$2) {
        this.f5700a = messageClient$INSTANCES$getSNInfo$2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5700a.this$0.mHandler.post(new RunnableC4435h(this));
    }
}
