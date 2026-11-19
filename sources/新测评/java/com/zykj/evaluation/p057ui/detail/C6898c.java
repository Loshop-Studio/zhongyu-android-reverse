package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.p057ui.detail.AbstractC6900e;
import com.zykj.evaluation.p057ui.detail.AbstractC6901f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p122i6.AbstractC7699p0;

/* renamed from: com.zykj.evaluation.ui.detail.c */
/* loaded from: classes4.dex */
public final class C6898c {

    /* renamed from: a */
    public final long f9222a;

    /* renamed from: b */
    public final String f9223b;

    /* renamed from: c */
    public final AbstractC7699p0 f9224c;

    /* renamed from: d */
    public final String f9225d;

    /* renamed from: e */
    public final List f9226e;

    /* renamed from: f */
    public final List f9227f;

    /* renamed from: g */
    public final String f9228g;

    /* renamed from: h */
    public final String f9229h;

    /* renamed from: i */
    public final AbstractC6901f f9230i;

    /* renamed from: j */
    public final AbstractC6900e f9231j;

    public C6898c(long j10, String uuid, AbstractC7699p0 type, String number, List options, List answers, String sketchPath, String comment, AbstractC6901f result, AbstractC6900e correctSelfResult) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(sketchPath, "sketchPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(correctSelfResult, "correctSelfResult");
        this.f9222a = j10;
        this.f9223b = uuid;
        this.f9224c = type;
        this.f9225d = number;
        this.f9226e = options;
        this.f9227f = answers;
        this.f9228g = sketchPath;
        this.f9229h = comment;
        this.f9230i = result;
        this.f9231j = correctSelfResult;
    }

    /* renamed from: b */
    public static /* synthetic */ C6898c m9449b(C6898c c6898c, long j10, String str, AbstractC7699p0 abstractC7699p0, String str2, List list, List list2, String str3, String str4, AbstractC6901f abstractC6901f, AbstractC6900e abstractC6900e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c6898c.f9222a;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = c6898c.f9223b;
        }
        return c6898c.m9450a(j11, str, (i10 & 4) != 0 ? c6898c.f9224c : abstractC7699p0, (i10 & 8) != 0 ? c6898c.f9225d : str2, (i10 & 16) != 0 ? c6898c.f9226e : list, (i10 & 32) != 0 ? c6898c.f9227f : list2, (i10 & 64) != 0 ? c6898c.f9228g : str3, (i10 & 128) != 0 ? c6898c.f9229h : str4, (i10 & 256) != 0 ? c6898c.f9230i : abstractC6901f, (i10 & 512) != 0 ? c6898c.f9231j : abstractC6900e);
    }

    /* renamed from: a */
    public final C6898c m9450a(long j10, String uuid, AbstractC7699p0 type, String number, List options, List answers, String sketchPath, String comment, AbstractC6901f result, AbstractC6900e correctSelfResult) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(sketchPath, "sketchPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(correctSelfResult, "correctSelfResult");
        return new C6898c(j10, uuid, type, number, options, answers, sketchPath, comment, result, correctSelfResult);
    }

    /* renamed from: c */
    public final List m9451c() {
        return this.f9227f;
    }

    /* renamed from: d */
    public final String m9452d() {
        return this.f9229h;
    }

    /* renamed from: e */
    public final AbstractC6900e m9453e() {
        return this.f9231j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6898c)) {
            return false;
        }
        C6898c c6898c = (C6898c) obj;
        return this.f9222a == c6898c.f9222a && Intrinsics.areEqual(this.f9223b, c6898c.f9223b) && Intrinsics.areEqual(this.f9224c, c6898c.f9224c) && Intrinsics.areEqual(this.f9225d, c6898c.f9225d) && Intrinsics.areEqual(this.f9226e, c6898c.f9226e) && Intrinsics.areEqual(this.f9227f, c6898c.f9227f) && Intrinsics.areEqual(this.f9228g, c6898c.f9228g) && Intrinsics.areEqual(this.f9229h, c6898c.f9229h) && Intrinsics.areEqual(this.f9230i, c6898c.f9230i) && Intrinsics.areEqual(this.f9231j, c6898c.f9231j);
    }

    /* renamed from: f */
    public final String m9454f() {
        return this.f9225d;
    }

    /* renamed from: g */
    public final List m9455g() {
        return this.f9226e;
    }

    /* renamed from: h */
    public final long m9456h() {
        return this.f9222a;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f9222a) * 31) + this.f9223b.hashCode()) * 31) + this.f9224c.hashCode()) * 31) + this.f9225d.hashCode()) * 31) + this.f9226e.hashCode()) * 31) + this.f9227f.hashCode()) * 31) + this.f9228g.hashCode()) * 31) + this.f9229h.hashCode()) * 31) + this.f9230i.hashCode()) * 31) + this.f9231j.hashCode();
    }

    /* renamed from: i */
    public final AbstractC6901f m9457i() {
        return this.f9230i;
    }

    /* renamed from: j */
    public final String m9458j() {
        return this.f9228g;
    }

    /* renamed from: k */
    public final AbstractC7699p0 m9459k() {
        return this.f9224c;
    }

    /* renamed from: l */
    public final String m9460l() {
        return this.f9223b;
    }

    public String toString() {
        return "DetailSubQuestionState(questionId=" + this.f9222a + ", uuid=" + this.f9223b + ", type=" + this.f9224c + ", number=" + this.f9225d + ", options=" + this.f9226e + ", answers=" + this.f9227f + ", sketchPath=" + this.f9228g + ", comment=" + this.f9229h + ", result=" + this.f9230i + ", correctSelfResult=" + this.f9231j + ")";
    }

    public /* synthetic */ C6898c(long j10, String str, AbstractC7699p0 abstractC7699p0, String str2, List list, List list2, String str3, String str4, AbstractC6901f abstractC6901f, AbstractC6900e abstractC6900e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? AbstractC7699p0.c.a.f13056b : abstractC7699p0, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 64) != 0 ? "" : str3, (i10 & 128) != 0 ? "" : str4, (i10 & 256) != 0 ? AbstractC6901f.c.f9271b : abstractC6901f, (i10 & 512) != 0 ? AbstractC6900e.c.f9266d : abstractC6900e);
    }
}
