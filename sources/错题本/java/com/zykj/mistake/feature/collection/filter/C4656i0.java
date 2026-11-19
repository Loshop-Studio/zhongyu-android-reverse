package com.zykj.mistake.feature.collection.filter;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.i0 */
/* loaded from: classes3.dex */
public final class C4656i0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final Integer f6648a;

    public C4656i0(Integer num) {
        this.f6648a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4656i0) && AbstractC5830k.m5325b(this.f6648a, ((C4656i0) obj).f6648a);
    }

    public final int hashCode() {
        Integer num = this.f6648a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectErrorReason(value=" + this.f6648a + ")";
    }
}
