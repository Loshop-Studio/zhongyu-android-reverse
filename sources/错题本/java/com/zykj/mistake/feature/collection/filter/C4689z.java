package com.zykj.mistake.feature.collection.filter;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.z */
/* loaded from: classes3.dex */
public final class C4689z extends AbstractC4674r0 {

    /* renamed from: a */
    public final C4661l f6732a;

    public C4689z(C4661l args) {
        AbstractC5830k.m5330g(args, "args");
        this.f6732a = args;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4689z) && AbstractC5830k.m5325b(this.f6732a, ((C4689z) obj).f6732a);
    }

    public final int hashCode() {
        return this.f6732a.hashCode();
    }

    public final String toString() {
        return "Init(args=" + this.f6732a + ")";
    }
}
