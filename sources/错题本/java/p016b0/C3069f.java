package p016b0;

import java.security.MessageDigest;
import p202y.InterfaceC6760c;

/* renamed from: b0.f */
/* loaded from: classes2.dex */
public final class C3069f implements InterfaceC6760c {

    /* renamed from: b */
    public final InterfaceC6760c f1412b;

    /* renamed from: c */
    public final InterfaceC6760c f1413c;

    public C3069f(InterfaceC6760c interfaceC6760c, InterfaceC6760c interfaceC6760c2) {
        this.f1412b = interfaceC6760c;
        this.f1413c = interfaceC6760c2;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        this.f1412b.mo2013b(messageDigest);
        this.f1413c.mo2013b(messageDigest);
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C3069f) {
            C3069f c3069f = (C3069f) obj;
            if (this.f1412b.equals(c3069f.f1412b) && this.f1413c.equals(c3069f.f1413c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return this.f1413c.hashCode() + (this.f1412b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f1412b + ", signature=" + this.f1413c + '}';
    }
}
