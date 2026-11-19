package p031c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p160l.InterfaceC9231e;

/* renamed from: c0.e */
/* loaded from: classes3.dex */
public class C5226e {

    /* renamed from: a */
    public final List f2307a = new ArrayList();

    /* renamed from: b */
    public final Map f2308b = new HashMap();

    /* renamed from: c0.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f2309a;

        /* renamed from: b */
        public final Class f2310b;

        /* renamed from: c */
        public final InterfaceC9231e f2311c;

        public a(Class cls, Class cls2, InterfaceC9231e interfaceC9231e) {
            this.f2309a = cls;
            this.f2310b = cls2;
            this.f2311c = interfaceC9231e;
        }

        /* renamed from: a */
        public boolean m2129a(Class cls, Class cls2) {
            return this.f2309a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2310b);
        }
    }

    /* renamed from: a */
    public synchronized void m2124a(String str, InterfaceC9231e interfaceC9231e, Class cls, Class cls2) {
        m2126c(str).add(new a(cls, cls2, interfaceC9231e));
    }

    /* renamed from: b */
    public synchronized List m2125b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2307a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f2308b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m2129a(cls, cls2)) {
                        arrayList.add(aVar.f2311c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m2126c(String str) {
        List arrayList;
        try {
            if (!this.f2307a.contains(str)) {
                this.f2307a.add(str);
            }
            arrayList = (List) this.f2308b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2308b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m2127d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2307a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f2308b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m2129a(cls, cls2) && !arrayList.contains(aVar.f2310b)) {
                        arrayList.add(aVar.f2310b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m2128e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f2307a);
            this.f2307a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f2307a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f2307a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
