package p254n0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.r */
/* loaded from: classes3.dex */
public class C10304r {

    /* renamed from: e */
    public static final c f24558e = new c();

    /* renamed from: f */
    public static final InterfaceC10300n f24559f = new a();

    /* renamed from: a */
    public final List f24560a;

    /* renamed from: b */
    public final c f24561b;

    /* renamed from: c */
    public final Set f24562c;

    /* renamed from: d */
    public final Pools.Pool f24563d;

    /* renamed from: n0.r$a */
    public static class a implements InterfaceC10300n {
        @Override // p254n0.InterfaceC10300n
        /* renamed from: a */
        public boolean mo21420a(Object obj) {
            return false;
        }

        @Override // p254n0.InterfaceC10300n
        /* renamed from: b */
        public InterfaceC10300n.a mo21421b(Object obj, int i10, int i11, C9438e c9438e) {
            return null;
        }
    }

    /* renamed from: n0.r$b */
    public static class b {

        /* renamed from: a */
        public final Class f24564a;

        /* renamed from: b */
        public final Class f24565b;

        /* renamed from: c */
        public final InterfaceC10301o f24566c;

        public b(Class cls, Class cls2, InterfaceC10301o interfaceC10301o) {
            this.f24564a = cls;
            this.f24565b = cls2;
            this.f24566c = interfaceC10301o;
        }

        /* renamed from: a */
        public boolean m21494a(Class cls) {
            return this.f24564a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m21495b(Class cls, Class cls2) {
            return m21494a(cls) && this.f24565b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: n0.r$c */
    public static class c {
        /* renamed from: a */
        public C10303q m21496a(List list, Pools.Pool pool) {
            return new C10303q(list, pool);
        }
    }

    public C10304r(Pools.Pool pool) {
        this(pool, f24558e);
    }

    /* renamed from: f */
    public static InterfaceC10300n m21487f() {
        return f24559f;
    }

    /* renamed from: a */
    public final void m21488a(Class cls, Class cls2, InterfaceC10301o interfaceC10301o, boolean z10) {
        b bVar = new b(cls, cls2, interfaceC10301o);
        List list = this.f24560a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m21489b(Class cls, Class cls2, InterfaceC10301o interfaceC10301o) {
        m21488a(cls, cls2, interfaceC10301o, true);
    }

    /* renamed from: c */
    public synchronized List m21490c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f24560a) {
                if (!this.f24562c.contains(bVar) && bVar.m21494a(cls)) {
                    this.f24562c.add(bVar);
                    arrayList.add(m21492e(bVar));
                    this.f24562c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC10300n m21491d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f24560a) {
                if (this.f24562c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.m21495b(cls, cls2)) {
                    this.f24562c.add(bVar);
                    arrayList.add(m21492e(bVar));
                    this.f24562c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f24561b.m21496a(arrayList, this.f24563d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC10300n) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m21487f();
        } catch (Throwable th) {
            this.f24562c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC10300n m21492e(b bVar) {
        return (InterfaceC10300n) AbstractC8909j.m17468d(bVar.f24566c.mo21425c(this));
    }

    /* renamed from: g */
    public synchronized List m21493g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f24560a) {
            if (!arrayList.contains(bVar.f24565b) && bVar.m21494a(cls)) {
                arrayList.add(bVar.f24565b);
            }
        }
        return arrayList;
    }

    public C10304r(Pools.Pool pool, c cVar) {
        this.f24560a = new ArrayList();
        this.f24562c = new HashSet();
        this.f24563d = pool;
        this.f24561b = cVar;
    }
}
