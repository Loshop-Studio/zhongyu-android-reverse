package p122i6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.o0 */
/* loaded from: classes4.dex */
public final class C7697o0 {

    /* renamed from: a */
    public final List f13049a;

    public C7697o0(List questionGroup) {
        Intrinsics.checkNotNullParameter(questionGroup, "questionGroup");
        this.f13049a = questionGroup;
    }

    /* renamed from: a */
    public final C7697o0 m12879a(List questionGroup) {
        Intrinsics.checkNotNullParameter(questionGroup, "questionGroup");
        return new C7697o0(questionGroup);
    }

    /* renamed from: b */
    public final List m12880b() {
        return this.f13049a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7697o0) && Intrinsics.areEqual(this.f13049a, ((C7697o0) obj).f13049a);
    }

    public int hashCode() {
        return this.f13049a.hashCode();
    }

    public String toString() {
        return "NoStemViewState(questionGroup=" + this.f13049a + ")";
    }

    public /* synthetic */ C7697o0(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
