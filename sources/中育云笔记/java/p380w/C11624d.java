package p380w;

import kotlin.jvm.internal.AbstractC9979u;
import p212k.InterfaceC9756j;

/* renamed from: w.d */
/* loaded from: classes3.dex */
public final class C11624d implements InterfaceC11631k {

    /* renamed from: a */
    public final InterfaceC9756j f27526a;

    /* renamed from: b */
    public final C11627g f27527b;

    /* renamed from: c */
    public final Throwable f27528c;

    public C11624d(InterfaceC9756j interfaceC9756j, C11627g c11627g, Throwable th) {
        this.f27526a = interfaceC9756j;
        this.f27527b = c11627g;
        this.f27528c = th;
    }

    @Override // p380w.InterfaceC11631k
    /* renamed from: a */
    public C11627g mo25641a() {
        return this.f27527b;
    }

    /* renamed from: b */
    public InterfaceC9756j m25642b() {
        return this.f27526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11624d)) {
            return false;
        }
        C11624d c11624d = (C11624d) obj;
        return AbstractC9979u.m20289b(this.f27526a, c11624d.f27526a) && AbstractC9979u.m20289b(this.f27527b, c11624d.f27527b) && AbstractC9979u.m20289b(this.f27528c, c11624d.f27528c);
    }

    public int hashCode() {
        InterfaceC9756j interfaceC9756j = this.f27526a;
        return ((((interfaceC9756j == null ? 0 : interfaceC9756j.hashCode()) * 31) + this.f27527b.hashCode()) * 31) + this.f27528c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f27526a + ", request=" + this.f27527b + ", throwable=" + this.f27528c + ')';
    }
}
