package p097l0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l0.p */
/* loaded from: classes3.dex */
public class C7282p {

    /* renamed from: a */
    public final C7284r f9233a;

    /* renamed from: b */
    public final a f9234b;

    /* renamed from: l0.p$a */
    public static class a {

        /* renamed from: a */
        public final Map f9235a = new HashMap();

        /* renamed from: l0.p$a$a, reason: collision with other inner class name */
        public static class C8034a {

            /* renamed from: a */
            public final List f9236a;

            public C8034a(List list) {
                this.f9236a = list;
            }
        }

        /* renamed from: a */
        public void m8257a() {
            this.f9235a.clear();
        }

        /* renamed from: b */
        public List m8258b(Class cls) {
            C8034a c8034a = (C8034a) this.f9235a.get(cls);
            if (c8034a == null) {
                return null;
            }
            return c8034a.f9236a;
        }

        /* renamed from: c */
        public void m8259c(Class cls, List list) {
            if (((C8034a) this.f9235a.put(cls, new C8034a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C7282p(Pools.Pool pool) {
        this(new C7284r(pool));
    }

    /* renamed from: b */
    public static Class m8252b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m8253a(Class cls, Class cls2, InterfaceC7281o interfaceC7281o) {
        this.f9233a.m8263b(cls, cls2, interfaceC7281o);
        this.f9234b.m8257a();
    }

    /* renamed from: c */
    public synchronized List m8254c(Class cls) {
        return this.f9233a.m8267g(cls);
    }

    /* renamed from: d */
    public List m8255d(Object obj) {
        List listM8256e = m8256e(m8252b(obj));
        if (listM8256e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM8256e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z6 = true;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC7280n interfaceC7280n = (InterfaceC7280n) listM8256e.get(i6);
            if (interfaceC7280n.mo8190a(obj)) {
                if (z6) {
                    arrayList = new ArrayList(size - i6);
                    z6 = false;
                }
                arrayList.add(interfaceC7280n);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM8256e);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized List m8256e(Class cls) {
        List listM8258b;
        listM8258b = this.f9234b.m8258b(cls);
        if (listM8258b == null) {
            listM8258b = Collections.unmodifiableList(this.f9233a.m8264c(cls));
            this.f9234b.m8259c(cls, listM8258b);
        }
        return listM8258b;
    }

    public C7282p(C7284r c7284r) {
        this.f9234b = new a();
        this.f9233a = c7284r;
    }
}
