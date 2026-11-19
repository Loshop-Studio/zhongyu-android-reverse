package p182n;

import java.security.MessageDigest;
import p160l.InterfaceC9228b;

/* renamed from: n.a */
/* loaded from: classes3.dex */
public final class C9348a implements InterfaceC9228b {

    /* renamed from: b */
    public final InterfaceC9228b f18459b;

    /* renamed from: c */
    public final InterfaceC9228b f18460c;

    public C9348a(InterfaceC9228b interfaceC9228b, InterfaceC9228b interfaceC9228b2) {
        this.f18459b = interfaceC9228b;
        this.f18460c = interfaceC9228b2;
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        this.f18459b.mo13883b(messageDigest);
        this.f18460c.mo13883b(messageDigest);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C9348a) {
            C9348a c9348a = (C9348a) obj;
            if (this.f18459b.equals(c9348a.f18459b) && this.f18460c.equals(c9348a.f18460c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return (this.f18459b.hashCode() * 31) + this.f18460c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f18459b + ", signature=" + this.f18460c + '}';
    }
}
