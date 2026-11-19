package p234s6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.d1 */
/* loaded from: classes4.dex */
public final class C9272d1 {

    /* renamed from: a */
    public final String f16021a;

    /* renamed from: b */
    public final String f16022b;

    public C9272d1(String photo, String name) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16021a = photo;
        this.f16022b = name;
    }

    /* renamed from: a */
    public final String m15541a() {
        return this.f16022b;
    }

    /* renamed from: b */
    public final String m15542b() {
        return this.f16021a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9272d1)) {
            return false;
        }
        C9272d1 c9272d1 = (C9272d1) obj;
        return Intrinsics.areEqual(this.f16021a, c9272d1.f16021a) && Intrinsics.areEqual(this.f16022b, c9272d1.f16022b);
    }

    public int hashCode() {
        return (this.f16021a.hashCode() * 31) + this.f16022b.hashCode();
    }

    public String toString() {
        return "StudentInfo(photo=" + this.f16021a + ", name=" + this.f16022b + ")";
    }

    public /* synthetic */ C9272d1(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
