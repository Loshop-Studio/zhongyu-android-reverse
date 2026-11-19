package p195p0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p117i1.AbstractC7651j;

/* renamed from: p0.i */
/* loaded from: classes3.dex */
public final class C8809i implements InterfaceC8802b {

    /* renamed from: a */
    public final C8807g f14953a = new C8807g();

    /* renamed from: b */
    public final b f14954b = new b();

    /* renamed from: c */
    public final Map f14955c = new HashMap();

    /* renamed from: d */
    public final Map f14956d = new HashMap();

    /* renamed from: e */
    public final int f14957e;

    /* renamed from: f */
    public int f14958f;

    /* renamed from: p0.i$a */
    public static final class a implements InterfaceC8812l {

        /* renamed from: a */
        public final b f14959a;

        /* renamed from: b */
        public int f14960b;

        /* renamed from: c */
        public Class f14961c;

        public a(b bVar) {
            this.f14959a = bVar;
        }

        @Override // p195p0.InterfaceC8812l
        /* renamed from: a */
        public void mo14740a() {
            this.f14959a.m14709c(this);
        }

        /* renamed from: b */
        public void m14741b(int i10, Class cls) {
            this.f14960b = i10;
            this.f14961c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f14960b == aVar.f14960b && this.f14961c == aVar.f14961c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f14960b * 31;
            Class cls = this.f14961c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f14960b + "array=" + this.f14961c + '}';
        }
    }

    /* renamed from: p0.i$b */
    public static final class b extends AbstractC8803c {
        @Override // p195p0.AbstractC8803c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo14707a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m14743e(int i10, Class cls) {
            a aVar = (a) m14708b();
            aVar.m14741b(i10, cls);
            return aVar;
        }
    }

    public C8809i(int i10) {
        this.f14957e = i10;
    }

    @Override // p195p0.InterfaceC8802b
    /* renamed from: a */
    public synchronized void mo14703a(int i10) {
        try {
            if (i10 >= 40) {
                mo14704b();
            } else if (i10 >= 20 || i10 == 15) {
                m14731g(this.f14957e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p195p0.InterfaceC8802b
    /* renamed from: b */
    public synchronized void mo14704b() {
        m14731g(0);
    }

    @Override // p195p0.InterfaceC8802b
    /* renamed from: c */
    public synchronized Object mo14705c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) m14736l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return m14735k(m14739o(i10, num) ? this.f14954b.m14743e(num.intValue(), cls) : this.f14954b.m14743e(i10, cls), cls);
    }

    @Override // p195p0.InterfaceC8802b
    /* renamed from: d */
    public synchronized Object mo14706d(int i10, Class cls) {
        return m14735k(this.f14954b.m14743e(i10, cls), cls);
    }

    /* renamed from: e */
    public final void m14729e(int i10, Class cls) {
        NavigableMap navigableMapM14736l = m14736l(cls);
        Integer num = (Integer) navigableMapM14736l.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM14736l.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM14736l.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m14730f() {
        m14731g(this.f14957e);
    }

    /* renamed from: g */
    public final void m14731g(int i10) {
        while (this.f14958f > i10) {
            Object objM14723f = this.f14953a.m14723f();
            AbstractC7651j.m12683d(objM14723f);
            InterfaceC8801a interfaceC8801aM14732h = m14732h(objM14723f);
            this.f14958f -= interfaceC8801aM14732h.mo14702b(objM14723f) * interfaceC8801aM14732h.mo14701a();
            m14729e(interfaceC8801aM14732h.mo14702b(objM14723f), objM14723f.getClass());
            if (Log.isLoggable(interfaceC8801aM14732h.getTag(), 2)) {
                interfaceC8801aM14732h.getTag();
                interfaceC8801aM14732h.mo14702b(objM14723f);
            }
        }
    }

    /* renamed from: h */
    public final InterfaceC8801a m14732h(Object obj) {
        return m14733i(obj.getClass());
    }

    /* renamed from: i */
    public final InterfaceC8801a m14733i(Class cls) {
        InterfaceC8801a c8806f;
        InterfaceC8801a interfaceC8801a = (InterfaceC8801a) this.f14956d.get(cls);
        if (interfaceC8801a != null) {
            return interfaceC8801a;
        }
        if (cls.equals(int[].class)) {
            c8806f = new C8808h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c8806f = new C8806f();
        }
        this.f14956d.put(cls, c8806f);
        return c8806f;
    }

    /* renamed from: j */
    public final Object m14734j(a aVar) {
        return this.f14953a.m14719a(aVar);
    }

    /* renamed from: k */
    public final Object m14735k(a aVar, Class cls) {
        InterfaceC8801a interfaceC8801aM14733i = m14733i(cls);
        Object objM14734j = m14734j(aVar);
        if (objM14734j != null) {
            this.f14958f -= interfaceC8801aM14733i.mo14702b(objM14734j) * interfaceC8801aM14733i.mo14701a();
            m14729e(interfaceC8801aM14733i.mo14702b(objM14734j), cls);
        }
        if (objM14734j != null) {
            return objM14734j;
        }
        if (Log.isLoggable(interfaceC8801aM14733i.getTag(), 2)) {
            interfaceC8801aM14733i.getTag();
            int i10 = aVar.f14960b;
        }
        return interfaceC8801aM14733i.newArray(aVar.f14960b);
    }

    /* renamed from: l */
    public final NavigableMap m14736l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f14955c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14955c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean m14737m() {
        int i10 = this.f14958f;
        return i10 == 0 || this.f14957e / i10 >= 2;
    }

    /* renamed from: n */
    public final boolean m14738n(int i10) {
        return i10 <= this.f14957e / 2;
    }

    /* renamed from: o */
    public final boolean m14739o(int i10, Integer num) {
        if (num != null) {
            return m14737m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // p195p0.InterfaceC8802b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC8801a interfaceC8801aM14733i = m14733i(cls);
        int iMo14702b = interfaceC8801aM14733i.mo14702b(obj);
        int iMo14701a = interfaceC8801aM14733i.mo14701a() * iMo14702b;
        if (m14738n(iMo14701a)) {
            a aVarM14743e = this.f14954b.m14743e(iMo14702b, cls);
            this.f14953a.m14722d(aVarM14743e, obj);
            NavigableMap navigableMapM14736l = m14736l(cls);
            Integer num = (Integer) navigableMapM14736l.get(Integer.valueOf(aVarM14743e.f14960b));
            Integer numValueOf = Integer.valueOf(aVarM14743e.f14960b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM14736l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f14958f += iMo14701a;
            m14730f();
        }
    }
}
