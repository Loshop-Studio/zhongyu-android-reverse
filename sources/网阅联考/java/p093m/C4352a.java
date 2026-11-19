package p093m;

import java.security.MessageDigest;
import p076j.InterfaceC3792b;

/* renamed from: m.a */
/* loaded from: classes2.dex */
public final class C4352a implements InterfaceC3792b {

    /* renamed from: b */
    public final InterfaceC3792b f4860b;

    /* renamed from: c */
    public final InterfaceC3792b f4861c;

    public C4352a(InterfaceC3792b interfaceC3792b, InterfaceC3792b interfaceC3792b2) {
        this.f4860b = interfaceC3792b;
        this.f4861c = interfaceC3792b2;
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        this.f4860b.mo4729b(messageDigest);
        this.f4861c.mo4729b(messageDigest);
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (!(obj instanceof C4352a)) {
            return false;
        }
        C4352a c4352a = (C4352a) obj;
        return this.f4860b.equals(c4352a.f4860b) && this.f4861c.equals(c4352a.f4861c);
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return (this.f4860b.hashCode() * 31) + this.f4861c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4860b + ", signature=" + this.f4861c + '}';
    }
}
