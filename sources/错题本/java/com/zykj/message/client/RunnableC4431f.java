package com.zykj.message.client;

import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.f */
/* loaded from: classes3.dex */
public final class RunnableC4431f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4433g f5691a;

    public RunnableC4431f(RunnableC4433g runnableC4433g) {
        this.f5691a = runnableC4433g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC4433g runnableC4433g = this.f5691a;
        InterfaceC6471c interfaceC6471c = runnableC4433g.f5694b;
        InterfaceC5422d remoteServer = runnableC4433g.f5693a.getRemoteServer();
        interfaceC6471c.invoke(remoteServer != null ? ((C5420b) remoteServer).m4810e() : null);
    }
}
