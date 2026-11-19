package p080d1;

import java.security.MessageDigest;
import p091e1.AbstractC7837i;
import p122h0.InterfaceC8082b;

/* renamed from: d1.b */
/* loaded from: classes3.dex */
public final class C7737b implements InterfaceC8082b {

    /* renamed from: b */
    public final Object f13039b;

    public C7737b(Object obj) {
        this.f13039b = AbstractC7837i.m12256d(obj);
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        messageDigest.update(this.f13039b.toString().getBytes(InterfaceC8082b.f13784a));
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C7737b) {
            return this.f13039b.equals(((C7737b) obj).f13039b);
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return this.f13039b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f13039b + '}';
    }
}
