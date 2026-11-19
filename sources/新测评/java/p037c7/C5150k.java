package p037c7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c7.k */
/* loaded from: classes4.dex */
public final class C5150k {

    /* renamed from: a */
    public final String f2734a;

    public C5150k(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f2734a = path;
    }

    /* renamed from: a */
    public final C5150k m2796a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new C5150k(path);
    }

    /* renamed from: b */
    public final String m2797b() {
        return this.f2734a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5150k) && Intrinsics.areEqual(this.f2734a, ((C5150k) obj).f2734a);
    }

    public int hashCode() {
        return this.f2734a.hashCode();
    }

    public String toString() {
        return "SketchPlayUIState(path=" + this.f2734a + ")";
    }

    public /* synthetic */ C5150k(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
