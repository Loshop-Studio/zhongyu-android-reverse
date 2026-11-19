package p276w5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.d */
/* loaded from: classes4.dex */
public final class C9764d {

    /* renamed from: a */
    public final String f17211a;

    /* renamed from: b */
    public final String f17212b;

    /* renamed from: c */
    public final String f17213c;

    /* renamed from: d */
    public final String f17214d;

    public C9764d(String snapShot, String url, String creatorName, String createTime) {
        Intrinsics.checkNotNullParameter(snapShot, "snapShot");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        this.f17211a = snapShot;
        this.f17212b = url;
        this.f17213c = creatorName;
        this.f17214d = createTime;
    }

    /* renamed from: a */
    public final String m16360a() {
        return this.f17214d;
    }

    /* renamed from: b */
    public final String m16361b() {
        return this.f17213c;
    }

    /* renamed from: c */
    public final String m16362c() {
        return this.f17211a;
    }

    /* renamed from: d */
    public final String m16363d() {
        return this.f17212b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9764d)) {
            return false;
        }
        C9764d c9764d = (C9764d) obj;
        return Intrinsics.areEqual(this.f17211a, c9764d.f17211a) && Intrinsics.areEqual(this.f17212b, c9764d.f17212b) && Intrinsics.areEqual(this.f17213c, c9764d.f17213c) && Intrinsics.areEqual(this.f17214d, c9764d.f17214d);
    }

    public int hashCode() {
        return (((((this.f17211a.hashCode() * 31) + this.f17212b.hashCode()) * 31) + this.f17213c.hashCode()) * 31) + this.f17214d.hashCode();
    }

    public String toString() {
        return "DetailMicroClassState(snapShot=" + this.f17211a + ", url=" + this.f17212b + ", creatorName=" + this.f17213c + ", createTime=" + this.f17214d + ")";
    }
}
