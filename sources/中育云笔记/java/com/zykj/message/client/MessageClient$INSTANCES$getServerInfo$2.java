package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.Lambda;
import p048cb.InterfaceC5416b;
import p135eb.InterfaceC9115b;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class MessageClient$INSTANCES$getServerInfo$2 extends Lambda implements InterfaceC9529a {

    /* renamed from: c */
    public final /* synthetic */ MessageClient.INSTANCES f19802c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5416b f19803d;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$2$a */
    public static final class RunnableC8617a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$2$a$a */
        public static final class a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ServerInfo f19806d;

            public a(ServerInfo serverInfo) {
                this.f19806d = serverInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MessageClient$INSTANCES$getServerInfo$2.this.f19803d.mo2890a(this.f19806d);
            }
        }

        public RunnableC8617a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC9115b interfaceC9115bM16558D = MessageClient$INSTANCES$getServerInfo$2.this.f19802c.m16558D();
            MessageClient$INSTANCES$getServerInfo$2.this.f19802c.f19786l.post(new a(interfaceC9115bM16558D != null ? interfaceC9115bM16558D.mo17937k() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getServerInfo$2(MessageClient.INSTANCES instances, InterfaceC5416b interfaceC5416b) {
        super(0);
        this.f19802c = instances;
        this.f19803d = interfaceC5416b;
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m34045invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m34045invoke() {
        new Thread(new RunnableC8617a()).start();
    }
}
