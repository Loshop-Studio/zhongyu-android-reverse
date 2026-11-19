package p105g0;

import java.security.MessageDigest;
import p116h0.AbstractC8706j;
import p160l.InterfaceC9228b;

/* renamed from: g0.b */
/* loaded from: classes3.dex */
public final class C8514b implements InterfaceC9228b {

    /* renamed from: b */
    public final Object f16099b;

    public C8514b(Object obj) {
        this.f16099b = AbstractC8706j.m14181d(obj);
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        messageDigest.update(this.f16099b.toString().getBytes(InterfaceC9228b.f18210a));
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C8514b) {
            return this.f16099b.equals(((C8514b) obj).f16099b);
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return this.f16099b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f16099b + '}';
    }
}
