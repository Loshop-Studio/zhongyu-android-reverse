package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.z0 */
/* loaded from: classes3.dex */
public final class C4632z0 {

    /* renamed from: A */
    public final Set f6536A;

    /* renamed from: B */
    public final boolean f6537B;

    /* renamed from: C */
    public final boolean f6538C;

    /* renamed from: D */
    public final String f6539D;

    /* renamed from: E */
    public final String f6540E;

    /* renamed from: F */
    public final boolean f6541F;

    /* renamed from: G */
    public final boolean f6542G;

    /* renamed from: H */
    public final Set f6543H;

    /* renamed from: I */
    public final boolean f6544I;

    /* renamed from: J */
    public final boolean f6545J;

    /* renamed from: a */
    public final String f6546a;

    /* renamed from: b */
    public final String f6547b;

    /* renamed from: c */
    public final int f6548c;

    /* renamed from: d */
    public final MistakeCollectionDetailContract$EntryMode f6549d;

    /* renamed from: e */
    public final boolean f6550e;

    /* renamed from: f */
    public final MistakeCollectionDetailContract$DrawerMode f6551f;

    /* renamed from: g */
    public final List f6552g;

    /* renamed from: h */
    public final boolean f6553h;

    /* renamed from: i */
    public final boolean f6554i;

    /* renamed from: j */
    public final boolean f6555j;

    /* renamed from: k */
    public final boolean f6556k;

    /* renamed from: l */
    public final boolean f6557l;

    /* renamed from: m */
    public final List f6558m;

    /* renamed from: n */
    public final List f6559n;

    /* renamed from: o */
    public final int f6560o;

    /* renamed from: p */
    public final String f6561p;

    /* renamed from: q */
    public final String f6562q;

    /* renamed from: r */
    public final boolean f6563r;

    /* renamed from: s */
    public final Set f6564s;

    /* renamed from: t */
    public final Integer f6565t;

    /* renamed from: u */
    public final Integer f6566u;

    /* renamed from: v */
    public final Integer f6567v;

    /* renamed from: w */
    public final int f6568w;

    /* renamed from: x */
    public final int f6569x;

    /* renamed from: y */
    public final boolean f6570y;

    /* renamed from: z */
    public final boolean f6571z;

