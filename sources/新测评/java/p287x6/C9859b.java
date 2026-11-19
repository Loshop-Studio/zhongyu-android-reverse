package p287x6;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.b */
/* loaded from: classes4.dex */
public final class C9859b {

    /* renamed from: a */
    public final List f17429a;

    public C9859b(List correctQuestionList) {
        Intrinsics.checkNotNullParameter(correctQuestionList, "correctQuestionList");
        this.f17429a = correctQuestionList;
    }

    /* renamed from: a */
    public final C9859b m16522a(List correctQuestionList) {
        Intrinsics.checkNotNullParameter(correctQuestionList, "correctQuestionList");
        return new C9859b(correctQuestionList);
    }

    /* renamed from: b */
    public final List m16523b() {
        return this.f17429a;
    }

    /* renamed from: c */
    public final boolean m16524c() {
        List list = this.f17429a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9861d) it.next()).m16536h()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9859b) && Intrinsics.areEqual(this.f17429a, ((C9859b) obj).f17429a);
    }

    public int hashCode() {
        return this.f17429a.hashCode();
    }

    public String toString() {
        return "CorrectDataState(correctQuestionList=" + this.f17429a + ")";
    }

    public /* synthetic */ C9859b(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
