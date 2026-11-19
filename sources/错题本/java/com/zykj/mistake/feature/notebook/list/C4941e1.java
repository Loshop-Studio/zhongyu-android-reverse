package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.e1 */
/* loaded from: classes3.dex */
public final class C4941e1 {

    /* renamed from: a */
    public final int f7501a;

    /* renamed from: b */
    public final int f7502b;

    /* renamed from: c */
    public final boolean f7503c;

    /* renamed from: d */
    public final List f7504d;

    /* renamed from: e */
    public final boolean f7505e;

    /* renamed from: f */
    public final boolean f7506f;

    /* renamed from: g */
    public final boolean f7507g;

    /* renamed from: h */
    public final boolean f7508h;

    /* renamed from: i */
    public final boolean f7509i;

    /* renamed from: j */
    public final Set f7510j;

    /* renamed from: k */
    public final List f7511k;

    /* renamed from: l */
    public final List f7512l;

    /* renamed from: m */
    public final List f7513m;

    /* renamed from: n */
    public final boolean f7514n;

    /* renamed from: o */
    public final boolean f7515o;

    /* renamed from: p */
    public final List f7516p;

    /* renamed from: q */
    public final Set f7517q;

    /* renamed from: r */
    public final Set f7518r;

    /* renamed from: s */
    public final boolean f7519s;

    /* renamed from: t */
    public final boolean f7520t;

    /* renamed from: u */
    public final String f7521u;

    /* renamed from: v */
    public final String f7522v;

    /* renamed from: w */
    public final boolean f7523w;

    /* renamed from: x */
    public final MistakeNotebookContract$CreateCollectionEntry f7524x;

    /* renamed from: y */
    public final boolean f7525y;

