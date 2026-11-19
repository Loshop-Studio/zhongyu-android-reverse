package p077d8;

/* renamed from: d8.a */
/* loaded from: classes5.dex */
public final class C8316a implements InterfaceC8317b {

    /* renamed from: a */
    public final float f15774a;

    /* renamed from: b */
    public final float f15775b;

    public C8316a(float f10, float f11) {
        this.f15774a = f10;
        this.f15775b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p077d8.InterfaceC8317b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo13489a(Comparable comparable, Comparable comparable2) {
        return m13493e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* renamed from: b */
    public boolean m13490b(float f10) {
        return f10 >= this.f15774a && f10 <= this.f15775b;
    }

    @Override // p077d8.InterfaceC8318c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f15775b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p077d8.InterfaceC8317b
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m13490b(((Number) comparable).floatValue());
    }

    @Override // p077d8.InterfaceC8318c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f15774a);
    }

    /* renamed from: e */
    public boolean m13493e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8316a)) {
            return false;
        }
        if (isEmpty() && ((C8316a) obj).isEmpty()) {
            return true;
        }
        C8316a c8316a = (C8316a) obj;
        return this.f15774a == c8316a.f15774a && this.f15775b == c8316a.f15775b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f15774a) * 31) + Float.hashCode(this.f15775b);
    }

    @Override // p077d8.InterfaceC8317b, p077d8.InterfaceC8318c
    public boolean isEmpty() {
        return this.f15774a > this.f15775b;
    }

    public String toString() {
        return this.f15774a + ".." + this.f15775b;
    }
}
