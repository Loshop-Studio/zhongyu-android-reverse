package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.d4 */
/* loaded from: classes3.dex */
public final class C4784d4 {

    /* renamed from: a */
    public final int f6963a;

    /* renamed from: b */
    public final long f6964b;

    /* renamed from: c */
    public final String f6965c;

    public C4784d4(long j7, int i, String md5) {
        AbstractC5830k.m5330g(md5, "md5");
        this.f6963a = i;
        this.f6964b = j7;
        this.f6965c = md5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4784d4)) {
            return false;
        }
        C4784d4 c4784d4 = (C4784d4) obj;
        return this.f6963a == c4784d4.f6963a && this.f6964b == c4784d4.f6964b && AbstractC5830k.m5325b(this.f6965c, c4784d4.f6965c);
    }

    public final int hashCode() {
        return this.f6965c.hashCode() + AbstractC0584a.m897B(this.f6964b, Integer.hashCode(this.f6963a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftSignature(itemId=");
        sb.append(this.f6963a);
        sb.append(", length=");
        sb.append(this.f6964b);
        return AbstractC0037f.m92q(sb, ", md5=", this.f6965c, ")");
    }
}
