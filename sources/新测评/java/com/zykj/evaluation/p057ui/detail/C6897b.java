package com.zykj.evaluation.p057ui.detail;

import androidx.compose.p013ui.text.AnnotatedString;
import com.zykj.evaluation.p057ui.detail.AbstractC6896a;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p276w5.AbstractC9778i;

/* renamed from: com.zykj.evaluation.ui.detail.b */
/* loaded from: classes4.dex */
public final class C6897b {

    /* renamed from: a */
    public final String f9202a;

    /* renamed from: b */
    public final String f9203b;

    /* renamed from: c */
    public final String f9204c;

    /* renamed from: d */
    public final String f9205d;

    /* renamed from: e */
    public final boolean f9206e;

    /* renamed from: f */
    public final AnnotatedString f9207f;

    /* renamed from: g */
    public final String f9208g;

    /* renamed from: h */
    public final boolean f9209h;

    /* renamed from: i */
    public final boolean f9210i;

    /* renamed from: j */
    public final String f9211j;

    /* renamed from: k */
    public final boolean f9212k;

    /* renamed from: l */
    public final AbstractC6896a f9213l;

    /* renamed from: m */
    public final AbstractC6899d f9214m;

    /* renamed from: n */
    public final AbstractC9778i f9215n;

    /* renamed from: o */
    public final boolean f9216o;

    /* renamed from: p */
    public final boolean f9217p;

    /* renamed from: q */
    public final String f9218q;

    /* renamed from: r */
    public final String f9219r;

    /* renamed from: s */
    public final long f9220s;

    /* renamed from: t */
    public final String f9221t;

