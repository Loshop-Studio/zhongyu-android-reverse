package p088e7;

/* renamed from: e7.d */
/* loaded from: classes5.dex */
public final class C8371d {

    /* renamed from: a */
    public final float f15894a;

    /* renamed from: b */
    public int f15895b;

    /* renamed from: c */
    public int f15896c;

    /* renamed from: d */
    public int f15897d;

    /* renamed from: e */
    public Object[] f15898e;

    public C8371d() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    public static int m13663c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    /* renamed from: a */
    public boolean m13664a(Object obj) {
        Object obj2;
        Object[] objArr = this.f15898e;
        int i10 = this.f15895b;
        int iM13663c = m13663c(obj.hashCode()) & i10;
        Object obj3 = objArr[iM13663c];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iM13663c = (iM13663c + 1) & i10;
                obj2 = objArr[iM13663c];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iM13663c] = obj;
        int i11 = this.f15896c + 1;
        this.f15896c = i11;
        if (i11 >= this.f15897d) {
            m13666d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m13665b() {
        return this.f15898e;
    }

    /* renamed from: d */
    public void m13666d() {
        Object obj;
        Object[] objArr = this.f15898e;
        int length = objArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr2 = new Object[i10];
        int i12 = this.f15896c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f15895b = i11;
                this.f15897d = (int) (i10 * this.f15894a);
                this.f15898e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iM13663c = m13663c(obj.hashCode()) & i11;
            if (objArr2[iM13663c] != null) {
                do {
                    iM13663c = (iM13663c + 1) & i11;
                } while (objArr2[iM13663c] != null);
            }
            objArr2[iM13663c] = objArr[length];
            i12 = i13;
        }
    }

    /* renamed from: e */
    public boolean m13667e(Object obj) {
        Object obj2;
        Object[] objArr = this.f15898e;
        int i10 = this.f15895b;
        int iM13663c = m13663c(obj.hashCode()) & i10;
        Object obj3 = objArr[iM13663c];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return m13668f(iM13663c, objArr, i10);
        }
        do {
            iM13663c = (iM13663c + 1) & i10;
            obj2 = objArr[iM13663c];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return m13668f(iM13663c, objArr, i10);
    }

    /* renamed from: f */
    public boolean m13668f(int i10, Object[] objArr, int i11) {
        int i12;
        Object obj;
        this.f15896c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return true;
                }
                int iM13663c = m13663c(obj.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iM13663c || iM13663c > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iM13663c || iM13663c <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public C8371d(int i10, float f10) {
        this.f15894a = f10;
        int iM13669a = AbstractC8372e.m13669a(i10);
        this.f15895b = iM13669a - 1;
        this.f15897d = (int) (f10 * iM13669a);
        this.f15898e = new Object[iM13669a];
    }
}
