package p276w5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.e */
/* loaded from: classes4.dex */
public final class C9767e {

    /* renamed from: a */
    public final List f17219a;

    /* renamed from: b */
    public final boolean f17220b;

    /* renamed from: c */
    public final boolean f17221c;

    /* renamed from: d */
    public final List f17222d;

    /* renamed from: e */
    public final List f17223e;

    /* renamed from: f */
    public final List f17224f;

    /* renamed from: g */
    public final String f17225g;

    /* renamed from: h */
    public final String f17226h;

    /* renamed from: i */
    public final List f17227i;

    /* renamed from: j */
    public final List f17228j;

    /* renamed from: k */
    public final List f17229k;

    /* renamed from: l */
    public final List f17230l;

    public C9767e(List scoreList, boolean z9, boolean z10, List examAnswerList, List reviseAnswerList, List localAnswerList, String examMicroClass, String reviseMicroClass, List microClassList, List typicalRightAnswerList, List typicalErrorAnswerList, List draftList) {
        Intrinsics.checkNotNullParameter(scoreList, "scoreList");
        Intrinsics.checkNotNullParameter(examAnswerList, "examAnswerList");
        Intrinsics.checkNotNullParameter(reviseAnswerList, "reviseAnswerList");
        Intrinsics.checkNotNullParameter(localAnswerList, "localAnswerList");
        Intrinsics.checkNotNullParameter(examMicroClass, "examMicroClass");
        Intrinsics.checkNotNullParameter(reviseMicroClass, "reviseMicroClass");
        Intrinsics.checkNotNullParameter(microClassList, "microClassList");
        Intrinsics.checkNotNullParameter(typicalRightAnswerList, "typicalRightAnswerList");
        Intrinsics.checkNotNullParameter(typicalErrorAnswerList, "typicalErrorAnswerList");
        Intrinsics.checkNotNullParameter(draftList, "draftList");
        this.f17219a = scoreList;
        this.f17220b = z9;
        this.f17221c = z10;
        this.f17222d = examAnswerList;
        this.f17223e = reviseAnswerList;
        this.f17224f = localAnswerList;
        this.f17225g = examMicroClass;
        this.f17226h = reviseMicroClass;
        this.f17227i = microClassList;
        this.f17228j = typicalRightAnswerList;
        this.f17229k = typicalErrorAnswerList;
        this.f17230l = draftList;
    }

