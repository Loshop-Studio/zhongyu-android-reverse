package p180m6;

import com.zykj.student.dialogue.bean.resp.CourseItem;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m6.e0 */
/* loaded from: classes5.dex */
public final class C8993e0 {

    /* renamed from: a */
    public final List f15110a;

    /* renamed from: b */
    public final boolean f15111b;

    /* renamed from: c */
    public final String f15112c;

    /* renamed from: d */
    public final CourseItem f15113d;

    public C8993e0(List list, boolean z9, String keyword, CourseItem courseItem) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.f15110a = list;
        this.f15111b = z9;
        this.f15112c = keyword;
        this.f15113d = courseItem;
    }

    /* renamed from: b */
    public static /* synthetic */ C8993e0 m14371b(C8993e0 c8993e0, List list, boolean z9, String str, CourseItem courseItem, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = c8993e0.f15110a;
        }
        if ((i9 & 2) != 0) {
            z9 = c8993e0.f15111b;
        }
        if ((i9 & 4) != 0) {
            str = c8993e0.f15112c;
        }
        if ((i9 & 8) != 0) {
            courseItem = c8993e0.f15113d;
        }
        return c8993e0.m14372a(list, z9, str, courseItem);
    }

    /* renamed from: a */
    public final C8993e0 m14372a(List list, boolean z9, String keyword, CourseItem courseItem) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new C8993e0(list, z9, keyword, courseItem);
    }

    /* renamed from: c */
    public final CourseItem m14373c() {
        return this.f15113d;
    }

    /* renamed from: d */
    public final String m14374d() {
        return this.f15112c;
    }

    /* renamed from: e */
    public final List m14375e() {
        return this.f15110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8993e0)) {
            return false;
        }
        C8993e0 c8993e0 = (C8993e0) obj;
        return Intrinsics.areEqual(this.f15110a, c8993e0.f15110a) && this.f15111b == c8993e0.f15111b && Intrinsics.areEqual(this.f15112c, c8993e0.f15112c) && Intrinsics.areEqual(this.f15113d, c8993e0.f15113d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f15110a.hashCode() * 31) + Boolean.hashCode(this.f15111b)) * 31) + this.f15112c.hashCode()) * 31;
        CourseItem courseItem = this.f15113d;
        return iHashCode + (courseItem == null ? 0 : courseItem.hashCode());
    }

    public String toString() {
        return "AskQuestionUiState(list=" + this.f15110a + ", isShowProgress=" + this.f15111b + ", keyword=" + this.f15112c + ", checkedItem=" + this.f15113d + ")";
    }

    public /* synthetic */ C8993e0(List list, boolean z9, String str, CourseItem courseItem, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? CollectionsKt.emptyList() : list, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? null : courseItem);
    }
}
