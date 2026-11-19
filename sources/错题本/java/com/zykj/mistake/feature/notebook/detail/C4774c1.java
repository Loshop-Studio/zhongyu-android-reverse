package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c1 */
/* loaded from: classes3.dex */
public final class C4774c1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final String f6939a;

    public C4774c1(String url) {
        AbstractC5830k.m5330g(url, "url");
        this.f6939a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4774c1) && AbstractC5830k.m5325b(this.f6939a, ((C4774c1) obj).f6939a);
    }

    public final int hashCode() {
        return this.f6939a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("PreviewPictureNote(url=", this.f6939a, ")");
    }
}
