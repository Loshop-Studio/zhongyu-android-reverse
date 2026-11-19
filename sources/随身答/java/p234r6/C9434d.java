package p234r6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r6.d */
/* loaded from: classes5.dex */
public final class C9434d {

    /* renamed from: a */
    public final List f16452a;

    public C9434d(List categoryList) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        this.f16452a = categoryList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9434d) && Intrinsics.areEqual(this.f16452a, ((C9434d) obj).f16452a);
    }

    public int hashCode() {
        return this.f16452a.hashCode();
    }

    public String toString() {
        return "EditCategoryViewState(categoryList=" + this.f16452a + ")";
    }

    public /* synthetic */ C9434d(List list, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
