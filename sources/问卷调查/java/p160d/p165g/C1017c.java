package p160d.p165g;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Integer>] */
/* renamed from: d.g.c */
/* loaded from: classes.dex */
public final class C1017c extends C1015a {

    /* renamed from: e */
    public static final C1017c f5492e = new C1017c(1, 0);

    /* renamed from: f */
    public static final C1017c f5493f = null;

    public C1017c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p160d.p165g.C1015a
    public boolean equals(Object obj) {
        if (obj instanceof C1017c) {
            if (!isEmpty() || !((C1017c) obj).isEmpty()) {
                C1017c c1017c = (C1017c) obj;
                if (this.f5485b != c1017c.f5485b || this.f5486c != c1017c.f5486c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p160d.p165g.C1015a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5485b * 31) + this.f5486c;
    }

    @Override // p160d.p165g.C1015a
    public boolean isEmpty() {
        return this.f5485b > this.f5486c;
    }

    @Override // p160d.p165g.C1015a
    public String toString() {
        return this.f5485b + ".." + this.f5486c;
    }
}
