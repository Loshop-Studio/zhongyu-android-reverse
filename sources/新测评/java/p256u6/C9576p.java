package p256u6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u6.p */
/* loaded from: classes4.dex */
public final class C9576p {

    /* renamed from: a */
    public final List f16780a;

    /* renamed from: b */
    public final List f16781b;

    /* renamed from: c */
    public final List f16782c;

    public C9576p(List pageTitleList, List todoStudents, List correctStudents) {
        Intrinsics.checkNotNullParameter(pageTitleList, "pageTitleList");
        Intrinsics.checkNotNullParameter(todoStudents, "todoStudents");
        Intrinsics.checkNotNullParameter(correctStudents, "correctStudents");
        this.f16780a = pageTitleList;
        this.f16781b = todoStudents;
        this.f16782c = correctStudents;
    }

    /* renamed from: a */
    public final C9576p m15981a(List pageTitleList, List todoStudents, List correctStudents) {
        Intrinsics.checkNotNullParameter(pageTitleList, "pageTitleList");
        Intrinsics.checkNotNullParameter(todoStudents, "todoStudents");
        Intrinsics.checkNotNullParameter(correctStudents, "correctStudents");
        return new C9576p(pageTitleList, todoStudents, correctStudents);
    }

    /* renamed from: b */
    public final List m15982b() {
        return this.f16782c;
    }

    /* renamed from: c */
    public final List m15983c() {
        return this.f16780a;
    }

    /* renamed from: d */
    public final List m15984d() {
        return this.f16781b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9576p)) {
            return false;
        }
        C9576p c9576p = (C9576p) obj;
        return Intrinsics.areEqual(this.f16780a, c9576p.f16780a) && Intrinsics.areEqual(this.f16781b, c9576p.f16781b) && Intrinsics.areEqual(this.f16782c, c9576p.f16782c);
    }

    public int hashCode() {
        return (((this.f16780a.hashCode() * 31) + this.f16781b.hashCode()) * 31) + this.f16782c.hashCode();
    }

    public String toString() {
        return "ProgressViewState(pageTitleList=" + this.f16780a + ", todoStudents=" + this.f16781b + ", correctStudents=" + this.f16782c + ")";
    }

    public /* synthetic */ C9576p(List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
