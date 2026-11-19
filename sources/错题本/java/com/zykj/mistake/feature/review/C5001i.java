package com.zykj.mistake.feature.review;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.i */
/* loaded from: classes3.dex */
public final class C5001i {

    /* renamed from: a */
    public final String f7647a;

    /* renamed from: b */
    public final String f7648b;

    /* renamed from: c */
    public final String f7649c;

    /* renamed from: d */
    public final int f7650d;

    /* renamed from: e */
    public final boolean f7651e;

    /* renamed from: f */
    public final String f7652f;

    /* renamed from: g */
    public final int f7653g;

    /* renamed from: h */
    public final boolean f7654h;

    /* renamed from: i */
    public final String f7655i;

    /* renamed from: j */
    public final int f7656j;

    /* renamed from: k */
    public final boolean f7657k;

    /* renamed from: l */
    public final String f7658l;

    /* renamed from: m */
    public final int f7659m;

    /* renamed from: n */
    public final boolean f7660n;

    /* renamed from: o */
    public final Integer f7661o;

    /* renamed from: p */
    public final int f7662p;

    /* renamed from: q */
    public final int f7663q;

    /* renamed from: r */
    public final int f7664r;

    /* renamed from: s */
    public final int f7665s;

    /* renamed from: t */
    public final boolean f7666t;

    /* renamed from: u */
    public final boolean f7667u;

    /* renamed from: v */
    public final boolean f7668v;

    public /* synthetic */ C5001i(String str, int i) {
        this((i & 1) != 0 ? "" : str, "", "", 0, false, "", 0, false, "", 0, false, "", 0, false, null, 0, 0, 0, 0, false, false, (i & 2097152) == 0);
    }

