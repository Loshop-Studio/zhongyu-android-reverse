package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8773d;
import p145j7.AbstractC9025b;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10672e;

/* loaded from: classes5.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC10672e {

    /* renamed from: n */
    public static final C9084a f17401n = new C9084a(null);

    /* renamed from: o */
    public static final MapBuilder f17402o;

    /* renamed from: a */
    public Object[] f17403a;

    /* renamed from: b */
    public Object[] f17404b;

    /* renamed from: c */
    public int[] f17405c;

    /* renamed from: d */
    public int[] f17406d;

    /* renamed from: e */
    public int f17407e;

    /* renamed from: f */
    public int f17408f;

    /* renamed from: g */
    public int f17409g;

    /* renamed from: h */
    public int f17410h;

    /* renamed from: i */
    public int f17411i;

    /* renamed from: j */
    public C9094b f17412j;

    /* renamed from: k */
    public C9095c f17413k;

    /* renamed from: l */
    public C9093a f17414l;

    /* renamed from: m */
    public boolean f17415m;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C9084a {
        public /* synthetic */ C9084a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: c */
        public final int m16042c(int i10) {
            return Integer.highestOneBit(AbstractC8323h.m13510e(i10, 1) * 3);
        }

        /* renamed from: d */
        public final int m16043d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        /* renamed from: e */
        public final MapBuilder m16044e() {
            return MapBuilder.f17402o;
        }

        public C9084a() {
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C9085b extends C9087d implements Iterator, InterfaceC10668a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9085b(MapBuilder map) {
            super(map);
            AbstractC9133u.m16133g(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C9086c next() {
            m16049a();
            if (m16050b() >= m16052d().f17408f) {
                throw new NoSuchElementException();
            }
            int iM16050b = m16050b();
            m16054f(iM16050b + 1);
            m16055g(iM16050b);
            C9086c c9086c = new C9086c(m16052d(), m16051c());
            m16053e();
            return c9086c;
        }

        /* renamed from: i */
        public final void m16046i(StringBuilder sb) {
            AbstractC9133u.m16133g(sb, "sb");
            if (m16050b() >= m16052d().f17408f) {
                throw new NoSuchElementException();
            }
            int iM16050b = m16050b();
            m16054f(iM16050b + 1);
            m16055g(iM16050b);
            Object obj = m16052d().f17403a[m16051c()];
            if (obj == m16052d()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = m16052d().f17404b;
            AbstractC9133u.m16130d(objArr);
            Object obj2 = objArr[m16051c()];
            if (obj2 == m16052d()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m16053e();
        }

        /* renamed from: j */
        public final int m16047j() {
            if (m16050b() >= m16052d().f17408f) {
                throw new NoSuchElementException();
            }
            int iM16050b = m16050b();
            m16054f(iM16050b + 1);
            m16055g(iM16050b);
            Object obj = m16052d().f17403a[m16051c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m16052d().f17404b;
            AbstractC9133u.m16130d(objArr);
            Object obj2 = objArr[m16051c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m16053e();
            return iHashCode2;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C9086c implements Map.Entry, InterfaceC10672e.a {

        /* renamed from: a */
        public final MapBuilder f17416a;

        /* renamed from: b */
        public final int f17417b;

        /* renamed from: c */
        public final int f17418c;

        public C9086c(MapBuilder map, int i10) {
            AbstractC9133u.m16133g(map, "map");
            this.f17416a = map;
            this.f17417b = i10;
            this.f17418c = map.f17410h;
        }

        /* renamed from: a */
        private final void m16048a() {
            if (this.f17416a.f17410h != this.f17418c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC9133u.m16128b(entry.getKey(), getKey()) && AbstractC9133u.m16128b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            m16048a();
            return this.f17416a.f17403a[this.f17417b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            m16048a();
            Object[] objArr = this.f17416a.f17404b;
            AbstractC9133u.m16130d(objArr);
            return objArr[this.f17417b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m16048a();
            this.f17416a.m16028m();
            Object[] objArrM16026k = this.f17416a.m16026k();
            int i10 = this.f17417b;
            Object obj2 = objArrM16026k[i10];
            objArrM16026k[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C9087d {

        /* renamed from: a */
        public final MapBuilder f17419a;

        /* renamed from: b */
        public int f17420b;

        /* renamed from: c */
        public int f17421c;

        /* renamed from: d */
        public int f17422d;

        public C9087d(MapBuilder map) {
            AbstractC9133u.m16133g(map, "map");
            this.f17419a = map;
            this.f17421c = -1;
            this.f17422d = map.f17410h;
            m16053e();
        }

        /* renamed from: a */
        public final void m16049a() {
            if (this.f17419a.f17410h != this.f17422d) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public final int m16050b() {
            return this.f17420b;
        }

        /* renamed from: c */
        public final int m16051c() {
            return this.f17421c;
        }

        /* renamed from: d */
        public final MapBuilder m16052d() {
            return this.f17419a;
        }

        /* renamed from: e */
        public final void m16053e() {
            while (this.f17420b < this.f17419a.f17408f) {
                int[] iArr = this.f17419a.f17405c;
                int i10 = this.f17420b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f17420b = i10 + 1;
                }
            }
        }

        /* renamed from: f */
        public final void m16054f(int i10) {
            this.f17420b = i10;
        }

        /* renamed from: g */
        public final void m16055g(int i10) {
            this.f17421c = i10;
        }

        public final boolean hasNext() {
            return this.f17420b < this.f17419a.f17408f;
        }

        public final void remove() {
            m16049a();
            if (this.f17421c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f17419a.m16028m();
            this.f17419a.m16019L(this.f17421c);
            this.f17421c = -1;
            this.f17422d = this.f17419a.f17410h;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C9088e extends C9087d implements Iterator, InterfaceC10668a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9088e(MapBuilder map) {
            super(map);
            AbstractC9133u.m16133g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m16049a();
            if (m16050b() >= m16052d().f17408f) {
                throw new NoSuchElementException();
            }
            int iM16050b = m16050b();
            m16054f(iM16050b + 1);
            m16055g(iM16050b);
            Object obj = m16052d().f17403a[m16051c()];
            m16053e();
            return obj;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C9089f extends C9087d implements Iterator, InterfaceC10668a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9089f(MapBuilder map) {
            super(map);
            AbstractC9133u.m16133g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m16049a();
            if (m16050b() >= m16052d().f17408f) {
                throw new NoSuchElementException();
            }
            int iM16050b = m16050b();
            m16054f(iM16050b + 1);
            m16055g(iM16050b);
            Object[] objArr = m16052d().f17404b;
            AbstractC9133u.m16130d(objArr);
            Object obj = objArr[m16051c()];
            m16053e();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f17415m = true;
        f17402o = mapBuilder;
    }

    public MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f17403a = objArr;
        this.f17404b = objArr2;
        this.f17405c = iArr;
        this.f17406d = iArr2;
        this.f17407e = i10;
        this.f17408f = i11;
        this.f17409g = f17401n.m16043d(m16038y());
    }

    /* renamed from: I */
    private final void m15998I() {
        this.f17410h++;
    }

    /* renamed from: r */
    private final void m16007r(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > m16036w()) {
            int iM14515e = AbstractC8773d.Companion.m14515e(m16036w(), i10);
            this.f17403a = AbstractC9025b.m15683e(this.f17403a, iM14515e);
            Object[] objArr = this.f17404b;
            this.f17404b = objArr != null ? AbstractC9025b.m15683e(objArr, iM14515e) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f17405c, iM14515e);
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.f17405c = iArrCopyOf;
            int iM16042c = f17401n.m16042c(iM14515e);
            if (iM16042c > m16038y()) {
                m16017J(iM16042c);
            }
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* renamed from: s */
    private final void m16008s(int i10) {
        if (m16023P(i10)) {
            m16029n(true);
        } else {
            m16007r(this.f17408f + i10);
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17415m) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: A */
    public int m16009A() {
        return this.f17411i;
    }

    /* renamed from: B */
    public Collection m16010B() {
        C9095c c9095c = this.f17413k;
        if (c9095c != null) {
            return c9095c;
        }
        C9095c c9095c2 = new C9095c(this);
        this.f17413k = c9095c2;
        return c9095c2;
    }

    /* renamed from: C */
    public final int m16011C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f17409g;
    }

    /* renamed from: D */
    public final boolean m16012D() {
        return this.f17415m;
    }

    /* renamed from: E */
    public final C9088e m16013E() {
        return new C9088e(this);
    }

    /* renamed from: F */
    public final boolean m16014F(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m16008s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m16015G((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: G */
    public final boolean m16015G(Map.Entry entry) {
        int iM16025j = m16025j(entry.getKey());
        Object[] objArrM16026k = m16026k();
        if (iM16025j >= 0) {
            objArrM16026k[iM16025j] = entry.getValue();
            return true;
        }
        int i10 = (-iM16025j) - 1;
        if (AbstractC9133u.m16128b(entry.getValue(), objArrM16026k[i10])) {
            return false;
        }
        objArrM16026k[i10] = entry.getValue();
        return true;
    }

    /* renamed from: H */
    public final boolean m16016H(int i10) {
        int iM16011C = m16011C(this.f17403a[i10]);
        int i11 = this.f17407e;
        while (true) {
            int[] iArr = this.f17406d;
            if (iArr[iM16011C] == 0) {
                iArr[iM16011C] = i10 + 1;
                this.f17405c[i10] = iM16011C;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iM16011C = iM16011C == 0 ? m16038y() - 1 : iM16011C - 1;
        }
    }

    /* renamed from: J */
    public final void m16017J(int i10) {
        m15998I();
        int i11 = 0;
        if (this.f17408f > size()) {
            m16029n(false);
        }
        this.f17406d = new int[i10];
        this.f17409g = f17401n.m16043d(i10);
        while (i11 < this.f17408f) {
            int i12 = i11 + 1;
            if (!m16016H(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* renamed from: K */
    public final boolean m16018K(Map.Entry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        m16028m();
        int iM16034u = m16034u(entry.getKey());
        if (iM16034u < 0) {
            return false;
        }
        Object[] objArr = this.f17404b;
        AbstractC9133u.m16130d(objArr);
        if (!AbstractC9133u.m16128b(objArr[iM16034u], entry.getValue())) {
            return false;
        }
        m16019L(iM16034u);
        return true;
    }

    /* renamed from: L */
    public final void m16019L(int i10) {
        AbstractC9025b.m15684f(this.f17403a, i10);
        Object[] objArr = this.f17404b;
        if (objArr != null) {
            AbstractC9025b.m15684f(objArr, i10);
        }
        m16020M(this.f17405c[i10]);
        this.f17405c[i10] = -1;
        this.f17411i = size() - 1;
        m15998I();
    }

    /* renamed from: M */
    public final void m16020M(int i10) {
        int iM13513h = AbstractC8323h.m13513h(this.f17407e * 2, m16038y() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? m16038y() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f17407e) {
                this.f17406d[i12] = 0;
                return;
            }
            int[] iArr = this.f17406d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((m16011C(this.f17403a[i14]) - i10) & (m16038y() - 1)) >= i11) {
                    this.f17406d[i12] = i13;
                    this.f17405c[i14] = i12;
                }
                iM13513h--;
            }
            i12 = i10;
            i11 = 0;
            iM13513h--;
        } while (iM13513h >= 0);
        this.f17406d[i12] = -1;
    }

    /* renamed from: N */
    public final boolean m16021N(Object obj) {
        m16028m();
        int iM16034u = m16034u(obj);
        if (iM16034u < 0) {
            return false;
        }
        m16019L(iM16034u);
        return true;
    }

    /* renamed from: O */
    public final boolean m16022O(Object obj) {
        m16028m();
        int iM16035v = m16035v(obj);
        if (iM16035v < 0) {
            return false;
        }
        m16019L(iM16035v);
        return true;
    }

    /* renamed from: P */
    public final boolean m16023P(int i10) {
        int iM16036w = m16036w();
        int i11 = this.f17408f;
        int i12 = iM16036w - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= m16036w() / 4;
    }

    /* renamed from: Q */
    public final C9089f m16024Q() {
        return new C9089f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m16028m();
        int i10 = this.f17408f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f17405c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f17406d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC9025b.m15685g(this.f17403a, 0, this.f17408f);
        Object[] objArr = this.f17404b;
        if (objArr != null) {
            AbstractC9025b.m15685g(objArr, 0, this.f17408f);
        }
        this.f17411i = 0;
        this.f17408f = 0;
        m15998I();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m16034u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m16035v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m16037x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && m16032q((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iM16034u = m16034u(obj);
        if (iM16034u < 0) {
            return null;
        }
        Object[] objArr = this.f17404b;
        AbstractC9133u.m16130d(objArr);
        return objArr[iM16034u];
    }

    @Override // java.util.Map
    public int hashCode() {
        C9085b c9085bM16033t = m16033t();
        int iM16047j = 0;
        while (c9085bM16033t.hasNext()) {
            iM16047j += c9085bM16033t.m16047j();
        }
        return iM16047j;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final int m16025j(Object obj) {
        m16028m();
        while (true) {
            int iM16011C = m16011C(obj);
            int iM13513h = AbstractC8323h.m13513h(this.f17407e * 2, m16038y() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f17406d[iM16011C];
                if (i11 <= 0) {
                    if (this.f17408f < m16036w()) {
                        int i12 = this.f17408f;
                        int i13 = i12 + 1;
                        this.f17408f = i13;
                        this.f17403a[i12] = obj;
                        this.f17405c[i12] = iM16011C;
                        this.f17406d[iM16011C] = i13;
                        this.f17411i = size() + 1;
                        m15998I();
                        if (i10 > this.f17407e) {
                            this.f17407e = i10;
                        }
                        return i12;
                    }
                    m16008s(1);
                } else {
                    if (AbstractC9133u.m16128b(this.f17403a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iM13513h) {
                        m16017J(m16038y() * 2);
                        break;
                    }
                    iM16011C = iM16011C == 0 ? m16038y() - 1 : iM16011C - 1;
                }
            }
        }
    }

    /* renamed from: k */
    public final Object[] m16026k() {
        Object[] objArr = this.f17404b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrM15682d = AbstractC9025b.m15682d(m16036w());
        this.f17404b = objArrM15682d;
        return objArrM15682d;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m16039z();
    }

    /* renamed from: l */
    public final Map m16027l() {
        m16028m();
        this.f17415m = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f17402o;
        AbstractC9133u.m16131e(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    /* renamed from: m */
    public final void m16028m() {
        if (this.f17415m) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final void m16029n(boolean z10) {
        int i10;
        Object[] objArr = this.f17404b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f17408f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f17405c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f17403a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f17406d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC9025b.m15685g(this.f17403a, i12, i10);
        if (objArr != null) {
            AbstractC9025b.m15685g(objArr, i12, this.f17408f);
        }
        this.f17408f = i12;
    }

    /* renamed from: o */
    public final boolean m16030o(Collection m10) {
        AbstractC9133u.m16133g(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m16031p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m16031p(Map.Entry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        int iM16034u = m16034u(entry.getKey());
        if (iM16034u < 0) {
            return false;
        }
        Object[] objArr = this.f17404b;
        AbstractC9133u.m16130d(objArr);
        return AbstractC9133u.m16128b(objArr[iM16034u], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m16028m();
        int iM16025j = m16025j(obj);
        Object[] objArrM16026k = m16026k();
        if (iM16025j >= 0) {
            objArrM16026k[iM16025j] = obj2;
            return null;
        }
        int i10 = (-iM16025j) - 1;
        Object obj3 = objArrM16026k[i10];
        objArrM16026k[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC9133u.m16133g(from, "from");
        m16028m();
        m16014F(from.entrySet());
    }

    /* renamed from: q */
    public final boolean m16032q(Map map) {
        return size() == map.size() && m16030o(map.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m16028m();
        int iM16034u = m16034u(obj);
        if (iM16034u < 0) {
            return null;
        }
        Object[] objArr = this.f17404b;
        AbstractC9133u.m16130d(objArr);
        Object obj2 = objArr[iM16034u];
        m16019L(iM16034u);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m16009A();
    }

    /* renamed from: t */
    public final C9085b m16033t() {
        return new C9085b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C9085b c9085bM16033t = m16033t();
        int i10 = 0;
        while (c9085bM16033t.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            c9085bM16033t.m16046i(sb);
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: u */
    public final int m16034u(Object obj) {
        int iM16011C = m16011C(obj);
        int i10 = this.f17407e;
        while (true) {
            int i11 = this.f17406d[iM16011C];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC9133u.m16128b(this.f17403a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM16011C = iM16011C == 0 ? m16038y() - 1 : iM16011C - 1;
        }
    }

    /* renamed from: v */
    public final int m16035v(Object obj) {
        int i10 = this.f17408f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f17405c[i10] >= 0) {
                Object[] objArr = this.f17404b;
                AbstractC9133u.m16130d(objArr);
                if (AbstractC9133u.m16128b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m16010B();
    }

    /* renamed from: w */
    public final int m16036w() {
        return this.f17403a.length;
    }

    /* renamed from: x */
    public Set m16037x() {
        C9093a c9093a = this.f17414l;
        if (c9093a != null) {
            return c9093a;
        }
        C9093a c9093a2 = new C9093a(this);
        this.f17414l = c9093a2;
        return c9093a2;
    }

    /* renamed from: y */
    public final int m16038y() {
        return this.f17406d.length;
    }

    /* renamed from: z */
    public Set m16039z() {
        C9094b c9094b = this.f17412j;
        if (c9094b != null) {
            return c9094b;
        }
        C9094b c9094b2 = new C9094b(this);
        this.f17412j = c9094b2;
        return c9094b2;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(AbstractC9025b.m15682d(i10), null, new int[i10], new int[f17401n.m16042c(i10)], 2, 0);
    }
}
