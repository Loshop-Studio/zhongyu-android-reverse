package com.zykj.mistake.feature.notebook.detail;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.v1 */
/* loaded from: classes3.dex */
public final class C4889v1 extends AbstractC4813i3 {

    /* renamed from: a */
    public final Integer f7356a;

    /* renamed from: b */
    public final Integer f7357b;

    /* renamed from: c */
    public final Integer f7358c;

    /* renamed from: d */
    public final ArrayList f7359d;

    /* renamed from: e */
    public final ArrayList f7360e;

    public C4889v1(Integer num, Integer num2, Integer num3, ArrayList arrayList, ArrayList arrayList2) {
        this.f7356a = num;
        this.f7357b = num2;
        this.f7358c = num3;
        this.f7359d = arrayList;
        this.f7360e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4889v1)) {
            return false;
        }
        C4889v1 c4889v1 = (C4889v1) obj;
        return AbstractC5830k.m5325b(this.f7356a, c4889v1.f7356a) && AbstractC5830k.m5325b(this.f7357b, c4889v1.f7357b) && AbstractC5830k.m5325b(this.f7358c, c4889v1.f7358c) && this.f7359d.equals(c4889v1.f7359d) && this.f7360e.equals(c4889v1.f7360e);
    }

    public final int hashCode() {
        Integer num = this.f7356a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7357b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7358c;
        return this.f7360e.hashCode() + ((this.f7359d.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ConfirmSetTags(diff=" + this.f7356a + ", attainedLevel=" + this.f7357b + ", errorReason=" + this.f7358c + ", tagIdList=" + this.f7359d + ", displayTags=" + this.f7360e + ")";
    }
}
