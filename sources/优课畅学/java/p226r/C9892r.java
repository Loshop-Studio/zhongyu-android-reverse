package p226r;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.r */
/* loaded from: classes3.dex */
public class C9892r {

    /* renamed from: e */
    public static final c f19835e = new c();

    /* renamed from: f */
    public static final InterfaceC9888n f19836f = new a();

    /* renamed from: a */
    public final List f19837a;

    /* renamed from: b */
    public final c f19838b;

    /* renamed from: c */
    public final Set f19839c;

    /* renamed from: d */
    public final Pools.Pool f19840d;

    /* renamed from: r.r$a */
    public static class a implements InterfaceC9888n {
        @Override // p226r.InterfaceC9888n
        /* renamed from: a */
        public boolean mo18445a(Object obj) {
            return false;
        }

        @Override // p226r.InterfaceC9888n
        /* renamed from: b */
        public InterfaceC9888n.a mo18446b(Object obj, int i10, int i11, C9230d c9230d) {
            return null;
        }
    }

    /* renamed from: r.r$b */
    public static class b {

        /* renamed from: a */
        public final Class f19841a;

        /* renamed from: b */
        public final Class f19842b;

        /* renamed from: c */
        public final InterfaceC9889o f19843c;

        public b(Class cls, Class cls2, InterfaceC9889o interfaceC9889o) {
            this.f19841a = cls;
            this.f19842b = cls2;
            this.f19843c = interfaceC9889o;
        }

        /* renamed from: a */
        public boolean m18523a(Class cls) {
            return this.f19841a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m18524b(Class cls, Class cls2) {
            return m18523a(cls) && this.f19842b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: r.r$c */
    public static class c {
        /* renamed from: a */
        public C9891q m18525a(List list, Pools.Pool pool) {
            return new C9891q(list, pool);
        }
    }

    public C9892r(Pools.Pool pool) {
        this(pool, f19835e);
    }

    /* renamed from: f */
    public static InterfaceC9888n m18516f() {
        return f19836f;
    }

    /* renamed from: a */
    public final void m18517a(Class cls, Class cls2, InterfaceC9889o interfaceC9889o, boolean z10) {
        b bVar = new b(cls, cls2, interfaceC9889o);
        List list = this.f19837a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m18518b(Class cls, Class cls2, InterfaceC9889o interfaceC9889o) {
        m18517a(cls, cls2, interfaceC9889o, true);
    }

    /* renamed from: c */
    public synchronized List m18519c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f19837a) {
                if (!this.f19839c.contains(bVar) && bVar.m18523a(cls)) {
                    this.f19839c.add(bVar);
                    arrayList.add(m18521e(bVar));
                    this.f19839c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC9888n m18520d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f19837a) {
                if (this.f19839c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.m18524b(cls, cls2)) {
                    this.f19839c.add(bVar);
                    arrayList.add(m18521e(bVar));
                    this.f19839c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f19838b.m18525a(arrayList, this.f19840d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC9888n) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m18516f();
        } catch (Throwable th) {
            this.f19839c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC9888n m18521e(b bVar) {
        return (InterfaceC9888n) AbstractC8706j.m14181d(bVar.f19843c.mo18450d(this));
    }

    /* renamed from: g */
    public synchronized List m18522g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f19837a) {
            if (!arrayList.contains(bVar.f19842b) && bVar.m18523a(cls)) {
                arrayList.add(bVar.f19842b);
            }
        }
        return arrayList;
    }

    public C9892r(Pools.Pool pool, c cVar) {
        this.f19837a = new ArrayList();
        this.f19839c = new HashSet();
        this.f19840d = pool;
        this.f19838b = cVar;
    }
}
