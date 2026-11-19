package com.zykj.message.client;

import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.v */
/* loaded from: classes3.dex */
public final class RunnableC4451v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4452w f5720a;

    /* renamed from: b */
    public final /* synthetic */ UserInfo f5721b;

    public RunnableC4451v(RunnableC4452w runnableC4452w, UserInfo userInfo) {
        this.f5720a = runnableC4452w;
        this.f5721b = userInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6471c interfaceC6471c = this.f5720a.f5723b;
        UserInfo userInfo = this.f5721b;
        if (userInfo != null) {
            interfaceC6471c.invoke(userInfo);
        } else {
            AbstractC5830k.m5337n();
            throw null;
        }
    }
}
