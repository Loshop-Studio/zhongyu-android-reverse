package com.zykj.mistake.feature.review;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.k */
/* loaded from: classes3.dex */
public final class C5003k {

    /* renamed from: a */
    public final String f7669a;

    /* renamed from: b */
    public final String f7670b;

    /* renamed from: c */
    public final String f7671c;

    /* renamed from: d */
    public final int f7672d;

    /* renamed from: e */
    public final boolean f7673e;

    /* renamed from: f */
    public final String f7674f;

    /* renamed from: g */
    public final int f7675g;

    /* renamed from: h */
    public final boolean f7676h;

    /* renamed from: i */
    public final String f7677i;

    /* renamed from: j */
    public final int f7678j;

    /* renamed from: k */
    public final boolean f7679k;

    /* renamed from: l */
    public final String f7680l;

    /* renamed from: m */
    public final int f7681m;

    /* renamed from: n */
    public final boolean f7682n;

    /* renamed from: o */
    public final Integer f7683o;

    /* renamed from: p */
    public final int f7684p;

    /* renamed from: q */
    public final int f7685q;

    /* renamed from: r */
    public final int f7686r;

    /* renamed from: s */
    public final int f7687s;

    /* renamed from: t */
    public final boolean f7688t;

    public C5003k(String studentName, String summaryText, String recommendDescription, int i, boolean z8, String strengtheningDescription, int i8, boolean z9, String consolidatingDescription, int i9, boolean z10, String masteredDescription, int i10, boolean z11, Integer num, int i11, int i12, int i13, int i14, boolean z12) {
        AbstractC5830k.m5330g(studentName, "studentName");
        AbstractC5830k.m5330g(summaryText, "summaryText");
        AbstractC5830k.m5330g(recommendDescription, "recommendDescription");
        AbstractC5830k.m5330g(strengtheningDescription, "strengtheningDescription");
        AbstractC5830k.m5330g(consolidatingDescription, "consolidatingDescription");
        AbstractC5830k.m5330g(masteredDescription, "masteredDescription");
        this.f7669a = studentName;
        this.f7670b = summaryText;
        this.f7671c = recommendDescription;
        this.f7672d = i;
        this.f7673e = z8;
        this.f7674f = strengtheningDescription;
        this.f7675g = i8;
        this.f7676h = z9;
        this.f7677i = consolidatingDescription;
        this.f7678j = i9;
        this.f7679k = z10;
        this.f7680l = masteredDescription;
        this.f7681m = i10;
        this.f7682n = z11;
        this.f7683o = num;
        this.f7684p = i11;
        this.f7685q = i12;
        this.f7686r = i13;
        this.f7687s = i14;
        this.f7688t = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5003k)) {
            return false;
        }
        C5003k c5003k = (C5003k) obj;
        return AbstractC5830k.m5325b(this.f7669a, c5003k.f7669a) && AbstractC5830k.m5325b(this.f7670b, c5003k.f7670b) && AbstractC5830k.m5325b(this.f7671c, c5003k.f7671c) && this.f7672d == c5003k.f7672d && this.f7673e == c5003k.f7673e && AbstractC5830k.m5325b(this.f7674f, c5003k.f7674f) && this.f7675g == c5003k.f7675g && this.f7676h == c5003k.f7676h && AbstractC5830k.m5325b(this.f7677i, c5003k.f7677i) && this.f7678j == c5003k.f7678j && this.f7679k == c5003k.f7679k && AbstractC5830k.m5325b(this.f7680l, c5003k.f7680l) && this.f7681m == c5003k.f7681m && this.f7682n == c5003k.f7682n && AbstractC5830k.m5325b(this.f7683o, c5003k.f7683o) && this.f7684p == c5003k.f7684p && this.f7685q == c5003k.f7685q && this.f7686r == c5003k.f7686r && this.f7687s == c5003k.f7687s && this.f7688t == c5003k.f7688t;
    }

    public final int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.f7682n, AbstractC0584a.m902c(this.f7681m, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7679k, AbstractC0584a.m902c(this.f7678j, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7676h, AbstractC0584a.m902c(this.f7675g, AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7673e, AbstractC0584a.m902c(this.f7672d, AbstractC0584a.m903d(AbstractC0584a.m903d(this.f7669a.hashCode() * 31, 31, this.f7670b), 31, this.f7671c), 31), 31), 31, this.f7674f), 31), 31), 31, this.f7677i), 31), 31), 31, this.f7680l), 31), 31);
        Integer num = this.f7683o;
        return Boolean.hashCode(this.f7688t) + AbstractC0584a.m902c(this.f7687s, AbstractC0584a.m902c(this.f7686r, AbstractC0584a.m902c(this.f7685q, AbstractC0584a.m902c(this.f7684p, (iM908i + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("ReviewHomeData(studentName=", this.f7669a, ", summaryText=", this.f7670b, ", recommendDescription=");
        sbM101z.append(this.f7671c);
        sbM101z.append(", recommendPracticeCount=");
        sbM101z.append(this.f7672d);
        sbM101z.append(", recommendCanPractice=");
        sbM101z.append(this.f7673e);
        sbM101z.append(", strengtheningDescription=");
        sbM101z.append(this.f7674f);
        sbM101z.append(", strengtheningCount=");
        sbM101z.append(this.f7675g);
        sbM101z.append(", strengtheningCanPractice=");
        sbM101z.append(this.f7676h);
        sbM101z.append(", consolidatingDescription=");
        sbM101z.append(this.f7677i);
        sbM101z.append(", consolidatingCount=");
        sbM101z.append(this.f7678j);
        sbM101z.append(", consolidatingCanPractice=");
        sbM101z.append(this.f7679k);
        sbM101z.append(", masteredDescription=");
        sbM101z.append(this.f7680l);
        sbM101z.append(", masteredCount=");
        sbM101z.append(this.f7681m);
        sbM101z.append(", masteredCanPractice=");
        sbM101z.append(this.f7682n);
        sbM101z.append(", recent7AddedMistakeCount=");
        sbM101z.append(this.f7683o);
        sbM101z.append(", recent7PracticeCount=");
        sbM101z.append(this.f7684p);
        sbM101z.append(", recent7PracticeDays=");
        AbstractC1923c.m1059w(sbM101z, this.f7685q, ", recent7EnterConsolidatingCount=", this.f7686r, ", recent7EnterMasteredCount=");
        sbM101z.append(this.f7687s);
        sbM101z.append(", shouldDefaultReviewTab=");
        sbM101z.append(this.f7688t);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
