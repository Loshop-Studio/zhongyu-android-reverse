package p178n5;

import com.zykj.evaluation.bean.UploadData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.v */
/* loaded from: classes4.dex */
public final class C8655v {

    /* renamed from: a */
    public final long f14376a;

    /* renamed from: b */
    public final long f14377b;

    /* renamed from: c */
    public final int f14378c;

    /* renamed from: d */
    public final long f14379d;

    /* renamed from: e */
    public final UploadData f14380e;

    /* renamed from: f */
    public final List f14381f;

    /* renamed from: g */
    public final boolean f14382g;

    /* renamed from: h */
    public final boolean f14383h;

    /* renamed from: i */
    public final List f14384i;

    /* renamed from: j */
    public final int f14385j;

    public C8655v(long j10, long j11, int i10, long j12, UploadData draftUploadData, List answerUploadDataList, boolean z9, boolean z10, List commitTaskReqList, int i11) {
        Intrinsics.checkNotNullParameter(draftUploadData, "draftUploadData");
        Intrinsics.checkNotNullParameter(answerUploadDataList, "answerUploadDataList");
        Intrinsics.checkNotNullParameter(commitTaskReqList, "commitTaskReqList");
        this.f14376a = j10;
        this.f14377b = j11;
        this.f14378c = i10;
        this.f14379d = j12;
        this.f14380e = draftUploadData;
        this.f14381f = answerUploadDataList;
        this.f14382g = z9;
        this.f14383h = z10;
        this.f14384i = commitTaskReqList;
        this.f14385j = i11;
    }

    /* renamed from: a */
    public final C8655v m14244a(long j10, long j11, int i10, long j12, UploadData draftUploadData, List answerUploadDataList, boolean z9, boolean z10, List commitTaskReqList, int i11) {
        Intrinsics.checkNotNullParameter(draftUploadData, "draftUploadData");
        Intrinsics.checkNotNullParameter(answerUploadDataList, "answerUploadDataList");
        Intrinsics.checkNotNullParameter(commitTaskReqList, "commitTaskReqList");
        return new C8655v(j10, j11, i10, j12, draftUploadData, answerUploadDataList, z9, z10, commitTaskReqList, i11);
    }

    /* renamed from: c */
    public final List m14245c() {
        return this.f14381f;
    }

    /* renamed from: d */
    public final int m14246d() {
        return this.f14385j;
    }

    /* renamed from: e */
    public final List m14247e() {
        return this.f14384i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8655v)) {
            return false;
        }
        C8655v c8655v = (C8655v) obj;
        return this.f14376a == c8655v.f14376a && this.f14377b == c8655v.f14377b && this.f14378c == c8655v.f14378c && this.f14379d == c8655v.f14379d && Intrinsics.areEqual(this.f14380e, c8655v.f14380e) && Intrinsics.areEqual(this.f14381f, c8655v.f14381f) && this.f14382g == c8655v.f14382g && this.f14383h == c8655v.f14383h && Intrinsics.areEqual(this.f14384i, c8655v.f14384i) && this.f14385j == c8655v.f14385j;
    }

    /* renamed from: f */
    public final UploadData m14248f() {
        return this.f14380e;
    }

    /* renamed from: g */
    public final long m14249g() {
        return this.f14379d;
    }

    /* renamed from: h */
    public final long m14250h() {
        return this.f14377b;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f14376a) * 31) + Long.hashCode(this.f14377b)) * 31) + Integer.hashCode(this.f14378c)) * 31) + Long.hashCode(this.f14379d)) * 31) + this.f14380e.hashCode()) * 31) + this.f14381f.hashCode()) * 31) + Boolean.hashCode(this.f14382g)) * 31) + Boolean.hashCode(this.f14383h)) * 31) + this.f14384i.hashCode()) * 31) + Integer.hashCode(this.f14385j);
    }

    /* renamed from: i */
    public final int m14251i() {
        return this.f14378c;
    }

    /* renamed from: j */
    public final long m14252j() {
        return this.f14376a;
    }

    /* renamed from: k */
    public final boolean m14253k() {
        return this.f14383h;
    }

    /* renamed from: l */
    public final boolean m14254l() {
        return this.f14382g;
    }

    public String toString() {
        return "UploadQuestion(userId=" + this.f14376a + ", taskId=" + this.f14377b + ", taskState=" + this.f14378c + ", questionId=" + this.f14379d + ", draftUploadData=" + this.f14380e + ", answerUploadDataList=" + this.f14381f + ", isTodo=" + this.f14382g + ", isGroup=" + this.f14383h + ", commitTaskReqList=" + this.f14384i + ", commitState=" + this.f14385j + ")";
    }
}
