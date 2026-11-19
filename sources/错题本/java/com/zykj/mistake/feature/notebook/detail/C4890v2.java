package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.v2 */
/* loaded from: classes3.dex */
public final class C4890v2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7361a;

    public C4890v2(String url) {
        AbstractC5830k.m5330g(url, "url");
        this.f7361a = url;
    }

    /* renamed from: a */
    public final String m4269a() {
        return this.f7361a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4890v2) && AbstractC5830k.m5325b(this.f7361a, ((C4890v2) obj).f7361a);
    }

    public final int hashCode() {
        return this.f7361a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("PreviewPictureNote(url=", this.f7361a, ")");
    }
}
