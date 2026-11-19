package p132v1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1.b */
/* loaded from: classes2.dex */
public final class C4628b {

    /* renamed from: a */
    public final String f5835a;

    public C4628b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f5835a = url;
    }

    /* renamed from: a */
    public final C4628b m6415a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new C4628b(url);
    }

    /* renamed from: b */
    public final String m6416b() {
        return this.f5835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4628b) && Intrinsics.areEqual(this.f5835a, ((C4628b) obj).f5835a);
    }

    public int hashCode() {
        return this.f5835a.hashCode();
    }

    public String toString() {
        return "MainState(url=" + this.f5835a + ")";
    }

    public /* synthetic */ C4628b(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str);
    }
}
