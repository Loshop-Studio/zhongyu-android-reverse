package p110n;

import kotlin.jvm.internal.Intrinsics;
import p087k.InterfaceC6611j;

/* renamed from: n.g */
/* loaded from: classes3.dex */
public final class C7420g {

    /* renamed from: a */
    public final InterfaceC6611j f9475a;

    /* renamed from: b */
    public final boolean f9476b;

    public C7420g(InterfaceC6611j interfaceC6611j, boolean z6) {
        this.f9475a = interfaceC6611j;
        this.f9476b = z6;
    }

    /* renamed from: a */
    public final InterfaceC6611j m8452a() {
        return this.f9475a;
    }

    /* renamed from: b */
    public final boolean m8453b() {
        return this.f9476b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7420g)) {
            return false;
        }
        C7420g c7420g = (C7420g) obj;
        return Intrinsics.areEqual(this.f9475a, c7420g.f9475a) && this.f9476b == c7420g.f9476b;
    }

    public int hashCode() {
        return (this.f9475a.hashCode() * 31) + Boolean.hashCode(this.f9476b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f9475a + ", isSampled=" + this.f9476b + ')';
    }
}
