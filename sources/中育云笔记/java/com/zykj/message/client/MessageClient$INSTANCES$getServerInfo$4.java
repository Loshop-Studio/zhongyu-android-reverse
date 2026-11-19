package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p135eb.InterfaceC9115b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class MessageClient$INSTANCES$getServerInfo$4 extends Lambda implements InterfaceC9529a {

    /* renamed from: c */
    public final /* synthetic */ MessageClient.INSTANCES f19807c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9540l f19808d;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a */
    public static final class RunnableC8618a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a$a */
        public static final class a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ServerInfo f19811d;

            public a(ServerInfo serverInfo) {
                this.f19811d = serverInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9540l interfaceC9540l = MessageClient$INSTANCES$getServerInfo$4.this.f19808d;
                ServerInfo serverInfo = this.f19811d;
                if (serverInfo == null) {
                    AbstractC9979u.m20306s();
                }
                interfaceC9540l.invoke(serverInfo);
            }
        }

        public RunnableC8618a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC9115b interfaceC9115bM16558D = MessageClient$INSTANCES$getServerInfo$4.this.f19807c.m16558D();
            MessageClient$INSTANCES$getServerInfo$4.this.f19807c.f19786l.post(new a(interfaceC9115bM16558D != null ? interfaceC9115bM16558D.mo17937k() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getServerInfo$4(MessageClient.INSTANCES instances, InterfaceC9540l interfaceC9540l) {
        super(0);
        this.f19807c = instances;
        this.f19808d = interfaceC9540l;
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m34046invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m34046invoke() {
        new Thread(new RunnableC8618a()).start();
    }
}