    public C4632z0(String str, String str2, int i, MistakeCollectionDetailContract$EntryMode entryMode, boolean z8, MistakeCollectionDetailContract$DrawerMode drawerMode, List items, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List filterSubjects, List filterTags, int i8, String str3, String str4, boolean z14, Set selectedSubjectIds, Integer num, Integer num2, Integer num3, int i9, int i10, boolean z15, boolean z16, Set selectedTagIds, boolean z17, boolean z18, String str5, String str6, boolean z19, boolean z20, Set selectedItemIds, boolean z21, boolean z22) {
        AbstractC5830k.m5330g(entryMode, "entryMode");
        AbstractC5830k.m5330g(drawerMode, "drawerMode");
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(filterTags, "filterTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedTagIds, "selectedTagIds");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        this.f6546a = str;
        this.f6547b = str2;
        this.f6548c = i;
        this.f6549d = entryMode;
        this.f6550e = z8;
        this.f6551f = drawerMode;
        this.f6552g = items;
        this.f6553h = z9;
        this.f6554i = z10;
        this.f6555j = z11;
        this.f6556k = z12;
        this.f6557l = z13;
        this.f6558m = filterSubjects;
        this.f6559n = filterTags;
        this.f6560o = i8;
        this.f6561p = str3;
        this.f6562q = str4;
        this.f6563r = z14;
        this.f6564s = selectedSubjectIds;
        this.f6565t = num;
        this.f6566u = num2;
        this.f6567v = num3;
        this.f6568w = i9;
        this.f6569x = i10;
        this.f6570y = z15;
        this.f6571z = z16;
        this.f6536A = selectedTagIds;
        this.f6537B = z17;
        this.f6538C = z18;
        this.f6539D = str5;
        this.f6540E = str6;
        this.f6541F = z19;
        this.f6542G = z20;
        this.f6543H = selectedItemIds;
        this.f6544I = z21;
        this.f6545J = z22;
    }

    /* renamed from: a */
    public static C4632z0 m4054a(C4632z0 c4632z0, String str, String str2, int i, MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode, boolean z8, MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode, List list, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, ArrayList arrayList, ArrayList arrayList2, int i8, String str3, String str4, boolean z14, Set set, Integer num, Integer num2, Integer num3, int i9, int i10, boolean z15, boolean z16, Set set2, boolean z17, boolean z18, String str5, String str6, boolean z19, boolean z20, Set set3, boolean z21, boolean z22, int i11, int i12) {
        String collectionId = (i11 & 1) != 0 ? c4632z0.f6546a : str;
        String title = (i11 & 2) != 0 ? c4632z0.f6547b : str2;
        int i13 = (i11 & 4) != 0 ? c4632z0.f6548c : i;
        c4632z0.getClass();
        MistakeCollectionDetailContract$EntryMode entryMode = (i11 & 16) != 0 ? c4632z0.f6549d : mistakeCollectionDetailContract$EntryMode;
        boolean z23 = (i11 & 32) != 0 ? c4632z0.f6550e : z8;
        MistakeCollectionDetailContract$DrawerMode drawerMode = (i11 & 64) != 0 ? c4632z0.f6551f : mistakeCollectionDetailContract$DrawerMode;
        List items = (i11 & 128) != 0 ? c4632z0.f6552g : list;
        boolean z24 = (i11 & 256) != 0 ? c4632z0.f6553h : z9;
        boolean z25 = (i11 & 512) != 0 ? c4632z0.f6554i : z10;
        boolean z26 = (i11 & 1024) != 0 ? c4632z0.f6555j : z11;
        boolean z27 = (i11 & 2048) != 0 ? c4632z0.f6556k : z12;
        boolean z28 = (i11 & 4096) != 0 ? c4632z0.f6557l : z13;
        List filterSubjects = (i11 & 8192) != 0 ? c4632z0.f6558m : arrayList;
        List filterTags = (i11 & 16384) != 0 ? c4632z0.f6559n : arrayList2;
        int i14 = (i11 & 32768) != 0 ? c4632z0.f6560o : i8;
        String str7 = (i11 & 65536) != 0 ? c4632z0.f6561p : str3;
        String str8 = (i11 & 131072) != 0 ? c4632z0.f6562q : str4;
        boolean z29 = (i11 & 262144) != 0 ? c4632z0.f6563r : z14;
        Set selectedSubjectIds = (i11 & 524288) != 0 ? c4632z0.f6564s : set;
        int i15 = i13;
        Integer num4 = (i11 & 1048576) != 0 ? c4632z0.f6565t : num;
        Integer num5 = (i11 & 2097152) != 0 ? c4632z0.f6566u : num2;
        Integer num6 = (i11 & 4194304) != 0 ? c4632z0.f6567v : num3;
        int i16 = (i11 & 8388608) != 0 ? c4632z0.f6568w : i9;
        int i17 = (i11 & 16777216) != 0 ? c4632z0.f6569x : i10;
        boolean z30 = (i11 & 33554432) != 0 ? c4632z0.f6570y : z15;
        boolean z31 = (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? c4632z0.f6571z : z16;
        Set selectedTagIds = (i11 & 134217728) != 0 ? c4632z0.f6536A : set2;
        boolean z32 = z23;
        boolean z33 = (i11 & 268435456) != 0 ? c4632z0.f6537B : z17;
        boolean z34 = (i11 & 536870912) != 0 ? c4632z0.f6538C : z18;
        String editName = (i11 & BasicMeasure.EXACTLY) != 0 ? c4632z0.f6539D : str5;
        boolean z35 = z24;
        String str9 = (i11 & Integer.MIN_VALUE) != 0 ? c4632z0.f6540E : str6;
        boolean z36 = (i12 & 1) != 0 ? c4632z0.f6541F : z19;
        boolean z37 = (i12 & 2) != 0 ? c4632z0.f6542G : z20;
        Set selectedItemIds = (i12 & 4) != 0 ? c4632z0.f6543H : set3;
        boolean z38 = z25;
        boolean z39 = (i12 & 8) != 0 ? c4632z0.f6544I : z21;
        boolean z40 = (i12 & 16) != 0 ? c4632z0.f6545J : z22;
        c4632z0.getClass();
        AbstractC5830k.m5330g(collectionId, "collectionId");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        AbstractC5830k.m5330g(drawerMode, "drawerMode");
        AbstractC5830k.m5330g(items, "items");
        AbstractC5830k.m5330g(filterSubjects, "filterSubjects");
        AbstractC5830k.m5330g(filterTags, "filterTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedTagIds, "selectedTagIds");
        AbstractC5830k.m5330g(editName, "editName");
        AbstractC5830k.m5330g(selectedItemIds, "selectedItemIds");
        return new C4632z0(collectionId, title, i15, entryMode, z32, drawerMode, items, z35, z38, z26, z27, z28, filterSubjects, filterTags, i14, str7, str8, z29, selectedSubjectIds, num4, num5, num6, i16, i17, z30, z31, selectedTagIds, z33, z34, editName, str9, z36, z37, selectedItemIds, z39, z40);
    }

    /* renamed from: b */
    public final String m4055b() {
        return this.f6546a;
    }

    /* renamed from: c */
    public final String m4056c() {
        return this.f6562q;
    }

    /* renamed from: d */
    public final String m4057d() {
        return this.f6561p;
    }

    /* renamed from: e */
    public final boolean m4058e() {
        return this.f6557l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4632z0)) {
            return false;
        }
        C4632z0 c4632z0 = (C4632z0) obj;
        return this.f6546a.equals(c4632z0.f6546a) && this.f6547b.equals(c4632z0.f6547b) && this.f6548c == c4632z0.f6548c && this.f6549d == c4632z0.f6549d && this.f6550e == c4632z0.f6550e && this.f6551f == c4632z0.f6551f && AbstractC5830k.m5325b(this.f6552g, c4632z0.f6552g) && this.f6553h == c4632z0.f6553h && this.f6554i == c4632z0.f6554i && this.f6555j == c4632z0.f6555j && this.f6556k == c4632z0.f6556k && this.f6557l == c4632z0.f6557l && AbstractC5830k.m5325b(this.f6558m, c4632z0.f6558m) && AbstractC5830k.m5325b(this.f6559n, c4632z0.f6559n) && this.f6560o == c4632z0.f6560o && AbstractC5830k.m5325b(this.f6561p, c4632z0.f6561p) && AbstractC5830k.m5325b(this.f6562q, c4632z0.f6562q) && this.f6563r == c4632z0.f6563r && AbstractC5830k.m5325b(this.f6564s, c4632z0.f6564s) && AbstractC5830k.m5325b(this.f6565t, c4632z0.f6565t) && AbstractC5830k.m5325b(this.f6566u, c4632z0.f6566u) && AbstractC5830k.m5325b(this.f6567v, c4632z0.f6567v) && this.f6568w == c4632z0.f6568w && this.f6569x == c4632z0.f6569x && this.f6570y == c4632z0.f6570y && this.f6571z == c4632z0.f6571z && AbstractC5830k.m5325b(this.f6536A, c4632z0.f6536A) && this.f6537B == c4632z0.f6537B && this.f6538C == c4632z0.f6538C && this.f6539D.equals(c4632z0.f6539D) && this.f6540E.equals(c4632z0.f6540E) && this.f6541F == c4632z0.f6541F && this.f6542G == c4632z0.f6542G && AbstractC5830k.m5325b(this.f6543H, c4632z0.f6543H) && this.f6544I == c4632z0.f6544I && this.f6545J == c4632z0.f6545J;
    }

    /* renamed from: f */
    public final boolean m4059f() {
        return this.f6571z;
    }

    /* renamed from: g */
    public final List m4060g() {
        return this.f6552g;
    }

    /* renamed from: h */
    public final Set m4061h() {
        return this.f6564s;
    }

    public final int hashCode() {
        int iM902c = AbstractC0584a.m902c(this.f6560o, AbstractC0584a.m907h(this.f6559n, AbstractC0584a.m907h(this.f6558m, AbstractC0584a.m908i(this.f6557l, AbstractC0584a.m908i(this.f6556k, AbstractC0584a.m908i(this.f6555j, AbstractC0584a.m908i(this.f6554i, AbstractC0584a.m908i(this.f6553h, AbstractC0584a.m907h(this.f6552g, (this.f6551f.hashCode() + AbstractC0584a.m908i(this.f6550e, (this.f6549d.hashCode() + AbstractC0584a.m902c(100, AbstractC0584a.m902c(this.f6548c, AbstractC0584a.m903d(this.f6546a.hashCode() * 31, 31, this.f6547b), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f6561p;
        int iHashCode = (iM902c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6562q;
        int iHashCode2 = (this.f6564s.hashCode() + AbstractC0584a.m908i(this.f6563r, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        Integer num = this.f6565t;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6566u;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f6567v;
        return Boolean.hashCode(this.f6545J) + AbstractC0584a.m908i(this.f6544I, (this.f6543H.hashCode() + AbstractC0584a.m908i(this.f6542G, AbstractC0584a.m908i(this.f6541F, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m908i(this.f6538C, AbstractC0584a.m908i(this.f6537B, (this.f6536A.hashCode() + AbstractC0584a.m908i(this.f6571z, AbstractC0584a.m908i(this.f6570y, AbstractC0584a.m902c(this.f6569x, AbstractC0584a.m902c(this.f6568w, (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31, this.f6539D), 31, this.f6540E), 31), 31)) * 31, 31);
    }

    /* renamed from: i */
    public final Set m4062i() {
        return this.f6536A;
    }

    /* renamed from: j */
    public final boolean m4063j() {
        return this.f6542G;
    }

    /* renamed from: k */
    public final boolean m4064k() {
        return this.f6544I;
    }

    /* renamed from: l */
    public final boolean m4065l() {
        return this.f6556k;
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("State(collectionId=", this.f6546a, ", title=", this.f6547b, ", currentCount=");
        sbM101z.append(this.f6548c);
        sbM101z.append(", maxCount=100, entryMode=");
        sbM101z.append(this.f6549d);
        sbM101z.append(", drawerVisible=");
        sbM101z.append(this.f6550e);
        sbM101z.append(", drawerMode=");
        sbM101z.append(this.f6551f);
        sbM101z.append(", items=");
        sbM101z.append(this.f6552g);
        sbM101z.append(", practiceEnabled=");
        sbM101z.append(this.f6553h);
        sbM101z.append(", hasLoadedItems=");
        AbstractC1923c.m1058v(", isRefreshing=", ", isLoadingMore=", sbM101z, this.f6554i, this.f6555j);
        AbstractC1923c.m1058v(", hasMore=", ", filterSubjects=", sbM101z, this.f6556k, this.f6557l);
        sbM101z.append(this.f6558m);
        sbM101z.append(", filterTags=");
        sbM101z.append(this.f6559n);
        sbM101z.append(", selectedTimeType=");
        sbM101z.append(this.f6560o);
        sbM101z.append(", customStartTime=");
        sbM101z.append(this.f6561p);
        sbM101z.append(", customEndTime=");
        sbM101z.append(this.f6562q);
        sbM101z.append(", isCustomTimeConfirmed=");
        sbM101z.append(this.f6563r);
        sbM101z.append(", selectedSubjectIds=");
        sbM101z.append(this.f6564s);
        sbM101z.append(", selectedDiffValue=");
        sbM101z.append(this.f6565t);
        sbM101z.append(", selectedAttainedLevelValue=");
        sbM101z.append(this.f6566u);
        sbM101z.append(", selectedErrorReasonValue=");
        sbM101z.append(this.f6567v);
        sbM101z.append(", selectedCurrentCollectionType=");
        AbstractC1923c.m1059w(sbM101z, this.f6568w, ", selectedOtherCollectionType=", this.f6569x, ", addFilterInitialized=");
        AbstractC1923c.m1058v(", includeNoCustomTag=", ", selectedTagIds=", sbM101z, this.f6570y, this.f6571z);
        sbM101z.append(this.f6536A);
        sbM101z.append(", isFilterLoading=");
        sbM101z.append(this.f6537B);
        sbM101z.append(", showEditNameDialog=");
        sbM101z.append(this.f6538C);
        sbM101z.append(", editName=");
        sbM101z.append(this.f6539D);
        sbM101z.append(", editNameError=");
        sbM101z.append(this.f6540E);
        sbM101z.append(", isEditingName=");
        sbM101z.append(this.f6541F);
        sbM101z.append(", isDeleteMode=");
        sbM101z.append(this.f6542G);
        sbM101z.append(", selectedItemIds=");
        sbM101z.append(this.f6543H);
        sbM101z.append(", isDeleting=");
        sbM101z.append(this.f6544I);
        sbM101z.append(", showDeleteConfirmDialog=");
        sbM101z.append(this.f6545J);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
