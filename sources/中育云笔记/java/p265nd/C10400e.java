package p265nd;

/* renamed from: nd.e */
/* loaded from: classes6.dex */
public final class C10400e implements InterfaceC10401f {

    /* renamed from: c */
    public final float f24750c;

    /* renamed from: d */
    public final float f24751d;

    public C10400e(float f10, float f11) {
        this.f24750c = f10;
        this.f24751d = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p265nd.InterfaceC10401f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo21726a(Comparable comparable, Comparable comparable2) {
        return m21730e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* renamed from: b */
    public boolean m21727b(float f10) {
        return f10 >= this.f24750c && f10 <= this.f24751d;
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f24751d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p265nd.InterfaceC10401f
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m21727b(((Number) comparable).floatValue());
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f24750c);
    }

    /* renamed from: e */
    public boolean m21730e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10400e)) {
            return false;
        }
        if (isEmpty() && ((C10400e) obj).isEmpty()) {
            return true;
        }
        C10400e c10400e = (C10400e) obj;
        return this.f24750c == c10400e.f24750c && this.f24751d == c10400e.f24751d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f24750c) * 31) + Float.hashCode(this.f24751d);
    }

    @Override // p265nd.InterfaceC10401f, p265nd.InterfaceC10402g
    public boolean isEmpty() {
        return this.f24750c > this.f24751d;
    }

    public String toString() {
        return this.f24750c + ".." + this.f24751d;
    }
}
