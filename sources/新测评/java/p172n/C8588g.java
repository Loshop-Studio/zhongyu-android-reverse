package p172n;

import kotlin.jvm.internal.Intrinsics;
import p137k.InterfaceC7838j;

/* renamed from: n.g */
/* loaded from: classes3.dex */
public final class C8588g {

    /* renamed from: a */
    public final InterfaceC7838j f14222a;

    /* renamed from: b */
    public final boolean f14223b;

    public C8588g(InterfaceC7838j interfaceC7838j, boolean z9) {
        this.f14222a = interfaceC7838j;
        this.f14223b = z9;
    }

    /* renamed from: a */
    public final InterfaceC7838j m14131a() {
        return this.f14222a;
    }

    /* renamed from: b */
    public final boolean m14132b() {
        return this.f14223b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8588g)) {
            return false;
        }
        C8588g c8588g = (C8588g) obj;
        return Intrinsics.areEqual(this.f14222a, c8588g.f14222a) && this.f14223b == c8588g.f14223b;
    }

    public int hashCode() {
        return (this.f14222a.hashCode() * 31) + Boolean.hashCode(this.f14223b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f14222a + ", isSampled=" + this.f14223b + ')';
    }
}
