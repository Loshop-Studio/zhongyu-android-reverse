package com.zykj.mistake.feature.review;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.b */
/* loaded from: classes3.dex */
public final class C4994b extends AbstractC4995c {

    /* renamed from: a */
    public final String f7641a;

    public C4994b(String str) {
        this.f7641a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4994b) && AbstractC5830k.m5325b(this.f7641a, ((C4994b) obj).f7641a);
    }

    public final int hashCode() {
        return this.f7641a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f7641a, ")");
    }
}
