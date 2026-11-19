package p111h6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p133j6.AbstractC7797a;

/* renamed from: h6.a */
/* loaded from: classes4.dex */
public final class C7630a {

    /* renamed from: a */
    public final String f12823a;

    /* renamed from: b */
    public final String f12824b;

    /* renamed from: c */
    public final String f12825c;

    /* renamed from: d */
    public final String f12826d;

    /* renamed from: e */
    public final boolean f12827e;

    /* renamed from: f */
    public final String f12828f;

    /* renamed from: g */
    public final String f12829g;

    /* renamed from: h */
    public final boolean f12830h;

    /* renamed from: i */
    public final String f12831i;

    /* renamed from: j */
    public final List f12832j;

    /* renamed from: k */
    public final String f12833k;

    /* renamed from: l */
    public final List f12834l;

    /* renamed from: m */
    public final String f12835m;

    /* renamed from: n */
    public final AbstractC7797a f12836n;

    public C7630a(String title, String grade, String topic, String taskTime, boolean z9, String totalScore, String resultScore, boolean z10, String noSubmitStudent, List noSubmitStudentList, String noCorrectStudent, List noCorrectStudentList, String examDescription, AbstractC7797a correctAnalysisState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(grade, "grade");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(taskTime, "taskTime");
        Intrinsics.checkNotNullParameter(totalScore, "totalScore");
        Intrinsics.checkNotNullParameter(resultScore, "resultScore");
        Intrinsics.checkNotNullParameter(noSubmitStudent, "noSubmitStudent");
        Intrinsics.checkNotNullParameter(noSubmitStudentList, "noSubmitStudentList");
        Intrinsics.checkNotNullParameter(noCorrectStudent, "noCorrectStudent");
        Intrinsics.checkNotNullParameter(noCorrectStudentList, "noCorrectStudentList");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(correctAnalysisState, "correctAnalysisState");
        this.f12823a = title;
        this.f12824b = grade;
        this.f12825c = topic;
        this.f12826d = taskTime;
        this.f12827e = z9;
        this.f12828f = totalScore;
        this.f12829g = resultScore;
        this.f12830h = z10;
        this.f12831i = noSubmitStudent;
        this.f12832j = noSubmitStudentList;
        this.f12833k = noCorrectStudent;
        this.f12834l = noCorrectStudentList;
        this.f12835m = examDescription;
        this.f12836n = correctAnalysisState;
    }

    /* renamed from: a */
    public final C7630a m12601a(String title, String grade, String topic, String taskTime, boolean z9, String totalScore, String resultScore, boolean z10, String noSubmitStudent, List noSubmitStudentList, String noCorrectStudent, List noCorrectStudentList, String examDescription, AbstractC7797a correctAnalysisState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(grade, "grade");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(taskTime, "taskTime");
        Intrinsics.checkNotNullParameter(totalScore, "totalScore");
        Intrinsics.checkNotNullParameter(resultScore, "resultScore");
        Intrinsics.checkNotNullParameter(noSubmitStudent, "noSubmitStudent");
        Intrinsics.checkNotNullParameter(noSubmitStudentList, "noSubmitStudentList");
        Intrinsics.checkNotNullParameter(noCorrectStudent, "noCorrectStudent");
        Intrinsics.checkNotNullParameter(noCorrectStudentList, "noCorrectStudentList");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(correctAnalysisState, "correctAnalysisState");
        return new C7630a(title, grade, topic, taskTime, z9, totalScore, resultScore, z10, noSubmitStudent, noSubmitStudentList, noCorrectStudent, noCorrectStudentList, examDescription, correctAnalysisState);
    }

    /* renamed from: c */
    public final AbstractC7797a m12602c() {
        return this.f12836n;
    }

    /* renamed from: d */
    public final boolean m12603d() {
        return this.f12827e;
    }

