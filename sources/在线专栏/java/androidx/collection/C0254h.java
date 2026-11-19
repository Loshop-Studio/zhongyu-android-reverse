package androidx.collection;

/* renamed from: androidx.collection.h */
/* loaded from: classes.dex */
public class C0254h<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f1323e = new Object();

    /* renamed from: a */
    private boolean f1324a;

    /* renamed from: b */
    private int[] f1325b;

    /* renamed from: c */
    private Object[] f1326c;

    /* renamed from: d */
    private int f1327d;

    public C0254h() {
        this(10);
    }

    /* renamed from: d */
    private void m1140d() {
        int i4 = this.f1327d;
        int[] iArr = this.f1325b;
        Object[] objArr = this.f1326c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f1323e) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f1324a = false;
        this.f1327d = i5;
    }

    /* renamed from: a */
    public void m1141a(int i4, E e4) {
        int i5 = this.f1327d;
        if (i5 != 0 && i4 <= this.f1325b[i5 - 1]) {
            m1148i(i4, e4);
            return;
        }
        if (this.f1324a && i5 >= this.f1325b.length) {
            m1140d();
        }
        int i6 = this.f1327d;
        if (i6 >= this.f1325b.length) {
            int iM1107e = C0249c.m1107e(i6 + 1);
            int[] iArr = new int[iM1107e];
            Object[] objArr = new Object[iM1107e];
            int[] iArr2 = this.f1325b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1326c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1325b = iArr;
            this.f1326c = objArr;
        }
        this.f1325b[i6] = i4;
        this.f1326c[i6] = e4;
        this.f1327d = i6 + 1;
    }

    /* renamed from: b */
    public void m1142b() {
        int i4 = this.f1327d;
        Object[] objArr = this.f1326c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f1327d = 0;
        this.f1324a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0254h<E> clone() {
        try {
            C0254h<E> c0254h = (C0254h) super.clone();
            c0254h.f1325b = (int[]) this.f1325b.clone();
            c0254h.f1326c = (Object[]) this.f1326c.clone();
            return c0254h;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    /* renamed from: e */
    public E m1144e(int i4) {
        return m1145f(i4, null);
    }

    /* renamed from: f */
    public E m1145f(int i4, E e4) {
        int iM1103a = C0249c.m1103a(this.f1325b, this.f1327d, i4);
        if (iM1103a >= 0) {
            Object[] objArr = this.f1326c;
            if (objArr[iM1103a] != f1323e) {
                return (E) objArr[iM1103a];
            }
        }
        return e4;
    }

    /* renamed from: g */
    public int m1146g(E e4) {
        if (this.f1324a) {
            m1140d();
        }
        for (int i4 = 0; i4 < this.f1327d; i4++) {
            if (this.f1326c[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public int m1147h(int i4) {
        if (this.f1324a) {
            m1140d();
        }
        return this.f1325b[i4];
    }

    /* renamed from: i */
    public void m1148i(int i4, E e4) {
        int iM1103a = C0249c.m1103a(this.f1325b, this.f1327d, i4);
        if (iM1103a >= 0) {
            this.f1326c[iM1103a] = e4;
            return;
        }
        int i5 = ~iM1103a;
        int i6 = this.f1327d;
        if (i5 < i6) {
            Object[] objArr = this.f1326c;
            if (objArr[i5] == f1323e) {
                this.f1325b[i5] = i4;
                objArr[i5] = e4;
                return;
            }
        }
        if (this.f1324a && i6 >= this.f1325b.length) {
            m1140d();
            i5 = ~C0249c.m1103a(this.f1325b, this.f1327d, i4);
        }
        int i7 = this.f1327d;
        if (i7 >= this.f1325b.length) {
            int iM1107e = C0249c.m1107e(i7 + 1);
            int[] iArr = new int[iM1107e];
            Object[] objArr2 = new Object[iM1107e];
            int[] iArr2 = this.f1325b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1326c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1325b = iArr;
            this.f1326c = objArr2;
        }
        int i8 = this.f1327d;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f1325b;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f1326c;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f1327d - i5);
        }
        this.f1325b[i5] = i4;
        this.f1326c[i5] = e4;
        this.f1327d++;
    }

    /* renamed from: j */
    public int m1149j() {
        if (this.f1324a) {
            m1140d();
        }
        return this.f1327d;
    }

    /* renamed from: k */
    public E m1150k(int i4) {
        if (this.f1324a) {
            m1140d();
        }
        return (E) this.f1326c[i4];
    }

    public String toString() {
        if (m1149j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1327d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f1327d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m1147h(i4));
            sb.append('=');
            E eM1150k = m1150k(i4);
            if (eM1150k != this) {
                sb.append(eM1150k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0254h(int i4) {
        this.f1324a = false;
        if (i4 == 0) {
            this.f1325b = C0249c.f1292a;
            this.f1326c = C0249c.f1294c;
        } else {
            int iM1107e = C0249c.m1107e(i4);
            this.f1325b = new int[iM1107e];
            this.f1326c = new Object[iM1107e];
        }
    }
}
