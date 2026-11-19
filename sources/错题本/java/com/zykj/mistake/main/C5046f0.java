package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.f0 */
/* loaded from: classes3.dex */
public final class C5046f0 extends AbstractC5057l {

    /* renamed from: a */
    public final String f7910a;

    /* renamed from: b */
    public final String f7911b;

    public C5046f0(String startTime, String endTime) {
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f7910a = startTime;
        this.f7911b = endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5046f0)) {
            return false;
        }
        C5046f0 c5046f0 = (C5046f0) obj;
        return AbstractC5830k.m5325b(this.f7910a, c5046f0.f7910a) && AbstractC5830k.m5325b(this.f7911b, c5046f0.f7911b);
    }

    public final int hashCode() {
        return this.f7911b.hashCode() + (this.f7910a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0037f.m87l("ConfirmNotebookCustomTime(startTime=", this.f7910a, ", endTime=", this.f7911b, ")");
    }
}
