package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.t */
/* loaded from: classes3.dex */
public final class C4721t extends AbstractC4722u {

    /* renamed from: a */
    public final String f6773a;

    public C4721t(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f6773a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4721t) && AbstractC5830k.m5325b(this.f6773a, ((C4721t) obj).f6773a);
    }

    public final int hashCode() {
        return this.f6773a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ToggleSelectCollection(id=", this.f6773a, ")");
    }
}
