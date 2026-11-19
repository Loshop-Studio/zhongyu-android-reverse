package p226r;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r.p */
/* loaded from: classes3.dex */
public class C9890p {

    /* renamed from: a */
    public final C9892r f19822a;

    /* renamed from: b */
    public final a f19823b;

    /* renamed from: r.p$a */
    public static class a {

        /* renamed from: a */
        public final Map f19824a = new HashMap();

        /* renamed from: r.p$a$a, reason: collision with other inner class name */
        public static class C10814a {

            /* renamed from: a */
            public final List f19825a;

            public C10814a(List list) {
                this.f19825a = list;
            }
        }

        /* renamed from: a */
        public void m18512a() {
            this.f19824a.clear();
        }

        /* renamed from: b */
        public List m18513b(Class cls) {
            C10814a c10814a = (C10814a) this.f19824a.get(cls);
            if (c10814a == null) {
                return null;
            }
            return c10814a.f19825a;
        }

        /* renamed from: c */
        public void m18514c(Class cls, List list) {
            if (((C10814a) this.f19824a.put(cls, new C10814a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C9890p(Pools.Pool pool) {
        this(new C9892r(pool));
    }

    /* renamed from: b */
    public static Class m18507b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m18508a(Class cls, Class cls2, InterfaceC9889o interfaceC9889o) {
        this.f19822a.m18518b(cls, cls2, interfaceC9889o);
        this.f19823b.m18512a();
    }

    /* renamed from: c */
    public synchronized List m18509c(Class cls) {
        return this.f19822a.m18522g(cls);
    }

    /* renamed from: d */
    public List m18510d(Object obj) {
        List listM18511e = m18511e(m18507b(obj));
        if (listM18511e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM18511e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9888n interfaceC9888n = (InterfaceC9888n) listM18511e.get(i10);
            if (interfaceC9888n.mo18445a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(interfaceC9888n);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM18511e);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized List m18511e(Class cls) {
        List listM18513b;
        listM18513b = this.f19823b.m18513b(cls);
        if (listM18513b == null) {
            listM18513b = Collections.unmodifiableList(this.f19822a.m18519c(cls));
            this.f19823b.m18514c(cls, listM18513b);
        }
        return listM18513b;
    }

    public C9890p(C9892r c9892r) {
        this.f19823b = new a();
        this.f19822a = c9892r;
    }
}
