package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.b3 */
/* loaded from: classes3.dex */
public final class C4769b3 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f6923a;

    public C4769b3(String collectionId) {
        AbstractC5830k.m5330g(collectionId, "collectionId");
        this.f6923a = collectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4769b3) && AbstractC5830k.m5325b(this.f6923a, ((C4769b3) obj).f6923a);
    }

    public final int hashCode() {
        return this.f6923a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("SelectJoinCollection(collectionId=", this.f6923a, ")");
    }
}
