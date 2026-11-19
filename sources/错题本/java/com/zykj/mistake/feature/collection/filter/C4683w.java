package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.w */
/* loaded from: classes3.dex */
public final class C4683w extends AbstractC4674r0 {

    /* renamed from: a */
    public final String f6724a;

    /* renamed from: b */
    public final String f6725b;

    public C4683w(String startTime, String endTime) {
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f6724a = startTime;
        this.f6725b = endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4683w)) {
            return false;
        }
        C4683w c4683w = (C4683w) obj;
        return AbstractC5830k.m5325b(this.f6724a, c4683w.f6724a) && AbstractC5830k.m5325b(this.f6725b, c4683w.f6725b);
    }

    public final int hashCode() {
        return this.f6725b.hashCode() + (this.f6724a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0037f.m87l("ConfirmCustomTime(startTime=", this.f6724a, ", endTime=", this.f6725b, ")");
    }
}
