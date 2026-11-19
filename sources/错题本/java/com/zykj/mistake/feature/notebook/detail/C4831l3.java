package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.l3 */
/* loaded from: classes3.dex */
public final class C4831l3 {

    /* renamed from: a */
    public final int f7099a;

    /* renamed from: b */
    public final int f7100b;

    /* renamed from: c */
    public final int f7101c;

    /* renamed from: d */
    public final int f7102d;

    /* renamed from: e */
    public final int f7103e;

    /* renamed from: f */
    public final int f7104f;

    public C4831l3(int i, int i8, int i9, int i10, int i11, int i12) {
        this.f7099a = i;
        this.f7100b = i8;
        this.f7101c = i9;
        this.f7102d = i10;
        this.f7103e = i11;
        this.f7104f = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4831l3)) {
            return false;
        }
        C4831l3 c4831l3 = (C4831l3) obj;
        return this.f7099a == c4831l3.f7099a && this.f7100b == c4831l3.f7100b && this.f7101c == c4831l3.f7101c && this.f7102d == c4831l3.f7102d && this.f7103e == c4831l3.f7103e && this.f7104f == c4831l3.f7104f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7104f) + AbstractC0584a.m902c(this.f7103e, AbstractC0584a.m902c(this.f7102d, AbstractC0584a.m902c(this.f7101c, AbstractC0584a.m902c(this.f7100b, Integer.hashCode(this.f7099a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("ReviewPracticeSummary(totalCount=", ", correctCount=", this.f7099a, ", wrongCount=", this.f7100b);
        AbstractC1923c.m1059w(sbM99x, this.f7101c, ", progressPromotedCount=", this.f7102d, ", masteredCount=");
        sbM99x.append(this.f7103e);
        sbM99x.append(", practiceTotalCount=");
        sbM99x.append(this.f7104f);
        sbM99x.append(")");
        return sbM99x.toString();
    }
}
