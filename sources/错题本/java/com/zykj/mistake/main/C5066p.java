package com.zykj.mistake.main;

import androidx.collection.AbstractC0584a;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.p */
/* loaded from: classes3.dex */
public final class C5066p {

    /* renamed from: a */
    public final List f7939a;

    /* renamed from: b */
    public final List f7940b;

    /* renamed from: c */
    public final int f7941c;

    /* renamed from: d */
    public final String f7942d;

    /* renamed from: e */
    public final String f7943e;

    /* renamed from: f */
    public final boolean f7944f;

    /* renamed from: g */
    public final Set f7945g;

    /* renamed from: h */
    public final Integer f7946h;

    /* renamed from: i */
    public final Integer f7947i;

    /* renamed from: j */
    public final Integer f7948j;

    /* renamed from: k */
    public final boolean f7949k;

    /* renamed from: l */
    public final List f7950l;

    public C5066p(List subjects, List customTags, int i, String str, String str2, boolean z8, Set selectedSubjectIds, Integer num, Integer num2, Integer num3, boolean z9, List selectedCustomTags) {
        AbstractC5830k.m5330g(subjects, "subjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedCustomTags, "selectedCustomTags");
        this.f7939a = subjects;
        this.f7940b = customTags;
        this.f7941c = i;
        this.f7942d = str;
        this.f7943e = str2;
        this.f7944f = z8;
        this.f7945g = selectedSubjectIds;
        this.f7946h = num;
        this.f7947i = num2;
        this.f7948j = num3;
        this.f7949k = z9;
        this.f7950l = selectedCustomTags;
    }

    /* renamed from: a */
    public static C5066p m4379a(C5066p c5066p, List list, List list2, int i, String str, String str2, boolean z8, Set set, Integer num, Integer num2, Integer num3, boolean z9, List list3, int i8) {
        if ((i8 & 1) != 0) {
            list = c5066p.f7939a;
        }
        List subjects = list;
        if ((i8 & 2) != 0) {
            list2 = c5066p.f7940b;
        }
        List customTags = list2;
        int i9 = (i8 & 4) != 0 ? c5066p.f7941c : i;
        String str3 = (i8 & 8) != 0 ? c5066p.f7942d : str;
        String str4 = (i8 & 16) != 0 ? c5066p.f7943e : str2;
        boolean z10 = (i8 & 32) != 0 ? c5066p.f7944f : z8;
        Set selectedSubjectIds = (i8 & 64) != 0 ? c5066p.f7945g : set;
        Integer num4 = (i8 & 128) != 0 ? c5066p.f7946h : num;
        Integer num5 = (i8 & 256) != 0 ? c5066p.f7947i : num2;
        Integer num6 = (i8 & 512) != 0 ? c5066p.f7948j : num3;
        boolean z11 = (i8 & 1024) != 0 ? c5066p.f7949k : z9;
        List selectedCustomTags = (i8 & 2048) != 0 ? c5066p.f7950l : list3;
        c5066p.getClass();
        AbstractC5830k.m5330g(subjects, "subjects");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(selectedSubjectIds, "selectedSubjectIds");
        AbstractC5830k.m5330g(selectedCustomTags, "selectedCustomTags");
        return new C5066p(subjects, customTags, i9, str3, str4, z10, selectedSubjectIds, num4, num5, num6, z11, selectedCustomTags);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5066p)) {
            return false;
        }
        C5066p c5066p = (C5066p) obj;
        return AbstractC5830k.m5325b(this.f7939a, c5066p.f7939a) && AbstractC5830k.m5325b(this.f7940b, c5066p.f7940b) && this.f7941c == c5066p.f7941c && AbstractC5830k.m5325b(this.f7942d, c5066p.f7942d) && AbstractC5830k.m5325b(this.f7943e, c5066p.f7943e) && this.f7944f == c5066p.f7944f && AbstractC5830k.m5325b(this.f7945g, c5066p.f7945g) && AbstractC5830k.m5325b(this.f7946h, c5066p.f7946h) && AbstractC5830k.m5325b(this.f7947i, c5066p.f7947i) && AbstractC5830k.m5325b(this.f7948j, c5066p.f7948j) && this.f7949k == c5066p.f7949k && AbstractC5830k.m5325b(this.f7950l, c5066p.f7950l);
    }

    public final int hashCode() {
        int iM902c = AbstractC0584a.m902c(this.f7941c, AbstractC0584a.m907h(this.f7940b, this.f7939a.hashCode() * 31, 31), 31);
        String str = this.f7942d;
        int iHashCode = (iM902c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7943e;
        int iHashCode2 = (this.f7945g.hashCode() + AbstractC0584a.m908i(this.f7944f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        Integer num = this.f7946h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7947i;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7948j;
        return this.f7950l.hashCode() + AbstractC0584a.m908i(this.f7949k, (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "NotebookFilterDraft(subjects=" + this.f7939a + ", customTags=" + this.f7940b + ", timeType=" + this.f7941c + ", startTime=" + this.f7942d + ", endTime=" + this.f7943e + ", isCustomTimeConfirmed=" + this.f7944f + ", selectedSubjectIds=" + this.f7945g + ", selectedDiffValue=" + this.f7946h + ", selectedAttainedLevelValue=" + this.f7947i + ", selectedErrorReasonValue=" + this.f7948j + ", includeNoCustomTag=" + this.f7949k + ", selectedCustomTags=" + this.f7950l + ")";
    }

    public C5066p(List list, List list2) {
        this(list, list2, 0, null, null, false, EmptySet.INSTANCE, null, null, null, false, EmptyList.INSTANCE);
    }
}
