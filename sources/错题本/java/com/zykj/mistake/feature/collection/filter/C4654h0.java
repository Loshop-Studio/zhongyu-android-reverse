package com.zykj.mistake.feature.collection.filter;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.h0 */
/* loaded from: classes3.dex */
public final class C4654h0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final Integer f6647a;

    public C4654h0(Integer num) {
        this.f6647a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4654h0) && AbstractC5830k.m5325b(this.f6647a, ((C4654h0) obj).f6647a);
    }

    public final int hashCode() {
        Integer num = this.f6647a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectDiff(value=" + this.f6647a + ")";
    }
}
