package p000a.p022f.p025b;

/* JADX WARN: Unexpected interfaces in signature: [a.f.b.e<T>] */
/* renamed from: a.f.b.e */
/* loaded from: classes.dex */
public class C0143e<T> {

    /* renamed from: a */
    public final Object[] f993a;

    /* renamed from: b */
    public int f994b;

    public C0143e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f993a = new Object[i];
    }

    /* renamed from: a */
    public T m569a() {
        int i = this.f994b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f993a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f994b = i - 1;
        return t;
    }

    /* renamed from: b */
    public boolean m570b(T t) {
        int i = this.f994b;
        Object[] objArr = this.f993a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f994b = i + 1;
        return true;
    }
}
