package p228l;

import kotlin.jvm.internal.AbstractC9979u;
import p212k.InterfaceC9756j;

/* renamed from: l.g */
/* loaded from: classes3.dex */
public final class C10070g {

    /* renamed from: a */
    public final InterfaceC9756j f24080a;

    /* renamed from: b */
    public final boolean f24081b;

    public C10070g(InterfaceC9756j interfaceC9756j, boolean z10) {
        this.f24080a = interfaceC9756j;
        this.f24081b = z10;
    }

    /* renamed from: a */
    public final InterfaceC9756j m21064a() {
        return this.f24080a;
    }

    /* renamed from: b */
    public final boolean m21065b() {
        return this.f24081b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10070g)) {
            return false;
        }
        C10070g c10070g = (C10070g) obj;
        return AbstractC9979u.m20289b(this.f24080a, c10070g.f24080a) && this.f24081b == c10070g.f24081b;
    }

    public int hashCode() {
        return (this.f24080a.hashCode() * 31) + Boolean.hashCode(this.f24081b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f24080a + ", isSampled=" + this.f24081b + ')';
    }
}
