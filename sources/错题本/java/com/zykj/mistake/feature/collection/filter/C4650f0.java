package com.zykj.mistake.feature.collection.filter;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.f0 */
/* loaded from: classes3.dex */
public final class C4650f0 extends AbstractC4674r0 {

    /* renamed from: a */
    public final Integer f6606a;

    public C4650f0(Integer num) {
        this.f6606a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4650f0) && AbstractC5830k.m5325b(this.f6606a, ((C4650f0) obj).f6606a);
    }

    public final int hashCode() {
        Integer num = this.f6606a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectAttainedLevel(value=" + this.f6606a + ")";
    }
}
