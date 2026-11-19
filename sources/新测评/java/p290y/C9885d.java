package p290y;

import kotlin.jvm.internal.Intrinsics;
import p137k.InterfaceC7838j;

/* renamed from: y.d */
/* loaded from: classes3.dex */
public final class C9885d implements InterfaceC9889h {

    /* renamed from: a */
    public final InterfaceC7838j f17518a;

    /* renamed from: b */
    public final C9886e f17519b;

    /* renamed from: c */
    public final Throwable f17520c;

    public C9885d(InterfaceC7838j interfaceC7838j, C9886e c9886e, Throwable th) {
        this.f17518a = interfaceC7838j;
        this.f17519b = c9886e;
        this.f17520c = th;
    }

    @Override // p290y.InterfaceC9889h
    /* renamed from: a */
    public C9886e mo16611a() {
        return this.f17519b;
    }

    /* renamed from: b */
    public final Throwable m16612b() {
        return this.f17520c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9885d)) {
            return false;
        }
        C9885d c9885d = (C9885d) obj;
        return Intrinsics.areEqual(this.f17518a, c9885d.f17518a) && Intrinsics.areEqual(this.f17519b, c9885d.f17519b) && Intrinsics.areEqual(this.f17520c, c9885d.f17520c);
    }

    @Override // p290y.InterfaceC9889h
    public InterfaceC7838j getImage() {
        return this.f17518a;
    }

    public int hashCode() {
        InterfaceC7838j interfaceC7838j = this.f17518a;
        return ((((interfaceC7838j == null ? 0 : interfaceC7838j.hashCode()) * 31) + this.f17519b.hashCode()) * 31) + this.f17520c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f17518a + ", request=" + this.f17519b + ", throwable=" + this.f17520c + ')';
    }
}
