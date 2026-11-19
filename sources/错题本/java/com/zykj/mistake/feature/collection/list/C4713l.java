package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.l */
/* loaded from: classes3.dex */
public final class C4713l extends AbstractC4722u {

    /* renamed from: a */
    public final String f6765a;

    public C4713l(String id) {
        AbstractC5830k.m5330g(id, "id");
        this.f6765a = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4713l) && AbstractC5830k.m5325b(this.f6765a, ((C4713l) obj).f6765a);
    }

    public final int hashCode() {
        return this.f6765a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ClickCollection(id=", this.f6765a, ")");
    }
}
