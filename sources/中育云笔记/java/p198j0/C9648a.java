package p198j0;

import java.security.MessageDigest;
import p168h0.InterfaceC9435b;

/* renamed from: j0.a */
/* loaded from: classes3.dex */
public final class C9648a implements InterfaceC9435b {

    /* renamed from: b */
    public final InterfaceC9435b f22350b;

    /* renamed from: c */
    public final InterfaceC9435b f22351c;

    public C9648a(InterfaceC9435b interfaceC9435b, InterfaceC9435b interfaceC9435b2) {
        this.f22350b = interfaceC9435b;
        this.f22351c = interfaceC9435b2;
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        this.f22350b.mo2797b(messageDigest);
        this.f22351c.mo2797b(messageDigest);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C9648a) {
            C9648a c9648a = (C9648a) obj;
            if (this.f22350b.equals(c9648a.f22350b) && this.f22351c.equals(c9648a.f22351c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return (this.f22350b.hashCode() * 31) + this.f22351c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f22350b + ", signature=" + this.f22351c + '}';
    }
}
