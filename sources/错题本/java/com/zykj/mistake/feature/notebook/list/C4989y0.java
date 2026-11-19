package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.y0 */
/* loaded from: classes3.dex */
public final class C4989y0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final String f7625a;

    public C4989y0(String collectionId) {
        AbstractC5830k.m5330g(collectionId, "collectionId");
        this.f7625a = collectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4989y0) && AbstractC5830k.m5325b(this.f7625a, ((C4989y0) obj).f7625a);
    }

    public final int hashCode() {
        return this.f7625a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("SelectJoinCollection(collectionId=", this.f7625a, ")");
    }
}
