package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p035c4.InterfaceC5233b;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class MessageClient$INSTANCES$getServerInfo$4 extends Lambda implements InterfaceC10559a {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10441a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10570l f10442b;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a */
    public static final class RunnableC7408a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a$a */
        public static final class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ServerInfo f10445b;

            public a(ServerInfo serverInfo) {
                this.f10445b = serverInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC10570l interfaceC10570l = MessageClient$INSTANCES$getServerInfo$4.this.f10442b;
                ServerInfo serverInfo = this.f10445b;
                if (serverInfo == null) {
                    AbstractC9133u.m16145s();
                }
                interfaceC10570l.invoke(serverInfo);
            }
        }

        public RunnableC7408a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC5233b interfaceC5233bM9589v = MessageClient$INSTANCES$getServerInfo$4.this.f10441a.m9589v();
            MessageClient$INSTANCES$getServerInfo$4.this.f10441a.f10425j.post(new a(interfaceC5233bM9589v != null ? interfaceC5233bM9589v.mo2141j() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getServerInfo$4(MessageClient.INSTANCES instances, InterfaceC10570l interfaceC10570l) {
        super(0);
        this.f10441a = instances;
        this.f10442b = interfaceC10570l;
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m27501invoke();
        return C8736p.f16368a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m27501invoke() {
        new Thread(new RunnableC7408a()).start();
    }
}
