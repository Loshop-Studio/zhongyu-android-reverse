package com.zykj.message.client;

import com.zykj.message.client.MessageClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MessageClient$INSTANCES$getServerInfo$2 extends Lambda implements InterfaceC6469a {
    final /* synthetic */ InterfaceC4425c $callBack;
    final /* synthetic */ MessageClient.INSTANCES this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageClient$INSTANCES$getServerInfo$2(MessageClient.INSTANCES instances, InterfaceC4425c interfaceC4425c) {
        super(0);
        this.this$0 = instances;
    }

    @Override // p152r6.InterfaceC6469a
    public /* bridge */ /* synthetic */ Object invoke() {
        m13844invoke();
        return C5443s.f8405a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m13844invoke() {
        new Thread(new RunnableC4442m(this)).start();
    }
}
