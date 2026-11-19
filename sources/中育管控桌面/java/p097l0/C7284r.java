package p097l0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.r */
/* loaded from: classes3.dex */
public class C7284r {

    /* renamed from: e */
    public static final c f9246e = new c();

    /* renamed from: f */
    public static final InterfaceC7280n f9247f = new a();

    /* renamed from: a */
    public final List f9248a;

    /* renamed from: b */
    public final c f9249b;

    /* renamed from: c */
    public final Set f9250c;

    /* renamed from: d */
    public final Pools.Pool f9251d;

    /* renamed from: l0.r$a */
    public static class a implements InterfaceC7280n {
        @Override // p097l0.InterfaceC7280n
        /* renamed from: a */
        public boolean mo8190a(Object obj) {
            return false;
        }

        @Override // p097l0.InterfaceC7280n
        /* renamed from: b */
        public InterfaceC7280n.a mo8191b(Object obj, int i6, int i7, C6285d c6285d) {
            return null;
        }
    }

    /* renamed from: l0.r$b */
    public static class b {

        /* renamed from: a */
        public final Class f9252a;

        /* renamed from: b */
        public final Class f9253b;

        /* renamed from: c */
        public final InterfaceC7281o f9254c;

        public b(Class cls, Class cls2, InterfaceC7281o interfaceC7281o) {
            this.f9252a = cls;
            this.f9253b = cls2;
            this.f9254c = interfaceC7281o;
        }

        /* renamed from: a */
        public boolean m8268a(Class cls) {
            return this.f9252a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m8269b(Class cls, Class cls2) {
            return m8268a(cls) && this.f9253b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: l0.r$c */
    public static class c {
        /* renamed from: a */
        public C7283q m8270a(List list, Pools.Pool pool) {
            return new C7283q(list, pool);
        }
    }

    public C7284r(Pools.Pool pool) {
        this(pool, f9246e);
    }

    /* renamed from: f */
    public static InterfaceC7280n m8261f() {
        return f9247f;
    }

    /* renamed from: a */
    public final void m8262a(Class cls, Class cls2, InterfaceC7281o interfaceC7281o, boolean z6) {
        b bVar = new b(cls, cls2, interfaceC7281o);
        List list = this.f9248a;
        list.add(z6 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m8263b(Class cls, Class cls2, InterfaceC7281o interfaceC7281o) {
        m8262a(cls, cls2, interfaceC7281o, true);
    }

    /* renamed from: c */
    public synchronized List m8264c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f9248a) {
                if (!this.f9250c.contains(bVar) && bVar.m8268a(cls)) {
                    this.f9250c.add(bVar);
                    arrayList.add(m8266e(bVar));
                    this.f9250c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC7280n m8265d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z6 = false;
            for (b bVar : this.f9248a) {
                if (this.f9250c.contains(bVar)) {
                    z6 = true;
                } else if (bVar.m8269b(cls, cls2)) {
                    this.f9250c.add(bVar);
                    arrayList.add(m8266e(bVar));
                    this.f9250c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f9249b.m8270a(arrayList, this.f9251d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC7280n) arrayList.get(0);
            }
            if (!z6) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m8261f();
        } catch (Throwable th) {
            this.f9250c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC7280n m8266e(b bVar) {
        return (InterfaceC7280n) AbstractC4408j.m1438d(bVar.f9254c.mo8195d(this));
    }

    /* renamed from: g */
    public synchronized List m8267g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f9248a) {
            if (!arrayList.contains(bVar.f9253b) && bVar.m8268a(cls)) {
                arrayList.add(bVar.f9253b);
            }
        }
        return arrayList;
    }

    public C7284r(Pools.Pool pool, c cVar) {
        this.f9248a = new ArrayList();
        this.f9250c = new HashSet();
        this.f9251d = pool;
        this.f9249b = cVar;
    }
}
