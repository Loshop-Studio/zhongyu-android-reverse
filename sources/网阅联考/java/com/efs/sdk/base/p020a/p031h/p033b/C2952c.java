package com.efs.sdk.base.p020a.p031h.p033b;

import android.support.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p031h.p032a.RunnableC2948e;

/* renamed from: com.efs.sdk.base.a.h.b.c */
/* loaded from: classes2.dex */
public final class C2952c extends RunnableC2948e<HttpResponse> {

    /* renamed from: a */
    public C2951b f1148a;

    public C2952c(@NonNull C2951b c2951b) {
        super(c2951b);
        this.f1148a = c2951b;
    }

    @NonNull
    /* renamed from: b */
    public final HttpResponse m2198b() {
        this.f1148a.f1145e = "post";
        return m2178a();
    }
}
