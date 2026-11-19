package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p096e6.InterfaceC7852b;

@Metadata(m13411bv = {1, 0, 3}, m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13413d2 = {"<anonymous>", "", "invoke"}, m13414k = 3, m13415mv = {1, 1, 15})
/* loaded from: classes4.dex */
public final class MessageClient$INSTANCES$getUserInfo$4 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10109a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f10110b;

    /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$4$a */
    public static final class RunnableC7234a implements Runnable {

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$4$a$a */
        public static final class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ UserInfo f10113b;

            public a(UserInfo userInfo) {
                this.f10113b = userInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Function1 function1 = MessageClient$INSTANCES$getUserInfo$4.this.f10110b;
                UserInfo userInfo = this.f10113b;
                if (userInfo == null) {
                    Intrinsics.throwNpe();
                }
                function1.invoke(userInfo);
            }
        }

        public RunnableC7234a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC7852b remoteServer = MessageClient$INSTANCES$getUserInfo$4.this.f10109a.getRemoteServer();
            MessageClient$INSTANCES$getUserInfo$4.this.f10109a.mHandler.post(new a(remoteServer != null ? remoteServer.mo12326c() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getUserInfo$4(MessageClient.INSTANCES instances, Function1 function1) {
        super(0);
        this.f10109a = instances;
        this.f10110b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new Thread(new RunnableC7234a()).start();
    }
}
