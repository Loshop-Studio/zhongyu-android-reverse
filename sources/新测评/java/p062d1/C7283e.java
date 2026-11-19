package p062d1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p162m0.InterfaceC8540e;

/* renamed from: d1.e */
/* loaded from: classes3.dex */
public class C7283e {

    /* renamed from: a */
    public final List f11729a = new ArrayList();

    /* renamed from: b */
    public final Map f11730b = new HashMap();

    /* renamed from: d1.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f11731a;

        /* renamed from: b */
        public final Class f11732b;

        /* renamed from: c */
        public final InterfaceC8540e f11733c;

        public a(Class cls, Class cls2, InterfaceC8540e interfaceC8540e) {
            this.f11731a = cls;
            this.f11732b = cls2;
            this.f11733c = interfaceC8540e;
        }

        /* renamed from: a */
        public boolean m11546a(Class cls, Class cls2) {
            return this.f11731a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11732b);
        }
    }

    /* renamed from: a */
    public synchronized void m11541a(String str, InterfaceC8540e interfaceC8540e, Class cls, Class cls2) {
        m11543c(str).add(new a(cls, cls2, interfaceC8540e));
    }

    /* renamed from: b */
    public synchronized List m11542b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f11729a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f11730b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m11546a(cls, cls2)) {
                        arrayList.add(aVar.f11733c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m11543c(String str) {
        List arrayList;
        try {
            if (!this.f11729a.contains(str)) {
                this.f11729a.add(str);
            }
            arrayList = (List) this.f11730b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f11730b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m11544d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f11729a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f11730b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m11546a(cls, cls2) && !arrayList.contains(aVar.f11732b)) {
                        arrayList.add(aVar.f11732b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m11545e(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f11729a);
            this.f11729a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f11729a.add((String) it.next());
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f11729a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
