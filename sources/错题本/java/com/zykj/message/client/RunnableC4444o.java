package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.o */
/* loaded from: classes3.dex */
public final class RunnableC4444o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5709a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5710b;

    public RunnableC4444o(MessageClient.INSTANCES instances, InterfaceC6471c interfaceC6471c) {
        this.f5709a = instances;
        this.f5710b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageClient.INSTANCES instances = this.f5709a;
        InterfaceC5422d remoteServer = instances.getRemoteServer();
        instances.mHandler.post(new RunnableC4443n(this, remoteServer != null ? ((C5420b) remoteServer).m4811f() : null));
    }
}
