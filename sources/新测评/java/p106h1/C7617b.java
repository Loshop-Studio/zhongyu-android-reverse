package p106h1;

import java.security.MessageDigest;
import p117i1.AbstractC7651j;
import p162m0.InterfaceC8537b;

/* renamed from: h1.b */
/* loaded from: classes3.dex */
public final class C7617b implements InterfaceC8537b {

    /* renamed from: b */
    public final Object f12780b;

    public C7617b(Object obj) {
        this.f12780b = AbstractC7651j.m12683d(obj);
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        messageDigest.update(this.f12780b.toString().getBytes(InterfaceC8537b.f14173a));
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C7617b) {
            return this.f12780b.equals(((C7617b) obj).f12780b);
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return this.f12780b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f12780b + '}';
    }
}