    /* renamed from: b */
    public static /* synthetic */ C9767e m16364b(C9767e c9767e, List list, boolean z9, boolean z10, List list2, List list3, List list4, String str, String str2, List list5, List list6, List list7, List list8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = c9767e.f17219a;
        }
        if ((i10 & 2) != 0) {
            z9 = c9767e.f17220b;
        }
        if ((i10 & 4) != 0) {
            z10 = c9767e.f17221c;
        }
        if ((i10 & 8) != 0) {
            list2 = c9767e.f17222d;
        }
        if ((i10 & 16) != 0) {
            list3 = c9767e.f17223e;
        }
        if ((i10 & 32) != 0) {
            list4 = c9767e.f17224f;
        }
        if ((i10 & 64) != 0) {
            str = c9767e.f17225g;
        }
        if ((i10 & 128) != 0) {
            str2 = c9767e.f17226h;
        }
        if ((i10 & 256) != 0) {
            list5 = c9767e.f17227i;
        }
        if ((i10 & 512) != 0) {
            list6 = c9767e.f17228j;
        }
        if ((i10 & 1024) != 0) {
            list7 = c9767e.f17229k;
        }
        if ((i10 & 2048) != 0) {
            list8 = c9767e.f17230l;
        }
        List list9 = list7;
        List list10 = list8;
        List list11 = list5;
        List list12 = list6;
        String str3 = str;
        String str4 = str2;
        List list13 = list3;
        List list14 = list4;
        return c9767e.m16365a(list, z9, z10, list2, list13, list14, str3, str4, list11, list12, list9, list10);
    }

    /* renamed from: a */
    public final C9767e m16365a(List scoreList, boolean z9, boolean z10, List examAnswerList, List reviseAnswerList, List localAnswerList, String examMicroClass, String reviseMicroClass, List microClassList, List typicalRightAnswerList, List typicalErrorAnswerList, List draftList) {
        Intrinsics.checkNotNullParameter(scoreList, "scoreList");
        Intrinsics.checkNotNullParameter(examAnswerList, "examAnswerList");
        Intrinsics.checkNotNullParameter(reviseAnswerList, "reviseAnswerList");
        Intrinsics.checkNotNullParameter(localAnswerList, "localAnswerList");
        Intrinsics.checkNotNullParameter(examMicroClass, "examMicroClass");
        Intrinsics.checkNotNullParameter(reviseMicroClass, "reviseMicroClass");
        Intrinsics.checkNotNullParameter(microClassList, "microClassList");
        Intrinsics.checkNotNullParameter(typicalRightAnswerList, "typicalRightAnswerList");
        Intrinsics.checkNotNullParameter(typicalErrorAnswerList, "typicalErrorAnswerList");
        Intrinsics.checkNotNullParameter(draftList, "draftList");
        return new C9767e(scoreList, z9, z10, examAnswerList, reviseAnswerList, localAnswerList, examMicroClass, reviseMicroClass, microClassList, typicalRightAnswerList, typicalErrorAnswerList, draftList);
    }

    /* renamed from: c */
    public final List m16366c() {
        return this.f17230l;
    }

    /* renamed from: d */
    public final List m16367d() {
        return this.f17222d;
    }

    /* renamed from: e */
    public final String m16368e() {
        return this.f17225g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9767e)) {
            return false;
        }
        C9767e c9767e = (C9767e) obj;
        return Intrinsics.areEqual(this.f17219a, c9767e.f17219a) && this.f17220b == c9767e.f17220b && this.f17221c == c9767e.f17221c && Intrinsics.areEqual(this.f17222d, c9767e.f17222d) && Intrinsics.areEqual(this.f17223e, c9767e.f17223e) && Intrinsics.areEqual(this.f17224f, c9767e.f17224f) && Intrinsics.areEqual(this.f17225g, c9767e.f17225g) && Intrinsics.areEqual(this.f17226h, c9767e.f17226h) && Intrinsics.areEqual(this.f17227i, c9767e.f17227i) && Intrinsics.areEqual(this.f17228j, c9767e.f17228j) && Intrinsics.areEqual(this.f17229k, c9767e.f17229k) && Intrinsics.areEqual(this.f17230l, c9767e.f17230l);
    }

    /* renamed from: f */
    public final List m16369f() {
        return this.f17224f;
    }

    /* renamed from: g */
    public final List m16370g() {
        return this.f17227i;
    }

    /* renamed from: h */
    public final List m16371h() {
        return this.f17223e;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f17219a.hashCode() * 31) + Boolean.hashCode(this.f17220b)) * 31) + Boolean.hashCode(this.f17221c)) * 31) + this.f17222d.hashCode()) * 31) + this.f17223e.hashCode()) * 31) + this.f17224f.hashCode()) * 31) + this.f17225g.hashCode()) * 31) + this.f17226h.hashCode()) * 31) + this.f17227i.hashCode()) * 31) + this.f17228j.hashCode()) * 31) + this.f17229k.hashCode()) * 31) + this.f17230l.hashCode();
    }

    /* renamed from: i */
    public final String m16372i() {
        return this.f17226h;
    }

    /* renamed from: j */
    public final List m16373j() {
        return this.f17219a;
    }

    /* renamed from: k */
    public final List m16374k() {
        return this.f17229k;
    }

    /* renamed from: l */
    public final List m16375l() {
        return this.f17228j;
    }

    /* renamed from: m */
    public final boolean m16376m() {
        return this.f17220b;
    }

    /* renamed from: n */
    public final boolean m16377n() {
        return this.f17221c;
    }

    public String toString() {
        return "DetailQuestionState(scoreList=" + this.f17219a + ", isAnswerWithQuestion=" + this.f17220b + ", isInCorrect=" + this.f17221c + ", examAnswerList=" + this.f17222d + ", reviseAnswerList=" + this.f17223e + ", localAnswerList=" + this.f17224f + ", examMicroClass=" + this.f17225g + ", reviseMicroClass=" + this.f17226h + ", microClassList=" + this.f17227i + ", typicalRightAnswerList=" + this.f17228j + ", typicalErrorAnswerList=" + this.f17229k + ", draftList=" + this.f17230l + ")";
    }

    public /* synthetic */ C9767e(List list, boolean z9, boolean z10, List list2, List list3, List list4, String str, String str2, List list5, List list6, List list7, List list8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? true : z9, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list4, (i10 & 64) != 0 ? "" : str, (i10 & 128) != 0 ? "" : str2, (i10 & 256) != 0 ? CollectionsKt.emptyList() : list5, (i10 & 512) != 0 ? CollectionsKt.emptyList() : list6, (i10 & 1024) != 0 ? CollectionsKt.emptyList() : list7, (i10 & 2048) != 0 ? CollectionsKt.emptyList() : list8);
    }
}
