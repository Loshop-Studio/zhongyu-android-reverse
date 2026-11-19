package p000a.p057m;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p015c.p016a.p017a.C0121a;
import p000a.p015c.p016a.p018b.C0124a;
import p000a.p015c.p016a.p018b.C0125b;
import p000a.p057m.AbstractC0355d;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.m.h */
/* loaded from: classes.dex */
public class C0359h extends AbstractC0355d {

    /* renamed from: c */
    public final WeakReference<InterfaceC0358g> f2172c;

    /* renamed from: a */
    public C0124a<InterfaceC0357f, a> f2170a = new C0124a<>();

    /* renamed from: d */
    public int f2173d = 0;

    /* renamed from: e */
    public boolean f2174e = false;

    /* renamed from: f */
    public boolean f2175f = false;

    /* renamed from: g */
    public ArrayList<AbstractC0355d.b> f2176g = new ArrayList<>();

    /* renamed from: b */
    public AbstractC0355d.b f2171b = AbstractC0355d.b.INITIALIZED;

    /* renamed from: h */
    public final boolean f2177h = true;

    /* renamed from: a.m.h$a */
    public static class a {

        /* renamed from: a */
        public AbstractC0355d.b f2178a;

        /* renamed from: b */
        public InterfaceC0356e f2179b;

