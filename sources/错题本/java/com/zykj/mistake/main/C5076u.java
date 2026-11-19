package com.zykj.mistake.main;

import com.zykj.mistake.entity.req.MistakeListReq;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.u */
/* loaded from: classes3.dex */
public final class C5076u extends AbstractC5020a0 {

    /* renamed from: a */
    public final MistakeListReq f7964a;

    public C5076u(MistakeListReq mistakeListReq) {
        this.f7964a = mistakeListReq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5076u) && AbstractC5830k.m5325b(this.f7964a, ((C5076u) obj).f7964a);
    }

    public final int hashCode() {
        return this.f7964a.hashCode();
    }

    public final String toString() {
        return "ConfirmNotebookFilter(filterReq=" + this.f7964a + ")";
    }
}
