package p024c0;

/* renamed from: c0.e */
/* loaded from: classes2.dex */
public final class C3208e implements InterfaceC3212i {

    /* renamed from: a */
    public final C3209f f1746a;

    /* renamed from: b */
    public int f1747b;

    /* renamed from: c */
    public Class f1748c;

    public C3208e(C3209f c3209f) {
        this.f1746a = c3209f;
    }

    @Override // p024c0.InterfaceC3212i
    /* renamed from: a */
    public final void mo2149a() {
        this.f1746a.m2139a(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3208e) {
            C3208e c3208e = (C3208e) obj;
            if (this.f1747b == c3208e.f1747b && this.f1748c == c3208e.f1748c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1747b * 31;
        Class cls = this.f1748c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f1747b + "array=" + this.f1748c + '}';
    }
}
