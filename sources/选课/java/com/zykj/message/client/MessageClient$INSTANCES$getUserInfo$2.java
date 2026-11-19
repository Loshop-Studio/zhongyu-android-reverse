package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.MessageServer;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: MessageClient.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, m19k = 3, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
final class MessageClient$INSTANCES$getUserInfo$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DataCallBack $callBack;
    final /* synthetic */ MessageClient.INSTANCES this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageClient$INSTANCES$getUserInfo$2(MessageClient.INSTANCES instances, DataCallBack dataCallBack) {
        super(0);
        this.this$0 = instances;
        this.$callBack = dataCallBack;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$2.1
            @Override // java.lang.Runnable
            public final void run() {
                MessageServer remoteServer = MessageClient$INSTANCES$getUserInfo$2.this.this$0.getRemoteServer();
                final UserInfo userInfo = remoteServer != null ? remoteServer.getUserInfo() : null;
                MessageClient$INSTANCES$getUserInfo$2.this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient.INSTANCES.getUserInfo.2.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DataCallBack dataCallBack = MessageClient$INSTANCES$getUserInfo$2.this.$callBack;
                        UserInfo userInfo2 = userInfo;
                        if (userInfo2 == null) {
                            Intrinsics.throwNpe();
                        }
                        dataCallBack.response(userInfo2);
                    }
                });
            }
        }).start();
    }
}
