package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.m1 */
/* loaded from: classes3.dex */
public final class C4835m1 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7119a;

    public C4835m1(String str) {
        this.f7119a = str;
    }

    /* renamed from: a */
    public final String m4206a() {
        return this.f7119a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4835m1) && AbstractC5830k.m5325b(this.f7119a, ((C4835m1) obj).f7119a);
    }

    public final int hashCode() {
        return this.f7119a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("AddPictureNote(url=", this.f7119a, ")");
    }
}