    public C4941e1(int i, int i8, boolean z8, List items, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Set selectedItemIds, List filterSubjects, List customTags, List filterCustomTags, boolean z14, boolean z15, List joinCollections, Set originalJoinCollectionIds, Set selectedJoinCollectionIds, boolean z16, boolean z17, String str, String str2, boolean z18, MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry, boolean z19) {
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(filterCustomTags, "filterCustomTags");
        AbstractC5830k.m5330g(joinCollections, "joinCollections");
        AbstractC5830k.m5330g(originalJoinCollectionIds, "originalJoinCollectionIds");
        AbstractC5830k.m5330g(selectedJoinCollectionIds, "selectedJoinCollectionIds");
        this.f7501a = i;
        this.f7502b = i8;
        this.f7503c = z8;
        this.f7504d = items;
        this.f7505e = z9;
        this.f7506f = z10;
        this.f7507g = z11;
        this.f7508h = z12;
        this.f7509i = z13;
        this.f7510j = selectedItemIds;
        this.f7511k = filterSubjects;
        this.f7512l = customTags;
        this.f7513m = filterCustomTags;
        this.f7514n = z14;
        this.f7515o = z15;
        this.f7516p = joinCollections;
        this.f7517q = originalJoinCollectionIds;
        this.f7518r = selectedJoinCollectionIds;
        this.f7519s = z16;
        this.f7520t = z17;
        this.f7521u = str;
        this.f7522v = str2;
        this.f7523w = z18;
        this.f7524x = mistakeNotebookContract$CreateCollectionEntry;
        this.f7525y = z19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    /* renamed from: a */
    public static C4941e1 m4303a(C4941e1 c4941e1, int i, int i8, boolean z8, ArrayList arrayList, boolean z9, boolean z10, boolean z11, boolean z12, Set set, ArrayList arrayList2, List list, List list2, boolean z13, ArrayList arrayList3, EmptySet emptySet, Set set2, boolean z14, boolean z15, String str, String str2, boolean z16, MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry, boolean z17, int i9) {
        int i10 = (i9 & 1) != 0 ? c4941e1.f7501a : i;
        int i11 = (i9 & 2) != 0 ? c4941e1.f7502b : i8;
        boolean z18 = (i9 & 4) != 0 ? c4941e1.f7503c : z8;
        ArrayList items = (i9 & 8) != 0 ? c4941e1.f7504d : arrayList;
        boolean z19 = (i9 & 16) != 0 ? c4941e1.f7505e : z9;
        boolean z20 = (i9 & 32) != 0 ? c4941e1.f7506f : z10;
        boolean z21 = (i9 & 64) != 0 ? c4941e1.f7507g : z11;
        boolean z22 = (i9 & 128) != 0 ? c4941e1.f7508h : true;
        boolean z23 = (i9 & 256) != 0 ? c4941e1.f7509i : z12;
        Set selectedItemIds = (i9 & 512) != 0 ? c4941e1.f7510j : set;
        ArrayList filterSubjects = (i9 & 1024) != 0 ? c4941e1.f7511k : arrayList2;
        List customTags = (i9 & 2048) != 0 ? c4941e1.f7512l : list;
        List filterCustomTags = (i9 & 4096) != 0 ? c4941e1.f7513m : list2;
        boolean z24 = (i9 & 8192) != 0 ? c4941e1.f7514n : true;
        boolean z25 = (i9 & 16384) != 0 ? c4941e1.f7515o : z13;
        List joinCollections = (32768 & i9) != 0 ? c4941e1.f7516p : arrayList3;
        Set originalJoinCollectionIds = (i9 & 65536) != 0 ? c4941e1.f7517q : emptySet;
        int i12 = i10;
        Set selectedJoinCollectionIds = (i9 & 131072) != 0 ? c4941e1.f7518r : set2;
        int i13 = i11;
        boolean z26 = (i9 & 262144) != 0 ? c4941e1.f7519s : z14;
        boolean z27 = (i9 & 524288) != 0 ? c4941e1.f7520t : z15;
        String createCollectionName = (i9 & 1048576) != 0 ? c4941e1.f7521u : str;
        boolean z28 = z18;
        String createCollectionNameError = (i9 & 2097152) != 0 ? c4941e1.f7522v : str2;
        boolean z29 = z19;
        boolean z30 = (i9 & 4194304) != 0 ? c4941e1.f7523w : z16;
        MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry2 = (i9 & 8388608) != 0 ? c4941e1.f7524x : mistakeNotebookContract$CreateCollectionEntry;
        boolean z31 = (i9 & 16777216) != 0 ? c4941e1.f7525y : z17;
        c4941e1.getClass();
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(filterCustomTags, "filterCustomTags");
        AbstractC5830k.m5330g(joinCollections, "joinCollections");
        AbstractC5830k.m5330g(originalJoinCollectionIds, "originalJoinCollectionIds");
        AbstractC5830k.m5330g(selectedJoinCollectionIds, "selectedJoinCollectionIds");
        AbstractC5830k.m5330g(createCollectionName, "createCollectionName");
        AbstractC5830k.m5330g(createCollectionNameError, "createCollectionNameError");
        return new C4941e1(i12, i13, z28, items, z29, z20, z21, z22, z23, selectedItemIds, filterSubjects, customTags, filterCustomTags, z24, z25, joinCollections, originalJoinCollectionIds, selectedJoinCollectionIds, z26, z27, createCollectionName, createCollectionNameError, z30, mistakeNotebookContract$CreateCollectionEntry2, z31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4941e1)) {
            return false;
        }
        C4941e1 c4941e1 = (C4941e1) obj;
        return this.f7501a == c4941e1.f7501a && this.f7502b == c4941e1.f7502b && this.f7503c == c4941e1.f7503c && AbstractC5830k.m5325b(this.f7504d, c4941e1.f7504d) && this.f7505e == c4941e1.f7505e && this.f7506f == c4941e1.f7506f && this.f7507g == c4941e1.f7507g && this.f7508h == c4941e1.f7508h && this.f7509i == c4941e1.f7509i && AbstractC5830k.m5325b(this.f7510j, c4941e1.f7510j) && AbstractC5830k.m5325b(this.f7511k, c4941e1.f7511k) && AbstractC5830k.m5325b(this.f7512l, c4941e1.f7512l) && AbstractC5830k.m5325b(this.f7513m, c4941e1.f7513m) && this.f7514n == c4941e1.f7514n && this.f7515o == c4941e1.f7515o && AbstractC5830k.m5325b(this.f7516p, c4941e1.f7516p) && AbstractC5830k.m5325b(this.f7517q, c4941e1.f7517q) && AbstractC5830k.m5325b(this.f7518r, c4941e1.f7518r) && this.f7519s == c4941e1.f7519s && this.f7520t == c4941e1.f7520t && AbstractC5830k.m5325b(this.f7521u, c4941e1.f7521u) && AbstractC5830k.m5325b(this.f7522v, c4941e1.f7522v) && this.f7523w == c4941e1.f7523w && this.f7524x == c4941e1.f7524x && this.f7525y == c4941e1.f7525y;
    }

