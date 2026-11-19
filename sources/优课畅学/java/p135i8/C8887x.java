package p135i8;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* renamed from: i8.x */
/* loaded from: classes5.dex */
public final class C8887x {

    /* renamed from: a */
    public final Object f16548a;

    /* renamed from: b */
    public final InterfaceC10570l f16549b;

    public C8887x(Object obj, InterfaceC10570l interfaceC10570l) {
        this.f16548a = obj;
        this.f16549b = interfaceC10570l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8887x)) {
            return false;
        }
        C8887x c8887x = (C8887x) obj;
        return AbstractC9133u.m16128b(this.f16548a, c8887x.f16548a) && AbstractC9133u.m16128b(this.f16549b, c8887x.f16549b);
    }

    public int hashCode() {
        Object obj = this.f16548a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f16549b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f16548a + ", onCancellation=" + this.f16549b + ')';
    }
}
