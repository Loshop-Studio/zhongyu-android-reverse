package com.zykj.mistake.feature.collection.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.n */
/* loaded from: classes3.dex */
public final class C4607n {

    /* renamed from: a */
    public final long f6510a;

    /* renamed from: b */
    public final String f6511b;

    public C4607n(long j7, String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f6510a = j7;
        this.f6511b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4607n)) {
            return false;
        }
        C4607n c4607n = (C4607n) obj;
        return this.f6510a == c4607n.f6510a && AbstractC5830k.m5325b(this.f6511b, c4607n.f6511b);
    }

    public final int hashCode() {
        return this.f6511b.hashCode() + (Long.hashCode(this.f6510a) * 31);
    }

    public final String toString() {
        return "FilterTagUiState(id=" + this.f6510a + ", name=" + this.f6511b + ")";
    }
}
