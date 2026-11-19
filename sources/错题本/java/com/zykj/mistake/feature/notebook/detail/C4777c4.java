package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c4 */
/* loaded from: classes3.dex */
public final class C4777c4 {

    /* renamed from: a */
    public final String f6942a;

    /* renamed from: b */
    public final boolean f6943b;

    /* renamed from: c */
    public final boolean f6944c;

    public C4777c4(String str, boolean z8) {
        this.f6942a = str;
        this.f6943b = z8;
        this.f6944c = str != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4777c4)) {
            return false;
        }
        C4777c4 c4777c4 = (C4777c4) obj;
        return AbstractC5830k.m5325b(this.f6942a, c4777c4.f6942a) && this.f6943b == c4777c4.f6943b;
    }

    public final int hashCode() {
        String str = this.f6942a;
        return Boolean.hashCode(this.f6943b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BoardNoteLocalState(thumbnailPath=" + this.f6942a + ", isComplete=" + this.f6943b + ")";
    }
}
