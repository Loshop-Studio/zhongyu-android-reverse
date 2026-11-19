package p024c0;

import android.support.v4.media.C0039h;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import okhttp3.internal.connection.RunnableC6307f;
import p185v7.AbstractC6675d;

/* renamed from: c0.g */
/* loaded from: classes2.dex */
public final class C3210g {

    /* renamed from: a */
    public int f1750a;

    /* renamed from: b */
    public int f1751b;

    /* renamed from: c */
    public Object f1752c;

    /* renamed from: d */
    public final Object f1753d;

    /* renamed from: e */
    public final Object f1754e;

    /* renamed from: f */
    public final Object f1755f;

    public C3210g() {
        this.f1750a = 64;
        this.f1751b = 5;
        this.f1753d = new ArrayDeque();
        this.f1754e = new ArrayDeque();
        this.f1755f = new ArrayDeque();
    }

    /* renamed from: a */
    public void m2151a(Class cls, int i) {
        NavigableMap navigableMapM2158h = m2158h(cls);
        Integer num = (Integer) navigableMapM2158h.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM2158h.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM2158h.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: b */
    public void m2152b(int i) {
        while (this.f1751b > i) {
            Object objM104B = ((C0039h) this.f1752c).m104B();
            AbstractC6675d.m6343e(objM104B);
            C3206c c3206cM2156f = m2156f(objM104B.getClass());
            this.f1751b -= c3206cM2156f.m2147b() * c3206cM2156f.m2146a(objM104B);
            m2151a(objM104B.getClass(), c3206cM2156f.m2146a(objM104B));
            if (Log.isLoggable(c3206cM2156f.m2148c(), 2)) {
                Log.v(c3206cM2156f.m2148c(), "evicted: " + c3206cM2156f.m2146a(objM104B));
            }
        }
    }

    /* renamed from: c */
    public void m2153c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m2159i();
    }

    /* renamed from: d */
    public void m2154d(RunnableC6307f runnableC6307f) {
        runnableC6307f.f10145b.decrementAndGet();
        m2153c((ArrayDeque) this.f1754e, runnableC6307f);
    }

    /* renamed from: e */
    public synchronized Object m2155e(Class cls, int i) {
        C3208e c3208e;
        int i8;
        try {
            Integer num = (Integer) m2158h(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i8 = this.f1751b) != 0 && this.f1750a / i8 < 2 && num.intValue() > i * 8)) {
                C3209f c3209f = (C3209f) this.f1753d;
                InterfaceC3212i interfaceC3212iM2150b = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
                if (interfaceC3212iM2150b == null) {
                    interfaceC3212iM2150b = c3209f.m2150b();
                }
                c3208e = (C3208e) interfaceC3212iM2150b;
                c3208e.f1747b = i;
                c3208e.f1748c = cls;
            } else {
                C3209f c3209f2 = (C3209f) this.f1753d;
                int iIntValue = num.intValue();
                InterfaceC3212i interfaceC3212iM2150b2 = (InterfaceC3212i) ((ArrayDeque) c3209f2.f1740a).poll();
                if (interfaceC3212iM2150b2 == null) {
                    interfaceC3212iM2150b2 = c3209f2.m2150b();
                }
                c3208e = (C3208e) interfaceC3212iM2150b2;
                c3208e.f1747b = iIntValue;
                c3208e.f1748c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m2157g(c3208e, cls);
    }

    /* renamed from: f */
    public C3206c m2156f(Class cls) {
        C3206c c3206c;
        HashMap map = (HashMap) this.f1755f;
        C3206c c3206c2 = (C3206c) map.get(cls);
        if (c3206c2 != null) {
            return c3206c2;
        }
        if (cls.equals(int[].class)) {
            c3206c = new C3206c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c3206c = new C3206c(0);
        }
        map.put(cls, c3206c);
        return c3206c;
    }

    /* renamed from: g */
    public Object m2157g(C3208e c3208e, Class cls) {
        C3206c c3206cM2156f = m2156f(cls);
        Object objM126u = ((C0039h) this.f1752c).m126u(c3208e);
        if (objM126u != null) {
            this.f1751b -= c3206cM2156f.m2147b() * c3206cM2156f.m2146a(objM126u);
            m2151a(cls, c3206cM2156f.m2146a(objM126u));
        }
        if (objM126u != null) {
            return objM126u;
        }
        if (Log.isLoggable(c3206cM2156f.m2148c(), 2)) {
            Log.v(c3206cM2156f.m2148c(), "Allocated " + c3208e.f1747b + " bytes");
        }
        int i = c3208e.f1747b;
        switch (c3206cM2156f.f1741a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* renamed from: h */
    public NavigableMap m2158h(Class cls) {
        HashMap map = (HashMap) this.f1754e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2159i() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c0.C3210g.m2159i():void");
    }

    /* renamed from: j */
    public synchronized void m2160j(Object obj) {
        Class<?> cls = obj.getClass();
        C3206c c3206cM2156f = m2156f(cls);
        int iM2146a = c3206cM2156f.m2146a(obj);
        int iM2147b = c3206cM2156f.m2147b() * iM2146a;
        if (iM2147b <= this.f1750a / 2) {
            C3209f c3209f = (C3209f) this.f1753d;
            InterfaceC3212i interfaceC3212iM2150b = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
            if (interfaceC3212iM2150b == null) {
                interfaceC3212iM2150b = c3209f.m2150b();
            }
            C3208e c3208e = (C3208e) interfaceC3212iM2150b;
            c3208e.f1747b = iM2146a;
            c3208e.f1748c = cls;
            ((C0039h) this.f1752c).m131z(c3208e, obj);
            NavigableMap navigableMapM2158h = m2158h(cls);
            Integer num = (Integer) navigableMapM2158h.get(Integer.valueOf(c3208e.f1747b));
            Integer numValueOf = Integer.valueOf(c3208e.f1747b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM2158h.put(numValueOf, Integer.valueOf(iIntValue));
            this.f1751b += iM2147b;
            m2152b(this.f1750a);
        }
    }

    public C3210g(int i) {
        this.f1752c = new C0039h(3);
        this.f1753d = new C3209f(0);
        this.f1754e = new HashMap();
        this.f1755f = new HashMap();
        this.f1750a = i;
    }
}
