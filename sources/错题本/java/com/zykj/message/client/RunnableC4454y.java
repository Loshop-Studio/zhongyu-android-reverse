package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.y */
/* loaded from: classes3.dex */
public final class RunnableC4454y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient$INSTANCES$getUserInfo$4 f5726a;

    public RunnableC4454y(MessageClient$INSTANCES$getUserInfo$4 messageClient$INSTANCES$getUserInfo$4) {
        this.f5726a = messageClient$INSTANCES$getUserInfo$4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient$INSTANCES$getUserInfo$4 messageClient$INSTANCES$getUserInfo$4 = this.f5726a;
        InterfaceC5422d remoteServer = messageClient$INSTANCES$getUserInfo$4.this$0.getRemoteServer();
        messageClient$INSTANCES$getUserInfo$4.this$0.mHandler.post(new RunnableC4453x(this, remoteServer != null ? ((C5420b) remoteServer).m4812g() : null));
    }
}
