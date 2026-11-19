package p228s0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.r */
/* loaded from: classes3.dex */
public class C9116r {

    /* renamed from: e */
    public static final c f15800e = new c();

    /* renamed from: f */
    public static final InterfaceC9112n f15801f = new a();

    /* renamed from: a */
    public final List f15802a;

    /* renamed from: b */
    public final c f15803b;

    /* renamed from: c */
    public final Set f15804c;

    /* renamed from: d */
    public final Pools.Pool f15805d;

    /* renamed from: s0.r$a */
    public static class a implements InterfaceC9112n {
        @Override // p228s0.InterfaceC9112n
        /* renamed from: a */
        public boolean mo15354a(Object obj) {
            return false;
        }

        @Override // p228s0.InterfaceC9112n
        /* renamed from: b */
        public InterfaceC9112n.a mo15355b(Object obj, int i10, int i11, C8539d c8539d) {
            return null;
        }
    }

    /* renamed from: s0.r$b */
    public static class b {

        /* renamed from: a */
        public final Class f15806a;

        /* renamed from: b */
        public final Class f15807b;

        /* renamed from: c */
        public final InterfaceC9113o f15808c;

        public b(Class cls, Class cls2, InterfaceC9113o interfaceC9113o) {
            this.f15806a = cls;
            this.f15807b = cls2;
            this.f15808c = interfaceC9113o;
        }

        /* renamed from: a */
        public boolean m15432a(Class cls) {
            return this.f15806a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m15433b(Class cls, Class cls2) {
            return m15432a(cls) && this.f15807b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: s0.r$c */
    public static class c {
        /* renamed from: a */
        public C9115q m15434a(List list, Pools.Pool pool) {
            return new C9115q(list, pool);
        }
    }

    public C9116r(Pools.Pool pool) {
        this(pool, f15800e);
    }

    /* renamed from: f */
    public static InterfaceC9112n m15425f() {
        return f15801f;
    }

    /* renamed from: a */
    public final void m15426a(Class cls, Class cls2, InterfaceC9113o interfaceC9113o, boolean z9) {
        b bVar = new b(cls, cls2, interfaceC9113o);
        List list = this.f15802a;
        list.add(z9 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m15427b(Class cls, Class cls2, InterfaceC9113o interfaceC9113o) {
        m15426a(cls, cls2, interfaceC9113o, true);
    }

    /* renamed from: c */
    public synchronized List m15428c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f15802a) {
                if (!this.f15804c.contains(bVar) && bVar.m15432a(cls)) {
                    this.f15804c.add(bVar);
                    arrayList.add(m15430e(bVar));
                    this.f15804c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC9112n m15429d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z9 = false;
            for (b bVar : this.f15802a) {
                if (this.f15804c.contains(bVar)) {
                    z9 = true;
                } else if (bVar.m15433b(cls, cls2)) {
                    this.f15804c.add(bVar);
                    arrayList.add(m15430e(bVar));
                    this.f15804c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f15803b.m15434a(arrayList, this.f15805d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC9112n) arrayList.get(0);
            }
            if (!z9) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m15425f();
        } catch (Throwable th) {
            this.f15804c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC9112n m15430e(b bVar) {
        return (InterfaceC9112n) AbstractC7651j.m12683d(bVar.f15808c.mo15359d(this));
    }

    /* renamed from: g */
    public synchronized List m15431g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f15802a) {
            if (!arrayList.contains(bVar.f15807b) && bVar.m15432a(cls)) {
                arrayList.add(bVar.f15807b);
            }
        }
        return arrayList;
    }

    public C9116r(Pools.Pool pool, c cVar) {
        this.f15802a = new ArrayList();
        this.f15804c = new HashSet();
        this.f15805d = pool;
        this.f15803b = cVar;
    }
}
