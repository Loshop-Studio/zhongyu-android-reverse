package p117m;

/* renamed from: m.g */
/* loaded from: classes.dex */
class C2855g<T> implements InterfaceC2854f<T> {

    /* renamed from: a */
    private final Object[] f11001a;

    /* renamed from: b */
    private int f11002b;

    C2855g(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f11001a = new Object[i4];
    }

    @Override // p117m.InterfaceC2854f
    /* renamed from: a */
    public void mo9625a(T[] tArr, int i4) {
        if (i4 > tArr.length) {
            i4 = tArr.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            T t3 = tArr[i5];
            int i6 = this.f11002b;
            Object[] objArr = this.f11001a;
            if (i6 < objArr.length) {
                objArr[i6] = t3;
                this.f11002b = i6 + 1;
            }
        }
    }

    @Override // p117m.InterfaceC2854f
    public T acquire() {
        int i4 = this.f11002b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f11001a;
        T t3 = (T) objArr[i5];
        objArr[i5] = null;
        this.f11002b = i4 - 1;
        return t3;
    }

    @Override // p117m.InterfaceC2854f
    public boolean release(T t3) {
        int i4 = this.f11002b;
        Object[] objArr = this.f11001a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = t3;
        this.f11002b = i4 + 1;
        return true;
    }
}
