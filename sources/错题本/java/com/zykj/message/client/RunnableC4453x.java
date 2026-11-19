package com.zykj.message.client;

import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.x */
/* loaded from: classes3.dex */
public final class RunnableC4453x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4454y f5724a;

    /* renamed from: b */
    public final /* synthetic */ UserInfo f5725b;

    public RunnableC4453x(RunnableC4454y runnableC4454y, UserInfo userInfo) {
        this.f5724a = runnableC4454y;
        this.f5725b = userInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6471c interfaceC6471c = this.f5724a.f5726a.$callBack;
        UserInfo userInfo = this.f5725b;
        if (userInfo != null) {
            interfaceC6471c.invoke(userInfo);
        } else {
            AbstractC5830k.m5337n();
            throw null;
        }
    }
}
