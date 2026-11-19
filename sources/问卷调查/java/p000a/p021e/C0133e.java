package p000a.p021e;

/* renamed from: a.e.e */
/* loaded from: classes.dex */
public class C0133e<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f917f = new Object();

    /* renamed from: b */
    public boolean f918b = false;

    /* renamed from: c */
    public long[] f919c;

    /* renamed from: d */
    public Object[] f920d;

    /* renamed from: e */
    public int f921e;

    public C0133e() {
        int iM490f = C0132d.m490f(10);
        this.f919c = new long[iM490f];
        this.f920d = new Object[iM490f];
    }

    /* renamed from: a */
    public void m491a(long j, E e2) {
        int i = this.f921e;
        if (i != 0 && j <= this.f919c[i - 1]) {
            m497g(j, e2);
            return;
        }
        if (this.f918b && i >= this.f919c.length) {
            m494d();
        }
        int i2 = this.f921e;
        if (i2 >= this.f919c.length) {
            int iM490f = C0132d.m490f(i2 + 1);
            long[] jArr = new long[iM490f];
            Object[] objArr = new Object[iM490f];
            long[] jArr2 = this.f919c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f920d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f919c = jArr;
            this.f920d = objArr;
        }
        this.f919c[i2] = j;
        this.f920d[i2] = e2;
        this.f921e = i2 + 1;
    }

    /* renamed from: b */
    public void m492b() {
        int i = this.f921e;
        Object[] objArr = this.f920d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f921e = 0;
        this.f918b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0133e<E> clone() {
        try {
            C0133e<E> c0133e = (C0133e) super.clone();
            c0133e.f919c = (long[]) this.f919c.clone();
            c0133e.f920d = (Object[]) this.f920d.clone();
            return c0133e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public final void m494d() {
        int i = this.f921e;
        long[] jArr = this.f919c;
        Object[] objArr = this.f920d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f917f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f918b = false;
        this.f921e = i2;
    }

    /* renamed from: e */
    public E m495e(long j) {
        return m496f(j, null);
    }

    /* renamed from: f */
    public E m496f(long j, E e2) {
        int iM486b = C0132d.m486b(this.f919c, this.f921e, j);
        if (iM486b >= 0) {
            Object[] objArr = this.f920d;
            if (objArr[iM486b] != f917f) {
                return (E) objArr[iM486b];
            }
        }
        return e2;
    }

    /* renamed from: g */
    public void m497g(long j, E e2) {
        int iM486b = C0132d.m486b(this.f919c, this.f921e, j);
        if (iM486b >= 0) {
            this.f920d[iM486b] = e2;
            return;
        }
        int i = ~iM486b;
        int i2 = this.f921e;
        if (i < i2) {
            Object[] objArr = this.f920d;
            if (objArr[i] == f917f) {
                this.f919c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f918b && i2 >= this.f919c.length) {
            m494d();
            i = ~C0132d.m486b(this.f919c, this.f921e, j);
        }
        int i3 = this.f921e;
        if (i3 >= this.f919c.length) {
            int iM490f = C0132d.m490f(i3 + 1);
            long[] jArr = new long[iM490f];
            Object[] objArr2 = new Object[iM490f];
            long[] jArr2 = this.f919c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f920d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f919c = jArr;
            this.f920d = objArr2;
        }
        int i4 = this.f921e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f919c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f920d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f921e - i);
        }
        this.f919c[i] = j;
        this.f920d[i] = e2;
        this.f921e++;
    }

    /* renamed from: h */
    public int m498h() {
        if (this.f918b) {
            m494d();
        }
        return this.f921e;
    }

    /* renamed from: i */
    public E m499i(int i) {
        if (this.f918b) {
            m494d();
        }
        return (E) this.f920d[i];
    }

    public String toString() {
        if (m498h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f921e * 28);
        sb.append('{');
        for (int i = 0; i < this.f921e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f918b) {
                m494d();
            }
            sb.append(this.f919c[i]);
            sb.append('=');
            E eM499i = m499i(i);
            if (eM499i != this) {
                sb.append(eM499i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
