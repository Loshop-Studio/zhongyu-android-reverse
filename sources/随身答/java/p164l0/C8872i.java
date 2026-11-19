package p164l0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p091e1.AbstractC7837i;

/* renamed from: l0.i */
/* loaded from: classes3.dex */
public final class C8872i implements InterfaceC8865b {

    /* renamed from: a */
    public final C8870g f14643a = new C8870g();

    /* renamed from: b */
    public final b f14644b = new b();

    /* renamed from: c */
    public final Map f14645c = new HashMap();

    /* renamed from: d */
    public final Map f14646d = new HashMap();

    /* renamed from: e */
    public final int f14647e;

    /* renamed from: f */
    public int f14648f;

    /* renamed from: l0.i$a */
    public static final class a implements InterfaceC8875l {

        /* renamed from: a */
        public final b f14649a;

        /* renamed from: b */
        public int f14650b;

        /* renamed from: c */
        public Class f14651c;

        public a(b bVar) {
            this.f14649a = bVar;
        }

        @Override // p164l0.InterfaceC8875l
        /* renamed from: a */
        public void mo13760a() {
            this.f14649a.m13729c(this);
        }

        /* renamed from: b */
        public void m13761b(int i9, Class cls) {
            this.f14650b = i9;
            this.f14651c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f14650b == aVar.f14650b && this.f14651c == aVar.f14651c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i9 = this.f14650b * 31;
            Class cls = this.f14651c;
            return i9 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f14650b + "array=" + this.f14651c + '}';
        }
    }

    /* renamed from: l0.i$b */
    public static final class b extends AbstractC8866c {
        @Override // p164l0.AbstractC8866c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo13727a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m13763e(int i9, Class cls) {
            a aVar = (a) m13728b();
            aVar.m13761b(i9, cls);
            return aVar;
        }
    }

    public C8872i(int i9) {
        this.f14647e = i9;
    }

    @Override // p164l0.InterfaceC8865b
    /* renamed from: a */
    public synchronized void mo13723a(int i9) {
        try {
            if (i9 >= 40) {
                mo13724b();
            } else if (i9 >= 20 || i9 == 15) {
                m13751g(this.f14647e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p164l0.InterfaceC8865b
    /* renamed from: b */
    public synchronized void mo13724b() {
        m13751g(0);
    }

    @Override // p164l0.InterfaceC8865b
    /* renamed from: c */
    public synchronized Object mo13725c(int i9, Class cls) {
        Integer num;
        try {
            num = (Integer) m13756l(cls).ceilingKey(Integer.valueOf(i9));
        } catch (Throwable th) {
            throw th;
        }
        return m13755k(m13759o(i9, num) ? this.f14644b.m13763e(num.intValue(), cls) : this.f14644b.m13763e(i9, cls), cls);
    }

    @Override // p164l0.InterfaceC8865b
    /* renamed from: d */
    public synchronized Object mo13726d(int i9, Class cls) {
        return m13755k(this.f14644b.m13763e(i9, cls), cls);
    }

    /* renamed from: e */
    public final void m13749e(int i9, Class cls) {
        NavigableMap navigableMapM13756l = m13756l(cls);
        Integer num = (Integer) navigableMapM13756l.get(Integer.valueOf(i9));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM13756l.remove(Integer.valueOf(i9));
                return;
            } else {
                navigableMapM13756l.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i9 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m13750f() {
        m13751g(this.f14647e);
    }

    /* renamed from: g */
    public final void m13751g(int i9) {
        while (this.f14648f > i9) {
            Object objM13743f = this.f14643a.m13743f();
            AbstractC7837i.m12256d(objM13743f);
            InterfaceC8864a interfaceC8864aM13752h = m13752h(objM13743f);
            this.f14648f -= interfaceC8864aM13752h.mo13722b(objM13743f) * interfaceC8864aM13752h.mo13721a();
            m13749e(interfaceC8864aM13752h.mo13722b(objM13743f), objM13743f.getClass());
            if (Log.isLoggable(interfaceC8864aM13752h.getTag(), 2)) {
                interfaceC8864aM13752h.getTag();
                interfaceC8864aM13752h.mo13722b(objM13743f);
            }
        }
    }

    /* renamed from: h */
    public final InterfaceC8864a m13752h(Object obj) {
        return m13753i(obj.getClass());
    }

    /* renamed from: i */
    public final InterfaceC8864a m13753i(Class cls) {
        InterfaceC8864a c8869f;
        InterfaceC8864a interfaceC8864a = (InterfaceC8864a) this.f14646d.get(cls);
        if (interfaceC8864a != null) {
            return interfaceC8864a;
        }
        if (cls.equals(int[].class)) {
            c8869f = new C8871h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c8869f = new C8869f();
        }
        this.f14646d.put(cls, c8869f);
        return c8869f;
    }

    /* renamed from: j */
    public final Object m13754j(a aVar) {
        return this.f14643a.m13739a(aVar);
    }

    /* renamed from: k */
    public final Object m13755k(a aVar, Class cls) {
        InterfaceC8864a interfaceC8864aM13753i = m13753i(cls);
        Object objM13754j = m13754j(aVar);
        if (objM13754j != null) {
            this.f14648f -= interfaceC8864aM13753i.mo13722b(objM13754j) * interfaceC8864aM13753i.mo13721a();
            m13749e(interfaceC8864aM13753i.mo13722b(objM13754j), cls);
        }
        if (objM13754j != null) {
            return objM13754j;
        }
        if (Log.isLoggable(interfaceC8864aM13753i.getTag(), 2)) {
            interfaceC8864aM13753i.getTag();
            int i9 = aVar.f14650b;
        }
        return interfaceC8864aM13753i.newArray(aVar.f14650b);
    }

    /* renamed from: l */
    public final NavigableMap m13756l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f14645c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14645c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean m13757m() {
        int i9 = this.f14648f;
        return i9 == 0 || this.f14647e / i9 >= 2;
    }

    /* renamed from: n */
    public final boolean m13758n(int i9) {
        return i9 <= this.f14647e / 2;
    }

    /* renamed from: o */
    public final boolean m13759o(int i9, Integer num) {
        if (num != null) {
            return m13757m() || num.intValue() <= i9 * 8;
        }
        return false;
    }

    @Override // p164l0.InterfaceC8865b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC8864a interfaceC8864aM13753i = m13753i(cls);
        int iMo13722b = interfaceC8864aM13753i.mo13722b(obj);
        int iMo13721a = interfaceC8864aM13753i.mo13721a() * iMo13722b;
        if (m13758n(iMo13721a)) {
            a aVarM13763e = this.f14644b.m13763e(iMo13722b, cls);
            this.f14643a.m13742d(aVarM13763e, obj);
            NavigableMap navigableMapM13756l = m13756l(cls);
            Integer num = (Integer) navigableMapM13756l.get(Integer.valueOf(aVarM13763e.f14650b));
            Integer numValueOf = Integer.valueOf(aVarM13763e.f14650b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM13756l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f14648f += iMo13721a;
            m13750f();
        }
    }
}