    /* renamed from: a */
    public static C5001i m4321a(C5001i c5001i, String str, String str2, String str3, int i, boolean z8, String str4, int i8, boolean z9, String str5, int i9, boolean z10, String str6, int i10, boolean z11, Integer num, int i11, int i12, int i13, int i14, boolean z12, boolean z13, int i15) {
        String studentName = (i15 & 1) != 0 ? c5001i.f7647a : str;
        String summaryText = (i15 & 2) != 0 ? c5001i.f7648b : str2;
        String recommendDescription = (i15 & 4) != 0 ? c5001i.f7649c : str3;
        int i16 = (i15 & 8) != 0 ? c5001i.f7650d : i;
        boolean z14 = (i15 & 16) != 0 ? c5001i.f7651e : z8;
        String strengtheningDescription = (i15 & 32) != 0 ? c5001i.f7652f : str4;
        int i17 = (i15 & 64) != 0 ? c5001i.f7653g : i8;
        boolean z15 = (i15 & 128) != 0 ? c5001i.f7654h : z9;
        String consolidatingDescription = (i15 & 256) != 0 ? c5001i.f7655i : str5;
        int i18 = (i15 & 512) != 0 ? c5001i.f7656j : i9;
        boolean z16 = (i15 & 1024) != 0 ? c5001i.f7657k : z10;
        String masteredDescription = (i15 & 2048) != 0 ? c5001i.f7658l : str6;
        int i19 = (i15 & 4096) != 0 ? c5001i.f7659m : i10;
        boolean z17 = (i15 & 8192) != 0 ? c5001i.f7660n : z11;
        Integer num2 = (i15 & 16384) != 0 ? c5001i.f7661o : num;
        int i20 = (32768 & i15) != 0 ? c5001i.f7662p : i11;
        int i21 = (65536 & i15) != 0 ? c5001i.f7663q : i12;
        int i22 = (131072 & i15) != 0 ? c5001i.f7664r : i13;
        int i23 = (262144 & i15) != 0 ? c5001i.f7665s : i14;
        boolean z18 = (524288 & i15) != 0 ? c5001i.f7666t : z12;
        boolean z19 = (i15 & 1048576) != 0 ? c5001i.f7667u : true;
        c5001i.getClass();
        c5001i.getClass();
        AbstractC5830k.m5330g(studentName, "studentName");
        AbstractC5830k.m5330g(summaryText, "summaryText");
        AbstractC5830k.m5330g(recommendDescription, "recommendDescription");
        AbstractC5830k.m5330g(strengtheningDescription, "strengtheningDescription");
        AbstractC5830k.m5330g(consolidatingDescription, "consolidatingDescription");
        AbstractC5830k.m5330g(masteredDescription, "masteredDescription");
        return new C5001i(studentName, summaryText, recommendDescription, i16, z14, strengtheningDescription, i17, z15, consolidatingDescription, i18, z16, masteredDescription, i19, z17, num2, i20, i21, i22, i23, z18, z19, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5001i)) {
            return false;
        }
        C5001i c5001i = (C5001i) obj;
        return AbstractC5830k.m5325b(this.f7647a, c5001i.f7647a) && AbstractC5830k.m5325b(this.f7648b, c5001i.f7648b) && AbstractC5830k.m5325b(this.f7649c, c5001i.f7649c) && this.f7650d == c5001i.f7650d && this.f7651e == c5001i.f7651e && AbstractC5830k.m5325b(this.f7652f, c5001i.f7652f) && this.f7653g == c5001i.f7653g && this.f7654h == c5001i.f7654h && AbstractC5830k.m5325b(this.f7655i, c5001i.f7655i) && this.f7656j == c5001i.f7656j && this.f7657k == c5001i.f7657k && AbstractC5830k.m5325b(this.f7658l, c5001i.f7658l) && this.f7659m == c5001i.f7659m && this.f7660n == c5001i.f7660n && AbstractC5830k.m5325b(this.f7661o, c5001i.f7661o) && this.f7662p == c5001i.f7662p && this.f7663q == c5001i.f7663q && this.f7664r == c5001i.f7664r && this.f7665s == c5001i.f7665s && this.f7666t == c5001i.f7666t && this.f7667u == c5001i.f7667u && this.f7668v == c5001i.f7668v;
    }

    public final int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.f7660n, AbstractC0584a.m902c(this.f7659m, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7657k, AbstractC0584a.m902c(this.f7656j, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7654h, AbstractC0584a.m902c(this.f7653g, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7651e, AbstractC0584a.m902c(this.f7650d, AbstractC0584a.m903d(AbstractC0584a.m903d(this.f7647a.hashCode() * 31, 31, this.f7648b), 31, this.f7649c), 31), 31), 31, this.f7652f), 31), 31), 31, this.f7655i), 31), 31), 31, this.f7658l), 31), 31);
        Integer num = this.f7661o;
        return Boolean.hashCode(false) + AbstractC0584a.m908i(this.f7668v, AbstractC0584a.m908i(this.f7667u, AbstractC0584a.m908i(this.f7666t, AbstractC0584a.m902c(this.f7665s, AbstractC0584a.m902c(this.f7664r, AbstractC0584a.m902c(this.f7663q, AbstractC0584a.m902c(this.f7662p, (iM908i + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("State(studentName=", this.f7647a, ", summaryText=", this.f7648b, ", recommendDescription=");
        sbM101z.append(this.f7649c);
        sbM101z.append(", recommendPracticeCount=");
        sbM101z.append(this.f7650d);
        sbM101z.append(", recommendCanPractice=");
        sbM101z.append(this.f7651e);
        sbM101z.append(", strengtheningDescription=");
        sbM101z.append(this.f7652f);
        sbM101z.append(", strengtheningCount=");
        sbM101z.append(this.f7653g);
        sbM101z.append(", strengtheningCanPractice=");
        sbM101z.append(this.f7654h);
        sbM101z.append(", consolidatingDescription=");
        sbM101z.append(this.f7655i);
        sbM101z.append(", consolidatingCount=");
        sbM101z.append(this.f7656j);
        sbM101z.append(", consolidatingCanPractice=");
        sbM101z.append(this.f7657k);
        sbM101z.append(", masteredDescription=");
        sbM101z.append(this.f7658l);
        sbM101z.append(", masteredCount=");
        sbM101z.append(this.f7659m);
        sbM101z.append(", masteredCanPractice=");
        sbM101z.append(this.f7660n);
        sbM101z.append(", recent7AddedMistakeCount=");
        sbM101z.append(this.f7661o);
        sbM101z.append(", recent7PracticeCount=");
        sbM101z.append(this.f7662p);
        sbM101z.append(", recent7PracticeDays=");
        AbstractC1923c.m1059w(sbM101z, this.f7663q, ", recent7EnterConsolidatingCount=", this.f7664r, ", recent7EnterMasteredCount=");
        sbM101z.append(this.f7665s);
        sbM101z.append(", shouldDefaultReviewTab=");
        sbM101z.append(this.f7666t);
        sbM101z.append(", isHomeLoaded=");
        sbM101z.append(this.f7667u);
        sbM101z.append(", isLoadingHome=");
        sbM101z.append(this.f7668v);
        sbM101z.append(", isLoadingRecommend=false)");
        return sbM101z.toString();
    }

    public C5001i(String studentName, String str, String str2, int i, boolean z8, String str3, int i8, boolean z9, String str4, int i9, boolean z10, String str5, int i10, boolean z11, Integer num, int i11, int i12, int i13, int i14, boolean z12, boolean z13, boolean z14) {
        AbstractC5830k.m5330g(studentName, "studentName");
        this.f7647a = studentName;
        this.f7648b = str;
        this.f7649c = str2;
        this.f7650d = i;
        this.f7651e = z8;
        this.f7652f = str3;
        this.f7653g = i8;
        this.f7654h = z9;
        this.f7655i = str4;
        this.f7656j = i9;
        this.f7657k = z10;
        this.f7658l = str5;
        this.f7659m = i10;
        this.f7660n = z11;
        this.f7661o = num;
        this.f7662p = i11;
        this.f7663q = i12;
        this.f7664r = i13;
        this.f7665s = i14;
        this.f7666t = z12;
        this.f7667u = z13;
        this.f7668v = z14;
    }
}
