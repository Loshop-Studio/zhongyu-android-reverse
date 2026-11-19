package p098n;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p062g0.AbstractC3749i;

/* renamed from: n.i */
/* loaded from: classes2.dex */
public final class C4400i implements InterfaceC4393b {

    /* renamed from: a */
    public final C4398g f4904a = new C4398g();

    /* renamed from: b */
    public final b f4905b = new b();

    /* renamed from: c */
    public final Map f4906c = new HashMap();

    /* renamed from: d */
    public final Map f4907d = new HashMap();

    /* renamed from: e */
    public final int f4908e;

    /* renamed from: f */
    public int f4909f;

    /* renamed from: n.i$a */
    public static final class a implements InterfaceC4403l {

        /* renamed from: a */
        public final b f4910a;

        /* renamed from: b */
        public int f4911b;

        /* renamed from: c */
        public Class f4912c;

        public a(b bVar) {
            this.f4910a = bVar;
        }

        @Override // p098n.InterfaceC4403l
        /* renamed from: a */
        public void mo5420a() {
            this.f4910a.m5389c(this);
        }

        /* renamed from: b */
        public void m5421b(int i4, Class cls) {
            this.f4911b = i4;
            this.f4912c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4911b == aVar.f4911b && this.f4912c == aVar.f4912c;
        }

        public int hashCode() {
            int i4 = this.f4911b * 31;
            Class cls = this.f4912c;
            return i4 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f4911b + "array=" + this.f4912c + '}';
        }
    }

    /* renamed from: n.i$b */
    public static final class b extends AbstractC4394c {
        @Override // p098n.AbstractC4394c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo5387a() {
            return new a(this);
        }

        /* renamed from: e */
        public a m5423e(int i4, Class cls) {
            a aVar = (a) m5388b();
            aVar.m5421b(i4, cls);
            return aVar;
        }
    }

    public C4400i(int i4) {
        this.f4908e = i4;
    }

    @Override // p098n.InterfaceC4393b
    /* renamed from: a */
    public synchronized void mo5383a(int i4) {
        try {
            if (i4 >= 40) {
                mo5384b();
            } else if (i4 >= 20 || i4 == 15) {
                m5411g(this.f4908e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p098n.InterfaceC4393b
    /* renamed from: b */
    public synchronized void mo5384b() {
        m5411g(0);
    }

    @Override // p098n.InterfaceC4393b
    /* renamed from: c */
    public synchronized Object mo5385c(int i4, Class cls) {
        return m5415k(this.f4905b.m5423e(i4, cls), cls);
    }

    @Override // p098n.InterfaceC4393b
    /* renamed from: d */
    public synchronized Object mo5386d(int i4, Class cls) {
        Integer num;
        num = (Integer) m5416l(cls).ceilingKey(Integer.valueOf(i4));
        return m5415k(m5419o(i4, num) ? this.f4905b.m5423e(num.intValue(), cls) : this.f4905b.m5423e(i4, cls), cls);
    }

    /* renamed from: e */
    public final void m5409e(int i4, Class cls) {
        NavigableMap navigableMapM5416l = m5416l(cls);
        Integer num = (Integer) navigableMapM5416l.get(Integer.valueOf(i4));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM5416l.remove(Integer.valueOf(i4));
                return;
            } else {
                navigableMapM5416l.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i4 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m5410f() {
        m5411g(this.f4908e);
    }

    /* renamed from: g */
    public final void m5411g(int i4) {
        while (this.f4909f > i4) {
            Object objM5403f = this.f4904a.m5403f();
            AbstractC3749i.m4768d(objM5403f);
            InterfaceC4392a interfaceC4392aM5412h = m5412h(objM5403f);
            this.f4909f -= interfaceC4392aM5412h.mo5382b(objM5403f) * interfaceC4392aM5412h.mo5381a();
            m5409e(interfaceC4392aM5412h.mo5382b(objM5403f), objM5403f.getClass());
            if (Log.isLoggable(interfaceC4392aM5412h.getTag(), 2)) {
                interfaceC4392aM5412h.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(interfaceC4392aM5412h.mo5382b(objM5403f));
            }
        }
    }

    /* renamed from: h */
    public final InterfaceC4392a m5412h(Object obj) {
        return m5413i(obj.getClass());
    }

    /* renamed from: i */
    public final InterfaceC4392a m5413i(Class cls) {
        InterfaceC4392a c4397f = (InterfaceC4392a) this.f4907d.get(cls);
        if (c4397f == null) {
            if (cls.equals(int[].class)) {
                c4397f = new C4399h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                c4397f = new C4397f();
            }
            this.f4907d.put(cls, c4397f);
        }
        return c4397f;
    }

    /* renamed from: j */
    public final Object m5414j(a aVar) {
        return this.f4904a.m5399a(aVar);
    }

    /* renamed from: k */
    public final Object m5415k(a aVar, Class cls) {
        InterfaceC4392a interfaceC4392aM5413i = m5413i(cls);
        Object objM5414j = m5414j(aVar);
        if (objM5414j != null) {
            this.f4909f -= interfaceC4392aM5413i.mo5382b(objM5414j) * interfaceC4392aM5413i.mo5381a();
            m5409e(interfaceC4392aM5413i.mo5382b(objM5414j), cls);
        }
        if (objM5414j != null) {
            return objM5414j;
        }
        if (Log.isLoggable(interfaceC4392aM5413i.getTag(), 2)) {
            interfaceC4392aM5413i.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f4911b);
            sb.append(" bytes");
        }
        return interfaceC4392aM5413i.newArray(aVar.f4911b);
    }

    /* renamed from: l */
    public final NavigableMap m5416l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f4906c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4906c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean m5417m() {
        int i4 = this.f4909f;
        return i4 == 0 || this.f4908e / i4 >= 2;
    }

    /* renamed from: n */
    public final boolean m5418n(int i4) {
        return i4 <= this.f4908e / 2;
    }

    /* renamed from: o */
    public final boolean m5419o(int i4, Integer num) {
        return num != null && (m5417m() || num.intValue() <= i4 * 8);
    }

    @Override // p098n.InterfaceC4393b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC4392a interfaceC4392aM5413i = m5413i(cls);
        int iMo5382b = interfaceC4392aM5413i.mo5382b(obj);
        int iMo5381a = interfaceC4392aM5413i.mo5381a() * iMo5382b;
        if (m5418n(iMo5381a)) {
            a aVarM5423e = this.f4905b.m5423e(iMo5382b, cls);
            this.f4904a.m5402d(aVarM5423e, obj);
            NavigableMap navigableMapM5416l = m5416l(cls);
            Integer num = (Integer) navigableMapM5416l.get(Integer.valueOf(aVarM5423e.f4911b));
            Integer numValueOf = Integer.valueOf(aVarM5423e.f4911b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM5416l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f4909f += iMo5381a;
            m5410f();
        }
    }
}
