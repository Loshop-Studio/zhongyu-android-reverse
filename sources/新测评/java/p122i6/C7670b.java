package p122i6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.b */
/* loaded from: classes4.dex */
public final class C7670b {

    /* renamed from: a */
    public final String f12969a;

    /* renamed from: b */
    public final String f12970b;

    /* renamed from: c */
    public final String f12971c;

    /* renamed from: d */
    public final List f12972d;

    public C7670b(String title, String info, String description, List questionList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        this.f12969a = title;
        this.f12970b = info;
        this.f12971c = description;
        this.f12972d = questionList;
    }

    /* renamed from: b */
    public static /* synthetic */ C7670b m12807b(C7670b c7670b, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c7670b.f12969a;
        }
        if ((i10 & 2) != 0) {
            str2 = c7670b.f12970b;
        }
        if ((i10 & 4) != 0) {
            str3 = c7670b.f12971c;
        }
        if ((i10 & 8) != 0) {
            list = c7670b.f12972d;
        }
        return c7670b.m12808a(str, str2, str3, list);
    }

    /* renamed from: a */
    public final C7670b m12808a(String title, String info, String description, List questionList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        return new C7670b(title, info, description, questionList);
    }

    /* renamed from: c */
    public final String m12809c() {
        return this.f12971c;
    }

    /* renamed from: d */
    public final String m12810d() {
        return this.f12970b;
    }

    /* renamed from: e */
    public final List m12811e() {
        return this.f12972d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7670b)) {
            return false;
        }
        C7670b c7670b = (C7670b) obj;
        return Intrinsics.areEqual(this.f12969a, c7670b.f12969a) && Intrinsics.areEqual(this.f12970b, c7670b.f12970b) && Intrinsics.areEqual(this.f12971c, c7670b.f12971c) && Intrinsics.areEqual(this.f12972d, c7670b.f12972d);
    }

    /* renamed from: f */
    public final String m12812f() {
        return this.f12969a;
    }

    public int hashCode() {
        return (((((this.f12969a.hashCode() * 31) + this.f12970b.hashCode()) * 31) + this.f12971c.hashCode()) * 31) + this.f12972d.hashCode();
    }

    public String toString() {
        return "NoStemGroupState(title=" + this.f12969a + ", info=" + this.f12970b + ", description=" + this.f12971c + ", questionList=" + this.f12972d + ")";
    }
}
