package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.g1 */
/* loaded from: classes3.dex */
public final class C4799g1 extends AbstractC4823k1 {

    /* renamed from: a */
    public final String f6998a;

    /* renamed from: b */
    public final String f6999b;

    public C4799g1(String str, String str2) {
        this.f6998a = str;
        this.f6999b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4799g1)) {
            return false;
        }
        C4799g1 c4799g1 = (C4799g1) obj;
        return AbstractC5830k.m5325b(this.f6998a, c4799g1.f6998a) && AbstractC5830k.m5325b(this.f6999b, c4799g1.f6999b);
    }

    public final int hashCode() {
        String str = this.f6998a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6999b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0037f.m87l("ShowAnswerImage(path=", this.f6998a, ", coverPath=", this.f6999b, ")");
    }
}
