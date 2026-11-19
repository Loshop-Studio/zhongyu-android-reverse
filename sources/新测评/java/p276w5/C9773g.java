package p276w5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.g */
/* loaded from: classes4.dex */
public final class C9773g {

    /* renamed from: a */
    public final String f17237a;

    /* renamed from: b */
    public final String f17238b;

    /* renamed from: c */
    public final String f17239c;

    public C9773g(String answer, String comment, String name) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17237a = answer;
        this.f17238b = comment;
        this.f17239c = name;
    }

    /* renamed from: a */
    public final String m16381a() {
        return this.f17237a;
    }

    /* renamed from: b */
    public final String m16382b() {
        return this.f17238b;
    }

    /* renamed from: c */
    public final String m16383c() {
        return this.f17239c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9773g)) {
            return false;
        }
        C9773g c9773g = (C9773g) obj;
        return Intrinsics.areEqual(this.f17237a, c9773g.f17237a) && Intrinsics.areEqual(this.f17238b, c9773g.f17238b) && Intrinsics.areEqual(this.f17239c, c9773g.f17239c);
    }

    public int hashCode() {
        return (((this.f17237a.hashCode() * 31) + this.f17238b.hashCode()) * 31) + this.f17239c.hashCode();
    }

    public String toString() {
        return "DetailTypicalAnswerState(answer=" + this.f17237a + ", comment=" + this.f17238b + ", name=" + this.f17239c + ")";
    }

    public /* synthetic */ C9773g(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
