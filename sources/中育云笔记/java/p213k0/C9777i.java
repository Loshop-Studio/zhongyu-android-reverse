package p213k0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p109d1.AbstractC8909j;

/* renamed from: k0.i */
/* loaded from: classes3.dex */
public final class C9777i implements InterfaceC9770b {

    /* renamed from: a */
    public final C9775g f22938a = new C9775g();

    /* renamed from: b */
    public final b f22939b = new b();

    /* renamed from: c */
    public final Map f22940c = new HashMap();

    /* renamed from: d */
    public final Map f22941d = new HashMap();

    /* renamed from: e */
    public final int f22942e;

    /* renamed from: f */
    public int f22943f;

    /* renamed from: k0.i$a */
    public static final class a implements InterfaceC9780l {

        /* renamed from: a */
        public final b f22944a;

        /* renamed from: b */
        public int f22945b;

        /* renamed from: c */
        public Class f22946c;

        public a(b bVar) {
            this.f22944a = bVar;
        }

        @Override // p213k0.InterfaceC9780l
        /* renamed from: a */
        public void mo19738a() {
            this.f22944a.m19707c(this);
        }

        /* renamed from: b */
        public void m19739b(int i10, Class cls) {
            this.f22945b = i10;
            this.f22946c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f22945b == aVar.f22945b && this.f22946c == aVar.f22946c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f22945b * 31;
            Class cls = this.f22946c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f22945b + "array=" + this.f22946c + '}';
        }
    }

    /* renamed from: k0.i$b */
    public static final class b extends AbstractC9771c {
        @Override // p213k0.AbstractC9771c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo19705a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m19741e(int i10, Class cls) {
            a aVar = (a) m19706b();
            aVar.m19739b(i10, cls);
            return aVar;
        }
    }

    public C9777i(int i10) {
        this.f22942e = i10;
    }

    @Override // p213k0.InterfaceC9770b
    /* renamed from: a */
    public synchronized void mo19701a(int i10) {
        try {
            if (i10 >= 40) {
                mo19702b();
            } else if (i10 >= 20 || i10 == 15) {
                m19729g(this.f22942e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p213k0.InterfaceC9770b
    /* renamed from: b */
    public synchronized void mo19702b() {
        m19729g(0);
    }

    @Override // p213k0.InterfaceC9770b
    /* renamed from: c */
    public synchronized Object mo19703c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) m19734l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return m19733k(m19737o(i10, num) ? this.f22939b.m19741e(num.intValue(), cls) : this.f22939b.m19741e(i10, cls), cls);
    }

    @Override // p213k0.InterfaceC9770b
    /* renamed from: d */
    public synchronized Object mo19704d(int i10, Class cls) {
        return m19733k(this.f22939b.m19741e(i10, cls), cls);
    }

    /* renamed from: e */
    public final void m19727e(int i10, Class cls) {
        NavigableMap navigableMapM19734l = m19734l(cls);
        Integer num = (Integer) navigableMapM19734l.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM19734l.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM19734l.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m19728f() {
        m19729g(this.f22942e);
    }

    /* renamed from: g */
    public final void m19729g(int i10) {
        while (this.f22943f > i10) {
            Object objM19721f = this.f22938a.m19721f();
            AbstractC8909j.m17468d(objM19721f);
            InterfaceC9769a interfaceC9769aM19730h = m19730h(objM19721f);
            this.f22943f -= interfaceC9769aM19730h.mo19700b(objM19721f) * interfaceC9769aM19730h.mo19699a();
            m19727e(interfaceC9769aM19730h.mo19700b(objM19721f), objM19721f.getClass());
            if (Log.isLoggable(interfaceC9769aM19730h.getTag(), 2)) {
                interfaceC9769aM19730h.getTag();
                interfaceC9769aM19730h.mo19700b(objM19721f);
            }
        }
    }

    /* renamed from: h */
    public final InterfaceC9769a m19730h(Object obj) {
        return m19731i(obj.getClass());
    }

    /* renamed from: i */
    public final InterfaceC9769a m19731i(Class cls) {
        InterfaceC9769a c9774f;
        InterfaceC9769a interfaceC9769a = (InterfaceC9769a) this.f22941d.get(cls);
        if (interfaceC9769a != null) {
            return interfaceC9769a;
        }
        if (cls.equals(int[].class)) {
            c9774f = new C9776h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c9774f = new C9774f();
        }
        this.f22941d.put(cls, c9774f);
        return c9774f;
    }

    /* renamed from: j */
    public final Object m19732j(a aVar) {
        return this.f22938a.m19717a(aVar);
    }

    /* renamed from: k */
    public final Object m19733k(a aVar, Class cls) {
        InterfaceC9769a interfaceC9769aM19731i = m19731i(cls);
        Object objM19732j = m19732j(aVar);
        if (objM19732j != null) {
            this.f22943f -= interfaceC9769aM19731i.mo19700b(objM19732j) * interfaceC9769aM19731i.mo19699a();
            m19727e(interfaceC9769aM19731i.mo19700b(objM19732j), cls);
        }
        if (objM19732j != null) {
            return objM19732j;
        }
        if (Log.isLoggable(interfaceC9769aM19731i.getTag(), 2)) {
            interfaceC9769aM19731i.getTag();
            int i10 = aVar.f22945b;
        }
        return interfaceC9769aM19731i.newArray(aVar.f22945b);
    }

    /* renamed from: l */
    public final NavigableMap m19734l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f22940c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22940c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean m19735m() {
        int i10 = this.f22943f;
        return i10 == 0 || this.f22942e / i10 >= 2;
    }

    /* renamed from: n */
    public final boolean m19736n(int i10) {
        return i10 <= this.f22942e / 2;
    }

    /* renamed from: o */
    public final boolean m19737o(int i10, Integer num) {
        if (num != null) {
            return m19735m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // p213k0.InterfaceC9770b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC9769a interfaceC9769aM19731i = m19731i(cls);
        int iMo19700b = interfaceC9769aM19731i.mo19700b(obj);
        int iMo19699a = interfaceC9769aM19731i.mo19699a() * iMo19700b;
        if (m19736n(iMo19699a)) {
            a aVarM19741e = this.f22939b.m19741e(iMo19700b, cls);
            this.f22938a.m19720d(aVarM19741e, obj);
            NavigableMap navigableMapM19734l = m19734l(cls);
            Integer num = (Integer) navigableMapM19734l.get(Integer.valueOf(aVarM19741e.f22945b));
            Integer numValueOf = Integer.valueOf(aVarM19741e.f22945b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM19734l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f22943f += iMo19699a;
            m19728f();
        }
    }
}
