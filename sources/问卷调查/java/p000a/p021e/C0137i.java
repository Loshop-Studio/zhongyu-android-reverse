package p000a.p021e;

/* renamed from: a.e.i */
/* loaded from: classes.dex */
public class C0137i<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f951e = new Object();

    /* renamed from: b */
    public int[] f952b;

    /* renamed from: c */
    public Object[] f953c;

    /* renamed from: d */
    public int f954d;

    public C0137i() {
        int iM489e = C0132d.m489e(10);
        this.f952b = new int[iM489e];
        this.f953c = new Object[iM489e];
    }

    /* renamed from: a */
    public void m518a(int i, E e2) {
        int i2 = this.f954d;
        if (i2 != 0 && i <= this.f952b[i2 - 1]) {
            m523f(i, e2);
            return;
        }
        if (i2 >= this.f952b.length) {
            int iM489e = C0132d.m489e(i2 + 1);
            int[] iArr = new int[iM489e];
            Object[] objArr = new Object[iM489e];
            int[] iArr2 = this.f952b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f953c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f952b = iArr;
            this.f953c = objArr;
        }
        this.f952b[i2] = i;
        this.f953c[i2] = e2;
        this.f954d = i2 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0137i<E> clone() {
        try {
            C0137i<E> c0137i = (C0137i) super.clone();
            c0137i.f952b = (int[]) this.f952b.clone();
            c0137i.f953c = (Object[]) this.f953c.clone();
            return c0137i;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: c */
    public E m520c(int i) {
        return m521d(i, null);
    }

    /* renamed from: d */
    public E m521d(int i, E e2) {
        int iM485a = C0132d.m485a(this.f952b, this.f954d, i);
        if (iM485a >= 0) {
            Object[] objArr = this.f953c;
            if (objArr[iM485a] != f951e) {
                return (E) objArr[iM485a];
            }
        }
        return e2;
    }

    /* renamed from: e */
    public int m522e(int i) {
        return this.f952b[i];
    }

    /* renamed from: f */
    public void m523f(int i, E e2) {
        int iM485a = C0132d.m485a(this.f952b, this.f954d, i);
        if (iM485a >= 0) {
            this.f953c[iM485a] = e2;
            return;
        }
        int i2 = ~iM485a;
        int i3 = this.f954d;
        if (i2 < i3) {
            Object[] objArr = this.f953c;
            if (objArr[i2] == f951e) {
                this.f952b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (i3 >= this.f952b.length) {
            int iM489e = C0132d.m489e(i3 + 1);
            int[] iArr = new int[iM489e];
            Object[] objArr2 = new Object[iM489e];
            int[] iArr2 = this.f952b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f953c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f952b = iArr;
            this.f953c = objArr2;
        }
        int i4 = this.f954d - i2;
        if (i4 != 0) {
            int[] iArr3 = this.f952b;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.f953c;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f954d - i2);
        }
        this.f952b[i2] = i;
        this.f953c[i2] = e2;
        this.f954d++;
    }

    /* renamed from: g */
    public int m524g() {
        return this.f954d;
    }

    /* renamed from: h */
    public E m525h(int i) {
        return (E) this.f953c[i];
    }

    public String toString() {
        if (m524g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f954d * 28);
        sb.append('{');
        for (int i = 0; i < this.f954d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m522e(i));
            sb.append('=');
            E eM525h = m525h(i);
            if (eM525h != this) {
                sb.append(eM525h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
