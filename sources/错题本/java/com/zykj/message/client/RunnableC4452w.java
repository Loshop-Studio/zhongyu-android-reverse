package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.w */
/* loaded from: classes3.dex */
public final class RunnableC4452w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5722a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5723b;

    public RunnableC4452w(MessageClient.INSTANCES instances, InterfaceC6471c interfaceC6471c) {
        this.f5722a = instances;
        this.f5723b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient.INSTANCES instances = this.f5722a;
        InterfaceC5422d remoteServer = instances.getRemoteServer();
        instances.mHandler.post(new RunnableC4451v(this, remoteServer != null ? ((C5420b) remoteServer).m4812g() : null));
    }
}
