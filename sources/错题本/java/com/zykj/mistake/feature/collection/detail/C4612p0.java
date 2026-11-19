package com.zykj.mistake.feature.collection.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.p0 */
/* loaded from: classes3.dex */
public final class C4612p0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final Integer f6516a;

    public C4612p0(Integer num) {
        this.f6516a = num;
    }

    /* renamed from: a */
    public final Integer m4048a() {
        return this.f6516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4612p0) && AbstractC5830k.m5325b(this.f6516a, ((C4612p0) obj).f6516a);
    }

    public final int hashCode() {
        Integer num = this.f6516a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectErrorReason(value=" + this.f6516a + ")";
    }
}