    /* renamed from: e */
    public final String m12604e() {
        return this.f12835m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7630a)) {
            return false;
        }
        C7630a c7630a = (C7630a) obj;
        return Intrinsics.areEqual(this.f12823a, c7630a.f12823a) && Intrinsics.areEqual(this.f12824b, c7630a.f12824b) && Intrinsics.areEqual(this.f12825c, c7630a.f12825c) && Intrinsics.areEqual(this.f12826d, c7630a.f12826d) && this.f12827e == c7630a.f12827e && Intrinsics.areEqual(this.f12828f, c7630a.f12828f) && Intrinsics.areEqual(this.f12829g, c7630a.f12829g) && this.f12830h == c7630a.f12830h && Intrinsics.areEqual(this.f12831i, c7630a.f12831i) && Intrinsics.areEqual(this.f12832j, c7630a.f12832j) && Intrinsics.areEqual(this.f12833k, c7630a.f12833k) && Intrinsics.areEqual(this.f12834l, c7630a.f12834l) && Intrinsics.areEqual(this.f12835m, c7630a.f12835m) && Intrinsics.areEqual(this.f12836n, c7630a.f12836n);
    }

    /* renamed from: f */
    public final String m12605f() {
        return this.f12824b;
    }

    /* renamed from: g */
    public final String m12606g() {
        return this.f12833k;
    }

    /* renamed from: h */
    public final List m12607h() {
        return this.f12834l;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f12823a.hashCode() * 31) + this.f12824b.hashCode()) * 31) + this.f12825c.hashCode()) * 31) + this.f12826d.hashCode()) * 31) + Boolean.hashCode(this.f12827e)) * 31) + this.f12828f.hashCode()) * 31) + this.f12829g.hashCode()) * 31) + Boolean.hashCode(this.f12830h)) * 31) + this.f12831i.hashCode()) * 31) + this.f12832j.hashCode()) * 31) + this.f12833k.hashCode()) * 31) + this.f12834l.hashCode()) * 31) + this.f12835m.hashCode()) * 31) + this.f12836n.hashCode();
    }

    /* renamed from: i */
    public final String m12608i() {
        return this.f12831i;
    }

    /* renamed from: j */
    public final List m12609j() {
        return this.f12832j;
    }

    /* renamed from: k */
    public final String m12610k() {
        return this.f12829g;
    }

    /* renamed from: l */
    public final String m12611l() {
        return this.f12826d;
    }

    /* renamed from: m */
    public final String m12612m() {
        return this.f12823a;
    }

    /* renamed from: n */
    public final String m12613n() {
        return this.f12825c;
    }

    /* renamed from: o */
    public final String m12614o() {
        return this.f12828f;
    }

    /* renamed from: p */
    public final boolean m12615p() {
        return this.f12830h;
    }

    public String toString() {
        return "GuideTaskLeftInfoViewState(title=" + this.f12823a + ", grade=" + this.f12824b + ", topic=" + this.f12825c + ", taskTime=" + this.f12826d + ", enableScore=" + this.f12827e + ", totalScore=" + this.f12828f + ", resultScore=" + this.f12829g + ", isRepresentative=" + this.f12830h + ", noSubmitStudent=" + this.f12831i + ", noSubmitStudentList=" + this.f12832j + ", noCorrectStudent=" + this.f12833k + ", noCorrectStudentList=" + this.f12834l + ", examDescription=" + this.f12835m + ", correctAnalysisState=" + this.f12836n + ")";
    }

    public /* synthetic */ C7630a(String str, String str2, String str3, String str4, boolean z9, String str5, String str6, boolean z10, String str7, List list, String str8, List list2, String str9, AbstractC7797a abstractC7797a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? false : z9, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? "" : str6, (i10 & 128) == 0 ? z10 : false, (i10 & 256) != 0 ? "" : str7, (i10 & 512) != 0 ? CollectionsKt.emptyList() : list, (i10 & 1024) != 0 ? "" : str8, (i10 & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4096) == 0 ? str9 : "", (i10 & 8192) != 0 ? AbstractC7797a.a.f13459c : abstractC7797a);
    }
}
