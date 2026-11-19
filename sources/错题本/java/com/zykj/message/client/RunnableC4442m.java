package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.m */
/* loaded from: classes3.dex */
public final class RunnableC4442m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient$INSTANCES$getServerInfo$2 f5706a;

    public RunnableC4442m(MessageClient$INSTANCES$getServerInfo$2 messageClient$INSTANCES$getServerInfo$2) {
        this.f5706a = messageClient$INSTANCES$getServerInfo$2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient$INSTANCES$getServerInfo$2 messageClient$INSTANCES$getServerInfo$2 = this.f5706a;
        InterfaceC5422d remoteServer = messageClient$INSTANCES$getServerInfo$2.this$0.getRemoteServer();
        messageClient$INSTANCES$getServerInfo$2.this$0.mHandler.post(new RunnableC4441l(this, remoteServer != null ? ((C5420b) remoteServer).m4811f() : null));
    }
}
