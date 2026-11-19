package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.s0 */
/* loaded from: classes3.dex */
public final class C4676s0 {

    /* renamed from: A */
    public final Integer f6675A;

    /* renamed from: B */
    public final Integer f6676B;

    /* renamed from: C */
    public final int f6677C;

    /* renamed from: D */
    public final int f6678D;

    /* renamed from: E */
    public final boolean f6679E;

    /* renamed from: F */
    public final Set f6680F;

    /* renamed from: G */
    public final boolean f6681G;

    /* renamed from: H */
    public final MistakeCollectionFilterResultContract$SourceType f6682H;

    /* renamed from: a */
    public final String f6683a;

    /* renamed from: b */
    public final String f6684b;

    /* renamed from: c */
    public final int f6685c;

    /* renamed from: d */
    public final int f6686d;

    /* renamed from: e */
    public final SearchMistakeCollectionReq f6687e;

    /* renamed from: f */
    public final int f6688f;

    /* renamed from: g */
    public final List f6689g;

    /* renamed from: h */
    public final int f6690h;

    /* renamed from: i */
    public final Set f6691i;

    /* renamed from: j */
    public final Set f6692j;

    /* renamed from: k */
    public final MistakeCollectionFilterResultContract$SortType f6693k;

    /* renamed from: l */
    public final boolean f6694l;

    /* renamed from: m */
    public final boolean f6695m;

    /* renamed from: n */
    public final boolean f6696n;

    /* renamed from: o */
    public final boolean f6697o;

    /* renamed from: p */
    public final boolean f6698p;

    /* renamed from: q */
    public final boolean f6699q;

    /* renamed from: r */
    public final boolean f6700r;

    /* renamed from: s */
    public final List f6701s;

    /* renamed from: t */
    public final List f6702t;

    /* renamed from: u */
    public final int f6703u;

    /* renamed from: v */
    public final String f6704v;

    /* renamed from: w */
    public final String f6705w;

    /* renamed from: x */
    public final boolean f6706x;

    /* renamed from: y */
    public final Set f6707y;

    /* renamed from: z */
    public final Integer f6708z;

