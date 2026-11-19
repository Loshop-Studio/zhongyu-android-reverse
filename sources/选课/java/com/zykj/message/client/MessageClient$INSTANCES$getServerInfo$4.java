package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.MessageServer;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: MessageClient.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, m19k = 3, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
final class MessageClient$INSTANCES$getServerInfo$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1 $callBack;
    final /* synthetic */ MessageClient.INSTANCES this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageClient$INSTANCES$getServerInfo$4(MessageClient.INSTANCES instances, Function1 function1) {
        super(0);
        this.this$0 = instances;
        this.$callBack = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$4.1
            @Override // java.lang.Runnable
            public final void run() {
                MessageServer remoteServer = MessageClient$INSTANCES$getServerInfo$4.this.this$0.getRemoteServer();
                final ServerInfo serverInfo = remoteServer != null ? remoteServer.getServerInfo() : null;
                MessageClient$INSTANCES$getServerInfo$4.this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient.INSTANCES.getServerInfo.4.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function1 function1 = MessageClient$INSTANCES$getServerInfo$4.this.$callBack;
                        ServerInfo serverInfo2 = serverInfo;
                        if (serverInfo2 == null) {
                            Intrinsics.throwNpe();
                        }
                        function1.invoke(serverInfo2);
                    }
                });
            }
        }).start();
    }
}
