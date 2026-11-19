package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.r */
/* loaded from: classes3.dex */
public final class C4719r extends AbstractC4722u {

    /* renamed from: a */
    public final String f6771a;

    public C4719r(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f6771a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4719r) && AbstractC5830k.m5325b(this.f6771a, ((C4719r) obj).f6771a);
    }

    public final int hashCode() {
        return this.f6771a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ManageCollection(id=", this.f6771a, ")");
    }
}