    public C4676s0(String str, String str2, int i, int i8, SearchMistakeCollectionReq searchMistakeCollectionReq, int i9, List items, int i10, Set allItemIds, Set selectedItemIds, MistakeCollectionFilterResultContract$SortType sortType, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List filterSubjects, List filterTags, int i11, String str3, String str4, boolean z15, Set selectedSubjectIds, Integer num, Integer num2, Integer num3, int i12, int i13, boolean z16, Set selectedTagIds, boolean z17, MistakeCollectionFilterResultContract$SourceType sourceType) {
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(allItemIds, "allItemIds");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        AbstractC5830k.m5330g(sortType, "sortType");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(filterTags, "filterTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedTagIds, "selectedTagIds");
        AbstractC5830k.m5330g(sourceType, "sourceType");
        this.f6683a = str;
        this.f6684b = str2;
        this.f6685c = i;
        this.f6686d = i8;
        this.f6687e = searchMistakeCollectionReq;
        this.f6688f = i9;
        this.f6689g = items;
        this.f6690h = i10;
        this.f6691i = allItemIds;
        this.f6692j = selectedItemIds;
        this.f6693k = sortType;
        this.f6694l = z8;
        this.f6695m = z9;
        this.f6696n = z10;
        this.f6697o = z11;
        this.f6698p = z12;
        this.f6699q = z13;
        this.f6700r = z14;
        this.f6701s = filterSubjects;
        this.f6702t = filterTags;
        this.f6703u = i11;
        this.f6704v = str3;
        this.f6705w = str4;
        this.f6706x = z15;
        this.f6707y = selectedSubjectIds;
        this.f6708z = num;
        this.f6675A = num2;
        this.f6676B = num3;
        this.f6677C = i12;
        this.f6678D = i13;
        this.f6679E = z16;
        this.f6680F = selectedTagIds;
        this.f6681G = z17;
        this.f6682H = sourceType;
    }

    /* renamed from: a */
    public static C4676s0 m4080a(C4676s0 c4676s0, String str, String str2, int i, int i8, SearchMistakeCollectionReq searchMistakeCollectionReq, int i9, ArrayList arrayList, int i10, Set set, Set set2, MistakeCollectionFilterResultContract$SortType mistakeCollectionFilterResultContract$SortType, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, ArrayList arrayList3, int i11, String str3, String str4, boolean z15, Set set3, Integer num, Integer num2, Integer num3, int i12, int i13, boolean z16, Set set4, boolean z17, MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType, int i14, int i15) {
        String collectionId = (i14 & 1) != 0 ? c4676s0.f6683a : str;
        String title = (i14 & 2) != 0 ? c4676s0.f6684b : str2;
        int i16 = (i14 & 4) != 0 ? c4676s0.f6685c : i;
        int i17 = (i14 & 8) != 0 ? c4676s0.f6686d : i8;
        SearchMistakeCollectionReq mistakeListReq = (i14 & 16) != 0 ? c4676s0.f6687e : searchMistakeCollectionReq;
        int i18 = (i14 & 32) != 0 ? c4676s0.f6688f : i9;
        List items = (i14 & 64) != 0 ? c4676s0.f6689g : arrayList;
        int i19 = (i14 & 128) != 0 ? c4676s0.f6690h : i10;
        Set allItemIds = (i14 & 256) != 0 ? c4676s0.f6691i : set;
        Set selectedItemIds = (i14 & 512) != 0 ? c4676s0.f6692j : set2;
        MistakeCollectionFilterResultContract$SortType sortType = (i14 & 1024) != 0 ? c4676s0.f6693k : mistakeCollectionFilterResultContract$SortType;
        boolean z18 = (i14 & 2048) != 0 ? c4676s0.f6694l : z8;
        boolean z19 = (i14 & 4096) != 0 ? c4676s0.f6695m : z9;
        boolean z20 = (i14 & 8192) != 0 ? c4676s0.f6696n : z10;
        int i20 = i16;
        boolean z21 = (i14 & 16384) != 0 ? c4676s0.f6697o : z11;
        boolean z22 = (i14 & 32768) != 0 ? c4676s0.f6698p : z12;
        boolean z23 = (i14 & 65536) != 0 ? c4676s0.f6699q : z13;
        boolean z24 = (i14 & 131072) != 0 ? c4676s0.f6700r : z14;
        List filterSubjects = (i14 & 262144) != 0 ? c4676s0.f6701s : arrayList2;
        boolean z25 = z21;
        List filterTags = (i14 & 524288) != 0 ? c4676s0.f6702t : arrayList3;
        int i21 = i17;
        int i22 = (i14 & 1048576) != 0 ? c4676s0.f6703u : i11;
        String str5 = (i14 & 2097152) != 0 ? c4676s0.f6704v : str3;
        String str6 = (i14 & 4194304) != 0 ? c4676s0.f6705w : str4;
        boolean z26 = (i14 & 8388608) != 0 ? c4676s0.f6706x : z15;
        Set selectedSubjectIds = (i14 & 16777216) != 0 ? c4676s0.f6707y : set3;
        int i23 = i18;
        Integer num4 = (i14 & 33554432) != 0 ? c4676s0.f6708z : num;
        Integer num5 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? c4676s0.f6675A : num2;
        Integer num6 = (i14 & 134217728) != 0 ? c4676s0.f6676B : num3;
        int i24 = (i14 & 268435456) != 0 ? c4676s0.f6677C : i12;
        int i25 = (i14 & 536870912) != 0 ? c4676s0.f6678D : i13;
        boolean z27 = (i14 & BasicMeasure.EXACTLY) != 0 ? c4676s0.f6679E : z16;
        Set selectedTagIds = (i14 & Integer.MIN_VALUE) != 0 ? c4676s0.f6680F : set4;
        int i26 = i19;
        boolean z28 = (i15 & 1) != 0 ? c4676s0.f6681G : z17;
        MistakeCollectionFilterResultContract$SourceType sourceType = (i15 & 2) != 0 ? c4676s0.f6682H : mistakeCollectionFilterResultContract$SourceType;
        c4676s0.getClass();
        AbstractC5830k.m5330g(collectionId, "collectionId");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(mistakeListReq, "mistakeListReq");
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(allItemIds, "allItemIds");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        AbstractC5830k.m5330g(sortType, "sortType");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(filterTags, "filterTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedTagIds, "selectedTagIds");
        AbstractC5830k.m5330g(sourceType, "sourceType");
        return new C4676s0(collectionId, title, i20, i21, mistakeListReq, i23, items, i26, allItemIds, selectedItemIds, sortType, z18, z19, z20, z25, z22, z23, z24, filterSubjects, filterTags, i22, str5, str6, z26, selectedSubjectIds, num4, num5, num6, i24, i25, z27, selectedTagIds, z28, sourceType);
    }

    /* renamed from: b */
    public final boolean m4081b() {
        return (this.f6692j.isEmpty() || this.f6700r) ? false : true;
    }

    /* renamed from: c */
    public final boolean m4082c() {
        Set set = this.f6691i;
        return !set.isEmpty() && this.f6692j.containsAll(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4676s0)) {
            return false;
        }
        C4676s0 c4676s0 = (C4676s0) obj;
        return AbstractC5830k.m5325b(this.f6683a, c4676s0.f6683a) && AbstractC5830k.m5325b(this.f6684b, c4676s0.f6684b) && this.f6685c == c4676s0.f6685c && this.f6686d == c4676s0.f6686d && AbstractC5830k.m5325b(this.f6687e, c4676s0.f6687e) && this.f6688f == c4676s0.f6688f && AbstractC5830k.m5325b(this.f6689g, c4676s0.f6689g) && this.f6690h == c4676s0.f6690h && AbstractC5830k.m5325b(this.f6691i, c4676s0.f6691i) && AbstractC5830k.m5325b(this.f6692j, c4676s0.f6692j) && this.f6693k == c4676s0.f6693k && this.f6694l == c4676s0.f6694l && this.f6695m == c4676s0.f6695m && this.f6696n == c4676s0.f6696n && this.f6697o == c4676s0.f6697o && this.f6698p == c4676s0.f6698p && this.f6699q == c4676s0.f6699q && this.f6700r == c4676s0.f6700r && AbstractC5830k.m5325b(this.f6701s, c4676s0.f6701s) && AbstractC5830k.m5325b(this.f6702t, c4676s0.f6702t) && this.f6703u == c4676s0.f6703u && AbstractC5830k.m5325b(this.f6704v, c4676s0.f6704v) && AbstractC5830k.m5325b(this.f6705w, c4676s0.f6705w) && this.f6706x == c4676s0.f6706x && AbstractC5830k.m5325b(this.f6707y, c4676s0.f6707y) && AbstractC5830k.m5325b(this.f6708z, c4676s0.f6708z) && AbstractC5830k.m5325b(this.f6675A, c4676s0.f6675A) && AbstractC5830k.m5325b(this.f6676B, c4676s0.f6676B) && this.f6677C == c4676s0.f6677C && this.f6678D == c4676s0.f6678D && this.f6679E == c4676s0.f6679E && AbstractC5830k.m5325b(this.f6680F, c4676s0.f6680F) && this.f6681G == c4676s0.f6681G && this.f6682H == c4676s0.f6682H;
    }

    public final int hashCode() {
        int iM902c = AbstractC0584a.m902c(this.f6703u, AbstractC0584a.m907h(this.f6702t, AbstractC0584a.m907h(this.f6701s, AbstractC0584a.m908i(this.f6700r, AbstractC0584a.m908i(this.f6699q, AbstractC0584a.m908i(this.f6698p, AbstractC0584a.m908i(this.f6697o, AbstractC0584a.m908i(this.f6696n, AbstractC0584a.m908i(this.f6695m, AbstractC0584a.m908i(this.f6694l, (this.f6693k.hashCode() + ((this.f6692j.hashCode() + ((this.f6691i.hashCode() + AbstractC0584a.m902c(this.f6690h, AbstractC0584a.m907h(this.f6689g, AbstractC0584a.m902c(this.f6688f, (this.f6687e.hashCode() + AbstractC0584a.m902c(this.f6686d, AbstractC0584a.m902c(this.f6685c, AbstractC0584a.m903d(this.f6683a.hashCode() * 31, 31, this.f6684b), 31), 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f6704v;
        int iHashCode = (iM902c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6705w;
        int iHashCode2 = (this.f6707y.hashCode() + AbstractC0584a.m908i(this.f6706x, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        Integer num = this.f6708z;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6675A;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f6676B;
        return this.f6682H.hashCode() + AbstractC0584a.m908i(this.f6681G, (this.f6680F.hashCode() + AbstractC0584a.m908i(this.f6679E, AbstractC0584a.m902c(this.f6678D, AbstractC0584a.m902c(this.f6677C, (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("State(collectionId=", this.f6683a, ", title=", this.f6684b, ", currentCount=");
        AbstractC1923c.m1059w(sbM101z, this.f6685c, ", capacity=", this.f6686d, ", mistakeListReq=");
        sbM101z.append(this.f6687e);
        sbM101z.append(", otherCollectionType=");
        sbM101z.append(this.f6688f);
        sbM101z.append(", items=");
        sbM101z.append(this.f6689g);
        sbM101z.append(", totalCount=");
        sbM101z.append(this.f6690h);
        sbM101z.append(", allItemIds=");
        sbM101z.append(this.f6691i);
        sbM101z.append(", selectedItemIds=");
        sbM101z.append(this.f6692j);
        sbM101z.append(", sortType=");
        sbM101z.append(this.f6693k);
        sbM101z.append(", drawerVisible=");
        sbM101z.append(this.f6694l);
        sbM101z.append(", showCurrentCollectionFilter=");
        AbstractC1923c.m1058v(", isRefreshing=", ", isLoadingMore=", sbM101z, this.f6695m, this.f6696n);
        AbstractC1923c.m1058v(", hasMore=", ", isLoading=", sbM101z, this.f6697o, this.f6698p);
        AbstractC1923c.m1058v(", isAddingToCollection=", ", filterSubjects=", sbM101z, this.f6699q, this.f6700r);
        sbM101z.append(this.f6701s);
        sbM101z.append(", filterTags=");
        sbM101z.append(this.f6702t);
        sbM101z.append(", selectedTimeType=");
        sbM101z.append(this.f6703u);
        sbM101z.append(", customStartTime=");
        sbM101z.append(this.f6704v);
        sbM101z.append(", customEndTime=");
        sbM101z.append(this.f6705w);
        sbM101z.append(", isCustomTimeConfirmed=");
        sbM101z.append(this.f6706x);
        sbM101z.append(", selectedSubjectIds=");
        sbM101z.append(this.f6707y);
        sbM101z.append(", selectedDiffValue=");
        sbM101z.append(this.f6708z);
        sbM101z.append(", selectedAttainedLevelValue=");
        sbM101z.append(this.f6675A);
        sbM101z.append(", selectedErrorReasonValue=");
        sbM101z.append(this.f6676B);
        sbM101z.append(", selectedCurrentCollectionType=");
        AbstractC1923c.m1059w(sbM101z, this.f6677C, ", selectedOtherCollectionType=", this.f6678D, ", includeNoCustomTag=");
        sbM101z.append(this.f6679E);
        sbM101z.append(", selectedTagIds=");
        sbM101z.append(this.f6680F);
        sbM101z.append(", showOverLimitDialog=");
        sbM101z.append(this.f6681G);
        sbM101z.append(", sourceType=");
        sbM101z.append(this.f6682H);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
