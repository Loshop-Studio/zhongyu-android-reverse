package p000a.p021e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.e.h */
/* loaded from: classes.dex */
public class C0136h<K, V> {

    /* renamed from: e */
    public static Object[] f944e;

    /* renamed from: f */
    public static int f945f;

    /* renamed from: g */
    public static Object[] f946g;

    /* renamed from: h */
    public static int f947h;

    /* renamed from: b */
    public int[] f948b;

    /* renamed from: c */
    public Object[] f949c;

    /* renamed from: d */
    public int f950d;

    public C0136h() {
        this.f948b = C0132d.f914a;
        this.f949c = C0132d.f916c;
        this.f950d = 0;
    }

    public C0136h(int i) {
        if (i == 0) {
            this.f948b = C0132d.f914a;
            this.f949c = C0132d.f916c;
        } else {
            m508a(i);
        }
        this.f950d = 0;
    }

    /* renamed from: c */
    public static void m507c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0136h.class) {
                if (f947h < 10) {
                    objArr[0] = f946g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f946g = objArr;
                    f947h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0136h.class) {
                if (f945f < 10) {
                    objArr[0] = f944e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f944e = objArr;
                    f945f++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m508a(int i) {
        if (i == 8) {
            synchronized (C0136h.class) {
                Object[] objArr = f946g;
                if (objArr != null) {
                    this.f949c = objArr;
                    f946g = (Object[]) objArr[0];
                    this.f948b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f947h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0136h.class) {
                Object[] objArr2 = f944e;
                if (objArr2 != null) {
                    this.f949c = objArr2;
                    f944e = (Object[]) objArr2[0];
                    this.f948b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f945f--;
                    return;
                }
            }
        }
        this.f948b = new int[i];
        this.f949c = new Object[i << 1];
    }

    /* renamed from: b */
    public void m509b(int i) {
        int i2 = this.f950d;
        int[] iArr = this.f948b;
        if (iArr.length < i) {
            Object[] objArr = this.f949c;
            m508a(i);
            if (this.f950d > 0) {
                System.arraycopy(iArr, 0, this.f948b, 0, i2);
                System.arraycopy(objArr, 0, this.f949c, 0, i2 << 1);
            }
            m507c(iArr, objArr, i2);
        }
        if (this.f950d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f950d;
        if (i > 0) {
            int[] iArr = this.f948b;
            Object[] objArr = this.f949c;
            this.f948b = C0132d.f914a;
            this.f949c = C0132d.f916c;
            this.f950d = 0;
            m507c(iArr, objArr, i);
        }
        if (this.f950d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m511e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m513g(obj) >= 0;
    }

    /* renamed from: d */
    public int m510d(Object obj, int i) {
        int i2 = this.f950d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM485a = C0132d.m485a(this.f948b, i2, i);
            if (iM485a < 0 || obj.equals(this.f949c[iM485a << 1])) {
                return iM485a;
            }
            int i3 = iM485a + 1;
            while (i3 < i2 && this.f948b[i3] == i) {
                if (obj.equals(this.f949c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM485a - 1; i4 >= 0 && this.f948b[i4] == i; i4--) {
                if (obj.equals(this.f949c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public int m511e(Object obj) {
        return obj == null ? m512f() : m510d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0136h) {
            C0136h c0136h = (C0136h) obj;
            if (this.f950d != c0136h.f950d) {
                return false;
            }
            for (int i = 0; i < this.f950d; i++) {
                try {
                    K kM514h = m514h(i);
                    V vM517k = m517k(i);
                    Object obj2 = c0136h.get(kM514h);
                    if (vM517k == null) {
                        if (obj2 != null || !c0136h.containsKey(kM514h)) {
                            return false;
                        }
                    } else if (!vM517k.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f950d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f950d; i2++) {
                try {
                    K kM514h2 = m514h(i2);
                    V vM517k2 = m517k(i2);
                    Object obj3 = map.get(kM514h2);
                    if (vM517k2 == null) {
                        if (obj3 != null || !map.containsKey(kM514h2)) {
                            return false;
                        }
                    } else if (!vM517k2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m512f() {
        int i = this.f950d;
        if (i == 0) {
            return -1;
        }
        try {
            int iM485a = C0132d.m485a(this.f948b, i, 0);
            if (iM485a < 0 || this.f949c[iM485a << 1] == null) {
                return iM485a;
            }
            int i2 = iM485a + 1;
            while (i2 < i && this.f948b[i2] == 0) {
                if (this.f949c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM485a - 1; i3 >= 0 && this.f948b[i3] == 0; i3--) {
                if (this.f949c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public int m513g(Object obj) {
        int i = this.f950d * 2;
        Object[] objArr = this.f949c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iM511e = m511e(obj);
        return iM511e >= 0 ? (V) this.f949c[(iM511e << 1) + 1] : v;
    }

    /* renamed from: h */
    public K m514h(int i) {
        return (K) this.f949c[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f948b;
        Object[] objArr = this.f949c;
        int i = this.f950d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public V m515i(int i) {
        Object[] objArr = this.f949c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f950d;
        int i4 = 0;
        if (i3 <= 1) {
            m507c(this.f948b, objArr, i3);
            this.f948b = C0132d.f914a;
            this.f949c = C0132d.f916c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f948b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f949c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f949c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m508a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f950d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f948b, 0, i);
                    System.arraycopy(objArr, 0, this.f949c, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f948b, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f949c, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f950d) {
            throw new ConcurrentModificationException();
        }
        this.f950d = i4;
        return v;
    }

    public boolean isEmpty() {
        return this.f950d <= 0;
    }

    /* renamed from: j */
    public V m516j(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f949c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: k */
    public V m517k(int i) {
        return (V) this.f949c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int iM510d;
        int i2 = this.f950d;
        if (k == null) {
            iM510d = m512f();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM510d = m510d(k, iHashCode);
        }
        if (iM510d >= 0) {
            int i3 = (iM510d << 1) + 1;
            Object[] objArr = this.f949c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iM510d;
        int[] iArr = this.f948b;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f949c;
            m508a(i5);
            if (i2 != this.f950d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f948b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f949c, 0, objArr2.length);
            }
            m507c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f948b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f949c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f950d - i4) << 1);
        }
        int i7 = this.f950d;
        if (i2 == i7) {
            int[] iArr4 = this.f948b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f949c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f950d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int iM511e = m511e(obj);
        if (iM511e >= 0) {
            return m515i(iM511e);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iM511e = m511e(obj);
        if (iM511e < 0) {
            return false;
        }
        V vM517k = m517k(iM511e);
        if (obj2 != vM517k && (obj2 == null || !obj2.equals(vM517k))) {
            return false;
        }
        m515i(iM511e);
        return true;
    }

    public V replace(K k, V v) {
        int iM511e = m511e(k);
        if (iM511e >= 0) {
            return m516j(iM511e, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int iM511e = m511e(k);
        if (iM511e < 0) {
            return false;
        }
        V vM517k = m517k(iM511e);
        if (vM517k != v && (v == null || !v.equals(vM517k))) {
            return false;
        }
        m516j(iM511e, v2);
        return true;
    }

    public int size() {
        return this.f950d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f950d * 28);
        sb.append('{');
        for (int i = 0; i < this.f950d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM514h = m514h(i);
            if (kM514h != this) {
                sb.append(kM514h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM517k = m517k(i);
            if (vM517k != this) {
                sb.append(vM517k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
