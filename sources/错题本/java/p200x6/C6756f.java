package p200x6;

/* renamed from: x6.f */
/* loaded from: classes2.dex */
public final class C6756f extends C6754d implements InterfaceC6753c {

    /* renamed from: d */
    public static final C6756f f11427d = new C6756f(1, 0, 1);

    /* renamed from: b */
    public final boolean m6434b(int i) {
        return this.f11420a <= i && i <= this.f11421b;
    }

    @Override // p200x6.C6754d
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6756f)) {
            return false;
        }
        if (isEmpty() && ((C6756f) obj).isEmpty()) {
            return true;
        }
        C6756f c6756f = (C6756f) obj;
        return this.f11420a == c6756f.f11420a && this.f11421b == c6756f.f11421b;
    }

    @Override // p200x6.InterfaceC6753c
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f11421b);
    }

    @Override // p200x6.InterfaceC6753c
    public final Comparable getStart() {
        return Integer.valueOf(this.f11420a);
    }

    @Override // p200x6.C6754d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f11420a * 31) + this.f11421b;
    }

    @Override // p200x6.C6754d
    public final boolean isEmpty() {
        return this.f11420a > this.f11421b;
    }

    @Override // p200x6.C6754d
    public final String toString() {
        return this.f11420a + ".." + this.f11421b;
    }
}
