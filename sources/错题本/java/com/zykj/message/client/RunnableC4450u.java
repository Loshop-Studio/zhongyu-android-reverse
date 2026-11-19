package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.u */
/* loaded from: classes3.dex */
public final class RunnableC4450u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient$INSTANCES$getUserInfo$2 f5719a;

    public RunnableC4450u(MessageClient$INSTANCES$getUserInfo$2 messageClient$INSTANCES$getUserInfo$2) {
        this.f5719a = messageClient$INSTANCES$getUserInfo$2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient$INSTANCES$getUserInfo$2 messageClient$INSTANCES$getUserInfo$2 = this.f5719a;
        InterfaceC5422d remoteServer = messageClient$INSTANCES$getUserInfo$2.this$0.getRemoteServer();
        messageClient$INSTANCES$getUserInfo$2.this$0.mHandler.post(new RunnableC4449t(this, remoteServer != null ? ((C5420b) remoteServer).m4812g() : null));
    }
}
