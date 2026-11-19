package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003a2.InterfaceC0010b;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m5175d2 = {"<anonymous>", "", "invoke"}, m5176k = 3, m5177mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class MessageClient$INSTANCES$getServerInfo$4 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f4261a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f4262b;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a */
    public static final class RunnableC3682a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4$a$a */
        public static final class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ServerInfo f4265b;

            public a(ServerInfo serverInfo) {
                this.f4265b = serverInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Function1 function1 = MessageClient$INSTANCES$getServerInfo$4.this.f4262b;
                ServerInfo serverInfo = this.f4265b;
                if (serverInfo == null) {
                    Intrinsics.throwNpe();
                }
                function1.invoke(serverInfo);
            }
        }

        public RunnableC3682a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0010b remoteServer = MessageClient$INSTANCES$getServerInfo$4.this.f4261a.getRemoteServer();
            MessageClient$INSTANCES$getServerInfo$4.this.f4261a.mHandler.post(new a(remoteServer != null ? remoteServer.mo21c() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getServerInfo$4(MessageClient.INSTANCES instances, Function1 function1) {
        super(0);
        this.f4261a = instances;
        this.f4262b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new Thread(new RunnableC3682a()).start();
    }
}
