package com.zykj.mistake.feature.notebook.list;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.l0 */
/* loaded from: classes3.dex */
public final class C4961l0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final Integer f7575a;

    /* renamed from: b */
    public final Integer f7576b;

    /* renamed from: c */
    public final Integer f7577c;

    /* renamed from: d */
    public final ArrayList f7578d;

    /* renamed from: e */
    public final ArrayList f7579e;

    public C4961l0(Integer num, Integer num2, Integer num3, ArrayList arrayList, ArrayList arrayList2) {
        this.f7575a = num;
        this.f7576b = num2;
        this.f7577c = num3;
        this.f7578d = arrayList;
        this.f7579e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4961l0)) {
            return false;
        }
        C4961l0 c4961l0 = (C4961l0) obj;
        return AbstractC5830k.m5325b(this.f7575a, c4961l0.f7575a) && AbstractC5830k.m5325b(this.f7576b, c4961l0.f7576b) && AbstractC5830k.m5325b(this.f7577c, c4961l0.f7577c) && this.f7578d.equals(c4961l0.f7578d) && this.f7579e.equals(c4961l0.f7579e);
    }

    public final int hashCode() {
        Integer num = this.f7575a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7576b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7577c;
        return this.f7579e.hashCode() + ((this.f7578d.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ConfirmSetTags(diff=" + this.f7575a + ", attainedLevel=" + this.f7576b + ", errorReason=" + this.f7577c + ", tagIdList=" + this.f7578d + ", displayTags=" + this.f7579e + ")";
    }
}
