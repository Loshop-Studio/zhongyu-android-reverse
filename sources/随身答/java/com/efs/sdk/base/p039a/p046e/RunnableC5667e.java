package com.efs.sdk.base.p039a.p046e;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p047f.C5670b;

/* renamed from: com.efs.sdk.base.a.e.e */
/* loaded from: classes3.dex */
public final class RunnableC5667e implements Runnable {

    /* renamed from: a */
    private C5670b f4708a;

    /* renamed from: b */
    private InterfaceC5665c f4709b;

    /* renamed from: c */
    private String f4710c;

    public RunnableC5667e(C5670b c5670b, InterfaceC5665c interfaceC5665c, String str) {
        this.f4708a = c5670b;
        this.f4709b = interfaceC5665c;
        this.f4710c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5665c interfaceC5665c;
        C5670b c5670b = this.f4708a;
        HttpResponse httpResponse = (c5670b == null || (interfaceC5665c = this.f4709b) == null) ? new HttpResponse() : interfaceC5665c.mo4103a(c5670b, true);
        HandlerC5666d.m4113a().m4114a(this.f4710c, httpResponse.succ ? 0 : httpResponse.getHttpCode());
        this.f4710c = null;
        this.f4709b = null;
    }
}
