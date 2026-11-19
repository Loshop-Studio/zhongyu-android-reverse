package com.efs.sdk.base.p039a.p050h.p052b;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p050h.p051a.RunnableC5688e;

/* renamed from: com.efs.sdk.base.a.h.b.c */
/* loaded from: classes3.dex */
public final class C5692c extends RunnableC5688e<HttpResponse> {

    /* renamed from: a */
    public C5691b f4752a;

    public C5692c(@NonNull C5691b c5691b) {
        super(c5691b);
        this.f4752a = c5691b;
    }

    @NonNull
    /* renamed from: b */
    public final HttpResponse m4167b() {
        this.f4752a.f4749e = "post";
        return m4147a();
    }
}
