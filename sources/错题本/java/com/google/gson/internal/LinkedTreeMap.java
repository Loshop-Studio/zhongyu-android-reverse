package com.google.gson.internal;

import coil3.C3335t;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005a4.AbstractC0009a;

/* loaded from: classes2.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: a */
    public static final C3335t f3014a = new C3335t(2);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private C3851h entrySet;
    final C3853j header;
    private C3852i keySet;
    int modCount;
    C3853j root;
    int size;

    public LinkedTreeMap() {
        this(f3014a, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void m2791a(C3853j c3853j, boolean z8) {
        while (c3853j != null) {
            C3853j c3853j2 = c3853j.f3040b;
            C3853j c3853j3 = c3853j.f3041c;
            int i = c3853j2 != null ? c3853j2.f3047i : 0;
            int i8 = c3853j3 != null ? c3853j3.f3047i : 0;
            int i9 = i - i8;
            if (i9 == -2) {
                C3853j c3853j4 = c3853j3.f3040b;
                C3853j c3853j5 = c3853j3.f3041c;
                int i10 = (c3853j4 != null ? c3853j4.f3047i : 0) - (c3853j5 != null ? c3853j5.f3047i : 0);
                if (i10 == -1 || (i10 == 0 && !z8)) {
                    m2793c(c3853j);
                } else {
                    m2794d(c3853j3);
                    m2793c(c3853j);
                }
                if (z8) {
                    return;
                }
            } else if (i9 == 2) {
                C3853j c3853j6 = c3853j2.f3040b;
                C3853j c3853j7 = c3853j2.f3041c;
                int i11 = (c3853j6 != null ? c3853j6.f3047i : 0) - (c3853j7 != null ? c3853j7.f3047i : 0);
                if (i11 == 1 || (i11 == 0 && !z8)) {
                    m2794d(c3853j);
                } else {
                    m2793c(c3853j2);
                    m2794d(c3853j);
                }
                if (z8) {
                    return;
                }
            } else if (i9 == 0) {
                c3853j.f3047i = i + 1;
                if (z8) {
                    return;
                }
            } else {
                c3853j.f3047i = Math.max(i, i8) + 1;
                if (!z8) {
                    return;
                }
            }
            c3853j = c3853j.f3039a;
        }
    }

    /* renamed from: b */
    public final void m2792b(C3853j c3853j, C3853j c3853j2) {
        C3853j c3853j3 = c3853j.f3039a;
        c3853j.f3039a = null;
        if (c3853j2 != null) {
            c3853j2.f3039a = c3853j3;
        }
        if (c3853j3 == null) {
            this.root = c3853j2;
        } else if (c3853j3.f3040b == c3853j) {
            c3853j3.f3040b = c3853j2;
        } else {
            c3853j3.f3041c = c3853j2;
        }
    }

    /* renamed from: c */
    public final void m2793c(C3853j c3853j) {
        C3853j c3853j2 = c3853j.f3040b;
        C3853j c3853j3 = c3853j.f3041c;
        C3853j c3853j4 = c3853j3.f3040b;
        C3853j c3853j5 = c3853j3.f3041c;
        c3853j.f3041c = c3853j4;
        if (c3853j4 != null) {
            c3853j4.f3039a = c3853j;
        }
        m2792b(c3853j, c3853j3);
        c3853j3.f3040b = c3853j;
        c3853j.f3039a = c3853j3;
        int iMax = Math.max(c3853j2 != null ? c3853j2.f3047i : 0, c3853j4 != null ? c3853j4.f3047i : 0) + 1;
        c3853j.f3047i = iMax;
        c3853j3.f3047i = Math.max(iMax, c3853j5 != null ? c3853j5.f3047i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C3853j c3853j = this.header;
        c3853j.f3043e = c3853j;
        c3853j.f3042d = c3853j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    /* renamed from: d */
    public final void m2794d(C3853j c3853j) {
        C3853j c3853j2 = c3853j.f3040b;
        C3853j c3853j3 = c3853j.f3041c;
        C3853j c3853j4 = c3853j2.f3040b;
        C3853j c3853j5 = c3853j2.f3041c;
        c3853j.f3040b = c3853j5;
        if (c3853j5 != null) {
            c3853j5.f3039a = c3853j;
        }
        m2792b(c3853j, c3853j2);
        c3853j2.f3041c = c3853j;
        c3853j.f3039a = c3853j2;
        int iMax = Math.max(c3853j3 != null ? c3853j3.f3047i : 0, c3853j5 != null ? c3853j5.f3047i : 0) + 1;
        c3853j.f3047i = iMax;
        c3853j2.f3047i = Math.max(iMax, c3853j4 != null ? c3853j4.f3047i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C3851h c3851h = this.entrySet;
        if (c3851h != null) {
            return c3851h;
        }
        C3851h c3851h2 = new C3851h(this);
        this.entrySet = c3851h2;
        return c3851h2;
    }

    public C3853j find(K k8, boolean z8) {
        int iCompareTo;
        C3853j c3853j;
        Comparator<? super K> comparator = this.comparator;
        C3853j c3853j2 = this.root;
        C3335t c3335t = f3014a;
        if (c3853j2 != null) {
            Comparable comparable = comparator == c3335t ? (Comparable) k8 : null;
            while (true) {
                AbstractC0009a abstractC0009a = (Object) c3853j2.f3044f;
                iCompareTo = comparable != null ? comparable.compareTo(abstractC0009a) : comparator.compare(k8, abstractC0009a);
                if (iCompareTo == 0) {
                    return c3853j2;
                }
                C3853j c3853j3 = iCompareTo < 0 ? c3853j2.f3040b : c3853j2.f3041c;
                if (c3853j3 == null) {
                    break;
                }
                c3853j2 = c3853j3;
            }
        } else {
            iCompareTo = 0;
        }
        C3853j c3853j4 = c3853j2;
        if (!z8) {
            return null;
        }
        C3853j c3853j5 = this.header;
        if (c3853j4 != null) {
            c3853j = new C3853j(this.allowNullValues, c3853j4, k8, c3853j5, c3853j5.f3043e);
            if (iCompareTo < 0) {
                c3853j4.f3040b = c3853j;
            } else {
                c3853j4.f3041c = c3853j;
            }
            m2791a(c3853j4, true);
        } else {
            if (comparator == c3335t && !(k8 instanceof Comparable)) {
                throw new ClassCastException(k8.getClass().getName().concat(" is not Comparable"));
            }
            c3853j = new C3853j(this.allowNullValues, c3853j4, k8, c3853j5, c3853j5.f3043e);
            this.root = c3853j;
        }
        this.size++;
        this.modCount++;
        return c3853j;
    }

    public C3853j findByEntry(Map.Entry<?, ?> entry) {
        C3853j c3853jFindByObject = findByObject(entry.getKey());
        if (c3853jFindByObject == null || !Objects.equals(c3853jFindByObject.f3046h, entry.getValue())) {
            return null;
        }
        return c3853jFindByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3853j findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C3853j c3853jFindByObject = findByObject(obj);
        if (c3853jFindByObject != null) {
            return (V) c3853jFindByObject.f3046h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C3852i c3852i = this.keySet;
        if (c3852i != null) {
            return c3852i;
        }
        C3852i c3852i2 = new C3852i(this);
        this.keySet = c3852i2;
        return c3852i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k8, V v2) {
        if (k8 == null) {
            throw new NullPointerException("key == null");
        }
        if (v2 == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        C3853j c3853jFind = find(k8, true);
        V v4 = (V) c3853jFind.f3046h;
        c3853jFind.f3046h = v2;
        return v4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C3853j c3853jRemoveInternalByKey = removeInternalByKey(obj);
        if (c3853jRemoveInternalByKey != null) {
            return (V) c3853jRemoveInternalByKey.f3046h;
        }
        return null;
    }

    public void removeInternal(C3853j c3853j, boolean z8) {
        C3853j c3853j2;
        C3853j c3853j3;
        int i;
        if (z8) {
            C3853j c3853j4 = c3853j.f3043e;
            c3853j4.f3042d = c3853j.f3042d;
            c3853j.f3042d.f3043e = c3853j4;
        }
        C3853j c3853j5 = c3853j.f3040b;
        C3853j c3853j6 = c3853j.f3041c;
        C3853j c3853j7 = c3853j.f3039a;
        int i8 = 0;
        if (c3853j5 == null || c3853j6 == null) {
            if (c3853j5 != null) {
                m2792b(c3853j, c3853j5);
                c3853j.f3040b = null;
            } else if (c3853j6 != null) {
                m2792b(c3853j, c3853j6);
                c3853j.f3041c = null;
            } else {
                m2792b(c3853j, null);
            }
            m2791a(c3853j7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (c3853j5.f3047i > c3853j6.f3047i) {
            C3853j c3853j8 = c3853j5.f3041c;
            while (true) {
                C3853j c3853j9 = c3853j8;
                c3853j3 = c3853j5;
                c3853j5 = c3853j9;
                if (c3853j5 == null) {
                    break;
                } else {
                    c3853j8 = c3853j5.f3041c;
                }
            }
        } else {
            C3853j c3853j10 = c3853j6.f3040b;
            while (true) {
                c3853j2 = c3853j6;
                c3853j6 = c3853j10;
                if (c3853j6 == null) {
                    break;
                } else {
                    c3853j10 = c3853j6.f3040b;
                }
            }
            c3853j3 = c3853j2;
        }
        removeInternal(c3853j3, false);
        C3853j c3853j11 = c3853j.f3040b;
        if (c3853j11 != null) {
            i = c3853j11.f3047i;
            c3853j3.f3040b = c3853j11;
            c3853j11.f3039a = c3853j3;
            c3853j.f3040b = null;
        } else {
            i = 0;
        }
        C3853j c3853j12 = c3853j.f3041c;
        if (c3853j12 != null) {
            i8 = c3853j12.f3047i;
            c3853j3.f3041c = c3853j12;
            c3853j12.f3039a = c3853j3;
            c3853j.f3041c = null;
        }
        c3853j3.f3047i = Math.max(i, i8) + 1;
        m2792b(c3853j, c3853j3);
    }

    public C3853j removeInternalByKey(Object obj) {
        C3853j c3853jFindByObject = findByObject(obj);
        if (c3853jFindByObject != null) {
            removeInternal(c3853jFindByObject, true);
        }
        return c3853jFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z8) {
        this(f3014a, z8);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z8) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? f3014a : comparator;
        this.allowNullValues = z8;
        this.header = new C3853j(z8);
    }
}
