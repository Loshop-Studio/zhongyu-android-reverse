package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.y2 */
/* loaded from: classes3.dex */
public final class C4908y2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7415a;

    public C4908y2(String url) {
        AbstractC5830k.m5330g(url, "url");
        this.f7415a = url;
    }

    /* renamed from: a */
    public final String m4283a() {
        return this.f7415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4908y2) && AbstractC5830k.m5325b(this.f7415a, ((C4908y2) obj).f7415a);
    }

    public final int hashCode() {
        return this.f7415a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("RemovePictureNote(url=", this.f7415a, ")");
    }
}
