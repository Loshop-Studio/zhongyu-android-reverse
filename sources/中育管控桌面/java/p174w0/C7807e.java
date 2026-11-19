package p174w0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p053f0.InterfaceC6286e;

/* renamed from: w0.e */
/* loaded from: classes3.dex */
public class C7807e {

    /* renamed from: a */
    public final List f10364a = new ArrayList();

    /* renamed from: b */
    public final Map f10365b = new HashMap();

    /* renamed from: w0.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f10366a;

        /* renamed from: b */
        public final Class f10367b;

        /* renamed from: c */
        public final InterfaceC6286e f10368c;

        public a(Class cls, Class cls2, InterfaceC6286e interfaceC6286e) {
            this.f10366a = cls;
            this.f10367b = cls2;
            this.f10368c = interfaceC6286e;
        }

        /* renamed from: a */
        public boolean m9397a(Class cls, Class cls2) {
            return this.f10366a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f10367b);
        }
    }

    /* renamed from: a */
    public synchronized void m9392a(String str, InterfaceC6286e interfaceC6286e, Class cls, Class cls2) {
        m9394c(str).add(new a(cls, cls2, interfaceC6286e));
    }

    /* renamed from: b */
    public synchronized List m9393b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f10364a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f10365b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m9397a(cls, cls2)) {
                        arrayList.add(aVar.f10368c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m9394c(String str) {
        List arrayList;
        try {
            if (!this.f10364a.contains(str)) {
                this.f10364a.add(str);
            }
            arrayList = (List) this.f10365b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f10365b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m9395d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f10364a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f10365b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m9397a(cls, cls2) && !arrayList.contains(aVar.f10367b)) {
                        arrayList.add(aVar.f10367b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m9396e(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f10364a);
            this.f10364a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f10364a.add((String) it.next());
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f10364a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
