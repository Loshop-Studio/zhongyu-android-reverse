package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p028c4.BinderC3224b;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.e0 */
/* loaded from: classes3.dex */
public final class RunnableC4430e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5688a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5689b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f5690c;

    public RunnableC4430e0(MessageClient.INSTANCES instances, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        this.f5688a = instances;
        this.f5689b = interfaceC6471c;
        this.f5690c = interfaceC6471c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5422d remoteServer = this.f5688a.getRemoteServer();
        if (remoteServer != null) {
            ((C5420b) remoteServer).m4813h(new BinderC3224b(this.f5689b, this.f5690c));
        }
    }
}
