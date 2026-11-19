package p057f0;

import java.security.MessageDigest;
import p062g0.AbstractC3749i;
import p076j.InterfaceC3792b;

/* renamed from: f0.b */
/* loaded from: classes2.dex */
public final class C3731b implements InterfaceC3792b {

    /* renamed from: b */
    public final Object f4357b;

    public C3731b(Object obj) {
        this.f4357b = AbstractC3749i.m4768d(obj);
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        messageDigest.update(this.f4357b.toString().getBytes(InterfaceC3792b.f4537a));
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (obj instanceof C3731b) {
            return this.f4357b.equals(((C3731b) obj).f4357b);
        }
        return false;
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return this.f4357b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f4357b + '}';
    }
}
