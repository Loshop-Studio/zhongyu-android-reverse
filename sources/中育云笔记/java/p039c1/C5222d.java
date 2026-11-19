package p039c1;

import java.security.MessageDigest;
import p109d1.AbstractC8909j;
import p168h0.InterfaceC9435b;

/* renamed from: c1.d */
/* loaded from: classes3.dex */
public final class C5222d implements InterfaceC9435b {

    /* renamed from: b */
    public final Object f3113b;

    public C5222d(Object obj) {
        this.f3113b = AbstractC8909j.m17468d(obj);
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        messageDigest.update(this.f3113b.toString().getBytes(InterfaceC9435b.f21837a));
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C5222d) {
            return this.f3113b.equals(((C5222d) obj).f3113b);
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return this.f3113b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f3113b + '}';
    }
}
