package com.efs.sdk.base.p020a.p027e;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p028f.C2930b;

/* renamed from: com.efs.sdk.base.a.e.e */
/* loaded from: classes2.dex */
public final class RunnableC2927e implements Runnable {

    /* renamed from: a */
    private C2930b f1104a;

    /* renamed from: b */
    private InterfaceC2925c f1105b;

    /* renamed from: c */
    private String f1106c;

    public RunnableC2927e(C2930b c2930b, InterfaceC2925c interfaceC2925c, String str) {
        this.f1104a = c2930b;
        this.f1105b = interfaceC2925c;
        this.f1106c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2925c interfaceC2925c;
        C2930b c2930b = this.f1104a;
        HttpResponse httpResponse = (c2930b == null || (interfaceC2925c = this.f1105b) == null) ? new HttpResponse() : interfaceC2925c.mo2134a(c2930b, true);
        HandlerC2926d.m2144a().m2145a(this.f1106c, httpResponse.succ ? 0 : httpResponse.getHttpCode());
        this.f1106c = null;
        this.f1105b = null;
    }
}
