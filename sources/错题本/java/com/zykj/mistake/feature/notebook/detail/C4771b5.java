package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.b5 */
/* loaded from: classes3.dex */
public final class C4771b5 {

    /* renamed from: a */
    public final String f6927a;

    /* renamed from: b */
    public final String f6928b;

    public C4771b5(String key, String url) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(url, "url");
        this.f6927a = key;
        this.f6928b = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4771b5)) {
            return false;
        }
        C4771b5 c4771b5 = (C4771b5) obj;
        return AbstractC5830k.m5325b(this.f6927a, c4771b5.f6927a) && AbstractC5830k.m5325b(this.f6928b, c4771b5.f6928b);
    }

    public final int hashCode() {
        return this.f6928b.hashCode() + (this.f6927a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0037f.m87l("PictureNoteDragItem(key=", this.f6927a, ", url=", this.f6928b, ")");
    }
}
