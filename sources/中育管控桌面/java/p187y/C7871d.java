package p187y;

import kotlin.jvm.internal.Intrinsics;
import p087k.InterfaceC6611j;

/* renamed from: y.d */
/* loaded from: classes3.dex */
public final class C7871d implements InterfaceC7877j {

    /* renamed from: a */
    public final InterfaceC6611j f10491a;

    /* renamed from: b */
    public final C7872e f10492b;

    /* renamed from: c */
    public final Throwable f10493c;

    public C7871d(InterfaceC6611j interfaceC6611j, C7872e c7872e, Throwable th) {
        this.f10491a = interfaceC6611j;
        this.f10492b = c7872e;
        this.f10493c = th;
    }

    @Override // p187y.InterfaceC7877j
    /* renamed from: a */
    public C7872e mo9568a() {
        return this.f10492b;
    }

    /* renamed from: b */
    public InterfaceC6611j m9569b() {
        return this.f10491a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7871d)) {
            return false;
        }
        C7871d c7871d = (C7871d) obj;
        return Intrinsics.areEqual(this.f10491a, c7871d.f10491a) && Intrinsics.areEqual(this.f10492b, c7871d.f10492b) && Intrinsics.areEqual(this.f10493c, c7871d.f10493c);
    }

    public int hashCode() {
        InterfaceC6611j interfaceC6611j = this.f10491a;
        return ((((interfaceC6611j == null ? 0 : interfaceC6611j.hashCode()) * 31) + this.f10492b.hashCode()) * 31) + this.f10493c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f10491a + ", request=" + this.f10492b + ", throwable=" + this.f10493c + ')';
    }
}
