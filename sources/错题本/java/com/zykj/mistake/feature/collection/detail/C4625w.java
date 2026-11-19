package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.w */
/* loaded from: classes3.dex */
public final class C4625w extends AbstractC4630y0 {

    /* renamed from: a */
    public final String f6529a;

    /* renamed from: b */
    public final String f6530b;

    public C4625w(String startTime, String endTime) {
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f6529a = startTime;
        this.f6530b = endTime;
    }

    /* renamed from: a */
    public final String m4052a() {
        return this.f6530b;
    }

    /* renamed from: b */
    public final String m4053b() {
        return this.f6529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4625w)) {
            return false;
        }
        C4625w c4625w = (C4625w) obj;
        return AbstractC5830k.m5325b(this.f6529a, c4625w.f6529a) && AbstractC5830k.m5325b(this.f6530b, c4625w.f6530b);
    }

    public final int hashCode() {
        return this.f6530b.hashCode() + (this.f6529a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0037f.m87l("ConfirmCustomTime(startTime=", this.f6529a, ", endTime=", this.f6530b, ")");
    }
}
