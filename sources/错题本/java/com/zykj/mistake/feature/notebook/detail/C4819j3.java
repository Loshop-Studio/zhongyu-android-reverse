package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.j3 */
/* loaded from: classes3.dex */
public final class C4819j3 {

    /* renamed from: a */
    public final String f7038a;

    /* renamed from: b */
    public final String f7039b;

    /* renamed from: c */
    public final String f7040c;

    /* renamed from: d */
    public final String f7041d;

    /* renamed from: e */
    public final Integer f7042e;

    /* renamed from: f */
    public final Integer f7043f;

    public C4819j3(String name, String snapshot, String address, String str, Integer num, Integer num2) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(snapshot, "snapshot");
        AbstractC5830k.m5330g(address, "address");
        this.f7038a = name;
        this.f7039b = snapshot;
        this.f7040c = address;
        this.f7041d = str;
        this.f7042e = num;
        this.f7043f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4819j3)) {
            return false;
        }
        C4819j3 c4819j3 = (C4819j3) obj;
        return AbstractC5830k.m5325b(this.f7038a, c4819j3.f7038a) && AbstractC5830k.m5325b(this.f7039b, c4819j3.f7039b) && AbstractC5830k.m5325b(this.f7040c, c4819j3.f7040c) && AbstractC5830k.m5325b(this.f7041d, c4819j3.f7041d) && AbstractC5830k.m5325b(this.f7042e, c4819j3.f7042e) && AbstractC5830k.m5325b(this.f7043f, c4819j3.f7043f);
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(this.f7038a.hashCode() * 31, 31, this.f7039b), 31, this.f7040c), 31, this.f7041d);
        Integer num = this.f7042e;
        int iHashCode = (iM903d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7043f;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("MicroLessonUiState(name=", this.f7038a, ", snapshot=", this.f7039b, ", address=");
        AbstractC1923c.m1060x(sbM101z, this.f7040c, ", timeText=", this.f7041d, ", examId=");
        sbM101z.append(this.f7042e);
        sbM101z.append(", questionId=");
        sbM101z.append(this.f7043f);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
