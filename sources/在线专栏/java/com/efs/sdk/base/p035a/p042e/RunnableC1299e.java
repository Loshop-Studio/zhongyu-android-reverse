package com.efs.sdk.base.p035a.p042e;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p043f.C1302b;

/* renamed from: com.efs.sdk.base.a.e.e */
/* loaded from: classes.dex */
public final class RunnableC1299e implements Runnable {

    /* renamed from: a */
    private C1302b f7074a;

    /* renamed from: b */
    private InterfaceC1297c f7075b;

    /* renamed from: c */
    private String f7076c;

    public RunnableC1299e(C1302b c1302b, InterfaceC1297c interfaceC1297c, String str) {
        this.f7074a = c1302b;
        this.f7075b = interfaceC1297c;
        this.f7076c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1297c interfaceC1297c;
        C1302b c1302b = this.f7074a;
        HttpResponse httpResponse = (c1302b == null || (interfaceC1297c = this.f7075b) == null) ? new HttpResponse() : interfaceC1297c.mo5493a(c1302b, true);
        HandlerC1298d.m5503a().m5504a(this.f7076c, httpResponse.succ ? 0 : httpResponse.getHttpCode());
        this.f7076c = null;
        this.f7075b = null;
    }
}
