package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.z0 */
/* loaded from: classes3.dex */
public final class C4912z0 extends AbstractC4823k1 {

    /* renamed from: a */
    public final String f7424a;

    /* renamed from: b */
    public final Integer f7425b;

    /* renamed from: c */
    public final Integer f7426c;

    public C4912z0(String address, Integer num, Integer num2) {
        AbstractC5830k.m5330g(address, "address");
        this.f7424a = address;
        this.f7425b = num;
        this.f7426c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4912z0)) {
            return false;
        }
        C4912z0 c4912z0 = (C4912z0) obj;
        return AbstractC5830k.m5325b(this.f7424a, c4912z0.f7424a) && AbstractC5830k.m5325b(this.f7425b, c4912z0.f7425b) && AbstractC5830k.m5325b(this.f7426c, c4912z0.f7426c);
    }

    public final int hashCode() {
        int iHashCode = this.f7424a.hashCode() * 31;
        Integer num = this.f7425b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7426c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "OpenMicroLesson(address=" + this.f7424a + ", examId=" + this.f7425b + ", questionId=" + this.f7426c + ")";
    }
}
