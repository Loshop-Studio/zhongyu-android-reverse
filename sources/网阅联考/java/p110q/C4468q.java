package p110q;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p110q.InterfaceC4464m;

/* renamed from: q.q */
/* loaded from: classes2.dex */
public class C4468q {

    /* renamed from: e */
    public static final c f5209e = new c();

    /* renamed from: f */
    public static final InterfaceC4464m f5210f = new a();

    /* renamed from: a */
    public final List f5211a;

    /* renamed from: b */
    public final c f5212b;

    /* renamed from: c */
    public final Set f5213c;

    /* renamed from: d */
    public final Pools.Pool f5214d;

    /* renamed from: q.q$a */
    public static class a implements InterfaceC4464m {
        @Override // p110q.InterfaceC4464m
        /* renamed from: a */
        public boolean mo5670a(Object obj) {
            return false;
        }

        @Override // p110q.InterfaceC4464m
        /* renamed from: b */
        public InterfaceC4464m.a mo5671b(Object obj, int i4, int i5, C3794d c3794d) {
            return null;
        }
    }

    /* renamed from: q.q$b */
    public static class b {

        /* renamed from: a */
        public final Class f5215a;

        /* renamed from: b */
        public final Class f5216b;

        /* renamed from: c */
        public final InterfaceC4465n f5217c;

        public b(Class cls, Class cls2, InterfaceC4465n interfaceC4465n) {
            this.f5215a = cls;
            this.f5216b = cls2;
            this.f5217c = interfaceC4465n;
        }

        /* renamed from: a */
        public boolean m5735a(Class cls) {
            return this.f5215a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m5736b(Class cls, Class cls2) {
            return m5735a(cls) && this.f5216b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: q.q$c */
    public static class c {
        /* renamed from: a */
        public C4467p m5737a(List list, Pools.Pool pool) {
            return new C4467p(list, pool);
        }
    }

    public C4468q(Pools.Pool pool) {
        this(pool, f5209e);
    }

    /* renamed from: f */
    public static InterfaceC4464m m5728f() {
        return f5210f;
    }

    /* renamed from: a */
    public final void m5729a(Class cls, Class cls2, InterfaceC4465n interfaceC4465n, boolean z3) {
        b bVar = new b(cls, cls2, interfaceC4465n);
        List list = this.f5211a;
        list.add(z3 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m5730b(Class cls, Class cls2, InterfaceC4465n interfaceC4465n) {
        m5729a(cls, cls2, interfaceC4465n, true);
    }

    /* renamed from: c */
    public synchronized List m5731c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f5211a) {
                if (!this.f5213c.contains(bVar) && bVar.m5735a(cls)) {
                    this.f5213c.add(bVar);
                    arrayList.add(m5733e(bVar));
                    this.f5213c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f5213c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC4464m m5732d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z3 = false;
            for (b bVar : this.f5211a) {
                if (this.f5213c.contains(bVar)) {
                    z3 = true;
                } else if (bVar.m5736b(cls, cls2)) {
                    this.f5213c.add(bVar);
                    arrayList.add(m5733e(bVar));
                    this.f5213c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f5212b.m5737a(arrayList, this.f5214d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC4464m) arrayList.get(0);
            }
            if (!z3) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m5728f();
        } catch (Throwable th) {
            this.f5213c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC4464m m5733e(b bVar) {
        return (InterfaceC4464m) AbstractC3749i.m4768d(bVar.f5217c.mo5675b(this));
    }

    /* renamed from: g */
    public synchronized List m5734g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f5211a) {
            if (!arrayList.contains(bVar.f5216b) && bVar.m5735a(cls)) {
                arrayList.add(bVar.f5216b);
            }
        }
        return arrayList;
    }

    public C4468q(Pools.Pool pool, c cVar) {
        this.f5211a = new ArrayList();
        this.f5213c = new HashSet();
        this.f5214d = pool;
        this.f5212b = cVar;
    }
}
