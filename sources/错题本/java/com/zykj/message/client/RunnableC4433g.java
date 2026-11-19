package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.g */
/* loaded from: classes3.dex */
public final class RunnableC4433g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5693a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5694b;

    public RunnableC4433g(MessageClient.INSTANCES instances, InterfaceC6471c interfaceC6471c) {
        this.f5693a = instances;
        this.f5694b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5693a.mHandler.post(new RunnableC4431f(this));
    }
}