    public final int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.f7523w, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7520t, AbstractC0584a.m908i(this.f7519s, (this.f7518r.hashCode() + ((this.f7517q.hashCode() + AbstractC0584a.m907h(this.f7516p, AbstractC0584a.m908i(this.f7515o, AbstractC0584a.m908i(this.f7514n, AbstractC0584a.m907h(this.f7513m, AbstractC0584a.m907h(this.f7512l, AbstractC0584a.m907h(this.f7511k, (this.f7510j.hashCode() + AbstractC0584a.m908i(this.f7509i, AbstractC0584a.m908i(this.f7508h, AbstractC0584a.m908i(this.f7507g, AbstractC0584a.m908i(this.f7506f, AbstractC0584a.m908i(this.f7505e, AbstractC0584a.m907h(this.f7504d, AbstractC0584a.m908i(this.f7503c, AbstractC0584a.m902c(this.f7502b, Integer.hashCode(this.f7501a) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31, this.f7521u), 31, this.f7522v), 31);
        MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry = this.f7524x;
        return Boolean.hashCode(this.f7525y) + ((iM908i + (mistakeNotebookContract$CreateCollectionEntry == null ? 0 : mistakeNotebookContract$CreateCollectionEntry.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("State(totalCount=", ", masteredCount=", this.f7501a, ", practiceEnabled=", this.f7502b);
        sbM99x.append(this.f7503c);
        sbM99x.append(", items=");
        sbM99x.append(this.f7504d);
        sbM99x.append(", isRefreshing=");
        AbstractC1923c.m1058v(", isLoadingMore=", ", hasMore=", sbM99x, this.f7505e, this.f7506f);
        AbstractC1923c.m1058v(", isFilterApplied=", ", isSelectionMode=", sbM99x, this.f7507g, this.f7508h);
        sbM99x.append(this.f7509i);
        sbM99x.append(", selectedItemIds=");
        sbM99x.append(this.f7510j);
        sbM99x.append(", filterSubjects=");
        sbM99x.append(this.f7511k);
        sbM99x.append(", customTags=");
        sbM99x.append(this.f7512l);
        sbM99x.append(", filterCustomTags=");
        sbM99x.append(this.f7513m);
        sbM99x.append(", isFilterDataLoaded=");
        sbM99x.append(this.f7514n);
        sbM99x.append(", showJoinCollectionDialog=");
        sbM99x.append(this.f7515o);
        sbM99x.append(", joinCollections=");
        sbM99x.append(this.f7516p);
        sbM99x.append(", originalJoinCollectionIds=");
        sbM99x.append(this.f7517q);
        sbM99x.append(", selectedJoinCollectionIds=");
        sbM99x.append(this.f7518r);
        sbM99x.append(", isJoiningCollection=");
        AbstractC1923c.m1058v(", showCreateCollectionDialog=", ", createCollectionName=", sbM99x, this.f7519s, this.f7520t);
        AbstractC1923c.m1060x(sbM99x, this.f7521u, ", createCollectionNameError=", this.f7522v, ", isCreatingCollection=");
        sbM99x.append(this.f7523w);
        sbM99x.append(", createCollectionEntry=");
        sbM99x.append(this.f7524x);
        sbM99x.append(", showCollectionLimitDialog=");
        sbM99x.append(this.f7525y);
        sbM99x.append(")");
        return sbM99x.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4941e1(boolean z8) {
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this(29, 13, z8, emptyList, true, false, true, false, false, emptySet, emptyList, emptyList, emptyList, false, false, emptyList, emptySet, emptySet, false, false, "", "", false, null, false);
    }
}
