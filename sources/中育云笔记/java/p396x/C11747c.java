package p396x;

import kotlin.jvm.internal.AbstractC9979u;
import vc.InterfaceC11588c;

/* renamed from: x.c */
/* loaded from: classes3.dex */
public final class C11747c implements InterfaceC11751g {

    /* renamed from: c */
    public final C11749e f27919c;

    public C11747c(C11749e c11749e) {
        this.f27919c = c11749e;
    }

    @Override // p396x.InterfaceC11751g
    /* renamed from: a */
    public Object mo25997a(InterfaceC11588c interfaceC11588c) {
        return this.f27919c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11747c) && AbstractC9979u.m20289b(this.f27919c, ((C11747c) obj).f27919c);
    }

    public int hashCode() {
        return this.f27919c.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f27919c + ')';
    }
}
