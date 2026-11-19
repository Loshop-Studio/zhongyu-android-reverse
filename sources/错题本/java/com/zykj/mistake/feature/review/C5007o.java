package com.zykj.mistake.feature.review;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;

/* renamed from: com.zykj.mistake.feature.review.o */
/* loaded from: classes3.dex */
public final class C5007o {

    /* renamed from: a */
    public final int f7704a;

    /* renamed from: b */
    public final int f7705b;

    /* renamed from: c */
    public final int f7706c;

    /* renamed from: d */
    public final int f7707d;

    /* renamed from: e */
    public final int f7708e;

    /* renamed from: f */
    public final int f7709f;

    public /* synthetic */ C5007o(int i, int i8) {
        this(0, 0, 0, 0, 0, (i8 & 32) != 0 ? 0 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5007o)) {
            return false;
        }
        C5007o c5007o = (C5007o) obj;
        return this.f7704a == c5007o.f7704a && this.f7705b == c5007o.f7705b && this.f7706c == c5007o.f7706c && this.f7707d == c5007o.f7707d && this.f7708e == c5007o.f7708e && this.f7709f == c5007o.f7709f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7709f) + AbstractC0584a.m902c(this.f7708e, AbstractC0584a.m902c(this.f7707d, AbstractC0584a.m902c(this.f7706c, AbstractC0584a.m902c(this.f7705b, Integer.hashCode(this.f7704a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("Summary(totalCount=", ", correctCount=", this.f7704a, ", wrongCount=", this.f7705b);
        AbstractC1923c.m1059w(sbM99x, this.f7706c, ", progressPromotedCount=", this.f7707d, ", masteredCount=");
        sbM99x.append(this.f7708e);
        sbM99x.append(", practiceTotalCount=");
        sbM99x.append(this.f7709f);
        sbM99x.append(")");
        return sbM99x.toString();
    }

    public C5007o(int i, int i8, int i9, int i10, int i11, int i12) {
        this.f7704a = i;
        this.f7705b = i8;
        this.f7706c = i9;
        this.f7707d = i10;
        this.f7708e = i11;
        this.f7709f = i12;
    }
}
