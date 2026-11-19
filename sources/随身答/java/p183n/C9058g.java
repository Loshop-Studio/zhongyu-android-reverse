package p183n;

import kotlin.jvm.internal.Intrinsics;
import p151k.InterfaceC8239j;

/* renamed from: n.g */
/* loaded from: classes3.dex */
public final class C9058g {

    /* renamed from: a */
    public final InterfaceC8239j f15238a;

    /* renamed from: b */
    public final boolean f15239b;

    public C9058g(InterfaceC8239j interfaceC8239j, boolean z9) {
        this.f15238a = interfaceC8239j;
        this.f15239b = z9;
    }

    /* renamed from: a */
    public final InterfaceC8239j m14521a() {
        return this.f15238a;
    }

    /* renamed from: b */
    public final boolean m14522b() {
        return this.f15239b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9058g)) {
            return false;
        }
        C9058g c9058g = (C9058g) obj;
        return Intrinsics.areEqual(this.f15238a, c9058g.f15238a) && this.f15239b == c9058g.f15239b;
    }

    public int hashCode() {
        return (this.f15238a.hashCode() * 31) + Boolean.hashCode(this.f15239b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f15238a + ", isSampled=" + this.f15239b + ')';
    }
}
