package com.zykj.mistake.feature.review;

import com.zykj.mistake.entity.resp.MistakeDetail;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.l */
/* loaded from: classes3.dex */
public final class C5004l {

    /* renamed from: a */
    public final MistakeDetail f7689a;

    /* renamed from: b */
    public final List f7690b;

    public C5004l(MistakeDetail mistakeDetail, List details) {
        AbstractC5830k.m5330g(details, "details");
        this.f7689a = mistakeDetail;
        this.f7690b = details;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5004l)) {
            return false;
        }
        C5004l c5004l = (C5004l) obj;
        return AbstractC5830k.m5325b(this.f7689a, c5004l.f7689a) && AbstractC5830k.m5325b(this.f7690b, c5004l.f7690b);
    }

    public final int hashCode() {
        MistakeDetail mistakeDetail = this.f7689a;
        return this.f7690b.hashCode() + ((mistakeDetail == null ? 0 : mistakeDetail.hashCode()) * 31);
    }

    public final String toString() {
        return "QuestionDetail(detail=" + this.f7689a + ", details=" + this.f7690b + ")";
    }
}
