package p067h0;

import java.security.MessageDigest;
import p053f0.InterfaceC6283b;

/* renamed from: h0.a */
/* loaded from: classes3.dex */
public final class C6431a implements InterfaceC6283b {

    /* renamed from: b */
    public final InterfaceC6283b f8107b;

    /* renamed from: c */
    public final InterfaceC6283b f8108c;

    public C6431a(InterfaceC6283b interfaceC6283b, InterfaceC6283b interfaceC6283b2) {
        this.f8107b = interfaceC6283b;
        this.f8108c = interfaceC6283b2;
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        this.f8107b.mo9b(messageDigest);
        this.f8108c.mo9b(messageDigest);
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C6431a) {
            C6431a c6431a = (C6431a) obj;
            if (this.f8107b.equals(c6431a.f8107b) && this.f8108c.equals(c6431a.f8108c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return (this.f8107b.hashCode() * 31) + this.f8108c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f8107b + ", signature=" + this.f8108c + '}';
    }
}
