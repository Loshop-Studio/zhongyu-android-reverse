package p152k0;

import java.security.MessageDigest;
import p122h0.InterfaceC8082b;

/* renamed from: k0.a */
/* loaded from: classes3.dex */
public final class C8250a implements InterfaceC8082b {

    /* renamed from: b */
    public final InterfaceC8082b f14318b;

    /* renamed from: c */
    public final InterfaceC8082b f14319c;

    public C8250a(InterfaceC8082b interfaceC8082b, InterfaceC8082b interfaceC8082b2) {
        this.f14318b = interfaceC8082b;
        this.f14319c = interfaceC8082b2;
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        this.f14318b.mo12082a(messageDigest);
        this.f14319c.mo12082a(messageDigest);
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C8250a) {
            C8250a c8250a = (C8250a) obj;
            if (this.f14318b.equals(c8250a.f14318b) && this.f14319c.equals(c8250a.f14319c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return (this.f14318b.hashCode() * 31) + this.f14319c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f14318b + ", signature=" + this.f14319c + '}';
    }
}
