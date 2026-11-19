package p178n5;

import com.zykj.evaluation.bean.UploadData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.h */
/* loaded from: classes4.dex */
public final class C8641h {

    /* renamed from: a */
    public final long f14324a;

    /* renamed from: b */
    public final long f14325b;

    /* renamed from: c */
    public final int f14326c;

    /* renamed from: d */
    public final String f14327d;

    /* renamed from: e */
    public final UploadData f14328e;

    public C8641h(long j10, long j11, int i10, String uuid, UploadData uploadData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uploadData, "uploadData");
        this.f14324a = j10;
        this.f14325b = j11;
        this.f14326c = i10;
        this.f14327d = uuid;
        this.f14328e = uploadData;
    }

    /* renamed from: a */
    public final long m14229a() {
        return this.f14325b;
    }

    /* renamed from: b */
    public final int m14230b() {
        return this.f14326c;
    }

    /* renamed from: c */
    public final UploadData m14231c() {
        return this.f14328e;
    }

    /* renamed from: d */
    public final long m14232d() {
        return this.f14324a;
    }

    /* renamed from: e */
    public final String m14233e() {
        return this.f14327d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8641h)) {
            return false;
        }
        C8641h c8641h = (C8641h) obj;
        return this.f14324a == c8641h.f14324a && this.f14325b == c8641h.f14325b && this.f14326c == c8641h.f14326c && Intrinsics.areEqual(this.f14327d, c8641h.f14327d) && Intrinsics.areEqual(this.f14328e, c8641h.f14328e);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f14324a) * 31) + Long.hashCode(this.f14325b)) * 31) + Integer.hashCode(this.f14326c)) * 31) + this.f14327d.hashCode()) * 31) + this.f14328e.hashCode();
    }

    public String toString() {
        return "UploadAnswer(userId=" + this.f14324a + ", taskId=" + this.f14325b + ", taskState=" + this.f14326c + ", uuid=" + this.f14327d + ", uploadData=" + this.f14328e + ")";
    }
}
