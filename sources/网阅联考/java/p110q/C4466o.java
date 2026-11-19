package p110q;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q.o */
/* loaded from: classes2.dex */
public class C4466o {

    /* renamed from: a */
    public final C4468q f5196a;

    /* renamed from: b */
    public final a f5197b;

    /* renamed from: q.o$a */
    public static class a {

        /* renamed from: a */
        public final Map f5198a = new HashMap();

        /* renamed from: q.o$a$a, reason: collision with other inner class name */
        public static class C4765a {

            /* renamed from: a */
            public final List f5199a;

            public C4765a(List list) {
                this.f5199a = list;
            }
        }

        /* renamed from: a */
        public void m5724a() {
            this.f5198a.clear();
        }

        /* renamed from: b */
        public List m5725b(Class cls) {
            C4765a c4765a = (C4765a) this.f5198a.get(cls);
            if (c4765a == null) {
                return null;
            }
            return c4765a.f5199a;
        }

        /* renamed from: c */
        public void m5726c(Class cls, List list) {
            if (((C4765a) this.f5198a.put(cls, new C4765a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C4466o(Pools.Pool pool) {
        this(new C4468q(pool));
    }

    /* renamed from: b */
    public static Class m5719b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m5720a(Class cls, Class cls2, InterfaceC4465n interfaceC4465n) {
        this.f5196a.m5730b(cls, cls2, interfaceC4465n);
        this.f5197b.m5724a();
    }

    /* renamed from: c */
    public synchronized List m5721c(Class cls) {
        return this.f5196a.m5734g(cls);
    }

    /* renamed from: d */
    public List m5722d(Object obj) {
        List listM5723e = m5723e(m5719b(obj));
        if (listM5723e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM5723e.size();
        List listEmptyList = Collections.emptyList();
        boolean z3 = true;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC4464m interfaceC4464m = (InterfaceC4464m) listM5723e.get(i4);
            if (interfaceC4464m.mo5670a(obj)) {
                if (z3) {
                    listEmptyList = new ArrayList(size - i4);
                    z3 = false;
                }
                listEmptyList.add(interfaceC4464m);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM5723e);
        }
        return listEmptyList;
    }

    /* renamed from: e */
    public final synchronized List m5723e(Class cls) {
        List listM5725b;
        listM5725b = this.f5197b.m5725b(cls);
        if (listM5725b == null) {
            listM5725b = Collections.unmodifiableList(this.f5196a.m5731c(cls));
            this.f5197b.m5726c(cls, listM5725b);
        }
        return listM5725b;
    }

    public C4466o(C4468q c4468q) {
        this.f5197b = new a();
        this.f5196a = c4468q;
    }
}
