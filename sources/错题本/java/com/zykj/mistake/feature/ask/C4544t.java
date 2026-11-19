package com.zykj.mistake.feature.ask;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.t */
/* loaded from: classes3.dex */
public final class C4544t extends AbstractC4545u {

    /* renamed from: a */
    public final String f6297a;

    /* renamed from: b */
    public final String f6298b;

    public C4544t(String itemId, String previewPath) {
        AbstractC5830k.m5330g(itemId, "itemId");
        AbstractC5830k.m5330g(previewPath, "previewPath");
        this.f6297a = itemId;
        this.f6298b = previewPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4544t)) {
            return false;
        }
        C4544t c4544t = (C4544t) obj;
        return AbstractC5830k.m5325b(this.f6297a, c4544t.f6297a) && AbstractC5830k.m5325b(this.f6298b, c4544t.f6298b);
    }

    public final int hashCode() {
        return this.f6298b.hashCode() + (this.f6297a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0037f.m87l("WebPreviewReady(itemId=", this.f6297a, ", previewPath=", this.f6298b, ")");
    }
}
