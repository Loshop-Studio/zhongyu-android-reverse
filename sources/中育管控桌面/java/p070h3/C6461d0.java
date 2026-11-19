package p070h3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h3.d0 */
/* loaded from: classes4.dex */
public final class C6461d0 {

    /* renamed from: a */
    public final long f8227a;

    /* renamed from: b */
    public final String f8228b;

    /* renamed from: c */
    public final String f8229c;

    /* renamed from: d */
    public final String f8230d;

    /* renamed from: e */
    public final String f8231e;

    public C6461d0(long j6, String name, String date, String size, String url) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8227a = j6;
        this.f8228b = name;
        this.f8229c = date;
        this.f8230d = size;
        this.f8231e = url;
    }

    /* renamed from: a */
    public final String m7109a() {
        return this.f8229c;
    }

    /* renamed from: b */
    public final long m7110b() {
        return this.f8227a;
    }

    /* renamed from: c */
    public final String m7111c() {
        return this.f8228b;
    }

    /* renamed from: d */
    public final String m7112d() {
        return this.f8230d;
    }

    /* renamed from: e */
    public final String m7113e() {
        return this.f8231e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6461d0)) {
            return false;
        }
        C6461d0 c6461d0 = (C6461d0) obj;
        return this.f8227a == c6461d0.f8227a && Intrinsics.areEqual(this.f8228b, c6461d0.f8228b) && Intrinsics.areEqual(this.f8229c, c6461d0.f8229c) && Intrinsics.areEqual(this.f8230d, c6461d0.f8230d) && Intrinsics.areEqual(this.f8231e, c6461d0.f8231e);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f8227a) * 31) + this.f8228b.hashCode()) * 31) + this.f8229c.hashCode()) * 31) + this.f8230d.hashCode()) * 31) + this.f8231e.hashCode();
    }

    public String toString() {
        return "PictureDetailData(id=" + this.f8227a + ", name=" + this.f8228b + ", date=" + this.f8229c + ", size=" + this.f8230d + ", url=" + this.f8231e + ")";
    }

    public /* synthetic */ C6461d0(long j6, String str, String str2, String str3, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j6, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4);
    }
}
