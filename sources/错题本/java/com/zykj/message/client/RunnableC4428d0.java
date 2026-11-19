package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p028c4.AbstractBinderC3223a;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.d0 */
/* loaded from: classes3.dex */
public final class RunnableC4428d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5685a;

    /* renamed from: b */
    public final /* synthetic */ AbstractBinderC3223a f5686b;

    public RunnableC4428d0(MessageClient.INSTANCES instances, AbstractBinderC3223a abstractBinderC3223a) {
        this.f5685a = instances;
        this.f5686b = abstractBinderC3223a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5422d remoteServer = this.f5685a.getRemoteServer();
        if (remoteServer != null) {
            ((C5420b) remoteServer).m4813h(this.f5686b);
        }
    }
}
