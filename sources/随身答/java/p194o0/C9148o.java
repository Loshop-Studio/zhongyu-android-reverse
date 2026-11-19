package p194o0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o0.o */
/* loaded from: classes3.dex */
public class C9148o {

    /* renamed from: a */
    public final C9150q f15427a;

    /* renamed from: b */
    public final a f15428b;

    /* renamed from: o0.o$a */
    public static class a {

        /* renamed from: a */
        public final Map f15429a = new HashMap();

        /* renamed from: o0.o$a$a, reason: collision with other inner class name */
        public static class C10083a {

            /* renamed from: a */
            public final List f15430a;

            public C10083a(List list) {
                this.f15430a = list;
            }
        }

        /* renamed from: a */
        public void m14708a() {
            this.f15429a.clear();
        }

        /* renamed from: b */
        public List m14709b(Class cls) {
            C10083a c10083a = (C10083a) this.f15429a.get(cls);
            if (c10083a == null) {
                return null;
            }
            return c10083a.f15430a;
        }

        /* renamed from: c */
        public void m14710c(Class cls, List list) {
            if (((C10083a) this.f15429a.put(cls, new C10083a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C9148o(Pools.Pool pool) {
        this(new C9150q(pool));
    }

    /* renamed from: b */
    public static Class m14703b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m14704a(Class cls, Class cls2, InterfaceC9147n interfaceC9147n) {
        this.f15427a.m14714b(cls, cls2, interfaceC9147n);
        this.f15428b.m14708a();
    }

    /* renamed from: c */
    public synchronized List m14705c(Class cls) {
        return this.f15427a.m14718g(cls);
    }

    /* renamed from: d */
    public List m14706d(Object obj) {
        List listM14707e = m14707e(m14703b(obj));
        if (listM14707e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM14707e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z9 = true;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC9146m interfaceC9146m = (InterfaceC9146m) listM14707e.get(i9);
            if (interfaceC9146m.mo14655a(obj)) {
                if (z9) {
                    arrayList = new ArrayList(size - i9);
                    z9 = false;
                }
                arrayList.add(interfaceC9146m);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM14707e);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized List m14707e(Class cls) {
        List listM14709b;
        listM14709b = this.f15428b.m14709b(cls);
        if (listM14709b == null) {
            listM14709b = Collections.unmodifiableList(this.f15427a.m14715c(cls));
            this.f15428b.m14710c(cls, listM14709b);
        }
        return listM14709b;
    }

    public C9148o(C9150q c9150q) {
        this.f15428b = new a();
        this.f15427a = c9150q;
    }
}
