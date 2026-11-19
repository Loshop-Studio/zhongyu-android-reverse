package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.s */
/* loaded from: classes3.dex */
public final class RunnableC4448s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5716a;

    public RunnableC4448s(MessageClient.INSTANCES instances) {
        this.f5716a = instances;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient.INSTANCES instances = this.f5716a;
        InterfaceC5422d remoteServer = instances.getRemoteServer();
        instances.mHandler.post(new RunnableC4447r(this, remoteServer != null ? ((C5420b) remoteServer).m4812g() : null));
    }
}
