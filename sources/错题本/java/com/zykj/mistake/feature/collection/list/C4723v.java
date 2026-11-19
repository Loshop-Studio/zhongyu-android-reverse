package com.zykj.mistake.feature.collection.list;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.v */
/* loaded from: classes3.dex */
public final class C4723v {

    /* renamed from: a */
    public final String f6774a;

    /* renamed from: b */
    public final int f6775b;

    /* renamed from: c */
    public final List f6776c;

    /* renamed from: d */
    public final boolean f6777d;

    /* renamed from: e */
    public final boolean f6778e;

    /* renamed from: f */
    public final boolean f6779f;

    /* renamed from: g */
    public final boolean f6780g;

    /* renamed from: h */
    public final String f6781h;

    /* renamed from: i */
    public final String f6782i;

    /* renamed from: j */
    public final boolean f6783j;

    /* renamed from: k */
    public final boolean f6784k;

    /* renamed from: l */
    public final Set f6785l;

    public C4723v(String str, int i, List items, boolean z8, boolean z9, boolean z10, boolean z11, String str2, String str3, boolean z12, boolean z13, Set selectedCollectionIds) {
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(selectedCollectionIds, "selectedCollectionIds");
        this.f6774a = str;
        this.f6775b = i;
        this.f6776c = items;
        this.f6777d = z8;
        this.f6778e = z9;
        this.f6779f = z10;
        this.f6780g = z11;
        this.f6781h = str2;
        this.f6782i = str3;
        this.f6783j = z12;
        this.f6784k = z13;
        this.f6785l = selectedCollectionIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.List] */
    /* renamed from: a */
    public static C4723v m4099a(C4723v c4723v, int i, ArrayList arrayList, boolean z8, boolean z9, String str, String str2, boolean z10, boolean z11, Set set, int i8) {
        String title = c4723v.f6774a;
        if ((i8 & 2) != 0) {
            i = c4723v.f6775b;
        }
        int i9 = i;
        ArrayList items = (i8 & 4) != 0 ? c4723v.f6776c : arrayList;
        boolean z12 = (i8 & 8) != 0 ? c4723v.f6777d : z8;
        boolean z13 = (i8 & 16) != 0 ? c4723v.f6778e : false;
        boolean z14 = (i8 & 32) != 0 ? c4723v.f6779f : false;
        boolean z15 = (i8 & 64) != 0 ? c4723v.f6780g : z9;
        String createName = (i8 & 128) != 0 ? c4723v.f6781h : str;
        String createNameError = (i8 & 256) != 0 ? c4723v.f6782i : str2;
        boolean z16 = (i8 & 512) != 0 ? c4723v.f6783j : z10;
        boolean z17 = (i8 & 1024) != 0 ? c4723v.f6784k : z11;
        Set selectedCollectionIds = (i8 & 2048) != 0 ? c4723v.f6785l : set;
        c4723v.getClass();
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(createName, "createName");
        AbstractC5830k.m5330g(createNameError, "createNameError");
        AbstractC5830k.m5330g(selectedCollectionIds, "selectedCollectionIds");
        return new C4723v(title, i9, items, z12, z13, z14, z15, createName, createNameError, z16, z17, selectedCollectionIds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4723v)) {
            return false;
        }
        C4723v c4723v = (C4723v) obj;
        return AbstractC5830k.m5325b(this.f6774a, c4723v.f6774a) && this.f6775b == c4723v.f6775b && AbstractC5830k.m5325b(this.f6776c, c4723v.f6776c) && this.f6777d == c4723v.f6777d && this.f6778e == c4723v.f6778e && this.f6779f == c4723v.f6779f && this.f6780g == c4723v.f6780g && AbstractC5830k.m5325b(this.f6781h, c4723v.f6781h) && AbstractC5830k.m5325b(this.f6782i, c4723v.f6782i) && this.f6783j == c4723v.f6783j && this.f6784k == c4723v.f6784k && AbstractC5830k.m5325b(this.f6785l, c4723v.f6785l);
    }

    public final int hashCode() {
        return this.f6785l.hashCode() + AbstractC0584a.m908i(this.f6784k, AbstractC0584a.m908i(this.f6783j, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m908i(this.f6780g, AbstractC0584a.m908i(this.f6779f, AbstractC0584a.m908i(this.f6778e, AbstractC0584a.m908i(this.f6777d, AbstractC0584a.m907h(this.f6776c, AbstractC0584a.m902c(this.f6775b, this.f6774a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.f6781h), 31, this.f6782i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.f6774a);
        sb.append(", totalCount=");
        sb.append(this.f6775b);
        sb.append(", items=");
        sb.append(this.f6776c);
        sb.append(", isRefreshing=");
        sb.append(this.f6777d);
        sb.append(", isLoadingMore=");
        AbstractC1923c.m1058v(", hasMore=", ", showCreateDialog=", sb, this.f6778e, this.f6779f);
        sb.append(this.f6780g);
        sb.append(", createName=");
        sb.append(this.f6781h);
        sb.append(", createNameError=");
        sb.append(this.f6782i);
        sb.append(", isCreating=");
        sb.append(this.f6783j);
        sb.append(", isSelectionMode=");
        sb.append(this.f6784k);
        sb.append(", selectedCollectionIds=");
        sb.append(this.f6785l);
        sb.append(")");
        return sb.toString();
    }

    public C4723v() {
        this("我的错题集", 0, EmptyList.INSTANCE, true, false, true, false, "", "", false, false, EmptySet.INSTANCE);
    }
}
