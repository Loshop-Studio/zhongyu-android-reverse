package com.zykj.mistake.main;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.z0 */
/* loaded from: classes3.dex */
public final class C5087z0 {

    /* renamed from: a */
    public final Integer f7981a;

    /* renamed from: b */
    public final Integer f7982b;

    /* renamed from: c */
    public final Integer f7983c;

    /* renamed from: d */
    public final ArrayList f7984d;

    /* renamed from: e */
    public final ArrayList f7985e;

    public C5087z0(Integer num, Integer num2, Integer num3, ArrayList arrayList, ArrayList arrayList2) {
        this.f7981a = num;
        this.f7982b = num2;
        this.f7983c = num3;
        this.f7984d = arrayList;
        this.f7985e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5087z0)) {
            return false;
        }
        C5087z0 c5087z0 = (C5087z0) obj;
        return AbstractC5830k.m5325b(this.f7981a, c5087z0.f7981a) && AbstractC5830k.m5325b(this.f7982b, c5087z0.f7982b) && AbstractC5830k.m5325b(this.f7983c, c5087z0.f7983c) && this.f7984d.equals(c5087z0.f7984d) && this.f7985e.equals(c5087z0.f7985e);
    }

    public final int hashCode() {
        Integer num = this.f7981a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7982b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7983c;
        return this.f7985e.hashCode() + ((this.f7984d.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "TagEditorSelection(diff=" + this.f7981a + ", attainedLevel=" + this.f7982b + ", errorReason=" + this.f7983c + ", tagIdList=" + this.f7984d + ", displayTags=" + this.f7985e + ")";
    }
}
