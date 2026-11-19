package p000a.p031h.p042i;

/* JADX WARN: Unexpected interfaces in signature: [a.h.i.c<T>] */
/* renamed from: a.h.i.c */
/* loaded from: classes.dex */
public class C0241c<T> {

    /* renamed from: a */
    public final Object[] f1552a;

    /* renamed from: b */
    public int f1553b;

    public C0241c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1552a = new Object[i];
    }

    /* renamed from: a */
    public T mo805a() {
        int i = this.f1553b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f1552a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f1553b = i - 1;
        return t;
    }

    /* renamed from: b */
    public boolean mo806b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f1553b;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (this.f1552a[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f1552a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f1553b = i + 1;
        return true;
    }
}
