package kotlin.collections.builders;

import id.InterfaceC9624a;
import id.InterfaceC9628e;
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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10940d;
import sc.AbstractC11088b;

/* loaded from: classes6.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC9628e {

    /* renamed from: p */
    public static final C9929a f23314p = new C9929a(null);

    /* renamed from: q */
    public static final MapBuilder f23315q;

    /* renamed from: c */
    public Object[] f23316c;

    /* renamed from: d */
    public Object[] f23317d;

    /* renamed from: e */
    public int[] f23318e;

    /* renamed from: f */
    public int[] f23319f;

    /* renamed from: g */
    public int f23320g;

    /* renamed from: h */
    public int f23321h;

    /* renamed from: i */
    public int f23322i;

    /* renamed from: j */
    public int f23323j;

    /* renamed from: k */
    public int f23324k;

    /* renamed from: l */
    public C9939b f23325l;

    /* renamed from: m */
    public C9940c f23326m;

    /* renamed from: n */
    public C9938a f23327n;

    /* renamed from: o */
    public boolean f23328o;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C9929a {
        public /* synthetic */ C9929a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: c */
        public final int m20187c(int i10) {
            return Integer.highestOneBit(AbstractC10410o.m21752e(i10, 1) * 3);
        }

        /* renamed from: d */
        public final int m20188d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        /* renamed from: e */
        public final MapBuilder m20189e() {
            return MapBuilder.f23315q;
        }

        public C9929a() {
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C9930b extends C9932d implements Iterator, InterfaceC9624a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9930b(MapBuilder map) {
            super(map);
            AbstractC9979u.m20294g(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C9931c next() {
            m20194a();
            if (m20195b() >= m20197d().f23321h) {
                throw new NoSuchElementException();
            }
            int iM20195b = m20195b();
            m20199f(iM20195b + 1);
            m20200g(iM20195b);
            C9931c c9931c = new C9931c(m20197d(), m20196c());
            m20198e();
            return c9931c;
        }

        /* renamed from: i */
        public final void m20191i(StringBuilder sb2) {
            AbstractC9979u.m20294g(sb2, "sb");
            if (m20195b() >= m20197d().f23321h) {
                throw new NoSuchElementException();
            }
            int iM20195b = m20195b();
            m20199f(iM20195b + 1);
            m20200g(iM20195b);
            Object obj = m20197d().f23316c[m20196c()];
            if (obj == m20197d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = m20197d().f23317d;
            AbstractC9979u.m20291d(objArr);
            Object obj2 = objArr[m20196c()];
            if (obj2 == m20197d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            m20198e();
        }

        /* renamed from: j */
        public final int m20192j() {
            if (m20195b() >= m20197d().f23321h) {
                throw new NoSuchElementException();
            }
            int iM20195b = m20195b();
            m20199f(iM20195b + 1);
            m20200g(iM20195b);
            Object obj = m20197d().f23316c[m20196c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m20197d().f23317d;
            AbstractC9979u.m20291d(objArr);
            Object obj2 = objArr[m20196c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m20198e();
            return iHashCode2;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C9931c implements Map.Entry, InterfaceC9628e.a {

        /* renamed from: c */
        public final MapBuilder f23329c;

        /* renamed from: d */
        public final int f23330d;

        /* renamed from: e */
        public final int f23331e;

        public C9931c(MapBuilder map, int i10) {
            AbstractC9979u.m20294g(map, "map");
            this.f23329c = map;
            this.f23330d = i10;
            this.f23331e = map.f23323j;
        }

        /* renamed from: a */
        private final void m20193a() {
            if (this.f23329c.f23323j != this.f23331e) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC9979u.m20289b(entry.getKey(), getKey()) && AbstractC9979u.m20289b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            m20193a();
            return this.f23329c.f23316c[this.f23330d];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            m20193a();
            Object[] objArr = this.f23329c.f23317d;
            AbstractC9979u.m20291d(objArr);
            return objArr[this.f23330d];
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
            m20193a();
            this.f23329c.m20180r();
            Object[] objArrM20178o = this.f23329c.m20178o();
            int i10 = this.f23330d;
            Object obj2 = objArrM20178o[i10];
            objArrM20178o[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C9932d {

        /* renamed from: c */
        public final MapBuilder f23332c;

        /* renamed from: d */
        public int f23333d;

        /* renamed from: e */
        public int f23334e;

        /* renamed from: f */
        public int f23335f;

        public C9932d(MapBuilder map) {
            AbstractC9979u.m20294g(map, "map");
            this.f23332c = map;
            this.f23334e = -1;
            this.f23335f = map.f23323j;
            m20198e();
        }

        /* renamed from: a */
        public final void m20194a() {
            if (this.f23332c.f23323j != this.f23335f) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public final int m20195b() {
            return this.f23333d;
        }

        /* renamed from: c */
        public final int m20196c() {
            return this.f23334e;
        }

        /* renamed from: d */
        public final MapBuilder m20197d() {
            return this.f23332c;
        }

        /* renamed from: e */
        public final void m20198e() {
            while (this.f23333d < this.f23332c.f23321h) {
                int[] iArr = this.f23332c.f23318e;
                int i10 = this.f23333d;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f23333d = i10 + 1;
                }
            }
        }

        /* renamed from: f */
        public final void m20199f(int i10) {
            this.f23333d = i10;
        }

        /* renamed from: g */
        public final void m20200g(int i10) {
            this.f23334e = i10;
        }

        public final boolean hasNext() {
            return this.f23333d < this.f23332c.f23321h;
        }

        public final void remove() {
            m20194a();
            if (this.f23334e == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f23332c.m20180r();
            this.f23332c.m20171U(this.f23334e);
            this.f23334e = -1;
            this.f23335f = this.f23332c.f23323j;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C9933e extends C9932d implements Iterator, InterfaceC9624a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9933e(MapBuilder map) {
            super(map);
            AbstractC9979u.m20294g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m20194a();
            if (m20195b() >= m20197d().f23321h) {
                throw new NoSuchElementException();
            }
            int iM20195b = m20195b();
            m20199f(iM20195b + 1);
            m20200g(iM20195b);
            Object obj = m20197d().f23316c[m20196c()];
            m20198e();
            return obj;
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C9934f extends C9932d implements Iterator, InterfaceC9624a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9934f(MapBuilder map) {
            super(map);
            AbstractC9979u.m20294g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m20194a();
            if (m20195b() >= m20197d().f23321h) {
                throw new NoSuchElementException();
            }
            int iM20195b = m20195b();
            m20199f(iM20195b + 1);
            m20200g(iM20195b);
            Object[] objArr = m20197d().f23317d;
            AbstractC9979u.m20291d(objArr);
            Object obj = objArr[m20196c()];
            m20198e();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f23328o = true;
        f23315q = mapBuilder;
    }

    public MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f23316c = objArr;
        this.f23317d = objArr2;
        this.f23318e = iArr;
        this.f23319f = iArr2;
        this.f23320g = i10;
        this.f23321h = i11;
        this.f23322i = f23314p.m20188d(m20159H());
    }

    /* renamed from: A */
    private final void m20143A(int i10) {
        if (m20175Y(i10)) {
            m20181t(true);
        } else {
            m20153z(this.f23321h + i10);
        }
    }

    /* renamed from: R */
    private final void m20144R() {
        this.f23323j++;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f23328o) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: z */
    private final void m20153z(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > m20157F()) {
            int iM23889e = AbstractC10940d.Companion.m23889e(m20157F(), i10);
            this.f23316c = AbstractC11088b.m24668e(this.f23316c, iM23889e);
            Object[] objArr = this.f23317d;
            this.f23317d = objArr != null ? AbstractC11088b.m24668e(objArr, iM23889e) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f23318e, iM23889e);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.f23318e = iArrCopyOf;
            int iM20187c = f23314p.m20187c(iM23889e);
            if (iM20187c > m20159H()) {
                m20169S(iM20187c);
            }
        }
    }

    /* renamed from: C */
    public final C9930b m20154C() {
        return new C9930b(this);
    }

    /* renamed from: D */
    public final int m20155D(Object obj) {
        int iM20163L = m20163L(obj);
        int i10 = this.f23320g;
        while (true) {
            int i11 = this.f23319f[iM20163L];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC9979u.m20289b(this.f23316c[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM20163L = iM20163L == 0 ? m20159H() - 1 : iM20163L - 1;
        }
    }

    /* renamed from: E */
    public final int m20156E(Object obj) {
        int i10 = this.f23321h;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f23318e[i10] >= 0) {
                Object[] objArr = this.f23317d;
                AbstractC9979u.m20291d(objArr);
                if (AbstractC9979u.m20289b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    /* renamed from: F */
    public final int m20157F() {
        return this.f23316c.length;
    }

    /* renamed from: G */
    public Set m20158G() {
        C9938a c9938a = this.f23327n;
        if (c9938a != null) {
            return c9938a;
        }
        C9938a c9938a2 = new C9938a(this);
        this.f23327n = c9938a2;
        return c9938a2;
    }

    /* renamed from: H */
    public final int m20159H() {
        return this.f23319f.length;
    }

    /* renamed from: I */
    public Set m20160I() {
        C9939b c9939b = this.f23325l;
        if (c9939b != null) {
            return c9939b;
        }
        C9939b c9939b2 = new C9939b(this);
        this.f23325l = c9939b2;
        return c9939b2;
    }

    /* renamed from: J */
    public int m20161J() {
        return this.f23324k;
    }

    /* renamed from: K */
    public Collection m20162K() {
        C9940c c9940c = this.f23326m;
        if (c9940c != null) {
            return c9940c;
        }
        C9940c c9940c2 = new C9940c(this);
        this.f23326m = c9940c2;
        return c9940c2;
    }

    /* renamed from: L */
    public final int m20163L(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f23322i;
    }

    /* renamed from: M */
    public final boolean m20164M() {
        return this.f23328o;
    }

    /* renamed from: N */
    public final C9933e m20165N() {
        return new C9933e(this);
    }

    /* renamed from: O */
    public final boolean m20166O(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m20143A(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m20167P((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: P */
    public final boolean m20167P(Map.Entry entry) {
        int iM20177n = m20177n(entry.getKey());
        Object[] objArrM20178o = m20178o();
        if (iM20177n >= 0) {
            objArrM20178o[iM20177n] = entry.getValue();
            return true;
        }
        int i10 = (-iM20177n) - 1;
        if (AbstractC9979u.m20289b(entry.getValue(), objArrM20178o[i10])) {
            return false;
        }
        objArrM20178o[i10] = entry.getValue();
        return true;
    }

    /* renamed from: Q */
    public final boolean m20168Q(int i10) {
        int iM20163L = m20163L(this.f23316c[i10]);
        int i11 = this.f23320g;
        while (true) {
            int[] iArr = this.f23319f;
            if (iArr[iM20163L] == 0) {
                iArr[iM20163L] = i10 + 1;
                this.f23318e[i10] = iM20163L;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iM20163L = iM20163L == 0 ? m20159H() - 1 : iM20163L - 1;
        }
    }

    /* renamed from: S */
    public final void m20169S(int i10) {
        m20144R();
        int i11 = 0;
        if (this.f23321h > size()) {
            m20181t(false);
        }
        this.f23319f = new int[i10];
        this.f23322i = f23314p.m20188d(i10);
        while (i11 < this.f23321h) {
            int i12 = i11 + 1;
            if (!m20168Q(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* renamed from: T */
    public final boolean m20170T(Map.Entry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        m20180r();
        int iM20155D = m20155D(entry.getKey());
        if (iM20155D < 0) {
            return false;
        }
        Object[] objArr = this.f23317d;
        AbstractC9979u.m20291d(objArr);
        if (!AbstractC9979u.m20289b(objArr[iM20155D], entry.getValue())) {
            return false;
        }
        m20171U(iM20155D);
        return true;
    }

    /* renamed from: U */
    public final void m20171U(int i10) {
        AbstractC11088b.m24669f(this.f23316c, i10);
        Object[] objArr = this.f23317d;
        if (objArr != null) {
            AbstractC11088b.m24669f(objArr, i10);
        }
        m20172V(this.f23318e[i10]);
        this.f23318e[i10] = -1;
        this.f23324k = size() - 1;
        m20144R();
    }

    /* renamed from: V */
    public final void m20172V(int i10) {
        int iM21756i = AbstractC10410o.m21756i(this.f23320g * 2, m20159H() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? m20159H() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f23320g) {
                this.f23319f[i12] = 0;
                return;
            }
            int[] iArr = this.f23319f;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((m20163L(this.f23316c[i14]) - i10) & (m20159H() - 1)) >= i11) {
                    this.f23319f[i12] = i13;
                    this.f23318e[i14] = i12;
                }
                iM21756i--;
            }
            i12 = i10;
            i11 = 0;
            iM21756i--;
        } while (iM21756i >= 0);
        this.f23319f[i12] = -1;
    }

    /* renamed from: W */
    public final boolean m20173W(Object obj) {
        m20180r();
        int iM20155D = m20155D(obj);
        if (iM20155D < 0) {
            return false;
        }
        m20171U(iM20155D);
        return true;
    }

    /* renamed from: X */
    public final boolean m20174X(Object obj) {
        m20180r();
        int iM20156E = m20156E(obj);
        if (iM20156E < 0) {
            return false;
        }
        m20171U(iM20156E);
        return true;
    }

    /* renamed from: Y */
    public final boolean m20175Y(int i10) {
        int iM20157F = m20157F();
        int i11 = this.f23321h;
        int i12 = iM20157F - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= m20157F() / 4;
    }

    /* renamed from: Z */
    public final C9934f m20176Z() {
        return new C9934f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m20180r();
        int i10 = this.f23321h - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f23318e;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f23319f[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC11088b.m24670g(this.f23316c, 0, this.f23321h);
        Object[] objArr = this.f23317d;
        if (objArr != null) {
            AbstractC11088b.m24670g(objArr, 0, this.f23321h);
        }
        this.f23324k = 0;
        this.f23321h = 0;
        m20144R();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m20155D(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m20156E(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m20158G();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && m20184y((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iM20155D = m20155D(obj);
        if (iM20155D < 0) {
            return null;
        }
        Object[] objArr = this.f23317d;
        AbstractC9979u.m20291d(objArr);
        return objArr[iM20155D];
    }

    @Override // java.util.Map
    public int hashCode() {
        C9930b c9930bM20154C = m20154C();
        int iM20192j = 0;
        while (c9930bM20154C.hasNext()) {
            iM20192j += c9930bM20154C.m20192j();
        }
        return iM20192j;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m20160I();
    }

    /* renamed from: n */
    public final int m20177n(Object obj) {
        m20180r();
        while (true) {
            int iM20163L = m20163L(obj);
            int iM21756i = AbstractC10410o.m21756i(this.f23320g * 2, m20159H() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f23319f[iM20163L];
                if (i11 <= 0) {
                    if (this.f23321h < m20157F()) {
                        int i12 = this.f23321h;
                        int i13 = i12 + 1;
                        this.f23321h = i13;
                        this.f23316c[i12] = obj;
                        this.f23318e[i12] = iM20163L;
                        this.f23319f[iM20163L] = i13;
                        this.f23324k = size() + 1;
                        m20144R();
                        if (i10 > this.f23320g) {
                            this.f23320g = i10;
                        }
                        return i12;
                    }
                    m20143A(1);
                } else {
                    if (AbstractC9979u.m20289b(this.f23316c[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iM21756i) {
                        m20169S(m20159H() * 2);
                        break;
                    }
                    iM20163L = iM20163L == 0 ? m20159H() - 1 : iM20163L - 1;
                }
            }
        }
    }

    /* renamed from: o */
    public final Object[] m20178o() {
        Object[] objArr = this.f23317d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrM24667d = AbstractC11088b.m24667d(m20157F());
        this.f23317d = objArrM24667d;
        return objArrM24667d;
    }

    /* renamed from: p */
    public final Map m20179p() {
        m20180r();
        this.f23328o = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f23315q;
        AbstractC9979u.m20292e(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m20180r();
        int iM20177n = m20177n(obj);
        Object[] objArrM20178o = m20178o();
        if (iM20177n >= 0) {
            objArrM20178o[iM20177n] = obj2;
            return null;
        }
        int i10 = (-iM20177n) - 1;
        Object obj3 = objArrM20178o[i10];
        objArrM20178o[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC9979u.m20294g(from, "from");
        m20180r();
        m20166O(from.entrySet());
    }

    /* renamed from: r */
    public final void m20180r() {
        if (this.f23328o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m20180r();
        int iM20155D = m20155D(obj);
        if (iM20155D < 0) {
            return null;
        }
        Object[] objArr = this.f23317d;
        AbstractC9979u.m20291d(objArr);
        Object obj2 = objArr[iM20155D];
        m20171U(iM20155D);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m20161J();
    }

    /* renamed from: t */
    public final void m20181t(boolean z10) {
        int i10;
        Object[] objArr = this.f23317d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f23321h;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f23318e;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f23316c;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f23319f[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC11088b.m24670g(this.f23316c, i12, i10);
        if (objArr != null) {
            AbstractC11088b.m24670g(objArr, i12, this.f23321h);
        }
        this.f23321h = i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        C9930b c9930bM20154C = m20154C();
        int i10 = 0;
        while (c9930bM20154C.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            c9930bM20154C.m20191i(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: u */
    public final boolean m20182u(Collection m10) {
        AbstractC9979u.m20294g(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m20183v((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m20183v(Map.Entry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        int iM20155D = m20155D(entry.getKey());
        if (iM20155D < 0) {
            return false;
        }
        Object[] objArr = this.f23317d;
        AbstractC9979u.m20291d(objArr);
        return AbstractC9979u.m20289b(objArr[iM20155D], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m20162K();
    }

    /* renamed from: y */
    public final boolean m20184y(Map map) {
        return size() == map.size() && m20182u(map.entrySet());
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(AbstractC11088b.m24667d(i10), null, new int[i10], new int[f23314p.m20187c(i10)], 2, 0);
    }
}
