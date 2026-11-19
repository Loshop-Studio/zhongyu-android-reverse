package p287x6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.m */
/* loaded from: classes4.dex */
public final class C9870m {

    /* renamed from: a */
    public final long f17457a;

    /* renamed from: b */
    public final String f17458b;

    /* renamed from: c */
    public boolean f17459c;

    /* renamed from: d */
    public final List f17460d;

    public C9870m(long j10, String uuid, boolean z9, List uploadDataList) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uploadDataList, "uploadDataList");
        this.f17457a = j10;
        this.f17458b = uuid;
        this.f17459c = z9;
        this.f17460d = uploadDataList;
    }

    /* renamed from: a */
    public final List m16554a() {
        return this.f17460d;
    }

    /* renamed from: b */
    public final String m16555b() {
        return this.f17458b;
    }

    /* renamed from: c */
    public final boolean m16556c() {
        return this.f17459c;
    }

    /* renamed from: d */
    public final void m16557d(boolean z9) {
        this.f17459c = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9870m)) {
            return false;
        }
        C9870m c9870m = (C9870m) obj;
        return this.f17457a == c9870m.f17457a && Intrinsics.areEqual(this.f17458b, c9870m.f17458b) && this.f17459c == c9870m.f17459c && Intrinsics.areEqual(this.f17460d, c9870m.f17460d);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f17457a) * 31) + this.f17458b.hashCode()) * 31) + Boolean.hashCode(this.f17459c)) * 31) + this.f17460d.hashCode();
    }

    public String toString() {
        return "UploadInfo(questionId=" + this.f17457a + ", uuid=" + this.f17458b + ", isUpload=" + this.f17459c + ", uploadDataList=" + this.f17460d + ")";
    }

    public /* synthetic */ C9870m(long j10, String str, boolean z9, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? new ArrayList() : list);
    }
}