    public C6897b(String title, String indexString, String questionDescription, String examDescription, boolean z9, AnnotatedString scoreString, String str, boolean z10, boolean z11, String draftPath, boolean z12, AbstractC6896a askForHelp, AbstractC6899d isInMistake, AbstractC9778i abstractC9778i, boolean z13, boolean z14, String preQuestionString, String nextQuestionString, long j10, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(indexString, "indexString");
        Intrinsics.checkNotNullParameter(questionDescription, "questionDescription");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(scoreString, "scoreString");
        Intrinsics.checkNotNullParameter(draftPath, "draftPath");
        Intrinsics.checkNotNullParameter(askForHelp, "askForHelp");
        Intrinsics.checkNotNullParameter(isInMistake, "isInMistake");
        Intrinsics.checkNotNullParameter(preQuestionString, "preQuestionString");
        Intrinsics.checkNotNullParameter(nextQuestionString, "nextQuestionString");
        this.f9202a = title;
        this.f9203b = indexString;
        this.f9204c = questionDescription;
        this.f9205d = examDescription;
        this.f9206e = z9;
        this.f9207f = scoreString;
        this.f9208g = str;
        this.f9209h = z10;
        this.f9210i = z11;
        this.f9211j = draftPath;
        this.f9212k = z12;
        this.f9213l = askForHelp;
        this.f9214m = isInMistake;
        this.f9215n = abstractC9778i;
        this.f9216o = z13;
        this.f9217p = z14;
        this.f9218q = preQuestionString;
        this.f9219r = nextQuestionString;
        this.f9220s = j10;
        this.f9221t = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C6897b m9427b(C6897b c6897b, String str, String str2, String str3, String str4, boolean z9, AnnotatedString annotatedString, String str5, boolean z10, boolean z11, String str6, boolean z12, AbstractC6896a abstractC6896a, AbstractC6899d abstractC6899d, AbstractC9778i abstractC9778i, boolean z13, boolean z14, String str7, String str8, long j10, String str9, int i10, Object obj) {
        String str10;
        long j11;
        String str11 = (i10 & 1) != 0 ? c6897b.f9202a : str;
        String str12 = (i10 & 2) != 0 ? c6897b.f9203b : str2;
        String str13 = (i10 & 4) != 0 ? c6897b.f9204c : str3;
        String str14 = (i10 & 8) != 0 ? c6897b.f9205d : str4;
        boolean z15 = (i10 & 16) != 0 ? c6897b.f9206e : z9;
        AnnotatedString annotatedString2 = (i10 & 32) != 0 ? c6897b.f9207f : annotatedString;
        String str15 = (i10 & 64) != 0 ? c6897b.f9208g : str5;
        boolean z16 = (i10 & 128) != 0 ? c6897b.f9209h : z10;
        boolean z17 = (i10 & 256) != 0 ? c6897b.f9210i : z11;
        String str16 = (i10 & 512) != 0 ? c6897b.f9211j : str6;
        boolean z18 = (i10 & 1024) != 0 ? c6897b.f9212k : z12;
        AbstractC6896a abstractC6896a2 = (i10 & 2048) != 0 ? c6897b.f9213l : abstractC6896a;
        AbstractC6899d abstractC6899d2 = (i10 & 4096) != 0 ? c6897b.f9214m : abstractC6899d;
        AbstractC9778i abstractC9778i2 = (i10 & 8192) != 0 ? c6897b.f9215n : abstractC9778i;
        String str17 = str11;
        boolean z19 = (i10 & 16384) != 0 ? c6897b.f9216o : z13;
        boolean z20 = (i10 & 32768) != 0 ? c6897b.f9217p : z14;
        String str18 = (i10 & 65536) != 0 ? c6897b.f9218q : str7;
        String str19 = (i10 & 131072) != 0 ? c6897b.f9219r : str8;
        boolean z21 = z19;
        long j12 = (i10 & 262144) != 0 ? c6897b.f9220s : j10;
        if ((i10 & 524288) != 0) {
            j11 = j12;
            str10 = c6897b.f9221t;
        } else {
            str10 = str9;
            j11 = j12;
        }
        return c6897b.m9428a(str17, str12, str13, str14, z15, annotatedString2, str15, z16, z17, str16, z18, abstractC6896a2, abstractC6899d2, abstractC9778i2, z21, z20, str18, str19, j11, str10);
    }

    /* renamed from: a */
    public final C6897b m9428a(String title, String indexString, String questionDescription, String examDescription, boolean z9, AnnotatedString scoreString, String str, boolean z10, boolean z11, String draftPath, boolean z12, AbstractC6896a askForHelp, AbstractC6899d isInMistake, AbstractC9778i abstractC9778i, boolean z13, boolean z14, String preQuestionString, String nextQuestionString, long j10, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(indexString, "indexString");
        Intrinsics.checkNotNullParameter(questionDescription, "questionDescription");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(scoreString, "scoreString");
        Intrinsics.checkNotNullParameter(draftPath, "draftPath");
        Intrinsics.checkNotNullParameter(askForHelp, "askForHelp");
        Intrinsics.checkNotNullParameter(isInMistake, "isInMistake");
        Intrinsics.checkNotNullParameter(preQuestionString, "preQuestionString");
        Intrinsics.checkNotNullParameter(nextQuestionString, "nextQuestionString");
        return new C6897b(title, indexString, questionDescription, examDescription, z9, scoreString, str, z10, z11, draftPath, z12, askForHelp, isInMistake, abstractC9778i, z13, z14, preQuestionString, nextQuestionString, j10, str2);
    }

    /* renamed from: c */
    public final AbstractC6896a m9429c() {
        return this.f9213l;
    }

    /* renamed from: d */
    public final String m9430d() {
        return this.f9211j;
    }

    /* renamed from: e */
    public final String m9431e() {
        return this.f9205d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6897b)) {
            return false;
        }
        C6897b c6897b = (C6897b) obj;
        return Intrinsics.areEqual(this.f9202a, c6897b.f9202a) && Intrinsics.areEqual(this.f9203b, c6897b.f9203b) && Intrinsics.areEqual(this.f9204c, c6897b.f9204c) && Intrinsics.areEqual(this.f9205d, c6897b.f9205d) && this.f9206e == c6897b.f9206e && Intrinsics.areEqual(this.f9207f, c6897b.f9207f) && Intrinsics.areEqual(this.f9208g, c6897b.f9208g) && this.f9209h == c6897b.f9209h && this.f9210i == c6897b.f9210i && Intrinsics.areEqual(this.f9211j, c6897b.f9211j) && this.f9212k == c6897b.f9212k && Intrinsics.areEqual(this.f9213l, c6897b.f9213l) && Intrinsics.areEqual(this.f9214m, c6897b.f9214m) && Intrinsics.areEqual(this.f9215n, c6897b.f9215n) && this.f9216o == c6897b.f9216o && this.f9217p == c6897b.f9217p && Intrinsics.areEqual(this.f9218q, c6897b.f9218q) && Intrinsics.areEqual(this.f9219r, c6897b.f9219r) && this.f9220s == c6897b.f9220s && Intrinsics.areEqual(this.f9221t, c6897b.f9221t);
    }

    /* renamed from: f */
    public final String m9432f() {
        return this.f9203b;
    }

    /* renamed from: g */
    public final String m9433g() {
        return this.f9219r;
    }

    /* renamed from: h */
    public final String m9434h() {
        return this.f9218q;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f9202a.hashCode() * 31) + this.f9203b.hashCode()) * 31) + this.f9204c.hashCode()) * 31) + this.f9205d.hashCode()) * 31) + Boolean.hashCode(this.f9206e)) * 31) + this.f9207f.hashCode()) * 31;
        String str = this.f9208g;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f9209h)) * 31) + Boolean.hashCode(this.f9210i)) * 31) + this.f9211j.hashCode()) * 31) + Boolean.hashCode(this.f9212k)) * 31) + this.f9213l.hashCode()) * 31) + this.f9214m.hashCode()) * 31;
        AbstractC9778i abstractC9778i = this.f9215n;
        int iHashCode3 = (((((((((((iHashCode2 + (abstractC9778i == null ? 0 : abstractC9778i.hashCode())) * 31) + Boolean.hashCode(this.f9216o)) * 31) + Boolean.hashCode(this.f9217p)) * 31) + this.f9218q.hashCode()) * 31) + this.f9219r.hashCode()) * 31) + Long.hashCode(this.f9220s)) * 31;
        String str2 = this.f9221t;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final long m9435i() {
        return this.f9220s;
    }

    /* renamed from: j */
    public final String m9436j() {
        return this.f9204c;
    }

    /* renamed from: k */
    public final AnnotatedString m9437k() {
        return this.f9207f;
    }

    /* renamed from: l */
    public final boolean m9438l() {
        return this.f9217p;
    }

    /* renamed from: m */
    public final boolean m9439m() {
        return this.f9216o;
    }

    /* renamed from: n */
    public final boolean m9440n() {
        return this.f9206e;
    }

    /* renamed from: o */
    public final boolean m9441o() {
        return this.f9212k;
    }

    /* renamed from: p */
    public final String m9442p() {
        return this.f9221t;
    }

    /* renamed from: q */
    public final String m9443q() {
        return this.f9208g;
    }

    /* renamed from: r */
    public final String m9444r() {
        return this.f9202a;
    }

    /* renamed from: s */
    public final AbstractC9778i m9445s() {
        return this.f9215n;
    }

    /* renamed from: t */
    public final boolean m9446t() {
        return this.f9210i;
    }

    public String toString() {
        String str = this.f9202a;
        String str2 = this.f9203b;
        String str3 = this.f9204c;
        String str4 = this.f9205d;
        boolean z9 = this.f9206e;
        AnnotatedString annotatedString = this.f9207f;
        return "DetailCommonState(title=" + str + ", indexString=" + str2 + ", questionDescription=" + str3 + ", examDescription=" + str4 + ", showProgress=" + z9 + ", scoreString=" + ((Object) annotatedString) + ", stemUrl=" + this.f9208g + ", isSeeMode=" + this.f9209h + ", isAnalysisButtonVisible=" + this.f9210i + ", draftPath=" + this.f9211j + ", showRightMask=" + this.f9212k + ", askForHelp=" + this.f9213l + ", isInMistake=" + this.f9214m + ", toAsk=" + this.f9215n + ", showConfirmButton=" + this.f9216o + ", showChangeQuestionButton=" + this.f9217p + ", preQuestionString=" + this.f9218q + ", nextQuestionString=" + this.f9219r + ", qstLastModifyTime=" + this.f9220s + ", stem=" + this.f9221t + ")";
    }

    /* renamed from: u */
    public final AbstractC6899d m9447u() {
        return this.f9214m;
    }

    /* renamed from: v */
    public final boolean m9448v() {
        return this.f9209h;
    }

    public /* synthetic */ C6897b(String str, String str2, String str3, String str4, boolean z9, AnnotatedString annotatedString, String str5, boolean z10, boolean z11, String str6, boolean z12, AbstractC6896a abstractC6896a, AbstractC6899d abstractC6899d, AbstractC9778i abstractC9778i, boolean z13, boolean z14, String str7, String str8, long j10, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? false : z9, (i10 & 32) != 0 ? new AnnotatedString("", null, 2, null) : annotatedString, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) == 0 ? str6 : "", (i10 & 1024) != 0 ? false : z12, (i10 & 2048) != 0 ? AbstractC6896a.a.f9200c : abstractC6896a, (i10 & 4096) != 0 ? AbstractC6899d.a.f9245c : abstractC6899d, (i10 & 8192) != 0 ? null : abstractC9778i, (i10 & 16384) != 0 ? false : z13, (i10 & 32768) != 0 ? false : z14, (i10 & 65536) != 0 ? "上一题" : str7, (i10 & 131072) != 0 ? "下一题" : str8, (i10 & 262144) != 0 ? 0L : j10, (i10 & 524288) != 0 ? null : str9);
    }
}
