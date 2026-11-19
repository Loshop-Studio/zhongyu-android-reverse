package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.s2 */
/* loaded from: classes3.dex */
public final class C4872s2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7294a;

    /* renamed from: b */
    public final Integer f7295b;

    /* renamed from: c */
    public final Integer f7296c;

    public C4872s2(String address, Integer num, Integer num2) {
        AbstractC5830k.m5330g(address, "address");
        this.f7294a = address;
        this.f7295b = num;
        this.f7296c = num2;
    }

    /* renamed from: a */
    public final String m4238a() {
        return this.f7294a;
    }

    /* renamed from: b */
    public final Integer m4239b() {
        return this.f7295b;
    }

    /* renamed from: c */
    public final Integer m4240c() {
        return this.f7296c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4872s2)) {
            return false;
        }
        C4872s2 c4872s2 = (C4872s2) obj;
        return AbstractC5830k.m5325b(this.f7294a, c4872s2.f7294a) && AbstractC5830k.m5325b(this.f7295b, c4872s2.f7295b) && AbstractC5830k.m5325b(this.f7296c, c4872s2.f7296c);
    }

    public final int hashCode() {
        int iHashCode = this.f7294a.hashCode() * 31;
        Integer num = this.f7295b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7296c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "OpenMicroLesson(address=" + this.f7294a + ", examId=" + this.f7295b + ", questionId=" + this.f7296c + ")";
    }
}
