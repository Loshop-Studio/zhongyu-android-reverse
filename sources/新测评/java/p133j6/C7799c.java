package p133j6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.c */
/* loaded from: classes4.dex */
public final class C7799c {

    /* renamed from: a */
    public final String f13462a;

    /* renamed from: b */
    public final String f13463b;

    /* renamed from: c */
    public final String f13464c;

    /* renamed from: d */
    public final List f13465d;

    public C7799c(String title, String info, String description, List questionList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        this.f13462a = title;
        this.f13463b = info;
        this.f13464c = description;
        this.f13465d = questionList;
    }

    /* renamed from: a */
    public final String m13206a() {
        return this.f13464c;
    }

    /* renamed from: b */
    public final String m13207b() {
        return this.f13463b;
    }

    /* renamed from: c */
    public final List m13208c() {
        return this.f13465d;
    }

    /* renamed from: d */
    public final String m13209d() {
        return this.f13462a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7799c)) {
            return false;
        }
        C7799c c7799c = (C7799c) obj;
        return Intrinsics.areEqual(this.f13462a, c7799c.f13462a) && Intrinsics.areEqual(this.f13463b, c7799c.f13463b) && Intrinsics.areEqual(this.f13464c, c7799c.f13464c) && Intrinsics.areEqual(this.f13465d, c7799c.f13465d);
    }

    public int hashCode() {
        return (((((this.f13462a.hashCode() * 31) + this.f13463b.hashCode()) * 31) + this.f13464c.hashCode()) * 31) + this.f13465d.hashCode();
    }

    public String toString() {
        return "GuideGroupState(title=" + this.f13462a + ", info=" + this.f13463b + ", description=" + this.f13464c + ", questionList=" + this.f13465d + ")";
    }
}
