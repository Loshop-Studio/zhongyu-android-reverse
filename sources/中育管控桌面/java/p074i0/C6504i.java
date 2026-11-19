package p074i0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p016b1.AbstractC4408j;

/* renamed from: i0.i */
/* loaded from: classes3.dex */
public final class C6504i implements InterfaceC6497b {

    /* renamed from: a */
    public final C6502g f8307a = new C6502g();

    /* renamed from: b */
    public final b f8308b = new b();

    /* renamed from: c */
    public final Map f8309c = new HashMap();

    /* renamed from: d */
    public final Map f8310d = new HashMap();

    /* renamed from: e */
    public final int f8311e;

    /* renamed from: f */
    public int f8312f;

    /* renamed from: i0.i$a */
    public static final class a implements InterfaceC6507l {

        /* renamed from: a */
        public final b f8313a;

        /* renamed from: b */
        public int f8314b;

        /* renamed from: c */
        public Class f8315c;

        public a(b bVar) {
            this.f8313a = bVar;
        }

        @Override // p074i0.InterfaceC6507l
        /* renamed from: a */
        public void mo7225a() {
            this.f8313a.m7194c(this);
        }

        /* renamed from: b */
        public void m7226b(int i6, Class cls) {
            this.f8314b = i6;
            this.f8315c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f8314b == aVar.f8314b && this.f8315c == aVar.f8315c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i6 = this.f8314b * 31;
            Class cls = this.f8315c;
            return i6 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f8314b + "array=" + this.f8315c + '}';
        }
    }

    /* renamed from: i0.i$b */
    public static final class b extends AbstractC6498c {
        @Override // p074i0.AbstractC6498c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo7192a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m7228e(int i6, Class cls) {
            a aVar = (a) m7193b();
            aVar.m7226b(i6, cls);
            return aVar;
        }
    }

    public C6504i(int i6) {
        this.f8311e = i6;
    }

    @Override // p074i0.InterfaceC6497b
    /* renamed from: a */
    public synchronized void mo7188a(int i6) {
        try {
            if (i6 >= 40) {
                mo7189b();
            } else if (i6 >= 20 || i6 == 15) {
                m7216g(this.f8311e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p074i0.InterfaceC6497b
    /* renamed from: b */
    public synchronized void mo7189b() {
        m7216g(0);
    }

    @Override // p074i0.InterfaceC6497b
    /* renamed from: c */
    public synchronized Object mo7190c(int i6, Class cls) {
        Integer num;
        try {
            num = (Integer) m7221l(cls).ceilingKey(Integer.valueOf(i6));
        } catch (Throwable th) {
            throw th;
        }
        return m7220k(m7224o(i6, num) ? this.f8308b.m7228e(num.intValue(), cls) : this.f8308b.m7228e(i6, cls), cls);
    }

    @Override // p074i0.InterfaceC6497b
    /* renamed from: d */
    public synchronized Object mo7191d(int i6, Class cls) {
        return m7220k(this.f8308b.m7228e(i6, cls), cls);
    }

    /* renamed from: e */
    public final void m7214e(int i6, Class cls) {
        NavigableMap navigableMapM7221l = m7221l(cls);
        Integer num = (Integer) navigableMapM7221l.get(Integer.valueOf(i6));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM7221l.remove(Integer.valueOf(i6));
                return;
            } else {
                navigableMapM7221l.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i6 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m7215f() {
        m7216g(this.f8311e);
    }

    /* renamed from: g */
    public final void m7216g(int i6) {
        while (this.f8312f > i6) {
            Object objM7208f = this.f8307a.m7208f();
            AbstractC4408j.m1438d(objM7208f);
            InterfaceC6496a interfaceC6496aM7217h = m7217h(objM7208f);
            this.f8312f -= interfaceC6496aM7217h.mo7187b(objM7208f) * interfaceC6496aM7217h.mo7186a();
            m7214e(interfaceC6496aM7217h.mo7187b(objM7208f), objM7208f.getClass());
            if (Log.isLoggable(interfaceC6496aM7217h.getTag(), 2)) {
                interfaceC6496aM7217h.getTag();
                interfaceC6496aM7217h.mo7187b(objM7208f);
            }
        }
    }

    /* renamed from: h */
    public final InterfaceC6496a m7217h(Object obj) {
        return m7218i(obj.getClass());
    }

    /* renamed from: i */
    public final InterfaceC6496a m7218i(Class cls) {
        InterfaceC6496a c6501f;
        InterfaceC6496a interfaceC6496a = (InterfaceC6496a) this.f8310d.get(cls);
        if (interfaceC6496a != null) {
            return interfaceC6496a;
        }
        if (cls.equals(int[].class)) {
            c6501f = new C6503h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c6501f = new C6501f();
        }
        this.f8310d.put(cls, c6501f);
        return c6501f;
    }

    /* renamed from: j */
    public final Object m7219j(a aVar) {
        return this.f8307a.m7204a(aVar);
    }

    /* renamed from: k */
    public final Object m7220k(a aVar, Class cls) {
        InterfaceC6496a interfaceC6496aM7218i = m7218i(cls);
        Object objM7219j = m7219j(aVar);
        if (objM7219j != null) {
            this.f8312f -= interfaceC6496aM7218i.mo7187b(objM7219j) * interfaceC6496aM7218i.mo7186a();
            m7214e(interfaceC6496aM7218i.mo7187b(objM7219j), cls);
        }
        if (objM7219j != null) {
            return objM7219j;
        }
        if (Log.isLoggable(interfaceC6496aM7218i.getTag(), 2)) {
            interfaceC6496aM7218i.getTag();
            int i6 = aVar.f8314b;
        }
        return interfaceC6496aM7218i.newArray(aVar.f8314b);
    }

    /* renamed from: l */
    public final NavigableMap m7221l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f8309c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f8309c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean m7222m() {
        int i6 = this.f8312f;
        return i6 == 0 || this.f8311e / i6 >= 2;
    }

    /* renamed from: n */
    public final boolean m7223n(int i6) {
        return i6 <= this.f8311e / 2;
    }

    /* renamed from: o */
    public final boolean m7224o(int i6, Integer num) {
        if (num != null) {
            return m7222m() || num.intValue() <= i6 * 8;
        }
        return false;
    }

    @Override // p074i0.InterfaceC6497b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC6496a interfaceC6496aM7218i = m7218i(cls);
        int iMo7187b = interfaceC6496aM7218i.mo7187b(obj);
        int iMo7186a = interfaceC6496aM7218i.mo7186a() * iMo7187b;
        if (m7223n(iMo7186a)) {
            a aVarM7228e = this.f8308b.m7228e(iMo7187b, cls);
            this.f8307a.m7207d(aVarM7228e, obj);
            NavigableMap navigableMapM7221l = m7221l(cls);
            Integer num = (Integer) navigableMapM7221l.get(Integer.valueOf(aVarM7228e.f8314b));
            Integer numValueOf = Integer.valueOf(aVarM7228e.f8314b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM7221l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f8312f += iMo7186a;
            m7215f();
        }
    }
}
