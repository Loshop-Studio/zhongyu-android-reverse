package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.UserInfo;
import org.jetbrains.annotations.Nullable;
import p028c4.BinderC3224b;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.g0 */
/* loaded from: classes3.dex */
public final class RunnableC4434g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5695a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5696b;

    public RunnableC4434g0(MessageClient.INSTANCES instances, InterfaceC6471c interfaceC6471c) {
        this.f5695a = instances;
        this.f5696b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5422d remoteServer = this.f5695a.getRemoteServer();
        if (remoteServer != null) {
            ((C5420b) remoteServer).m4813h(new BinderC3224b(this.f5696b, new InterfaceC6471c() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$1$1
                public final void invoke(@Nullable UserInfo userInfo) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserInfo) obj);
                    return C5443s.f8405a;
                }
            }));
        }
    }
}
