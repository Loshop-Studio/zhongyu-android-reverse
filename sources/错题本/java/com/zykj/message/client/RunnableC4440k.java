package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.k */
/* loaded from: classes3.dex */
public final class RunnableC4440k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5704a;

    public RunnableC4440k(MessageClient.INSTANCES instances) {
        this.f5704a = instances;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient.INSTANCES instances = this.f5704a;
        InterfaceC5422d remoteServer = instances.getRemoteServer();
        instances.mHandler.post(new RunnableC4439j(this, remoteServer != null ? ((C5420b) remoteServer).m4811f() : null));
    }
}
