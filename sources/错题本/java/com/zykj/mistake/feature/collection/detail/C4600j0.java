package com.zykj.mistake.feature.collection.detail;

import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.j0 */
/* loaded from: classes3.dex */
public final class C4600j0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final Set f6504a;

    public C4600j0(Set set) {
        this.f6504a = set;
    }

    /* renamed from: a */
    public final Set m4044a() {
        return this.f6504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4600j0) && AbstractC5830k.m5325b(this.f6504a, ((C4600j0) obj).f6504a);
    }

    public final int hashCode() {
        return this.f6504a.hashCode();
    }

    public final String toString() {
        return "RemoveItemsLocally(itemIds=" + this.f6504a + ")";
    }
}
