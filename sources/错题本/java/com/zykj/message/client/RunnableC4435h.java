package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.h */
/* loaded from: classes3.dex */
public final class RunnableC4435h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4437i f5697a;

    public RunnableC4435h(RunnableC4437i runnableC4437i) {
        this.f5697a = runnableC4437i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient$INSTANCES$getSNInfo$2 messageClient$INSTANCES$getSNInfo$2 = this.f5697a.f5700a;
        InterfaceC6471c interfaceC6471c = messageClient$INSTANCES$getSNInfo$2.$callBack;
        InterfaceC5422d remoteServer = messageClient$INSTANCES$getSNInfo$2.this$0.getRemoteServer();
        interfaceC6471c.invoke(remoteServer != null ? ((C5420b) remoteServer).m4810e() : null);
    }
}
