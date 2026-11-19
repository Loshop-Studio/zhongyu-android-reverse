package com.zykj.mistake.feature.ask;

import androidx.collection.AbstractC0584a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.z */
/* loaded from: classes3.dex */
public final class C4550z {

    /* renamed from: a */
    public final List f6315a;

    /* renamed from: b */
    public final MistakeAskMaterialContract$MaterialType f6316b;

    /* renamed from: c */
    public final int f6317c;

    /* renamed from: d */
    public final int f6318d;

    public C4550z(List groups, MistakeAskMaterialContract$MaterialType selectedType, int i, int i8) {
        AbstractC5830k.m5330g(groups, "groups");
        AbstractC5830k.m5330g(selectedType, "selectedType");
        this.f6315a = groups;
        this.f6316b = selectedType;
        this.f6317c = i;
        this.f6318d = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* renamed from: a */
    public static C4550z m4017a(C4550z c4550z, ArrayList arrayList, MistakeAskMaterialContract$MaterialType selectedType, int i, int i8) {
        ArrayList groups = arrayList;
        if ((i8 & 1) != 0) {
            groups = c4550z.f6315a;
        }
        if ((i8 & 2) != 0) {
            selectedType = c4550z.f6316b;
        }
        if ((i8 & 4) != 0) {
            i = c4550z.f6317c;
        }
        int i9 = c4550z.f6318d;
        c4550z.getClass();
        c4550z.getClass();
        AbstractC5830k.m5330g(groups, "groups");
        AbstractC5830k.m5330g(selectedType, "selectedType");
        return new C4550z((List) groups, selectedType, i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4550z)) {
            return false;
        }
        C4550z c4550z = (C4550z) obj;
        return AbstractC5830k.m5325b(this.f6315a, c4550z.f6315a) && this.f6316b == c4550z.f6316b && this.f6317c == c4550z.f6317c && this.f6318d == c4550z.f6318d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0584a.m902c(this.f6318d, AbstractC0584a.m902c(this.f6317c, (this.f6316b.hashCode() + (this.f6315a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "State(groups=" + this.f6315a + ", selectedType=" + this.f6316b + ", selectedCount=" + this.f6317c + ", maxSelectedCount=" + this.f6318d + ", isPreparing=false)";
    }

    public C4550z(ArrayList arrayList, MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, int i, int i8) {
        this((i8 & 1) != 0 ? EmptyList.INSTANCE : arrayList, (i8 & 2) != 0 ? MistakeAskMaterialContract$MaterialType.STEM : mistakeAskMaterialContract$MaterialType, (i8 & 4) != 0 ? 0 : i, 5);
    }
}
