package p184o0;

import java.security.MessageDigest;
import p162m0.InterfaceC8537b;

/* renamed from: o0.a */
/* loaded from: classes3.dex */
public final class C8681a implements InterfaceC8537b {

    /* renamed from: b */
    public final InterfaceC8537b f14417b;

    /* renamed from: c */
    public final InterfaceC8537b f14418c;

    public C8681a(InterfaceC8537b interfaceC8537b, InterfaceC8537b interfaceC8537b2) {
        this.f14417b = interfaceC8537b;
        this.f14418c = interfaceC8537b2;
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        this.f14417b.mo12541a(messageDigest);
        this.f14418c.mo12541a(messageDigest);
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C8681a) {
            C8681a c8681a = (C8681a) obj;
            if (this.f14417b.equals(c8681a.f14417b) && this.f14418c.equals(c8681a.f14418c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return (this.f14417b.hashCode() * 31) + this.f14418c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f14417b + ", signature=" + this.f14418c + '}';
    }
}
