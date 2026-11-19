package p178n5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.o */
/* loaded from: classes4.dex */
public final class C8648o {

    /* renamed from: a */
    public final long f14347a;

    /* renamed from: b */
    public final long f14348b;

    /* renamed from: c */
    public final int f14349c;

    /* renamed from: d */
    public final long f14350d;

    /* renamed from: e */
    public final List f14351e;

    /* renamed from: f */
    public final List f14352f;

    /* renamed from: g */
    public final int f14353g;

    public C8648o(long j10, long j11, int i10, long j12, List answerUploadDataList, List commitSelfCorrectReqList, int i11) {
        Intrinsics.checkNotNullParameter(answerUploadDataList, "answerUploadDataList");
        Intrinsics.checkNotNullParameter(commitSelfCorrectReqList, "commitSelfCorrectReqList");
        this.f14347a = j10;
        this.f14348b = j11;
        this.f14349c = i10;
        this.f14350d = j12;
        this.f14351e = answerUploadDataList;
        this.f14352f = commitSelfCorrectReqList;
        this.f14353g = i11;
    }

    /* renamed from: b */
    public static /* synthetic */ C8648o m14234b(C8648o c8648o, long j10, long j11, int i10, long j12, List list, List list2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = c8648o.f14347a;
        }
        long j13 = j10;
        if ((i12 & 2) != 0) {
            j11 = c8648o.f14348b;
        }
        return c8648o.m14235a(j13, j11, (i12 & 4) != 0 ? c8648o.f14349c : i10, (i12 & 8) != 0 ? c8648o.f14350d : j12, (i12 & 16) != 0 ? c8648o.f14351e : list, (i12 & 32) != 0 ? c8648o.f14352f : list2, (i12 & 64) != 0 ? c8648o.f14353g : i11);
    }

    /* renamed from: a */
    public final C8648o m14235a(long j10, long j11, int i10, long j12, List answerUploadDataList, List commitSelfCorrectReqList, int i11) {
        Intrinsics.checkNotNullParameter(answerUploadDataList, "answerUploadDataList");
        Intrinsics.checkNotNullParameter(commitSelfCorrectReqList, "commitSelfCorrectReqList");
        return new C8648o(j10, j11, i10, j12, answerUploadDataList, commitSelfCorrectReqList, i11);
    }

    /* renamed from: c */
    public final List m14236c() {
        return this.f14351e;
    }

    /* renamed from: d */
    public final List m14237d() {
        return this.f14352f;
    }

    /* renamed from: e */
    public final int m14238e() {
        return this.f14353g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8648o)) {
            return false;
        }
        C8648o c8648o = (C8648o) obj;
        return this.f14347a == c8648o.f14347a && this.f14348b == c8648o.f14348b && this.f14349c == c8648o.f14349c && this.f14350d == c8648o.f14350d && Intrinsics.areEqual(this.f14351e, c8648o.f14351e) && Intrinsics.areEqual(this.f14352f, c8648o.f14352f) && this.f14353g == c8648o.f14353g;
    }

    /* renamed from: f */
    public final long m14239f() {
        return this.f14350d;
    }

    /* renamed from: g */
    public final long m14240g() {
        return this.f14348b;
    }

    /* renamed from: h */
    public final int m14241h() {
        return this.f14349c;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f14347a) * 31) + Long.hashCode(this.f14348b)) * 31) + Integer.hashCode(this.f14349c)) * 31) + Long.hashCode(this.f14350d)) * 31) + this.f14351e.hashCode()) * 31) + this.f14352f.hashCode()) * 31) + Integer.hashCode(this.f14353g);
    }

    /* renamed from: i */
    public final long m14242i() {
        return this.f14347a;
    }

    public String toString() {
        return "UploadCorrectSelfQuestion(userId=" + this.f14347a + ", taskId=" + this.f14348b + ", taskState=" + this.f14349c + ", questionId=" + this.f14350d + ", answerUploadDataList=" + this.f14351e + ", commitSelfCorrectReqList=" + this.f14352f + ", commitState=" + this.f14353g + ")";
    }
}
