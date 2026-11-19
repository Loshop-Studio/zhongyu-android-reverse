package p297y;

import kotlin.jvm.internal.Intrinsics;
import p151k.InterfaceC8239j;

/* renamed from: y.d */
/* loaded from: classes3.dex */
public final class C9923d implements InterfaceC9929j {

    /* renamed from: a */
    public final InterfaceC8239j f17752a;

    /* renamed from: b */
    public final C9924e f17753b;

    /* renamed from: c */
    public final Throwable f17754c;

    public C9923d(InterfaceC8239j interfaceC8239j, C9924e c9924e, Throwable th) {
        this.f17752a = interfaceC8239j;
        this.f17753b = c9924e;
        this.f17754c = th;
    }

    @Override // p297y.InterfaceC9929j
    /* renamed from: a */
    public C9924e mo17012a() {
        return this.f17753b;
    }

    /* renamed from: b */
    public InterfaceC8239j m17013b() {
        return this.f17752a;
    }

    /* renamed from: c */
    public final Throwable m17014c() {
        return this.f17754c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9923d)) {
            return false;
        }
        C9923d c9923d = (C9923d) obj;
        return Intrinsics.areEqual(this.f17752a, c9923d.f17752a) && Intrinsics.areEqual(this.f17753b, c9923d.f17753b) && Intrinsics.areEqual(this.f17754c, c9923d.f17754c);
    }

    public int hashCode() {
        InterfaceC8239j interfaceC8239j = this.f17752a;
        return ((((interfaceC8239j == null ? 0 : interfaceC8239j.hashCode()) * 31) + this.f17753b.hashCode()) * 31) + this.f17754c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f17752a + ", request=" + this.f17753b + ", throwable=" + this.f17754c + ')';
    }
}
