package com.zykj.mistake.feature.collection.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.m0 */
/* loaded from: classes3.dex */
public final class C4606m0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final Integer f6509a;

    public C4606m0(Integer num) {
        this.f6509a = num;
    }

    /* renamed from: a */
    public final Integer m4045a() {
        return this.f6509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4606m0) && AbstractC5830k.m5325b(this.f6509a, ((C4606m0) obj).f6509a);
    }

    public final int hashCode() {
        Integer num = this.f6509a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "SelectAttainedLevel(value=" + this.f6509a + ")";
    }
}
