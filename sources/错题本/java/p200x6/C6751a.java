package p200x6;

/* renamed from: x6.a */
/* loaded from: classes2.dex */
public final class C6751a implements InterfaceC6752b {

    /* renamed from: a */
    public final float f11418a;

    /* renamed from: b */
    public final float f11419b;

    public C6751a(float f, float f7) {
        this.f11418a = f;
        this.f11419b = f7;
    }

    /* renamed from: a */
    public final boolean m6431a() {
        return this.f11418a > this.f11419b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final boolean m6432b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6751a)) {
            return false;
        }
        if (m6431a() && ((C6751a) obj).m6431a()) {
            return true;
        }
        C6751a c6751a = (C6751a) obj;
        return this.f11418a == c6751a.f11418a && this.f11419b == c6751a.f11419b;
    }

    @Override // p200x6.InterfaceC6753c
    public final Comparable getEndInclusive() {
        return Float.valueOf(this.f11419b);
    }

    @Override // p200x6.InterfaceC6753c
    public final Comparable getStart() {
        return Float.valueOf(this.f11418a);
    }

    public final int hashCode() {
        if (m6431a()) {
            return -1;
        }
        return Float.hashCode(this.f11419b) + (Float.hashCode(this.f11418a) * 31);
    }

    public final String toString() {
        return this.f11418a + ".." + this.f11419b;
    }
}
