package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.l */
/* loaded from: classes3.dex */
public final class C4603l extends AbstractC4605m {

    /* renamed from: a */
    public final String f6507a;

    public C4603l(String str) {
        this.f6507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4603l) && AbstractC5830k.m5325b(this.f6507a, ((C4603l) obj).f6507a);
    }

    public final int hashCode() {
        return this.f6507a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f6507a, ")");
    }
}
