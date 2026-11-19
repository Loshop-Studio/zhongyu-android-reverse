package com.efs.sdk.base.p035a.p046h.p048b;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p046h.p047a.RunnableC1320e;

/* renamed from: com.efs.sdk.base.a.h.b.c */
/* loaded from: classes.dex */
public final class C1324c extends RunnableC1320e<HttpResponse> {

    /* renamed from: a */
    public C1323b f7118a;

    C1324c(C1323b c1323b) {
        super(c1323b);
        this.f7118a = c1323b;
    }

    /* renamed from: b */
    public final HttpResponse m5557b() {
        this.f7118a.f7115e = "post";
        return m5537a();
    }
}
