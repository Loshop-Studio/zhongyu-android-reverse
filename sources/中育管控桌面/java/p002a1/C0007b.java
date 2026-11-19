package p002a1;

import java.security.MessageDigest;
import p016b1.AbstractC4408j;
import p053f0.InterfaceC6283b;

/* renamed from: a1.b */
/* loaded from: classes3.dex */
public final class C0007b implements InterfaceC6283b {

    /* renamed from: b */
    public final Object f2b;

    public C0007b(Object obj) {
        this.f2b = AbstractC4408j.m1438d(obj);
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        messageDigest.update(this.f2b.toString().getBytes(InterfaceC6283b.f7649a));
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C0007b) {
            return this.f2b.equals(((C0007b) obj).f2b);
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return this.f2b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f2b + '}';
    }
}
