package com.zykj.mistake.feature.ask;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.n */
/* loaded from: classes3.dex */
public final class C4536n {

    /* renamed from: a */
    public final MistakeAskMaterialContract$MaterialType f6274a;

    /* renamed from: b */
    public final String f6275b;

    /* renamed from: c */
    public final int f6276c;

    /* renamed from: d */
    public final int f6277d;

    /* renamed from: e */
    public final List f6278e;

    public C4536n(MistakeAskMaterialContract$MaterialType type, String title, int i, int i8, List list) {
        AbstractC5830k.m5330g(type, "type");
        AbstractC5830k.m5330g(title, "title");
        this.f6274a = type;
        this.f6275b = title;
        this.f6276c = i;
        this.f6277d = i8;
        this.f6278e = list;
    }

    /* renamed from: a */
    public static C4536n m4002a(C4536n c4536n, int i, ArrayList arrayList, int i8) {
        MistakeAskMaterialContract$MaterialType type = c4536n.f6274a;
        String title = c4536n.f6275b;
        if ((i8 & 4) != 0) {
            i = c4536n.f6276c;
        }
        int i9 = c4536n.f6277d;
        AbstractC5830k.m5330g(type, "type");
        AbstractC5830k.m5330g(title, "title");
        return new C4536n(type, title, i, i9, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4536n)) {
            return false;
        }
        C4536n c4536n = (C4536n) obj;
        return this.f6274a == c4536n.f6274a && AbstractC5830k.m5325b(this.f6275b, c4536n.f6275b) && this.f6276c == c4536n.f6276c && this.f6277d == c4536n.f6277d && AbstractC5830k.m5325b(this.f6278e, c4536n.f6278e);
    }

    public final int hashCode() {
        return this.f6278e.hashCode() + AbstractC0584a.m902c(this.f6277d, AbstractC0584a.m902c(this.f6276c, AbstractC0584a.m903d(this.f6274a.hashCode() * 31, 31, this.f6275b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupUiState(type=");
        sb.append(this.f6274a);
        sb.append(", title=");
        sb.append(this.f6275b);
        sb.append(", selectedCount=");
        AbstractC1923c.m1059w(sb, this.f6276c, ", totalCount=", this.f6277d, ", items=");
        sb.append(this.f6278e);
        sb.append(")");
        return sb.toString();
    }
}
