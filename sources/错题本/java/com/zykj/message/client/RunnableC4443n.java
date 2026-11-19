package com.zykj.message.client;

import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.n */
/* loaded from: classes3.dex */
public final class RunnableC4443n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4444o f5707a;

    /* renamed from: b */
    public final /* synthetic */ ServerInfo f5708b;

    public RunnableC4443n(RunnableC4444o runnableC4444o, ServerInfo serverInfo) {
        this.f5707a = runnableC4444o;
        this.f5708b = serverInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6471c interfaceC6471c = this.f5707a.f5710b;
        ServerInfo serverInfo = this.f5708b;
        if (serverInfo != null) {
            interfaceC6471c.invoke(serverInfo);
        } else {
            AbstractC5830k.m5337n();
            throw null;
        }
    }
}
