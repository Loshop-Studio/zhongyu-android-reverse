package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.p0 */
/* loaded from: classes3.dex */
public final class C5067p0 extends AbstractC5057l {

    /* renamed from: a */
    public final long f7951a;

    /* renamed from: b */
    public final String f7952b;

    public C5067p0(long j7, String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f7951a = j7;
        this.f7952b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5067p0)) {
            return false;
        }
        C5067p0 c5067p0 = (C5067p0) obj;
        return this.f7951a == c5067p0.f7951a && AbstractC5830k.m5325b(this.f7952b, c5067p0.f7952b);
    }

    public final int hashCode() {
        return this.f7952b.hashCode() + (Long.hashCode(this.f7951a) * 31);
    }

    public final String toString() {
        return "OpenEditCustomTagDialog(id=" + this.f7951a + ", name=" + this.f7952b + ")";
    }
}
