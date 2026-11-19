package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.j1 */
/* loaded from: classes3.dex */
public final class C4817j1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final String f7036a;

    public C4817j1(String str) {
        this.f7036a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4817j1) && AbstractC5830k.m5325b(this.f7036a, ((C4817j1) obj).f7036a);
    }

    public final int hashCode() {
        return this.f7036a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f7036a, ")");
    }
}
