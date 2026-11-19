package p228s0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s0.p */
/* loaded from: classes3.dex */
public class C9114p {

    /* renamed from: a */
    public final C9116r f15787a;

    /* renamed from: b */
    public final a f15788b;

    /* renamed from: s0.p$a */
    public static class a {

        /* renamed from: a */
        public final Map f15789a = new HashMap();

        /* renamed from: s0.p$a$a, reason: collision with other inner class name */
        public static class C10158a {

            /* renamed from: a */
            public final List f15790a;

            public C10158a(List list) {
                this.f15790a = list;
            }
        }

        /* renamed from: a */
        public void m15421a() {
            this.f15789a.clear();
        }

        /* renamed from: b */
        public List m15422b(Class cls) {
            C10158a c10158a = (C10158a) this.f15789a.get(cls);
            if (c10158a == null) {
                return null;
            }
            return c10158a.f15790a;
        }

        /* renamed from: c */
        public void m15423c(Class cls, List list) {
            if (((C10158a) this.f15789a.put(cls, new C10158a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C9114p(Pools.Pool pool) {
        this(new C9116r(pool));
    }

    /* renamed from: b */
    public static Class m15416b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m15417a(Class cls, Class cls2, InterfaceC9113o interfaceC9113o) {
        this.f15787a.m15427b(cls, cls2, interfaceC9113o);
        this.f15788b.m15421a();
    }

    /* renamed from: c */
    public synchronized List m15418c(Class cls) {
        return this.f15787a.m15431g(cls);
    }

    /* renamed from: d */
    public List m15419d(Object obj) {
        List listM15420e = m15420e(m15416b(obj));
        if (listM15420e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM15420e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z9 = true;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9112n interfaceC9112n = (InterfaceC9112n) listM15420e.get(i10);
            if (interfaceC9112n.mo15354a(obj)) {
                if (z9) {
                    arrayList = new ArrayList(size - i10);
                    z9 = false;
                }
                arrayList.add(interfaceC9112n);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM15420e);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized List m15420e(Class cls) {
        List listM15422b;
        listM15422b = this.f15788b.m15422b(cls);
        if (listM15422b == null) {
            listM15422b = Collections.unmodifiableList(this.f15787a.m15428c(cls));
            this.f15788b.m15423c(cls, listM15422b);
        }
        return listM15422b;
    }

    public C9114p(C9116r c9116r) {
        this.f15788b = new a();
        this.f15787a = c9116r;
    }
}
