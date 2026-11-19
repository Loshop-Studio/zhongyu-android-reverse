package p122i6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.l */
/* loaded from: classes4.dex */
public final class C7690l {

    /* renamed from: a */
    public final String f13028a;

    /* renamed from: b */
    public final long f13029b;

    /* renamed from: c */
    public final boolean f13030c;

    /* renamed from: d */
    public final boolean f13031d;

    /* renamed from: e */
    public final int f13032e;

    /* renamed from: f */
    public final String f13033f;

    /* renamed from: g */
    public final List f13034g;

    /* renamed from: h */
    public final List f13035h;

    public C7690l(String uuid, long j10, boolean z9, boolean z10, int i10, String title, List options, List localAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        this.f13028a = uuid;
        this.f13029b = j10;
        this.f13030c = z9;
        this.f13031d = z10;
        this.f13032e = i10;
        this.f13033f = title;
        this.f13034g = options;
        this.f13035h = localAnswer;
    }

    /* renamed from: b */
    public static /* synthetic */ C7690l m12868b(C7690l c7690l, String str, long j10, boolean z9, boolean z10, int i10, String str2, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c7690l.f13028a;
        }
        if ((i11 & 2) != 0) {
            j10 = c7690l.f13029b;
        }
        if ((i11 & 4) != 0) {
            z9 = c7690l.f13030c;
        }
        if ((i11 & 8) != 0) {
            z10 = c7690l.f13031d;
        }
        if ((i11 & 16) != 0) {
            i10 = c7690l.f13032e;
        }
        if ((i11 & 32) != 0) {
            str2 = c7690l.f13033f;
        }
        if ((i11 & 64) != 0) {
            list = c7690l.f13034g;
        }
        if ((i11 & 128) != 0) {
            list2 = c7690l.f13035h;
        }
        List list3 = list;
        List list4 = list2;
        return c7690l.m12869a(str, j10, z9, z10, i10, str2, list3, list4);
    }

    /* renamed from: a */
    public final C7690l m12869a(String uuid, long j10, boolean z9, boolean z10, int i10, String title, List options, List localAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        return new C7690l(uuid, j10, z9, z10, i10, title, options, localAnswer);
    }

    /* renamed from: c */
    public final boolean m12870c() {
        return this.f13030c;
    }

    /* renamed from: d */
    public final List m12871d() {
        return this.f13035h;
    }

    /* renamed from: e */
    public final List m12872e() {
        return this.f13034g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7690l)) {
            return false;
        }
        C7690l c7690l = (C7690l) obj;
        return Intrinsics.areEqual(this.f13028a, c7690l.f13028a) && this.f13029b == c7690l.f13029b && this.f13030c == c7690l.f13030c && this.f13031d == c7690l.f13031d && this.f13032e == c7690l.f13032e && Intrinsics.areEqual(this.f13033f, c7690l.f13033f) && Intrinsics.areEqual(this.f13034g, c7690l.f13034g) && Intrinsics.areEqual(this.f13035h, c7690l.f13035h);
    }

    /* renamed from: f */
    public final long m12873f() {
        return this.f13029b;
    }

    /* renamed from: g */
    public final int m12874g() {
        return this.f13032e;
    }

    /* renamed from: h */
    public final String m12875h() {
        return this.f13033f;
    }

    public int hashCode() {
        return (((((((((((((this.f13028a.hashCode() * 31) + Long.hashCode(this.f13029b)) * 31) + Boolean.hashCode(this.f13030c)) * 31) + Boolean.hashCode(this.f13031d)) * 31) + Integer.hashCode(this.f13032e)) * 31) + this.f13033f.hashCode()) * 31) + this.f13034g.hashCode()) * 31) + this.f13035h.hashCode();
    }

    /* renamed from: i */
    public final String m12876i() {
        return this.f13028a;
    }

    /* renamed from: j */
    public final boolean m12877j() {
        return this.f13031d;
    }

    public String toString() {
        return "NoStemQuestionState(uuid=" + this.f13028a + ", questionId=" + this.f13029b + ", haveAskForHelp=" + this.f13030c + ", isAskForHelp=" + this.f13031d + ", questionType=" + this.f13032e + ", title=" + this.f13033f + ", options=" + this.f13034g + ", localAnswer=" + this.f13035h + ")";
    }

    public /* synthetic */ C7690l(String str, long j10, boolean z9, boolean z10, int i10, String str2, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, z9, z10, i10, str2, (i11 & 64) != 0 ? CollectionsKt.emptyList() : list, list2);
    }
}
