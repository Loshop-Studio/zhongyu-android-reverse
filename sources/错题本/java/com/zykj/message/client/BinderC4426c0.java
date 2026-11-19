package com.zykj.message.client;

import com.zykj.message.server.bean.ServerInfo;
import p028c4.AbstractBinderC3225c;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.c0 */
/* loaded from: classes3.dex */
public final class BinderC4426c0 extends AbstractBinderC3225c {

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f5684d;

    public BinderC4426c0(InterfaceC6471c interfaceC6471c) {
        this.f5684d = interfaceC6471c;
    }

    @Override // p043d4.InterfaceC5419a
    /* renamed from: b */
    public final void mo2170b(ServerInfo serverInfo) {
        this.f5684d.invoke(serverInfo);
    }
}
