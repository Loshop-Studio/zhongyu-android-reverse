package p193o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p116h0.AbstractC8706j;

/* renamed from: o.i */
/* loaded from: classes3.dex */
public final class C9505i implements InterfaceC9498b {

    /* renamed from: a */
    public final C9503g f18855a = new C9503g();

    /* renamed from: b */
    public final b f18856b = new b();

    /* renamed from: c */
    public final Map f18857c = new HashMap();

    /* renamed from: d */
    public final Map f18858d = new HashMap();

    /* renamed from: e */
    public final int f18859e;

    /* renamed from: f */
    public int f18860f;

    /* renamed from: o.i$a */
    public static final class a implements InterfaceC9508l {

        /* renamed from: a */
        public final b f18861a;

        /* renamed from: b */
        public int f18862b;

        /* renamed from: c */
        public Class f18863c;

        public a(b bVar) {
            this.f18861a = bVar;
        }

        @Override // p193o.InterfaceC9508l
        /* renamed from: a */
        public void mo17648a() {
            this.f18861a.m17618c(this);
        }

        /* renamed from: b */
        public void m17649b(int i10, Class cls) {
            this.f18862b = i10;
            this.f18863c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f18862b == aVar.f18862b && this.f18863c == aVar.f18863c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f18862b * 31;
            Class cls = this.f18863c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f18862b + "array=" + this.f18863c + '}';
        }
    }

    /* renamed from: o.i$b */
    public static final class b extends AbstractC9499c {
        @Override // p193o.AbstractC9499c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo17616a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m17651e(int i10, Class cls) {
            a aVar = (a) m17617b();
            aVar.m17649b(i10, cls);
            return aVar;
        }
    }

    public C9505i(int i10) {
        this.f18859e = i10;
    }

    @Override // p193o.InterfaceC9498b
    /* renamed from: a */
    public synchronized void mo17613a() {
        m17639f(0);
    }

    @Override // p193o.InterfaceC9498b
    /* renamed from: b */
    public synchronized Object mo17614b(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) m17644k(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return m17643j(m17647n(i10, num) ? this.f18856b.m17651e(num.intValue(), cls) : this.f18856b.m17651e(i10, cls), cls);
    }

    @Override // p193o.InterfaceC9498b
    /* renamed from: c */
    public synchronized Object mo17615c(int i10, Class cls) {
        return m17643j(this.f18856b.m17651e(i10, cls), cls);
    }

    /* renamed from: d */
    public final void m17637d(int i10, Class cls) {
        NavigableMap navigableMapM17644k = m17644k(cls);
        Integer num = (Integer) navigableMapM17644k.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM17644k.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM17644k.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    /* renamed from: e */
    public final void m17638e() {
        m17639f(this.f18859e);
    }

    /* renamed from: f */
    public final void m17639f(int i10) {
        while (this.f18860f > i10) {
            Object objM17631f = this.f18855a.m17631f();
            AbstractC8706j.m14181d(objM17631f);
            InterfaceC9497a interfaceC9497aM17640g = m17640g(objM17631f);
            this.f18860f -= interfaceC9497aM17640g.mo17612b(objM17631f) * interfaceC9497aM17640g.mo17611a();
            m17637d(interfaceC9497aM17640g.mo17612b(objM17631f), objM17631f.getClass());
            if (Log.isLoggable(interfaceC9497aM17640g.getTag(), 2)) {
                interfaceC9497aM17640g.getTag();
                interfaceC9497aM17640g.mo17612b(objM17631f);
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC9497a m17640g(Object obj) {
        return m17641h(obj.getClass());
    }

    /* renamed from: h */
    public final InterfaceC9497a m17641h(Class cls) {
        InterfaceC9497a c9502f;
        InterfaceC9497a interfaceC9497a = (InterfaceC9497a) this.f18858d.get(cls);
        if (interfaceC9497a != null) {
            return interfaceC9497a;
        }
        if (cls.equals(int[].class)) {
            c9502f = new C9504h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c9502f = new C9502f();
        }
        this.f18858d.put(cls, c9502f);
        return c9502f;
    }

    /* renamed from: i */
    public final Object m17642i(a aVar) {
        return this.f18855a.m17627a(aVar);
    }

    /* renamed from: j */
    public final Object m17643j(a aVar, Class cls) {
        InterfaceC9497a interfaceC9497aM17641h = m17641h(cls);
        Object objM17642i = m17642i(aVar);
        if (objM17642i != null) {
            this.f18860f -= interfaceC9497aM17641h.mo17612b(objM17642i) * interfaceC9497aM17641h.mo17611a();
            m17637d(interfaceC9497aM17641h.mo17612b(objM17642i), cls);
        }
        if (objM17642i != null) {
            return objM17642i;
        }
        if (Log.isLoggable(interfaceC9497aM17641h.getTag(), 2)) {
            interfaceC9497aM17641h.getTag();
            int i10 = aVar.f18862b;
        }
        return interfaceC9497aM17641h.newArray(aVar.f18862b);
    }

    /* renamed from: k */
    public final NavigableMap m17644k(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f18857c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18857c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: l */
    public final boolean m17645l() {
        int i10 = this.f18860f;
        return i10 == 0 || this.f18859e / i10 >= 2;
    }

    /* renamed from: m */
    public final boolean m17646m(int i10) {
        return i10 <= this.f18859e / 2;
    }

    /* renamed from: n */
    public final boolean m17647n(int i10, Integer num) {
        if (num != null) {
            return m17645l() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // p193o.InterfaceC9498b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC9497a interfaceC9497aM17641h = m17641h(cls);
        int iMo17612b = interfaceC9497aM17641h.mo17612b(obj);
        int iMo17611a = interfaceC9497aM17641h.mo17611a() * iMo17612b;
        if (m17646m(iMo17611a)) {
            a aVarM17651e = this.f18856b.m17651e(iMo17612b, cls);
            this.f18855a.m17630d(aVarM17651e, obj);
            NavigableMap navigableMapM17644k = m17644k(cls);
            Integer num = (Integer) navigableMapM17644k.get(Integer.valueOf(aVarM17651e.f18862b));
            Integer numValueOf = Integer.valueOf(aVarM17651e.f18862b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM17644k.put(numValueOf, Integer.valueOf(iIntValue));
            this.f18860f += iMo17611a;
            m17638e();
        }
    }

    @Override // p193o.InterfaceC9498b
    public synchronized void trimMemory(int i10) {
        try {
            if (i10 >= 40) {
                mo17613a();
            } else if (i10 >= 20 || i10 == 15) {
                m17639f(this.f18859e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
