package p190n6;

import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.g */
/* loaded from: classes5.dex */
public final class C9106g {

    /* renamed from: a */
    public final String f15338a;

    /* renamed from: b */
    public final FilterType.Time.JoinedTime f15339b;

    /* renamed from: c */
    public final FilterType.Subject f15340c;

    public C9106g(String keyword, FilterType.Time.JoinedTime time, FilterType.Subject subject) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.f15338a = keyword;
        this.f15339b = time;
        this.f15340c = subject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9106g)) {
            return false;
        }
        C9106g c9106g = (C9106g) obj;
        return Intrinsics.areEqual(this.f15338a, c9106g.f15338a) && Intrinsics.areEqual(this.f15339b, c9106g.f15339b) && Intrinsics.areEqual(this.f15340c, c9106g.f15340c);
    }

    public int hashCode() {
        return (((this.f15338a.hashCode() * 31) + this.f15339b.hashCode()) * 31) + this.f15340c.hashCode();
    }

    public String toString() {
        return "CollectHistoryUiState(keyword=" + this.f15338a + ", time=" + this.f15339b + ", subject=" + this.f15340c + ")";
    }

    public /* synthetic */ C9106g(String str, FilterType.Time.JoinedTime joinedTime, FilterType.Subject subject, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? HomeKt.getInitialJoinedTime() : joinedTime, (i9 & 4) != 0 ? HomeKt.getInitialSubject() : subject);
    }
}
