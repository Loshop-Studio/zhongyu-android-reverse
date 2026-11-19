package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p180n7.InterfaceC8669b;

@Metadata(m13556bv = {1, 0, 3}, m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MessageClient$INSTANCES$getUserInfo$4 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10663a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f10664b;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$4$a */
    public static final class RunnableC6997a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$4$a$a */
        public static final class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ UserInfo f10667b;

            public a(UserInfo userInfo) {
                this.f10667b = userInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Function1 function1 = MessageClient$INSTANCES$getUserInfo$4.this.f10664b;
                UserInfo userInfo = this.f10667b;
                if (userInfo == null) {
                    Intrinsics.throwNpe();
                }
                function1.invoke(userInfo);
            }
        }

        public RunnableC6997a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC8669b remoteServer = MessageClient$INSTANCES$getUserInfo$4.this.f10663a.getRemoteServer();
            MessageClient$INSTANCES$getUserInfo$4.this.f10663a.mHandler.post(new a(remoteServer != null ? remoteServer.mo14269b() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getUserInfo$4(MessageClient.INSTANCES instances, Function1 function1) {
        super(0);
        this.f10663a = instances;
        this.f10664b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new Thread(new RunnableC6997a()).start();
    }
}
