package p254n0;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n0.p */
/* loaded from: classes3.dex */
public class C10302p {

    /* renamed from: a */
    public final C10304r f24545a;

    /* renamed from: b */
    public final a f24546b;

    /* renamed from: n0.p$a */
    public static class a {

        /* renamed from: a */
        public final Map f24547a = new HashMap();

        /* renamed from: n0.p$a$a, reason: collision with other inner class name */
        public static class C12146a {

            /* renamed from: a */
            public final List f24548a;

            public C12146a(List list) {
                this.f24548a = list;
            }
        }

        /* renamed from: a */
        public void m21483a() {
            this.f24547a.clear();
        }

        /* renamed from: b */
        public List m21484b(Class cls) {
            C12146a c12146a = (C12146a) this.f24547a.get(cls);
            if (c12146a == null) {
                return null;
            }
            return c12146a.f24548a;
        }

        /* renamed from: c */
        public void m21485c(Class cls, List list) {
            if (((C12146a) this.f24547a.put(cls, new C12146a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C10302p(Pools.Pool pool) {
        this(new C10304r(pool));
    }

    /* renamed from: b */
    public static Class m21478b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m21479a(Class cls, Class cls2, InterfaceC10301o interfaceC10301o) {
        this.f24545a.m21489b(cls, cls2, interfaceC10301o);
        this.f24546b.m21483a();
    }

    /* renamed from: c */
    public synchronized List m21480c(Class cls) {
        return this.f24545a.m21493g(cls);
    }

    /* renamed from: d */
    public List m21481d(Object obj) {
        List listM21482e = m21482e(m21478b(obj));
        if (listM21482e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listM21482e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC10300n interfaceC10300n = (InterfaceC10300n) listM21482e.get(i10);
            if (interfaceC10300n.mo21420a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(interfaceC10300n);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listM21482e);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized List m21482e(Class cls) {
        List listM21484b;
        listM21484b = this.f24546b.m21484b(cls);
        if (listM21484b == null) {
            listM21484b = Collections.unmodifiableList(this.f24545a.m21490c(cls));
            this.f24546b.m21485c(cls, listM21484b);
        }
        return listM21484b;
    }

    public C10302p(C10304r c10304r) {
        this.f24546b = new a();
        this.f24545a = c10304r;
    }
}