        public a(InterfaceC0357f interfaceC0357f, AbstractC0355d.b bVar) {
            InterfaceC0356e reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = C0361j.f2180a;
            boolean z = interfaceC0357f instanceof InterfaceC0356e;
            boolean z2 = interfaceC0357f instanceof InterfaceC0353b;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0353b) interfaceC0357f, (InterfaceC0356e) interfaceC0357f);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0353b) interfaceC0357f, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (InterfaceC0356e) interfaceC0357f;
            } else {
                Class<?> cls = interfaceC0357f.getClass();
                if (C0361j.m1289c(cls) == 2) {
                    List<Constructor<? extends InterfaceC0354c>> list = C0361j.f2181b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C0361j.m1287a(list.get(0), interfaceC0357f));
                    } else {
                        InterfaceC0354c[] interfaceC0354cArr = new InterfaceC0354c[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            interfaceC0354cArr[i] = C0361j.m1287a(list.get(i), interfaceC0357f);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0354cArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0357f);
                }
            }
            this.f2179b = reflectiveGenericLifecycleObserver;
            this.f2178a = bVar;
        }

        /* renamed from: a */
        public void m1286a(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
            AbstractC0355d.b bVarM1277a = aVar.m1277a();
            this.f2178a = C0359h.m1279e(this.f2178a, bVarM1277a);
            this.f2179b.mo1278g(interfaceC0358g, aVar);
            this.f2178a = bVarM1277a;
        }
    }

    public C0359h(InterfaceC0358g interfaceC0358g) {
        this.f2172c = new WeakReference<>(interfaceC0358g);
    }

    /* renamed from: e */
    public static AbstractC0355d.b m1279e(AbstractC0355d.b bVar, AbstractC0355d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @Override // p000a.p057m.AbstractC0355d
    /* renamed from: a */
    public void mo1275a(InterfaceC0357f interfaceC0357f) {
        InterfaceC0358g interfaceC0358g;
        m1281c("addObserver");
        AbstractC0355d.b bVar = this.f2171b;
        AbstractC0355d.b bVar2 = AbstractC0355d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0355d.b.INITIALIZED;
        }
        a aVar = new a(interfaceC0357f, bVar2);
        if (this.f2170a.mo463d(interfaceC0357f, aVar) == null && (interfaceC0358g = this.f2172c.get()) != null) {
            boolean z = this.f2173d != 0 || this.f2174e;
            AbstractC0355d.b bVarM1280b = m1280b(interfaceC0357f);
            this.f2173d++;
            while (aVar.f2178a.compareTo(bVarM1280b) < 0 && this.f2170a.f884f.containsKey(interfaceC0357f)) {
                this.f2176g.add(aVar.f2178a);
                AbstractC0355d.a aVarM1276b = AbstractC0355d.a.m1276b(aVar.f2178a);
                if (aVarM1276b == null) {
                    StringBuilder sbM2079g = C0561a.m2079g("no event up from ");
                    sbM2079g.append(aVar.f2178a);
                    throw new IllegalStateException(sbM2079g.toString());
                }
                aVar.m1286a(interfaceC0358g, aVarM1276b);
                m1284g();
                bVarM1280b = m1280b(interfaceC0357f);
            }
            if (!z) {
                m1285h();
            }
            this.f2173d--;
        }
    }

    /* renamed from: b */
    public final AbstractC0355d.b m1280b(InterfaceC0357f interfaceC0357f) {
        C0124a<InterfaceC0357f, a> c0124a = this.f2170a;
        AbstractC0355d.b bVar = null;
        C0125b.c<InterfaceC0357f, a> cVar = c0124a.f884f.containsKey(interfaceC0357f) ? c0124a.f884f.get(interfaceC0357f).f892e : null;
        AbstractC0355d.b bVar2 = cVar != null ? cVar.f890c.f2178a : null;
        if (!this.f2176g.isEmpty()) {
            bVar = this.f2176g.get(r0.size() - 1);
        }
        return m1279e(m1279e(this.f2171b, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: c */
    public final void m1281c(String str) {
        if (this.f2177h && !C0121a.m460b().mo461a()) {
            throw new IllegalStateException(C0561a.m2077e("Method ", str, " must be called on the main thread"));
        }
    }

    /* renamed from: d */
    public void m1282d(AbstractC0355d.a aVar) {
        m1281c("handleLifecycleEvent");
        m1283f(aVar.m1277a());
    }

    /* renamed from: f */
    public final void m1283f(AbstractC0355d.b bVar) {
        if (this.f2171b == bVar) {
            return;
        }
        this.f2171b = bVar;
        if (this.f2174e || this.f2173d != 0) {
            this.f2175f = true;
            return;
        }
        this.f2174e = true;
        m1285h();
        this.f2174e = false;
    }

    /* renamed from: g */
    public final void m1284g() {
        this.f2176g.remove(r0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m1285h() {
        InterfaceC0358g interfaceC0358g = this.f2172c.get();
        if (interfaceC0358g == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0124a<InterfaceC0357f, a> c0124a = this.f2170a;
            boolean z = true;
            if (c0124a.f888e != 0) {
                AbstractC0355d.b bVar = c0124a.f885b.f890c.f2178a;
                AbstractC0355d.b bVar2 = c0124a.f886c.f890c.f2178a;
                if (bVar != bVar2 || this.f2171b != bVar2) {
                    z = false;
                }
            }
            this.f2175f = false;
            if (z) {
                return;
            }
            if (this.f2171b.compareTo(c0124a.f885b.f890c.f2178a) < 0) {
                C0124a<InterfaceC0357f, a> c0124a2 = this.f2170a;
                C0125b.b bVar3 = new C0125b.b(c0124a2.f886c, c0124a2.f885b);
                c0124a2.f887d.put(bVar3, Boolean.FALSE);
                while (bVar3.hasNext() && !this.f2175f) {
                    Map.Entry entry = (Map.Entry) bVar3.next();
                    a aVar = (a) entry.getValue();
                    while (aVar.f2178a.compareTo(this.f2171b) > 0 && !this.f2175f && this.f2170a.contains(entry.getKey())) {
                        int iOrdinal = aVar.f2178a.ordinal();
                        AbstractC0355d.a aVar2 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : AbstractC0355d.a.ON_PAUSE : AbstractC0355d.a.ON_STOP : AbstractC0355d.a.ON_DESTROY;
                        if (aVar2 == null) {
                            StringBuilder sbM2079g = C0561a.m2079g("no event down from ");
                            sbM2079g.append(aVar.f2178a);
                            throw new IllegalStateException(sbM2079g.toString());
                        }
                        this.f2176g.add(aVar2.m1277a());
                        aVar.m1286a(interfaceC0358g, aVar2);
                        m1284g();
                    }
                }
            }
            C0125b.c<InterfaceC0357f, a> cVar = this.f2170a.f886c;
            if (!this.f2175f && cVar != null && this.f2171b.compareTo(cVar.f890c.f2178a) > 0) {
                C0125b<InterfaceC0357f, a>.d dVarM465b = this.f2170a.m465b();
                while (dVarM465b.hasNext() && !this.f2175f) {
                    Map.Entry entry2 = (Map.Entry) dVarM465b.next();
                    a aVar3 = (a) entry2.getValue();
                    while (aVar3.f2178a.compareTo(this.f2171b) < 0 && !this.f2175f && this.f2170a.contains(entry2.getKey())) {
                        this.f2176g.add(aVar3.f2178a);
                        AbstractC0355d.a aVarM1276b = AbstractC0355d.a.m1276b(aVar3.f2178a);
                        if (aVarM1276b == null) {
                            StringBuilder sbM2079g2 = C0561a.m2079g("no event up from ");
                            sbM2079g2.append(aVar3.f2178a);
                            throw new IllegalStateException(sbM2079g2.toString());
                        }
                        aVar3.m1286a(interfaceC0358g, aVarM1276b);
                        m1284g();
                    }
                }
            }
        }
    }
}
