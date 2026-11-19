package com.zykj.message.client;

import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.p */
/* loaded from: classes3.dex */
public final class RunnableC4445p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4446q f5711a;

    /* renamed from: b */
    public final /* synthetic */ ServerInfo f5712b;

    public RunnableC4445p(RunnableC4446q runnableC4446q, ServerInfo serverInfo) {
        this.f5711a = runnableC4446q;
        this.f5712b = serverInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6471c interfaceC6471c = this.f5711a.f5713a.$callBack;
        ServerInfo serverInfo = this.f5712b;
        if (serverInfo != null) {
            interfaceC6471c.invoke(serverInfo);
        } else {
            AbstractC5830k.m5337n();
            throw null;
        }
    }
}
