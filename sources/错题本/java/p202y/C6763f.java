package p202y;

import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: y.f */
/* loaded from: classes2.dex */
public final class C6763f implements InterfaceC6760c {

    /* renamed from: b */
    public final CachedHashCodeArrayMap f11435b = new CachedHashCodeArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        for (int i = 0; i < this.f11435b.getSize(); i++) {
            C6762e c6762e = (C6762e) this.f11435b.keyAt(i);
            Object objValueAt = this.f11435b.valueAt(i);
            InterfaceC6761d interfaceC6761d = c6762e.f11432b;
            if (c6762e.f11434d == null) {
                c6762e.f11434d = c6762e.f11433c.getBytes(InterfaceC6760c.f11429a);
            }
            interfaceC6761d.mo4975b(c6762e.f11434d, objValueAt, messageDigest);
        }
    }

    /* renamed from: c */
    public final Object m6436c(C6762e c6762e) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f11435b;
        return cachedHashCodeArrayMap.containsKey(c6762e) ? cachedHashCodeArrayMap.get(c6762e) : c6762e.f11431a;
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C6763f) {
            return this.f11435b.equals(((C6763f) obj).f11435b);
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return this.f11435b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f11435b + '}';
    }
}
