package com.zykj.mistake.feature.notebook.list;

import com.zykj.mistake.entity.req.MistakeListReq;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.j0 */
/* loaded from: classes3.dex */
public final class C4955j0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final MistakeListReq f7568a;

    public C4955j0(MistakeListReq mistakeListReq) {
        this.f7568a = mistakeListReq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4955j0) && AbstractC5830k.m5325b(this.f7568a, ((C4955j0) obj).f7568a);
    }

    public final int hashCode() {
        return this.f7568a.hashCode();
    }

    public final String toString() {
        return "ConfirmFilter(req=" + this.f7568a + ")";
    }
}
