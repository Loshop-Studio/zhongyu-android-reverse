package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.q */
/* loaded from: classes3.dex */
public final class RunnableC4446q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient$INSTANCES$getServerInfo$4 f5713a;

    public RunnableC4446q(MessageClient$INSTANCES$getServerInfo$4 messageClient$INSTANCES$getServerInfo$4) {
        this.f5713a = messageClient$INSTANCES$getServerInfo$4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient$INSTANCES$getServerInfo$4 messageClient$INSTANCES$getServerInfo$4 = this.f5713a;
        InterfaceC5422d remoteServer = messageClient$INSTANCES$getServerInfo$4.this$0.getRemoteServer();
        messageClient$INSTANCES$getServerInfo$4.this$0.mHandler.post(new RunnableC4445p(this, remoteServer != null ? ((C5420b) remoteServer).m4811f() : null));
    }
}
