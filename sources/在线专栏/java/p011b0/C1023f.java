package p011b0;

/* renamed from: b0.f */
/* loaded from: classes.dex */
public class C1023f<T> implements InterfaceC1022e<T> {

    /* renamed from: a */
    private final Object[] f5700a;

    /* renamed from: b */
    private int f5701b;

    public C1023f(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5700a = new Object[i4];
    }

    /* renamed from: a */
    private boolean m4776a(T t3) {
        for (int i4 = 0; i4 < this.f5701b; i4++) {
            if (this.f5700a[i4] == t3) {
                return true;
            }
        }
        return false;
    }

    @Override // p011b0.InterfaceC1022e
    public T acquire() {
        int i4 = this.f5701b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f5700a;
        T t3 = (T) objArr[i5];
        objArr[i5] = null;
        this.f5701b = i4 - 1;
        return t3;
    }

    @Override // p011b0.InterfaceC1022e
    public boolean release(T t3) {
        if (m4776a(t3)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f5701b;
        Object[] objArr = this.f5700a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = t3;
        this.f5701b = i4 + 1;
        return true;
    }
}
