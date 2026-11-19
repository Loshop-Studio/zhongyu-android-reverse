package p194o0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.q */
/* loaded from: classes3.dex */
public class C9150q {

    /* renamed from: e */
    public static final c f15440e = new c();

    /* renamed from: f */
    public static final InterfaceC9146m f15441f = new a();

    /* renamed from: a */
    public final List f15442a;

    /* renamed from: b */
    public final c f15443b;

    /* renamed from: c */
    public final Set f15444c;

    /* renamed from: d */
    public final Pools.Pool f15445d;

    /* renamed from: o0.q$a */
    public static class a implements InterfaceC9146m {
        @Override // p194o0.InterfaceC9146m
        /* renamed from: a */
        public boolean mo14655a(Object obj) {
            return false;
        }

        @Override // p194o0.InterfaceC9146m
        /* renamed from: b */
        public InterfaceC9146m.a mo14656b(Object obj, int i9, int i10, C8084d c8084d) {
            return null;
        }
    }

    /* renamed from: o0.q$b */
    public static class b {

        /* renamed from: a */
        public final Class f15446a;

        /* renamed from: b */
        public final Class f15447b;

        /* renamed from: c */
        public final InterfaceC9147n f15448c;

        public b(Class cls, Class cls2, InterfaceC9147n interfaceC9147n) {
            this.f15446a = cls;
            this.f15447b = cls2;
            this.f15448c = interfaceC9147n;
        }

        /* renamed from: a */
        public boolean m14719a(Class cls) {
            return this.f15446a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m14720b(Class cls, Class cls2) {
            return m14719a(cls) && this.f15447b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: o0.q$c */
    public static class c {
        /* renamed from: a */
        public C9149p m14721a(List list, Pools.Pool pool) {
            return new C9149p(list, pool);
        }
    }

    public C9150q(Pools.Pool pool) {
        this(pool, f15440e);
    }

    /* renamed from: f */
    public static InterfaceC9146m m14712f() {
        return f15441f;
    }

    /* renamed from: a */
    public final void m14713a(Class cls, Class cls2, InterfaceC9147n interfaceC9147n, boolean z9) {
        b bVar = new b(cls, cls2, interfaceC9147n);
        List list = this.f15442a;
        list.add(z9 ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized void m14714b(Class cls, Class cls2, InterfaceC9147n interfaceC9147n) {
        m14713a(cls, cls2, interfaceC9147n, true);
    }

    /* renamed from: c */
    public synchronized List m14715c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f15442a) {
                if (!this.f15444c.contains(bVar) && bVar.m14719a(cls)) {
                    this.f15444c.add(bVar);
                    arrayList.add(m14717e(bVar));
                    this.f15444c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC9146m m14716d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z9 = false;
            for (b bVar : this.f15442a) {
                if (this.f15444c.contains(bVar)) {
                    z9 = true;
                } else if (bVar.m14720b(cls, cls2)) {
                    this.f15444c.add(bVar);
                    arrayList.add(m14717e(bVar));
                    this.f15444c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f15443b.m14721a(arrayList, this.f15445d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC9146m) arrayList.get(0);
            }
            if (!z9) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return m14712f();
        } catch (Throwable th) {
            this.f15444c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final InterfaceC9146m m14717e(b bVar) {
        return (InterfaceC9146m) AbstractC7837i.m12256d(bVar.f15448c.mo14660b(this));
    }

    /* renamed from: g */
    public synchronized List m14718g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f15442a) {
            if (!arrayList.contains(bVar.f15447b) && bVar.m14719a(cls)) {
                arrayList.add(bVar.f15447b);
            }
        }
        return arrayList;
    }

    public C9150q(Pools.Pool pool, c cVar) {
        this.f15442a = new ArrayList();
        this.f15444c = new HashSet();
        this.f15445d = pool;
        this.f15443b = cVar;
    }
}
