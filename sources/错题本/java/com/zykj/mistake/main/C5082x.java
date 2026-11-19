package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.x */
/* loaded from: classes3.dex */
public final class C5082x extends AbstractC5020a0 {

    /* renamed from: a */
    public final TagEditorTarget f7971a;

    /* renamed from: b */
    public final String f7972b;

    public C5082x(TagEditorTarget target, String name) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(name, "name");
        this.f7971a = target;
        this.f7972b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5082x)) {
            return false;
        }
        C5082x c5082x = (C5082x) obj;
        return this.f7971a == c5082x.f7971a && AbstractC5830k.m5325b(this.f7972b, c5082x.f7972b);
    }

    public final int hashCode() {
        return this.f7972b.hashCode() + (this.f7971a.hashCode() * 31);
    }

    public final String toString() {
        return "CreateCustomTag(target=" + this.f7971a + ", name=" + this.f7972b + ")";
    }
}
