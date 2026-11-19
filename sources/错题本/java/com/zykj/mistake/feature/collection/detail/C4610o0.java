package com.zykj.mistake.feature.collection.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.o0 */
/* loaded from: classes3.dex */
public final class C4610o0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final Integer f6514a;

    public C4610o0(Integer num) {
        this.f6514a = num;
    }

    /* renamed from: a */
    public final Integer m4047a() {
        return this.f6514a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4610o0) && AbstractC5830k.m5325b(this.f6514a, ((C4610o0) obj).f6514a);
    }

    public final int hashCode() {
        Integer num = this.f6514a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectDiff(value=" + this.f6514a + ")";
    }
}
