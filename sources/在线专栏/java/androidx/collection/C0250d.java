package androidx.collection;

/* renamed from: androidx.collection.d */
/* loaded from: classes.dex */
public class C0250d<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f1295e = new Object();

    /* renamed from: a */
    private boolean f1296a;

    /* renamed from: b */
    private long[] f1297b;

    /* renamed from: c */
    private Object[] f1298c;

    /* renamed from: d */
    private int f1299d;

    public C0250d() {
        this(10);
    }

    /* renamed from: d */
    private void m1109d() {
        int i4 = this.f1299d;
        long[] jArr = this.f1297b;
        Object[] objArr = this.f1298c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f1295e) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f1296a = false;
        this.f1299d = i5;
    }

    /* renamed from: a */
    public void m1110a(long j4, E e4) {
        int i4 = this.f1299d;
        if (i4 != 0 && j4 <= this.f1297b[i4 - 1]) {
            m1117i(j4, e4);
            return;
        }
        if (this.f1296a && i4 >= this.f1297b.length) {
            m1109d();
        }
        int i5 = this.f1299d;
        if (i5 >= this.f1297b.length) {
            int iM1108f = C0249c.m1108f(i5 + 1);
            long[] jArr = new long[iM1108f];
            Object[] objArr = new Object[iM1108f];
            long[] jArr2 = this.f1297b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1298c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1297b = jArr;
            this.f1298c = objArr;
        }
        this.f1297b[i5] = j4;
        this.f1298c[i5] = e4;
        this.f1299d = i5 + 1;
    }

    /* renamed from: b */
    public void m1111b() {
        int i4 = this.f1299d;
        Object[] objArr = this.f1298c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f1299d = 0;
        this.f1296a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0250d<E> clone() {
        try {
            C0250d<E> c0250d = (C0250d) super.clone();
            c0250d.f1297b = (long[]) this.f1297b.clone();
            c0250d.f1298c = (Object[]) this.f1298c.clone();
            return c0250d;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    /* renamed from: e */
    public E m1113e(long j4) {
        return m1114f(j4, null);
    }

    /* renamed from: f */
    public E m1114f(long j4, E e4) {
        int iM1104b = C0249c.m1104b(this.f1297b, this.f1299d, j4);
        if (iM1104b >= 0) {
            Object[] objArr = this.f1298c;
            if (objArr[iM1104b] != f1295e) {
                return (E) objArr[iM1104b];
            }
        }
        return e4;
    }

    /* renamed from: g */
    public int m1115g(long j4) {
        if (this.f1296a) {
            m1109d();
        }
        return C0249c.m1104b(this.f1297b, this.f1299d, j4);
    }

    /* renamed from: h */
    public long m1116h(int i4) {
        if (this.f1296a) {
            m1109d();
        }
        return this.f1297b[i4];
    }

    /* renamed from: i */
    public void m1117i(long j4, E e4) {
        int iM1104b = C0249c.m1104b(this.f1297b, this.f1299d, j4);
        if (iM1104b >= 0) {
            this.f1298c[iM1104b] = e4;
            return;
        }
        int i4 = ~iM1104b;
        int i5 = this.f1299d;
        if (i4 < i5) {
            Object[] objArr = this.f1298c;
            if (objArr[i4] == f1295e) {
                this.f1297b[i4] = j4;
                objArr[i4] = e4;
                return;
            }
        }
        if (this.f1296a && i5 >= this.f1297b.length) {
            m1109d();
            i4 = ~C0249c.m1104b(this.f1297b, this.f1299d, j4);
        }
        int i6 = this.f1299d;
        if (i6 >= this.f1297b.length) {
            int iM1108f = C0249c.m1108f(i6 + 1);
            long[] jArr = new long[iM1108f];
            Object[] objArr2 = new Object[iM1108f];
            long[] jArr2 = this.f1297b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1298c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1297b = jArr;
            this.f1298c = objArr2;
        }
        int i7 = this.f1299d;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f1297b;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f1298c;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f1299d - i4);
        }
        this.f1297b[i4] = j4;
        this.f1298c[i4] = e4;
        this.f1299d++;
    }

    /* renamed from: j */
    public void m1118j(long j4) {
        int iM1104b = C0249c.m1104b(this.f1297b, this.f1299d, j4);
        if (iM1104b >= 0) {
            Object[] objArr = this.f1298c;
            Object obj = objArr[iM1104b];
            Object obj2 = f1295e;
            if (obj != obj2) {
                objArr[iM1104b] = obj2;
                this.f1296a = true;
            }
        }
    }

    /* renamed from: k */
    public void m1119k(int i4) {
        Object[] objArr = this.f1298c;
        Object obj = objArr[i4];
        Object obj2 = f1295e;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f1296a = true;
        }
    }

    /* renamed from: l */
    public int m1120l() {
        if (this.f1296a) {
            m1109d();
        }
        return this.f1299d;
    }

    /* renamed from: m */
    public E m1121m(int i4) {
        if (this.f1296a) {
            m1109d();
        }
        return (E) this.f1298c[i4];
    }

    public String toString() {
        if (m1120l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1299d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f1299d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m1116h(i4));
            sb.append('=');
            E eM1121m = m1121m(i4);
            if (eM1121m != this) {
                sb.append(eM1121m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0250d(int i4) {
        this.f1296a = false;
        if (i4 == 0) {
            this.f1297b = C0249c.f1293b;
            this.f1298c = C0249c.f1294c;
        } else {
            int iM1108f = C0249c.m1108f(i4);
            this.f1297b = new long[iM1108f];
            this.f1298c = new Object[iM1108f];
        }
    }
}
